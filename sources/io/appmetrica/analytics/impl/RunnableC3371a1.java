package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3371a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46900b;

    public RunnableC3371a1(C3750p1 c3750p1, String str) {
        this.f46900b = c3750p1;
        this.f46899a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46900b).a(this.f46899a);
    }
}
