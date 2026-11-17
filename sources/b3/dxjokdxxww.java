package b3;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f15036iobyxmoadg = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Pattern f15037zoijcleaow = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String iobyxmoadg(long j13, long j14) {
        if (j13 == 0 && j14 == -1) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("bytes=");
        sb3.append(j13);
        sb3.append("-");
        if (j14 != -1) {
            sb3.append((j13 + j14) - 1);
        }
        return sb3.toString();
    }

    public static long ppxfxbqfkf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f15037zoijcleaow.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
        }
        return -1L;
    }

    public static long zoijcleaow(String str, String str2) {
        long j13;
        if (TextUtils.isEmpty(str)) {
            j13 = -1;
        } else {
            try {
                j13 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                kcexrzcfyt.ppxfxbqfkf("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j13 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j13;
        }
        Matcher matcher = f15036iobyxmoadg.matcher(str2);
        if (!matcher.matches()) {
            return j13;
        }
        try {
            long j14 = (Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))) - Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)))) + 1;
            if (j13 < 0) {
                return j14;
            }
            if (j13 == j14) {
                return j13;
            }
            kcexrzcfyt.nufgyqmvbu("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j13, j14);
        } catch (NumberFormatException unused2) {
            kcexrzcfyt.ppxfxbqfkf("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j13;
        }
    }
}
