package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {
    private static final double eablkybsjg(double d13, double d14, double d15, double d16, double d17) {
        double dLog;
        double d18 = d17;
        double d19 = d13 - d14;
        double d23 = ((d13 * d15) - d16) / d19;
        double d24 = d15 - d23;
        double dLog2 = Math.log(Math.abs(d18 / d24)) / d13;
        double dLog3 = Math.log(Math.abs(d18 / d23)) / d14;
        if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog3) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog2 = Math.max(dLog2, dLog3);
            }
            dLog = dLog2;
        } else {
            dLog = dLog3;
        }
        double d25 = d24 * d13;
        double dLog4 = Math.log(d25 / ((-d23) * d14)) / (d14 - d13);
        if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
            d18 = -d18;
        } else if (dLog4 <= 0.0d || (-gxszxtbevo(d24, d13, dLog4, d23, d14)) >= d18) {
            dLog = Math.log((-((d23 * d14) * d14)) / (d25 * d13)) / d19;
        } else {
            if (d23 > 0.0d && d24 < 0.0d) {
                dLog = 0.0d;
            }
            d18 = -d18;
        }
        double d26 = d23 * d14;
        if (Math.abs((Math.exp(d13 * dLog) * d25) + (Math.exp(d14 * dLog) * d26)) < 1.0E-4d) {
            return dLog;
        }
        double d27 = Double.MAX_VALUE;
        int i13 = 0;
        while (d27 > 0.001d && i13 < 100) {
            i13++;
            double d28 = d13 * dLog;
            double d29 = d14 * dLog;
            double dExp = dLog - ((((Math.exp(d28) * d24) + (Math.exp(d29) * d23)) + d18) / ((Math.exp(d28) * d25) + (Math.exp(d29) * d26)));
            double dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
            d27 = dAbs;
        }
        return dLog;
    }

    private static final double gxszxtbevo(double d13, double d14, double d15, double d16, double d17) {
        return (d13 * Math.exp(d14 * d15)) + (d16 * Math.exp(d17 * d15));
    }

    public static final long iobyxmoadg(double d13, double d14, double d15, double d16, double d17) {
        double dSqrt = 2.0d * d14 * Math.sqrt(d13);
        double d18 = (dSqrt * dSqrt) - (4.0d * d13);
        double dSqrt2 = d18 < 0.0d ? 0.0d : Math.sqrt(d18);
        double d19 = -dSqrt;
        return wkgbmnqykc((d19 + dSqrt2) * 0.5d, (d18 < 0.0d ? Math.sqrt(Math.abs(d18)) : 0.0d) * 0.5d, (d19 - dSqrt2) * 0.5d, d14, d15, d16, d17);
    }

    private static final double lqeggnwhkg(double d13, double d14, double d15, double d16, double d17) {
        double d18 = (d16 - (d13 * d15)) / d14;
        return Math.log(d17 / Math.sqrt((d15 * d15) + (d18 * d18))) / d13;
    }

    private static final double ppxfxbqfkf(double d13, double d14, double d15, double d16) {
        double d17 = d16;
        double d18 = d13 * d14;
        double d19 = d15 - d18;
        double dLog = Math.log(Math.abs(d17 / d14)) / d13;
        double dLog2 = Math.log(Math.abs(d17 / d19));
        int i13 = 0;
        double dLog3 = dLog2;
        for (int i14 = 0; i14 < 6; i14++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d13));
        }
        double d23 = dLog3 / d13;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d23;
        } else if ((Double.doubleToRawLongBits(d23) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d23);
        }
        double d24 = (-(d18 + d19)) / (d13 * d19);
        double d25 = d13 * d24;
        double dExp = (Math.exp(d25) * d14) + (d19 * d24 * Math.exp(d25));
        if (Double.isNaN(d24) || d24 <= 0.0d) {
            d17 = -d17;
        } else if (d24 <= 0.0d || (-dExp) >= d17) {
            dLog = (-(2.0d / d13)) - (d14 / d19);
        } else {
            if (d19 < 0.0d && d14 > 0.0d) {
                dLog = 0.0d;
            }
            d17 = -d17;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i13 < 100) {
            i13++;
            double d26 = d13 * dLog;
            double d27 = d17;
            double dExp2 = dLog - ((((d14 + (d19 * dLog)) * Math.exp(d26)) + d17) / ((((((double) 1) + d26) * d19) + d18) * Math.exp(d26)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d17 = d27;
        }
        return dLog;
    }

    private static final long wkgbmnqykc(double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        double dLqeggnwhkg;
        double d23 = d17;
        if (d18 == 0.0d && d23 == 0.0d) {
            return 0L;
        }
        if (d18 < 0.0d) {
            d23 = -d23;
        }
        double dAbs = Math.abs(d18);
        if (d16 > 1.0d) {
            dLqeggnwhkg = eablkybsjg(d13, d15, dAbs, d23, d19);
        } else {
            dLqeggnwhkg = d16 < 1.0d ? lqeggnwhkg(d13, d14, dAbs, d23, d19) : ppxfxbqfkf(d13, dAbs, d23, d19);
        }
        return (long) (dLqeggnwhkg * 1000.0d);
    }

    public static final long zoijcleaow(float f13, float f14, float f15, float f16, float f17) {
        if (f14 == 0.0f) {
            return 9223372036854L;
        }
        return iobyxmoadg(f13, f14, f15, f16, f17);
    }
}
