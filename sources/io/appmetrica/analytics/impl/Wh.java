package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Wh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f46719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46720b;

    public Wh(C3866ti c3866ti, Throwable th2) {
        this.f46720b = c3866ti;
        this.f46719a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46720b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportUnhandledException(this.f46719a);
    }
}
