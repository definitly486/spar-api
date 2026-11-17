package ll;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final am.iobyxmoadg f63304iobyxmoadg = am.zoijcleaow.dxjokdxxww(eablkybsjg.class);

    public static boolean iobyxmoadg(String str, int i13) {
        int iIobyxmoadg = rl.iobyxmoadg.iobyxmoadg(i13);
        try {
            int maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength(str);
            boolean z13 = iIobyxmoadg <= maxAllowedKeyLength;
            if (!z13) {
                f63304iobyxmoadg.lqeggnwhkg("max allowed key length for {} is {}", str, Integer.valueOf(maxAllowedKeyLength));
            }
            return z13;
        } catch (NoSuchAlgorithmException e13) {
            f63304iobyxmoadg.lqeggnwhkg("Unknown/unsupported algorithm, {} {}", str, e13);
            return false;
        }
    }
}
