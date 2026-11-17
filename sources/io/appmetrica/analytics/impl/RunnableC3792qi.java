package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3792qi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47926a;

    public RunnableC3792qi(C3866ti c3866ti) {
        this.f47926a = c3866ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47926a;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).clearAppEnvironment();
    }
}
