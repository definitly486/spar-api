package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3417bl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uf f46983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3768pj f46984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3906v8 f46985c;

    public C3417bl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Uf(eCommerceProduct), new C3768pj(eCommerceScreen), new C3443cl());
    }

    public final InterfaceC3906v8 a() {
        return this.f46985c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f46985c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f46983a + ", screen=" + this.f46984b + ", converter=" + this.f46985c + '}';
    }

    public C3417bl(Uf uf2, C3768pj c3768pj, InterfaceC3906v8 interfaceC3906v8) {
        this.f46983a = uf2;
        this.f46984b = c3768pj;
        this.f46985c = interfaceC3906v8;
    }
}
