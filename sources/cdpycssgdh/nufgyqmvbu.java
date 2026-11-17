package cdpycssgdh;

import android.os.Build;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lereixgezr.sopmlzcsov;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    static final HashSet f19718btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final btonecajqb[][] f19719dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final btonecajqb[] f19720eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final btonecajqb[] f19721gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final btonecajqb[] f19722lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final btonecajqb[] f19723nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final String[] f19724ppxfxbqfkf = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final btonecajqb[] f19725wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f19726iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ByteOrder f19727zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19728iobyxmoadg;

        static {
            int[] iArr = new int[istkbnxepw.agtfadlqog.values().length];
            f19728iobyxmoadg = iArr;
            try {
                iArr[istkbnxepw.agtfadlqog.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19728iobyxmoadg[istkbnxepw.agtfadlqog.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19728iobyxmoadg[istkbnxepw.agtfadlqog.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ppxfxbqfkf {
        AUTO,
        MANUAL
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final List f19736iobyxmoadg = Collections.list(new C0358zoijcleaow());

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ByteOrder f19737zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Pattern f19734ppxfxbqfkf = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Pattern f19735wkgbmnqykc = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final Pattern f19732eablkybsjg = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        static final List f19733gxszxtbevo = Collections.list(new iobyxmoadg());

        class iobyxmoadg implements Enumeration {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            int f19738iobyxmoadg = 0;

            iobyxmoadg() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f19738iobyxmoadg < nufgyqmvbu.f19719dxjokdxxww.length;
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap map = new HashMap();
                for (btonecajqb btonecajqbVar : nufgyqmvbu.f19719dxjokdxxww[this.f19738iobyxmoadg]) {
                    map.put(btonecajqbVar.f19683zoijcleaow, btonecajqbVar);
                }
                this.f19738iobyxmoadg++;
                return map;
            }
        }

        class ppxfxbqfkf implements Enumeration {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final Enumeration f19739iobyxmoadg;

            ppxfxbqfkf() {
                this.f19739iobyxmoadg = Collections.enumeration(zoijcleaow.this.f19736iobyxmoadg);
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f19739iobyxmoadg.hasMoreElements();
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f19739iobyxmoadg.nextElement());
            }
        }

        /* JADX INFO: renamed from: cdpycssgdh.nufgyqmvbu$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        class C0358zoijcleaow implements Enumeration {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            int f19741iobyxmoadg = 0;

            C0358zoijcleaow() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f19741iobyxmoadg < nufgyqmvbu.f19719dxjokdxxww.length;
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f19741iobyxmoadg++;
                return new HashMap();
            }
        }

        zoijcleaow(ByteOrder byteOrder) {
            this.f19737zoijcleaow = byteOrder;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void eablkybsjg(String str, String str2, List list) {
            int i13;
            int i14;
            int i15;
            zoijcleaow zoijcleaowVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f19735wkgbmnqykc.matcher(strReplaceAll).find();
                boolean zFind2 = f19732eablkybsjg.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    sopmlzcsov.draadjrbmk("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i16 = 2;
            int i17 = 1;
            if (strReplaceAll != null && nufgyqmvbu.f19718btonecajqb.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f19734ppxfxbqfkf.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        sopmlzcsov.draadjrbmk("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) u1.nufgyqmvbu.gxszxtbevo(matcher.group(1))) + "/1," + Integer.parseInt((String) u1.nufgyqmvbu.gxszxtbevo(matcher.group(2))) + "/1," + Integer.parseInt((String) u1.nufgyqmvbu.gxszxtbevo(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new gtknphoqwx(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e13) {
                        sopmlzcsov.wflxmlrfwp("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e13);
                        return;
                    }
                }
            }
            int i18 = 0;
            int i19 = 0;
            while (i19 < nufgyqmvbu.f19719dxjokdxxww.length) {
                btonecajqb btonecajqbVar = (btonecajqb) ((HashMap) f19733gxszxtbevo.get(i19)).get(str4);
                if (btonecajqbVar == null) {
                    i13 = i19;
                    i14 = i17;
                } else {
                    if (strReplaceAll != null) {
                        Pair pairZoijcleaow = zoijcleaow(strReplaceAll);
                        if (btonecajqbVar.f19681ppxfxbqfkf == ((Integer) pairZoijcleaow.first).intValue() || btonecajqbVar.f19681ppxfxbqfkf == ((Integer) pairZoijcleaow.second).intValue()) {
                            i15 = btonecajqbVar.f19681ppxfxbqfkf;
                        } else {
                            int i23 = btonecajqbVar.f19682wkgbmnqykc;
                            if (i23 == -1 || !(i23 == ((Integer) pairZoijcleaow.first).intValue() || btonecajqbVar.f19682wkgbmnqykc == ((Integer) pairZoijcleaow.second).intValue())) {
                                i15 = btonecajqbVar.f19681ppxfxbqfkf;
                                if (i15 == i17 || i15 == 7 || i15 == i16) {
                                }
                            } else {
                                i15 = btonecajqbVar.f19682wkgbmnqykc;
                            }
                        }
                        String str5 = CardDateFormatTextWatcher.DIVIDER_CHARACTER;
                        switch (i15) {
                            case 1:
                                i13 = i19;
                                i14 = i17;
                                ((Map) list.get(i13)).put(str4, lqeggnwhkg.iobyxmoadg(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i13 = i19;
                                i14 = i17;
                                ((Map) list.get(i13)).put(str4, lqeggnwhkg.eablkybsjg(strReplaceAll));
                                break;
                            case 3:
                                i13 = i19;
                                i14 = i17;
                                String[] strArrSplit = strReplaceAll.split(StringUtils.COMMA, -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i24 = 0; i24 < strArrSplit.length; i24++) {
                                    iArr[i24] = Integer.parseInt(strArrSplit[i24]);
                                }
                                ((Map) list.get(i13)).put(str4, lqeggnwhkg.dxjokdxxww(iArr, zoijcleaowVar.f19737zoijcleaow));
                                break;
                            case 4:
                                i13 = i19;
                                i14 = i17;
                                String[] strArrSplit2 = strReplaceAll.split(StringUtils.COMMA, -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i25 = 0; i25 < strArrSplit2.length; i25++) {
                                    jArr[i25] = Long.parseLong(strArrSplit2[i25]);
                                }
                                ((Map) list.get(i13)).put(str4, lqeggnwhkg.lqeggnwhkg(jArr, zoijcleaowVar.f19737zoijcleaow));
                                break;
                            case 5:
                                String str6 = CardDateFormatTextWatcher.DIVIDER_CHARACTER;
                                String[] strArrSplit3 = strReplaceAll.split(StringUtils.COMMA, -1);
                                gtknphoqwx[] gtknphoqwxVarArr = new gtknphoqwx[strArrSplit3.length];
                                int i26 = i18;
                                while (i26 < strArrSplit3.length) {
                                    String str7 = str6;
                                    String[] strArrSplit4 = strArrSplit3[i26].split(str7, -1);
                                    gtknphoqwxVarArr[i26] = new gtknphoqwx((long) Double.parseDouble(strArrSplit4[i18]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i26++;
                                    str6 = str7;
                                    i19 = i19;
                                    i18 = 0;
                                }
                                i13 = i19;
                                i14 = 1;
                                ((Map) list.get(i13)).put(str4, lqeggnwhkg.nufgyqmvbu(gtknphoqwxVarArr, zoijcleaowVar.f19737zoijcleaow));
                                break;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(StringUtils.COMMA, -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i27 = i18; i27 < strArrSplit5.length; i27++) {
                                    iArr2[i27] = Integer.parseInt(strArrSplit5[i27]);
                                }
                                ((Map) list.get(i19)).put(str4, lqeggnwhkg.ppxfxbqfkf(iArr2, zoijcleaowVar.f19737zoijcleaow));
                                i13 = i19;
                                i14 = 1;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(StringUtils.COMMA, -1);
                                gtknphoqwx[] gtknphoqwxVarArr2 = new gtknphoqwx[strArrSplit6.length];
                                int i28 = i18;
                                while (i28 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i28].split(str5, -1);
                                    gtknphoqwxVarArr2[i28] = new gtknphoqwx((long) Double.parseDouble(strArrSplit7[i18]), (long) Double.parseDouble(strArrSplit7[i17]));
                                    i28++;
                                    str5 = str5;
                                    i17 = 1;
                                }
                                zoijcleaowVar = this;
                                ((Map) list.get(i19)).put(str4, lqeggnwhkg.wkgbmnqykc(gtknphoqwxVarArr2, zoijcleaowVar.f19737zoijcleaow));
                                i13 = i19;
                                i14 = 1;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(StringUtils.COMMA, -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i29 = i18; i29 < strArrSplit8.length; i29++) {
                                    dArr[i29] = Double.parseDouble(strArrSplit8[i29]);
                                }
                                ((Map) list.get(i19)).put(str4, lqeggnwhkg.zoijcleaow(dArr, zoijcleaowVar.f19737zoijcleaow));
                                break;
                        }
                    } else {
                        ((Map) list.get(i19)).remove(str4);
                    }
                    i13 = i19;
                    i14 = i17;
                }
                i19 = i13 + 1;
                i17 = i14;
                i16 = 2;
                i18 = 0;
            }
        }

        private void wkgbmnqykc(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            eablkybsjg(str, str2, list);
        }

        private static Pair zoijcleaow(String str) {
            if (str.contains(StringUtils.COMMA)) {
                String[] strArrSplit = str.split(StringUtils.COMMA, -1);
                Pair pairZoijcleaow = zoijcleaow(strArrSplit[0]);
                if (((Integer) pairZoijcleaow.first).intValue() == 2) {
                    return pairZoijcleaow;
                }
                for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                    Pair pairZoijcleaow2 = zoijcleaow(strArrSplit[i13]);
                    int iIntValue = (((Integer) pairZoijcleaow2.first).equals(pairZoijcleaow.first) || ((Integer) pairZoijcleaow2.second).equals(pairZoijcleaow.first)) ? ((Integer) pairZoijcleaow.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairZoijcleaow.second).intValue() == -1 || !(((Integer) pairZoijcleaow2.first).equals(pairZoijcleaow.second) || ((Integer) pairZoijcleaow2.second).equals(pairZoijcleaow.second))) ? -1 : ((Integer) pairZoijcleaow.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairZoijcleaow = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairZoijcleaow = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairZoijcleaow;
            }
            if (!str.contains(CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
                try {
                    try {
                        long j13 = Long.parseLong(str);
                        if (j13 < 0 || j13 > 65535) {
                            return j13 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                        }
                        return new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            }
            String[] strArrSplit2 = str.split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j14 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j15 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j14 >= 0 && j15 >= 0) {
                        if (j14 <= 2147483647L && j15 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        public zoijcleaow agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar) {
            String strValueOf;
            int iOrdinal = ppxfxbqfkfVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return ppxfxbqfkf("WhiteBalance", strValueOf);
        }

        public zoijcleaow btonecajqb(int i13) {
            return ppxfxbqfkf("ImageWidth", String.valueOf(i13));
        }

        public zoijcleaow draadjrbmk(float f13) {
            return ppxfxbqfkf("FNumber", String.valueOf(f13));
        }

        public zoijcleaow dxjokdxxww(int i13) {
            return ppxfxbqfkf("ImageLength", String.valueOf(i13));
        }

        public zoijcleaow gtknphoqwx(int i13) {
            return ppxfxbqfkf("SensitivityType", String.valueOf(3)).ppxfxbqfkf("PhotographicSensitivity", String.valueOf(Math.min(65535, i13)));
        }

        public zoijcleaow gxszxtbevo(long j13) {
            return ppxfxbqfkf("ExposureTime", String.valueOf(j13 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public nufgyqmvbu iobyxmoadg() {
            ArrayList list = Collections.list(new ppxfxbqfkf());
            if (!((Map) list.get(1)).isEmpty()) {
                wkgbmnqykc("ExposureProgram", String.valueOf(0), list);
                wkgbmnqykc("ExifVersion", "0230", list);
                wkgbmnqykc("ComponentsConfiguration", "1,2,3,0", list);
                wkgbmnqykc("MeteringMode", String.valueOf(0), list);
                wkgbmnqykc("LightSource", String.valueOf(0), list);
                wkgbmnqykc("FlashpixVersion", "0100", list);
                wkgbmnqykc("FocalPlaneResolutionUnit", String.valueOf(2), list);
                wkgbmnqykc("FileSource", String.valueOf(3), list);
                wkgbmnqykc("SceneType", String.valueOf(1), list);
                wkgbmnqykc("CustomRendered", String.valueOf(0), list);
                wkgbmnqykc("SceneCaptureType", String.valueOf(0), list);
                wkgbmnqykc("Contrast", String.valueOf(0), list);
                wkgbmnqykc("Saturation", String.valueOf(0), list);
                wkgbmnqykc("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                wkgbmnqykc("GPSVersionID", "2300", list);
                wkgbmnqykc("GPSSpeedRef", "K", list);
                wkgbmnqykc("GPSTrackRef", "T", list);
                wkgbmnqykc("GPSImgDirectionRef", "T", list);
                wkgbmnqykc("GPSDestBearingRef", "T", list);
                wkgbmnqykc("GPSDestDistanceRef", "K", list);
            }
            return new nufgyqmvbu(this.f19737zoijcleaow, list);
        }

        public zoijcleaow lqeggnwhkg(istkbnxepw.agtfadlqog agtfadlqogVar) {
            int i13;
            if (agtfadlqogVar == istkbnxepw.agtfadlqog.UNKNOWN) {
                return this;
            }
            int i14 = iobyxmoadg.f19728iobyxmoadg[agtfadlqogVar.ordinal()];
            if (i14 == 1) {
                i13 = 0;
            } else if (i14 == 2) {
                i13 = 32;
            } else {
                if (i14 != 3) {
                    sopmlzcsov.draadjrbmk("ExifData", "Unknown flash state: " + agtfadlqogVar);
                    return this;
                }
                i13 = 1;
            }
            if ((i13 & 1) == 1) {
                ppxfxbqfkf("LightSource", String.valueOf(4));
            }
            return ppxfxbqfkf("Flash", String.valueOf(i13));
        }

        public zoijcleaow nufgyqmvbu(float f13) {
            return ppxfxbqfkf("FocalLength", new gtknphoqwx((long) (f13 * 1000.0f), 1000L).toString());
        }

        public zoijcleaow ppxfxbqfkf(String str, String str2) {
            eablkybsjg(str, str2, this.f19736iobyxmoadg);
            return this;
        }

        public zoijcleaow wflxmlrfwp(int i13) {
            int i14;
            if (i13 == 0) {
                i14 = 1;
            } else if (i13 == 90) {
                i14 = 6;
            } else if (i13 == 180) {
                i14 = 3;
            } else if (i13 != 270) {
                sopmlzcsov.draadjrbmk("ExifData", "Unexpected orientation value: " + i13 + ". Must be one of 0, 90, 180, 270.");
                i14 = 0;
            } else {
                i14 = 8;
            }
            return ppxfxbqfkf("Orientation", String.valueOf(i14));
        }
    }

    static {
        btonecajqb[] btonecajqbVarArr = {new btonecajqb("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new btonecajqb("ImageLength", 257, 3, 4), new btonecajqb("Make", 271, 2), new btonecajqb("Model", 272, 2), new btonecajqb("Orientation", 274, 3), new btonecajqb("XResolution", 282, 5), new btonecajqb("YResolution", 283, 5), new btonecajqb("ResolutionUnit", 296, 3), new btonecajqb("Software", 305, 2), new btonecajqb("DateTime", 306, 2), new btonecajqb("YCbCrPositioning", 531, 3), new btonecajqb("SubIFDPointer", 330, 4), new btonecajqb("ExifIFDPointer", 34665, 4), new btonecajqb("GPSInfoIFDPointer", 34853, 4)};
        f19725wkgbmnqykc = btonecajqbVarArr;
        btonecajqb[] btonecajqbVarArr2 = {new btonecajqb("ExposureTime", 33434, 5), new btonecajqb("FNumber", 33437, 5), new btonecajqb("ExposureProgram", 34850, 3), new btonecajqb("PhotographicSensitivity", 34855, 3), new btonecajqb("SensitivityType", 34864, 3), new btonecajqb("ExifVersion", 36864, 2), new btonecajqb("DateTimeOriginal", 36867, 2), new btonecajqb("DateTimeDigitized", 36868, 2), new btonecajqb("ComponentsConfiguration", 37121, 7), new btonecajqb("ShutterSpeedValue", 37377, 10), new btonecajqb("ApertureValue", 37378, 5), new btonecajqb("BrightnessValue", 37379, 10), new btonecajqb("ExposureBiasValue", 37380, 10), new btonecajqb("MaxApertureValue", 37381, 5), new btonecajqb("MeteringMode", 37383, 3), new btonecajqb("LightSource", 37384, 3), new btonecajqb("Flash", 37385, 3), new btonecajqb("FocalLength", 37386, 5), new btonecajqb("SubSecTime", 37520, 2), new btonecajqb("SubSecTimeOriginal", 37521, 2), new btonecajqb("SubSecTimeDigitized", 37522, 2), new btonecajqb("FlashpixVersion", 40960, 7), new btonecajqb("ColorSpace", 40961, 3), new btonecajqb("PixelXDimension", 40962, 3, 4), new btonecajqb("PixelYDimension", 40963, 3, 4), new btonecajqb("InteroperabilityIFDPointer", 40965, 4), new btonecajqb("FocalPlaneResolutionUnit", 41488, 3), new btonecajqb("SensingMethod", 41495, 3), new btonecajqb("FileSource", 41728, 7), new btonecajqb("SceneType", 41729, 7), new btonecajqb("CustomRendered", 41985, 3), new btonecajqb("ExposureMode", 41986, 3), new btonecajqb("WhiteBalance", 41987, 3), new btonecajqb("SceneCaptureType", 41990, 3), new btonecajqb("Contrast", 41992, 3), new btonecajqb("Saturation", 41993, 3), new btonecajqb("Sharpness", 41994, 3)};
        f19720eablkybsjg = btonecajqbVarArr2;
        btonecajqb[] btonecajqbVarArr3 = {new btonecajqb("GPSVersionID", 0, 1), new btonecajqb("GPSLatitudeRef", 1, 2), new btonecajqb("GPSLatitude", 2, 5, 10), new btonecajqb("GPSLongitudeRef", 3, 2), new btonecajqb("GPSLongitude", 4, 5, 10), new btonecajqb("GPSAltitudeRef", 5, 1), new btonecajqb("GPSAltitude", 6, 5), new btonecajqb("GPSTimeStamp", 7, 5), new btonecajqb("GPSSpeedRef", 12, 2), new btonecajqb("GPSTrackRef", 14, 2), new btonecajqb("GPSImgDirectionRef", 16, 2), new btonecajqb("GPSDestBearingRef", 23, 2), new btonecajqb("GPSDestDistanceRef", 25, 2)};
        f19721gxszxtbevo = btonecajqbVarArr3;
        f19722lqeggnwhkg = new btonecajqb[]{new btonecajqb("SubIFDPointer", 330, 4), new btonecajqb("ExifIFDPointer", 34665, 4), new btonecajqb("GPSInfoIFDPointer", 34853, 4), new btonecajqb("InteroperabilityIFDPointer", 40965, 4)};
        btonecajqb[] btonecajqbVarArr4 = {new btonecajqb("InteroperabilityIndex", 1, 2)};
        f19723nufgyqmvbu = btonecajqbVarArr4;
        f19719dxjokdxxww = new btonecajqb[][]{btonecajqbVarArr, btonecajqbVarArr2, btonecajqbVarArr3, btonecajqbVarArr4};
        f19718btonecajqb = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    nufgyqmvbu(ByteOrder byteOrder, List list) {
        u1.nufgyqmvbu.dxjokdxxww(list.size() == f19719dxjokdxxww.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f19727zoijcleaow = byteOrder;
        this.f19726iobyxmoadg = list;
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow(ByteOrder.BIG_ENDIAN).ppxfxbqfkf("Orientation", String.valueOf(1)).ppxfxbqfkf("XResolution", "72/1").ppxfxbqfkf("YResolution", "72/1").ppxfxbqfkf("ResolutionUnit", String.valueOf(2)).ppxfxbqfkf("YCbCrPositioning", String.valueOf(1)).ppxfxbqfkf("Make", Build.MANUFACTURER).ppxfxbqfkf("Model", Build.MODEL);
    }

    public static nufgyqmvbu zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar, int i13) {
        zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg();
        if (agtfadlqogVar.K() != null) {
            agtfadlqogVar.K().zoijcleaow(zoijcleaowVarIobyxmoadg);
        }
        zoijcleaowVarIobyxmoadg.wflxmlrfwp(i13);
        return zoijcleaowVarIobyxmoadg.btonecajqb(agtfadlqogVar.getWidth()).dxjokdxxww(agtfadlqogVar.getHeight()).iobyxmoadg();
    }

    Map ppxfxbqfkf(int i13) {
        u1.nufgyqmvbu.ppxfxbqfkf(i13, 0, f19719dxjokdxxww.length, "Invalid IFD index: " + i13 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f19726iobyxmoadg.get(i13);
    }

    public ByteOrder wkgbmnqykc() {
        return this.f19727zoijcleaow;
    }
}
