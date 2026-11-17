package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3440ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f47026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47027b;

    public RunnableC3440ci(C3866ti c3866ti, AdRevenue adRevenue) {
        this.f47027b = c3866ti;
        this.f47026a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47027b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportAdRevenue(this.f47026a);
    }
}
