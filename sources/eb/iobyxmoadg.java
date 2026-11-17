package eb;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ob.dxjokdxxww;
import ob.oxmwwwfdhm;
import ob.rgvfuqvkyq;
import ob.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ThreadLocal f31061zoijcleaow = new C0657iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SecretKey f31062iobyxmoadg;

    /* JADX INFO: renamed from: eb.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0657iobyxmoadg extends ThreadLocal {
        C0657iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public iobyxmoadg(byte[] bArr) throws InvalidAlgorithmParameterException {
        oxmwwwfdhm.iobyxmoadg(bArr.length);
        this.f31062iobyxmoadg = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec ppxfxbqfkf(byte[] bArr) {
        return wkgbmnqykc(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec wkgbmnqykc(byte[] bArr, int i13, int i14) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, i13, i14);
        } catch (ClassNotFoundException unused) {
            if (vdvldrhtss.zoijcleaow()) {
                return new IvParameterSpec(bArr, i13, i14);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(12);
        System.arraycopy(bArrPpxfxbqfkf, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecPpxfxbqfkf = ppxfxbqfkf(bArrPpxfxbqfkf);
        ThreadLocal threadLocal = f31061zoijcleaow;
        ((Cipher) threadLocal.get()).init(1, this.f31062iobyxmoadg, algorithmParameterSpecPpxfxbqfkf);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecWkgbmnqykc = wkgbmnqykc(bArr, 0, 12);
        ThreadLocal threadLocal = f31061zoijcleaow;
        ((Cipher) threadLocal.get()).init(2, this.f31062iobyxmoadg, algorithmParameterSpecWkgbmnqykc);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
