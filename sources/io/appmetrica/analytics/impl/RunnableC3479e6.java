package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3479e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f47162b = Ia.j().w().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f47163c = Ia.j().a();

    public RunnableC3479e6(List list) {
        this.f47161a = list;
    }

    public static final void a(RunnableC3479e6 runnableC3479e6) {
        Iterator it = runnableC3479e6.f47161a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47163c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f47162b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.zynmafqrjb
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                RunnableC3479e6.a(this.f48640iobyxmoadg);
            }
        });
    }
}
