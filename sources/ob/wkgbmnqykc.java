package ob;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements bb.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f72527iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f72528zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72525ppxfxbqfkf = gb.zoijcleaow.EnumC0829zoijcleaow.f36735zdlpuopuiu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Collection f72526wkgbmnqykc = Arrays.asList(64);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final byte[] f72523eablkybsjg = new byte[16];

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final byte[] f72524gxszxtbevo = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public wkgbmnqykc(byte[] bArr) throws GeneralSecurityException {
        if (!f72525ppxfxbqfkf.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f72526wkgbmnqykc.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f72528zoijcleaow = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f72527iobyxmoadg = new wflxmlrfwp(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] ppxfxbqfkf(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f72527iobyxmoadg.iobyxmoadg(f72524gxszxtbevo, 16);
        }
        byte[] bArrIobyxmoadg = this.f72527iobyxmoadg.iobyxmoadg(f72523eablkybsjg, 16);
        for (int i13 = 0; i13 < bArr.length - 1; i13++) {
            byte[] bArr2 = bArr[i13];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrIobyxmoadg = gxszxtbevo.eablkybsjg(kb.iobyxmoadg.zoijcleaow(bArrIobyxmoadg), this.f72527iobyxmoadg.iobyxmoadg(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f72527iobyxmoadg.iobyxmoadg(bArr3.length >= 16 ? gxszxtbevo.gxszxtbevo(bArr3, bArrIobyxmoadg) : gxszxtbevo.eablkybsjg(kb.iobyxmoadg.iobyxmoadg(bArr3), kb.iobyxmoadg.zoijcleaow(bArrIobyxmoadg)), 16);
    }

    @Override // bb.eablkybsjg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/CTR/NoPadding");
        byte[] bArrPpxfxbqfkf = ppxfxbqfkf(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrPpxfxbqfkf.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f72528zoijcleaow, "AES"), new IvParameterSpec(bArr3));
        return gxszxtbevo.iobyxmoadg(bArrPpxfxbqfkf, cipher.doFinal(bArr));
    }

    @Override // bb.eablkybsjg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f72528zoijcleaow, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && vdvldrhtss.zoijcleaow()) {
            bArrDoFinal = new byte[0];
        }
        if (gxszxtbevo.zoijcleaow(bArrCopyOfRange, ppxfxbqfkf(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
