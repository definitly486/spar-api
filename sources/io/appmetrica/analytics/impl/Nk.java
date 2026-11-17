package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class Nk extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* JADX INFO: renamed from: a */
    public final MessageNano defaultValue() {
        return new Lk();
    }

    public final Lk b() {
        return new Lk();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Lk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk toState(byte[] bArr) {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}
