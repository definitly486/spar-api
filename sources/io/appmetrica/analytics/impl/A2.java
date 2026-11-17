package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class A2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* JADX INFO: renamed from: a */
    public final MessageNano defaultValue() {
        return new C4000z2();
    }

    public final C4000z2 b() {
        return new C4000z2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4000z2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4000z2 toState(byte[] bArr) throws IOException {
        return (C4000z2) MessageNano.mergeFrom(new C4000z2(), bArr);
    }
}
