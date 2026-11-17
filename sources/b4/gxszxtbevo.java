package b4;

import androidx.media3.common.ParserException;
import com.google.common.collect.zdlpuopuiu;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import y2.kcexrzcfyt;
import y2.kegysxyocb;

/* JADX INFO: loaded from: classes.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String[] f15098iobyxmoadg = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String[] f15100zoijcleaow = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f15099ppxfxbqfkf = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static long eablkybsjg(XmlPullParser xmlPullParser) {
        for (String str : f15100zoijcleaow) {
            String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, str);
            if (strIobyxmoadg != null) {
                long j13 = Long.parseLong(strIobyxmoadg);
                if (j13 == -1) {
                    return -9223372036854775807L;
                }
                return j13;
            }
        }
        return -9223372036854775807L;
    }

    private static zdlpuopuiu gxszxtbevo(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (kegysxyocb.eablkybsjg(xmlPullParser, str3)) {
                String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, str2 + ":Mime");
                String strIobyxmoadg2 = kegysxyocb.iobyxmoadg(xmlPullParser, str2 + ":Semantic");
                String strIobyxmoadg3 = kegysxyocb.iobyxmoadg(xmlPullParser, str2 + ":Length");
                String strIobyxmoadg4 = kegysxyocb.iobyxmoadg(xmlPullParser, str2 + ":Padding");
                if (strIobyxmoadg == null || strIobyxmoadg2 == null) {
                    return zdlpuopuiu.zynmafqrjb();
                }
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new ppxfxbqfkf.iobyxmoadg(strIobyxmoadg, strIobyxmoadg2, strIobyxmoadg3 != null ? Long.parseLong(strIobyxmoadg3) : 0L, strIobyxmoadg4 != null ? Long.parseLong(strIobyxmoadg4) : 0L));
            }
        } while (!kegysxyocb.ppxfxbqfkf(xmlPullParser, str4));
        return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
    }

    public static ppxfxbqfkf iobyxmoadg(String str) {
        try {
            return zoijcleaow(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            kcexrzcfyt.nufgyqmvbu("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zdlpuopuiu ppxfxbqfkf(XmlPullParser xmlPullParser) {
        for (String str : f15099ppxfxbqfkf) {
            String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, str);
            if (strIobyxmoadg != null) {
                return zdlpuopuiu.cdpycssgdh(new ppxfxbqfkf.iobyxmoadg("image/jpeg", "Primary", 0L, 0L), new ppxfxbqfkf.iobyxmoadg("video/mp4", "MotionPhoto", Long.parseLong(strIobyxmoadg), 0L));
            }
        }
        return zdlpuopuiu.zynmafqrjb();
    }

    private static boolean wkgbmnqykc(XmlPullParser xmlPullParser) {
        for (String str : f15098iobyxmoadg) {
            String strIobyxmoadg = kegysxyocb.iobyxmoadg(xmlPullParser, str);
            if (strIobyxmoadg != null) {
                return Integer.parseInt(strIobyxmoadg) == 1;
            }
        }
        return false;
    }

    private static ppxfxbqfkf zoijcleaow(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!kegysxyocb.eablkybsjg(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.iobyxmoadg("Couldn't find xmp metadata", null);
        }
        zdlpuopuiu zdlpuopuiuVarZynmafqrjb = zdlpuopuiu.zynmafqrjb();
        long jEablkybsjg = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (kegysxyocb.eablkybsjg(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!wkgbmnqykc(xmlPullParserNewPullParser)) {
                    return null;
                }
                jEablkybsjg = eablkybsjg(xmlPullParserNewPullParser);
                zdlpuopuiuVarZynmafqrjb = ppxfxbqfkf(xmlPullParserNewPullParser);
            } else if (kegysxyocb.eablkybsjg(xmlPullParserNewPullParser, "Container:Directory")) {
                zdlpuopuiuVarZynmafqrjb = gxszxtbevo(xmlPullParserNewPullParser, "Container", "Item");
            } else if (kegysxyocb.eablkybsjg(xmlPullParserNewPullParser, "GContainer:Directory")) {
                zdlpuopuiuVarZynmafqrjb = gxszxtbevo(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!kegysxyocb.ppxfxbqfkf(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (zdlpuopuiuVarZynmafqrjb.isEmpty()) {
            return null;
        }
        return new ppxfxbqfkf(jEablkybsjg, zdlpuopuiuVarZynmafqrjb);
    }
}
