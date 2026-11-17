package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Ce extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45579d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45580e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ee f45582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3906v8 f45583c;

    public Ce(int i13, ECommerceOrder eCommerceOrder) {
        this(i13, new Ee(eCommerceOrder), new De());
    }

    public final InterfaceC3906v8 a() {
        return this.f45583c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f45583c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f45581a + ", order=" + this.f45582b + ", converter=" + this.f45583c + '}';
    }

    public Ce(int i13, Ee ee2, InterfaceC3906v8 interfaceC3906v8) {
        this.f45581a = i13;
        this.f45582b = ee2;
        this.f45583c = interfaceC3906v8;
    }
}
