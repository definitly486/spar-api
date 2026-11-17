package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f21218wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private com.caverock.androidsvg.lqeggnwhkg f21214iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix f21219zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f21217ppxfxbqfkf = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f21212eablkybsjg = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private nufgyqmvbu f21213gxszxtbevo = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private StringBuilder f21215lqeggnwhkg = null;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f21216nufgyqmvbu = false;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private StringBuilder f21211dxjokdxxww = null;

    private class btonecajqb implements Attributes {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private XmlPullParser f21220iobyxmoadg;

        public btonecajqb(XmlPullParser xmlPullParser) {
            this.f21220iobyxmoadg = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f21220iobyxmoadg.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i13) {
            return this.f21220iobyxmoadg.getAttributeName(i13);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i13) {
            String attributeName = this.f21220iobyxmoadg.getAttributeName(i13);
            if (this.f21220iobyxmoadg.getAttributePrefix(i13) == null) {
                return attributeName;
            }
            return this.f21220iobyxmoadg.getAttributePrefix(i13) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i13) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i13) {
            return this.f21220iobyxmoadg.getAttributeNamespace(i13);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i13) {
            return this.f21220iobyxmoadg.getAttributeValue(i13);
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.dxjokdxxww$dxjokdxxww, reason: collision with other inner class name */
    static class C0388dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        String f21222iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f21223ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f21225zoijcleaow = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private com.caverock.androidsvg.wkgbmnqykc f21224wkgbmnqykc = new com.caverock.androidsvg.wkgbmnqykc();

        C0388dxjokdxxww(String str) {
            this.f21223ppxfxbqfkf = 0;
            String strTrim = str.trim();
            this.f21222iobyxmoadg = strTrim;
            this.f21223ppxfxbqfkf = strTrim.length();
        }

        float agtfadlqog() {
            float fZoijcleaow = this.f21224wkgbmnqykc.zoijcleaow(this.f21222iobyxmoadg, this.f21225zoijcleaow, this.f21223ppxfxbqfkf);
            if (!Float.isNaN(fZoijcleaow)) {
                this.f21225zoijcleaow = this.f21224wkgbmnqykc.iobyxmoadg();
            }
            return fZoijcleaow;
        }

        boolean btonecajqb(int i13) {
            return i13 == 10 || i13 == 13;
        }

        float cqumvgiudr() {
            lereixgezr();
            float fZoijcleaow = this.f21224wkgbmnqykc.zoijcleaow(this.f21222iobyxmoadg, this.f21225zoijcleaow, this.f21223ppxfxbqfkf);
            if (!Float.isNaN(fZoijcleaow)) {
                this.f21225zoijcleaow = this.f21224wkgbmnqykc.iobyxmoadg();
            }
            return fZoijcleaow;
        }

        Integer draadjrbmk() {
            int i13 = this.f21225zoijcleaow;
            if (i13 == this.f21223ppxfxbqfkf) {
                return null;
            }
            String str = this.f21222iobyxmoadg;
            this.f21225zoijcleaow = i13 + 1;
            return Integer.valueOf(str.charAt(i13));
        }

        boolean dxjokdxxww() {
            int i13 = this.f21225zoijcleaow;
            if (i13 == this.f21223ppxfxbqfkf) {
                return false;
            }
            char cCharAt = this.f21222iobyxmoadg.charAt(i13);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        float eablkybsjg(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            lereixgezr();
            return agtfadlqog();
        }

        String esjtqupxsv() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            this.f21225zoijcleaow = this.f21223ppxfxbqfkf;
            return this.f21222iobyxmoadg.substring(i13);
        }

        boolean gtknphoqwx(int i13) {
            return i13 == 32 || i13 == 10 || i13 == 13 || i13 == 9;
        }

        boolean gxszxtbevo(char c13) {
            int i13 = this.f21225zoijcleaow;
            boolean z13 = i13 < this.f21223ppxfxbqfkf && this.f21222iobyxmoadg.charAt(i13) == c13;
            if (z13) {
                this.f21225zoijcleaow++;
            }
            return z13;
        }

        int iobyxmoadg() {
            int i13 = this.f21225zoijcleaow;
            int i14 = this.f21223ppxfxbqfkf;
            if (i13 == i14) {
                return -1;
            }
            int i15 = i13 + 1;
            this.f21225zoijcleaow = i15;
            if (i15 < i14) {
                return this.f21222iobyxmoadg.charAt(i15);
            }
            return -1;
        }

        String iwizpuwonk() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            char cCharAt = this.f21222iobyxmoadg.charAt(i13);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f21225zoijcleaow = i13;
                return null;
            }
            int iIobyxmoadg = iobyxmoadg();
            while (true) {
                if ((iIobyxmoadg < 65 || iIobyxmoadg > 90) && (iIobyxmoadg < 97 || iIobyxmoadg > 122)) {
                    break;
                }
                iIobyxmoadg = iobyxmoadg();
            }
            return this.f21222iobyxmoadg.substring(i13, this.f21225zoijcleaow);
        }

        com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt jyumaefscl() {
            if (nufgyqmvbu()) {
                return null;
            }
            if (this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow) == '%') {
                this.f21225zoijcleaow++;
                return com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent;
            }
            int i13 = this.f21225zoijcleaow;
            if (i13 > this.f21223ppxfxbqfkf - 2) {
                return null;
            }
            try {
                com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVarValueOf = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.valueOf(this.f21222iobyxmoadg.substring(i13, i13 + 2).toLowerCase(Locale.US));
                this.f21225zoijcleaow += 2;
                return okpsazkaxtVarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String kcexrzcfyt(char c13) {
            return zdlpuopuiu(c13, false);
        }

        boolean lereixgezr() {
            pmvmpeiblj();
            int i13 = this.f21225zoijcleaow;
            if (i13 == this.f21223ppxfxbqfkf || this.f21222iobyxmoadg.charAt(i13) != ',') {
                return false;
            }
            this.f21225zoijcleaow++;
            pmvmpeiblj();
            return true;
        }

        boolean lqeggnwhkg(String str) {
            int length = str.length();
            int i13 = this.f21225zoijcleaow;
            boolean z13 = i13 <= this.f21223ppxfxbqfkf - length && this.f21222iobyxmoadg.substring(i13, i13 + length).equals(str);
            if (z13) {
                this.f21225zoijcleaow += length;
            }
            return z13;
        }

        boolean nufgyqmvbu() {
            return this.f21225zoijcleaow == this.f21223ppxfxbqfkf;
        }

        String ojitshcjhn() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            int iCharAt = this.f21222iobyxmoadg.charAt(i13);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = iobyxmoadg();
            }
            int i14 = this.f21225zoijcleaow;
            while (gtknphoqwx(iCharAt)) {
                iCharAt = iobyxmoadg();
            }
            if (iCharAt == 40) {
                this.f21225zoijcleaow++;
                return this.f21222iobyxmoadg.substring(i13, i14);
            }
            this.f21225zoijcleaow = i13;
            return null;
        }

        String oxmwwwfdhm() {
            return zdlpuopuiu(' ', false);
        }

        void pmvmpeiblj() {
            while (true) {
                int i13 = this.f21225zoijcleaow;
                if (i13 >= this.f21223ppxfxbqfkf || !gtknphoqwx(this.f21222iobyxmoadg.charAt(i13))) {
                    return;
                } else {
                    this.f21225zoijcleaow++;
                }
            }
        }

        Boolean ppxfxbqfkf(Object obj) {
            if (obj == null) {
                return null;
            }
            lereixgezr();
            return wflxmlrfwp();
        }

        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyq() {
            float fAgtfadlqog = agtfadlqog();
            if (Float.isNaN(fAgtfadlqog)) {
                return null;
            }
            com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVarJyumaefscl = jyumaefscl();
            return okpsazkaxtVarJyumaefscl == null ? new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(fAgtfadlqog, com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.px) : new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(fAgtfadlqog, okpsazkaxtVarJyumaefscl);
        }

        String vdvldrhtss() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            char cCharAt = this.f21222iobyxmoadg.charAt(i13);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iIobyxmoadg = iobyxmoadg();
            while (iIobyxmoadg != -1 && iIobyxmoadg != cCharAt) {
                iIobyxmoadg = iobyxmoadg();
            }
            if (iIobyxmoadg == -1) {
                this.f21225zoijcleaow = i13;
                return null;
            }
            int i14 = this.f21225zoijcleaow;
            this.f21225zoijcleaow = i14 + 1;
            return this.f21222iobyxmoadg.substring(i13 + 1, i14);
        }

        Boolean wflxmlrfwp() {
            int i13 = this.f21225zoijcleaow;
            if (i13 == this.f21223ppxfxbqfkf) {
                return null;
            }
            char cCharAt = this.f21222iobyxmoadg.charAt(i13);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f21225zoijcleaow++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float wkgbmnqykc(float f13) {
            if (Float.isNaN(f13)) {
                return Float.NaN;
            }
            lereixgezr();
            return agtfadlqog();
        }

        String yggfygwlhe(char c13) {
            return zdlpuopuiu(c13, true);
        }

        String zdlpuopuiu(char c13, boolean z13) {
            if (nufgyqmvbu()) {
                return null;
            }
            char cCharAt = this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow);
            if ((!z13 && gtknphoqwx(cCharAt)) || cCharAt == c13) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            int iIobyxmoadg = iobyxmoadg();
            while (iIobyxmoadg != -1 && iIobyxmoadg != c13 && (z13 || !gtknphoqwx(iIobyxmoadg))) {
                iIobyxmoadg = iobyxmoadg();
            }
            return this.f21222iobyxmoadg.substring(i13, this.f21225zoijcleaow);
        }

        String zoijcleaow() {
            int i13 = this.f21225zoijcleaow;
            while (!nufgyqmvbu() && !gtknphoqwx(this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow))) {
                this.f21225zoijcleaow++;
            }
            String strSubstring = this.f21222iobyxmoadg.substring(i13, this.f21225zoijcleaow);
            this.f21225zoijcleaow = i13;
            return strSubstring;
        }
    }

    private static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Map f21226iobyxmoadg;

        static {
            HashMap map = new HashMap(13);
            f21226iobyxmoadg = map;
            Integer numValueOf = Integer.valueOf(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST);
            map.put("normal", numValueOf);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", numValueOf);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer iobyxmoadg(String str) {
            return (Integer) f21226iobyxmoadg.get(str);
        }
    }

    private class gxszxtbevo extends DefaultHandler2 {
        private gxszxtbevo() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i13, int i14) {
            dxjokdxxww.this.h(new String(cArr, i13, i14));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            dxjokdxxww.this.ojitshcjhn();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            dxjokdxxww.this.rgvfuqvkyq(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            dxjokdxxww.this.oxmwwwfdhm(str, dxjokdxxww.this.roivzttewh(new C0388dxjokdxxww(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            dxjokdxxww.this.b();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            dxjokdxxww.this.c(str, str2, str3, attributes);
        }

        /* synthetic */ gxszxtbevo(dxjokdxxww dxjokdxxwwVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f21228iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f21229zoijcleaow;

        static {
            int[] iArr = new int[lqeggnwhkg.values().length];
            f21229zoijcleaow = iArr;
            try {
                iArr[lqeggnwhkg.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f21229zoijcleaow[lqeggnwhkg.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[nufgyqmvbu.values().length];
            f21228iobyxmoadg = iArr2;
            try {
                iArr2[nufgyqmvbu.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f21228iobyxmoadg[nufgyqmvbu.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private enum lqeggnwhkg {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Map f21283m = new HashMap();

        static {
            for (lqeggnwhkg lqeggnwhkgVar : values()) {
                if (lqeggnwhkgVar == CLASS) {
                    f21283m.put("class", lqeggnwhkgVar);
                } else {
                    if (lqeggnwhkgVar != UNSUPPORTED) {
                        f21283m.put(lqeggnwhkgVar.name().replace('_', '-'), lqeggnwhkgVar);
                    }
                }
            }
        }

        public static lqeggnwhkg iobyxmoadg(String str) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) f21283m.get(str);
            return lqeggnwhkgVar != null ? lqeggnwhkgVar : UNSUPPORTED;
        }
    }

    private enum nufgyqmvbu {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
        private static final Map f21345ribwqtqdhb = new HashMap();

        static {
            for (nufgyqmvbu nufgyqmvbuVar : values()) {
                if (nufgyqmvbuVar == SWITCH) {
                    f21345ribwqtqdhb.put("switch", nufgyqmvbuVar);
                } else if (nufgyqmvbuVar != UNSUPPORTED) {
                    f21345ribwqtqdhb.put(nufgyqmvbuVar.name(), nufgyqmvbuVar);
                }
            }
        }

        public static nufgyqmvbu iobyxmoadg(String str) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) f21345ribwqtqdhb.get(str);
            return nufgyqmvbuVar != null ? nufgyqmvbuVar : UNSUPPORTED;
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Map f21358iobyxmoadg;

        static {
            HashMap map = new HashMap(47);
            f21358iobyxmoadg = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer iobyxmoadg(String str) {
            return (Integer) f21358iobyxmoadg.get(str);
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Map f21359iobyxmoadg;

        static {
            HashMap map = new HashMap(9);
            f21359iobyxmoadg = map;
            com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVar = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.pt;
            map.put("xx-small", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(0.694f, okpsazkaxtVar));
            map.put("x-small", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(0.833f, okpsazkaxtVar));
            map.put("small", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(10.0f, okpsazkaxtVar));
            map.put("medium", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(12.0f, okpsazkaxtVar));
            map.put("large", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(14.4f, okpsazkaxtVar));
            map.put("x-large", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(17.3f, okpsazkaxtVar));
            map.put("xx-large", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(20.7f, okpsazkaxtVar));
            com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVar2 = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent;
            map.put("smaller", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(83.33f, okpsazkaxtVar2));
            map.put("larger", new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(120.0f, okpsazkaxtVar2));
        }

        static com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq iobyxmoadg(String str) {
            return (com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) f21359iobyxmoadg.get(str);
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Map f21360iobyxmoadg;

        static {
            HashMap map = new HashMap(10);
            f21360iobyxmoadg = map;
            map.put(DevicePublicKeyStringDef.NONE, com.caverock.androidsvg.eablkybsjg.iobyxmoadg.none);
            map.put("xMinYMin", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMinYMin);
            map.put("xMidYMin", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMin);
            map.put("xMaxYMin", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMin);
            map.put("xMinYMid", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMinYMid);
            map.put("xMidYMid", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMid);
            map.put("xMaxYMid", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMid);
            map.put("xMinYMax", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMinYMax);
            map.put("xMidYMax", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMax);
            map.put("xMaxYMax", com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMax);
        }

        static com.caverock.androidsvg.eablkybsjg.iobyxmoadg iobyxmoadg(String str) {
            return (com.caverock.androidsvg.eablkybsjg.iobyxmoadg) f21360iobyxmoadg.get(str);
        }
    }

    dxjokdxxww() {
    }

    private void a(Attributes attributes) throws SVGParseException {
        draadjrbmk("<solidColor>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.istkbnxepw istkbnxepwVar = new com.caverock.androidsvg.lqeggnwhkg.istkbnxepw();
        istkbnxepwVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        istkbnxepwVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(istkbnxepwVar, attributes);
        tzroggbefp(istkbnxepwVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(istkbnxepwVar);
        this.f21219zoijcleaow = istkbnxepwVar;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.nufgyqmvbu ageimvtcrz(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.nufgyqmvbu.LTR;
        }
        if (str.equals("rtl")) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.nufgyqmvbu.RTL;
        }
        return null;
    }

    private void agtfadlqog(Attributes attributes) throws SVGParseException {
        draadjrbmk("<ellipse>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww dxjokdxxwwVar = new com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww();
        dxjokdxxwwVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        dxjokdxxwwVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(dxjokdxxwwVar, attributes);
        tzroggbefp(dxjokdxxwwVar, attributes);
        sopmlzcsov(dxjokdxxwwVar, attributes);
        istkbnxepw(dxjokdxxwwVar, attributes);
        yadqdtsiqt(dxjokdxxwwVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(dxjokdxxwwVar);
    }

    private static Set auzgnhcxok(String str) {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        HashSet hashSet = new HashSet();
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            String strOxmwwwfdhm = c0388dxjokdxxww.oxmwwwfdhm();
            if (strOxmwwwfdhm.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strOxmwwwfdhm.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c0388dxjokdxxww.pmvmpeiblj();
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f21214iobyxmoadg = new com.caverock.androidsvg.lqeggnwhkg();
    }

    private static List bfopjjpdmp(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        c0388dxjokdxxww.pmvmpeiblj();
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            float fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
            if (Float.isNaN(fAgtfadlqog)) {
                throw new SVGParseException("Invalid length list value: " + c0388dxjokdxxww.zoijcleaow());
            }
            com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVarJyumaefscl = c0388dxjokdxxww.jyumaefscl();
            if (okpsazkaxtVarJyumaefscl == null) {
                okpsazkaxtVarJyumaefscl = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.px;
            }
            arrayList.add(new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(fAgtfadlqog, okpsazkaxtVarJyumaefscl));
            c0388dxjokdxxww.lereixgezr();
        }
        return arrayList;
    }

    private static int btonecajqb(float f13) {
        if (f13 < 0.0f) {
            return 0;
        }
        return f13 > 255.0f ? KotlinVersion.MAX_COMPONENT_VALUE : Math.round(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f21217ppxfxbqfkf) {
            this.f21218wkgbmnqykc++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(str2);
            switch (iobyxmoadg.f21228iobyxmoadg[nufgyqmvbuVarIobyxmoadg.ordinal()]) {
                case 1:
                    f(attributes);
                    break;
                case 2:
                case 3:
                    vdvldrhtss(attributes);
                    break;
                case 4:
                    wflxmlrfwp(attributes);
                    break;
                case 5:
                    n(attributes);
                    break;
                case 6:
                    jrbgnlbqoe(attributes);
                    break;
                case 7:
                    krqnebusok(attributes);
                    break;
                case 8:
                    dxjokdxxww(attributes);
                    break;
                case 9:
                    agtfadlqog(attributes);
                    break;
                case 10:
                    jyumaefscl(attributes);
                    break;
                case 11:
                    rhgxfdycjh(attributes);
                    break;
                case 12:
                    ezmngbhpjk(attributes);
                    break;
                case 13:
                    i(attributes);
                    break;
                case 14:
                    m(attributes);
                    break;
                case 15:
                    l(attributes);
                    break;
                case 16:
                    p(attributes);
                    break;
                case 17:
                    g(attributes);
                    break;
                case 18:
                    cqumvgiudr(attributes);
                    break;
                case 19:
                    iwizpuwonk(attributes);
                    break;
                case 20:
                    eslsurpljm(attributes);
                    break;
                case 21:
                    d(attributes);
                    break;
                case 22:
                case 23:
                    this.f21212eablkybsjg = true;
                    this.f21213gxszxtbevo = nufgyqmvbuVarIobyxmoadg;
                    break;
                case 24:
                    gtknphoqwx(attributes);
                    break;
                case C4007z9.F /* 25 */:
                    k(attributes);
                    break;
                case C4007z9.G /* 26 */:
                    fmlbqenlif(attributes);
                    break;
                case 27:
                    yggfygwlhe(attributes);
                    break;
                case 28:
                    o(attributes);
                    break;
                case C4007z9.I /* 29 */:
                    esjtqupxsv(attributes);
                    break;
                case 30:
                    e(attributes);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    a(attributes);
                    break;
                default:
                    this.f21217ppxfxbqfkf = true;
                    this.f21218wkgbmnqykc = 1;
                    break;
            }
        }
    }

    private void cdpycssgdh(com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String qName = attributes.getQName(i13);
            if (qName.equals("id") || qName.equals("xml:id")) {
                jpowsppfyaVar.f21448ppxfxbqfkf = attributes.getValue(i13).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i13).trim();
                if ("default".equals(strTrim)) {
                    jpowsppfyaVar.f21449wkgbmnqykc = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        jpowsppfyaVar.f21449wkgbmnqykc = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private void cllcsxoeiz(com.caverock.androidsvg.lqeggnwhkg.lereixgezr lereixgezrVar, Attributes attributes, String str) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            if (lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)) == lqeggnwhkg.points) {
                C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(attributes.getValue(i13));
                ArrayList arrayList = new ArrayList();
                c0388dxjokdxxww.pmvmpeiblj();
                while (!c0388dxjokdxxww.nufgyqmvbu()) {
                    float fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
                    if (Float.isNaN(fAgtfadlqog)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog2 = c0388dxjokdxxww.agtfadlqog();
                    if (Float.isNaN(fAgtfadlqog2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    c0388dxjokdxxww.lereixgezr();
                    arrayList.add(Float.valueOf(fAgtfadlqog));
                    arrayList.add(Float.valueOf(fAgtfadlqog2));
                }
                lereixgezrVar.f21464ojitshcjhn = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    lereixgezrVar.f21464ojitshcjhn[i14] = ((Float) it.next()).floatValue();
                    i14++;
                }
            }
        }
    }

    private void cqumvgiudr(Attributes attributes) throws SVGParseException {
        draadjrbmk("<marker>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm oxmwwwfdhmVar = new com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm();
        oxmwwwfdhmVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        oxmwwwfdhmVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(oxmwwwfdhmVar, attributes);
        tzroggbefp(oxmwwwfdhmVar, attributes);
        istkbnxepw(oxmwwwfdhmVar, attributes);
        jlmebxxoox(oxmwwwfdhmVar, attributes);
        pkzmftpjix(oxmwwwfdhmVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(oxmwwwfdhmVar);
        this.f21219zoijcleaow = oxmwwwfdhmVar;
    }

    private void crxdokpmqz(com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev jztzpxfvevVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                jztzpxfvevVar.f21455vdvldrhtss = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                jztzpxfvevVar.f21453oxmwwwfdhm = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                jztzpxfvevVar.f21452kcexrzcfyt = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                jztzpxfvevVar.f21456zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i14 == 6 && ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13)))) {
                jztzpxfvevVar.f21454rgvfuqvkyq = strTrim;
            }
        }
    }

    private static List czzsidtyhn(String str) {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        ArrayList arrayList = null;
        do {
            String strVdvldrhtss = c0388dxjokdxxww.vdvldrhtss();
            if (strVdvldrhtss == null) {
                strVdvldrhtss = c0388dxjokdxxww.yggfygwlhe(',');
            }
            if (strVdvldrhtss == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strVdvldrhtss);
            c0388dxjokdxxww.lereixgezr();
        } while (!c0388dxjokdxxww.nufgyqmvbu());
        return arrayList;
    }

    private void d(Attributes attributes) throws SVGParseException {
        draadjrbmk("<stop>", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = this.f21219zoijcleaow;
        if (pkzmftpjixVar == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(pkzmftpjixVar instanceof com.caverock.androidsvg.lqeggnwhkg.btonecajqb)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh cdpycssgdhVar = new com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh();
        cdpycssgdhVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        cdpycssgdhVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(cdpycssgdhVar, attributes);
        tzroggbefp(cdpycssgdhVar, attributes);
        kegysxyocb(cdpycssgdhVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(cdpycssgdhVar);
        this.f21219zoijcleaow = cdpycssgdhVar;
    }

    private void draadjrbmk(String str, Object... objArr) {
    }

    private void dsvhmnatus(com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv stevsuqkhvVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 35) {
                stevsuqkhvVar.f21502rgvfuqvkyq = oipsdeybqn(strTrim);
            } else if (i14 != 36) {
                switch (i14) {
                    case 12:
                        stevsuqkhvVar.f21504wflxmlrfwp = oipsdeybqn(strTrim);
                        break;
                    case 13:
                        stevsuqkhvVar.f21500agtfadlqog = oipsdeybqn(strTrim);
                        break;
                    case 14:
                        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                        stevsuqkhvVar.f21501ojitshcjhn = rgvfuqvkyqVarOipsdeybqn;
                        if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                            throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                stevsuqkhvVar.f21503vdvldrhtss = oipsdeybqn(strTrim);
            }
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq[] dvvnrvtcbc(String str) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarRgvfuqvkyq;
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        c0388dxjokdxxww.pmvmpeiblj();
        if (c0388dxjokdxxww.nufgyqmvbu() || (rgvfuqvkyqVarRgvfuqvkyq = c0388dxjokdxxww.rgvfuqvkyq()) == null || rgvfuqvkyqVarRgvfuqvkyq.lqeggnwhkg()) {
            return null;
        }
        float fIobyxmoadg = rgvfuqvkyqVarRgvfuqvkyq.iobyxmoadg();
        ArrayList arrayList = new ArrayList();
        arrayList.add(rgvfuqvkyqVarRgvfuqvkyq);
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            c0388dxjokdxxww.lereixgezr();
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarRgvfuqvkyq2 = c0388dxjokdxxww.rgvfuqvkyq();
            if (rgvfuqvkyqVarRgvfuqvkyq2 == null || rgvfuqvkyqVarRgvfuqvkyq2.lqeggnwhkg()) {
                return null;
            }
            arrayList.add(rgvfuqvkyqVarRgvfuqvkyq2);
            fIobyxmoadg += rgvfuqvkyqVarRgvfuqvkyq2.iobyxmoadg();
        }
        if (fIobyxmoadg == 0.0f) {
            return null;
        }
        return (com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq[]) arrayList.toArray(new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq[arrayList.size()]);
    }

    private void dxjokdxxww(Attributes attributes) throws SVGParseException {
        draadjrbmk("<circle>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar = new com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc();
        wkgbmnqykcVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        wkgbmnqykcVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(wkgbmnqykcVar, attributes);
        tzroggbefp(wkgbmnqykcVar, attributes);
        sopmlzcsov(wkgbmnqykcVar, attributes);
        istkbnxepw(wkgbmnqykcVar, attributes);
        pmvmpeiblj(wkgbmnqykcVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(wkgbmnqykcVar);
    }

    private void e(Attributes attributes) throws SVGParseException {
        draadjrbmk("<style>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i14 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && com.caverock.androidsvg.zoijcleaow.zoijcleaow(str, com.caverock.androidsvg.zoijcleaow.gxszxtbevo.screen)) {
            this.f21216nufgyqmvbu = true;
        } else {
            this.f21217ppxfxbqfkf = true;
            this.f21218wkgbmnqykc = 1;
        }
    }

    private void esjtqupxsv(Attributes attributes) throws SVGParseException {
        draadjrbmk("<mask>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt kcexrzcfytVar = new com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt();
        kcexrzcfytVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        kcexrzcfytVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(kcexrzcfytVar, attributes);
        tzroggbefp(kcexrzcfytVar, attributes);
        istkbnxepw(kcexrzcfytVar, attributes);
        hcddaimhww(kcexrzcfytVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(kcexrzcfytVar);
        this.f21219zoijcleaow = kcexrzcfytVar;
    }

    private void eslsurpljm(Attributes attributes) throws SVGParseException {
        draadjrbmk("<radialGradient>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv stevsuqkhvVar = new com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv();
        stevsuqkhvVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        stevsuqkhvVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(stevsuqkhvVar, attributes);
        tzroggbefp(stevsuqkhvVar, attributes);
        iozdgvuglv(stevsuqkhvVar, attributes);
        dsvhmnatus(stevsuqkhvVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(stevsuqkhvVar);
        this.f21219zoijcleaow = stevsuqkhvVar;
    }

    private void ezmngbhpjk(Attributes attributes) throws SVGParseException {
        draadjrbmk("<polygon>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.lereixgezr pmvmpeibljVar = new com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj();
        pmvmpeibljVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        pmvmpeibljVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(pmvmpeibljVar, attributes);
        tzroggbefp(pmvmpeibljVar, attributes);
        sopmlzcsov(pmvmpeibljVar, attributes);
        istkbnxepw(pmvmpeibljVar, attributes);
        cllcsxoeiz(pmvmpeibljVar, attributes, "polygon");
        this.f21219zoijcleaow.nufgyqmvbu(pmvmpeibljVar);
    }

    private void f(Attributes attributes) throws SVGParseException {
        draadjrbmk("<svg>", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVar = new com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv();
        iozdgvuglvVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        iozdgvuglvVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(iozdgvuglvVar, attributes);
        tzroggbefp(iozdgvuglvVar, attributes);
        istkbnxepw(iozdgvuglvVar, attributes);
        jlmebxxoox(iozdgvuglvVar, attributes);
        stevsuqkhv(iozdgvuglvVar, attributes);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = this.f21219zoijcleaow;
        if (pkzmftpjixVar == null) {
            this.f21214iobyxmoadg.lereixgezr(iozdgvuglvVar);
        } else {
            pkzmftpjixVar.nufgyqmvbu(iozdgvuglvVar);
        }
        this.f21219zoijcleaow = iozdgvuglvVar;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg fiwbwshyhd(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.LineThrough;
            case "underline":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.Underline;
            case "none":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.None;
            case "blink":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.Blink;
            case "overline":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.Overline;
            default:
                return null;
        }
    }

    private void fmlbqenlif(Attributes attributes) throws SVGParseException {
        draadjrbmk("<pattern>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv esjtqupxsvVar = new com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv();
        esjtqupxsvVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        esjtqupxsvVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(esjtqupxsvVar, attributes);
        tzroggbefp(esjtqupxsvVar, attributes);
        istkbnxepw(esjtqupxsvVar, attributes);
        jlmebxxoox(esjtqupxsvVar, attributes);
        hkdspvbjdz(esjtqupxsvVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(esjtqupxsvVar);
        this.f21219zoijcleaow = esjtqupxsvVar;
    }

    private Matrix fyldjkxazc(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        c0388dxjokdxxww.pmvmpeiblj();
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            String strOjitshcjhn = c0388dxjokdxxww.ojitshcjhn();
            if (strOjitshcjhn == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strOjitshcjhn) {
                case "matrix":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog2 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog3 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog4 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog5 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.lereixgezr();
                    float fAgtfadlqog6 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog6) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fAgtfadlqog, fAgtfadlqog3, fAgtfadlqog5, fAgtfadlqog2, fAgtfadlqog4, fAgtfadlqog6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog7 = c0388dxjokdxxww.agtfadlqog();
                    float fCqumvgiudr = c0388dxjokdxxww.cqumvgiudr();
                    float fCqumvgiudr2 = c0388dxjokdxxww.cqumvgiudr();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog7) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fCqumvgiudr)) {
                        matrix.preRotate(fAgtfadlqog7);
                    } else {
                        if (Float.isNaN(fCqumvgiudr2)) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fAgtfadlqog7, fCqumvgiudr, fCqumvgiudr2);
                    }
                    break;
                    break;
                case "scale":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog8 = c0388dxjokdxxww.agtfadlqog();
                    float fCqumvgiudr3 = c0388dxjokdxxww.cqumvgiudr();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog8) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fCqumvgiudr3)) {
                        matrix.preScale(fAgtfadlqog8, fCqumvgiudr3);
                    } else {
                        matrix.preScale(fAgtfadlqog8, fAgtfadlqog8);
                    }
                    break;
                    break;
                case "skewX":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog9 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog9) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fAgtfadlqog9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog10 = c0388dxjokdxxww.agtfadlqog();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog10) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fAgtfadlqog10)));
                    break;
                    break;
                case "translate":
                    c0388dxjokdxxww.pmvmpeiblj();
                    float fAgtfadlqog11 = c0388dxjokdxxww.agtfadlqog();
                    float fCqumvgiudr4 = c0388dxjokdxxww.cqumvgiudr();
                    c0388dxjokdxxww.pmvmpeiblj();
                    if (Float.isNaN(fAgtfadlqog11) || !c0388dxjokdxxww.gxszxtbevo(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fCqumvgiudr4)) {
                        matrix.preTranslate(fAgtfadlqog11, fCqumvgiudr4);
                    } else {
                        matrix.preTranslate(fAgtfadlqog11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strOjitshcjhn + ")");
            }
            if (c0388dxjokdxxww.nufgyqmvbu()) {
                return matrix;
            }
            c0388dxjokdxxww.lereixgezr();
        }
        return matrix;
    }

    private void g(Attributes attributes) throws SVGParseException {
        draadjrbmk("<symbol>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.kegysxyocb mbcevpiqjqVar = new com.caverock.androidsvg.lqeggnwhkg.mbcevpiqjq();
        mbcevpiqjqVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        mbcevpiqjqVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(mbcevpiqjqVar, attributes);
        tzroggbefp(mbcevpiqjqVar, attributes);
        istkbnxepw(mbcevpiqjqVar, attributes);
        jlmebxxoox(mbcevpiqjqVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(mbcevpiqjqVar);
        this.f21219zoijcleaow = mbcevpiqjqVar;
    }

    private void grlcpdaxtj(InputStream inputStream, boolean z13) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                btonecajqb btonecajqbVar = new btonecajqb(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        b();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(xmlPullParserNewPullParser.getText());
                        oxmwwwfdhm(c0388dxjokdxxww.oxmwwwfdhm(), roivzttewh(c0388dxjokdxxww));
                    } else if (eventType == 10) {
                        if (z13 && this.f21214iobyxmoadg.wflxmlrfwp() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                ipoelvxyzq(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, btonecajqbVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        rgvfuqvkyq(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        j(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        h(xmlPullParserNewPullParser.getText());
                    }
                }
                ojitshcjhn();
            } catch (IOException e13) {
                throw new SVGParseException("Stream error", e13);
            }
        } catch (XmlPullParserException e14) {
            throw new SVGParseException("XML parser problem", e14);
        }
    }

    private void gtknphoqwx(Attributes attributes) throws SVGParseException {
        draadjrbmk("<clipPath>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.eablkybsjg eablkybsjgVar = new com.caverock.androidsvg.lqeggnwhkg.eablkybsjg();
        eablkybsjgVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        eablkybsjgVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(eablkybsjgVar, attributes);
        tzroggbefp(eablkybsjgVar, attributes);
        sopmlzcsov(eablkybsjgVar, attributes);
        istkbnxepw(eablkybsjgVar, attributes);
        zynmafqrjb(eablkybsjgVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(eablkybsjgVar);
        this.f21219zoijcleaow = eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        if (this.f21217ppxfxbqfkf) {
            return;
        }
        if (this.f21212eablkybsjg) {
            if (this.f21215lqeggnwhkg == null) {
                this.f21215lqeggnwhkg = new StringBuilder(str.length());
            }
            this.f21215lqeggnwhkg.append(str);
        } else if (this.f21216nufgyqmvbu) {
            if (this.f21211dxjokdxxww == null) {
                this.f21211dxjokdxxww = new StringBuilder(str.length());
            }
            this.f21211dxjokdxxww.append(str);
        } else if (this.f21219zoijcleaow instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) {
            nufgyqmvbu(str);
        }
    }

    private void hcddaimhww(com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt kcexrzcfytVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                kcexrzcfytVar.f21461vdvldrhtss = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                kcexrzcfytVar.f21459oxmwwwfdhm = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                kcexrzcfytVar.f21457kcexrzcfyt = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                kcexrzcfytVar.f21462zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i14 != 43) {
                if (i14 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    kcexrzcfytVar.f21460rgvfuqvkyq = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    kcexrzcfytVar.f21460rgvfuqvkyq = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                kcexrzcfytVar.f21458ojitshcjhn = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                kcexrzcfytVar.f21458ojitshcjhn = Boolean.TRUE;
            }
        }
    }

    private void hkdspvbjdz(com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv esjtqupxsvVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                esjtqupxsvVar.f21420zdlpuopuiu = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                esjtqupxsvVar.f21419yggfygwlhe = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                esjtqupxsvVar.f21415jyumaefscl = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                esjtqupxsvVar.f21414iwizpuwonk = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i14 != 6) {
                switch (i14) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternUnits");
                            }
                            esjtqupxsvVar.f21418vdvldrhtss = Boolean.TRUE;
                        } else {
                            esjtqupxsvVar.f21418vdvldrhtss = Boolean.FALSE;
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternContentUnits");
                            }
                            esjtqupxsvVar.f21417oxmwwwfdhm = Boolean.TRUE;
                        } else {
                            esjtqupxsvVar.f21417oxmwwwfdhm = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        esjtqupxsvVar.f21416kcexrzcfyt = fyldjkxazc(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13))) {
                esjtqupxsvVar.f21413cqumvgiudr = strTrim;
            }
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo hszhottldk(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle;
            case "end":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.End;
            case "start":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start;
            default:
                return null;
        }
    }

    private void i(Attributes attributes) throws SVGParseException {
        draadjrbmk("<text>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov sopmlzcsovVar = new com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov();
        sopmlzcsovVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        sopmlzcsovVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(sopmlzcsovVar, attributes);
        tzroggbefp(sopmlzcsovVar, attributes);
        sopmlzcsov(sopmlzcsovVar, attributes);
        istkbnxepw(sopmlzcsovVar, attributes);
        ulzqkzuiru(sopmlzcsovVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(sopmlzcsovVar);
        this.f21219zoijcleaow = sopmlzcsovVar;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc igdgnonuha(String str) {
        if ("miter".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Miter;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Round;
        }
        if ("bevel".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Bevel;
        }
        return null;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo ikoacuggdj(String str) throws SVGParseException {
        Integer numIobyxmoadg = ppxfxbqfkf.iobyxmoadg(str);
        if (numIobyxmoadg != null) {
            return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo(numIobyxmoadg.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    private void iozdgvuglv(com.caverock.androidsvg.lqeggnwhkg.btonecajqb btonecajqbVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 != 6) {
                switch (i14) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            btonecajqbVar.f21401dxjokdxxww = Boolean.TRUE;
                        } else {
                            btonecajqbVar.f21401dxjokdxxww = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        btonecajqbVar.f21399btonecajqb = fyldjkxazc(strTrim);
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            btonecajqbVar.f21402gtknphoqwx = com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13))) {
                btonecajqbVar.f21400draadjrbmk = strTrim;
            }
        }
    }

    private void ipoelvxyzq(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this, null);
            xMLReader.setContentHandler(gxszxtbevoVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", gxszxtbevoVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e13) {
            throw new SVGParseException("Stream error", e13);
        } catch (ParserConfigurationException e14) {
            throw new SVGParseException("XML parser problem", e14);
        } catch (SAXException e15) {
            throw new SVGParseException("SVG parse error", e15);
        }
    }

    private void istkbnxepw(com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd lmojexxdydVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case 21:
                    lmojexxdydVar.gxszxtbevo(auzgnhcxok(strTrim));
                    break;
                case 22:
                    lmojexxdydVar.btonecajqb(strTrim);
                    break;
                case 23:
                    lmojexxdydVar.lqeggnwhkg(wizcaqwiak(strTrim));
                    break;
                case 24:
                    lmojexxdydVar.dxjokdxxww(iwxlajgraz(strTrim));
                    break;
                case C4007z9.F /* 25 */:
                    List listCzzsidtyhn = czzsidtyhn(strTrim);
                    lmojexxdydVar.wkgbmnqykc(listCzzsidtyhn != null ? new HashSet(listCzzsidtyhn) : new HashSet(0));
                    break;
            }
        }
    }

    private void iwizpuwonk(Attributes attributes) throws SVGParseException {
        draadjrbmk("<linearGradient>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz hkdspvbjdzVar = new com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz();
        hkdspvbjdzVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        hkdspvbjdzVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(hkdspvbjdzVar, attributes);
        tzroggbefp(hkdspvbjdzVar, attributes);
        iozdgvuglv(hkdspvbjdzVar, attributes);
        ylkuphrtab(hkdspvbjdzVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(hkdspvbjdzVar);
        this.f21219zoijcleaow = hkdspvbjdzVar;
    }

    private static Set iwxlajgraz(String str) {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        HashSet hashSet = new HashSet();
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            hashSet.add(c0388dxjokdxxww.oxmwwwfdhm());
            c0388dxjokdxxww.pmvmpeiblj();
        }
        return hashSet;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.zoijcleaow ixidwrxhsl(String str) throws SVGParseException {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        c0388dxjokdxxww.pmvmpeiblj();
        float fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
        c0388dxjokdxxww.lereixgezr();
        float fAgtfadlqog2 = c0388dxjokdxxww.agtfadlqog();
        c0388dxjokdxxww.lereixgezr();
        float fAgtfadlqog3 = c0388dxjokdxxww.agtfadlqog();
        c0388dxjokdxxww.lereixgezr();
        float fAgtfadlqog4 = c0388dxjokdxxww.agtfadlqog();
        if (Float.isNaN(fAgtfadlqog) || Float.isNaN(fAgtfadlqog2) || Float.isNaN(fAgtfadlqog3) || Float.isNaN(fAgtfadlqog4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fAgtfadlqog3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fAgtfadlqog4 >= 0.0f) {
            return new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(fAgtfadlqog, fAgtfadlqog2, fAgtfadlqog3, fAgtfadlqog4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    private static Float iyctptxqzt(String str) {
        try {
            float fXrmfcynszj = xrmfcynszj(str);
            float f13 = 0.0f;
            if (fXrmfcynszj < 0.0f) {
                fXrmfcynszj = f13;
            } else {
                f13 = 1.0f;
                if (fXrmfcynszj > 1.0f) {
                    fXrmfcynszj = f13;
                }
            }
            return Float.valueOf(fXrmfcynszj);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void j(char[] cArr, int i13, int i14) {
        if (this.f21217ppxfxbqfkf) {
            return;
        }
        if (this.f21212eablkybsjg) {
            if (this.f21215lqeggnwhkg == null) {
                this.f21215lqeggnwhkg = new StringBuilder(i14);
            }
            this.f21215lqeggnwhkg.append(cArr, i13, i14);
        } else if (this.f21216nufgyqmvbu) {
            if (this.f21211dxjokdxxww == null) {
                this.f21211dxjokdxxww = new StringBuilder(i14);
            }
            this.f21211dxjokdxxww.append(cArr, i13, i14);
        } else if (this.f21219zoijcleaow instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) {
            nufgyqmvbu(new String(cArr, i13, i14));
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo jhduphickx(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            com.caverock.androidsvg.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = com.caverock.androidsvg.ppxfxbqfkf.zoijcleaow(str, 1, str.length());
            if (ppxfxbqfkfVarZoijcleaow == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iIobyxmoadg = ppxfxbqfkfVarZoijcleaow.iobyxmoadg();
            if (iIobyxmoadg == 4) {
                int iWkgbmnqykc = ppxfxbqfkfVarZoijcleaow.wkgbmnqykc();
                int i13 = iWkgbmnqykc & 3840;
                int i14 = iWkgbmnqykc & 240;
                int i15 = iWkgbmnqykc & 15;
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo(i15 | (i13 << 8) | (-16777216) | (i13 << 12) | (i14 << 8) | (i14 << 4) | (i15 << 4));
            }
            if (iIobyxmoadg == 5) {
                int iWkgbmnqykc2 = ppxfxbqfkfVarZoijcleaow.wkgbmnqykc();
                int i16 = 61440 & iWkgbmnqykc2;
                int i17 = iWkgbmnqykc2 & 3840;
                int i18 = iWkgbmnqykc2 & 240;
                int i19 = iWkgbmnqykc2 & 15;
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo((i19 << 24) | (i19 << 28) | (i16 << 8) | (i16 << 4) | (i17 << 4) | i17 | i18 | (i18 >> 4));
            }
            if (iIobyxmoadg == 7) {
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo(ppxfxbqfkfVarZoijcleaow.wkgbmnqykc() | (-16777216));
            }
            if (iIobyxmoadg == 9) {
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo((ppxfxbqfkfVarZoijcleaow.wkgbmnqykc() >>> 8) | (ppxfxbqfkfVarZoijcleaow.wkgbmnqykc() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return ikoacuggdj(lowerCase);
            }
            C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str.substring(zStartsWith2 ? 5 : 4));
            c0388dxjokdxxww.pmvmpeiblj();
            float fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
            float fWkgbmnqykc = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog);
            if (!Float.isNaN(fWkgbmnqykc)) {
                c0388dxjokdxxww.gxszxtbevo('%');
            }
            float fWkgbmnqykc2 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc);
            if (!Float.isNaN(fWkgbmnqykc2)) {
                c0388dxjokdxxww.gxszxtbevo('%');
            }
            if (!zStartsWith2) {
                c0388dxjokdxxww.pmvmpeiblj();
                if (!Float.isNaN(fWkgbmnqykc2) && c0388dxjokdxxww.gxszxtbevo(')')) {
                    return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo(kcexrzcfyt(fAgtfadlqog, fWkgbmnqykc, fWkgbmnqykc2) | (-16777216));
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fWkgbmnqykc3 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc2);
            c0388dxjokdxxww.pmvmpeiblj();
            if (!Float.isNaN(fWkgbmnqykc3) && c0388dxjokdxxww.gxszxtbevo(')')) {
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo((btonecajqb(fWkgbmnqykc3 * 256.0f) << 24) | kcexrzcfyt(fAgtfadlqog, fWkgbmnqykc, fWkgbmnqykc2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        C0388dxjokdxxww c0388dxjokdxxww2 = new C0388dxjokdxxww(str.substring(zStartsWith ? 5 : 4));
        c0388dxjokdxxww2.pmvmpeiblj();
        float fAgtfadlqog2 = c0388dxjokdxxww2.agtfadlqog();
        if (!Float.isNaN(fAgtfadlqog2) && c0388dxjokdxxww2.gxszxtbevo('%')) {
            fAgtfadlqog2 = (fAgtfadlqog2 * 256.0f) / 100.0f;
        }
        float fWkgbmnqykc4 = c0388dxjokdxxww2.wkgbmnqykc(fAgtfadlqog2);
        if (!Float.isNaN(fWkgbmnqykc4) && c0388dxjokdxxww2.gxszxtbevo('%')) {
            fWkgbmnqykc4 = (fWkgbmnqykc4 * 256.0f) / 100.0f;
        }
        float fWkgbmnqykc5 = c0388dxjokdxxww2.wkgbmnqykc(fWkgbmnqykc4);
        if (!Float.isNaN(fWkgbmnqykc5) && c0388dxjokdxxww2.gxszxtbevo('%')) {
            fWkgbmnqykc5 = (fWkgbmnqykc5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            c0388dxjokdxxww2.pmvmpeiblj();
            if (!Float.isNaN(fWkgbmnqykc5) && c0388dxjokdxxww2.gxszxtbevo(')')) {
                return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo((btonecajqb(fAgtfadlqog2) << 16) | (-16777216) | (btonecajqb(fWkgbmnqykc4) << 8) | btonecajqb(fWkgbmnqykc5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fWkgbmnqykc6 = c0388dxjokdxxww2.wkgbmnqykc(fWkgbmnqykc5);
        c0388dxjokdxxww2.pmvmpeiblj();
        if (!Float.isNaN(fWkgbmnqykc6) && c0388dxjokdxxww2.gxszxtbevo(')')) {
            return new com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo((btonecajqb(fWkgbmnqykc6 * 256.0f) << 24) | (btonecajqb(fAgtfadlqog2) << 16) | (btonecajqb(fWkgbmnqykc4) << 8) | btonecajqb(fWkgbmnqykc5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    private void jlmebxxoox(com.caverock.androidsvg.lqeggnwhkg.kegysxyocb kegysxyocbVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 7) {
                tbqsvytpvh(kegysxyocbVar, strTrim);
            } else if (i14 == 87) {
                kegysxyocbVar.f21463rgvfuqvkyq = ixidwrxhsl(strTrim);
            }
        }
    }

    private void jpowsppfya(com.caverock.androidsvg.lqeggnwhkg.jyumaefscl jyumaefsclVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 8) {
                jyumaefsclVar.f21450ojitshcjhn = zeieaojujs(strTrim);
            } else if (i14 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(xrmfcynszj(strTrim));
                jyumaefsclVar.f21451rgvfuqvkyq = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void jrbgnlbqoe(Attributes attributes) throws SVGParseException {
        draadjrbmk("<path>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.jyumaefscl jyumaefsclVar = new com.caverock.androidsvg.lqeggnwhkg.jyumaefscl();
        jyumaefsclVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        jyumaefsclVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(jyumaefsclVar, attributes);
        tzroggbefp(jyumaefsclVar, attributes);
        sopmlzcsov(jyumaefsclVar, attributes);
        istkbnxepw(jyumaefsclVar, attributes);
        jpowsppfya(jyumaefsclVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(jyumaefsclVar);
    }

    private void jyumaefscl(Attributes attributes) throws SVGParseException {
        draadjrbmk("<line>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss vdvldrhtssVar = new com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss();
        vdvldrhtssVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        vdvldrhtssVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(vdvldrhtssVar, attributes);
        tzroggbefp(vdvldrhtssVar, attributes);
        sopmlzcsov(vdvldrhtssVar, attributes);
        istkbnxepw(vdvldrhtssVar, attributes);
        wwaezpbzkn(vdvldrhtssVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(vdvldrhtssVar);
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg jztzpxfvev(String str) {
        if ("nonzero".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg.NonZero;
        }
        if ("evenodd".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg.EvenOdd;
        }
        return null;
    }

    private void k(Attributes attributes) throws SVGParseException {
        draadjrbmk("<textPath>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb ribwqtqdhbVar = new com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb();
        ribwqtqdhbVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        ribwqtqdhbVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(ribwqtqdhbVar, attributes);
        tzroggbefp(ribwqtqdhbVar, attributes);
        istkbnxepw(ribwqtqdhbVar, attributes);
        ntlheqmsrt(ribwqtqdhbVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(ribwqtqdhbVar);
        this.f21219zoijcleaow = ribwqtqdhbVar;
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = ribwqtqdhbVar.f21406zoijcleaow;
        if (pkzmftpjixVar instanceof com.caverock.androidsvg.lqeggnwhkg.jhduphickx) {
            ribwqtqdhbVar.ojitshcjhn((com.caverock.androidsvg.lqeggnwhkg.jhduphickx) pkzmftpjixVar);
        } else {
            ribwqtqdhbVar.ojitshcjhn(((com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz) pkzmftpjixVar).eablkybsjg());
        }
    }

    private static int kcexrzcfyt(float f13, float f14, float f15) {
        float f16 = 0.0f;
        float f17 = f13 % 360.0f;
        if (f13 < 0.0f) {
            f17 += 360.0f;
        }
        float f18 = f17 / 60.0f;
        float f19 = f14 / 100.0f;
        float f23 = f15 / 100.0f;
        if (f19 < 0.0f) {
            f19 = 0.0f;
        } else if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (f23 >= 0.0f) {
            f16 = f23 > 1.0f ? 1.0f : f23;
        }
        float f24 = f16 <= 0.5f ? (f19 + 1.0f) * f16 : (f16 + f19) - (f19 * f16);
        float f25 = (f16 * 2.0f) - f24;
        return btonecajqb(zdlpuopuiu(f25, f24, f18 - 2.0f) * 256.0f) | (btonecajqb(zdlpuopuiu(f25, f24, f18 + 2.0f) * 256.0f) << 16) | (btonecajqb(zdlpuopuiu(f25, f24, f18) * 256.0f) << 8);
    }

    private void kegysxyocb(com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh cdpycssgdhVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            if (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()] == 37) {
                cdpycssgdhVar.f21404nufgyqmvbu = zfvoamnweg(strTrim);
            }
        }
    }

    private void krqnebusok(Attributes attributes) throws SVGParseException {
        draadjrbmk("<rect>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb zynmafqrjbVar = new com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb();
        zynmafqrjbVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        zynmafqrjbVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(zynmafqrjbVar, attributes);
        tzroggbefp(zynmafqrjbVar, attributes);
        sopmlzcsov(zynmafqrjbVar, attributes);
        istkbnxepw(zynmafqrjbVar, attributes);
        wypolnanlu(zynmafqrjbVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(zynmafqrjbVar);
    }

    private void l(Attributes attributes) throws SVGParseException {
        draadjrbmk("<tref>", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = this.f21219zoijcleaow;
        if (pkzmftpjixVar == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(pkzmftpjixVar instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt ntlheqmsrtVar = new com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt();
        ntlheqmsrtVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        ntlheqmsrtVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(ntlheqmsrtVar, attributes);
        tzroggbefp(ntlheqmsrtVar, attributes);
        istkbnxepw(ntlheqmsrtVar, attributes);
        mbcevpiqjq(ntlheqmsrtVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(ntlheqmsrtVar);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar2 = ntlheqmsrtVar.f21406zoijcleaow;
        if (pkzmftpjixVar2 instanceof com.caverock.androidsvg.lqeggnwhkg.jhduphickx) {
            ntlheqmsrtVar.ojitshcjhn((com.caverock.androidsvg.lqeggnwhkg.jhduphickx) pkzmftpjixVar2);
        } else {
            ntlheqmsrtVar.ojitshcjhn(((com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz) pkzmftpjixVar2).eablkybsjg());
        }
    }

    private void lmojexxdyd(com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn ojitshcjhnVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                ojitshcjhnVar.f21471vdvldrhtss = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                ojitshcjhnVar.f21469oxmwwwfdhm = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                ojitshcjhnVar.f21468kcexrzcfyt = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                ojitshcjhnVar.f21473zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i14 != 6) {
                if (i14 == 7) {
                    tbqsvytpvh(ojitshcjhnVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13))) {
                ojitshcjhnVar.f21470rgvfuqvkyq = strTrim;
            }
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus lrnfpwlwnk(String str) {
        if (!str.startsWith("url(")) {
            return okpsazkaxt(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe(strTrim, strTrim2.length() > 0 ? okpsazkaxt(strTrim2) : null);
    }

    private static void lxfrhoxuzk(com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar, String str) {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strKcexrzcfyt = c0388dxjokdxxww.kcexrzcfyt(':');
            c0388dxjokdxxww.pmvmpeiblj();
            if (!c0388dxjokdxxww.gxszxtbevo(':')) {
                return;
            }
            c0388dxjokdxxww.pmvmpeiblj();
            String strYggfygwlhe = c0388dxjokdxxww.yggfygwlhe(';');
            if (strYggfygwlhe == null) {
                return;
            }
            c0388dxjokdxxww.pmvmpeiblj();
            if (c0388dxjokdxxww.nufgyqmvbu() || c0388dxjokdxxww.gxszxtbevo(';')) {
                if (jpowsppfyaVar.f21446gxszxtbevo == null) {
                    jpowsppfyaVar.f21446gxszxtbevo = new com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt();
                }
                yzdjzghtvl(jpowsppfyaVar.f21446gxszxtbevo, strKcexrzcfyt, strYggfygwlhe);
                c0388dxjokdxxww.pmvmpeiblj();
            }
        }
    }

    private void m(Attributes attributes) throws SVGParseException {
        draadjrbmk("<tspan>", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = this.f21219zoijcleaow;
        if (pkzmftpjixVar == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(pkzmftpjixVar instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        com.caverock.androidsvg.lqeggnwhkg.ulzqkzuiru ulzqkzuiruVar = new com.caverock.androidsvg.lqeggnwhkg.ulzqkzuiru();
        ulzqkzuiruVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        ulzqkzuiruVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(ulzqkzuiruVar, attributes);
        tzroggbefp(ulzqkzuiruVar, attributes);
        istkbnxepw(ulzqkzuiruVar, attributes);
        ulzqkzuiru(ulzqkzuiruVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(ulzqkzuiruVar);
        this.f21219zoijcleaow = ulzqkzuiruVar;
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar2 = ulzqkzuiruVar.f21406zoijcleaow;
        if (pkzmftpjixVar2 instanceof com.caverock.androidsvg.lqeggnwhkg.jhduphickx) {
            ulzqkzuiruVar.ojitshcjhn((com.caverock.androidsvg.lqeggnwhkg.jhduphickx) pkzmftpjixVar2);
        } else {
            ulzqkzuiruVar.ojitshcjhn(((com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz) pkzmftpjixVar2).eablkybsjg());
        }
    }

    private void mbcevpiqjq(com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt ntlheqmsrtVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            if (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()] == 6 && ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13)))) {
                ntlheqmsrtVar.f21466ojitshcjhn = strTrim;
            }
        }
    }

    private static float metgxyhuhe(String str, int i13, int i14) throws SVGParseException {
        float fZoijcleaow = new com.caverock.androidsvg.wkgbmnqykc().zoijcleaow(str, i13, i14);
        if (!Float.isNaN(fZoijcleaow)) {
            return fZoijcleaow;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.dxjokdxxww mhtqkkgtqm(String str) {
        str.hashCode();
        if (str.equals(DevicePublicKeyStringDef.NONE)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.dxjokdxxww.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.dxjokdxxww.NonScalingStroke;
        }
        return null;
    }

    private void n(Attributes attributes) throws SVGParseException {
        draadjrbmk("<use>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev jztzpxfvevVar = new com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev();
        jztzpxfvevVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        jztzpxfvevVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(jztzpxfvevVar, attributes);
        tzroggbefp(jztzpxfvevVar, attributes);
        sopmlzcsov(jztzpxfvevVar, attributes);
        istkbnxepw(jztzpxfvevVar, attributes);
        crxdokpmqz(jztzpxfvevVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(jztzpxfvevVar);
        this.f21219zoijcleaow = jztzpxfvevVar;
    }

    private void ntlheqmsrt(com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb ribwqtqdhbVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 != 6) {
                if (i14 == 39) {
                    ribwqtqdhbVar.f21497rgvfuqvkyq = oipsdeybqn(strTrim);
                }
            } else if ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13))) {
                ribwqtqdhbVar.f21496ojitshcjhn = strTrim;
            }
        }
    }

    private void nufgyqmvbu(String str) {
        com.caverock.androidsvg.lqeggnwhkg.wwaezpbzkn wwaezpbzknVar = (com.caverock.androidsvg.lqeggnwhkg.wwaezpbzkn) this.f21219zoijcleaow;
        int size = wwaezpbzknVar.f21521dxjokdxxww.size();
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar = size == 0 ? null : (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) wwaezpbzknVar.f21521dxjokdxxww.get(size - 1);
        if (!(cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj)) {
            this.f21219zoijcleaow.nufgyqmvbu(new com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj(str));
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj ikoacuggdjVar = (com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj) cllcsxoeizVar;
        sb3.append(ikoacuggdjVar.f21433ppxfxbqfkf);
        sb3.append(str);
        ikoacuggdjVar.f21433ppxfxbqfkf = sb3.toString();
    }

    static com.caverock.androidsvg.eablkybsjg nuxfzjnpeb(String str) throws SVGParseException {
        com.caverock.androidsvg.eablkybsjg.zoijcleaow zoijcleaowVar;
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        c0388dxjokdxxww.pmvmpeiblj();
        String strOxmwwwfdhm = c0388dxjokdxxww.oxmwwwfdhm();
        if ("defer".equals(strOxmwwwfdhm)) {
            c0388dxjokdxxww.pmvmpeiblj();
            strOxmwwwfdhm = c0388dxjokdxxww.oxmwwwfdhm();
        }
        com.caverock.androidsvg.eablkybsjg.iobyxmoadg iobyxmoadgVarIobyxmoadg = zoijcleaow.iobyxmoadg(strOxmwwwfdhm);
        c0388dxjokdxxww.pmvmpeiblj();
        if (c0388dxjokdxxww.nufgyqmvbu()) {
            zoijcleaowVar = null;
        } else {
            String strOxmwwwfdhm2 = c0388dxjokdxxww.oxmwwwfdhm();
            strOxmwwwfdhm2.hashCode();
            if (strOxmwwwfdhm2.equals("meet")) {
                zoijcleaowVar = com.caverock.androidsvg.eablkybsjg.zoijcleaow.meet;
            } else {
                if (!strOxmwwwfdhm2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                zoijcleaowVar = com.caverock.androidsvg.eablkybsjg.zoijcleaow.slice;
            }
        }
        return new com.caverock.androidsvg.eablkybsjg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar);
    }

    private void o(Attributes attributes) throws SVGParseException {
        draadjrbmk("<view>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.kegysxyocb xrmfcynszjVar = new com.caverock.androidsvg.lqeggnwhkg.xrmfcynszj();
        xrmfcynszjVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        xrmfcynszjVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(xrmfcynszjVar, attributes);
        istkbnxepw(xrmfcynszjVar, attributes);
        jlmebxxoox(xrmfcynszjVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(xrmfcynszjVar);
        this.f21219zoijcleaow = xrmfcynszjVar;
    }

    static com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq oipsdeybqn(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt okpsazkaxtVarValueOf = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            okpsazkaxtVarValueOf = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                okpsazkaxtVarValueOf = com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(metgxyhuhe(str, 0, length), okpsazkaxtVarValueOf);
        } catch (NumberFormatException e13) {
            throw new SVGParseException("Invalid length value: " + str, e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn() {
    }

    private static com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus okpsazkaxt(String str) {
        str.hashCode();
        if (str.equals(DevicePublicKeyStringDef.NONE)) {
            return com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo.f21425jyumaefscl;
        }
        if (str.equals("currentColor")) {
            return com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg.iobyxmoadg();
        }
        try {
            return jhduphickx(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq opjhrmiecq(C0388dxjokdxxww c0388dxjokdxxww) {
        return c0388dxjokdxxww.lqeggnwhkg("auto") ? new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(0.0f) : c0388dxjokdxxww.rgvfuqvkyq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oxmwwwfdhm(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx();
        }
    }

    private void p(Attributes attributes) throws SVGParseException {
        draadjrbmk("<switch>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.tzroggbefp tzroggbefpVar = new com.caverock.androidsvg.lqeggnwhkg.tzroggbefp();
        tzroggbefpVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        tzroggbefpVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(tzroggbefpVar, attributes);
        tzroggbefp(tzroggbefpVar, attributes);
        sopmlzcsov(tzroggbefpVar, attributes);
        istkbnxepw(tzroggbefpVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(tzroggbefpVar);
        this.f21219zoijcleaow = tzroggbefpVar;
    }

    private void pkzmftpjix(com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm oxmwwwfdhmVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case C4007z9.G /* 26 */:
                    oxmwwwfdhmVar.f21486oxmwwwfdhm = oipsdeybqn(strTrim);
                    break;
                case 27:
                    oxmwwwfdhmVar.f21485kcexrzcfyt = oipsdeybqn(strTrim);
                    break;
                case 28:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                    oxmwwwfdhmVar.f21489zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn;
                    if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case C4007z9.I /* 29 */:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                    oxmwwwfdhmVar.f21488yggfygwlhe = rgvfuqvkyqVarOipsdeybqn2;
                    if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        oxmwwwfdhmVar.f21487vdvldrhtss = true;
                    } else {
                        oxmwwwfdhmVar.f21487vdvldrhtss = false;
                    }
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    if ("auto".equals(strTrim)) {
                        oxmwwwfdhmVar.f21484jyumaefscl = Float.valueOf(Float.NaN);
                    } else {
                        oxmwwwfdhmVar.f21484jyumaefscl = Float.valueOf(xrmfcynszj(strTrim));
                    }
                    break;
            }
        }
    }

    private void pmvmpeiblj(com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case 12:
                    wkgbmnqykcVar.f21515ojitshcjhn = oipsdeybqn(strTrim);
                    break;
                case 13:
                    wkgbmnqykcVar.f21516rgvfuqvkyq = oipsdeybqn(strTrim);
                    break;
                case 14:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                    wkgbmnqykcVar.f21517vdvldrhtss = rgvfuqvkyqVarOipsdeybqn;
                    if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(String str, String str2, String str3) {
        if (this.f21217ppxfxbqfkf) {
            int i13 = this.f21218wkgbmnqykc - 1;
            this.f21218wkgbmnqykc = i13;
            if (i13 == 0) {
                this.f21217ppxfxbqfkf = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i14 = iobyxmoadg.f21228iobyxmoadg[nufgyqmvbu.iobyxmoadg(str2).ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 5 && i14 != 13 && i14 != 14) {
                switch (i14) {
                    case 22:
                    case 23:
                        this.f21212eablkybsjg = false;
                        StringBuilder sb3 = this.f21215lqeggnwhkg;
                        if (sb3 != null) {
                            nufgyqmvbu nufgyqmvbuVar = this.f21213gxszxtbevo;
                            if (nufgyqmvbuVar == nufgyqmvbu.title) {
                                this.f21214iobyxmoadg.pmvmpeiblj(sb3.toString());
                            } else if (nufgyqmvbuVar == nufgyqmvbu.desc) {
                                this.f21214iobyxmoadg.kcexrzcfyt(sb3.toString());
                            }
                            this.f21215lqeggnwhkg.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb4 = this.f21211dxjokdxxww;
                        if (sb4 != null) {
                            this.f21216nufgyqmvbu = false;
                            ribwqtqdhb(sb4.toString());
                            this.f21211dxjokdxxww.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f21219zoijcleaow = ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) this.f21219zoijcleaow).f21406zoijcleaow;
        }
    }

    private void rhgxfdycjh(Attributes attributes) throws SVGParseException {
        draadjrbmk("<polyline>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.lereixgezr lereixgezrVar = new com.caverock.androidsvg.lqeggnwhkg.lereixgezr();
        lereixgezrVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        lereixgezrVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(lereixgezrVar, attributes);
        tzroggbefp(lereixgezrVar, attributes);
        sopmlzcsov(lereixgezrVar, attributes);
        istkbnxepw(lereixgezrVar, attributes);
        cllcsxoeiz(lereixgezrVar, attributes, "polyline");
        this.f21219zoijcleaow.nufgyqmvbu(lereixgezrVar);
    }

    private void ribwqtqdhb(String str) {
        this.f21214iobyxmoadg.iobyxmoadg(new com.caverock.androidsvg.zoijcleaow(com.caverock.androidsvg.zoijcleaow.gxszxtbevo.screen, com.caverock.androidsvg.zoijcleaow.yggfygwlhe.Document).wkgbmnqykc(str));
    }

    private static void rlfsiqarku(com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar, String str) {
        String strKcexrzcfyt;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
            Integer numIobyxmoadg = null;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow zoijcleaowVarYfnezrywwk = null;
            String str2 = null;
            while (true) {
                strKcexrzcfyt = c0388dxjokdxxww.kcexrzcfyt('/');
                c0388dxjokdxxww.pmvmpeiblj();
                if (strKcexrzcfyt != null) {
                    if (numIobyxmoadg != null && zoijcleaowVarYfnezrywwk != null) {
                        break;
                    }
                    if (!strKcexrzcfyt.equals("normal") && (numIobyxmoadg != null || (numIobyxmoadg = eablkybsjg.iobyxmoadg(strKcexrzcfyt)) == null)) {
                        if (zoijcleaowVarYfnezrywwk != null || (zoijcleaowVarYfnezrywwk = yfnezrywwk(strKcexrzcfyt)) == null) {
                            if (str2 != null || !strKcexrzcfyt.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strKcexrzcfyt;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarUwvvkdfqfp = uwvvkdfqfp(strKcexrzcfyt);
            if (c0388dxjokdxxww.gxszxtbevo('/')) {
                c0388dxjokdxxww.pmvmpeiblj();
                String strOxmwwwfdhm = c0388dxjokdxxww.oxmwwwfdhm();
                if (strOxmwwwfdhm != null) {
                    try {
                        oipsdeybqn(strOxmwwwfdhm);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                c0388dxjokdxxww.pmvmpeiblj();
            }
            yadqdtsiqtVar.f21556wwaezpbzkn = czzsidtyhn(c0388dxjokdxxww.esjtqupxsv());
            yadqdtsiqtVar.f21561ylkuphrtab = rgvfuqvkyqVarUwvvkdfqfp;
            yadqdtsiqtVar.f21548pkzmftpjix = Integer.valueOf(numIobyxmoadg == null ? OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST : numIobyxmoadg.intValue());
            if (zoijcleaowVarYfnezrywwk == null) {
                zoijcleaowVarYfnezrywwk = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow.Normal;
            }
            yadqdtsiqtVar.f21531hcddaimhww = zoijcleaowVarYfnezrywwk;
            yadqdtsiqtVar.f21562zdlpuopuiu |= 122880;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map roivzttewh(C0388dxjokdxxww c0388dxjokdxxww) {
        HashMap map = new HashMap();
        c0388dxjokdxxww.pmvmpeiblj();
        String strKcexrzcfyt = c0388dxjokdxxww.kcexrzcfyt('=');
        while (strKcexrzcfyt != null) {
            c0388dxjokdxxww.gxszxtbevo('=');
            map.put(strKcexrzcfyt, c0388dxjokdxxww.vdvldrhtss());
            c0388dxjokdxxww.pmvmpeiblj();
            strKcexrzcfyt = c0388dxjokdxxww.kcexrzcfyt('=');
        }
        return map;
    }

    private static String sflfametgt(String str, String str2) {
        if (!str.equals(DevicePublicKeyStringDef.NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf skhdrjzrfn(String str) {
        if ("butt".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Butt;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Round;
        }
        if ("square".equals(str)) {
            return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Square;
        }
        return null;
    }

    private void sopmlzcsov(com.caverock.androidsvg.lqeggnwhkg.agtfadlqog agtfadlqogVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            if (lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)) == lqeggnwhkg.transform) {
                agtfadlqogVar.gtknphoqwx(fyldjkxazc(attributes.getValue(i13)));
            }
        }
    }

    private void stevsuqkhv(com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                iozdgvuglvVar.f21438vdvldrhtss = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                iozdgvuglvVar.f21437oxmwwwfdhm = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                iozdgvuglvVar.f21436kcexrzcfyt = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                iozdgvuglvVar.f21440zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i14 == 5) {
                iozdgvuglvVar.f21439yggfygwlhe = strTrim;
            }
        }
    }

    private static void tbqsvytpvh(com.caverock.androidsvg.lqeggnwhkg.wypolnanlu wypolnanluVar, String str) {
        wypolnanluVar.f21524ojitshcjhn = nuxfzjnpeb(str);
    }

    private void tzroggbefp(com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            if (strTrim.length() != 0) {
                int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
                if (i14 == 45) {
                    lxfrhoxuzk(jpowsppfyaVar, strTrim);
                } else if (i14 != 46) {
                    if (jpowsppfyaVar.f21445eablkybsjg == null) {
                        jpowsppfyaVar.f21445eablkybsjg = new com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt();
                    }
                    yzdjzghtvl(jpowsppfyaVar.f21445eablkybsjg, attributes.getLocalName(i13), attributes.getValue(i13).trim());
                } else {
                    jpowsppfyaVar.f21447lqeggnwhkg = com.caverock.androidsvg.zoijcleaow.gxszxtbevo(strTrim);
                }
            }
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg uawqvzlxes(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg.optimizeQuality;
            case "auto":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg.auto;
            case "optimizeSpeed":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg.optimizeSpeed;
            default:
                return null;
        }
    }

    private void ulzqkzuiru(com.caverock.androidsvg.lqeggnwhkg.vipkmwdibw vipkmwdibwVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                vipkmwdibwVar.f21510ojitshcjhn = bfopjjpdmp(strTrim);
            } else if (i14 == 2) {
                vipkmwdibwVar.f21512rgvfuqvkyq = bfopjjpdmp(strTrim);
            } else if (i14 == 19) {
                vipkmwdibwVar.f21513vdvldrhtss = bfopjjpdmp(strTrim);
            } else if (i14 == 20) {
                vipkmwdibwVar.f21511oxmwwwfdhm = bfopjjpdmp(strTrim);
            }
        }
    }

    private static com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq uwvvkdfqfp(String str) {
        try {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = wkgbmnqykc.iobyxmoadg(str);
            return rgvfuqvkyqVarIobyxmoadg == null ? oipsdeybqn(str) : rgvfuqvkyqVarIobyxmoadg;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void vdvldrhtss(Attributes attributes) throws SVGParseException {
        draadjrbmk("<g>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp wflxmlrfwpVar = new com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp();
        wflxmlrfwpVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        wflxmlrfwpVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(wflxmlrfwpVar, attributes);
        tzroggbefp(wflxmlrfwpVar, attributes);
        sopmlzcsov(wflxmlrfwpVar, attributes);
        istkbnxepw(wflxmlrfwpVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(wflxmlrfwpVar);
        this.f21219zoijcleaow = wflxmlrfwpVar;
    }

    private static com.caverock.androidsvg.lqeggnwhkg.ppxfxbqfkf vipkmwdibw(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str.substring(5));
        c0388dxjokdxxww.pmvmpeiblj();
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOpjhrmiecq = opjhrmiecq(c0388dxjokdxxww);
        c0388dxjokdxxww.lereixgezr();
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOpjhrmiecq2 = opjhrmiecq(c0388dxjokdxxww);
        c0388dxjokdxxww.lereixgezr();
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOpjhrmiecq3 = opjhrmiecq(c0388dxjokdxxww);
        c0388dxjokdxxww.lereixgezr();
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOpjhrmiecq4 = opjhrmiecq(c0388dxjokdxxww);
        c0388dxjokdxxww.pmvmpeiblj();
        if (c0388dxjokdxxww.gxszxtbevo(')') || c0388dxjokdxxww.nufgyqmvbu()) {
            return new com.caverock.androidsvg.lqeggnwhkg.ppxfxbqfkf(rgvfuqvkyqVarOpjhrmiecq, rgvfuqvkyqVarOpjhrmiecq2, rgvfuqvkyqVarOpjhrmiecq3, rgvfuqvkyqVarOpjhrmiecq4);
        }
        return null;
    }

    private static Boolean weqkydbzbr(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private void wflxmlrfwp(Attributes attributes) throws SVGParseException {
        draadjrbmk("<defs>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.nufgyqmvbu nufgyqmvbuVar = new com.caverock.androidsvg.lqeggnwhkg.nufgyqmvbu();
        nufgyqmvbuVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        nufgyqmvbuVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(nufgyqmvbuVar, attributes);
        tzroggbefp(nufgyqmvbuVar, attributes);
        sopmlzcsov(nufgyqmvbuVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(nufgyqmvbuVar);
        this.f21219zoijcleaow = nufgyqmvbuVar;
    }

    private static Set wizcaqwiak(String str) {
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        HashSet hashSet = new HashSet();
        while (!c0388dxjokdxxww.nufgyqmvbu()) {
            String strOxmwwwfdhm = c0388dxjokdxxww.oxmwwwfdhm();
            int iIndexOf = strOxmwwwfdhm.indexOf(45);
            if (iIndexOf != -1) {
                strOxmwwwfdhm = strOxmwwwfdhm.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strOxmwwwfdhm, "", "").getLanguage());
            c0388dxjokdxxww.pmvmpeiblj();
        }
        return hashSet;
    }

    private void wwaezpbzkn(com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss vdvldrhtssVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case 15:
                    vdvldrhtssVar.f21506ojitshcjhn = oipsdeybqn(strTrim);
                    break;
                case 16:
                    vdvldrhtssVar.f21508rgvfuqvkyq = oipsdeybqn(strTrim);
                    break;
                case 17:
                    vdvldrhtssVar.f21509vdvldrhtss = oipsdeybqn(strTrim);
                    break;
                case 18:
                    vdvldrhtssVar.f21507oxmwwwfdhm = oipsdeybqn(strTrim);
                    break;
            }
        }
    }

    private void wypolnanlu(com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb zynmafqrjbVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            int i14 = iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()];
            if (i14 == 1) {
                zynmafqrjbVar.f21611ojitshcjhn = oipsdeybqn(strTrim);
            } else if (i14 == 2) {
                zynmafqrjbVar.f21613rgvfuqvkyq = oipsdeybqn(strTrim);
            } else if (i14 == 3) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                zynmafqrjbVar.f21614vdvldrhtss = rgvfuqvkyqVarOipsdeybqn;
                if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i14 == 4) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                zynmafqrjbVar.f21612oxmwwwfdhm = rgvfuqvkyqVarOipsdeybqn2;
                if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i14 == 10) {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn3 = oipsdeybqn(strTrim);
                zynmafqrjbVar.f21610kcexrzcfyt = rgvfuqvkyqVarOipsdeybqn3;
                if (rgvfuqvkyqVarOipsdeybqn3.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i14 != 11) {
                continue;
            } else {
                com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn4 = oipsdeybqn(strTrim);
                zynmafqrjbVar.f21615zdlpuopuiu = rgvfuqvkyqVarOipsdeybqn4;
                if (rgvfuqvkyqVarOipsdeybqn4.lqeggnwhkg()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private static float xrmfcynszj(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return metgxyhuhe(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    private void yadqdtsiqt(com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww dxjokdxxwwVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case 10:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn = oipsdeybqn(strTrim);
                    dxjokdxxwwVar.f21411vdvldrhtss = rgvfuqvkyqVarOipsdeybqn;
                    if (rgvfuqvkyqVarOipsdeybqn.lqeggnwhkg()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarOipsdeybqn2 = oipsdeybqn(strTrim);
                    dxjokdxxwwVar.f21409oxmwwwfdhm = rgvfuqvkyqVarOipsdeybqn2;
                    if (rgvfuqvkyqVarOipsdeybqn2.lqeggnwhkg()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    dxjokdxxwwVar.f21408ojitshcjhn = oipsdeybqn(strTrim);
                    break;
                case 13:
                    dxjokdxxwwVar.f21410rgvfuqvkyq = oipsdeybqn(strTrim);
                    break;
            }
        }
    }

    private static Integer ydmasvzmpa(String str) {
        return eablkybsjg.iobyxmoadg(str);
    }

    private static com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow yfnezrywwk(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow.Oblique;
            case "italic":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow.Italic;
            case "normal":
                return com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow.Normal;
            default:
                return null;
        }
    }

    private void yggfygwlhe(Attributes attributes) throws SVGParseException {
        draadjrbmk("<image>", new Object[0]);
        if (this.f21219zoijcleaow == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn ojitshcjhnVar = new com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn();
        ojitshcjhnVar.f21405iobyxmoadg = this.f21214iobyxmoadg;
        ojitshcjhnVar.f21406zoijcleaow = this.f21219zoijcleaow;
        cdpycssgdh(ojitshcjhnVar, attributes);
        tzroggbefp(ojitshcjhnVar, attributes);
        sopmlzcsov(ojitshcjhnVar, attributes);
        istkbnxepw(ojitshcjhnVar, attributes);
        lmojexxdyd(ojitshcjhnVar, attributes);
        this.f21219zoijcleaow.nufgyqmvbu(ojitshcjhnVar);
        this.f21219zoijcleaow = ojitshcjhnVar;
    }

    private void ylkuphrtab(com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz hkdspvbjdzVar, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()]) {
                case 15:
                    hkdspvbjdzVar.f21432wflxmlrfwp = oipsdeybqn(strTrim);
                    break;
                case 16:
                    hkdspvbjdzVar.f21429agtfadlqog = oipsdeybqn(strTrim);
                    break;
                case 17:
                    hkdspvbjdzVar.f21430ojitshcjhn = oipsdeybqn(strTrim);
                    break;
                case 18:
                    hkdspvbjdzVar.f21431rgvfuqvkyq = oipsdeybqn(strTrim);
                    break;
            }
        }
    }

    static void yzdjzghtvl(com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(str).ordinal()]) {
                case 47:
                    com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVarLrnfpwlwnk = lrnfpwlwnk(str2);
                    yadqdtsiqtVar.f21560yggfygwlhe = dsvhmnatusVarLrnfpwlwnk;
                    if (dsvhmnatusVarLrnfpwlwnk != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 1;
                        return;
                    }
                    return;
                case 48:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg iobyxmoadgVarJztzpxfvev = jztzpxfvev(str2);
                    yadqdtsiqtVar.f21540jyumaefscl = iobyxmoadgVarJztzpxfvev;
                    if (iobyxmoadgVarJztzpxfvev != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fIyctptxqzt = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21536iwizpuwonk = fIyctptxqzt;
                    if (fIyctptxqzt != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 4;
                        return;
                    }
                    return;
                case 50:
                    com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVarLrnfpwlwnk2 = lrnfpwlwnk(str2);
                    yadqdtsiqtVar.f21527cqumvgiudr = dsvhmnatusVarLrnfpwlwnk2;
                    if (dsvhmnatusVarLrnfpwlwnk2 != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fIyctptxqzt2 = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21530esjtqupxsv = fIyctptxqzt2;
                    if (fIyctptxqzt2 != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 16;
                        return;
                    }
                    return;
                case 52:
                    yadqdtsiqtVar.f21543lereixgezr = oipsdeybqn(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 32;
                    break;
                case 53:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf ppxfxbqfkfVarSkhdrjzrfn = skhdrjzrfn(str2);
                    yadqdtsiqtVar.f21549pmvmpeiblj = ppxfxbqfkfVarSkhdrjzrfn;
                    if (ppxfxbqfkfVarSkhdrjzrfn != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 64;
                        return;
                    }
                    return;
                case 54:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc wkgbmnqykcVarIgdgnonuha = igdgnonuha(str2);
                    yadqdtsiqtVar.f21563zynmafqrjb = wkgbmnqykcVarIgdgnonuha;
                    if (wkgbmnqykcVarIgdgnonuha != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 128;
                        return;
                    }
                    return;
                case 55:
                    yadqdtsiqtVar.f21535istkbnxepw = Float.valueOf(xrmfcynszj(str2));
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 256;
                    break;
                case 56:
                    if (DevicePublicKeyStringDef.NONE.equals(str2)) {
                        yadqdtsiqtVar.f21525cdpycssgdh = null;
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 512;
                        return;
                    }
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq[] rgvfuqvkyqVarArrDvvnrvtcbc = dvvnrvtcbc(str2);
                    yadqdtsiqtVar.f21525cdpycssgdh = rgvfuqvkyqVarArrDvvnrvtcbc;
                    if (rgvfuqvkyqVarArrDvvnrvtcbc != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 512;
                        return;
                    }
                    return;
                case 57:
                    yadqdtsiqtVar.f21559yadqdtsiqt = oipsdeybqn(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 1024;
                    break;
                case 58:
                    yadqdtsiqtVar.f21534iozdgvuglv = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 2048;
                    return;
                case 59:
                    yadqdtsiqtVar.f21544lmojexxdyd = jhduphickx(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 4096;
                    break;
                case 60:
                    rlfsiqarku(yadqdtsiqtVar, str2);
                    return;
                case 61:
                    List listCzzsidtyhn = czzsidtyhn(str2);
                    yadqdtsiqtVar.f21556wwaezpbzkn = listCzzsidtyhn;
                    if (listCzzsidtyhn != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 8192;
                        return;
                    }
                    return;
                case 62:
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVarUwvvkdfqfp = uwvvkdfqfp(str2);
                    yadqdtsiqtVar.f21561ylkuphrtab = rgvfuqvkyqVarUwvvkdfqfp;
                    if (rgvfuqvkyqVarUwvvkdfqfp != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numYdmasvzmpa = ydmasvzmpa(str2);
                    yadqdtsiqtVar.f21548pkzmftpjix = numYdmasvzmpa;
                    if (numYdmasvzmpa != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 32768;
                        return;
                    }
                    return;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow zoijcleaowVarYfnezrywwk = yfnezrywwk(str2);
                    yadqdtsiqtVar.f21531hcddaimhww = zoijcleaowVarYfnezrywwk;
                    if (zoijcleaowVarYfnezrywwk != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 65536;
                        return;
                    }
                    return;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg enumC0390lqeggnwhkgFiwbwshyhd = fiwbwshyhd(str2);
                    yadqdtsiqtVar.f21539jpowsppfya = enumC0390lqeggnwhkgFiwbwshyhd;
                    if (enumC0390lqeggnwhkgFiwbwshyhd != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 131072;
                        return;
                    }
                    return;
                case 66:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.nufgyqmvbu nufgyqmvbuVarAgeimvtcrz = ageimvtcrz(str2);
                    yadqdtsiqtVar.f21532hkdspvbjdz = nufgyqmvbuVarAgeimvtcrz;
                    if (nufgyqmvbuVarAgeimvtcrz != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVarHszhottldk = hszhottldk(str2);
                    yadqdtsiqtVar.f21526cllcsxoeiz = gxszxtbevoVarHszhottldk;
                    if (gxszxtbevoVarHszhottldk != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 262144;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolWeqkydbzbr = weqkydbzbr(str2);
                    yadqdtsiqtVar.f21529dsvhmnatus = boolWeqkydbzbr;
                    if (boolWeqkydbzbr != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String strSflfametgt = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21552stevsuqkhv = strSflfametgt;
                    yadqdtsiqtVar.f21542kegysxyocb = strSflfametgt;
                    yadqdtsiqtVar.f21553tzroggbefp = strSflfametgt;
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 14680064;
                    return;
                case 70:
                    yadqdtsiqtVar.f21552stevsuqkhv = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 2097152;
                    return;
                case 71:
                    yadqdtsiqtVar.f21542kegysxyocb = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 4194304;
                    return;
                case 72:
                    yadqdtsiqtVar.f21553tzroggbefp = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            yadqdtsiqtVar.f21545mbcevpiqjq = Boolean.valueOf(!str2.equals(DevicePublicKeyStringDef.NONE));
                            yadqdtsiqtVar.f21562zdlpuopuiu |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            yadqdtsiqtVar.f21546ntlheqmsrt = Boolean.valueOf(str2.equals("visible"));
                            yadqdtsiqtVar.f21562zdlpuopuiu |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (!str2.equals("currentColor")) {
                        try {
                            yadqdtsiqtVar.f21554ulzqkzuiru = jhduphickx(str2);
                        } catch (SVGParseException e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                        break;
                    } else {
                        yadqdtsiqtVar.f21554ulzqkzuiru = com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg.iobyxmoadg();
                    }
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 67108864;
                    return;
                case 76:
                    yadqdtsiqtVar.f21551sopmlzcsov = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 134217728;
                    return;
                case 77:
                    com.caverock.androidsvg.lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVarVipkmwdibw = vipkmwdibw(str2);
                    yadqdtsiqtVar.f21557wypolnanlu = ppxfxbqfkfVarVipkmwdibw;
                    if (ppxfxbqfkfVarVipkmwdibw != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    yadqdtsiqtVar.f21528crxdokpmqz = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 268435456;
                    return;
                case 79:
                    yadqdtsiqtVar.f21538jlmebxxoox = jztzpxfvev(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 536870912;
                    return;
                case 80:
                    yadqdtsiqtVar.f21550ribwqtqdhb = sflfametgt(str2, str);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 1073741824;
                    return;
                case 81:
                    if (!str2.equals("currentColor")) {
                        try {
                            yadqdtsiqtVar.f21555vipkmwdibw = jhduphickx(str2);
                        } catch (SVGParseException e14) {
                            Log.w("SVGParser", e14.getMessage());
                            return;
                        }
                        break;
                    } else {
                        yadqdtsiqtVar.f21555vipkmwdibw = com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg.iobyxmoadg();
                    }
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 2147483648L;
                    return;
                case 82:
                    yadqdtsiqtVar.f21537jhduphickx = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 4294967296L;
                    return;
                case 83:
                    if (!str2.equals("currentColor")) {
                        try {
                            yadqdtsiqtVar.f21533ikoacuggdj = jhduphickx(str2);
                        } catch (SVGParseException e15) {
                            Log.w("SVGParser", e15.getMessage());
                            return;
                        }
                        break;
                    } else {
                        yadqdtsiqtVar.f21533ikoacuggdj = com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg.iobyxmoadg();
                    }
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 8589934592L;
                    return;
                case 84:
                    yadqdtsiqtVar.f21547okpsazkaxt = iyctptxqzt(str2);
                    yadqdtsiqtVar.f21562zdlpuopuiu |= 17179869184L;
                    return;
                case 85:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.dxjokdxxww dxjokdxxwwVarMhtqkkgtqm = mhtqkkgtqm(str2);
                    yadqdtsiqtVar.f21541jztzpxfvev = dxjokdxxwwVarMhtqkkgtqm;
                    if (dxjokdxxwwVarMhtqkkgtqm != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg eablkybsjgVarUawqvzlxes = uawqvzlxes(str2);
                    yadqdtsiqtVar.f21558xrmfcynszj = eablkybsjgVarUawqvzlxes;
                    if (eablkybsjgVarUawqvzlxes != null) {
                        yadqdtsiqtVar.f21562zdlpuopuiu |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (SVGParseException unused) {
        }
    }

    private static float zdlpuopuiu(float f13, float f14, float f15) {
        float f16;
        if (f15 < 0.0f) {
            f15 += 6.0f;
        }
        if (f15 >= 6.0f) {
            f15 -= 6.0f;
        }
        if (f15 < 1.0f) {
            f16 = (f14 - f13) * f15;
        } else {
            if (f15 < 3.0f) {
                return f14;
            }
            if (f15 >= 4.0f) {
                return f13;
            }
            f16 = (f14 - f13) * (4.0f - f15);
        }
        return f16 + f13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    private static com.caverock.androidsvg.lqeggnwhkg.iwizpuwonk zeieaojujs(String str) {
        float fWkgbmnqykc;
        float fWkgbmnqykc2;
        float f13;
        float f14;
        C0388dxjokdxxww c0388dxjokdxxww = new C0388dxjokdxxww(str);
        com.caverock.androidsvg.lqeggnwhkg.iwizpuwonk iwizpuwonkVar = new com.caverock.androidsvg.lqeggnwhkg.iwizpuwonk();
        if (c0388dxjokdxxww.nufgyqmvbu()) {
            return iwizpuwonkVar;
        }
        int iIntValue = c0388dxjokdxxww.draadjrbmk().intValue();
        int i13 = 109;
        if (iIntValue != 77 && iIntValue != 109) {
            return iwizpuwonkVar;
        }
        int iIntValue2 = iIntValue;
        float f15 = 0.0f;
        float fAgtfadlqog = 0.0f;
        float f16 = 0.0f;
        float fWkgbmnqykc3 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            c0388dxjokdxxww.pmvmpeiblj();
            switch (iIntValue2) {
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 97:
                    float fAgtfadlqog2 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc4 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog2);
                    float fWkgbmnqykc5 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc4);
                    Boolean boolPpxfxbqfkf = c0388dxjokdxxww.ppxfxbqfkf(Float.valueOf(fWkgbmnqykc5));
                    Boolean boolPpxfxbqfkf2 = c0388dxjokdxxww.ppxfxbqfkf(boolPpxfxbqfkf);
                    float fEablkybsjg = c0388dxjokdxxww.eablkybsjg(boolPpxfxbqfkf2);
                    float fWkgbmnqykc6 = c0388dxjokdxxww.wkgbmnqykc(fEablkybsjg);
                    if (!Float.isNaN(fWkgbmnqykc6) && fAgtfadlqog2 >= 0.0f && fWkgbmnqykc4 >= 0.0f) {
                        if (iIntValue2 == 97) {
                            fEablkybsjg += f15;
                            fWkgbmnqykc6 += f16;
                        }
                        iwizpuwonkVar.gxszxtbevo(fAgtfadlqog2, fWkgbmnqykc4, fWkgbmnqykc5, boolPpxfxbqfkf.booleanValue(), boolPpxfxbqfkf2.booleanValue(), fEablkybsjg, fWkgbmnqykc6);
                        f15 = fEablkybsjg;
                        fAgtfadlqog = f15;
                        f16 = fWkgbmnqykc6;
                        fWkgbmnqykc3 = f16;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 67:
                case 99:
                    float fAgtfadlqog3 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc7 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog3);
                    float fWkgbmnqykc8 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc7);
                    float fWkgbmnqykc9 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc8);
                    fWkgbmnqykc = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc9);
                    fWkgbmnqykc2 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc);
                    if (!Float.isNaN(fWkgbmnqykc2)) {
                        if (iIntValue2 == 99) {
                            fWkgbmnqykc += f15;
                            fWkgbmnqykc2 += f16;
                            fAgtfadlqog3 += f15;
                            fWkgbmnqykc7 += f16;
                            fWkgbmnqykc8 += f15;
                            fWkgbmnqykc9 += f16;
                        }
                        f13 = fWkgbmnqykc8;
                        f14 = fWkgbmnqykc9;
                        iwizpuwonkVar.ppxfxbqfkf(fAgtfadlqog3, fWkgbmnqykc7, f13, f14, fWkgbmnqykc, fWkgbmnqykc2);
                        fAgtfadlqog = f13;
                        f15 = fWkgbmnqykc;
                        fWkgbmnqykc3 = f14;
                        f16 = fWkgbmnqykc2;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 72:
                case 104:
                    float fAgtfadlqog4 = c0388dxjokdxxww.agtfadlqog();
                    if (!Float.isNaN(fAgtfadlqog4)) {
                        if (iIntValue2 == 104) {
                            fAgtfadlqog4 += f15;
                        }
                        f15 = fAgtfadlqog4;
                        iwizpuwonkVar.wkgbmnqykc(f15, f16);
                        fAgtfadlqog = f15;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 76:
                case 108:
                    float fAgtfadlqog5 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc10 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog5);
                    if (!Float.isNaN(fWkgbmnqykc10)) {
                        if (iIntValue2 == 108) {
                            fAgtfadlqog5 += f15;
                            fWkgbmnqykc10 += f16;
                        }
                        f15 = fAgtfadlqog5;
                        f16 = fWkgbmnqykc10;
                        iwizpuwonkVar.wkgbmnqykc(f15, f16);
                        fAgtfadlqog = f15;
                        fWkgbmnqykc3 = f16;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 77:
                case 109:
                    float fAgtfadlqog6 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc11 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog6);
                    if (!Float.isNaN(fWkgbmnqykc11)) {
                        if (iIntValue2 == i13 && !iwizpuwonkVar.dxjokdxxww()) {
                            fAgtfadlqog6 += f15;
                            fWkgbmnqykc11 += f16;
                        }
                        f15 = fAgtfadlqog6;
                        f16 = fWkgbmnqykc11;
                        iwizpuwonkVar.iobyxmoadg(f15, f16);
                        fAgtfadlqog = f15;
                        f17 = fAgtfadlqog;
                        fWkgbmnqykc3 = f16;
                        f18 = fWkgbmnqykc3;
                        iIntValue2 = iIntValue2 != i13 ? 76 : 108;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 81:
                case 113:
                    fAgtfadlqog = c0388dxjokdxxww.agtfadlqog();
                    fWkgbmnqykc3 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog);
                    float fWkgbmnqykc12 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc3);
                    float fWkgbmnqykc13 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc12);
                    if (!Float.isNaN(fWkgbmnqykc13)) {
                        if (iIntValue2 == 113) {
                            fWkgbmnqykc12 += f15;
                            fWkgbmnqykc13 += f16;
                            fAgtfadlqog += f15;
                            fWkgbmnqykc3 += f16;
                        }
                        f15 = fWkgbmnqykc12;
                        f16 = fWkgbmnqykc13;
                        iwizpuwonkVar.eablkybsjg(fAgtfadlqog, fWkgbmnqykc3, f15, f16);
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 83:
                case BuildConfig.API_LEVEL /* 115 */:
                    float f19 = (f15 * 2.0f) - fAgtfadlqog;
                    float f23 = (2.0f * f16) - fWkgbmnqykc3;
                    float fAgtfadlqog7 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc14 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog7);
                    fWkgbmnqykc = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc14);
                    fWkgbmnqykc2 = c0388dxjokdxxww.wkgbmnqykc(fWkgbmnqykc);
                    if (!Float.isNaN(fWkgbmnqykc2)) {
                        if (iIntValue2 == 115) {
                            fWkgbmnqykc += f15;
                            fWkgbmnqykc2 += f16;
                            fAgtfadlqog7 += f15;
                            fWkgbmnqykc14 += f16;
                        }
                        f13 = fAgtfadlqog7;
                        f14 = fWkgbmnqykc14;
                        iwizpuwonkVar.ppxfxbqfkf(f19, f23, f13, f14, fWkgbmnqykc, fWkgbmnqykc2);
                        fAgtfadlqog = f13;
                        f15 = fWkgbmnqykc;
                        fWkgbmnqykc3 = f14;
                        f16 = fWkgbmnqykc2;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 84:
                case 116:
                    fAgtfadlqog = (f15 * 2.0f) - fAgtfadlqog;
                    fWkgbmnqykc3 = (2.0f * f16) - fWkgbmnqykc3;
                    float fAgtfadlqog8 = c0388dxjokdxxww.agtfadlqog();
                    float fWkgbmnqykc15 = c0388dxjokdxxww.wkgbmnqykc(fAgtfadlqog8);
                    if (!Float.isNaN(fWkgbmnqykc15)) {
                        if (iIntValue2 == 116) {
                            fAgtfadlqog8 += f15;
                            fWkgbmnqykc15 += f16;
                        }
                        f15 = fAgtfadlqog8;
                        f16 = fWkgbmnqykc15;
                        iwizpuwonkVar.eablkybsjg(fAgtfadlqog, fWkgbmnqykc3, f15, f16);
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 86:
                case 118:
                    float fAgtfadlqog9 = c0388dxjokdxxww.agtfadlqog();
                    if (!Float.isNaN(fAgtfadlqog9)) {
                        if (iIntValue2 == 118) {
                            fAgtfadlqog9 += f16;
                        }
                        f16 = fAgtfadlqog9;
                        iwizpuwonkVar.wkgbmnqykc(f15, f16);
                        fWkgbmnqykc3 = f16;
                        c0388dxjokdxxww.lereixgezr();
                        if (c0388dxjokdxxww.nufgyqmvbu()) {
                            if (c0388dxjokdxxww.dxjokdxxww()) {
                                iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                            }
                            i13 = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 122:
                    iwizpuwonkVar.close();
                    f15 = f17;
                    fAgtfadlqog = f15;
                    f16 = f18;
                    fWkgbmnqykc3 = f16;
                    c0388dxjokdxxww.lereixgezr();
                    if (c0388dxjokdxxww.nufgyqmvbu()) {
                        if (c0388dxjokdxxww.dxjokdxxww()) {
                            iIntValue2 = c0388dxjokdxxww.draadjrbmk().intValue();
                        }
                        i13 = 109;
                    }
                    break;
                default:
                    break;
            }
            return iwizpuwonkVar;
        }
    }

    private Float zfvoamnweg(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z13 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z13 = false;
        }
        try {
            float fMetgxyhuhe = metgxyhuhe(str, 0, length);
            float f13 = 100.0f;
            if (z13) {
                fMetgxyhuhe /= 100.0f;
            }
            if (fMetgxyhuhe < 0.0f) {
                f13 = 0.0f;
            } else if (fMetgxyhuhe <= 100.0f) {
                f13 = fMetgxyhuhe;
            }
            return Float.valueOf(f13);
        } catch (NumberFormatException e13) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e13);
        }
    }

    private void zynmafqrjb(com.caverock.androidsvg.lqeggnwhkg.eablkybsjg eablkybsjgVar, Attributes attributes) throws SVGParseException {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String strTrim = attributes.getValue(i13).trim();
            if (iobyxmoadg.f21229zoijcleaow[lqeggnwhkg.iobyxmoadg(attributes.getLocalName(i13)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eablkybsjgVar.f21412rgvfuqvkyq = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    eablkybsjgVar.f21412rgvfuqvkyq = Boolean.TRUE;
                }
            }
        }
    }

    com.caverock.androidsvg.lqeggnwhkg lereixgezr(InputStream inputStream, boolean z13) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i13 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i13 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            grlcpdaxtj(inputStream, z13);
            return this.f21214iobyxmoadg;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
