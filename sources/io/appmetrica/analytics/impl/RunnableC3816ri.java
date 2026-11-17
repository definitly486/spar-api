package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3816ri implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f48002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f48003b;

    public RunnableC3816ri(C3866ti c3866ti, String str) {
        this.f48003b = c3866ti;
        this.f48002a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f48003b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportEvent(this.f48002a);
    }
}
