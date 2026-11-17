package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* JADX INFO: loaded from: classes3.dex */
public final class Mn implements qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3379a9 f46242a;

    public Mn() {
        this(new C3379a9());
    }

    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(c3534g9.f47303b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((Z8) this.f46242a.f46911a.a(c3534g9.f47316o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public Mn(C3379a9 c3379a9) {
        this.f46242a = c3379a9;
    }

    public final C3379a9 a() {
        return this.f46242a;
    }
}
