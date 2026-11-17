package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3995ym extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3970xm defaultValue() {
        C3970xm c3970xm = new C3970xm();
        c3970xm.f48467i = new C3845sm();
        return c3970xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3970xm toState(byte[] bArr) throws IOException {
        return (C3970xm) MessageNano.mergeFrom(new C3970xm(), bArr);
    }
}
