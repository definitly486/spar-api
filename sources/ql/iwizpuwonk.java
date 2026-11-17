package ql;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class iwizpuwonk extends oxmwwwfdhm {
    public iwizpuwonk(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public RSAPrivateKey eablkybsjg(RSAPrivateKeySpec rSAPrivateKeySpec) throws JoseException {
        try {
            return (RSAPrivateKey) zoijcleaow().generatePrivate(rSAPrivateKeySpec);
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }

    public RSAPrivateKey gxszxtbevo(BigInteger bigInteger, BigInteger bigInteger2) {
        return eablkybsjg(new RSAPrivateKeySpec(bigInteger, bigInteger2));
    }

    @Override // ql.oxmwwwfdhm
    String iobyxmoadg() {
        return "RSA";
    }

    public RSAPrivateKey lqeggnwhkg(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        return eablkybsjg(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8));
    }

    public RSAPublicKey nufgyqmvbu(BigInteger bigInteger, BigInteger bigInteger2) throws JoseException {
        try {
            return (RSAPublicKey) zoijcleaow().generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }
}
