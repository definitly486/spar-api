package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Zh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46870b;

    public Zh(C3866ti c3866ti, String str) {
        this.f46870b = c3866ti;
        this.f46869a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46870b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).setUserProfileID(this.f46869a);
    }
}
