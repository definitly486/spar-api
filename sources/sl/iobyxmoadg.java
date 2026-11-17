package sl;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Mac;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static Mac iobyxmoadg(String str, Key key, String str2) throws JoseException {
        Mac macZoijcleaow = zoijcleaow(str, str2);
        ppxfxbqfkf(macZoijcleaow, key);
        return macZoijcleaow;
    }

    public static void ppxfxbqfkf(Mac mac, Key key) throws InvalidKeyException {
        try {
            mac.init(key);
        } catch (java.security.InvalidKeyException e13) {
            throw new InvalidKeyException("Key is not valid for " + mac.getAlgorithm() + " - " + e13, e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7, types: [javax.crypto.Mac] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static Mac zoijcleaow(String str, String str2) throws JoseException {
        try {
            str = str2 == null ? Mac.getInstance(str) : Mac.getInstance(str, str2);
            return str;
        } catch (NoSuchAlgorithmException e13) {
            throw new JoseException("Unable to get a MAC implementation of algorithm name: " + str, e13);
        } catch (NoSuchProviderException e14) {
            throw new JoseException("Unable to get a MAC implementation of algorithm name: " + str + " using provider " + str2, e14);
        }
    }
}
