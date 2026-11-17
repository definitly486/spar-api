package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46836c;

    public Z0(C3750p1 c3750p1, String str, String str2) {
        this.f46836c = c3750p1;
        this.f46834a = str;
        this.f46835b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46836c).b(this.f46834a, this.f46835b);
    }
}
