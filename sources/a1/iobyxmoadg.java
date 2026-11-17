package a1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double[] f213iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f214ppxfxbqfkf = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    C0005iobyxmoadg[] f215zoijcleaow;

    /* JADX INFO: renamed from: a1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0005iobyxmoadg {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private static double[] f216kcexrzcfyt = new double[91];

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        double f217agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        double f218btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        double f219draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        double f220dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        double f221eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        double f222gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        double f223gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        double[] f224iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        double f225lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        double f226nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        double f227ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        boolean f228oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        double f229ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        double f230rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        boolean f231vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        double f232wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        double f233wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        double f234zoijcleaow;

        C0005iobyxmoadg(int i13, double d13, double d14, double d15, double d16, double d17, double d18) {
            this.f228oxmwwwfdhm = false;
            double d19 = d17 - d15;
            double d23 = d18 - d16;
            if (i13 == 1) {
                this.f231vdvldrhtss = true;
            } else if (i13 == 4) {
                this.f231vdvldrhtss = d23 > 0.0d;
            } else if (i13 != 5) {
                this.f231vdvldrhtss = false;
            } else {
                this.f231vdvldrhtss = d23 < 0.0d;
            }
            this.f229ppxfxbqfkf = d13;
            this.f233wkgbmnqykc = d14;
            this.f220dxjokdxxww = 1.0d / (d14 - d13);
            if (3 == i13) {
                this.f228oxmwwwfdhm = true;
            }
            if (!this.f228oxmwwwfdhm && Math.abs(d19) >= 0.001d && Math.abs(d23) >= 0.001d) {
                this.f224iobyxmoadg = new double[101];
                boolean z13 = this.f231vdvldrhtss;
                this.f218btonecajqb = d19 * ((double) (z13 ? -1 : 1));
                this.f222gtknphoqwx = d23 * ((double) (z13 ? 1 : -1));
                this.f219draadjrbmk = z13 ? d17 : d15;
                this.f232wflxmlrfwp = z13 ? d16 : d18;
                iobyxmoadg(d15, d16, d17, d18);
                this.f217agtfadlqog = this.f234zoijcleaow * this.f220dxjokdxxww;
                return;
            }
            this.f228oxmwwwfdhm = true;
            this.f221eablkybsjg = d15;
            this.f223gxszxtbevo = d17;
            this.f225lqeggnwhkg = d16;
            this.f226nufgyqmvbu = d18;
            double dHypot = Math.hypot(d23, d19);
            this.f234zoijcleaow = dHypot;
            this.f217agtfadlqog = dHypot * this.f220dxjokdxxww;
            double d24 = this.f233wkgbmnqykc;
            double d25 = this.f229ppxfxbqfkf;
            this.f219draadjrbmk = d19 / (d24 - d25);
            this.f232wflxmlrfwp = d23 / (d24 - d25);
        }

        private void iobyxmoadg(double d13, double d14, double d15, double d16) {
            double dHypot;
            double d17 = d15 - d13;
            double d18 = d14 - d16;
            int i13 = 0;
            double d19 = 0.0d;
            double d23 = 0.0d;
            double d24 = 0.0d;
            while (true) {
                double[] dArr = f216kcexrzcfyt;
                if (i13 >= dArr.length) {
                    break;
                }
                double d25 = d19;
                double radians = Math.toRadians((((double) i13) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d17;
                double dCos = Math.cos(radians) * d18;
                if (i13 > 0) {
                    dHypot = Math.hypot(dSin - d23, dCos - d24) + d25;
                    f216kcexrzcfyt[i13] = dHypot;
                } else {
                    dHypot = d25;
                }
                i13++;
                d24 = dCos;
                d19 = dHypot;
                d23 = dSin;
            }
            double d26 = d19;
            this.f234zoijcleaow = d26;
            int i14 = 0;
            while (true) {
                double[] dArr2 = f216kcexrzcfyt;
                if (i14 >= dArr2.length) {
                    break;
                }
                dArr2[i14] = dArr2[i14] / d26;
                i14++;
            }
            int i15 = 0;
            while (true) {
                double[] dArr3 = this.f224iobyxmoadg;
                if (i15 >= dArr3.length) {
                    return;
                }
                double length = ((double) i15) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f216kcexrzcfyt, length);
                if (iBinarySearch >= 0) {
                    this.f224iobyxmoadg[i15] = ((double) iBinarySearch) / ((double) (f216kcexrzcfyt.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f224iobyxmoadg[i15] = 0.0d;
                } else {
                    int i16 = -iBinarySearch;
                    int i17 = i16 - 2;
                    double[] dArr4 = f216kcexrzcfyt;
                    double d27 = dArr4[i17];
                    this.f224iobyxmoadg[i15] = (((double) i17) + ((length - d27) / (dArr4[i16 - 1] - d27))) / ((double) (dArr4.length - 1));
                }
                i15++;
            }
        }

        double btonecajqb(double d13) {
            if (d13 <= 0.0d) {
                return 0.0d;
            }
            if (d13 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f224iobyxmoadg;
            double length = d13 * ((double) (dArr.length - 1));
            int i13 = (int) length;
            double d14 = length - ((double) i13);
            double d15 = dArr[i13];
            return d15 + (d14 * (dArr[i13 + 1] - d15));
        }

        double dxjokdxxww() {
            return this.f232wflxmlrfwp + (this.f222gtknphoqwx * this.f230rgvfuqvkyq);
        }

        public double eablkybsjg(double d13) {
            return this.f232wflxmlrfwp;
        }

        void gtknphoqwx(double d13) {
            double dBtonecajqb = btonecajqb((this.f231vdvldrhtss ? this.f233wkgbmnqykc - d13 : d13 - this.f229ppxfxbqfkf) * this.f220dxjokdxxww) * 1.5707963267948966d;
            this.f227ojitshcjhn = Math.sin(dBtonecajqb);
            this.f230rgvfuqvkyq = Math.cos(dBtonecajqb);
        }

        public double gxszxtbevo(double d13) {
            double d14 = (d13 - this.f229ppxfxbqfkf) * this.f220dxjokdxxww;
            double d15 = this.f221eablkybsjg;
            return d15 + (d14 * (this.f223gxszxtbevo - d15));
        }

        public double lqeggnwhkg(double d13) {
            double d14 = (d13 - this.f229ppxfxbqfkf) * this.f220dxjokdxxww;
            double d15 = this.f225lqeggnwhkg;
            return d15 + (d14 * (this.f226nufgyqmvbu - d15));
        }

        double nufgyqmvbu() {
            return this.f219draadjrbmk + (this.f218btonecajqb * this.f227ojitshcjhn);
        }

        double ppxfxbqfkf() {
            double d13 = this.f218btonecajqb * this.f230rgvfuqvkyq;
            double d14 = (-this.f222gtknphoqwx) * this.f227ojitshcjhn;
            double dHypot = this.f217agtfadlqog / Math.hypot(d13, d14);
            return this.f231vdvldrhtss ? (-d14) * dHypot : d14 * dHypot;
        }

        public double wkgbmnqykc(double d13) {
            return this.f219draadjrbmk;
        }

        double zoijcleaow() {
            double d13 = this.f218btonecajqb * this.f230rgvfuqvkyq;
            double dHypot = this.f217agtfadlqog / Math.hypot(d13, (-this.f222gtknphoqwx) * this.f227ojitshcjhn);
            if (this.f231vdvldrhtss) {
                d13 = -d13;
            }
            return d13 * dHypot;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[PHI: r9
      0x002e: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:6:0x001e, B:12:0x0028, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public iobyxmoadg(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f213iobyxmoadg = dArr;
        this.f215zoijcleaow = new C0005iobyxmoadg[dArr.length - 1];
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (true) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr = this.f215zoijcleaow;
            if (i15 >= c0005iobyxmoadgArr.length) {
                return;
            }
            int i16 = iArr[i15];
            int i17 = 3;
            if (i16 == 0) {
                i14 = i17;
            } else if (i16 == 1) {
                i13 = 1;
                i14 = i13;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        i17 = 4;
                        if (i16 != 4) {
                            i17 = 5;
                            if (i16 == 5) {
                                i14 = i17;
                            }
                        } else {
                            i14 = i17;
                        }
                    } else {
                        if (i13 != 1) {
                            i13 = 1;
                        }
                        i14 = i13;
                    }
                }
                i13 = 2;
                i14 = i13;
            }
            double d13 = dArr[i15];
            int i18 = i15 + 1;
            double d14 = dArr[i18];
            double[] dArr3 = dArr2[i15];
            double d15 = dArr3[0];
            double d16 = dArr3[1];
            double[] dArr4 = dArr2[i18];
            c0005iobyxmoadgArr[i15] = new C0005iobyxmoadg(i14, d13, d14, d15, d16, dArr4[0], dArr4[1]);
            i15 = i18;
        }
    }

    @Override // a1.zoijcleaow
    public void eablkybsjg(double d13, float[] fArr) {
        if (this.f214ppxfxbqfkf) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr = this.f215zoijcleaow;
            C0005iobyxmoadg c0005iobyxmoadg = c0005iobyxmoadgArr[0];
            double d14 = c0005iobyxmoadg.f229ppxfxbqfkf;
            if (d13 < d14) {
                double d15 = d13 - d14;
                if (c0005iobyxmoadg.f228oxmwwwfdhm) {
                    fArr[0] = (float) (c0005iobyxmoadg.gxszxtbevo(d14) + (this.f215zoijcleaow[0].wkgbmnqykc(d14) * d15));
                    fArr[1] = (float) (this.f215zoijcleaow[0].lqeggnwhkg(d14) + (d15 * this.f215zoijcleaow[0].eablkybsjg(d14)));
                    return;
                } else {
                    c0005iobyxmoadg.gtknphoqwx(d14);
                    fArr[0] = (float) (this.f215zoijcleaow[0].nufgyqmvbu() + (this.f215zoijcleaow[0].zoijcleaow() * d15));
                    fArr[1] = (float) (this.f215zoijcleaow[0].dxjokdxxww() + (d15 * this.f215zoijcleaow[0].ppxfxbqfkf()));
                    return;
                }
            }
            if (d13 > c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc) {
                double d16 = c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc;
                double d17 = d13 - d16;
                int length = c0005iobyxmoadgArr.length - 1;
                C0005iobyxmoadg c0005iobyxmoadg2 = c0005iobyxmoadgArr[length];
                if (c0005iobyxmoadg2.f228oxmwwwfdhm) {
                    fArr[0] = (float) (c0005iobyxmoadg2.gxszxtbevo(d16) + (this.f215zoijcleaow[length].wkgbmnqykc(d16) * d17));
                    fArr[1] = (float) (this.f215zoijcleaow[length].lqeggnwhkg(d16) + (d17 * this.f215zoijcleaow[length].eablkybsjg(d16)));
                    return;
                } else {
                    c0005iobyxmoadg2.gtknphoqwx(d13);
                    fArr[0] = (float) this.f215zoijcleaow[length].nufgyqmvbu();
                    fArr[1] = (float) this.f215zoijcleaow[length].dxjokdxxww();
                    return;
                }
            }
        } else {
            C0005iobyxmoadg[] c0005iobyxmoadgArr2 = this.f215zoijcleaow;
            double d18 = c0005iobyxmoadgArr2[0].f229ppxfxbqfkf;
            if (d13 < d18) {
                d13 = d18;
            } else if (d13 > c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc) {
                d13 = c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc;
            }
        }
        int i13 = 0;
        while (true) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr3 = this.f215zoijcleaow;
            if (i13 >= c0005iobyxmoadgArr3.length) {
                return;
            }
            C0005iobyxmoadg c0005iobyxmoadg3 = c0005iobyxmoadgArr3[i13];
            if (d13 <= c0005iobyxmoadg3.f233wkgbmnqykc) {
                if (c0005iobyxmoadg3.f228oxmwwwfdhm) {
                    fArr[0] = (float) c0005iobyxmoadg3.gxszxtbevo(d13);
                    fArr[1] = (float) this.f215zoijcleaow[i13].lqeggnwhkg(d13);
                    return;
                } else {
                    c0005iobyxmoadg3.gtknphoqwx(d13);
                    fArr[0] = (float) this.f215zoijcleaow[i13].nufgyqmvbu();
                    fArr[1] = (float) this.f215zoijcleaow[i13].dxjokdxxww();
                    return;
                }
            }
            i13++;
        }
    }

    @Override // a1.zoijcleaow
    public void gxszxtbevo(double d13, double[] dArr) {
        C0005iobyxmoadg[] c0005iobyxmoadgArr = this.f215zoijcleaow;
        double d14 = c0005iobyxmoadgArr[0].f229ppxfxbqfkf;
        if (d13 < d14) {
            d13 = d14;
        } else if (d13 > c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc) {
            d13 = c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc;
        }
        int i13 = 0;
        while (true) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr2 = this.f215zoijcleaow;
            if (i13 >= c0005iobyxmoadgArr2.length) {
                return;
            }
            C0005iobyxmoadg c0005iobyxmoadg = c0005iobyxmoadgArr2[i13];
            if (d13 <= c0005iobyxmoadg.f233wkgbmnqykc) {
                if (c0005iobyxmoadg.f228oxmwwwfdhm) {
                    dArr[0] = c0005iobyxmoadg.wkgbmnqykc(d13);
                    dArr[1] = this.f215zoijcleaow[i13].eablkybsjg(d13);
                    return;
                } else {
                    c0005iobyxmoadg.gtknphoqwx(d13);
                    dArr[0] = this.f215zoijcleaow[i13].zoijcleaow();
                    dArr[1] = this.f215zoijcleaow[i13].ppxfxbqfkf();
                    return;
                }
            }
            i13++;
        }
    }

    @Override // a1.zoijcleaow
    public double[] lqeggnwhkg() {
        return this.f213iobyxmoadg;
    }

    @Override // a1.zoijcleaow
    public double ppxfxbqfkf(double d13, int i13) {
        double dLqeggnwhkg;
        double dEablkybsjg;
        double dDxjokdxxww;
        double dPpxfxbqfkf;
        double dLqeggnwhkg2;
        double dEablkybsjg2;
        int i14 = 0;
        if (this.f214ppxfxbqfkf) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr = this.f215zoijcleaow;
            C0005iobyxmoadg c0005iobyxmoadg = c0005iobyxmoadgArr[0];
            double d14 = c0005iobyxmoadg.f229ppxfxbqfkf;
            if (d13 < d14) {
                double d15 = d13 - d14;
                if (c0005iobyxmoadg.f228oxmwwwfdhm) {
                    if (i13 == 0) {
                        dLqeggnwhkg2 = c0005iobyxmoadg.gxszxtbevo(d14);
                        dEablkybsjg2 = this.f215zoijcleaow[0].wkgbmnqykc(d14);
                    } else {
                        dLqeggnwhkg2 = c0005iobyxmoadg.lqeggnwhkg(d14);
                        dEablkybsjg2 = this.f215zoijcleaow[0].eablkybsjg(d14);
                    }
                    return dLqeggnwhkg2 + (d15 * dEablkybsjg2);
                }
                c0005iobyxmoadg.gtknphoqwx(d14);
                if (i13 == 0) {
                    dDxjokdxxww = this.f215zoijcleaow[0].nufgyqmvbu();
                    dPpxfxbqfkf = this.f215zoijcleaow[0].zoijcleaow();
                } else {
                    dDxjokdxxww = this.f215zoijcleaow[0].dxjokdxxww();
                    dPpxfxbqfkf = this.f215zoijcleaow[0].ppxfxbqfkf();
                }
                return dDxjokdxxww + (d15 * dPpxfxbqfkf);
            }
            if (d13 > c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc) {
                double d16 = c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc;
                double d17 = d13 - d16;
                int length = c0005iobyxmoadgArr.length - 1;
                if (i13 == 0) {
                    dLqeggnwhkg = c0005iobyxmoadgArr[length].gxszxtbevo(d16);
                    dEablkybsjg = this.f215zoijcleaow[length].wkgbmnqykc(d16);
                } else {
                    dLqeggnwhkg = c0005iobyxmoadgArr[length].lqeggnwhkg(d16);
                    dEablkybsjg = this.f215zoijcleaow[length].eablkybsjg(d16);
                }
                return dLqeggnwhkg + (d17 * dEablkybsjg);
            }
        } else {
            C0005iobyxmoadg[] c0005iobyxmoadgArr2 = this.f215zoijcleaow;
            double d18 = c0005iobyxmoadgArr2[0].f229ppxfxbqfkf;
            if (d13 < d18) {
                d13 = d18;
            } else if (d13 > c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc) {
                d13 = c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc;
            }
        }
        while (true) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr3 = this.f215zoijcleaow;
            if (i14 >= c0005iobyxmoadgArr3.length) {
                return Double.NaN;
            }
            C0005iobyxmoadg c0005iobyxmoadg2 = c0005iobyxmoadgArr3[i14];
            if (d13 <= c0005iobyxmoadg2.f233wkgbmnqykc) {
                if (c0005iobyxmoadg2.f228oxmwwwfdhm) {
                    return i13 == 0 ? c0005iobyxmoadg2.gxszxtbevo(d13) : c0005iobyxmoadg2.lqeggnwhkg(d13);
                }
                c0005iobyxmoadg2.gtknphoqwx(d13);
                return i13 == 0 ? this.f215zoijcleaow[i14].nufgyqmvbu() : this.f215zoijcleaow[i14].dxjokdxxww();
            }
            i14++;
        }
    }

    @Override // a1.zoijcleaow
    public void wkgbmnqykc(double d13, double[] dArr) {
        if (this.f214ppxfxbqfkf) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr = this.f215zoijcleaow;
            C0005iobyxmoadg c0005iobyxmoadg = c0005iobyxmoadgArr[0];
            double d14 = c0005iobyxmoadg.f229ppxfxbqfkf;
            if (d13 < d14) {
                double d15 = d13 - d14;
                if (c0005iobyxmoadg.f228oxmwwwfdhm) {
                    dArr[0] = c0005iobyxmoadg.gxszxtbevo(d14) + (this.f215zoijcleaow[0].wkgbmnqykc(d14) * d15);
                    dArr[1] = this.f215zoijcleaow[0].lqeggnwhkg(d14) + (d15 * this.f215zoijcleaow[0].eablkybsjg(d14));
                    return;
                } else {
                    c0005iobyxmoadg.gtknphoqwx(d14);
                    dArr[0] = this.f215zoijcleaow[0].nufgyqmvbu() + (this.f215zoijcleaow[0].zoijcleaow() * d15);
                    dArr[1] = this.f215zoijcleaow[0].dxjokdxxww() + (d15 * this.f215zoijcleaow[0].ppxfxbqfkf());
                    return;
                }
            }
            if (d13 > c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc) {
                double d16 = c0005iobyxmoadgArr[c0005iobyxmoadgArr.length - 1].f233wkgbmnqykc;
                double d17 = d13 - d16;
                int length = c0005iobyxmoadgArr.length - 1;
                C0005iobyxmoadg c0005iobyxmoadg2 = c0005iobyxmoadgArr[length];
                if (c0005iobyxmoadg2.f228oxmwwwfdhm) {
                    dArr[0] = c0005iobyxmoadg2.gxszxtbevo(d16) + (this.f215zoijcleaow[length].wkgbmnqykc(d16) * d17);
                    dArr[1] = this.f215zoijcleaow[length].lqeggnwhkg(d16) + (d17 * this.f215zoijcleaow[length].eablkybsjg(d16));
                    return;
                } else {
                    c0005iobyxmoadg2.gtknphoqwx(d13);
                    dArr[0] = this.f215zoijcleaow[length].nufgyqmvbu() + (this.f215zoijcleaow[length].zoijcleaow() * d17);
                    dArr[1] = this.f215zoijcleaow[length].dxjokdxxww() + (d17 * this.f215zoijcleaow[length].ppxfxbqfkf());
                    return;
                }
            }
        } else {
            C0005iobyxmoadg[] c0005iobyxmoadgArr2 = this.f215zoijcleaow;
            double d18 = c0005iobyxmoadgArr2[0].f229ppxfxbqfkf;
            if (d13 < d18) {
                d13 = d18;
            }
            if (d13 > c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc) {
                d13 = c0005iobyxmoadgArr2[c0005iobyxmoadgArr2.length - 1].f233wkgbmnqykc;
            }
        }
        int i13 = 0;
        while (true) {
            C0005iobyxmoadg[] c0005iobyxmoadgArr3 = this.f215zoijcleaow;
            if (i13 >= c0005iobyxmoadgArr3.length) {
                return;
            }
            C0005iobyxmoadg c0005iobyxmoadg3 = c0005iobyxmoadgArr3[i13];
            if (d13 <= c0005iobyxmoadg3.f233wkgbmnqykc) {
                if (c0005iobyxmoadg3.f228oxmwwwfdhm) {
                    dArr[0] = c0005iobyxmoadg3.gxszxtbevo(d13);
                    dArr[1] = this.f215zoijcleaow[i13].lqeggnwhkg(d13);
                    return;
                } else {
                    c0005iobyxmoadg3.gtknphoqwx(d13);
                    dArr[0] = this.f215zoijcleaow[i13].nufgyqmvbu();
                    dArr[1] = this.f215zoijcleaow[i13].dxjokdxxww();
                    return;
                }
            }
            i13++;
        }
    }
}
