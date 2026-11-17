package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3517fi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f47224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47225b;

    public RunnableC3517fi(C3866ti c3866ti, boolean z13) {
        this.f47225b = c3866ti;
        this.f47224a = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47225b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).setDataSendingEnabled(this.f47224a);
    }
}
