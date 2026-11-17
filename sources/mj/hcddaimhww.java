package mj;

import kotlin.KotlinNothingValueException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hcddaimhww {
    public static final short btonecajqb(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.iozdgvuglv iozdgvuglvVarGtknphoqwx = gtknphoqwx(str);
        if (iozdgvuglvVarGtknphoqwx != null) {
            return iozdgvuglvVarGtknphoqwx.gxszxtbevo();
        }
        istkbnxepw.rgvfuqvkyq(str);
        throw new KotlinNothingValueException();
    }

    public static final gg.iozdgvuglv draadjrbmk(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.pmvmpeiblj pmvmpeibljVarGxszxtbevo = gxszxtbevo(str, i13);
        if (pmvmpeibljVarGxszxtbevo == null) {
            return null;
        }
        int iGxszxtbevo = pmvmpeibljVarGxszxtbevo.gxszxtbevo();
        if (Integer.compareUnsigned(iGxszxtbevo, gg.pmvmpeiblj.zoijcleaow(65535)) > 0) {
            return null;
        }
        return gg.iozdgvuglv.iobyxmoadg(gg.iozdgvuglv.zoijcleaow((short) iGxszxtbevo));
    }

    public static final gg.istkbnxepw dxjokdxxww(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        iobyxmoadg.iobyxmoadg(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jZoijcleaow = gg.istkbnxepw.zoijcleaow(i13);
        long j13 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i14 < length) {
            int iZoijcleaow = zoijcleaow.zoijcleaow(str.charAt(i14), i13);
            if (iZoijcleaow < 0) {
                return null;
            }
            if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jZoijcleaow);
                    if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jZoijcleaow2 = gg.istkbnxepw.zoijcleaow(j13 * jZoijcleaow);
            long jZoijcleaow3 = gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(((long) gg.pmvmpeiblj.zoijcleaow(iZoijcleaow)) & 4294967295L) + jZoijcleaow2);
            if (Long.compareUnsigned(jZoijcleaow3, jZoijcleaow2) < 0) {
                return null;
            }
            i14++;
            j13 = jZoijcleaow3;
        }
        return gg.istkbnxepw.iobyxmoadg(j13);
    }

    public static final gg.pmvmpeiblj eablkybsjg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return gxszxtbevo(str, 10);
    }

    public static final gg.iozdgvuglv gtknphoqwx(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return draadjrbmk(str, 10);
    }

    public static final gg.pmvmpeiblj gxszxtbevo(String str, int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        iobyxmoadg.iobyxmoadg(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i15 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i14 = 0;
        }
        int iZoijcleaow = gg.pmvmpeiblj.zoijcleaow(i13);
        int iDivideUnsigned = 119304647;
        while (i14 < length) {
            int iZoijcleaow2 = zoijcleaow.zoijcleaow(str.charAt(i14), i13);
            if (iZoijcleaow2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iZoijcleaow);
                    if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iZoijcleaow3 = gg.pmvmpeiblj.zoijcleaow(i15 * iZoijcleaow);
            int iZoijcleaow4 = gg.pmvmpeiblj.zoijcleaow(gg.pmvmpeiblj.zoijcleaow(iZoijcleaow2) + iZoijcleaow3);
            if (Integer.compareUnsigned(iZoijcleaow4, iZoijcleaow3) < 0) {
                return null;
            }
            i14++;
            i15 = iZoijcleaow4;
        }
        return gg.pmvmpeiblj.iobyxmoadg(i15);
    }

    public static final byte iobyxmoadg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.esjtqupxsv esjtqupxsvVarZoijcleaow = zoijcleaow(str);
        if (esjtqupxsvVarZoijcleaow != null) {
            return esjtqupxsvVarZoijcleaow.gxszxtbevo();
        }
        istkbnxepw.rgvfuqvkyq(str);
        throw new KotlinNothingValueException();
    }

    public static final long lqeggnwhkg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.istkbnxepw istkbnxepwVarNufgyqmvbu = nufgyqmvbu(str);
        if (istkbnxepwVarNufgyqmvbu != null) {
            return istkbnxepwVarNufgyqmvbu.lqeggnwhkg();
        }
        istkbnxepw.rgvfuqvkyq(str);
        throw new KotlinNothingValueException();
    }

    public static final gg.istkbnxepw nufgyqmvbu(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return dxjokdxxww(str, 10);
    }

    public static final gg.esjtqupxsv ppxfxbqfkf(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.pmvmpeiblj pmvmpeibljVarGxszxtbevo = gxszxtbevo(str, i13);
        if (pmvmpeibljVarGxszxtbevo == null) {
            return null;
        }
        int iGxszxtbevo = pmvmpeibljVarGxszxtbevo.gxszxtbevo();
        if (Integer.compareUnsigned(iGxszxtbevo, gg.pmvmpeiblj.zoijcleaow(KotlinVersion.MAX_COMPONENT_VALUE)) > 0) {
            return null;
        }
        return gg.esjtqupxsv.iobyxmoadg(gg.esjtqupxsv.zoijcleaow((byte) iGxszxtbevo));
    }

    public static final int wkgbmnqykc(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        gg.pmvmpeiblj pmvmpeibljVarEablkybsjg = eablkybsjg(str);
        if (pmvmpeibljVarEablkybsjg != null) {
            return pmvmpeibljVarEablkybsjg.gxszxtbevo();
        }
        istkbnxepw.rgvfuqvkyq(str);
        throw new KotlinNothingValueException();
    }

    public static final gg.esjtqupxsv zoijcleaow(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return ppxfxbqfkf(str, 10);
    }
}
