package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class Kj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f46161a;

    public Kj(ECommerceEvent eCommerceEvent) {
        this.f46161a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportECommerce(this.f46161a);
    }
}
