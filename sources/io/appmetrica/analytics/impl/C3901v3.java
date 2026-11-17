package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3901v3 extends Z2 {
    public C3901v3(int i13, String str, PublicLogger publicLogger) {
        super(i13, str, publicLogger);
    }

    public final int b() {
        return this.f46840a;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i13 = this.f46840a;
        if (length <= i13) {
            return bArr;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        this.f46842c.warning("\"%s\" %s exceeded limit of %d bytes", this.f46841b, bArr, Integer.valueOf(this.f46840a));
        return bArr2;
    }

    public final String a() {
        return this.f46841b;
    }
}
