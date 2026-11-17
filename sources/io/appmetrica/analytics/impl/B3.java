package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class B3 implements ProtobufConverter {
    public final C3771pm a(C4001z3 c4001z3) {
        C3771pm c3771pm = new C3771pm();
        c3771pm.f47894a = c4001z3.f48548a;
        return c3771pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C3771pm c3771pm = new C3771pm();
        c3771pm.f47894a = ((C4001z3) obj).f48548a;
        return c3771pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4001z3(((C3771pm) obj).f47894a);
    }

    public final C4001z3 a(C3771pm c3771pm) {
        return new C4001z3(c3771pm.f47894a);
    }
}
