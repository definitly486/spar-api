package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46368b;

    public P0(C3750p1 c3750p1, String str) {
        this.f46368b = c3750p1;
        this.f46367a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f46368b.f47852a;
        String str = this.f46367a;
        c3873u0.getClass();
        C3848t0.c().setUserProfileID(str);
    }
}
