package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3397b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46937c;

    public RunnableC3397b1(C3750p1 c3750p1, String str, String str2) {
        this.f46937c = c3750p1;
        this.f46935a = str;
        this.f46936b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f46937c.f47852a;
        String str = this.f46935a;
        String str2 = this.f46936b;
        c3873u0.getClass();
        C3848t0.c().putAppEnvironmentValue(str, str2);
    }
}
