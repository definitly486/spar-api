package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3767pi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47883c;

    public RunnableC3767pi(C3866ti c3866ti, String str, String str2) {
        this.f47883c = c3866ti;
        this.f47881a = str;
        this.f47882b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47883c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).putAppEnvironmentValue(this.f47881a, this.f47882b);
    }
}
