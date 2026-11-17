package nj;

import hg.stevsuqkhv;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import zg.btonecajqb;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long agtfadlqog(long j13) {
        return j13 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long btonecajqb(long j13) {
        return iobyxmoadg.dxjokdxxww((j13 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long draadjrbmk(long j13) {
        return iobyxmoadg.dxjokdxxww(j13 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long dxjokdxxww(long j13, int i13) {
        return iobyxmoadg.dxjokdxxww((j13 << 1) + ((long) i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long gtknphoqwx(long j13) {
        return (-4611686018426L > j13 || j13 >= 4611686018427L) ? btonecajqb(gtknphoqwx.ojitshcjhn(j13, -4611686018427387903L, 4611686018427387903L)) : draadjrbmk(agtfadlqog(j13));
    }

    public static final long kcexrzcfyt(int i13, wkgbmnqykc unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        return unit.compareTo(wkgbmnqykc.SECONDS) <= 0 ? draadjrbmk(eablkybsjg.ppxfxbqfkf(i13, unit, wkgbmnqykc.NANOSECONDS)) : zdlpuopuiu(i13, unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ojitshcjhn(long j13) {
        return j13 / ((long) 1000000);
    }

    public static final long oxmwwwfdhm(double d13, wkgbmnqykc unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        double dIobyxmoadg = eablkybsjg.iobyxmoadg(d13, unit, wkgbmnqykc.NANOSECONDS);
        if (Double.isNaN(dIobyxmoadg)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jEablkybsjg = vg.iobyxmoadg.eablkybsjg(dIobyxmoadg);
        return (-4611686018426999999L > jEablkybsjg || jEablkybsjg >= 4611686018427000000L) ? gtknphoqwx(vg.iobyxmoadg.eablkybsjg(eablkybsjg.iobyxmoadg(d13, unit, wkgbmnqykc.MILLISECONDS))) : draadjrbmk(jEablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rgvfuqvkyq(String str, boolean z13) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = iobyxmoadg.f70173yggfygwlhe;
        long jPpxfxbqfkf = c1516iobyxmoadg.ppxfxbqfkf();
        char cCharAt4 = str.charAt(0);
        boolean z14 = true;
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z15 = length2 > 0;
        boolean z16 = z15 && kcexrzcfyt.ezmngbhpjk(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c13 = ':';
        char c14 = '0';
        if (str.charAt(length2) == 'P') {
            int i13 = length2 + 1;
            if (i13 == length) {
                throw new IllegalArgumentException();
            }
            wkgbmnqykc wkgbmnqykcVar = null;
            boolean z17 = false;
            while (i13 < length) {
                if (str.charAt(i13) != 'T') {
                    int i14 = i13;
                    while (i14 < str.length() && ((c14 <= (cCharAt3 = str.charAt(i14)) && cCharAt3 < c13) || kcexrzcfyt.ulzqkzuiru("+-.", cCharAt3, false, 2, null))) {
                        i14++;
                        c13 = ':';
                        c14 = '0';
                    }
                    zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i13, i14);
                    zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i13 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i15 = length3 + 1;
                    wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = gxszxtbevo.wkgbmnqykc(cCharAt5, z17);
                    if (wkgbmnqykcVar != null && wkgbmnqykcVar.compareTo(wkgbmnqykcVarWkgbmnqykc) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(strSubstring, '.', 0, false, 6, null);
                    if (wkgbmnqykcVarWkgbmnqykc != wkgbmnqykc.SECONDS || iYfnezrywwk <= 0) {
                        jPpxfxbqfkf = iobyxmoadg.iozdgvuglv(jPpxfxbqfkf, zdlpuopuiu(vdvldrhtss(strSubstring), wkgbmnqykcVarWkgbmnqykc));
                    } else {
                        zdlpuopuiu.nufgyqmvbu(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iYfnezrywwk);
                        zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
                        long jIozdgvuglv = iobyxmoadg.iozdgvuglv(jPpxfxbqfkf, zdlpuopuiu(vdvldrhtss(strSubstring2), wkgbmnqykcVarWkgbmnqykc));
                        zdlpuopuiu.nufgyqmvbu(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iYfnezrywwk);
                        zdlpuopuiu.dxjokdxxww(strSubstring3, "substring(...)");
                        jPpxfxbqfkf = iobyxmoadg.iozdgvuglv(jIozdgvuglv, oxmwwwfdhm(Double.parseDouble(strSubstring3), wkgbmnqykcVarWkgbmnqykc));
                    }
                    i13 = i15;
                    wkgbmnqykcVar = wkgbmnqykcVarWkgbmnqykc;
                    c13 = ':';
                    c14 = '0';
                    z14 = true;
                } else {
                    if (z17 || (i13 = i13 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z17 = z14;
                }
            }
        } else {
            if (z13) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            long jIozdgvuglv2 = jPpxfxbqfkf;
            if (kcexrzcfyt.iozdgvuglv(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jPpxfxbqfkf = c1516iobyxmoadg.iobyxmoadg();
            } else {
                boolean z18 = !z15;
                if (z15 && str.charAt(length2) == '(' && kcexrzcfyt.v(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z18 = true;
                }
                wkgbmnqykc wkgbmnqykcVar2 = null;
                boolean z19 = false;
                while (length2 < length) {
                    if (z19 && z18) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i16 = length2;
                    while (i16 < str.length() && (('0' <= (cCharAt2 = str.charAt(i16)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i16++;
                    }
                    zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i16);
                    zdlpuopuiu.dxjokdxxww(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i17 = length4;
                    while (i17 < str.length() && 'a' <= (cCharAt = str.charAt(i17)) && cCharAt < '{') {
                        i17++;
                    }
                    zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i17);
                    zdlpuopuiu.dxjokdxxww(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    wkgbmnqykc wkgbmnqykcVarEablkybsjg = gxszxtbevo.eablkybsjg(strSubstring5);
                    if (wkgbmnqykcVar2 != null && wkgbmnqykcVar2.compareTo(wkgbmnqykcVarEablkybsjg) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iYfnezrywwk2 = kcexrzcfyt.yfnezrywwk(strSubstring4, '.', 0, false, 6, null);
                    if (iYfnezrywwk2 > 0) {
                        zdlpuopuiu.nufgyqmvbu(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iYfnezrywwk2);
                        zdlpuopuiu.dxjokdxxww(strSubstring6, "substring(...)");
                        long jIozdgvuglv3 = iobyxmoadg.iozdgvuglv(jIozdgvuglv2, zdlpuopuiu(Long.parseLong(strSubstring6), wkgbmnqykcVarEablkybsjg));
                        zdlpuopuiu.nufgyqmvbu(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iYfnezrywwk2);
                        zdlpuopuiu.dxjokdxxww(strSubstring7, "substring(...)");
                        jIozdgvuglv2 = iobyxmoadg.iozdgvuglv(jIozdgvuglv3, oxmwwwfdhm(Double.parseDouble(strSubstring7), wkgbmnqykcVarEablkybsjg));
                        if (length2 < length) {
                            length2 = length2;
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        length2 = length2;
                    } else {
                        jIozdgvuglv2 = iobyxmoadg.iozdgvuglv(jIozdgvuglv2, zdlpuopuiu(Long.parseLong(strSubstring4), wkgbmnqykcVarEablkybsjg));
                    }
                    str2 = str3;
                    wkgbmnqykcVar2 = wkgbmnqykcVarEablkybsjg;
                    z19 = true;
                }
                jPpxfxbqfkf = jIozdgvuglv2;
            }
        }
        return z16 ? iobyxmoadg.pkzmftpjix(jPpxfxbqfkf) : jPpxfxbqfkf;
    }

    private static final long vdvldrhtss(String str) {
        int length = str.length();
        int i13 = (length <= 0 || !kcexrzcfyt.ulzqkzuiru("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i13 > 16) {
            Iterable btonecajqbVar = new btonecajqb(i13, kcexrzcfyt.xrmfcynszj(str));
            if (!(btonecajqbVar instanceof Collection) || !((Collection) btonecajqbVar).isEmpty()) {
                Iterator it = btonecajqbVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        char cCharAt = str.charAt(((stevsuqkhv) it).iobyxmoadg());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (kcexrzcfyt.stevsuqkhv(str, "+", false, 2, null)) {
            str = kcexrzcfyt.t(str, 1);
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long wflxmlrfwp(long j13) {
        return (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) ? btonecajqb(ojitshcjhn(j13)) : draadjrbmk(j13);
    }

    public static final long zdlpuopuiu(long j13, wkgbmnqykc unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.NANOSECONDS;
        long jPpxfxbqfkf = eablkybsjg.ppxfxbqfkf(4611686018426999999L, wkgbmnqykcVar, unit);
        return ((-jPpxfxbqfkf) > j13 || j13 > jPpxfxbqfkf) ? btonecajqb(gtknphoqwx.ojitshcjhn(eablkybsjg.zoijcleaow(j13, unit, wkgbmnqykc.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : draadjrbmk(eablkybsjg.ppxfxbqfkf(j13, unit, wkgbmnqykcVar));
    }
}
