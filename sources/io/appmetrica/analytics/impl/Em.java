package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class Em implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3920vm fromModel(Dm dm2) {
        C3920vm c3920vm = new C3920vm();
        c3920vm.f48251a = dm2.f45666a;
        return c3920vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C3920vm) obj).f48251a);
    }

    public final Dm a(C3920vm c3920vm) {
        return new Dm(c3920vm.f48251a);
    }
}
