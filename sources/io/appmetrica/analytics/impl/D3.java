package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class D3 extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45619d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45620e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G3 f45622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3906v8 f45623c;

    public D3(int i13, ECommerceCartItem eCommerceCartItem) {
        this(i13, new G3(eCommerceCartItem), new E3());
    }

    public final InterfaceC3906v8 a() {
        return this.f45623c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i13 = this.f45621a;
        if (i13 != 4) {
            return i13 != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f45623c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f45621a + ", cartItem=" + this.f45622b + ", converter=" + this.f45623c + '}';
    }

    public D3(int i13, G3 g13, InterfaceC3906v8 interfaceC3906v8) {
        this.f45621a = i13;
        this.f45622b = g13;
        this.f45623c = interfaceC3906v8;
    }
}
