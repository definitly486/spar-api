package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3469dl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uf f47104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kg f47105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3906v8 f47106c;

    public C3469dl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Uf(eCommerceProduct), eCommerceReferrer == null ? null : new Kg(eCommerceReferrer), new C3494el());
    }

    public final InterfaceC3906v8 a() {
        return this.f47106c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f47106c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f47104a + ", referrer=" + this.f47105b + ", converter=" + this.f47106c + '}';
    }

    public C3469dl(Uf uf2, Kg kg2, InterfaceC3906v8 interfaceC3906v8) {
        this.f47104a = uf2;
        this.f47105b = kg2;
        this.f47106c = interfaceC3906v8;
    }
}
