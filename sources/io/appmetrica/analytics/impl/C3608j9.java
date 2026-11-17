package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3608j9 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* JADX INFO: renamed from: a */
    public final MessageNano defaultValue() {
        return new P9();
    }

    public final P9 b() {
        return new P9();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new P9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P9 toState(byte[] bArr) throws IOException {
        return (P9) MessageNano.mergeFrom(new P9(), bArr);
    }
}
