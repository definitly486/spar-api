package v2;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ArrayList f115370iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Pattern f115371zoijcleaow = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f115372iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f115373zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f115372iobyxmoadg = i13;
            this.f115373zoijcleaow = i14;
        }

        public int iobyxmoadg() {
            int i13 = this.f115373zoijcleaow;
            if (i13 == 2) {
                return 10;
            }
            if (i13 == 5) {
                return 11;
            }
            if (i13 == 29) {
                return 12;
            }
            if (i13 == 42) {
                return 16;
            }
            if (i13 != 22) {
                return i13 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean agtfadlqog(String str) {
        return "audio".equals(btonecajqb(str));
    }

    private static String btonecajqb(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    private static int draadjrbmk(String str) {
        ArrayList arrayList = f115370iobyxmoadg;
        if (arrayList.size() <= 0) {
            return -1;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList.get(0));
        throw null;
    }

    static iobyxmoadg dxjokdxxww(String str) {
        Matcher matcher = f115371zoijcleaow.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new iobyxmoadg(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String eablkybsjg(String str) {
        ArrayList arrayList = f115370iobyxmoadg;
        if (arrayList.size() <= 0) {
            return null;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList.get(0));
        throw null;
    }

    public static int gtknphoqwx(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (agtfadlqog(str)) {
            return 1;
        }
        if (vdvldrhtss(str)) {
            return 2;
        }
        if (rgvfuqvkyq(str)) {
            return 3;
        }
        if (ojitshcjhn(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return draadjrbmk(str);
    }

    public static int gxszxtbevo(String str, String str2) {
        iobyxmoadg iobyxmoadgVarDxjokdxxww;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (iobyxmoadgVarDxjokdxxww = dxjokdxxww(str2)) == null) {
                    return 0;
                }
                return iobyxmoadgVarDxjokdxxww.iobyxmoadg();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static boolean iobyxmoadg(String str, String str2) {
        iobyxmoadg iobyxmoadgVarDxjokdxxww;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null || (iobyxmoadgVarDxjokdxxww = dxjokdxxww(str2)) == null) {
                    return false;
                }
                int iIobyxmoadg = iobyxmoadgVarDxjokdxxww.iobyxmoadg();
                return (iIobyxmoadg == 0 || iIobyxmoadg == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String lqeggnwhkg(String str) {
        iobyxmoadg iobyxmoadgVarDxjokdxxww;
        String strNufgyqmvbu = null;
        if (str == null) {
            return null;
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str.trim());
        if (strEablkybsjg.startsWith("avc1") || strEablkybsjg.startsWith("avc3")) {
            return "video/avc";
        }
        if (strEablkybsjg.startsWith("hev1") || strEablkybsjg.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strEablkybsjg.startsWith("dvav") || strEablkybsjg.startsWith("dva1") || strEablkybsjg.startsWith("dvhe") || strEablkybsjg.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strEablkybsjg.startsWith("av01")) {
            return "video/av01";
        }
        if (strEablkybsjg.startsWith("vp9") || strEablkybsjg.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strEablkybsjg.startsWith("vp8") || strEablkybsjg.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strEablkybsjg.startsWith("mp4a")) {
            if (strEablkybsjg.startsWith("mp4a.") && (iobyxmoadgVarDxjokdxxww = dxjokdxxww(strEablkybsjg)) != null) {
                strNufgyqmvbu = nufgyqmvbu(iobyxmoadgVarDxjokdxxww.f115372iobyxmoadg);
            }
            return strNufgyqmvbu == null ? "audio/mp4a-latm" : strNufgyqmvbu;
        }
        if (strEablkybsjg.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strEablkybsjg.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strEablkybsjg.startsWith("ac-3") || strEablkybsjg.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strEablkybsjg.startsWith("ec-3") || strEablkybsjg.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strEablkybsjg.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strEablkybsjg.startsWith("ac-4") || strEablkybsjg.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strEablkybsjg.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strEablkybsjg.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strEablkybsjg.startsWith("dtsh") || strEablkybsjg.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strEablkybsjg.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strEablkybsjg.startsWith("opus")) {
            return "audio/opus";
        }
        if (strEablkybsjg.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strEablkybsjg.startsWith("flac")) {
            return "audio/flac";
        }
        if (strEablkybsjg.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strEablkybsjg.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strEablkybsjg.contains("cea708")) {
            return "application/cea-708";
        }
        return (strEablkybsjg.contains("eia608") || strEablkybsjg.contains("cea608")) ? "application/cea-608" : eablkybsjg(strEablkybsjg);
    }

    public static String nufgyqmvbu(int i13) {
        if (i13 == 32) {
            return "video/mp4v-es";
        }
        if (i13 == 33) {
            return "video/avc";
        }
        if (i13 == 35) {
            return "video/hevc";
        }
        if (i13 == 64) {
            return "audio/mp4a-latm";
        }
        if (i13 == 163) {
            return "video/wvc1";
        }
        if (i13 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i13 == 221) {
            return "audio/vorbis";
        }
        if (i13 == 165) {
            return "audio/ac3";
        }
        if (i13 == 166) {
            return "audio/eac3";
        }
        switch (i13) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i13) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean ojitshcjhn(String str) {
        return "image".equals(btonecajqb(str)) || "application/x-image-uri".equals(str);
    }

    public static String oxmwwwfdhm(String str) {
        if (str == null) {
            return null;
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str);
        strEablkybsjg.hashCode();
        switch (strEablkybsjg) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strEablkybsjg;
        }
    }

    public static String ppxfxbqfkf(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : stevsuqkhv.m(str)) {
            String strLqeggnwhkg = lqeggnwhkg(str2);
            if (strLqeggnwhkg != null && agtfadlqog(strLqeggnwhkg)) {
                return strLqeggnwhkg;
            }
        }
        return null;
    }

    public static boolean rgvfuqvkyq(String str) {
        return "text".equals(btonecajqb(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean vdvldrhtss(String str) {
        return "video".equals(btonecajqb(str));
    }

    public static String wflxmlrfwp(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : stevsuqkhv.m(str)) {
            String strLqeggnwhkg = lqeggnwhkg(str2);
            if (strLqeggnwhkg != null && vdvldrhtss(strLqeggnwhkg)) {
                return strLqeggnwhkg;
            }
        }
        return null;
    }

    public static String wkgbmnqykc(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrM = stevsuqkhv.m(str);
        StringBuilder sb3 = new StringBuilder();
        for (String str3 : strArrM) {
            if (str2.equals(lqeggnwhkg(str3))) {
                if (sb3.length() > 0) {
                    sb3.append(StringUtils.COMMA);
                }
                sb3.append(str3);
            }
        }
        if (sb3.length() > 0) {
            return sb3.toString();
        }
        return null;
    }

    public static boolean zoijcleaow(String str, String str2) {
        return wkgbmnqykc(str, str2) != null;
    }
}
