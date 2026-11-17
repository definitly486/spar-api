package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes3.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f45339b;

    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45340a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f45341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f45342c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f45341b = new a(this, runnable);
            this.f45342c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j13, ICommonExecutor iCommonExecutor) {
            if (this.f45340a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f45342c.subscribe(j13, iCommonExecutor, this.f45341b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f45338a = this.f45339b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j13, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j13 - (this.f45339b.currentTimeMillis() - this.f45338a), 0L));
    }

    WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f45339b = systemTimeProvider;
    }
}
