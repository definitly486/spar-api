package ob;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SecretKeySpec f72504iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f72505ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f72506zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72503wkgbmnqykc = gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ThreadLocal f72502eablkybsjg = new C1570iobyxmoadg();

    /* JADX INFO: renamed from: ob.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1570iobyxmoadg extends ThreadLocal {
        C1570iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public iobyxmoadg(byte[] bArr, int i13) throws GeneralSecurityException {
        if (!f72503wkgbmnqykc.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        oxmwwwfdhm.iobyxmoadg(bArr.length);
        this.f72504iobyxmoadg = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f72502eablkybsjg.get()).getBlockSize();
        this.f72505ppxfxbqfkf = blockSize;
        if (i13 < 12 || i13 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f72506zoijcleaow = i13;
    }

    private void zoijcleaow(byte[] bArr, int i13, int i14, byte[] bArr2, int i15, byte[] bArr3, boolean z13) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f72502eablkybsjg.get();
        byte[] bArr4 = new byte[this.f72505ppxfxbqfkf];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f72506zoijcleaow);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z13) {
            cipher.init(1, this.f72504iobyxmoadg, ivParameterSpec);
        } else {
            cipher.init(2, this.f72504iobyxmoadg, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i13, i14, bArr2, i15) != i14) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // ob.draadjrbmk
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f72506zoijcleaow;
        if (length > Integer.MAX_VALUE - i13) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f72506zoijcleaow));
        }
        byte[] bArr2 = new byte[bArr.length + i13];
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(i13);
        System.arraycopy(bArrPpxfxbqfkf, 0, bArr2, 0, this.f72506zoijcleaow);
        zoijcleaow(bArr, 0, bArr.length, bArr2, this.f72506zoijcleaow, bArrPpxfxbqfkf, true);
        return bArr2;
    }

    @Override // ob.draadjrbmk
    public byte[] iobyxmoadg(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f72506zoijcleaow;
        if (length < i13) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        int length2 = bArr.length;
        int i14 = this.f72506zoijcleaow;
        byte[] bArr3 = new byte[length2 - i14];
        zoijcleaow(bArr, i14, bArr.length - i14, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
