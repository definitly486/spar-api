package ob;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72529eablkybsjg = gb.zoijcleaow.EnumC0829zoijcleaow.f36735zdlpuopuiu;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ThreadLocal f72530gxszxtbevo = new iobyxmoadg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final ThreadLocal f72531lqeggnwhkg = new C1571zoijcleaow();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f72532iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SecretKeySpec f72533ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f72534wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f72535zoijcleaow;

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    /* JADX INFO: renamed from: ob.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C1571zoijcleaow extends ThreadLocal {
        C1571zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public zoijcleaow(byte[] bArr, int i13) throws GeneralSecurityException {
        if (!f72529eablkybsjg.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i13 != 12 && i13 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f72534wkgbmnqykc = i13;
        oxmwwwfdhm.iobyxmoadg(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f72533ppxfxbqfkf = secretKeySpec;
        Cipher cipher = (Cipher) f72530gxszxtbevo.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrPpxfxbqfkf = ppxfxbqfkf(cipher.doFinal(new byte[16]));
        this.f72532iobyxmoadg = bArrPpxfxbqfkf;
        this.f72535zoijcleaow = ppxfxbqfkf(bArrPpxfxbqfkf);
    }

    private byte[] eablkybsjg(byte[] bArr) {
        if (bArr.length == 16) {
            return gxszxtbevo(bArr, this.f72532iobyxmoadg);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f72535zoijcleaow, 16);
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArr[i13]);
        }
        bArrCopyOf[bArr.length] = (byte) (bArrCopyOf[bArr.length] ^ 128);
        return bArrCopyOf;
    }

    private static byte[] gxszxtbevo(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            bArr3[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
        }
        return bArr3;
    }

    private static byte[] ppxfxbqfkf(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i13 = 0;
        while (i13 < 15) {
            int i14 = i13 + 1;
            bArr2[i13] = (byte) (((bArr[i13] << 1) ^ ((bArr[i14] & 255) >>> 7)) & KotlinVersion.MAX_COMPONENT_VALUE);
            i13 = i14;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] wkgbmnqykc(Cipher cipher, int i13, byte[] bArr, int i14, int i15) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i13;
        if (i15 == 0) {
            return cipher.doFinal(gxszxtbevo(bArr2, this.f72532iobyxmoadg));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i16 = 0;
        while (i15 - i16 > 16) {
            for (int i17 = 0; i17 < 16; i17++) {
                bArrDoFinal[i17] = (byte) (bArrDoFinal[i17] ^ bArr[(i14 + i16) + i17]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i16 += 16;
        }
        return cipher.doFinal(gxszxtbevo(bArrDoFinal, eablkybsjg(Arrays.copyOfRange(bArr, i16 + i14, i14 + i15))));
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f72534wkgbmnqykc;
        if (length > 2147483631 - i13) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i13 + 16];
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(i13);
        System.arraycopy(bArrPpxfxbqfkf, 0, bArr3, 0, this.f72534wkgbmnqykc);
        Cipher cipher = (Cipher) f72530gxszxtbevo.get();
        cipher.init(1, this.f72533ppxfxbqfkf);
        byte[] bArrWkgbmnqykc = wkgbmnqykc(cipher, 0, bArrPpxfxbqfkf, 0, bArrPpxfxbqfkf.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrWkgbmnqykc2 = wkgbmnqykc(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f72531lqeggnwhkg.get();
        cipher2.init(1, this.f72533ppxfxbqfkf, new IvParameterSpec(bArrWkgbmnqykc));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f72534wkgbmnqykc);
        byte[] bArrWkgbmnqykc3 = wkgbmnqykc(cipher, 2, bArr3, this.f72534wkgbmnqykc, bArr.length);
        int length2 = bArr.length + this.f72534wkgbmnqykc;
        for (int i14 = 0; i14 < 16; i14++) {
            bArr3[length2 + i14] = (byte) ((bArrWkgbmnqykc2[i14] ^ bArrWkgbmnqykc[i14]) ^ bArrWkgbmnqykc3[i14]);
        }
        return bArr3;
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f72534wkgbmnqykc) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f72530gxszxtbevo.get();
        cipher.init(1, this.f72533ppxfxbqfkf);
        byte[] bArrWkgbmnqykc = wkgbmnqykc(cipher, 0, bArr, 0, this.f72534wkgbmnqykc);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrWkgbmnqykc2 = wkgbmnqykc(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrWkgbmnqykc3 = wkgbmnqykc(cipher, 2, bArr, this.f72534wkgbmnqykc, length);
        int length2 = bArr.length - 16;
        byte b13 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b13 = (byte) (b13 | (((bArr[length2 + i13] ^ bArrWkgbmnqykc2[i13]) ^ bArrWkgbmnqykc[i13]) ^ bArrWkgbmnqykc3[i13]));
        }
        if (b13 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f72531lqeggnwhkg.get();
        cipher2.init(1, this.f72533ppxfxbqfkf, new IvParameterSpec(bArrWkgbmnqykc));
        return cipher2.doFinal(bArr, this.f72534wkgbmnqykc, length);
    }
}
