package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3823s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3848t0 f48026a;

    public RunnableC3823s0(C3848t0 c3848t0) {
        this.f48026a = c3848t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3952x4.l().f48373c.a().executeDelayed(new RunnableC3799r1(this.f48026a.f48090a), TimeUnit.SECONDS.toMillis(5L));
    }
}
