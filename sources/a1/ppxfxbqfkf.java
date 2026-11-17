package a1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    String f261iobyxmoadg = "identity";

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static ppxfxbqfkf f260zoijcleaow = new ppxfxbqfkf();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static String[] f259ppxfxbqfkf = {"standard", "accelerate", "decelerate", "linear"};

    static class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private static double f262dxjokdxxww = 1.0E-4d;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static double f263nufgyqmvbu = 0.01d;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        double f264eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        double f265gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        double f266lqeggnwhkg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        double f267wkgbmnqykc;

        iobyxmoadg(String str) {
            this.f261iobyxmoadg = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f267wkgbmnqykc = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i13 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i13);
            this.f264eablkybsjg = Double.parseDouble(str.substring(i13, iIndexOf3).trim());
            int i14 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i14);
            this.f265gxszxtbevo = Double.parseDouble(str.substring(i14, iIndexOf4).trim());
            int i15 = iIndexOf4 + 1;
            this.f266lqeggnwhkg = Double.parseDouble(str.substring(i15, str.indexOf(41, i15)).trim());
        }

        private double eablkybsjg(double d13) {
            double d14 = 1.0d - d13;
            double d15 = 3.0d * d14;
            return (this.f264eablkybsjg * d14 * d15 * d13) + (this.f266lqeggnwhkg * d15 * d13 * d13) + (d13 * d13 * d13);
        }

        private double wkgbmnqykc(double d13) {
            double d14 = 1.0d - d13;
            double d15 = 3.0d * d14;
            return (this.f267wkgbmnqykc * d14 * d15 * d13) + (this.f265gxszxtbevo * d15 * d13 * d13) + (d13 * d13 * d13);
        }

        @Override // a1.ppxfxbqfkf
        public double iobyxmoadg(double d13) {
            if (d13 <= 0.0d) {
                return 0.0d;
            }
            if (d13 >= 1.0d) {
                return 1.0d;
            }
            double d14 = 0.5d;
            double d15 = 0.5d;
            while (d14 > f263nufgyqmvbu) {
                d14 *= 0.5d;
                d15 = wkgbmnqykc(d15) < d13 ? d15 + d14 : d15 - d14;
            }
            double d16 = d15 - d14;
            double dWkgbmnqykc = wkgbmnqykc(d16);
            double d17 = d15 + d14;
            double dWkgbmnqykc2 = wkgbmnqykc(d17);
            double dEablkybsjg = eablkybsjg(d16);
            return (((eablkybsjg(d17) - dEablkybsjg) * (d13 - dWkgbmnqykc)) / (dWkgbmnqykc2 - dWkgbmnqykc)) + dEablkybsjg;
        }

        @Override // a1.ppxfxbqfkf
        public double zoijcleaow(double d13) {
            double d14 = 0.5d;
            double d15 = 0.5d;
            while (d14 > f262dxjokdxxww) {
                d14 *= 0.5d;
                d15 = wkgbmnqykc(d15) < d13 ? d15 + d14 : d15 - d14;
            }
            double d16 = d15 - d14;
            double d17 = d15 + d14;
            return (eablkybsjg(d17) - eablkybsjg(d16)) / (wkgbmnqykc(d17) - wkgbmnqykc(d16));
        }
    }

    public static ppxfxbqfkf ppxfxbqfkf(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new iobyxmoadg(str);
        }
        if (str.startsWith("spline")) {
            return new draadjrbmk(str);
        }
        if (str.startsWith("Schlick")) {
            return new dxjokdxxww(str);
        }
        switch (str) {
            case "accelerate":
                return new iobyxmoadg("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new iobyxmoadg("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new iobyxmoadg("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new iobyxmoadg("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new iobyxmoadg("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new iobyxmoadg("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f259ppxfxbqfkf));
                return f260zoijcleaow;
        }
    }

    public double iobyxmoadg(double d13) {
        return d13;
    }

    public String toString() {
        return this.f261iobyxmoadg;
    }

    public double zoijcleaow(double d13) {
        return 1.0d;
    }
}
