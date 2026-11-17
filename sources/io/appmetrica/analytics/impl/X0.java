package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46755c;

    public X0(C3750p1 c3750p1, String str, String str2) {
        this.f46755c = c3750p1;
        this.f46753a = str;
        this.f46754b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f46755c.f47852a;
        String str = this.f46753a;
        String str2 = this.f46754b;
        c3873u0.getClass();
        C3848t0.c().a(str, str2);
    }
}
