package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class Me implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3895um fromModel(Le le2) {
        C3895um c3895um = new C3895um();
        c3895um.f48213a = le2.f46179a;
        c3895um.f48214b = le2.f46180b;
        return c3895um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C3895um c3895um = (C3895um) obj;
        return new Le(c3895um.f48213a, c3895um.f48214b);
    }

    public final Le a(C3895um c3895um) {
        return new Le(c3895um.f48213a, c3895um.f48214b);
    }
}
