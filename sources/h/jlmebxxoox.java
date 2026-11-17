package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {
    public static final float eablkybsjg(float f13, float f14, float f15, float f16) {
        float f17;
        float f18;
        double d13 = f13;
        double d14 = ((d13 - (((double) f14) * 2.0d)) + ((double) f15)) * 3.0d;
        double d15 = ((double) (f14 - f13)) * 3.0d;
        double d16 = ((double) (-f13)) + (((double) (f14 - f15)) * 3.0d) + ((double) f16);
        if (Math.abs(d16 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d14 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d15 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f19 = (float) ((-d13) / d15);
                f17 = f19 >= 0.0f ? f19 : 0.0f;
                f18 = f17 <= 1.0f ? f17 : 1.0f;
                if (Math.abs(f18 - f19) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f18;
            }
            double dSqrt = Math.sqrt((d15 * d15) - ((4.0d * d14) * d13));
            double d17 = d14 * 2.0d;
            float f23 = (float) ((dSqrt - d15) / d17);
            float f24 = f23 < 0.0f ? 0.0f : f23;
            if (f24 > 1.0f) {
                f24 = 1.0f;
            }
            if (Math.abs(f24 - f23) > 1.05E-6f) {
                f24 = Float.NaN;
            }
            if (!Float.isNaN(f24)) {
                return f24;
            }
            float f25 = (float) (((-d15) - dSqrt) / d17);
            f17 = f25 >= 0.0f ? f25 : 0.0f;
            f18 = f17 <= 1.0f ? f17 : 1.0f;
            if (Math.abs(f18 - f25) > 1.05E-6f) {
                return Float.NaN;
            }
            return f18;
        }
        double d18 = d14 / d16;
        double d19 = d15 / d16;
        double d23 = d13 / d16;
        double d24 = ((d19 * 3.0d) - (d18 * d18)) / 9.0d;
        double d25 = (((((2.0d * d18) * d18) * d18) - ((9.0d * d18) * d19)) + (d23 * 27.0d)) / 54.0d;
        double d26 = d24 * d24 * d24;
        double d27 = (d25 * d25) + d26;
        double d28 = d18 / 3.0d;
        if (d27 >= 0.0d) {
            if (d27 != 0.0d) {
                double dSqrt2 = Math.sqrt(d27);
                float fIobyxmoadg = (float) (((double) (y0.wkgbmnqykc.iobyxmoadg((float) ((-d25) + dSqrt2)) - y0.wkgbmnqykc.iobyxmoadg((float) (d25 + dSqrt2)))) - d28);
                f17 = fIobyxmoadg >= 0.0f ? fIobyxmoadg : 0.0f;
                f18 = f17 <= 1.0f ? f17 : 1.0f;
                if (Math.abs(f18 - fIobyxmoadg) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f18;
            }
            float f26 = -y0.wkgbmnqykc.iobyxmoadg((float) d25);
            float f27 = (float) d28;
            float f28 = (2.0f * f26) - f27;
            float f29 = f28 < 0.0f ? 0.0f : f28;
            if (f29 > 1.0f) {
                f29 = 1.0f;
            }
            if (Math.abs(f29 - f28) > 1.05E-6f) {
                f29 = Float.NaN;
            }
            if (!Float.isNaN(f29)) {
                return f29;
            }
            float f33 = (-f26) - f27;
            f17 = f33 >= 0.0f ? f33 : 0.0f;
            f18 = f17 <= 1.0f ? f17 : 1.0f;
            if (Math.abs(f18 - f33) > 1.05E-6f) {
                return Float.NaN;
            }
            return f18;
        }
        double dSqrt3 = Math.sqrt(-d26);
        double d29 = (-d25) / dSqrt3;
        if (d29 < -1.0d) {
            d29 = -1.0d;
        }
        if (d29 > 1.0d) {
            d29 = 1.0d;
        }
        double dAcos = Math.acos(d29);
        double dIobyxmoadg = y0.wkgbmnqykc.iobyxmoadg((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dIobyxmoadg) - d28);
        float f34 = fCos < 0.0f ? 0.0f : fCos;
        if (f34 > 1.0f) {
            f34 = 1.0f;
        }
        if (Math.abs(f34 - fCos) > 1.05E-6f) {
            f34 = Float.NaN;
        }
        if (!Float.isNaN(f34)) {
            return f34;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dIobyxmoadg) - d28);
        float f35 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f35 > 1.0f) {
            f35 = 1.0f;
        }
        if (Math.abs(f35 - fCos2) > 1.05E-6f) {
            f35 = Float.NaN;
        }
        if (!Float.isNaN(f35)) {
            return f35;
        }
        float fCos3 = (float) ((dIobyxmoadg * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d28);
        f17 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f18 = f17 <= 1.0f ? f17 : 1.0f;
        if (Math.abs(f18 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f18;
    }

    private static final int gxszxtbevo(float f13, float f14, float f15, float[] fArr, int i13) {
        double d13 = f13;
        double d14 = f14;
        double d15 = f15;
        double d16 = d14 * 2.0d;
        double d17 = (d13 - d16) + d15;
        if (d17 == 0.0d) {
            if (d14 == d15) {
                return 0;
            }
            return lqeggnwhkg((float) ((d16 - d15) / (d16 - (d15 * 2.0d))), fArr, i13);
        }
        double d18 = -Math.sqrt((d14 * d14) - (d15 * d13));
        double d19 = (-d13) + d14;
        int iLqeggnwhkg = lqeggnwhkg((float) ((-(d18 + d19)) / d17), fArr, i13);
        int iLqeggnwhkg2 = iLqeggnwhkg + lqeggnwhkg((float) ((d18 - d19) / d17), fArr, i13 + iLqeggnwhkg);
        if (iLqeggnwhkg2 > 1) {
            float f16 = fArr[i13];
            int i14 = i13 + 1;
            float f17 = fArr[i14];
            if (f16 > f17) {
                fArr[i13] = f17;
                fArr[i14] = f16;
            } else if (f16 == f17) {
                return iLqeggnwhkg2 - 1;
            }
        }
        return iLqeggnwhkg2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lqeggnwhkg(float f13, float[] fArr, int i13) {
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (Math.abs(f14 - f13) > 1.05E-6f) {
            f14 = Float.NaN;
        }
        fArr[i13] = f14;
        return !Float.isNaN(f14) ? 1 : 0;
    }

    public static final float ppxfxbqfkf(float f13, float f14, float f15) {
        return ((((((f13 - f14) + 0.33333334f) * f15) + (f14 - (2.0f * f13))) * f15) + f13) * 3.0f * f15;
    }

    private static final float wkgbmnqykc(float f13, float f14, float f15, float f16, float f17) {
        float f18 = (f16 + ((f14 - f15) * 3.0f)) - f13;
        return (((((f18 * f17) + (((f15 - (2.0f * f14)) + f13) * 3.0f)) * f17) + ((f14 - f13) * 3.0f)) * f17) + f13;
    }

    public static final long zoijcleaow(float f13, float f14, float f15, float f16, float[] fArr, int i13) {
        float f17 = (f14 - f13) * 3.0f;
        float f18 = (f15 - f14) * 3.0f;
        float f19 = (f16 - f15) * 3.0f;
        int iGxszxtbevo = gxszxtbevo(f17, f18, f19, fArr, i13);
        float f23 = (f18 - f17) * 2.0f;
        int iLqeggnwhkg = iGxszxtbevo + lqeggnwhkg((-f23) / (((f19 - f18) * 2.0f) - f23), fArr, i13 + iGxszxtbevo);
        float fMin = Math.min(f13, f16);
        float fMax = Math.max(f13, f16);
        for (int i14 = 0; i14 < iLqeggnwhkg; i14++) {
            float fWkgbmnqykc = wkgbmnqykc(f13, f14, f15, f16, fArr[i14]);
            fMin = Math.min(fMin, fWkgbmnqykc);
            fMax = Math.max(fMax, fWkgbmnqykc);
        }
        return androidx.collection.nufgyqmvbu.iobyxmoadg(fMin, fMax);
    }
}
