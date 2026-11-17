package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3841si implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f48072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f48074c;

    public RunnableC3841si(C3866ti c3866ti, String str, String str2) {
        this.f48074c = c3866ti;
        this.f48072a = str;
        this.f48073b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f48074c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportEvent(this.f48072a, this.f48073b);
    }
}
