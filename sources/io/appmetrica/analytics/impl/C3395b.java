package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3395b implements Z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEncrypter f46932a;

    public C3395b() {
        this(new C3369a(Ia.j().f()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.Z8
    public final S8 a(C3655l6 c3655l6) {
        String strEncodeToString;
        String value = c3655l6.getValue();
        if (TextUtils.isEmpty(value)) {
            strEncodeToString = null;
        } else {
            try {
                byte[] bArrEncrypt = this.f46932a.encrypt(value.getBytes("UTF-8"));
                if (bArrEncrypt != null) {
                    strEncodeToString = Base64.encodeToString(bArrEncrypt, 0);
                } else {
                    strEncodeToString = null;
                }
            } catch (Throwable unused) {
            }
        }
        c3655l6.setValue(strEncodeToString);
        return new S8(c3655l6, EnumC3405b9.AES_VALUE_ENCRYPTION);
    }

    public C3395b(C3369a c3369a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c3369a.b(), c3369a.a()));
    }

    public C3395b(AESEncrypter aESEncrypter) {
        this.f46932a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.Z8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f46932a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    public final EnumC3405b9 a() {
        return EnumC3405b9.AES_VALUE_ENCRYPTION;
    }
}
