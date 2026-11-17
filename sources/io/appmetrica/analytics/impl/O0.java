package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f46300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46301b;

    public O0(C3750p1 c3750p1, boolean z13) {
        this.f46301b = c3750p1;
        this.f46300a = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f46301b.f47852a;
        boolean z13 = this.f46300a;
        c3873u0.getClass();
        C3848t0.c().setDataSendingEnabled(z13);
    }
}
