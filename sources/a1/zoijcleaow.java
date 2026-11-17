package a1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    static class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        double f269iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        double[] f270zoijcleaow;

        iobyxmoadg(double d13, double[] dArr) {
            this.f269iobyxmoadg = d13;
            this.f270zoijcleaow = dArr;
        }

        @Override // a1.zoijcleaow
        public void eablkybsjg(double d13, float[] fArr) {
            int i13 = 0;
            while (true) {
                double[] dArr = this.f270zoijcleaow;
                if (i13 >= dArr.length) {
                    return;
                }
                fArr[i13] = (float) dArr[i13];
                i13++;
            }
        }

        @Override // a1.zoijcleaow
        public void gxszxtbevo(double d13, double[] dArr) {
            for (int i13 = 0; i13 < this.f270zoijcleaow.length; i13++) {
                dArr[i13] = 0.0d;
            }
        }

        @Override // a1.zoijcleaow
        public double[] lqeggnwhkg() {
            return new double[]{this.f269iobyxmoadg};
        }

        @Override // a1.zoijcleaow
        public double ppxfxbqfkf(double d13, int i13) {
            return this.f270zoijcleaow[i13];
        }

        @Override // a1.zoijcleaow
        public void wkgbmnqykc(double d13, double[] dArr) {
            double[] dArr2 = this.f270zoijcleaow;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }
    }

    public static zoijcleaow iobyxmoadg(int i13, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i13 = 2;
        }
        if (i13 != 0) {
            return i13 != 2 ? new gxszxtbevo(dArr, dArr2) : new iobyxmoadg(dArr[0], dArr2[0]);
        }
        return new lqeggnwhkg(dArr, dArr2);
    }

    public static zoijcleaow zoijcleaow(int[] iArr, double[] dArr, double[][] dArr2) {
        return new a1.iobyxmoadg(iArr, dArr, dArr2);
    }

    public abstract void eablkybsjg(double d13, float[] fArr);

    public abstract void gxszxtbevo(double d13, double[] dArr);

    public abstract double[] lqeggnwhkg();

    public abstract double ppxfxbqfkf(double d13, int i13);

    public abstract void wkgbmnqykc(double d13, double[] dArr);
}
