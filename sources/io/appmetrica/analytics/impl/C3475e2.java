package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3475e2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* JADX INFO: renamed from: a */
    public final MessageNano defaultValue() {
        return new C3450d2();
    }

    public final C3450d2 b() {
        return new C3450d2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C3450d2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3450d2 toState(byte[] bArr) throws IOException {
        return (C3450d2) MessageNano.mergeFrom(new C3450d2(), bArr);
    }
}
