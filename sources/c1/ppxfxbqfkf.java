package c1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    int f18403agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    protected int f18404btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f18405draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    protected int f18406dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected eablkybsjg f18407eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    protected float f18408gtknphoqwx = 0.0f;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected eablkybsjg f18409gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected eablkybsjg f18410iobyxmoadg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f18411jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    protected boolean f18412kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    protected eablkybsjg f18413lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected ArrayList f18414nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    boolean f18415ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    protected boolean f18416oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected eablkybsjg f18417ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f18418rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f18419vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    int f18420wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected eablkybsjg f18421wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected boolean f18422yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected boolean f18423zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected eablkybsjg f18424zoijcleaow;

    public ppxfxbqfkf(eablkybsjg eablkybsjgVar, int i13, boolean z13) {
        this.f18410iobyxmoadg = eablkybsjgVar;
        this.f18418rgvfuqvkyq = i13;
        this.f18419vdvldrhtss = z13;
    }

    private static boolean ppxfxbqfkf(eablkybsjg eablkybsjgVar, int i13) {
        int i14;
        return eablkybsjgVar.crxdokpmqz() != 8 && eablkybsjgVar.f18268jhduphickx[i13] == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && ((i14 = eablkybsjgVar.f18246esjtqupxsv[i13]) == 0 || i14 == 3);
    }

    private void zoijcleaow() {
        int i13 = this.f18418rgvfuqvkyq * 2;
        eablkybsjg eablkybsjgVar = this.f18410iobyxmoadg;
        this.f18415ojitshcjhn = true;
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        boolean z13 = false;
        while (!z13) {
            this.f18406dxjokdxxww++;
            eablkybsjg[] eablkybsjgVarArr = eablkybsjgVar.f18250fmlbqenlif;
            int i14 = this.f18418rgvfuqvkyq;
            eablkybsjg eablkybsjgVar3 = null;
            eablkybsjgVarArr[i14] = null;
            eablkybsjgVar.f18271jrbgnlbqoe[i14] = null;
            if (eablkybsjgVar.crxdokpmqz() != 8) {
                this.f18405draadjrbmk++;
                eablkybsjg.zoijcleaow zoijcleaowVarIwizpuwonk = eablkybsjgVar.iwizpuwonk(this.f18418rgvfuqvkyq);
                eablkybsjg.zoijcleaow zoijcleaowVar = eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarIwizpuwonk != zoijcleaowVar) {
                    this.f18420wflxmlrfwp += eablkybsjgVar.lmojexxdyd(this.f18418rgvfuqvkyq);
                }
                int iGxszxtbevo = this.f18420wflxmlrfwp + eablkybsjgVar.f18269jlmebxxoox[i13].gxszxtbevo();
                this.f18420wflxmlrfwp = iGxszxtbevo;
                int i15 = i13 + 1;
                this.f18420wflxmlrfwp = iGxszxtbevo + eablkybsjgVar.f18269jlmebxxoox[i15].gxszxtbevo();
                int iGxszxtbevo2 = this.f18403agtfadlqog + eablkybsjgVar.f18269jlmebxxoox[i13].gxszxtbevo();
                this.f18403agtfadlqog = iGxszxtbevo2;
                this.f18403agtfadlqog = iGxszxtbevo2 + eablkybsjgVar.f18269jlmebxxoox[i15].gxszxtbevo();
                if (this.f18424zoijcleaow == null) {
                    this.f18424zoijcleaow = eablkybsjgVar;
                }
                this.f18421wkgbmnqykc = eablkybsjgVar;
                eablkybsjg.zoijcleaow[] zoijcleaowVarArr = eablkybsjgVar.f18268jhduphickx;
                int i16 = this.f18418rgvfuqvkyq;
                if (zoijcleaowVarArr[i16] == zoijcleaowVar) {
                    int i17 = eablkybsjgVar.f18246esjtqupxsv[i16];
                    if (i17 == 0 || i17 == 3 || i17 == 2) {
                        this.f18404btonecajqb++;
                        float f13 = eablkybsjgVar.f18266ixidwrxhsl[i16];
                        if (f13 > 0.0f) {
                            this.f18408gtknphoqwx += f13;
                        }
                        if (ppxfxbqfkf(eablkybsjgVar, i16)) {
                            if (f13 < 0.0f) {
                                this.f18416oxmwwwfdhm = true;
                            } else {
                                this.f18412kcexrzcfyt = true;
                            }
                            if (this.f18414nufgyqmvbu == null) {
                                this.f18414nufgyqmvbu = new ArrayList();
                            }
                            this.f18414nufgyqmvbu.add(eablkybsjgVar);
                        }
                        if (this.f18409gxszxtbevo == null) {
                            this.f18409gxszxtbevo = eablkybsjgVar;
                        }
                        eablkybsjg eablkybsjgVar4 = this.f18413lqeggnwhkg;
                        if (eablkybsjgVar4 != null) {
                            eablkybsjgVar4.f18271jrbgnlbqoe[this.f18418rgvfuqvkyq] = eablkybsjgVar;
                        }
                        this.f18413lqeggnwhkg = eablkybsjgVar;
                    }
                    if (this.f18418rgvfuqvkyq == 0) {
                        if (eablkybsjgVar.f18264iwizpuwonk != 0 || eablkybsjgVar.f18276lereixgezr != 0 || eablkybsjgVar.f18293pmvmpeiblj != 0) {
                            this.f18415ojitshcjhn = false;
                        }
                    } else if (eablkybsjgVar.f18238cqumvgiudr != 0 || eablkybsjgVar.f18263istkbnxepw != 0 || eablkybsjgVar.f18236cdpycssgdh != 0) {
                        this.f18415ojitshcjhn = false;
                    }
                    if (eablkybsjgVar.f18317xrmfcynszj != 0.0f) {
                        this.f18415ojitshcjhn = false;
                        this.f18422yggfygwlhe = true;
                    }
                }
            }
            if (eablkybsjgVar2 != eablkybsjgVar) {
                eablkybsjgVar2.f18250fmlbqenlif[this.f18418rgvfuqvkyq] = eablkybsjgVar;
            }
            wkgbmnqykc wkgbmnqykcVar = eablkybsjgVar.f18269jlmebxxoox[i13 + 1].f18440gxszxtbevo;
            if (wkgbmnqykcVar != null) {
                eablkybsjg eablkybsjgVar5 = wkgbmnqykcVar.f18445wkgbmnqykc;
                wkgbmnqykc wkgbmnqykcVar2 = eablkybsjgVar5.f18269jlmebxxoox[i13].f18440gxszxtbevo;
                if (wkgbmnqykcVar2 != null && wkgbmnqykcVar2.f18445wkgbmnqykc == eablkybsjgVar) {
                    eablkybsjgVar3 = eablkybsjgVar5;
                }
            }
            if (eablkybsjgVar3 == null) {
                eablkybsjgVar3 = eablkybsjgVar;
                z13 = true;
            }
            eablkybsjgVar2 = eablkybsjgVar;
            eablkybsjgVar = eablkybsjgVar3;
        }
        eablkybsjg eablkybsjgVar6 = this.f18424zoijcleaow;
        if (eablkybsjgVar6 != null) {
            this.f18420wflxmlrfwp -= eablkybsjgVar6.f18269jlmebxxoox[i13].gxszxtbevo();
        }
        eablkybsjg eablkybsjgVar7 = this.f18421wkgbmnqykc;
        if (eablkybsjgVar7 != null) {
            this.f18420wflxmlrfwp -= eablkybsjgVar7.f18269jlmebxxoox[i13 + 1].gxszxtbevo();
        }
        this.f18417ppxfxbqfkf = eablkybsjgVar;
        if (this.f18418rgvfuqvkyq == 0 && this.f18419vdvldrhtss) {
            this.f18407eablkybsjg = eablkybsjgVar;
        } else {
            this.f18407eablkybsjg = this.f18410iobyxmoadg;
        }
        this.f18423zdlpuopuiu = this.f18412kcexrzcfyt && this.f18416oxmwwwfdhm;
    }

    public void iobyxmoadg() {
        if (!this.f18411jyumaefscl) {
            zoijcleaow();
        }
        this.f18411jyumaefscl = true;
    }
}
