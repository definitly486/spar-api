package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3520fl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3768pj f47226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3906v8 f47227b;

    public C3520fl(ECommerceScreen eCommerceScreen) {
        this(new C3768pj(eCommerceScreen), new C3546gl());
    }

    public final InterfaceC3906v8 a() {
        return this.f47227b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f47227b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f47226a + ", converter=" + this.f47227b + '}';
    }

    public C3520fl(C3768pj c3768pj, InterfaceC3906v8 interfaceC3906v8) {
        this.f47226a = c3768pj;
        this.f47227b = interfaceC3906v8;
    }
}
