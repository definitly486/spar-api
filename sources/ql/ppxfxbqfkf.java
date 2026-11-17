package ql;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class ppxfxbqfkf extends oxmwwwfdhm {
    public ppxfxbqfkf() {
        this(null, null);
    }

    public KeyPair eablkybsjg(ECParameterSpec eCParameterSpec) throws JoseException {
        KeyPairGenerator keyPairGeneratorPpxfxbqfkf = ppxfxbqfkf();
        try {
            SecureRandom secureRandom = this.f79089zoijcleaow;
            if (secureRandom == null) {
                keyPairGeneratorPpxfxbqfkf.initialize(eCParameterSpec);
            } else {
                keyPairGeneratorPpxfxbqfkf.initialize(eCParameterSpec, secureRandom);
            }
            return keyPairGeneratorPpxfxbqfkf.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e13) {
            throw new JoseException("Unable to create EC key pair. " + e13.getMessage(), e13);
        }
    }

    public ECPrivateKey gxszxtbevo(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws JoseException {
        try {
            return (ECPrivateKey) zoijcleaow().generatePrivate(new ECPrivateKeySpec(bigInteger, eCParameterSpec));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }

    @Override // ql.oxmwwwfdhm
    String iobyxmoadg() {
        return "EC";
    }

    public ECPublicKey lqeggnwhkg(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) throws JoseException {
        try {
            return (ECPublicKey) zoijcleaow().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), eCParameterSpec));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }

    @Override // ql.oxmwwwfdhm
    public /* bridge */ /* synthetic */ boolean wkgbmnqykc() {
        return super.wkgbmnqykc();
    }

    public ppxfxbqfkf(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }
}
