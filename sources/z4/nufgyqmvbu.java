package z4;

import androidx.media3.common.ParserException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f127763iobyxmoadg = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
        String strKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
        return strKcexrzcfyt != null && strKcexrzcfyt.startsWith("WEBVTT");
    }

    public static long ppxfxbqfkf(String str) {
        String[] strArrL = stevsuqkhv.l(str, "\\.");
        long j13 = 0;
        for (String str2 : stevsuqkhv.k(strArrL[0], StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j13 = (j13 * 60) + Long.parseLong(str2);
        }
        long j14 = j13 * 1000;
        if (strArrL.length == 2) {
            String strTrim = strArrL[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j14 += Long.parseLong(strTrim);
        }
        return j14 * 1000;
    }

    public static void wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        if (iobyxmoadg(yadqdtsiqtVar)) {
            return;
        }
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        throw ParserException.iobyxmoadg("Expected WEBVTT. Got " + yadqdtsiqtVar.kcexrzcfyt(), null);
    }

    public static float zoijcleaow(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
