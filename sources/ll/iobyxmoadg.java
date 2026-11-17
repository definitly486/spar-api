package ll;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.jose4j.lang.IntegrityException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends kl.gxszxtbevo implements lqeggnwhkg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f63311gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f63312lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final dxjokdxxww f63313nufgyqmvbu;

    /* JADX INFO: renamed from: ll.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C1286iobyxmoadg extends iobyxmoadg implements lqeggnwhkg {
        public C1286iobyxmoadg() {
            super("A128CBC-HS256", 32, "HmacSHA256", 16);
        }
    }

    public static class ppxfxbqfkf extends iobyxmoadg implements lqeggnwhkg {
        public ppxfxbqfkf() {
            super("A256CBC-HS512", 64, "HmacSHA512", 32);
        }
    }

    public static class zoijcleaow extends iobyxmoadg implements lqeggnwhkg {
        public zoijcleaow() {
            super("A192CBC-HS384", 48, "HmacSHA384", 24);
        }
    }

    public iobyxmoadg(String str, int i13, String str2, int i14) {
        wflxmlrfwp(str);
        this.f63313nufgyqmvbu = new dxjokdxxww(i13, "AES");
        this.f63311gxszxtbevo = str2;
        this.f63312lqeggnwhkg = i14;
        agtfadlqog(AESEncrypter.DEFAULT_ALGORITHM);
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("AES");
    }

    private byte[] oxmwwwfdhm(byte[] bArr) {
        return rl.iobyxmoadg.lqeggnwhkg(rl.iobyxmoadg.zoijcleaow(bArr));
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return eablkybsjg.iobyxmoadg(draadjrbmk(), wkgbmnqykc().zoijcleaow() / 2);
    }

    @Override // ll.lqeggnwhkg
    public byte[] dxjokdxxww(gtknphoqwx gtknphoqwxVar, byte[] bArr, byte[] bArr2, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        String strZoijcleaow = nufgyqmvbu.zoijcleaow(zoijcleaowVar, iobyxmoadgVar);
        String strPpxfxbqfkf = nufgyqmvbu.ppxfxbqfkf(zoijcleaowVar, iobyxmoadgVar);
        byte[] bArrPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf();
        byte[] bArrZoijcleaow = gtknphoqwxVar.zoijcleaow();
        byte[] bArrIobyxmoadg = gtknphoqwxVar.iobyxmoadg();
        if (!rl.iobyxmoadg.agtfadlqog(bArrIobyxmoadg, rl.iobyxmoadg.ojitshcjhn(sl.iobyxmoadg.iobyxmoadg(kcexrzcfyt(), new ql.vdvldrhtss(rl.iobyxmoadg.dxjokdxxww(bArr2)), strPpxfxbqfkf).doFinal(rl.iobyxmoadg.wkgbmnqykc(bArr, bArrPpxfxbqfkf, bArrZoijcleaow, oxmwwwfdhm(bArr))), 0, zdlpuopuiu()))) {
            throw new IntegrityException("Authentication tag check failed. Message=" + new el.zoijcleaow().eablkybsjg(bArrIobyxmoadg));
        }
        ql.iobyxmoadg iobyxmoadgVar2 = new ql.iobyxmoadg(rl.iobyxmoadg.wflxmlrfwp(bArr2));
        Cipher cipherIobyxmoadg = gxszxtbevo.iobyxmoadg(draadjrbmk(), strZoijcleaow);
        try {
            cipherIobyxmoadg.init(2, iobyxmoadgVar2, new IvParameterSpec(bArrPpxfxbqfkf));
            try {
                return cipherIobyxmoadg.doFinal(bArrZoijcleaow);
            } catch (BadPaddingException | IllegalBlockSizeException e13) {
                throw new JoseException(e13.toString(), e13);
            }
        } catch (InvalidAlgorithmParameterException e14) {
            throw new JoseException(e14.toString(), e14);
        } catch (InvalidKeyException e15) {
            throw new JoseException("Invalid key for " + draadjrbmk(), e15);
        }
    }

    @Override // ll.lqeggnwhkg
    public gtknphoqwx gtknphoqwx(byte[] bArr, byte[] bArr2, byte[] bArr3, pl.zoijcleaow zoijcleaowVar, byte[] bArr4, gl.iobyxmoadg iobyxmoadgVar) {
        return vdvldrhtss(bArr, bArr2, bArr3, kcexrzcfyt.iobyxmoadg(16, bArr4, iobyxmoadgVar.zoijcleaow()), zoijcleaowVar, iobyxmoadgVar);
    }

    public String kcexrzcfyt() {
        return this.f63311gxszxtbevo;
    }

    gtknphoqwx vdvldrhtss(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        ql.vdvldrhtss vdvldrhtssVar = new ql.vdvldrhtss(rl.iobyxmoadg.dxjokdxxww(bArr3));
        ql.iobyxmoadg iobyxmoadgVar2 = new ql.iobyxmoadg(rl.iobyxmoadg.wflxmlrfwp(bArr3));
        Cipher cipherIobyxmoadg = gxszxtbevo.iobyxmoadg(draadjrbmk(), nufgyqmvbu.zoijcleaow(zoijcleaowVar, iobyxmoadgVar));
        try {
            cipherIobyxmoadg.init(1, iobyxmoadgVar2, new IvParameterSpec(bArr4));
            try {
                byte[] bArrDoFinal = cipherIobyxmoadg.doFinal(bArr);
                return new gtknphoqwx(bArr4, bArrDoFinal, rl.iobyxmoadg.ojitshcjhn(sl.iobyxmoadg.iobyxmoadg(kcexrzcfyt(), vdvldrhtssVar, nufgyqmvbu.ppxfxbqfkf(zoijcleaowVar, iobyxmoadgVar)).doFinal(rl.iobyxmoadg.wkgbmnqykc(bArr2, bArr4, bArrDoFinal, oxmwwwfdhm(bArr2))), 0, zdlpuopuiu()));
            } catch (BadPaddingException | IllegalBlockSizeException e13) {
                throw new JoseException(e13.toString(), e13);
            }
        } catch (InvalidAlgorithmParameterException e14) {
            throw new JoseException(e14.toString(), e14);
        } catch (InvalidKeyException e15) {
            throw new JoseException("Invalid key for " + draadjrbmk(), e15);
        }
    }

    @Override // ll.lqeggnwhkg
    public dxjokdxxww wkgbmnqykc() {
        return this.f63313nufgyqmvbu;
    }

    public int zdlpuopuiu() {
        return this.f63312lqeggnwhkg;
    }
}
