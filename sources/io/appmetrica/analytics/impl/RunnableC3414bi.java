package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3414bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f46974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46975b;

    public RunnableC3414bi(C3866ti c3866ti, Revenue revenue) {
        this.f46975b = c3866ti;
        this.f46974a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46975b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportRevenue(this.f46974a);
    }
}
