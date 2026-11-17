package c1;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends wflxmlrfwp {
    private eablkybsjg[] M;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18365p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18366q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18367r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18368s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18369t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18370u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f18371v = 0.5f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f18372w = 0.5f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f18373x = 0.5f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18374y = 0.5f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f18375z = 0.5f;
    private float A = 0.5f;
    private int B = 0;
    private int C = 0;
    private int D = 2;
    private int E = 2;
    private int F = 0;
    private int G = -1;
    private int H = 0;
    private ArrayList I = new ArrayList();
    private eablkybsjg[] J = null;
    private eablkybsjg[] K = null;
    private int[] L = null;
    private int N = 0;

    private class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f18377btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f18379dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private wkgbmnqykc f18380eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f18381gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private wkgbmnqykc f18382gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f18383iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private wkgbmnqykc f18384lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f18385nufgyqmvbu;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private int f18390vdvldrhtss;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private wkgbmnqykc f18392wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private eablkybsjg f18393zoijcleaow = null;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f18388ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f18378draadjrbmk = 0;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f18391wflxmlrfwp = 0;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private int f18376agtfadlqog = 0;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private int f18386ojitshcjhn = 0;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private int f18389rgvfuqvkyq = 0;

        iobyxmoadg(int i13, wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2, wkgbmnqykc wkgbmnqykcVar3, wkgbmnqykc wkgbmnqykcVar4, int i14) {
            this.f18385nufgyqmvbu = 0;
            this.f18379dxjokdxxww = 0;
            this.f18377btonecajqb = 0;
            this.f18381gtknphoqwx = 0;
            this.f18390vdvldrhtss = 0;
            this.f18383iobyxmoadg = i13;
            this.f18392wkgbmnqykc = wkgbmnqykcVar;
            this.f18380eablkybsjg = wkgbmnqykcVar2;
            this.f18382gxszxtbevo = wkgbmnqykcVar3;
            this.f18384lqeggnwhkg = wkgbmnqykcVar4;
            this.f18385nufgyqmvbu = lqeggnwhkg.this.J();
            this.f18379dxjokdxxww = lqeggnwhkg.this.L();
            this.f18377btonecajqb = lqeggnwhkg.this.K();
            this.f18381gtknphoqwx = lqeggnwhkg.this.I();
            this.f18390vdvldrhtss = i14;
        }

        private void nufgyqmvbu() {
            this.f18378draadjrbmk = 0;
            this.f18391wflxmlrfwp = 0;
            this.f18393zoijcleaow = null;
            this.f18388ppxfxbqfkf = 0;
            int i13 = this.f18386ojitshcjhn;
            for (int i14 = 0; i14 < i13 && this.f18376agtfadlqog + i14 < lqeggnwhkg.this.N; i14++) {
                eablkybsjg eablkybsjgVar = lqeggnwhkg.this.M[this.f18376agtfadlqog + i14];
                if (this.f18383iobyxmoadg == 0) {
                    int iJlmebxxoox = eablkybsjgVar.jlmebxxoox();
                    int i15 = lqeggnwhkg.this.B;
                    if (eablkybsjgVar.crxdokpmqz() == 8) {
                        i15 = 0;
                    }
                    this.f18378draadjrbmk += iJlmebxxoox + i15;
                    int iU0 = lqeggnwhkg.this.u0(eablkybsjgVar, this.f18390vdvldrhtss);
                    if (this.f18393zoijcleaow == null || this.f18388ppxfxbqfkf < iU0) {
                        this.f18393zoijcleaow = eablkybsjgVar;
                        this.f18388ppxfxbqfkf = iU0;
                        this.f18391wflxmlrfwp = iU0;
                    }
                } else {
                    int iV0 = lqeggnwhkg.this.v0(eablkybsjgVar, this.f18390vdvldrhtss);
                    int iU1 = lqeggnwhkg.this.u0(eablkybsjgVar, this.f18390vdvldrhtss);
                    int i16 = lqeggnwhkg.this.C;
                    if (eablkybsjgVar.crxdokpmqz() == 8) {
                        i16 = 0;
                    }
                    this.f18391wflxmlrfwp += iU1 + i16;
                    if (this.f18393zoijcleaow == null || this.f18388ppxfxbqfkf < iV0) {
                        this.f18393zoijcleaow = eablkybsjgVar;
                        this.f18388ppxfxbqfkf = iV0;
                        this.f18378draadjrbmk = iV0;
                    }
                }
            }
        }

        public void btonecajqb(int i13, wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2, wkgbmnqykc wkgbmnqykcVar3, wkgbmnqykc wkgbmnqykcVar4, int i14, int i15, int i16, int i17, int i18) {
            this.f18383iobyxmoadg = i13;
            this.f18392wkgbmnqykc = wkgbmnqykcVar;
            this.f18380eablkybsjg = wkgbmnqykcVar2;
            this.f18382gxszxtbevo = wkgbmnqykcVar3;
            this.f18384lqeggnwhkg = wkgbmnqykcVar4;
            this.f18385nufgyqmvbu = i14;
            this.f18379dxjokdxxww = i15;
            this.f18377btonecajqb = i16;
            this.f18381gtknphoqwx = i17;
            this.f18390vdvldrhtss = i18;
        }

        public void dxjokdxxww(int i13) {
            this.f18376agtfadlqog = i13;
        }

        public int eablkybsjg() {
            return this.f18383iobyxmoadg == 1 ? this.f18391wflxmlrfwp - lqeggnwhkg.this.C : this.f18391wflxmlrfwp;
        }

        public int gxszxtbevo() {
            return this.f18383iobyxmoadg == 0 ? this.f18378draadjrbmk - lqeggnwhkg.this.B : this.f18378draadjrbmk;
        }

        public void lqeggnwhkg(int i13) {
            int i14 = this.f18389rgvfuqvkyq;
            if (i14 == 0) {
                return;
            }
            int i15 = this.f18386ojitshcjhn;
            int i16 = i13 / i14;
            for (int i17 = 0; i17 < i15 && this.f18376agtfadlqog + i17 < lqeggnwhkg.this.N; i17++) {
                eablkybsjg eablkybsjgVar = lqeggnwhkg.this.M[this.f18376agtfadlqog + i17];
                if (this.f18383iobyxmoadg == 0) {
                    if (eablkybsjgVar != null && eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && eablkybsjgVar.f18264iwizpuwonk == 0) {
                        lqeggnwhkg.this.N(eablkybsjgVar, eablkybsjg.zoijcleaow.FIXED, i16, eablkybsjgVar.ulzqkzuiru(), eablkybsjgVar.lereixgezr());
                    }
                } else if (eablkybsjgVar != null && eablkybsjgVar.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && eablkybsjgVar.f18238cqumvgiudr == 0) {
                    lqeggnwhkg.this.N(eablkybsjgVar, eablkybsjgVar.istkbnxepw(), eablkybsjgVar.jlmebxxoox(), eablkybsjg.zoijcleaow.FIXED, i16);
                }
            }
            nufgyqmvbu();
        }

        public void ppxfxbqfkf() {
            this.f18388ppxfxbqfkf = 0;
            this.f18393zoijcleaow = null;
            this.f18378draadjrbmk = 0;
            this.f18391wflxmlrfwp = 0;
            this.f18376agtfadlqog = 0;
            this.f18386ojitshcjhn = 0;
            this.f18389rgvfuqvkyq = 0;
        }

        public void wkgbmnqykc(boolean z13, int i13, boolean z14) {
            eablkybsjg eablkybsjgVar;
            char c13;
            float f13;
            float f14;
            int i14 = this.f18386ojitshcjhn;
            for (int i15 = 0; i15 < i14 && this.f18376agtfadlqog + i15 < lqeggnwhkg.this.N; i15++) {
                eablkybsjg eablkybsjgVar2 = lqeggnwhkg.this.M[this.f18376agtfadlqog + i15];
                if (eablkybsjgVar2 != null) {
                    eablkybsjgVar2.roivzttewh();
                }
            }
            if (i14 == 0 || this.f18393zoijcleaow == null) {
                return;
            }
            boolean z15 = z14 && i13 == 0;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < i14; i18++) {
                int i19 = z13 ? (i14 - 1) - i18 : i18;
                if (this.f18376agtfadlqog + i19 >= lqeggnwhkg.this.N) {
                    break;
                }
                eablkybsjg eablkybsjgVar3 = lqeggnwhkg.this.M[this.f18376agtfadlqog + i19];
                if (eablkybsjgVar3 != null && eablkybsjgVar3.crxdokpmqz() == 0) {
                    if (i16 == -1) {
                        i16 = i18;
                    }
                    i17 = i18;
                }
            }
            eablkybsjg eablkybsjgVar4 = null;
            if (this.f18383iobyxmoadg != 0) {
                eablkybsjg eablkybsjgVar5 = this.f18393zoijcleaow;
                eablkybsjgVar5.yzdjzghtvl(lqeggnwhkg.this.f18365p);
                int i23 = this.f18385nufgyqmvbu;
                if (i13 > 0) {
                    i23 += lqeggnwhkg.this.B;
                }
                if (z13) {
                    eablkybsjgVar5.f18305tzroggbefp.iobyxmoadg(this.f18382gxszxtbevo, i23);
                    if (z14) {
                        eablkybsjgVar5.f18303stevsuqkhv.iobyxmoadg(this.f18392wkgbmnqykc, this.f18377btonecajqb);
                    }
                    if (i13 > 0) {
                        this.f18382gxszxtbevo.f18445wkgbmnqykc.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar5.f18305tzroggbefp, 0);
                    }
                } else {
                    eablkybsjgVar5.f18303stevsuqkhv.iobyxmoadg(this.f18392wkgbmnqykc, i23);
                    if (z14) {
                        eablkybsjgVar5.f18305tzroggbefp.iobyxmoadg(this.f18382gxszxtbevo, this.f18377btonecajqb);
                    }
                    if (i13 > 0) {
                        this.f18392wkgbmnqykc.f18445wkgbmnqykc.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar5.f18303stevsuqkhv, 0);
                    }
                }
                for (int i24 = 0; i24 < i14 && this.f18376agtfadlqog + i24 < lqeggnwhkg.this.N; i24++) {
                    eablkybsjg eablkybsjgVar6 = lqeggnwhkg.this.M[this.f18376agtfadlqog + i24];
                    if (eablkybsjgVar6 != null) {
                        if (i24 == 0) {
                            eablkybsjgVar6.draadjrbmk(eablkybsjgVar6.f18275kegysxyocb, this.f18380eablkybsjg, this.f18379dxjokdxxww);
                            int i25 = lqeggnwhkg.this.f18366q;
                            float f15 = lqeggnwhkg.this.f18372w;
                            if (this.f18376agtfadlqog == 0 && lqeggnwhkg.this.f18368s != -1) {
                                i25 = lqeggnwhkg.this.f18368s;
                                f15 = lqeggnwhkg.this.f18374y;
                            } else if (z14 && lqeggnwhkg.this.f18370u != -1) {
                                i25 = lqeggnwhkg.this.f18370u;
                                f15 = lqeggnwhkg.this.A;
                            }
                            eablkybsjgVar6.o(i25);
                            eablkybsjgVar6.n(f15);
                        }
                        if (i24 == i14 - 1) {
                            eablkybsjgVar6.draadjrbmk(eablkybsjgVar6.f18281mbcevpiqjq, this.f18384lqeggnwhkg, this.f18381gtknphoqwx);
                        }
                        if (eablkybsjgVar4 != null) {
                            eablkybsjgVar6.f18275kegysxyocb.iobyxmoadg(eablkybsjgVar4.f18281mbcevpiqjq, lqeggnwhkg.this.C);
                            if (i24 == i16) {
                                eablkybsjgVar6.f18275kegysxyocb.yggfygwlhe(this.f18379dxjokdxxww);
                            }
                            eablkybsjgVar4.f18281mbcevpiqjq.iobyxmoadg(eablkybsjgVar6.f18275kegysxyocb, 0);
                            if (i24 == i17 + 1) {
                                eablkybsjgVar4.f18281mbcevpiqjq.yggfygwlhe(this.f18381gtknphoqwx);
                            }
                        }
                        if (eablkybsjgVar6 != eablkybsjgVar5) {
                            if (z13) {
                                int i26 = lqeggnwhkg.this.D;
                                if (i26 == 0) {
                                    eablkybsjgVar6.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar5.f18305tzroggbefp, 0);
                                } else if (i26 == 1) {
                                    eablkybsjgVar6.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar5.f18303stevsuqkhv, 0);
                                } else if (i26 == 2) {
                                    eablkybsjgVar6.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar5.f18303stevsuqkhv, 0);
                                    eablkybsjgVar6.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar5.f18305tzroggbefp, 0);
                                }
                            } else {
                                int i27 = lqeggnwhkg.this.D;
                                if (i27 == 0) {
                                    eablkybsjgVar6.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar5.f18303stevsuqkhv, 0);
                                } else if (i27 == 1) {
                                    eablkybsjgVar6.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar5.f18305tzroggbefp, 0);
                                } else if (i27 == 2) {
                                    if (z15) {
                                        eablkybsjgVar6.f18303stevsuqkhv.iobyxmoadg(this.f18392wkgbmnqykc, this.f18385nufgyqmvbu);
                                        eablkybsjgVar6.f18305tzroggbefp.iobyxmoadg(this.f18382gxszxtbevo, this.f18377btonecajqb);
                                    } else {
                                        eablkybsjgVar6.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar5.f18303stevsuqkhv, 0);
                                        eablkybsjgVar6.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar5.f18305tzroggbefp, 0);
                                    }
                                }
                            }
                        }
                        eablkybsjgVar4 = eablkybsjgVar6;
                    }
                }
                return;
            }
            eablkybsjg eablkybsjgVar7 = this.f18393zoijcleaow;
            eablkybsjgVar7.o(lqeggnwhkg.this.f18366q);
            int i28 = this.f18379dxjokdxxww;
            if (i13 > 0) {
                i28 += lqeggnwhkg.this.C;
            }
            eablkybsjgVar7.f18275kegysxyocb.iobyxmoadg(this.f18380eablkybsjg, i28);
            if (z14) {
                eablkybsjgVar7.f18281mbcevpiqjq.iobyxmoadg(this.f18384lqeggnwhkg, this.f18381gtknphoqwx);
            }
            if (i13 > 0) {
                this.f18380eablkybsjg.f18445wkgbmnqykc.f18281mbcevpiqjq.iobyxmoadg(eablkybsjgVar7.f18275kegysxyocb, 0);
            }
            char c14 = 3;
            if (lqeggnwhkg.this.E != 3 || eablkybsjgVar7.jhduphickx()) {
                eablkybsjgVar = eablkybsjgVar7;
                break;
            }
            int i29 = 0;
            while (true) {
                if (i29 < i14) {
                    int i33 = z13 ? (i14 - 1) - i29 : i29;
                    if (this.f18376agtfadlqog + i33 < lqeggnwhkg.this.N) {
                        eablkybsjgVar = lqeggnwhkg.this.M[this.f18376agtfadlqog + i33];
                        if (eablkybsjgVar.jhduphickx()) {
                            break;
                        } else {
                            i29++;
                        }
                    }
                }
                eablkybsjgVar = eablkybsjgVar7;
                break;
            }
            int i34 = 0;
            while (i34 < i14) {
                int i35 = z13 ? (i14 - 1) - i34 : i34;
                if (this.f18376agtfadlqog + i35 >= lqeggnwhkg.this.N) {
                    return;
                }
                eablkybsjg eablkybsjgVar8 = lqeggnwhkg.this.M[this.f18376agtfadlqog + i35];
                if (eablkybsjgVar8 == null) {
                    eablkybsjgVar8 = eablkybsjgVar4;
                    c13 = c14;
                } else {
                    if (i34 == 0) {
                        eablkybsjgVar8.draadjrbmk(eablkybsjgVar8.f18303stevsuqkhv, this.f18392wkgbmnqykc, this.f18385nufgyqmvbu);
                    }
                    if (i35 == 0) {
                        int i36 = lqeggnwhkg.this.f18365p;
                        float f16 = lqeggnwhkg.this.f18371v;
                        if (z13) {
                            f16 = 1.0f - f16;
                        }
                        if (this.f18376agtfadlqog == 0 && lqeggnwhkg.this.f18367r != -1) {
                            i36 = lqeggnwhkg.this.f18367r;
                            if (z13) {
                                f14 = lqeggnwhkg.this.f18373x;
                                f13 = 1.0f - f14;
                            } else {
                                f13 = lqeggnwhkg.this.f18373x;
                            }
                            f16 = f13;
                        } else if (z14 && lqeggnwhkg.this.f18369t != -1) {
                            i36 = lqeggnwhkg.this.f18369t;
                            if (z13) {
                                f14 = lqeggnwhkg.this.f18375z;
                                f13 = 1.0f - f14;
                            } else {
                                f13 = lqeggnwhkg.this.f18375z;
                            }
                            f16 = f13;
                        }
                        eablkybsjgVar8.yzdjzghtvl(i36);
                        eablkybsjgVar8.rhgxfdycjh(f16);
                    }
                    if (i34 == i14 - 1) {
                        eablkybsjgVar8.draadjrbmk(eablkybsjgVar8.f18305tzroggbefp, this.f18382gxszxtbevo, this.f18377btonecajqb);
                    }
                    if (eablkybsjgVar4 != null) {
                        eablkybsjgVar8.f18303stevsuqkhv.iobyxmoadg(eablkybsjgVar4.f18305tzroggbefp, lqeggnwhkg.this.B);
                        if (i34 == i16) {
                            eablkybsjgVar8.f18303stevsuqkhv.yggfygwlhe(this.f18385nufgyqmvbu);
                        }
                        eablkybsjgVar4.f18305tzroggbefp.iobyxmoadg(eablkybsjgVar8.f18303stevsuqkhv, 0);
                        if (i34 == i17 + 1) {
                            eablkybsjgVar4.f18305tzroggbefp.yggfygwlhe(this.f18377btonecajqb);
                        }
                    }
                    if (eablkybsjgVar8 != eablkybsjgVar7) {
                        c13 = 3;
                        if (lqeggnwhkg.this.E == 3 && eablkybsjgVar.jhduphickx() && eablkybsjgVar8 != eablkybsjgVar && eablkybsjgVar8.jhduphickx()) {
                            eablkybsjgVar8.f18284ntlheqmsrt.iobyxmoadg(eablkybsjgVar.f18284ntlheqmsrt, 0);
                        } else {
                            int i37 = lqeggnwhkg.this.E;
                            if (i37 == 0) {
                                eablkybsjgVar8.f18275kegysxyocb.iobyxmoadg(eablkybsjgVar7.f18275kegysxyocb, 0);
                            } else if (i37 == 1) {
                                eablkybsjgVar8.f18281mbcevpiqjq.iobyxmoadg(eablkybsjgVar7.f18281mbcevpiqjq, 0);
                            } else if (z15) {
                                eablkybsjgVar8.f18275kegysxyocb.iobyxmoadg(this.f18380eablkybsjg, this.f18379dxjokdxxww);
                                eablkybsjgVar8.f18281mbcevpiqjq.iobyxmoadg(this.f18384lqeggnwhkg, this.f18381gtknphoqwx);
                            } else {
                                eablkybsjgVar8.f18275kegysxyocb.iobyxmoadg(eablkybsjgVar7.f18275kegysxyocb, 0);
                                eablkybsjgVar8.f18281mbcevpiqjq.iobyxmoadg(eablkybsjgVar7.f18281mbcevpiqjq, 0);
                            }
                        }
                    } else {
                        c13 = 3;
                    }
                }
                i34++;
                c14 = c13;
                eablkybsjgVar4 = eablkybsjgVar8;
            }
        }

        public void zoijcleaow(eablkybsjg eablkybsjgVar) {
            if (this.f18383iobyxmoadg == 0) {
                int iV0 = lqeggnwhkg.this.v0(eablkybsjgVar, this.f18390vdvldrhtss);
                if (eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    this.f18389rgvfuqvkyq++;
                    iV0 = 0;
                }
                this.f18378draadjrbmk += iV0 + (eablkybsjgVar.crxdokpmqz() != 8 ? lqeggnwhkg.this.B : 0);
                int iU0 = lqeggnwhkg.this.u0(eablkybsjgVar, this.f18390vdvldrhtss);
                if (this.f18393zoijcleaow == null || this.f18388ppxfxbqfkf < iU0) {
                    this.f18393zoijcleaow = eablkybsjgVar;
                    this.f18388ppxfxbqfkf = iU0;
                    this.f18391wflxmlrfwp = iU0;
                }
            } else {
                int iV1 = lqeggnwhkg.this.v0(eablkybsjgVar, this.f18390vdvldrhtss);
                int iU1 = lqeggnwhkg.this.u0(eablkybsjgVar, this.f18390vdvldrhtss);
                if (eablkybsjgVar.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    this.f18389rgvfuqvkyq++;
                    iU1 = 0;
                }
                this.f18391wflxmlrfwp += iU1 + (eablkybsjgVar.crxdokpmqz() != 8 ? lqeggnwhkg.this.C : 0);
                if (this.f18393zoijcleaow == null || this.f18388ppxfxbqfkf < iV1) {
                    this.f18393zoijcleaow = eablkybsjgVar;
                    this.f18388ppxfxbqfkf = iV1;
                    this.f18378draadjrbmk = iV1;
                }
            }
            this.f18386ojitshcjhn++;
        }
    }

    private void t0(boolean z13) {
        eablkybsjg eablkybsjgVar;
        float f13;
        int i13;
        if (this.L == null || this.K == null || this.J == null) {
            return;
        }
        for (int i14 = 0; i14 < this.N; i14++) {
            this.M[i14].roivzttewh();
        }
        int[] iArr = this.L;
        int i15 = iArr[0];
        int i16 = iArr[1];
        float f14 = this.f18371v;
        eablkybsjg eablkybsjgVar2 = null;
        int i17 = 0;
        while (i17 < i15) {
            if (z13) {
                i13 = (i15 - i17) - 1;
                f13 = 1.0f - this.f18371v;
            } else {
                f13 = f14;
                i13 = i17;
            }
            eablkybsjg eablkybsjgVar3 = this.K[i13];
            if (eablkybsjgVar3 != null && eablkybsjgVar3.crxdokpmqz() != 8) {
                if (i17 == 0) {
                    eablkybsjgVar3.draadjrbmk(eablkybsjgVar3.f18303stevsuqkhv, this.f18303stevsuqkhv, J());
                    eablkybsjgVar3.yzdjzghtvl(this.f18365p);
                    eablkybsjgVar3.rhgxfdycjh(f13);
                }
                if (i17 == i15 - 1) {
                    eablkybsjgVar3.draadjrbmk(eablkybsjgVar3.f18305tzroggbefp, this.f18305tzroggbefp, K());
                }
                if (i17 > 0 && eablkybsjgVar2 != null) {
                    eablkybsjgVar3.draadjrbmk(eablkybsjgVar3.f18303stevsuqkhv, eablkybsjgVar2.f18305tzroggbefp, this.B);
                    eablkybsjgVar2.draadjrbmk(eablkybsjgVar2.f18305tzroggbefp, eablkybsjgVar3.f18303stevsuqkhv, 0);
                }
                eablkybsjgVar2 = eablkybsjgVar3;
            }
            i17++;
            f14 = f13;
        }
        for (int i18 = 0; i18 < i16; i18++) {
            eablkybsjg eablkybsjgVar4 = this.J[i18];
            if (eablkybsjgVar4 != null && eablkybsjgVar4.crxdokpmqz() != 8) {
                if (i18 == 0) {
                    eablkybsjgVar4.draadjrbmk(eablkybsjgVar4.f18275kegysxyocb, this.f18275kegysxyocb, L());
                    eablkybsjgVar4.o(this.f18366q);
                    eablkybsjgVar4.n(this.f18372w);
                }
                if (i18 == i16 - 1) {
                    eablkybsjgVar4.draadjrbmk(eablkybsjgVar4.f18281mbcevpiqjq, this.f18281mbcevpiqjq, I());
                }
                if (i18 > 0 && eablkybsjgVar2 != null) {
                    eablkybsjgVar4.draadjrbmk(eablkybsjgVar4.f18275kegysxyocb, eablkybsjgVar2.f18281mbcevpiqjq, this.C);
                    eablkybsjgVar2.draadjrbmk(eablkybsjgVar2.f18281mbcevpiqjq, eablkybsjgVar4.f18275kegysxyocb, 0);
                }
                eablkybsjgVar2 = eablkybsjgVar4;
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            for (int i23 = 0; i23 < i16; i23++) {
                int i24 = (i23 * i15) + i19;
                if (this.H == 1) {
                    i24 = (i19 * i16) + i23;
                }
                eablkybsjg[] eablkybsjgVarArr = this.M;
                if (i24 < eablkybsjgVarArr.length && (eablkybsjgVar = eablkybsjgVarArr[i24]) != null && eablkybsjgVar.crxdokpmqz() != 8) {
                    eablkybsjg eablkybsjgVar5 = this.K[i19];
                    eablkybsjg eablkybsjgVar6 = this.J[i23];
                    if (eablkybsjgVar != eablkybsjgVar5) {
                        eablkybsjgVar.draadjrbmk(eablkybsjgVar.f18303stevsuqkhv, eablkybsjgVar5.f18303stevsuqkhv, 0);
                        eablkybsjgVar.draadjrbmk(eablkybsjgVar.f18305tzroggbefp, eablkybsjgVar5.f18305tzroggbefp, 0);
                    }
                    if (eablkybsjgVar != eablkybsjgVar6) {
                        eablkybsjgVar.draadjrbmk(eablkybsjgVar.f18275kegysxyocb, eablkybsjgVar6.f18275kegysxyocb, 0);
                        eablkybsjgVar.draadjrbmk(eablkybsjgVar.f18281mbcevpiqjq, eablkybsjgVar6.f18281mbcevpiqjq, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0(eablkybsjg eablkybsjgVar, int i13) {
        if (eablkybsjgVar == null) {
            return 0;
        }
        if (eablkybsjgVar.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            int i14 = eablkybsjgVar.f18238cqumvgiudr;
            if (i14 == 0) {
                return 0;
            }
            if (i14 == 2) {
                int i15 = (int) (eablkybsjgVar.f18318yadqdtsiqt * i13);
                if (i15 != eablkybsjgVar.lereixgezr()) {
                    eablkybsjgVar.i(true);
                    N(eablkybsjgVar, eablkybsjgVar.istkbnxepw(), eablkybsjgVar.jlmebxxoox(), eablkybsjg.zoijcleaow.FIXED, i15);
                }
                return i15;
            }
            if (i14 == 1) {
                return eablkybsjgVar.lereixgezr();
            }
            if (i14 == 3) {
                return (int) ((eablkybsjgVar.jlmebxxoox() * eablkybsjgVar.f18317xrmfcynszj) + 0.5f);
            }
        }
        return eablkybsjgVar.lereixgezr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v0(eablkybsjg eablkybsjgVar, int i13) {
        if (eablkybsjgVar == null) {
            return 0;
        }
        if (eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            int i14 = eablkybsjgVar.f18264iwizpuwonk;
            if (i14 == 0) {
                return 0;
            }
            if (i14 == 2) {
                int i15 = (int) (eablkybsjgVar.f18328zynmafqrjb * i13);
                if (i15 != eablkybsjgVar.jlmebxxoox()) {
                    eablkybsjgVar.i(true);
                    N(eablkybsjgVar, eablkybsjg.zoijcleaow.FIXED, i15, eablkybsjgVar.ulzqkzuiru(), eablkybsjgVar.lereixgezr());
                }
                return i15;
            }
            if (i14 == 1) {
                return eablkybsjgVar.jlmebxxoox();
            }
            if (i14 == 3) {
                return (int) ((eablkybsjgVar.lereixgezr() * eablkybsjgVar.f18317xrmfcynszj) + 0.5f);
            }
        }
        return eablkybsjgVar.jlmebxxoox();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void w0(c1.eablkybsjg[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.lqeggnwhkg.w0(c1.eablkybsjg[], int, int, int, int[]):void");
    }

    private void x0(eablkybsjg[] eablkybsjgVarArr, int i13, int i14, int i15, int[] iArr) {
        int i16;
        int i17;
        int i18;
        wkgbmnqykc wkgbmnqykcVar;
        int iK;
        wkgbmnqykc wkgbmnqykcVar2;
        int I;
        int i19;
        if (i13 == 0) {
            return;
        }
        this.I.clear();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
        this.I.add(iobyxmoadgVar);
        if (i14 == 0) {
            i16 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i24 < i13) {
                eablkybsjg eablkybsjgVar = eablkybsjgVarArr[i24];
                int iV0 = v0(eablkybsjgVar, i15);
                if (eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i25 = i16;
                boolean z13 = (i23 == i15 || (this.B + i23) + iV0 > i15) && iobyxmoadgVar.f18393zoijcleaow != null;
                if (!z13 && i24 > 0 && (i19 = this.G) > 0 && i24 % i19 == 0) {
                    z13 = true;
                }
                if (z13) {
                    iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
                    iobyxmoadgVar.dxjokdxxww(i24);
                    this.I.add(iobyxmoadgVar);
                } else {
                    if (i24 > 0) {
                        i23 += this.B + iV0;
                    }
                    iobyxmoadgVar.zoijcleaow(eablkybsjgVar);
                    i24++;
                    i16 = i25;
                }
                i23 = iV0;
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar);
                i24++;
                i16 = i25;
            }
        } else {
            i16 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < i13) {
                eablkybsjg eablkybsjgVar2 = eablkybsjgVarArr[i27];
                int iU0 = u0(eablkybsjgVar2, i15);
                if (eablkybsjgVar2.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i28 = i16;
                boolean z14 = (i26 == i15 || (this.C + i26) + iU0 > i15) && iobyxmoadgVar.f18393zoijcleaow != null;
                if (!z14 && i27 > 0 && (i17 = this.G) > 0 && i27 % i17 == 0) {
                    z14 = true;
                }
                if (z14) {
                    iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
                    iobyxmoadgVar.dxjokdxxww(i27);
                    this.I.add(iobyxmoadgVar);
                } else {
                    if (i27 > 0) {
                        i26 += this.C + iU0;
                    }
                    iobyxmoadgVar.zoijcleaow(eablkybsjgVar2);
                    i27++;
                    i16 = i28;
                }
                i26 = iU0;
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar2);
                i27++;
                i16 = i28;
            }
        }
        int size = this.I.size();
        wkgbmnqykc wkgbmnqykcVar3 = this.f18303stevsuqkhv;
        wkgbmnqykc wkgbmnqykcVar4 = this.f18275kegysxyocb;
        wkgbmnqykc wkgbmnqykcVar5 = this.f18305tzroggbefp;
        wkgbmnqykc wkgbmnqykcVar6 = this.f18281mbcevpiqjq;
        int iJ = J();
        int iL = L();
        int iK2 = K();
        int I2 = I();
        eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = istkbnxepw();
        eablkybsjg.zoijcleaow zoijcleaowVar = eablkybsjg.zoijcleaow.WRAP_CONTENT;
        boolean z15 = zoijcleaowVarIstkbnxepw == zoijcleaowVar || ulzqkzuiru() == zoijcleaowVar;
        if (i16 > 0 && z15) {
            for (int i29 = 0; i29 < size; i29++) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.I.get(i29);
                if (i14 == 0) {
                    iobyxmoadgVar2.lqeggnwhkg(i15 - iobyxmoadgVar2.gxszxtbevo());
                } else {
                    iobyxmoadgVar2.lqeggnwhkg(i15 - iobyxmoadgVar2.eablkybsjg());
                }
            }
        }
        int i33 = iL;
        int i34 = iK2;
        int iEablkybsjg = 0;
        int iGxszxtbevo = 0;
        int i35 = 0;
        int i36 = iJ;
        wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar4;
        wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar3;
        int i37 = I2;
        while (i35 < size) {
            iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) this.I.get(i35);
            if (i14 == 0) {
                if (i35 < size - 1) {
                    wkgbmnqykcVar2 = ((iobyxmoadg) this.I.get(i35 + 1)).f18393zoijcleaow.f18275kegysxyocb;
                    I = 0;
                } else {
                    wkgbmnqykcVar2 = this.f18281mbcevpiqjq;
                    I = I();
                }
                wkgbmnqykc wkgbmnqykcVar9 = iobyxmoadgVar3.f18393zoijcleaow.f18281mbcevpiqjq;
                wkgbmnqykc wkgbmnqykcVar10 = wkgbmnqykcVar8;
                wkgbmnqykc wkgbmnqykcVar11 = wkgbmnqykcVar8;
                int i38 = iEablkybsjg;
                wkgbmnqykc wkgbmnqykcVar12 = wkgbmnqykcVar7;
                int i39 = iGxszxtbevo;
                wkgbmnqykc wkgbmnqykcVar13 = wkgbmnqykcVar5;
                wkgbmnqykc wkgbmnqykcVar14 = wkgbmnqykcVar5;
                i18 = i35;
                iobyxmoadgVar3.btonecajqb(i14, wkgbmnqykcVar10, wkgbmnqykcVar12, wkgbmnqykcVar13, wkgbmnqykcVar2, i36, i33, i34, I, i15);
                int iMax = Math.max(i39, iobyxmoadgVar3.gxszxtbevo());
                iEablkybsjg = i38 + iobyxmoadgVar3.eablkybsjg();
                if (i18 > 0) {
                    iEablkybsjg += this.C;
                }
                wkgbmnqykcVar8 = wkgbmnqykcVar11;
                iGxszxtbevo = iMax;
                i33 = 0;
                wkgbmnqykcVar7 = wkgbmnqykcVar9;
                wkgbmnqykcVar = wkgbmnqykcVar14;
                int i43 = I;
                wkgbmnqykcVar6 = wkgbmnqykcVar2;
                i37 = i43;
            } else {
                wkgbmnqykc wkgbmnqykcVar15 = wkgbmnqykcVar8;
                int i44 = iEablkybsjg;
                int i45 = iGxszxtbevo;
                i18 = i35;
                if (i18 < size - 1) {
                    wkgbmnqykcVar = ((iobyxmoadg) this.I.get(i18 + 1)).f18393zoijcleaow.f18303stevsuqkhv;
                    iK = 0;
                } else {
                    wkgbmnqykcVar = this.f18305tzroggbefp;
                    iK = K();
                }
                wkgbmnqykc wkgbmnqykcVar16 = iobyxmoadgVar3.f18393zoijcleaow.f18305tzroggbefp;
                iobyxmoadgVar3.btonecajqb(i14, wkgbmnqykcVar15, wkgbmnqykcVar7, wkgbmnqykcVar, wkgbmnqykcVar6, i36, i33, iK, i37, i15);
                iGxszxtbevo = i45 + iobyxmoadgVar3.gxszxtbevo();
                int iMax2 = Math.max(i44, iobyxmoadgVar3.eablkybsjg());
                if (i18 > 0) {
                    iGxszxtbevo += this.B;
                }
                iEablkybsjg = iMax2;
                i36 = 0;
                i34 = iK;
                wkgbmnqykcVar8 = wkgbmnqykcVar16;
            }
            i35 = i18 + 1;
            wkgbmnqykcVar5 = wkgbmnqykcVar;
        }
        iArr[0] = iGxszxtbevo;
        iArr[1] = iEablkybsjg;
    }

    private void y0(eablkybsjg[] eablkybsjgVarArr, int i13, int i14, int i15, int[] iArr) {
        int i16;
        int i17;
        int i18;
        wkgbmnqykc wkgbmnqykcVar;
        int iK;
        wkgbmnqykc wkgbmnqykcVar2;
        int I;
        int i19;
        if (i13 == 0) {
            return;
        }
        this.I.clear();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
        this.I.add(iobyxmoadgVar);
        if (i14 == 0) {
            int i23 = 0;
            i16 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i25 < i13) {
                i23++;
                eablkybsjg eablkybsjgVar = eablkybsjgVarArr[i25];
                int iV0 = v0(eablkybsjgVar, i15);
                if (eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i26 = i16;
                boolean z13 = (i24 == i15 || (this.B + i24) + iV0 > i15) && iobyxmoadgVar.f18393zoijcleaow != null;
                if (!z13 && i25 > 0 && (i19 = this.G) > 0 && i23 > i19) {
                    z13 = true;
                }
                if (z13) {
                    iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
                    iobyxmoadgVar.dxjokdxxww(i25);
                    this.I.add(iobyxmoadgVar);
                    i24 = iV0;
                    i23 = 1;
                } else {
                    i24 = i25 > 0 ? i24 + this.B + iV0 : iV0;
                }
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar);
                i25++;
                i16 = i26;
            }
        } else {
            int i27 = 0;
            i16 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < i13) {
                i27++;
                eablkybsjg eablkybsjgVar2 = eablkybsjgVarArr[i29];
                int iU0 = u0(eablkybsjgVar2, i15);
                if (eablkybsjgVar2.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i33 = i16;
                boolean z14 = (i28 == i15 || (this.C + i28) + iU0 > i15) && iobyxmoadgVar.f18393zoijcleaow != null;
                if (!z14 && i29 > 0 && (i17 = this.G) > 0 && i27 > i17) {
                    z14 = true;
                }
                if (z14) {
                    iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
                    iobyxmoadgVar.dxjokdxxww(i29);
                    this.I.add(iobyxmoadgVar);
                    i28 = iU0;
                    i27 = 1;
                } else {
                    i28 = i29 > 0 ? i28 + this.C + iU0 : iU0;
                }
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar2);
                i29++;
                i16 = i33;
            }
        }
        int size = this.I.size();
        wkgbmnqykc wkgbmnqykcVar3 = this.f18303stevsuqkhv;
        wkgbmnqykc wkgbmnqykcVar4 = this.f18275kegysxyocb;
        wkgbmnqykc wkgbmnqykcVar5 = this.f18305tzroggbefp;
        wkgbmnqykc wkgbmnqykcVar6 = this.f18281mbcevpiqjq;
        int iJ = J();
        int iL = L();
        int iK2 = K();
        int I2 = I();
        eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = istkbnxepw();
        eablkybsjg.zoijcleaow zoijcleaowVar = eablkybsjg.zoijcleaow.WRAP_CONTENT;
        boolean z15 = zoijcleaowVarIstkbnxepw == zoijcleaowVar || ulzqkzuiru() == zoijcleaowVar;
        if (i16 > 0 && z15) {
            for (int i34 = 0; i34 < size; i34++) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.I.get(i34);
                if (i14 == 0) {
                    iobyxmoadgVar2.lqeggnwhkg(i15 - iobyxmoadgVar2.gxszxtbevo());
                } else {
                    iobyxmoadgVar2.lqeggnwhkg(i15 - iobyxmoadgVar2.eablkybsjg());
                }
            }
        }
        int i35 = iL;
        int i36 = iK2;
        int iEablkybsjg = 0;
        int iGxszxtbevo = 0;
        int i37 = 0;
        int i38 = iJ;
        wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar4;
        wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar3;
        int i39 = I2;
        while (i37 < size) {
            iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) this.I.get(i37);
            if (i14 == 0) {
                if (i37 < size - 1) {
                    wkgbmnqykcVar2 = ((iobyxmoadg) this.I.get(i37 + 1)).f18393zoijcleaow.f18275kegysxyocb;
                    I = 0;
                } else {
                    wkgbmnqykcVar2 = this.f18281mbcevpiqjq;
                    I = I();
                }
                wkgbmnqykc wkgbmnqykcVar9 = iobyxmoadgVar3.f18393zoijcleaow.f18281mbcevpiqjq;
                wkgbmnqykc wkgbmnqykcVar10 = wkgbmnqykcVar8;
                wkgbmnqykc wkgbmnqykcVar11 = wkgbmnqykcVar8;
                int i43 = iEablkybsjg;
                wkgbmnqykc wkgbmnqykcVar12 = wkgbmnqykcVar7;
                int i44 = iGxszxtbevo;
                wkgbmnqykc wkgbmnqykcVar13 = wkgbmnqykcVar5;
                wkgbmnqykc wkgbmnqykcVar14 = wkgbmnqykcVar5;
                i18 = i37;
                iobyxmoadgVar3.btonecajqb(i14, wkgbmnqykcVar10, wkgbmnqykcVar12, wkgbmnqykcVar13, wkgbmnqykcVar2, i38, i35, i36, I, i15);
                int iMax = Math.max(i44, iobyxmoadgVar3.gxszxtbevo());
                iEablkybsjg = i43 + iobyxmoadgVar3.eablkybsjg();
                if (i18 > 0) {
                    iEablkybsjg += this.C;
                }
                wkgbmnqykcVar8 = wkgbmnqykcVar11;
                iGxszxtbevo = iMax;
                i35 = 0;
                wkgbmnqykcVar7 = wkgbmnqykcVar9;
                wkgbmnqykcVar = wkgbmnqykcVar14;
                int i45 = I;
                wkgbmnqykcVar6 = wkgbmnqykcVar2;
                i39 = i45;
            } else {
                wkgbmnqykc wkgbmnqykcVar15 = wkgbmnqykcVar8;
                int i46 = iEablkybsjg;
                int i47 = iGxszxtbevo;
                i18 = i37;
                if (i18 < size - 1) {
                    wkgbmnqykcVar = ((iobyxmoadg) this.I.get(i18 + 1)).f18393zoijcleaow.f18303stevsuqkhv;
                    iK = 0;
                } else {
                    wkgbmnqykcVar = this.f18305tzroggbefp;
                    iK = K();
                }
                wkgbmnqykc wkgbmnqykcVar16 = iobyxmoadgVar3.f18393zoijcleaow.f18305tzroggbefp;
                iobyxmoadgVar3.btonecajqb(i14, wkgbmnqykcVar15, wkgbmnqykcVar7, wkgbmnqykcVar, wkgbmnqykcVar6, i38, i35, iK, i39, i15);
                iGxszxtbevo = i47 + iobyxmoadgVar3.gxszxtbevo();
                int iMax2 = Math.max(i46, iobyxmoadgVar3.eablkybsjg());
                if (i18 > 0) {
                    iGxszxtbevo += this.B;
                }
                iEablkybsjg = iMax2;
                i38 = 0;
                i36 = iK;
                wkgbmnqykcVar8 = wkgbmnqykcVar16;
            }
            i37 = i18 + 1;
            wkgbmnqykcVar5 = wkgbmnqykcVar;
        }
        iArr[0] = iGxszxtbevo;
        iArr[1] = iEablkybsjg;
    }

    private void z0(eablkybsjg[] eablkybsjgVarArr, int i13, int i14, int i15, int[] iArr) {
        iobyxmoadg iobyxmoadgVar;
        if (i13 == 0) {
            return;
        }
        if (this.I.size() == 0) {
            iobyxmoadgVar = new iobyxmoadg(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, i15);
            this.I.add(iobyxmoadgVar);
        } else {
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.I.get(0);
            iobyxmoadgVar2.ppxfxbqfkf();
            iobyxmoadgVar = iobyxmoadgVar2;
            iobyxmoadgVar.btonecajqb(i14, this.f18303stevsuqkhv, this.f18275kegysxyocb, this.f18305tzroggbefp, this.f18281mbcevpiqjq, J(), L(), K(), I(), i15);
        }
        for (int i16 = 0; i16 < i13; i16++) {
            iobyxmoadgVar.zoijcleaow(eablkybsjgVarArr[i16]);
        }
        iArr[0] = iobyxmoadgVar.gxszxtbevo();
        iArr[1] = iobyxmoadgVar.eablkybsjg();
    }

    public void A0(float f13) {
        this.f18373x = f13;
    }

    public void B0(int i13) {
        this.f18367r = i13;
    }

    public void C0(float f13) {
        this.f18374y = f13;
    }

    public void D0(int i13) {
        this.f18368s = i13;
    }

    public void E0(int i13) {
        this.D = i13;
    }

    public void F0(float f13) {
        this.f18371v = f13;
    }

    public void G0(int i13) {
        this.B = i13;
    }

    public void H0(int i13) {
        this.f18365p = i13;
    }

    public void I0(float f13) {
        this.f18375z = f13;
    }

    public void J0(int i13) {
        this.f18369t = i13;
    }

    public void K0(float f13) {
        this.A = f13;
    }

    public void L0(int i13) {
        this.f18370u = i13;
    }

    @Override // c1.wflxmlrfwp
    public void M(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        boolean z13;
        if (this.f18229b > 0 && !O()) {
            R(0, 0);
            Q(false);
            return;
        }
        int iJ = J();
        int iK = K();
        int iL = L();
        int I = I();
        int[] iArr = new int[2];
        int i19 = (i14 - iJ) - iK;
        int i23 = this.H;
        if (i23 == 1) {
            i19 = (i16 - iL) - I;
        }
        int i24 = i19;
        if (i23 == 0) {
            if (this.f18365p == -1) {
                this.f18365p = 0;
            }
            if (this.f18366q == -1) {
                this.f18366q = 0;
            }
        } else {
            if (this.f18365p == -1) {
                this.f18365p = 0;
            }
            if (this.f18366q == -1) {
                this.f18366q = 0;
            }
        }
        eablkybsjg[] eablkybsjgVarArr = this.f18228a;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i17 = this.f18229b;
            if (i25 >= i17) {
                break;
            }
            if (this.f18228a[i25].crxdokpmqz() == 8) {
                i26++;
            }
            i25++;
        }
        if (i26 > 0) {
            eablkybsjgVarArr = new eablkybsjg[i17 - i26];
            int i27 = 0;
            for (int i28 = 0; i28 < this.f18229b; i28++) {
                eablkybsjg eablkybsjgVar = this.f18228a[i28];
                if (eablkybsjgVar.crxdokpmqz() != 8) {
                    eablkybsjgVarArr[i27] = eablkybsjgVar;
                    i27++;
                }
            }
            i18 = i27;
        } else {
            i18 = i17;
        }
        this.M = eablkybsjgVarArr;
        this.N = i18;
        int i29 = this.F;
        if (i29 == 0) {
            z13 = true;
            z0(eablkybsjgVarArr, i18, this.H, i24, iArr);
        } else if (i29 == 1) {
            z13 = true;
            x0(eablkybsjgVarArr, i18, this.H, i24, iArr);
        } else if (i29 == 2) {
            z13 = true;
            w0(eablkybsjgVarArr, i18, this.H, i24, iArr);
        } else if (i29 != 3) {
            z13 = true;
        } else {
            z13 = true;
            y0(eablkybsjgVarArr, i18, this.H, i24, iArr);
        }
        int iMin = iArr[0] + iJ + iK;
        int iMin2 = iArr[z13 ? 1 : 0] + iL + I;
        if (i13 == 1073741824) {
            iMin = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i14);
        } else if (i13 != 0) {
            iMin = 0;
        }
        if (i15 == 1073741824) {
            iMin2 = i16;
        } else if (i15 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i16);
        } else if (i15 != 0) {
            iMin2 = 0;
        }
        R(iMin, iMin2);
        u(iMin);
        ezmngbhpjk(iMin2);
        if (this.f18229b <= 0) {
            z13 = false;
        }
        Q(z13);
    }

    public void M0(int i13) {
        this.G = i13;
    }

    public void N0(int i13) {
        this.H = i13;
    }

    public void O0(int i13) {
        this.E = i13;
    }

    public void P0(float f13) {
        this.f18372w = f13;
    }

    public void Q0(int i13) {
        this.C = i13;
    }

    public void R0(int i13) {
        this.f18366q = i13;
    }

    public void S0(int i13) {
        this.F = i13;
    }

    @Override // c1.btonecajqb, c1.eablkybsjg
    public void agtfadlqog(eablkybsjg eablkybsjgVar, HashMap map) {
        super.agtfadlqog(eablkybsjgVar, map);
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) eablkybsjgVar;
        this.f18365p = lqeggnwhkgVar.f18365p;
        this.f18366q = lqeggnwhkgVar.f18366q;
        this.f18367r = lqeggnwhkgVar.f18367r;
        this.f18368s = lqeggnwhkgVar.f18368s;
        this.f18369t = lqeggnwhkgVar.f18369t;
        this.f18370u = lqeggnwhkgVar.f18370u;
        this.f18371v = lqeggnwhkgVar.f18371v;
        this.f18372w = lqeggnwhkgVar.f18372w;
        this.f18373x = lqeggnwhkgVar.f18373x;
        this.f18374y = lqeggnwhkgVar.f18374y;
        this.f18375z = lqeggnwhkgVar.f18375z;
        this.A = lqeggnwhkgVar.A;
        this.B = lqeggnwhkgVar.B;
        this.C = lqeggnwhkgVar.C;
        this.D = lqeggnwhkgVar.D;
        this.E = lqeggnwhkgVar.E;
        this.F = lqeggnwhkgVar.F;
        this.G = lqeggnwhkgVar.G;
        this.H = lqeggnwhkgVar.H;
    }

    @Override // c1.eablkybsjg
    public void lqeggnwhkg(z0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        super.lqeggnwhkg(wkgbmnqykcVar, z13);
        boolean z14 = hkdspvbjdz() != null && ((gxszxtbevo) hkdspvbjdz()).a0();
        int i13 = this.F;
        if (i13 != 0) {
            if (i13 == 1) {
                int size = this.I.size();
                int i14 = 0;
                while (i14 < size) {
                    ((iobyxmoadg) this.I.get(i14)).wkgbmnqykc(z14, i14, i14 == size + (-1));
                    i14++;
                }
            } else if (i13 == 2) {
                t0(z14);
            } else if (i13 == 3) {
                int size2 = this.I.size();
                int i15 = 0;
                while (i15 < size2) {
                    ((iobyxmoadg) this.I.get(i15)).wkgbmnqykc(z14, i15, i15 == size2 + (-1));
                    i15++;
                }
            }
        } else if (this.I.size() > 0) {
            ((iobyxmoadg) this.I.get(0)).wkgbmnqykc(z14, 0, true);
        }
        Q(false);
    }
}
