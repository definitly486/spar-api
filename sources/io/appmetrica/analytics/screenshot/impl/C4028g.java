package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4028g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K fromModel(C4026e c4026e) {
        K k13 = new K();
        k13.f48934a = c4026e.f48981a;
        return k13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4026e(((K) obj).f48934a);
    }

    public final C4026e a(K k13) {
        return new C4026e(k13.f48934a);
    }
}
