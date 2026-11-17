package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Vh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f46679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46680d;

    public Vh(C3866ti c3866ti, String str, String str2, Throwable th2) {
        this.f46680d = c3866ti;
        this.f46677a = str;
        this.f46678b = str2;
        this.f46679c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46680d;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportError(this.f46677a, this.f46678b, this.f46679c);
    }
}
