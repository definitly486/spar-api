package ob;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp implements mb.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72519wkgbmnqykc = gb.zoijcleaow.EnumC0829zoijcleaow.f36735zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SecretKey f72520iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private byte[] f72521ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private byte[] f72522zoijcleaow;

    public wflxmlrfwp(byte[] bArr) throws GeneralSecurityException {
        oxmwwwfdhm.iobyxmoadg(bArr.length);
        this.f72520iobyxmoadg = new SecretKeySpec(bArr, "AES");
        zoijcleaow();
    }

    private static Cipher ppxfxbqfkf() throws GeneralSecurityException {
        if (f72519wkgbmnqykc.iobyxmoadg()) {
            return (Cipher) dxjokdxxww.f72480zoijcleaow.iobyxmoadg("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private void zoijcleaow() throws GeneralSecurityException {
        Cipher cipherPpxfxbqfkf = ppxfxbqfkf();
        cipherPpxfxbqfkf.init(1, this.f72520iobyxmoadg);
        byte[] bArrZoijcleaow = kb.iobyxmoadg.zoijcleaow(cipherPpxfxbqfkf.doFinal(new byte[16]));
        this.f72522zoijcleaow = bArrZoijcleaow;
        this.f72521ppxfxbqfkf = kb.iobyxmoadg.zoijcleaow(bArrZoijcleaow);
    }

    @Override // mb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, int i13) throws GeneralSecurityException {
        if (i13 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherPpxfxbqfkf = ppxfxbqfkf();
        cipherPpxfxbqfkf.init(1, this.f72520iobyxmoadg);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrWkgbmnqykc = iMax * 16 == bArr.length ? gxszxtbevo.wkgbmnqykc(bArr, (iMax - 1) * 16, this.f72522zoijcleaow, 0, 16) : gxszxtbevo.eablkybsjg(kb.iobyxmoadg.iobyxmoadg(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f72521ppxfxbqfkf);
        byte[] bArrDoFinal = new byte[16];
        for (int i14 = 0; i14 < iMax - 1; i14++) {
            bArrDoFinal = cipherPpxfxbqfkf.doFinal(gxszxtbevo.wkgbmnqykc(bArrDoFinal, 0, bArr, i14 * 16, 16));
        }
        return Arrays.copyOf(cipherPpxfxbqfkf.doFinal(gxszxtbevo.eablkybsjg(bArrWkgbmnqykc, bArrDoFinal)), i13);
    }
}
