package ll;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [javax.crypto.Cipher] */
    static Cipher iobyxmoadg(String str, String str2) throws JoseException {
        try {
            str = str2 == null ? Cipher.getInstance(str) : Cipher.getInstance(str, str2);
            return str;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new JoseException(e.toString(), e);
        } catch (NoSuchProviderException e14) {
            throw new JoseException("Unable to get a Cipher implementation of " + str + " using provider " + str2, e14);
        } catch (NoSuchPaddingException e15) {
            e = e15;
            throw new JoseException(e.toString(), e);
        }
    }
}
