package rl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import org.jose4j.lang.UncheckedJoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static MessageDigest iobyxmoadg(String str, String str2) {
        try {
            str = str2 == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, str2);
            return str;
        } catch (NoSuchAlgorithmException unused) {
            throw new UncheckedJoseException("Unable to get MessageDigest instance with " + str);
        } catch (NoSuchProviderException e13) {
            throw new UncheckedJoseException("Unable to get a MessageDigest implementation of algorithm name: " + str + " using provider " + str2, e13);
        }
    }
}
