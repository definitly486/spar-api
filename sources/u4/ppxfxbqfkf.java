package u4;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.gxszxtbevo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final int f112605btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final boolean f112606dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final float f112607eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final boolean f112608gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f112609iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final boolean f112610lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final boolean f112611nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Integer f112612ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Integer f112613wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f112614zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final int f112615btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final int f112616dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f112617eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public final int f112618gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f112619gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f112620iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f112621lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final int f112622nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f112623ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f112624wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f112625zoijcleaow;

        private iobyxmoadg(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25, int i26) {
            this.f112620iobyxmoadg = i13;
            this.f112625zoijcleaow = i14;
            this.f112623ppxfxbqfkf = i15;
            this.f112624wkgbmnqykc = i16;
            this.f112617eablkybsjg = i17;
            this.f112619gxszxtbevo = i18;
            this.f112621lqeggnwhkg = i19;
            this.f112622nufgyqmvbu = i23;
            this.f112616dxjokdxxww = i24;
            this.f112615btonecajqb = i25;
            this.f112618gtknphoqwx = i26;
        }

        public static iobyxmoadg iobyxmoadg(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < strArrSplit.length; i26++) {
                String strEablkybsjg = xa.zoijcleaow.eablkybsjg(strArrSplit[i26].trim());
                strEablkybsjg.hashCode();
                switch (strEablkybsjg) {
                    case "italic":
                        i19 = i26;
                        break;
                    case "underline":
                        i23 = i26;
                        break;
                    case "strikeout":
                        i24 = i26;
                        break;
                    case "primarycolour":
                        i15 = i26;
                        break;
                    case "bold":
                        i18 = i26;
                        break;
                    case "name":
                        i13 = i26;
                        break;
                    case "fontsize":
                        i17 = i26;
                        break;
                    case "borderstyle":
                        i25 = i26;
                        break;
                    case "alignment":
                        i14 = i26;
                        break;
                    case "outlinecolour":
                        i16 = i26;
                        break;
                }
            }
            if (i13 != -1) {
                return new iobyxmoadg(i13, i14, i15, i16, i17, i18, i19, i23, i24, i25, strArrSplit.length);
            }
            return null;
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f112630iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final PointF f112631zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Pattern f112628ppxfxbqfkf = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Pattern f112629wkgbmnqykc = Pattern.compile(stevsuqkhv.iozdgvuglv("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final Pattern f112626eablkybsjg = Pattern.compile(stevsuqkhv.iozdgvuglv("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final Pattern f112627gxszxtbevo = Pattern.compile("\\\\an(\\d+)");

        private zoijcleaow(int i13, PointF pointF) {
            this.f112630iobyxmoadg = i13;
            this.f112631zoijcleaow = pointF;
        }

        private static int iobyxmoadg(String str) {
            Matcher matcher = f112627gxszxtbevo.matcher(str);
            if (matcher.find()) {
                return ppxfxbqfkf.eablkybsjg((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
            }
            return -1;
        }

        private static PointF ppxfxbqfkf(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f112629wkgbmnqykc.matcher(str);
            Matcher matcher2 = f112626eablkybsjg.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    kcexrzcfyt.gxszxtbevo("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) y2.iobyxmoadg.eablkybsjg(strGroup)).trim()), Float.parseFloat(((String) y2.iobyxmoadg.eablkybsjg(strGroup2)).trim()));
        }

        public static String wkgbmnqykc(String str) {
            return f112628ppxfxbqfkf.matcher(str).replaceAll("");
        }

        public static zoijcleaow zoijcleaow(String str) {
            Matcher matcher = f112628ppxfxbqfkf.matcher(str);
            PointF pointF = null;
            int i13 = -1;
            while (matcher.find()) {
                String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(1));
                try {
                    PointF pointFPpxfxbqfkf = ppxfxbqfkf(str2);
                    if (pointFPpxfxbqfkf != null) {
                        pointF = pointFPpxfxbqfkf;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iIobyxmoadg = iobyxmoadg(str2);
                    if (iIobyxmoadg != -1) {
                        i13 = iIobyxmoadg;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new zoijcleaow(i13, pointF);
        }
    }

    private ppxfxbqfkf(String str, int i13, Integer num, Integer num2, float f13, boolean z13, boolean z14, boolean z15, boolean z16, int i14) {
        this.f112609iobyxmoadg = str;
        this.f112614zoijcleaow = i13;
        this.f112612ppxfxbqfkf = num;
        this.f112613wkgbmnqykc = num2;
        this.f112607eablkybsjg = f13;
        this.f112608gxszxtbevo = z13;
        this.f112610lqeggnwhkg = z14;
        this.f112611nufgyqmvbu = z15;
        this.f112606dxjokdxxww = z16;
        this.f112605btonecajqb = i14;
    }

    private static float dxjokdxxww(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e13) {
            kcexrzcfyt.dxjokdxxww("SsaStyle", "Failed to parse font size: '" + str + "'", e13);
            return -3.4028235E38f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int eablkybsjg(String str) {
        try {
            int i13 = Integer.parseInt(str.trim());
            if (ppxfxbqfkf(i13)) {
                return i13;
            }
        } catch (NumberFormatException unused) {
        }
        kcexrzcfyt.nufgyqmvbu("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean gxszxtbevo(String str) {
        try {
            int i13 = Integer.parseInt(str);
            return i13 == 1 || i13 == -1;
        } catch (NumberFormatException e13) {
            kcexrzcfyt.dxjokdxxww("SsaStyle", "Failed to parse boolean value: '" + str + "'", e13);
            return false;
        }
    }

    private static int lqeggnwhkg(String str) {
        try {
            int i13 = Integer.parseInt(str.trim());
            if (wkgbmnqykc(i13)) {
                return i13;
            }
        } catch (NumberFormatException unused) {
        }
        kcexrzcfyt.nufgyqmvbu("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer nufgyqmvbu(String str) {
        try {
            long j13 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            y2.iobyxmoadg.iobyxmoadg(j13 <= 4294967295L);
            return Integer.valueOf(Color.argb(gxszxtbevo.wkgbmnqykc(((j13 >> 24) & 255) ^ 255), gxszxtbevo.wkgbmnqykc(j13 & 255), gxszxtbevo.wkgbmnqykc((j13 >> 8) & 255), gxszxtbevo.wkgbmnqykc((j13 >> 16) & 255)));
        } catch (IllegalArgumentException e13) {
            kcexrzcfyt.dxjokdxxww("SsaStyle", "Failed to parse color expression: '" + str + "'", e13);
            return null;
        }
    }

    private static boolean ppxfxbqfkf(int i13) {
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean wkgbmnqykc(int i13) {
        return i13 == 1 || i13 == 3;
    }

    public static ppxfxbqfkf zoijcleaow(String str, iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.iobyxmoadg(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i13 = iobyxmoadgVar.f112618gtknphoqwx;
        if (length != i13) {
            kcexrzcfyt.nufgyqmvbu("SsaStyle", stevsuqkhv.iozdgvuglv("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i13), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[iobyxmoadgVar.f112620iobyxmoadg].trim();
            int i14 = iobyxmoadgVar.f112625zoijcleaow;
            int iEablkybsjg = i14 != -1 ? eablkybsjg(strArrSplit[i14].trim()) : -1;
            int i15 = iobyxmoadgVar.f112623ppxfxbqfkf;
            Integer numNufgyqmvbu = i15 != -1 ? nufgyqmvbu(strArrSplit[i15].trim()) : null;
            int i16 = iobyxmoadgVar.f112624wkgbmnqykc;
            Integer numNufgyqmvbu2 = i16 != -1 ? nufgyqmvbu(strArrSplit[i16].trim()) : null;
            int i17 = iobyxmoadgVar.f112617eablkybsjg;
            float fDxjokdxxww = i17 != -1 ? dxjokdxxww(strArrSplit[i17].trim()) : -3.4028235E38f;
            int i18 = iobyxmoadgVar.f112619gxszxtbevo;
            boolean z13 = i18 != -1 && gxszxtbevo(strArrSplit[i18].trim());
            int i19 = iobyxmoadgVar.f112621lqeggnwhkg;
            boolean z14 = i19 != -1 && gxszxtbevo(strArrSplit[i19].trim());
            int i23 = iobyxmoadgVar.f112622nufgyqmvbu;
            boolean z15 = i23 != -1 && gxszxtbevo(strArrSplit[i23].trim());
            int i24 = iobyxmoadgVar.f112616dxjokdxxww;
            boolean z16 = i24 != -1 && gxszxtbevo(strArrSplit[i24].trim());
            int i25 = iobyxmoadgVar.f112615btonecajqb;
            return new ppxfxbqfkf(strTrim, iEablkybsjg, numNufgyqmvbu, numNufgyqmvbu2, fDxjokdxxww, z13, z14, z15, z16, i25 != -1 ? lqeggnwhkg(strArrSplit[i25].trim()) : -1);
        } catch (RuntimeException e13) {
            kcexrzcfyt.dxjokdxxww("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e13);
            return null;
        }
    }
}
