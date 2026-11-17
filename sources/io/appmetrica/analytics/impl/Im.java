package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class Im implements ProtobufConverter {
    public final C3945wm a(Hm hm2) {
        C3945wm c3945wm = new C3945wm();
        c3945wm.f48353a = hm2.f45949a;
        return c3945wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C3945wm c3945wm = new C3945wm();
        c3945wm.f48353a = ((Hm) obj).f45949a;
        return c3945wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Hm(((C3945wm) obj).f48353a);
    }

    public final Hm a(C3945wm c3945wm) {
        return new Hm(c3945wm.f48353a);
    }
}
