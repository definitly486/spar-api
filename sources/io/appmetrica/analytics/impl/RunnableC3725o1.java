package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3725o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f47794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47795b;

    public RunnableC3725o1(C3750p1 c3750p1, Throwable th2) {
        this.f47795b = c3750p1;
        this.f47794a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47795b).reportUnhandledException(this.f47794a);
    }
}
