package nc2;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import t6.pmvmpeiblj;

/* JADX INFO: loaded from: classes6.dex */
abstract class zoijcleaow {
    static String iobyxmoadg(String str, String str2) {
        try {
            byte[] bArrZoijcleaow = zoijcleaow(str2.getBytes(), str.getBytes());
            if (bArrZoijcleaow != null) {
                return pmvmpeiblj.eablkybsjg(bArrZoijcleaow, bArrZoijcleaow.length).toLowerCase(Locale.ROOT);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(bArr2);
    }
}
