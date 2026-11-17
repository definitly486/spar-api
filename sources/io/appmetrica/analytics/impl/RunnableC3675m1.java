package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3675m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f47688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47689c;

    public RunnableC3675m1(C3750p1 c3750p1, String str, Throwable th2) {
        this.f47689c = c3750p1;
        this.f47687a = str;
        this.f47688b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47689c).reportError(this.f47687a, this.f47688b);
    }
}
