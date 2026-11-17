package pl;

import java.security.Key;
import java.security.interfaces.RSAKey;
import org.jose4j.lang.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static void eablkybsjg(Key key, String str, int i13) throws InvalidKeyException {
        int length;
        wkgbmnqykc(key);
        String algorithm = key.getAlgorithm();
        if (!"AES".equals(algorithm)) {
            throw new InvalidKeyException("Invalid key for JWE " + str + ", expected an AES key but an " + algorithm + " key was provided.");
        }
        if (key.getEncoded() == null || (length = key.getEncoded().length) == i13) {
            return;
        }
        throw new InvalidKeyException("Invalid key for JWE " + str + ", expected a " + rl.iobyxmoadg.iobyxmoadg(i13) + " bit key but a " + rl.iobyxmoadg.iobyxmoadg(length) + " bit key was provided.");
    }

    public static Key iobyxmoadg(Key key, Class cls) throws InvalidKeyException {
        wkgbmnqykc(key);
        try {
            return (Key) cls.cast(key);
        } catch (ClassCastException e13) {
            throw new InvalidKeyException("Invalid key " + e13);
        }
    }

    public static void ppxfxbqfkf(Key key) throws InvalidKeyException {
        int iBitLength;
        if (key == null) {
            throw new InvalidKeyException("The RSA key must not be null.");
        }
        if (!(key instanceof RSAKey) || (iBitLength = ((RSAKey) key).getModulus().bitLength()) >= 2048) {
            return;
        }
        throw new InvalidKeyException("An RSA key of size 2048 bits or larger MUST be used with the all JOSE RSA algorithms (given key was only " + iBitLength + " bits).");
    }

    public static void wkgbmnqykc(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("The key must not be null.");
        }
    }

    public static void zoijcleaow(byte[] bArr, String str) throws InvalidKeyException {
        if (bArr == null) {
            return;
        }
        throw new InvalidKeyException("An explicit content encryption key cannot be used with " + str);
    }
}
