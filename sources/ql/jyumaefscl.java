package ql;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.NamedParameterSpec;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl extends oxmwwwfdhm {
    public jyumaefscl(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public static jyumaefscl lqeggnwhkg(String str, String str2, SecureRandom secureRandom) {
        if (str.equals("Ed25519") || str.equals("Ed448")) {
            return new ojitshcjhn(str2, secureRandom);
        }
        if (str.equals("X25519") || str.equals("X448")) {
            return new iozdgvuglv(str2, secureRandom);
        }
        return null;
    }

    public abstract byte[] btonecajqb(PrivateKey privateKey);

    public abstract PublicKey dxjokdxxww(byte[] bArr, String str);

    public KeyPair eablkybsjg(String str) throws JoseException {
        KeyPairGenerator keyPairGeneratorPpxfxbqfkf = ppxfxbqfkf();
        NamedParameterSpec namedParameterSpecGxszxtbevo = gxszxtbevo(str);
        try {
            SecureRandom secureRandom = this.f79089zoijcleaow;
            if (secureRandom == null) {
                keyPairGeneratorPpxfxbqfkf.initialize(namedParameterSpecGxszxtbevo);
            } else {
                keyPairGeneratorPpxfxbqfkf.initialize(namedParameterSpecGxszxtbevo, secureRandom);
            }
            return keyPairGeneratorPpxfxbqfkf.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e13) {
            throw new JoseException("Unable to create EdDSA key pair: " + e13, e13);
        }
    }

    public abstract byte[] gtknphoqwx(Key key);

    NamedParameterSpec gxszxtbevo(String str) {
        try {
            yggfygwlhe.iobyxmoadg();
            return zdlpuopuiu.iobyxmoadg(str);
        } catch (NoClassDefFoundError e13) {
            throw new JoseException(str + " NamedParameterSpec not available. " + rl.zoijcleaow.iobyxmoadg(e13));
        }
    }

    public abstract PrivateKey nufgyqmvbu(byte[] bArr, String str);
}
