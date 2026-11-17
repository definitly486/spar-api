package org.xbill.DNS;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rhgxfdycjh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Map f74499iobyxmoadg;

    static {
        try {
            zoijcleaow();
        } catch (SecurityException unused) {
        }
    }

    public static boolean iobyxmoadg(String str) {
        Map map = f74499iobyxmoadg;
        return (map == null || map.get(str.toLowerCase()) == null) ? false : true;
    }

    public static void ppxfxbqfkf(String str) {
        if (f74499iobyxmoadg == null) {
            f74499iobyxmoadg = new HashMap();
        }
        f74499iobyxmoadg.put(str.toLowerCase(), "true");
    }

    public static void wkgbmnqykc(String str, String str2) {
        if (f74499iobyxmoadg == null) {
            f74499iobyxmoadg = new HashMap();
        }
        f74499iobyxmoadg.put(str.toLowerCase(), str2.toLowerCase());
    }

    public static void zoijcleaow() {
        String property = System.getProperty("dnsjava.options");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, StringUtils.COMMA);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf == -1) {
                    ppxfxbqfkf(strNextToken);
                } else {
                    wkgbmnqykc(strNextToken.substring(0, iIndexOf), strNextToken.substring(iIndexOf + 1));
                }
            }
        }
    }
}
