package w4;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q4.dxjokdxxww;
import q4.oxmwwwfdhm;
import y2.gtknphoqwx;
import y2.kcexrzcfyt;
import y2.kegysxyocb;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final XmlPullParserFactory f118707iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Pattern f118706zoijcleaow = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f118704ppxfxbqfkf = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f118705wkgbmnqykc = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final Pattern f118700eablkybsjg = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final Pattern f118701gxszxtbevo = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Pattern f118702lqeggnwhkg = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Pattern f118703nufgyqmvbu = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final iobyxmoadg f118699dxjokdxxww = new iobyxmoadg(30.0f, 1, 1);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final float f118708iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final int f118709ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f118710zoijcleaow;

        iobyxmoadg(float f13, int i13, int i14) {
            this.f118708iobyxmoadg = f13;
            this.f118710zoijcleaow = i13;
            this.f118709ppxfxbqfkf = i14;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f118711iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f118712zoijcleaow;

        zoijcleaow(int i13, int i14) {
            this.f118711iobyxmoadg = i13;
            this.f118712zoijcleaow = i14;
        }
    }

    public wkgbmnqykc() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f118707iobyxmoadg = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e13) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x0239  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static eablkybsjg agtfadlqog(XmlPullParser xmlPullParser, int i13, zoijcleaow zoijcleaowVar, Map map) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i14;
        int i15;
        float f18;
        String strIobyxmoadg;
        lqeggnwhkg lqeggnwhkgVar;
        String strIobyxmoadg2;
        lqeggnwhkg lqeggnwhkgVar2;
        int i16 = 1;
        String strIobyxmoadg3 = kegysxyocb.iobyxmoadg(xmlPullParser, "id");
        if (strIobyxmoadg3 == null) {
            return null;
        }
        String strIobyxmoadg4 = kegysxyocb.iobyxmoadg(xmlPullParser, ClientData.KEY_ORIGIN);
        if (strIobyxmoadg4 == null && (strIobyxmoadg2 = kegysxyocb.iobyxmoadg(xmlPullParser, "style")) != null && (lqeggnwhkgVar2 = (lqeggnwhkg) map.get(strIobyxmoadg2)) != null) {
            strIobyxmoadg4 = lqeggnwhkgVar2.btonecajqb();
        }
        if (strIobyxmoadg4 != null) {
            Matcher matcher = f118701gxszxtbevo.matcher(strIobyxmoadg4);
            Matcher matcher2 = f118702lqeggnwhkg.matcher(strIobyxmoadg4);
            if (matcher.matches()) {
                try {
                    f14 = Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))) / 100.0f;
                    f13 = Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with malformed origin: " + strIobyxmoadg4);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with unsupported origin: " + strIobyxmoadg4);
                    return null;
                }
                if (zoijcleaowVar == null) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with missing tts:extent: " + strIobyxmoadg4);
                    return null;
                }
                try {
                    int i17 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher2.group(1)));
                    int i18 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher2.group(2)));
                    float f19 = i17 / zoijcleaowVar.f118711iobyxmoadg;
                    f13 = i18 / zoijcleaowVar.f118712zoijcleaow;
                    f14 = f19;
                } catch (NumberFormatException unused2) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with malformed origin: " + strIobyxmoadg4);
                    return null;
                }
            }
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        String strIobyxmoadg5 = kegysxyocb.iobyxmoadg(xmlPullParser, "extent");
        if (strIobyxmoadg5 == null && (strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, "style")) != null && (lqeggnwhkgVar = (lqeggnwhkg) map.get(strIobyxmoadg)) != null) {
            strIobyxmoadg5 = lqeggnwhkgVar.ppxfxbqfkf();
        }
        if (strIobyxmoadg5 != null) {
            Matcher matcher3 = f118701gxszxtbevo.matcher(strIobyxmoadg5);
            Matcher matcher4 = f118702lqeggnwhkg.matcher(strIobyxmoadg5);
            if (matcher3.matches()) {
                try {
                    f18 = Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher3.group(1))) / 100.0f;
                    f15 = Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with malformed extent: " + strIobyxmoadg4);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with unsupported extent: " + strIobyxmoadg4);
                    return null;
                }
                if (zoijcleaowVar == null) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with missing tts:extent: " + strIobyxmoadg4);
                    return null;
                }
                try {
                    int i19 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher4.group(1)));
                    int i23 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher4.group(2)));
                    float f23 = i19 / zoijcleaowVar.f118711iobyxmoadg;
                    f15 = i23 / zoijcleaowVar.f118712zoijcleaow;
                    f18 = f23;
                } catch (NumberFormatException unused4) {
                    kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring region with malformed extent: " + strIobyxmoadg4);
                    return null;
                }
            }
            f16 = f18;
        } else {
            f15 = 1.0f;
            f16 = 1.0f;
        }
        String strIobyxmoadg6 = kegysxyocb.iobyxmoadg(xmlPullParser, "displayAlign");
        if (strIobyxmoadg6 != null) {
            String strEablkybsjg = xa.zoijcleaow.eablkybsjg(strIobyxmoadg6);
            strEablkybsjg.hashCode();
            if (strEablkybsjg.equals("center")) {
                f17 = f13 + (f15 / 2.0f);
                i14 = 1;
            } else if (strEablkybsjg.equals("after")) {
                f17 = f13 + f15;
                i14 = 2;
            } else {
                f17 = f13;
                i14 = 0;
            }
        } else {
            f17 = f13;
            i14 = 0;
        }
        float f24 = 1.0f / i13;
        String strIobyxmoadg7 = kegysxyocb.iobyxmoadg(xmlPullParser, "writingMode");
        if (strIobyxmoadg7 != null) {
            String strEablkybsjg2 = xa.zoijcleaow.eablkybsjg(strIobyxmoadg7);
            strEablkybsjg2.hashCode();
            byte b13 = -1;
            switch (strEablkybsjg2.hashCode()) {
                case 3694:
                    if (strEablkybsjg2.equals("tb")) {
                        b13 = 0;
                    }
                    break;
                case 3553396:
                    if (strEablkybsjg2.equals("tblr")) {
                        b13 = 1;
                    }
                    break;
                case 3553576:
                    if (strEablkybsjg2.equals("tbrl")) {
                        b13 = 2;
                    }
                    break;
            }
            switch (b13) {
                case 0:
                case 1:
                    i15 = 2;
                    break;
                default:
                    i16 = Integer.MIN_VALUE;
                case 2:
                    i15 = i16;
                    break;
            }
        } else {
            i16 = Integer.MIN_VALUE;
            i15 = i16;
        }
        return new eablkybsjg(strIobyxmoadg3, f14, f17, 0, i14, f16, f15, 1, f24, i15);
    }

    private static iobyxmoadg btonecajqb(XmlPullParser xmlPullParser) {
        float f13;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i13 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrK = stevsuqkhv.k(attributeValue2, " ");
            y2.iobyxmoadg.zoijcleaow(strArrK.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f13 = Integer.parseInt(strArrK[0]) / Integer.parseInt(strArrK[1]);
        } else {
            f13 = 1.0f;
        }
        iobyxmoadg iobyxmoadgVar = f118699dxjokdxxww;
        int i14 = iobyxmoadgVar.f118710zoijcleaow;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i14 = Integer.parseInt(attributeValue3);
        }
        int i15 = iobyxmoadgVar.f118709ppxfxbqfkf;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i15 = Integer.parseInt(attributeValue4);
        }
        return new iobyxmoadg(i13 * f13, i14, i15);
    }

    private static void draadjrbmk(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strIobyxmoadg;
        do {
            xmlPullParser.next();
            if (kegysxyocb.eablkybsjg(xmlPullParser, "image") && (strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, "id")) != null) {
                map.put(strIobyxmoadg, xmlPullParser.nextText());
            }
        } while (!kegysxyocb.ppxfxbqfkf(xmlPullParser, "metadata"));
    }

    private static void dxjokdxxww(String str, lqeggnwhkg lqeggnwhkgVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrK = stevsuqkhv.k(str, "\\s+");
        if (strArrK.length == 1) {
            matcher = f118705wkgbmnqykc.matcher(str);
        } else {
            if (strArrK.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrK.length + ".");
            }
            matcher = f118705wkgbmnqykc.matcher(strArrK[1]);
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                lqeggnwhkgVar.istkbnxepw(3);
                break;
            case "em":
                lqeggnwhkgVar.istkbnxepw(2);
                break;
            case "px":
                lqeggnwhkgVar.istkbnxepw(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        lqeggnwhkgVar.zynmafqrjb(Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))));
    }

    private static lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar == null ? new lqeggnwhkg() : lqeggnwhkgVar;
    }

    private static Map gtknphoqwx(XmlPullParser xmlPullParser, Map map, int i13, zoijcleaow zoijcleaowVar, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (kegysxyocb.eablkybsjg(xmlPullParser, "style")) {
                String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, "style");
                lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(xmlPullParser, new lqeggnwhkg());
                if (strIobyxmoadg != null) {
                    for (String str : vdvldrhtss(strIobyxmoadg)) {
                        lqeggnwhkgVarRgvfuqvkyq.iobyxmoadg((lqeggnwhkg) map.get(str));
                    }
                }
                String strNufgyqmvbu = lqeggnwhkgVarRgvfuqvkyq.nufgyqmvbu();
                if (strNufgyqmvbu != null) {
                    map.put(strNufgyqmvbu, lqeggnwhkgVarRgvfuqvkyq);
                }
            } else if (kegysxyocb.eablkybsjg(xmlPullParser, "region")) {
                eablkybsjg eablkybsjgVarAgtfadlqog = agtfadlqog(xmlPullParser, i13, zoijcleaowVar, map);
                if (eablkybsjgVarAgtfadlqog != null) {
                    map2.put(eablkybsjgVarAgtfadlqog.f118654iobyxmoadg, eablkybsjgVarAgtfadlqog);
                }
            } else if (kegysxyocb.eablkybsjg(xmlPullParser, "metadata")) {
                draadjrbmk(xmlPullParser, map3);
            }
        } while (!kegysxyocb.ppxfxbqfkf(xmlPullParser, "head"));
        return map;
    }

    private static boolean gxszxtbevo(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static zoijcleaow kcexrzcfyt(XmlPullParser xmlPullParser) {
        String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, "extent");
        if (strIobyxmoadg == null) {
            return null;
        }
        Matcher matcher = f118702lqeggnwhkg.matcher(strIobyxmoadg);
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring non-pixel tts extent: " + strIobyxmoadg);
            return null;
        }
        try {
            return new zoijcleaow(Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))), Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))));
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring malformed tts extent: " + strIobyxmoadg);
            return null;
        }
    }

    private static Layout.Alignment lqeggnwhkg(String str) {
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str);
        strEablkybsjg.hashCode();
        switch (strEablkybsjg) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int nufgyqmvbu(XmlPullParser xmlPullParser, int i13) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i13;
        }
        Matcher matcher = f118703nufgyqmvbu.matcher(attributeValue);
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i13;
        }
        boolean z13 = true;
        try {
            int i14 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
            int i15 = Integer.parseInt((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2)));
            if (i14 == 0 || i15 == 0) {
                z13 = false;
            }
            y2.iobyxmoadg.zoijcleaow(z13, "Invalid cell resolution " + i14 + " " + i15);
            return i15;
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i13;
        }
    }

    private static float ojitshcjhn(String str) {
        Matcher matcher = f118700eablkybsjg.matcher(str);
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)))));
        } catch (NumberFormatException e13) {
            kcexrzcfyt.dxjokdxxww("TtmlParser", "Failed to parse shear: " + str, e13);
            return Float.MAX_VALUE;
        }
    }

    private static long oxmwwwfdhm(String str, iobyxmoadg iobyxmoadgVar) throws SubtitleDecoderException {
        double d13;
        double d14;
        byte b13 = 4;
        Matcher matcher = f118706zoijcleaow.matcher(str);
        if (matcher.matches()) {
            double d15 = (Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))) * 3600) + (Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2))) * 60) + Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d16 = d15 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d17 = d16 + (strGroup2 != null ? Long.parseLong(strGroup2) / iobyxmoadgVar.f118708iobyxmoadg : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d17 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) iobyxmoadgVar.f118710zoijcleaow)) / ((double) iobyxmoadgVar.f118708iobyxmoadg) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f118704ppxfxbqfkf.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d18 = Double.parseDouble((String) y2.iobyxmoadg.eablkybsjg(matcher2.group(1)));
        String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher2.group(2));
        str2.hashCode();
        switch (str2.hashCode()) {
            case 102:
                b13 = !str2.equals("f") ? (byte) -1 : (byte) 0;
                break;
            case 104:
                b13 = !str2.equals("h") ? (byte) -1 : (byte) 1;
                break;
            case 109:
                b13 = !str2.equals("m") ? (byte) -1 : (byte) 2;
                break;
            case 116:
                b13 = !str2.equals("t") ? (byte) -1 : (byte) 3;
                break;
            case 3494:
                if (!str2.equals("ms")) {
                    b13 = -1;
                }
                break;
            default:
                b13 = -1;
                break;
        }
        switch (b13) {
            case 0:
                d13 = iobyxmoadgVar.f118708iobyxmoadg;
                d18 /= d13;
                return (long) (d18 * 1000000.0d);
            case 1:
                d14 = 3600.0d;
                break;
            case 2:
                d14 = 60.0d;
                break;
            case 3:
                d13 = iobyxmoadgVar.f118709ppxfxbqfkf;
                d18 /= d13;
                return (long) (d18 * 1000000.0d);
            case 4:
                d13 = 1000.0d;
                d18 /= d13;
                return (long) (d18 * 1000000.0d);
            default:
                return (long) (d18 * 1000000.0d);
        }
        d18 *= d14;
        return (long) (d18 * 1000000.0d);
    }

    private static lqeggnwhkg rgvfuqvkyq(XmlPullParser xmlPullParser, lqeggnwhkg lqeggnwhkgVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            String attributeName = xmlPullParser.getAttributeName(i13);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).yadqdtsiqt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).esjtqupxsv(attributeValue);
                    break;
                case "fontFamily":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).pmvmpeiblj(attributeValue);
                    break;
                case "textAlign":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).jpowsppfya(lqeggnwhkg(attributeValue));
                    break;
                case "origin":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).wwaezpbzkn(attributeValue);
                    break;
                case "textDecoration":
                    String strEablkybsjg = xa.zoijcleaow.eablkybsjg(attributeValue);
                    strEablkybsjg.hashCode();
                    switch (strEablkybsjg) {
                        case "nounderline":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).dsvhmnatus(false);
                            break;
                        case "underline":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).dsvhmnatus(true);
                            break;
                        case "nolinethrough":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).iozdgvuglv(false);
                            break;
                        case "linethrough":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).iozdgvuglv(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).cqumvgiudr("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).cdpycssgdh(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strEablkybsjg2 = xa.zoijcleaow.eablkybsjg(attributeValue);
                    strEablkybsjg2.hashCode();
                    switch (strEablkybsjg2) {
                        case "baseContainer":
                        case "base":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).pkzmftpjix(2);
                            break;
                        case "container":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).pkzmftpjix(1);
                            break;
                        case "delimiter":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).pkzmftpjix(4);
                            break;
                        case "textContainer":
                        case "text":
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).pkzmftpjix(3);
                            break;
                    }
                    break;
                case "color":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar);
                    try {
                        lqeggnwhkgVar.lereixgezr(gtknphoqwx.ppxfxbqfkf(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        kcexrzcfyt.nufgyqmvbu("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).hcddaimhww(ojitshcjhn(attributeValue));
                    break;
                case "textCombine":
                    String strEablkybsjg3 = xa.zoijcleaow.eablkybsjg(attributeValue);
                    strEablkybsjg3.hashCode();
                    if (!strEablkybsjg3.equals("all")) {
                        if (strEablkybsjg3.equals(DevicePublicKeyStringDef.NONE)) {
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).hkdspvbjdz(false);
                        }
                        break;
                    } else {
                        lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).hkdspvbjdz(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar);
                        dxjokdxxww(attributeValue, lqeggnwhkgVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        kcexrzcfyt.nufgyqmvbu("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).cllcsxoeiz(w4.zoijcleaow.iobyxmoadg(attributeValue));
                    break;
                case "rubyPosition":
                    String strEablkybsjg4 = xa.zoijcleaow.eablkybsjg(attributeValue);
                    strEablkybsjg4.hashCode();
                    if (!strEablkybsjg4.equals("before")) {
                        if (strEablkybsjg4.equals("after")) {
                            lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).ylkuphrtab(2);
                        }
                        break;
                    } else {
                        lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).ylkuphrtab(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar);
                    try {
                        lqeggnwhkgVar.iwizpuwonk(gtknphoqwx.ppxfxbqfkf(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        kcexrzcfyt.nufgyqmvbu("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    lqeggnwhkgVar = eablkybsjg(lqeggnwhkgVar).lmojexxdyd(lqeggnwhkg(attributeValue));
                    break;
            }
        }
        return lqeggnwhkgVar;
    }

    private static String[] vdvldrhtss(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : stevsuqkhv.k(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    private static ppxfxbqfkf wflxmlrfwp(XmlPullParser xmlPullParser, ppxfxbqfkf ppxfxbqfkfVar, Map map, iobyxmoadg iobyxmoadgVar) throws SubtitleDecoderException {
        long j13;
        long j14;
        int attributeCount = xmlPullParser.getAttributeCount();
        lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jOxmwwwfdhm = -9223372036854775807L;
        long jOxmwwwfdhm2 = -9223372036854775807L;
        long jOxmwwwfdhm3 = -9223372036854775807L;
        String[] strArr = null;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jOxmwwwfdhm3 = oxmwwwfdhm(attributeValue, iobyxmoadgVar);
                    break;
                case "end":
                    jOxmwwwfdhm2 = oxmwwwfdhm(attributeValue, iobyxmoadgVar);
                    break;
                case "begin":
                    jOxmwwwfdhm = oxmwwwfdhm(attributeValue, iobyxmoadgVar);
                    break;
                case "style":
                    String[] strArrVdvldrhtss = vdvldrhtss(attributeValue);
                    if (strArrVdvldrhtss.length > 0) {
                        strArr = strArrVdvldrhtss;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ppxfxbqfkfVar != null) {
            long j15 = ppxfxbqfkfVar.f118697wkgbmnqykc;
            j13 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (jOxmwwwfdhm != -9223372036854775807L) {
                    jOxmwwwfdhm += j15;
                }
                if (jOxmwwwfdhm2 != -9223372036854775807L) {
                    jOxmwwwfdhm2 += j15;
                }
            }
        } else {
            j13 = -9223372036854775807L;
        }
        long j16 = jOxmwwwfdhm;
        if (jOxmwwwfdhm2 != j13) {
            j14 = jOxmwwwfdhm2;
        } else if (jOxmwwwfdhm3 != j13) {
            j14 = j16 + jOxmwwwfdhm3;
        } else if (ppxfxbqfkfVar != null) {
            long j17 = ppxfxbqfkfVar.f118689eablkybsjg;
            if (j17 != j13) {
                j14 = j17;
            } else {
                j14 = jOxmwwwfdhm2;
            }
        } else {
            j14 = jOxmwwwfdhm2;
        }
        return ppxfxbqfkf.ppxfxbqfkf(xmlPullParser.getName(), j16, j14, lqeggnwhkgVarRgvfuqvkyq, strArr, str, strSubstring, ppxfxbqfkfVar);
    }

    @Override // q4.oxmwwwfdhm
    public q4.gtknphoqwx iobyxmoadg(byte[] bArr, int i13, int i14) {
        char c13;
        iobyxmoadg iobyxmoadgVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f118707iobyxmoadg.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new eablkybsjg(""));
            zoijcleaow zoijcleaowVarKcexrzcfyt = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i13, i14), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            iobyxmoadg iobyxmoadgVarBtonecajqb = f118699dxjokdxxww;
            nufgyqmvbu nufgyqmvbuVar = null;
            int i15 = 0;
            int iNufgyqmvbu = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) arrayDeque.peek();
                if (i15 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            iobyxmoadgVarBtonecajqb = btonecajqb(xmlPullParserNewPullParser);
                            c13 = 15;
                            iNufgyqmvbu = nufgyqmvbu(xmlPullParserNewPullParser, 15);
                            zoijcleaowVarKcexrzcfyt = kcexrzcfyt(xmlPullParserNewPullParser);
                        } else {
                            c13 = 15;
                        }
                        zoijcleaow zoijcleaowVar = zoijcleaowVarKcexrzcfyt;
                        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVarBtonecajqb;
                        int i16 = iNufgyqmvbu;
                        if (gxszxtbevo(name)) {
                            if ("head".equals(name)) {
                                iobyxmoadgVar = iobyxmoadgVar2;
                                gtknphoqwx(xmlPullParserNewPullParser, map, i16, zoijcleaowVar, map2, map3);
                            } else {
                                iobyxmoadgVar = iobyxmoadgVar2;
                                try {
                                    ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(xmlPullParserNewPullParser, ppxfxbqfkfVar, map2, iobyxmoadgVar);
                                    arrayDeque.push(ppxfxbqfkfVarWflxmlrfwp);
                                    if (ppxfxbqfkfVar != null) {
                                        ppxfxbqfkfVar.iobyxmoadg(ppxfxbqfkfVarWflxmlrfwp);
                                    }
                                } catch (SubtitleDecoderException e13) {
                                    kcexrzcfyt.dxjokdxxww("TtmlParser", "Suppressing parser error", e13);
                                    i15++;
                                }
                            }
                            iobyxmoadgVarBtonecajqb = iobyxmoadgVar;
                            zoijcleaowVarKcexrzcfyt = zoijcleaowVar;
                            iNufgyqmvbu = i16;
                        } else {
                            kcexrzcfyt.gxszxtbevo("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i15++;
                            iobyxmoadgVarBtonecajqb = iobyxmoadgVar2;
                            zoijcleaowVarKcexrzcfyt = zoijcleaowVar;
                            iNufgyqmvbu = i16;
                        }
                    } else if (eventType == 4) {
                        ((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar)).iobyxmoadg(ppxfxbqfkf.wkgbmnqykc(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            nufgyqmvbuVar = new nufgyqmvbu((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg((ppxfxbqfkf) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i15++;
                } else if (eventType == 3) {
                    i15--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (q4.gtknphoqwx) y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar);
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        dxjokdxxww.ppxfxbqfkf(iobyxmoadg(bArr, i13, i14), zoijcleaowVar, wflxmlrfwpVar);
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 1;
    }
}
