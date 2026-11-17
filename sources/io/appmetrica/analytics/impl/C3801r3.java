package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3801r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3777q3 f47958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f47959b;

    public C3801r3() {
        this(new C3777q3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C3777q3 c3777q3 = this.f47958a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c3777q3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f47959b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3801r3(C3777q3 c3777q3, GZIPCompressor gZIPCompressor) {
        this.f47958a = c3777q3;
        this.f47959b = gZIPCompressor;
    }
}
