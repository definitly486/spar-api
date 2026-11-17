package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f45960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f45961b;

    public I0(C3750p1 c3750p1, String str) {
        this.f45961b = c3750p1;
        this.f45960a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45961b.d().f45722b.a(this.f45960a, false);
    }
}
