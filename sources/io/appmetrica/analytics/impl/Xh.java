package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Xh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46774a;

    public Xh(C3866ti c3866ti) {
        this.f46774a = c3866ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46774a;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).resumeSession();
    }
}
