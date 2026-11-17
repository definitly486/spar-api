package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3667li implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nn f47661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47662b;

    public RunnableC3667li(C3866ti c3866ti, Nn nn2) {
        this.f47662b = c3866ti;
        this.f47661a = nn2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47662b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).a(this.f47661a);
    }
}
