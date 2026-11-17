package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M fromModel(X x13) {
        M m13 = new M();
        m13.f48940a = x13.f48963a;
        m13.f48941b = x13.f48964b;
        return m13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        M m13 = (M) obj;
        return new X(m13.f48940a, m13.f48941b);
    }

    public final X a(M m13) {
        return new X(m13.f48940a, m13.f48941b);
    }
}
