package t6;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f109861iobyxmoadg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String eablkybsjg(byte[] bArr, int i13) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        if (i13 > bArr.length) {
            i13 = bArr.length;
        }
        StringBuilder sb3 = new StringBuilder(i13 * 2);
        for (int i14 = 0; i14 < i13; i14++) {
            byte b13 = bArr[i14];
            char[] cArr = f109861iobyxmoadg;
            sb3.append(cArr[(b13 & 255) >>> 4]);
            sb3.append(cArr[b13 & 15]);
        }
        return sb3.toString();
    }

    public static boolean gxszxtbevo(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean iobyxmoadg(CharSequence charSequence) {
        return !gxszxtbevo(charSequence);
    }

    public static String ppxfxbqfkf(String str) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.toUpperCase(Locale.ROOT);
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

    public static String wkgbmnqykc(String str, String str2) {
        return TextUtils.join(StringUtils.PROCESS_POSTFIX_DELIMITER, new LinkedHashSet(Arrays.asList(str.split(str2))));
    }

    public static String zoijcleaow(double d13) {
        return lereixgezr.iobyxmoadg(new BigDecimal(String.format(Locale.ROOT, "%.10f", Double.valueOf(d13)))).toPlainString();
    }
}
