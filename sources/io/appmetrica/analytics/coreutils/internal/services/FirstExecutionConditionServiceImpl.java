package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f45320a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f45321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f45322c;

    public static class FirstExecutionConditionChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45323a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f45324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f45325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f45326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f45327e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f45327e = firstExecutionDelayChecker;
            this.f45325c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f45324b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f45326d = Long.MAX_VALUE;
            this.tag = str;
        }

        final void a(long j13) {
            this.f45326d = TimeUnit.SECONDS.toMillis(j13);
        }

        final boolean b() {
            if (this.f45323a) {
                return true;
            }
            return this.f45327e.delaySinceFirstStartupWasPassed(this.f45325c, this.f45324b, this.f45326d);
        }

        final void a() {
            this.f45323a = true;
        }

        final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f45325c = utilityServiceConfiguration.getInitialConfigTime();
            this.f45324b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j13, long j14, long j15) {
            return j14 - j13 >= j15;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f45328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f45329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f45330c;

        /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i13) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zB = this.f45328a.b();
            if (zB) {
                this.f45328a.a();
            }
            return zB;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j13) {
            this.f45328a.a(j13);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j13) {
            if (!this.f45328a.b()) {
                return false;
            }
            this.f45329b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j13), this.f45330c);
            this.f45328a.a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f45328a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f45329b = activationBarrierHelper;
            this.f45328a = firstExecutionConditionChecker;
            this.f45330c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f45322c = utilityServiceProvider;
    }

    final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f45320a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f45322c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f45321b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f45321b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f45320a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
