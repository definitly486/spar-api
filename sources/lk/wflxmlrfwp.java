package lk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f63205dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f63206eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f63207gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63208iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f63209lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f63210nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f63211ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63212wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63213zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final iobyxmoadg f63201btonecajqb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Pattern f63203gtknphoqwx = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final Pattern f63202draadjrbmk = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Pattern f63204wflxmlrfwp = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final Pattern f63200agtfadlqog = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final String gxszxtbevo(String str) {
            if (mj.kcexrzcfyt.zynmafqrjb(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strIobyxmoadg = mk.lqeggnwhkg.iobyxmoadg(mj.kcexrzcfyt.lxfrhoxuzk(str, "."));
            if (strIobyxmoadg != null) {
                return strIobyxmoadg;
            }
            throw new IllegalArgumentException();
        }

        private final int iobyxmoadg(String str, int i13, int i14, boolean z13) {
            while (i13 < i14) {
                char cCharAt = str.charAt(i13);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z13)) {
                    return i13;
                }
                i13++;
            }
            return i14;
        }

        private final long lqeggnwhkg(String str, int i13, int i14) {
            int iIobyxmoadg = iobyxmoadg(str, i13, i14, false);
            Matcher matcher = wflxmlrfwp.f63200agtfadlqog.matcher(str);
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int iYdmasvzmpa = -1;
            int i18 = -1;
            int i19 = -1;
            while (iIobyxmoadg < i14) {
                int iIobyxmoadg2 = iobyxmoadg(str, iIobyxmoadg + 1, i14, true);
                matcher.region(iIobyxmoadg, iIobyxmoadg2);
                if (i16 == -1 && matcher.usePattern(wflxmlrfwp.f63200agtfadlqog).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup, "matcher.group(1)");
                    i16 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup2, "matcher.group(2)");
                    i18 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup3, "matcher.group(3)");
                    i19 = Integer.parseInt(strGroup3);
                } else if (i17 == -1 && matcher.usePattern(wflxmlrfwp.f63204wflxmlrfwp).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup4, "matcher.group(1)");
                    i17 = Integer.parseInt(strGroup4);
                } else if (iYdmasvzmpa == -1 && matcher.usePattern(wflxmlrfwp.f63202draadjrbmk).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = wflxmlrfwp.f63202draadjrbmk.pattern();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strPattern, "MONTH_PATTERN.pattern()");
                    iYdmasvzmpa = mj.kcexrzcfyt.ydmasvzmpa(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i15 == -1 && matcher.usePattern(wflxmlrfwp.f63203gtknphoqwx).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup6, "matcher.group(1)");
                    i15 = Integer.parseInt(strGroup6);
                }
                iIobyxmoadg = iobyxmoadg(str, iIobyxmoadg2 + 1, i14, false);
            }
            if (70 <= i15 && i15 < 100) {
                i15 += 1900;
            }
            if (i15 >= 0 && i15 < 70) {
                i15 += 2000;
            }
            if (i15 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iYdmasvzmpa == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i17 || i17 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i19 < 0 || i19 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(mk.rgvfuqvkyq.f67374wkgbmnqykc);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i15);
            gregorianCalendar.set(2, iYdmasvzmpa - 1);
            gregorianCalendar.set(5, i17);
            gregorianCalendar.set(11, i16);
            gregorianCalendar.set(12, i18);
            gregorianCalendar.set(13, i19);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long nufgyqmvbu(String str) {
            try {
                long j13 = Long.parseLong(str);
                if (j13 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j13;
            } catch (NumberFormatException e13) {
                if (new mj.rgvfuqvkyq("-?\\d+").ojitshcjhn(str)) {
                    return mj.kcexrzcfyt.stevsuqkhv(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e13;
            }
        }

        private final boolean zoijcleaow(String str, String str2) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, str2)) {
                return true;
            }
            return mj.kcexrzcfyt.zynmafqrjb(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !mk.gxszxtbevo.iobyxmoadg(str);
        }

        public final List eablkybsjg(jyumaefscl url, yggfygwlhe headers) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
            List listGtknphoqwx = headers.gtknphoqwx("Set-Cookie");
            int size = listGtknphoqwx.size();
            ArrayList arrayList = null;
            for (int i13 = 0; i13 < size; i13++) {
                wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = ppxfxbqfkf(url, (String) listGtknphoqwx.get(i13));
                if (wflxmlrfwpVarPpxfxbqfkf != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(wflxmlrfwpVarPpxfxbqfkf);
                }
            }
            if (arrayList == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public final wflxmlrfwp ppxfxbqfkf(jyumaefscl url, String setCookie) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookie, "setCookie");
            return wkgbmnqykc(System.currentTimeMillis(), url, setCookie);
        }

        public final wflxmlrfwp wkgbmnqykc(long j13, jyumaefscl url, String setCookie) {
            long j14;
            wflxmlrfwp wflxmlrfwpVar;
            String str;
            String str2;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookie, "setCookie");
            int iBtonecajqb = mk.wflxmlrfwp.btonecajqb(setCookie, ';', 0, 0, 6, null);
            int iBtonecajqb2 = mk.wflxmlrfwp.btonecajqb(setCookie, '=', 0, iBtonecajqb, 2, null);
            if (iBtonecajqb2 == iBtonecajqb) {
                return null;
            }
            String strLmojexxdyd = mk.wflxmlrfwp.lmojexxdyd(setCookie, 0, iBtonecajqb2, 1, null);
            if (strLmojexxdyd.length() == 0 || mk.wflxmlrfwp.vdvldrhtss(strLmojexxdyd) != -1) {
                return null;
            }
            String strIozdgvuglv = mk.wflxmlrfwp.iozdgvuglv(setCookie, iBtonecajqb2 + 1, iBtonecajqb);
            if (mk.wflxmlrfwp.vdvldrhtss(strIozdgvuglv) != -1) {
                return null;
            }
            int i13 = iBtonecajqb + 1;
            int length = setCookie.length();
            String strGxszxtbevo = null;
            String str3 = null;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = true;
            long jNufgyqmvbu = -1;
            long jLqeggnwhkg = 253402300799999L;
            while (i13 < length) {
                int iNufgyqmvbu = mk.wflxmlrfwp.nufgyqmvbu(setCookie, ';', i13, length);
                int iNufgyqmvbu2 = mk.wflxmlrfwp.nufgyqmvbu(setCookie, '=', i13, iNufgyqmvbu);
                String strIozdgvuglv2 = mk.wflxmlrfwp.iozdgvuglv(setCookie, i13, iNufgyqmvbu2);
                String strIozdgvuglv3 = iNufgyqmvbu2 < iNufgyqmvbu ? mk.wflxmlrfwp.iozdgvuglv(setCookie, iNufgyqmvbu2 + 1, iNufgyqmvbu) : "";
                if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "expires", true)) {
                    try {
                        jLqeggnwhkg = lqeggnwhkg(strIozdgvuglv3, 0, strIozdgvuglv3.length());
                        z15 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "max-age", true)) {
                    jNufgyqmvbu = nufgyqmvbu(strIozdgvuglv3);
                    z15 = true;
                } else if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "domain", true)) {
                    strGxszxtbevo = gxszxtbevo(strIozdgvuglv3);
                    z16 = false;
                } else if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "path", true)) {
                    str3 = strIozdgvuglv3;
                } else if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "secure", true)) {
                    z13 = true;
                } else if (mj.kcexrzcfyt.istkbnxepw(strIozdgvuglv2, "httponly", true)) {
                    z14 = true;
                }
                i13 = iNufgyqmvbu + 1;
            }
            long j15 = Long.MIN_VALUE;
            if (jNufgyqmvbu == Long.MIN_VALUE) {
                j14 = j15;
            } else if (jNufgyqmvbu != -1) {
                long j16 = j13 + (jNufgyqmvbu <= 9223372036854775L ? jNufgyqmvbu * ((long) 1000) : Long.MAX_VALUE);
                if (j16 >= j13) {
                    j15 = 253402300799999L;
                    if (j16 <= 253402300799999L) {
                        j14 = j16;
                    }
                } else {
                    j15 = 253402300799999L;
                }
                j14 = j15;
            } else {
                j14 = jLqeggnwhkg;
            }
            String strDxjokdxxww = url.dxjokdxxww();
            if (strGxszxtbevo == null) {
                str = strDxjokdxxww;
                wflxmlrfwpVar = null;
            } else {
                if (!zoijcleaow(strDxjokdxxww, strGxszxtbevo)) {
                    return null;
                }
                wflxmlrfwpVar = null;
                str = strGxszxtbevo;
            }
            if (strDxjokdxxww.length() != str.length() && xk.iobyxmoadg.f122647eablkybsjg.ppxfxbqfkf().ppxfxbqfkf(str) == null) {
                return wflxmlrfwpVar;
            }
            String strSubstring = CardDateFormatTextWatcher.DIVIDER_CHARACTER;
            String str4 = str3;
            if (str4 == null || !mj.kcexrzcfyt.stevsuqkhv(str4, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 2, wflxmlrfwpVar)) {
                String strWkgbmnqykc = url.wkgbmnqykc();
                int iOpjhrmiecq = mj.kcexrzcfyt.opjhrmiecq(strWkgbmnqykc, '/', 0, false, 6, null);
                if (iOpjhrmiecq != 0) {
                    strSubstring = strWkgbmnqykc.substring(0, iOpjhrmiecq);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new wflxmlrfwp(strLmojexxdyd, strIozdgvuglv, j14, str, str2, z13, z14, z15, z16, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wflxmlrfwp(String str, String str2, long j13, String str3, String str4, boolean z13, boolean z14, boolean z15, boolean z16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, str2, j13, str3, str4, z13, z14, z15, z16);
    }

    public final String eablkybsjg() {
        return this.f63208iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wflxmlrfwp) {
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.f63208iobyxmoadg, this.f63208iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.f63213zoijcleaow, this.f63213zoijcleaow) && wflxmlrfwpVar.f63211ppxfxbqfkf == this.f63211ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.f63212wkgbmnqykc, this.f63212wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.f63206eablkybsjg, this.f63206eablkybsjg) && wflxmlrfwpVar.f63207gxszxtbevo == this.f63207gxszxtbevo && wflxmlrfwpVar.f63209lqeggnwhkg == this.f63209lqeggnwhkg && wflxmlrfwpVar.f63210nufgyqmvbu == this.f63210nufgyqmvbu && wflxmlrfwpVar.f63205dxjokdxxww == this.f63205dxjokdxxww) {
                return true;
            }
        }
        return false;
    }

    public final String gxszxtbevo(boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f63208iobyxmoadg);
        sb3.append('=');
        sb3.append(this.f63213zoijcleaow);
        if (this.f63210nufgyqmvbu) {
            if (this.f63211ppxfxbqfkf == Long.MIN_VALUE) {
                sb3.append("; max-age=0");
            } else {
                sb3.append("; expires=");
                sb3.append(rk.ppxfxbqfkf.zoijcleaow(new Date(this.f63211ppxfxbqfkf)));
            }
        }
        if (!this.f63205dxjokdxxww) {
            sb3.append("; domain=");
            if (z13) {
                sb3.append(".");
            }
            sb3.append(this.f63212wkgbmnqykc);
        }
        sb3.append("; path=");
        sb3.append(this.f63206eablkybsjg);
        if (this.f63207gxszxtbevo) {
            sb3.append("; secure");
        }
        if (this.f63209lqeggnwhkg) {
            sb3.append("; httponly");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f63208iobyxmoadg.hashCode()) * 31) + this.f63213zoijcleaow.hashCode()) * 31) + Long.hashCode(this.f63211ppxfxbqfkf)) * 31) + this.f63212wkgbmnqykc.hashCode()) * 31) + this.f63206eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f63207gxszxtbevo)) * 31) + Boolean.hashCode(this.f63209lqeggnwhkg)) * 31) + Boolean.hashCode(this.f63210nufgyqmvbu)) * 31) + Boolean.hashCode(this.f63205dxjokdxxww);
    }

    public final String lqeggnwhkg() {
        return this.f63213zoijcleaow;
    }

    public String toString() {
        return gxszxtbevo(false);
    }

    private wflxmlrfwp(String str, String str2, long j13, String str3, String str4, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f63208iobyxmoadg = str;
        this.f63213zoijcleaow = str2;
        this.f63211ppxfxbqfkf = j13;
        this.f63212wkgbmnqykc = str3;
        this.f63206eablkybsjg = str4;
        this.f63207gxszxtbevo = z13;
        this.f63209lqeggnwhkg = z14;
        this.f63210nufgyqmvbu = z15;
        this.f63205dxjokdxxww = z16;
    }
}
