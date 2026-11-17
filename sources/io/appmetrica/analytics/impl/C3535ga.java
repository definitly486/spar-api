package io.appmetrica.analytics.impl;

import android.util.Base64;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3535ga implements Z8 {
    @Override // io.appmetrica.analytics.impl.Z8
    public final S8 a(C3655l6 c3655l6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.Z8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final EnumC3405b9 a() {
        return EnumC3405b9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
