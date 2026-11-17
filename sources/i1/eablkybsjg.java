package i1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: i1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0974eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f41645eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final r1.eablkybsjg f41646iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f41647ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f41648wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final r1.eablkybsjg f41649zoijcleaow;

        public C0974eablkybsjg(r1.eablkybsjg eablkybsjgVar, r1.eablkybsjg eablkybsjgVar2, int i13, int i14, String str) {
            this.f41646iobyxmoadg = eablkybsjgVar;
            this.f41649zoijcleaow = eablkybsjgVar2;
            this.f41648wkgbmnqykc = i13;
            this.f41647ppxfxbqfkf = i14;
            this.f41645eablkybsjg = str;
        }

        public int eablkybsjg() {
            return this.f41647ppxfxbqfkf;
        }

        public r1.eablkybsjg iobyxmoadg() {
            return this.f41649zoijcleaow;
        }

        public r1.eablkybsjg ppxfxbqfkf() {
            return this.f41646iobyxmoadg;
        }

        public String wkgbmnqykc() {
            return this.f41645eablkybsjg;
        }

        public int zoijcleaow() {
            return this.f41648wkgbmnqykc;
        }
    }

    static class iobyxmoadg {
        static int iobyxmoadg(TypedArray typedArray, int i13) {
            return typedArray.getType(i13);
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc[] f41650iobyxmoadg;

        public ppxfxbqfkf(wkgbmnqykc[] wkgbmnqykcVarArr) {
            this.f41650iobyxmoadg = wkgbmnqykcVarArr;
        }

        public wkgbmnqykc[] iobyxmoadg() {
            return this.f41650iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f41651eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int f41652gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41653iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f41654ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f41655wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f41656zoijcleaow;

        public wkgbmnqykc(String str, int i13, boolean z13, String str2, int i14, int i15) {
            this.f41653iobyxmoadg = str;
            this.f41656zoijcleaow = i13;
            this.f41654ppxfxbqfkf = z13;
            this.f41655wkgbmnqykc = str2;
            this.f41651eablkybsjg = i14;
            this.f41652gxszxtbevo = i15;
        }

        public int eablkybsjg() {
            return this.f41656zoijcleaow;
        }

        public boolean gxszxtbevo() {
            return this.f41654ppxfxbqfkf;
        }

        public String iobyxmoadg() {
            return this.f41653iobyxmoadg;
        }

        public int ppxfxbqfkf() {
            return this.f41651eablkybsjg;
        }

        public String wkgbmnqykc() {
            return this.f41655wkgbmnqykc;
        }

        public int zoijcleaow() {
            return this.f41652gxszxtbevo;
        }
    }

    public interface zoijcleaow {
    }

    private static zoijcleaow eablkybsjg(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), g1.wkgbmnqykc.FontFamily);
        String string = typedArrayObtainAttributes.getString(g1.wkgbmnqykc.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(g1.wkgbmnqykc.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(g1.wkgbmnqykc.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(g1.wkgbmnqykc.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(g1.wkgbmnqykc.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(g1.wkgbmnqykc.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(g1.wkgbmnqykc.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(g1.wkgbmnqykc.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                lqeggnwhkg(xmlPullParser);
            }
            List listPpxfxbqfkf = ppxfxbqfkf(resources, resourceId);
            return new C0974eablkybsjg(new r1.eablkybsjg(string, string2, string3, listPpxfxbqfkf), string4 != null ? new r1.eablkybsjg(string, string2, string4, listPpxfxbqfkf) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(gxszxtbevo(xmlPullParser, resources));
                } else {
                    lqeggnwhkg(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ppxfxbqfkf((wkgbmnqykc[]) arrayList.toArray(new wkgbmnqykc[0]));
    }

    private static wkgbmnqykc gxszxtbevo(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), g1.wkgbmnqykc.FontFamilyFont);
        int i13 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(g1.wkgbmnqykc.FontFamilyFont_fontWeight) ? g1.wkgbmnqykc.FontFamilyFont_fontWeight : g1.wkgbmnqykc.FontFamilyFont_android_fontWeight, OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST);
        boolean z13 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(g1.wkgbmnqykc.FontFamilyFont_fontStyle) ? g1.wkgbmnqykc.FontFamilyFont_fontStyle : g1.wkgbmnqykc.FontFamilyFont_android_fontStyle, 0);
        int i14 = typedArrayObtainAttributes.hasValue(g1.wkgbmnqykc.FontFamilyFont_ttcIndex) ? g1.wkgbmnqykc.FontFamilyFont_ttcIndex : g1.wkgbmnqykc.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(g1.wkgbmnqykc.FontFamilyFont_fontVariationSettings) ? g1.wkgbmnqykc.FontFamilyFont_fontVariationSettings : g1.wkgbmnqykc.FontFamilyFont_android_fontVariationSettings);
        int i15 = typedArrayObtainAttributes.getInt(i14, 0);
        int i16 = typedArrayObtainAttributes.hasValue(g1.wkgbmnqykc.FontFamilyFont_font) ? g1.wkgbmnqykc.FontFamilyFont_font : g1.wkgbmnqykc.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            lqeggnwhkg(xmlPullParser);
        }
        return new wkgbmnqykc(string2, i13, z13, string, i15, resourceId);
    }

    private static int iobyxmoadg(TypedArray typedArray, int i13) {
        return iobyxmoadg.iobyxmoadg(typedArray, i13);
    }

    private static void lqeggnwhkg(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i13 = 1;
        while (i13 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i13++;
            } else if (next == 3) {
                i13--;
            }
        }
    }

    private static List nufgyqmvbu(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static List ppxfxbqfkf(Resources resources, int i13) {
        if (i13 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i13);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (iobyxmoadg(typedArrayObtainTypedArray, 0) == 1) {
                for (int i14 = 0; i14 < typedArrayObtainTypedArray.length(); i14++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i14, 0);
                    if (resourceId != 0) {
                        arrayList.add(nufgyqmvbu(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(nufgyqmvbu(resources.getStringArray(i13)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static zoijcleaow wkgbmnqykc(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return eablkybsjg(xmlPullParser, resources);
        }
        lqeggnwhkg(xmlPullParser);
        return null;
    }

    public static zoijcleaow zoijcleaow(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return wkgbmnqykc(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
