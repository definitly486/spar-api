package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3717ni implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f47774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47775b;

    public RunnableC3717ni(C3866ti c3866ti, U u13) {
        this.f47775b = c3866ti;
        this.f47774a = u13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47775b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).a(this.f47774a);
    }
}
