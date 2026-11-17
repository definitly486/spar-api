package ll;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.IntegrityException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esjtqupxsv extends kl.gxszxtbevo implements yggfygwlhe {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AlgorithmParameterSpec f63306lqeggnwhkg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected final am.iobyxmoadg f63305gxszxtbevo = am.zoijcleaow.dxjokdxxww(getClass());

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected boolean f63307nufgyqmvbu = true;

    public esjtqupxsv(String str, String str2) {
        agtfadlqog(str);
        wflxmlrfwp(str2);
    }

    private gl.iobyxmoadg.C0852iobyxmoadg vdvldrhtss(gl.iobyxmoadg iobyxmoadgVar) {
        return this.f63307nufgyqmvbu ? iobyxmoadgVar.ppxfxbqfkf() : iobyxmoadgVar.iobyxmoadg();
    }

    protected btonecajqb kcexrzcfyt(Key key, dxjokdxxww dxjokdxxwwVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        Cipher cipherIobyxmoadg = gxszxtbevo.iobyxmoadg(draadjrbmk(), vdvldrhtss(iobyxmoadgVar).iobyxmoadg());
        try {
            oxmwwwfdhm(cipherIobyxmoadg, 3, key);
            return new btonecajqb(bArr, cipherIobyxmoadg.wrap(new SecretKeySpec(bArr, dxjokdxxwwVar.iobyxmoadg())));
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new JoseException("Unable to encrypt (" + cipherIobyxmoadg.getAlgorithm() + ") the Content Encryption Key: " + e, e);
        } catch (InvalidKeyException e14) {
            throw new org.jose4j.lang.InvalidKeyException("Unable to encrypt (" + cipherIobyxmoadg.getAlgorithm() + ") the Content Encryption Key: " + e14, e14);
        } catch (IllegalBlockSizeException e15) {
            e = e15;
            throw new JoseException("Unable to encrypt (" + cipherIobyxmoadg.getAlgorithm() + ") the Content Encryption Key: " + e, e);
        }
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws IntegrityException {
        try {
            return yggfygwlhe(lqeggnwhkgVar, bArr, iobyxmoadgVar, dxjokdxxwwVar);
        } catch (Exception e13) {
            throw new IntegrityException(eablkybsjg() + " key unwrap/decrypt failed.", e13);
        }
    }

    void oxmwwwfdhm(Cipher cipher, int i13, Key key) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = this.f63306lqeggnwhkg;
        if (algorithmParameterSpec == null) {
            cipher.init(i13, key);
        } else {
            cipher.init(i13, key, algorithmParameterSpec);
        }
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        gl.iobyxmoadg.C0852iobyxmoadg c0852iobyxmoadgVdvldrhtss = vdvldrhtss(iobyxmoadgVar);
        Cipher cipherIobyxmoadg = gxszxtbevo.iobyxmoadg(draadjrbmk(), c0852iobyxmoadgVdvldrhtss.iobyxmoadg());
        try {
            oxmwwwfdhm(cipherIobyxmoadg, c0852iobyxmoadgVdvldrhtss.ppxfxbqfkf() == gl.iobyxmoadg.zoijcleaow.DECRYPT ? 2 : 4, key);
            return new kl.lqeggnwhkg(cipherIobyxmoadg);
        } catch (InvalidAlgorithmParameterException e13) {
            throw new JoseException("Unable to initialize cipher (" + cipherIobyxmoadg.getAlgorithm() + ") for key unwrap/decrypt - " + e13, e13);
        } catch (InvalidKeyException e14) {
            throw new org.jose4j.lang.InvalidKeyException("Unable to initialize cipher (" + cipherIobyxmoadg.getAlgorithm() + ") for key unwrap/decrypt - " + e14, e14);
        }
    }

    protected Key yggfygwlhe(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar, dxjokdxxww dxjokdxxwwVar) {
        gl.iobyxmoadg.C0852iobyxmoadg c0852iobyxmoadgVdvldrhtss = vdvldrhtss(iobyxmoadgVar);
        Cipher cipherIobyxmoadg = lqeggnwhkgVar.iobyxmoadg();
        String strIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        return c0852iobyxmoadgVdvldrhtss.ppxfxbqfkf() == gl.iobyxmoadg.zoijcleaow.DECRYPT ? new SecretKeySpec(cipherIobyxmoadg.doFinal(bArr), strIobyxmoadg) : cipherIobyxmoadg.unwrap(bArr, strIobyxmoadg, 3);
    }

    public void zdlpuopuiu(AlgorithmParameterSpec algorithmParameterSpec) {
        this.f63306lqeggnwhkg = algorithmParameterSpec;
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) {
        if (bArr == null) {
            bArr = rl.iobyxmoadg.btonecajqb(dxjokdxxwwVar.zoijcleaow());
        }
        return kcexrzcfyt(key, dxjokdxxwwVar, bArr, iobyxmoadgVar);
    }
}
