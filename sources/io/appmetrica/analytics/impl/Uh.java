package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Uh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f46624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46625c;

    public Uh(C3866ti c3866ti, String str, Throwable th2) {
        this.f46625c = c3866ti;
        this.f46623a = str;
        this.f46624b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46625c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportError(this.f46623a, this.f46624b);
    }
}
