package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class E3 implements InterfaceC3906v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F3 f45681a;

    public E3() {
        this(new F3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(D3 d13) {
        O8 o13 = new O8();
        o13.f46327e = new C3956x8();
        Qi qiFromModel = this.f45681a.fromModel(d13.f45622b);
        o13.f46327e.f48413a = (C3981y8) qiFromModel.f46427a;
        o13.f46323a = d13.f45621a;
        return Collections.singletonList(new Qi(o13, new C3926w3(C3926w3.b(qiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public E3(F3 f13) {
        this.f45681a = f13;
    }

    public final D3 a(List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
