package ll;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.JoseException;
import org.jose4j.lang.UncheckedJoseException;
import ql.iozdgvuglv;

/* JADX INFO: loaded from: classes3.dex */
public class vdvldrhtss extends kl.gxszxtbevo implements yggfygwlhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    String f63326gxszxtbevo;

    public vdvldrhtss() {
        this.f63326gxszxtbevo = "enc";
        wflxmlrfwp("ECDH-ES");
        agtfadlqog("ECDH");
        rgvfuqvkyq("EC");
        ojitshcjhn(ql.kcexrzcfyt.ASYMMETRIC);
    }

    private byte[] jyumaefscl(dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) {
        return new ml.wkgbmnqykc(iobyxmoadgVar.iobyxmoadg().lqeggnwhkg()).zoijcleaow(bArr, rl.iobyxmoadg.iobyxmoadg(dxjokdxxwwVar.zoijcleaow()), zoijcleaowVar.gxszxtbevo(this.f63326gxszxtbevo), zoijcleaowVar.gxszxtbevo("apu"), zoijcleaowVar.gxszxtbevo("apv"));
    }

    private KeyAgreement kcexrzcfyt(PrivateKey privateKey, PublicKey publicKey, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        KeyAgreement keyAgreementYggfygwlhe = yggfygwlhe(iobyxmoadgVar.ppxfxbqfkf().zoijcleaow(), privateKey instanceof ECPrivateKey ? draadjrbmk() : "XDH");
        try {
            keyAgreementYggfygwlhe.init(privateKey);
            keyAgreementYggfygwlhe.doPhase(publicKey, true);
            return keyAgreementYggfygwlhe;
        } catch (InvalidKeyException e13) {
            throw new org.jose4j.lang.InvalidKeyException("Invalid Key for " + draadjrbmk() + " key agreement - " + e13, e13);
        }
    }

    private void oxmwwwfdhm(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws org.jose4j.lang.InvalidKeyException {
        EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        ECPoint w13 = eCPublicKey.getW();
        BigInteger affineX = w13.getAffineX();
        BigInteger affineY = w13.getAffineY();
        BigInteger a13 = curve.getA();
        BigInteger b13 = curve.getB();
        BigInteger p13 = ((ECFieldFp) curve.getField()).getP();
        if (affineY.pow(2).mod(p13).equals(affineX.pow(3).add(a13.multiply(affineX)).add(b13).mod(p13))) {
            return;
        }
        throw new org.jose4j.lang.InvalidKeyException("epk is invalid for " + ql.rgvfuqvkyq.zoijcleaow(curve));
    }

    private void vdvldrhtss(ECKey eCKey) throws org.jose4j.lang.InvalidKeyException {
        if ("secp256k1".equals(ql.rgvfuqvkyq.zoijcleaow(eCKey.getParams().getCurve()))) {
            throw new org.jose4j.lang.InvalidKeyException("Use of the secp256k1 curve is not defined for ECDH-ES key agreement with JOSE.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private KeyAgreement yggfygwlhe(String str, String str2) throws JoseException {
        try {
            str = str == 0 ? KeyAgreement.getInstance(str2) : KeyAgreement.getInstance(str2, str);
            return str;
        } catch (NoSuchAlgorithmException e13) {
            throw new UncheckedJoseException("No " + str2 + " KeyAgreement available.", e13);
        } catch (NoSuchProviderException e14) {
            throw new JoseException("Cannot get " + str2 + " KeyAgreement with provider " + str, e14);
        }
    }

    private byte[] zdlpuopuiu(PrivateKey privateKey, PublicKey publicKey, gl.iobyxmoadg iobyxmoadgVar) {
        return kcexrzcfyt(privateKey, publicKey, iobyxmoadgVar).generateSecret();
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return new ql.ppxfxbqfkf().wkgbmnqykc() && kl.zoijcleaow.iobyxmoadg("KeyAgreement", draadjrbmk());
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws org.jose4j.lang.InvalidKeyException {
        if ((key instanceof ECPublicKey) || iozdgvuglv.wflxmlrfwp(key)) {
            return;
        }
        throw new org.jose4j.lang.InvalidKeyException("Encrypting with ECDH expects ECPublicKey or XECPublicKey but was given " + key);
    }

    btonecajqb iwizpuwonk(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, nl.gtknphoqwx gtknphoqwxVar, gl.iobyxmoadg iobyxmoadgVar) {
        zoijcleaowVar.nufgyqmvbu("epk", gtknphoqwxVar);
        return new btonecajqb(jyumaefscl(dxjokdxxwwVar, zoijcleaowVar, zdlpuopuiu(gtknphoqwxVar.istkbnxepw(), (PublicKey) key, iobyxmoadgVar), iobyxmoadgVar), null);
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        return new SecretKeySpec(jyumaefscl(dxjokdxxwwVar, zoijcleaowVar, lqeggnwhkgVar.ppxfxbqfkf().generateSecret(), iobyxmoadgVar), dxjokdxxwwVar.iobyxmoadg());
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws org.jose4j.lang.InvalidKeyException {
        if ((key instanceof ECPrivateKey) || iozdgvuglv.draadjrbmk(key)) {
            return;
        }
        throw new org.jose4j.lang.InvalidKeyException("Decrypting with ECDH expects ECPrivateKey or XECPrivateKey but was given " + key);
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws org.jose4j.lang.InvalidKeyException {
        PublicKey publicKeyCdpycssgdh = zoijcleaowVar.eablkybsjg("epk", iobyxmoadgVar.iobyxmoadg().wkgbmnqykc()).cdpycssgdh();
        PrivateKey privateKey = (PrivateKey) key;
        if (publicKeyCdpycssgdh instanceof ECPublicKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            vdvldrhtss(eCPrivateKey);
            oxmwwwfdhm((ECPublicKey) publicKeyCdpycssgdh, eCPrivateKey);
        }
        return new kl.lqeggnwhkg(kcexrzcfyt(privateKey, publicKeyCdpycssgdh, iobyxmoadgVar));
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        nl.gtknphoqwx gtknphoqwxVarIobyxmoadg;
        pl.wkgbmnqykc.zoijcleaow(bArr, eablkybsjg());
        String strEablkybsjg = iobyxmoadgVar.iobyxmoadg().eablkybsjg();
        SecureRandom secureRandomZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (key instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            vdvldrhtss(eCPublicKey);
            gtknphoqwxVarIobyxmoadg = nl.iobyxmoadg.iobyxmoadg(eCPublicKey.getParams(), strEablkybsjg, secureRandomZoijcleaow);
        } else {
            if (!iozdgvuglv.wflxmlrfwp(key)) {
                throw new org.jose4j.lang.InvalidKeyException("Inappropriate key for ECDH: " + key);
            }
            gtknphoqwxVarIobyxmoadg = nl.btonecajqb.iobyxmoadg(ojitshcjhn.iobyxmoadg(wflxmlrfwp.iobyxmoadg(key).getParams()).getName(), strEablkybsjg, secureRandomZoijcleaow);
        }
        return iwizpuwonk(key, dxjokdxxwwVar, zoijcleaowVar, gtknphoqwxVarIobyxmoadg, iobyxmoadgVar);
    }

    public vdvldrhtss(String str) {
        this();
        this.f63326gxszxtbevo = str;
    }
}
