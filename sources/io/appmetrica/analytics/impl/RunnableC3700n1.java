package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3700n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f47730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47731d;

    public RunnableC3700n1(C3750p1 c3750p1, String str, String str2, Throwable th2) {
        this.f47731d = c3750p1;
        this.f47728a = str;
        this.f47729b = str2;
        this.f47730c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47731d).reportError(this.f47728a, this.f47729b, this.f47730c);
    }
}
