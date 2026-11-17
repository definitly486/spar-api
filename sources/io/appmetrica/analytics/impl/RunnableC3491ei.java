package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3491ei implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f47183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47184b;

    public RunnableC3491ei(C3866ti c3866ti, ECommerceEvent eCommerceEvent) {
        this.f47184b = c3866ti;
        this.f47183a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47184b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportECommerce(this.f47183a);
    }
}
