package zg;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp extends draadjrbmk {
    public static int agtfadlqog(int i13, int i14, int i15) {
        if (i14 <= i15) {
            if (i13 < i14) {
                return i14;
            }
            return i13 > i15 ? i15 : i13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i15 + " is less than minimum " + i14 + '.');
    }

    public static int btonecajqb(int i13, int i14) {
        return i13 > i14 ? i14 : i13;
    }

    public static double draadjrbmk(double d13, double d14, double d15) {
        if (d14 <= d15) {
            if (d13 < d14) {
                return d14;
            }
            return d13 > d15 ? d15 : d13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d15 + " is less than minimum " + d14 + '.');
    }

    public static float dxjokdxxww(float f13, float f14) {
        return f13 > f14 ? f14 : f13;
    }

    public static float eablkybsjg(float f13, float f14) {
        return f13 < f14 ? f14 : f13;
    }

    public static long gtknphoqwx(long j13, long j14) {
        return j13 > j14 ? j14 : j13;
    }

    public static int gxszxtbevo(int i13, int i14) {
        return i13 < i14 ? i14 : i13;
    }

    public static btonecajqb jyumaefscl(int i13, int i14) {
        return i14 <= Integer.MIN_VALUE ? btonecajqb.f129919cqumvgiudr.iobyxmoadg() : new btonecajqb(i13, i14 - 1);
    }

    public static nufgyqmvbu kcexrzcfyt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        return nufgyqmvbu.f129931iwizpuwonk.iobyxmoadg(nufgyqmvbuVar.eablkybsjg(), nufgyqmvbuVar.wkgbmnqykc(), -nufgyqmvbuVar.gxszxtbevo());
    }

    public static long lqeggnwhkg(long j13, long j14) {
        return j13 < j14 ? j14 : j13;
    }

    public static double nufgyqmvbu(double d13, double d14) {
        return d13 > d14 ? d14 : d13;
    }

    public static long ojitshcjhn(long j13, long j14, long j15) {
        if (j14 <= j15) {
            if (j13 < j14) {
                return j14;
            }
            return j13 > j15 ? j15 : j13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j15 + " is less than minimum " + j14 + '.');
    }

    public static boolean oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar, long j13) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        Integer numYggfygwlhe = yggfygwlhe(j13);
        if (numYggfygwlhe != null) {
            return lqeggnwhkgVar.iobyxmoadg(numYggfygwlhe);
        }
        return false;
    }

    public static Comparable rgvfuqvkyq(Comparable comparable, gxszxtbevo range) {
        zdlpuopuiu.btonecajqb(comparable, "<this>");
        zdlpuopuiu.btonecajqb(range, "range");
        if (!range.isEmpty()) {
            if (!range.zoijcleaow(comparable, range.getStart()) || range.zoijcleaow(range.getStart(), comparable)) {
                return (!range.zoijcleaow(range.ppxfxbqfkf(), comparable) || range.zoijcleaow(comparable, range.ppxfxbqfkf())) ? comparable : range.ppxfxbqfkf();
            }
            return range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static nufgyqmvbu vdvldrhtss(int i13, int i14) {
        return nufgyqmvbu.f129931iwizpuwonk.iobyxmoadg(i13, i14, -1);
    }

    public static float wflxmlrfwp(float f13, float f14, float f15) {
        if (f14 <= f15) {
            if (f13 < f14) {
                return f14;
            }
            return f13 > f15 ? f15 : f13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f15 + " is less than minimum " + f14 + '.');
    }

    public static double wkgbmnqykc(double d13, double d14) {
        return d13 < d14 ? d14 : d13;
    }

    public static final Integer yggfygwlhe(long j13) {
        if (-2147483648L > j13 || j13 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j13);
    }

    public static nufgyqmvbu zdlpuopuiu(nufgyqmvbu nufgyqmvbuVar, int i13) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        draadjrbmk.iobyxmoadg(i13 > 0, Integer.valueOf(i13));
        nufgyqmvbu.iobyxmoadg iobyxmoadgVar = nufgyqmvbu.f129931iwizpuwonk;
        int iWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVar.eablkybsjg();
        if (nufgyqmvbuVar.gxszxtbevo() <= 0) {
            i13 = -i13;
        }
        return iobyxmoadgVar.iobyxmoadg(iWkgbmnqykc, iEablkybsjg, i13);
    }
}
