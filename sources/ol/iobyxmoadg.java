package ol;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;
import ql.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends kl.gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final am.iobyxmoadg f73152gxszxtbevo = am.zoijcleaow.dxjokdxxww(getClass());

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AlgorithmParameterSpec f73153lqeggnwhkg;

    public iobyxmoadg(String str, String str2, String str3) {
        wflxmlrfwp(str);
        agtfadlqog(str2);
        ojitshcjhn(kcexrzcfyt.ASYMMETRIC);
        rgvfuqvkyq(str3);
    }

    private void kcexrzcfyt(Signature signature, Key key, gl.iobyxmoadg iobyxmoadgVar) throws InvalidKeyException {
        try {
            PrivateKey privateKey = (PrivateKey) key;
            SecureRandom secureRandomZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (secureRandomZoijcleaow == null) {
                signature.initSign(privateKey);
            } else {
                signature.initSign(privateKey, secureRandomZoijcleaow);
            }
        } catch (java.security.InvalidKeyException e13) {
            throw new InvalidKeyException(vdvldrhtss(key) + "for " + draadjrbmk(), e13);
        }
    }

    private Signature oxmwwwfdhm(gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        gl.iobyxmoadg.C0852iobyxmoadg c0852iobyxmoadgPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strDxjokdxxww = c0852iobyxmoadgPpxfxbqfkf.dxjokdxxww();
        String strDraadjrbmk = draadjrbmk();
        c0852iobyxmoadgPpxfxbqfkf.nufgyqmvbu();
        try {
            Signature signature = strDxjokdxxww == null ? Signature.getInstance(strDraadjrbmk) : Signature.getInstance(strDraadjrbmk, strDxjokdxxww);
            AlgorithmParameterSpec algorithmParameterSpec = this.f73153lqeggnwhkg;
            if (algorithmParameterSpec != null) {
                try {
                    signature.setParameter(algorithmParameterSpec);
                } catch (UnsupportedOperationException e13) {
                    if (this.f73152gxszxtbevo.nufgyqmvbu()) {
                        this.f73152gxszxtbevo.jyumaefscl("Unable to set algorithm parameter spec on Signature (java algorithm name: " + strDraadjrbmk + ") so ignoring the UnsupportedOperationException and relying on the default parameters.", e13);
                    }
                }
            }
            return signature;
        } catch (InvalidAlgorithmParameterException e14) {
            throw new JoseException("Invalid algorithm parameter (" + this.f73153lqeggnwhkg + ") for: " + strDraadjrbmk, e14);
        } catch (NoSuchAlgorithmException e15) {
            throw new JoseException("Unable to get an implementation of algorithm name: " + strDraadjrbmk, e15);
        } catch (NoSuchProviderException e16) {
            throw new JoseException("Unable to get an implementation of " + strDraadjrbmk + " for provider " + strDxjokdxxww, e16);
        }
    }

    private String vdvldrhtss(Key key) {
        String str;
        if (key == null) {
            str = "key is null";
        } else {
            str = "algorithm=" + key.getAlgorithm();
        }
        return "The given key (" + str + ") is not valid ";
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        try {
            return oxmwwwfdhm(new gl.iobyxmoadg()) != null;
        } catch (Exception e13) {
            this.f73152gxszxtbevo.wkgbmnqykc(eablkybsjg() + " via " + draadjrbmk() + " is NOT available from the underlying JCE (" + rl.zoijcleaow.iobyxmoadg(e13) + ").");
            return false;
        }
    }

    public byte[] jyumaefscl(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr) throws JoseException {
        Signature signatureWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc();
        try {
            signatureWkgbmnqykc.update(bArr);
            return signatureWkgbmnqykc.sign();
        } catch (SignatureException e13) {
            throw new JoseException("Problem creating signature.", e13);
        }
    }

    protected void yggfygwlhe(AlgorithmParameterSpec algorithmParameterSpec) {
        this.f73153lqeggnwhkg = algorithmParameterSpec;
    }

    public kl.lqeggnwhkg zdlpuopuiu(Key key, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        Signature signatureOxmwwwfdhm = oxmwwwfdhm(iobyxmoadgVar);
        kcexrzcfyt(signatureOxmwwwfdhm, key, iobyxmoadgVar);
        return new kl.lqeggnwhkg(signatureOxmwwwfdhm);
    }
}
