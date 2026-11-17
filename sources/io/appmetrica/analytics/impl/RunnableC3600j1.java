package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3600j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47503b;

    public RunnableC3600j1(C3750p1 c3750p1, String str) {
        this.f47503b = c3750p1;
        this.f47502a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47503b).reportEvent(this.f47502a);
    }
}
