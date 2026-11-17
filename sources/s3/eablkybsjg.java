package s3;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final iobyxmoadg f105302iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f105303ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final boolean f105304wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final iobyxmoadg f105305zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zoijcleaow[] f105306iobyxmoadg;

        public iobyxmoadg(zoijcleaow... zoijcleaowVarArr) {
            this.f105306iobyxmoadg = zoijcleaowVarArr;
        }

        public zoijcleaow iobyxmoadg(int i13) {
            return this.f105306iobyxmoadg[i13];
        }

        public int zoijcleaow() {
            return this.f105306iobyxmoadg.length;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105307iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final float[] f105308ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final float[] f105309wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105310zoijcleaow;

        public zoijcleaow(int i13, float[] fArr, float[] fArr2, int i14) {
            this.f105307iobyxmoadg = i13;
            y2.iobyxmoadg.iobyxmoadg(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f105308ppxfxbqfkf = fArr;
            this.f105309wkgbmnqykc = fArr2;
            this.f105310zoijcleaow = i14;
        }

        public int iobyxmoadg() {
            return this.f105308ppxfxbqfkf.length / 3;
        }
    }

    public eablkybsjg(iobyxmoadg iobyxmoadgVar, int i13) {
        this(iobyxmoadgVar, iobyxmoadgVar, i13);
    }

    public static eablkybsjg iobyxmoadg(float f13, int i13, int i14, float f14, float f15, int i15) {
        int i16;
        int i17;
        int i18;
        float[] fArr;
        int i19;
        int i23 = i13;
        int i24 = i14;
        y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f);
        y2.iobyxmoadg.iobyxmoadg(i23 >= 1);
        y2.iobyxmoadg.iobyxmoadg(i24 >= 1);
        y2.iobyxmoadg.iobyxmoadg(f14 > 0.0f && f14 <= 180.0f);
        y2.iobyxmoadg.iobyxmoadg(f15 > 0.0f && f15 <= 360.0f);
        float radians = (float) Math.toRadians(f14);
        float radians2 = (float) Math.toRadians(f15);
        float f16 = radians / i23;
        float f17 = radians2 / i24;
        int i25 = i24 + 1;
        int i26 = ((i25 * 2) + 2) * i23;
        float[] fArr2 = new float[i26 * 3];
        float[] fArr3 = new float[i26 * 2];
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i27 < i23) {
            float f18 = radians / 2.0f;
            float f19 = (i27 * f16) - f18;
            int i33 = i27 + 1;
            float f23 = (i33 * f16) - f18;
            int i34 = 0;
            while (i34 < i25) {
                float f24 = f19;
                int i35 = i33;
                int i36 = 2;
                int i37 = 0;
                while (i37 < i36) {
                    float f25 = i34 * f17;
                    float f26 = f17;
                    int i38 = i34;
                    double d13 = f13;
                    float f27 = f16;
                    double d14 = (f25 + 3.1415927f) - (radians2 / 2.0f);
                    int i39 = i37;
                    double d15 = i37 == 0 ? f24 : f23;
                    float[] fArr4 = fArr3;
                    float f28 = f23;
                    fArr2[i28] = -((float) (Math.sin(d14) * d13 * Math.cos(d15)));
                    float f29 = radians;
                    float f33 = radians2;
                    fArr2[i28 + 1] = (float) (d13 * Math.sin(d15));
                    int i43 = i28 + 3;
                    fArr2[i28 + 2] = (float) (d13 * Math.cos(d14) * Math.cos(d15));
                    fArr4[i29] = f25 / f33;
                    int i44 = i29 + 2;
                    fArr4[i29 + 1] = ((i27 + i39) * f27) / f29;
                    if (i38 == 0 && i39 == 0) {
                        i16 = i14;
                        i17 = i38;
                        i18 = i39;
                    } else {
                        i16 = i14;
                        i17 = i38;
                        i18 = i39;
                        if (i17 != i16 || i18 != 1) {
                            fArr = fArr4;
                            i19 = 2;
                            i29 = i44;
                            i28 = i43;
                        }
                        i37 = i18 + 1;
                        i24 = i16;
                        i34 = i17;
                        fArr3 = fArr;
                        radians = f29;
                        i25 = i25;
                        f17 = f26;
                        radians2 = f33;
                        f23 = f28;
                        i36 = i19;
                        f16 = f27;
                    }
                    System.arraycopy(fArr2, i28, fArr2, i43, 3);
                    i28 += 6;
                    fArr = fArr4;
                    i19 = 2;
                    System.arraycopy(fArr, i29, fArr, i44, 2);
                    i29 += 4;
                    i37 = i18 + 1;
                    i24 = i16;
                    i34 = i17;
                    fArr3 = fArr;
                    radians = f29;
                    i25 = i25;
                    f17 = f26;
                    radians2 = f33;
                    f23 = f28;
                    i36 = i19;
                    f16 = f27;
                }
                float f34 = radians2;
                int i45 = i34;
                int i46 = i24;
                int i47 = i45 + 1;
                i33 = i35;
                f16 = f16;
                radians2 = f34;
                f23 = f23;
                f19 = f24;
                i24 = i46;
                i34 = i47;
            }
            i23 = i13;
            i27 = i33;
        }
        return new eablkybsjg(new iobyxmoadg(new zoijcleaow(0, fArr2, fArr3, 1)), i15);
    }

    public static eablkybsjg zoijcleaow(int i13) {
        return iobyxmoadg(50.0f, 36, 72, 180.0f, 360.0f, i13);
    }

    public eablkybsjg(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, int i13) {
        this.f105302iobyxmoadg = iobyxmoadgVar;
        this.f105305zoijcleaow = iobyxmoadgVar2;
        this.f105303ppxfxbqfkf = i13;
        this.f105304wkgbmnqykc = iobyxmoadgVar == iobyxmoadgVar2;
    }
}
