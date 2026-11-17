package c1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends btonecajqb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18361c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18362d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18363e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f18364f = false;

    public boolean D() {
        int i13;
        int i14;
        int i15;
        boolean z13 = true;
        int i16 = 0;
        while (true) {
            i13 = this.f18229b;
            if (i16 >= i13) {
                break;
            }
            eablkybsjg eablkybsjgVar = this.f18228a[i16];
            if ((this.f18362d || eablkybsjgVar.nufgyqmvbu()) && ((((i14 = this.f18361c) == 0 || i14 == 1) && !eablkybsjgVar.bfopjjpdmp()) || (((i15 = this.f18361c) == 2 || i15 == 3) && !eablkybsjgVar.opjhrmiecq()))) {
                z13 = false;
            }
            i16++;
        }
        if (!z13 || i13 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z14 = false;
        for (int i17 = 0; i17 < this.f18229b; i17++) {
            eablkybsjg eablkybsjgVar2 = this.f18228a[i17];
            if (this.f18362d || eablkybsjgVar2.nufgyqmvbu()) {
                if (!z14) {
                    int i18 = this.f18361c;
                    if (i18 == 0) {
                        iMax = eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.LEFT).eablkybsjg();
                    } else if (i18 == 1) {
                        iMax = eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.RIGHT).eablkybsjg();
                    } else if (i18 == 2) {
                        iMax = eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.TOP).eablkybsjg();
                    } else if (i18 == 3) {
                        iMax = eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.BOTTOM).eablkybsjg();
                    }
                    z14 = true;
                }
                int i19 = this.f18361c;
                if (i19 == 0) {
                    iMax = Math.min(iMax, eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.LEFT).eablkybsjg());
                } else if (i19 == 1) {
                    iMax = Math.max(iMax, eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.RIGHT).eablkybsjg());
                } else if (i19 == 2) {
                    iMax = Math.min(iMax, eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.TOP).eablkybsjg());
                } else if (i19 == 3) {
                    iMax = Math.max(iMax, eablkybsjgVar2.vdvldrhtss(wkgbmnqykc.iobyxmoadg.BOTTOM).eablkybsjg());
                }
            }
        }
        int i23 = iMax + this.f18363e;
        int i24 = this.f18361c;
        if (i24 == 0 || i24 == 1) {
            ipoelvxyzq(i23, i23);
        } else {
            ixidwrxhsl(i23, i23);
        }
        this.f18364f = true;
        return true;
    }

    public boolean E() {
        return this.f18362d;
    }

    public int F() {
        return this.f18361c;
    }

    public int G() {
        return this.f18363e;
    }

    public int H() {
        int i13 = this.f18361c;
        if (i13 == 0 || i13 == 1) {
            return 0;
        }
        return (i13 == 2 || i13 == 3) ? 1 : -1;
    }

    protected void I() {
        for (int i13 = 0; i13 < this.f18229b; i13++) {
            eablkybsjg eablkybsjgVar = this.f18228a[i13];
            if (this.f18362d || eablkybsjgVar.nufgyqmvbu()) {
                int i14 = this.f18361c;
                if (i14 == 0 || i14 == 1) {
                    eablkybsjgVar.c(0, true);
                } else if (i14 == 2 || i14 == 3) {
                    eablkybsjgVar.c(1, true);
                }
            }
        }
    }

    public void J(boolean z13) {
        this.f18362d = z13;
    }

    public void K(int i13) {
        this.f18361c = i13;
    }

    public void L(int i13) {
        this.f18363e = i13;
    }

    @Override // c1.btonecajqb, c1.eablkybsjg
    public void agtfadlqog(eablkybsjg eablkybsjgVar, HashMap map) {
        super.agtfadlqog(eablkybsjgVar, map);
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar;
        this.f18361c = iobyxmoadgVar.f18361c;
        this.f18362d = iobyxmoadgVar.f18362d;
        this.f18363e = iobyxmoadgVar.f18363e;
    }

    @Override // c1.eablkybsjg
    public boolean bfopjjpdmp() {
        return this.f18364f;
    }

    @Override // c1.eablkybsjg
    public void lqeggnwhkg(z0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        wkgbmnqykc[] wkgbmnqykcVarArr;
        boolean z14;
        int i13;
        int i14;
        int i15;
        wkgbmnqykc[] wkgbmnqykcVarArr2 = this.f18269jlmebxxoox;
        wkgbmnqykcVarArr2[0] = this.f18303stevsuqkhv;
        wkgbmnqykcVarArr2[2] = this.f18275kegysxyocb;
        wkgbmnqykcVarArr2[1] = this.f18305tzroggbefp;
        wkgbmnqykcVarArr2[3] = this.f18281mbcevpiqjq;
        int i16 = 0;
        while (true) {
            wkgbmnqykcVarArr = this.f18269jlmebxxoox;
            if (i16 >= wkgbmnqykcVarArr.length) {
                break;
            }
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVarArr[i16];
            wkgbmnqykcVar2.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar2);
            i16++;
        }
        int i17 = this.f18361c;
        if (i17 < 0 || i17 >= 4) {
            return;
        }
        wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykcVarArr[i17];
        if (!this.f18364f) {
            D();
        }
        if (this.f18364f) {
            this.f18364f = false;
            int i18 = this.f18361c;
            if (i18 == 0 || i18 == 1) {
                wkgbmnqykcVar.gxszxtbevo(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18298rlfsiqarku);
                wkgbmnqykcVar.gxszxtbevo(this.f18305tzroggbefp.f18438dxjokdxxww, this.f18298rlfsiqarku);
                return;
            } else {
                if (i18 == 2 || i18 == 3) {
                    wkgbmnqykcVar.gxszxtbevo(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18240czzsidtyhn);
                    wkgbmnqykcVar.gxszxtbevo(this.f18281mbcevpiqjq.f18438dxjokdxxww, this.f18240czzsidtyhn);
                    return;
                }
                return;
            }
        }
        int i19 = 0;
        while (true) {
            if (i19 >= this.f18229b) {
                z14 = false;
                break;
            }
            eablkybsjg eablkybsjgVar = this.f18228a[i19];
            if ((this.f18362d || eablkybsjgVar.nufgyqmvbu()) && ((((i14 = this.f18361c) == 0 || i14 == 1) && eablkybsjgVar.istkbnxepw() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && eablkybsjgVar.f18303stevsuqkhv.f18440gxszxtbevo != null && eablkybsjgVar.f18305tzroggbefp.f18440gxszxtbevo != null) || (((i15 = this.f18361c) == 2 || i15 == 3) && eablkybsjgVar.ulzqkzuiru() == eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && eablkybsjgVar.f18275kegysxyocb.f18440gxszxtbevo != null && eablkybsjgVar.f18281mbcevpiqjq.f18440gxszxtbevo != null))) {
                z14 = true;
                break;
            }
            i19++;
        }
        boolean z15 = this.f18303stevsuqkhv.draadjrbmk() || this.f18305tzroggbefp.draadjrbmk();
        boolean z16 = this.f18275kegysxyocb.draadjrbmk() || this.f18281mbcevpiqjq.draadjrbmk();
        int i23 = !(!z14 && (((i13 = this.f18361c) == 0 && z15) || ((i13 == 2 && z16) || ((i13 == 1 && z15) || (i13 == 3 && z16))))) ? 4 : 5;
        for (int i24 = 0; i24 < this.f18229b; i24++) {
            eablkybsjg eablkybsjgVar2 = this.f18228a[i24];
            if (this.f18362d || eablkybsjgVar2.nufgyqmvbu()) {
                z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss = wkgbmnqykcVar.vdvldrhtss(eablkybsjgVar2.f18269jlmebxxoox[this.f18361c]);
                wkgbmnqykc[] wkgbmnqykcVarArr3 = eablkybsjgVar2.f18269jlmebxxoox;
                int i25 = this.f18361c;
                wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVarArr3[i25];
                wkgbmnqykcVar4.f18438dxjokdxxww = dxjokdxxwwVarVdvldrhtss;
                wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar4.f18440gxszxtbevo;
                int i26 = (wkgbmnqykcVar5 == null || wkgbmnqykcVar5.f18445wkgbmnqykc != this) ? 0 : wkgbmnqykcVar4.f18442lqeggnwhkg;
                if (i25 == 0 || i25 == 2) {
                    wkgbmnqykcVar.dxjokdxxww(wkgbmnqykcVar3.f18438dxjokdxxww, dxjokdxxwwVarVdvldrhtss, this.f18363e - i26, z14);
                } else {
                    wkgbmnqykcVar.lqeggnwhkg(wkgbmnqykcVar3.f18438dxjokdxxww, dxjokdxxwwVarVdvldrhtss, this.f18363e + i26, z14);
                }
                wkgbmnqykcVar.eablkybsjg(wkgbmnqykcVar3.f18438dxjokdxxww, dxjokdxxwwVarVdvldrhtss, this.f18363e + i26, i23);
            }
        }
        int i27 = this.f18361c;
        if (i27 == 0) {
            wkgbmnqykcVar.eablkybsjg(this.f18305tzroggbefp.f18438dxjokdxxww, this.f18303stevsuqkhv.f18438dxjokdxxww, 0, 8);
            wkgbmnqykcVar.eablkybsjg(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18259ikoacuggdj.f18305tzroggbefp.f18438dxjokdxxww, 0, 4);
            wkgbmnqykcVar.eablkybsjg(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18259ikoacuggdj.f18303stevsuqkhv.f18438dxjokdxxww, 0, 0);
            return;
        }
        if (i27 == 1) {
            wkgbmnqykcVar.eablkybsjg(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18305tzroggbefp.f18438dxjokdxxww, 0, 8);
            wkgbmnqykcVar.eablkybsjg(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18259ikoacuggdj.f18303stevsuqkhv.f18438dxjokdxxww, 0, 4);
            wkgbmnqykcVar.eablkybsjg(this.f18303stevsuqkhv.f18438dxjokdxxww, this.f18259ikoacuggdj.f18305tzroggbefp.f18438dxjokdxxww, 0, 0);
        } else if (i27 == 2) {
            wkgbmnqykcVar.eablkybsjg(this.f18281mbcevpiqjq.f18438dxjokdxxww, this.f18275kegysxyocb.f18438dxjokdxxww, 0, 8);
            wkgbmnqykcVar.eablkybsjg(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18259ikoacuggdj.f18281mbcevpiqjq.f18438dxjokdxxww, 0, 4);
            wkgbmnqykcVar.eablkybsjg(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18259ikoacuggdj.f18275kegysxyocb.f18438dxjokdxxww, 0, 0);
        } else if (i27 == 3) {
            wkgbmnqykcVar.eablkybsjg(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18281mbcevpiqjq.f18438dxjokdxxww, 0, 8);
            wkgbmnqykcVar.eablkybsjg(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18259ikoacuggdj.f18275kegysxyocb.f18438dxjokdxxww, 0, 4);
            wkgbmnqykcVar.eablkybsjg(this.f18275kegysxyocb.f18438dxjokdxxww, this.f18259ikoacuggdj.f18281mbcevpiqjq.f18438dxjokdxxww, 0, 0);
        }
    }

    @Override // c1.eablkybsjg
    public boolean nufgyqmvbu() {
        return true;
    }

    @Override // c1.eablkybsjg
    public boolean opjhrmiecq() {
        return this.f18364f;
    }

    @Override // c1.eablkybsjg
    public String toString() {
        String str = "[Barrier] " + jyumaefscl() + " {";
        for (int i13 = 0; i13 < this.f18229b; i13++) {
            eablkybsjg eablkybsjgVar = this.f18228a[i13];
            if (i13 > 0) {
                str = str + ", ";
            }
            str = str + eablkybsjgVar.jyumaefscl();
        }
        return str + "}";
    }
}
