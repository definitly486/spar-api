package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class X9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3820rm fromModel(W9 w13) {
        C3820rm c3820rm = new C3820rm();
        if (w13 != null) {
            c3820rm.f48020a = w13.f46708a;
        }
        return c3820rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new W9(((C3820rm) obj).f48020a);
    }

    public final W9 a(C3820rm c3820rm) {
        return new W9(c3820rm.f48020a);
    }
}
