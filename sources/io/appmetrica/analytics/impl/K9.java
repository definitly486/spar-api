package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class K9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I9 fromModel(J9 j13) {
        I9 i13 = new I9();
        String str = j13.f46090a;
        if (str != null) {
            i13.f46003a = str.getBytes();
        }
        return i13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J9 toModel(I9 i13) {
        return new J9(new String(i13.f46003a));
    }
}
