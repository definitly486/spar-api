package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f45308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f45309c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f45307a = str;
        this.f45308b = bArr;
        this.f45309c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f45308b, "AES");
            Cipher cipher = Cipher.getInstance(this.f45307a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f45309c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f45307a;
    }

    public byte[] getIV() {
        return this.f45309c;
    }

    public byte[] getPassword() {
        return this.f45308b;
    }

    public byte[] decrypt(byte[] bArr, int i13, int i14) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f45308b, "AES");
            Cipher cipher = Cipher.getInstance(this.f45307a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f45309c));
            return cipher.doFinal(bArr, i13, i14);
        } catch (Throwable unused) {
            return null;
        }
    }
}
