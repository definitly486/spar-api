package db;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ob.oxmwwwfdhm;
import ob.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f27374ppxfxbqfkf = gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ThreadLocal f27375wkgbmnqykc = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SecretKey f27376iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f27377zoijcleaow;

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) ob.dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public zoijcleaow(byte[] bArr, boolean z13) throws GeneralSecurityException {
        if (!f27374ppxfxbqfkf.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        oxmwwwfdhm.iobyxmoadg(bArr.length);
        this.f27376iobyxmoadg = new SecretKeySpec(bArr, "AES");
        this.f27377zoijcleaow = z13;
    }

    private static AlgorithmParameterSpec ppxfxbqfkf(byte[] bArr) {
        return wkgbmnqykc(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec wkgbmnqykc(byte[] bArr, int i13, int i14) {
        return (!vdvldrhtss.zoijcleaow() || vdvldrhtss.iobyxmoadg() > 19) ? new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, i13, i14) : new IvParameterSpec(bArr, i13, i14);
    }

    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z13 = this.f27377zoijcleaow;
        if (bArr2.length < (z13 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z13 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecPpxfxbqfkf = ppxfxbqfkf(bArr);
        ThreadLocal threadLocal = f27375wkgbmnqykc;
        ((Cipher) threadLocal.get()).init(2, this.f27376iobyxmoadg, algorithmParameterSpecPpxfxbqfkf);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z14 = this.f27377zoijcleaow;
        return ((Cipher) threadLocal.get()).doFinal(bArr2, z14 ? 12 : 0, z14 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z13 = this.f27377zoijcleaow;
        byte[] bArr4 = new byte[z13 ? bArr2.length + 28 : bArr2.length + 16];
        if (z13) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecPpxfxbqfkf = ppxfxbqfkf(bArr);
        ThreadLocal threadLocal = f27375wkgbmnqykc;
        ((Cipher) threadLocal.get()).init(1, this.f27376iobyxmoadg, algorithmParameterSpecPpxfxbqfkf);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.f27377zoijcleaow ? 12 : 0);
        if (iDoFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr2.length)));
    }
}
