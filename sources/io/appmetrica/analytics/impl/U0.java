package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f46592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46593b;

    public U0(C3750p1 c3750p1, ECommerceEvent eCommerceEvent) {
        this.f46593b = c3750p1;
        this.f46592a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46593b).reportECommerce(this.f46592a);
    }
}
