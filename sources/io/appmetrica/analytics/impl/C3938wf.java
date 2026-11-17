package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3938wf extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* JADX INFO: renamed from: a */
    public final MessageNano defaultValue() {
        return new Bf();
    }

    public final Bf b() {
        return new Bf();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Bf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf toState(byte[] bArr) throws IOException {
        return (Bf) MessageNano.mergeFrom(new Bf(), bArr);
    }
}
