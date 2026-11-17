package z0;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow implements wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public iobyxmoadg f127506eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    dxjokdxxww f127508iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    float f127511zoijcleaow = 0.0f;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    boolean f127509ppxfxbqfkf = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    ArrayList f127510wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    boolean f127507gxszxtbevo = false;

    public interface iobyxmoadg {
        void btonecajqb(dxjokdxxww dxjokdxxwwVar, float f13);

        void clear();

        void dxjokdxxww(dxjokdxxww dxjokdxxwwVar, float f13, boolean z13);

        float eablkybsjg(zoijcleaow zoijcleaowVar, boolean z13);

        void gtknphoqwx(float f13);

        int gxszxtbevo();

        boolean iobyxmoadg(dxjokdxxww dxjokdxxwwVar);

        float lqeggnwhkg(int i13);

        float nufgyqmvbu(dxjokdxxww dxjokdxxwwVar);

        void ppxfxbqfkf();

        float wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, boolean z13);

        dxjokdxxww zoijcleaow(int i13);
    }

    public zoijcleaow() {
    }

    private dxjokdxxww iwizpuwonk(boolean[] zArr, dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww.iobyxmoadg iobyxmoadgVar;
        int iGxszxtbevo = this.f127506eablkybsjg.gxszxtbevo();
        dxjokdxxww dxjokdxxwwVar2 = null;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
            float fLqeggnwhkg = this.f127506eablkybsjg.lqeggnwhkg(i13);
            if (fLqeggnwhkg < 0.0f) {
                dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f127506eablkybsjg.zoijcleaow(i13);
                if ((zArr == null || !zArr[dxjokdxxwwVarZoijcleaow.f127436jyumaefscl]) && dxjokdxxwwVarZoijcleaow != dxjokdxxwwVar && (((iobyxmoadgVar = dxjokdxxwwVarZoijcleaow.f127434istkbnxepw) == dxjokdxxww.iobyxmoadg.SLACK || iobyxmoadgVar == dxjokdxxww.iobyxmoadg.ERROR) && fLqeggnwhkg < f13)) {
                    f13 = fLqeggnwhkg;
                    dxjokdxxwwVar2 = dxjokdxxwwVarZoijcleaow;
                }
            }
        }
        return dxjokdxxwwVar2;
    }

    private boolean yggfygwlhe(dxjokdxxww dxjokdxxwwVar, wkgbmnqykc wkgbmnqykcVar) {
        return dxjokdxxwwVar.f127433iozdgvuglv <= 1;
    }

    public zoijcleaow agtfadlqog(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13) {
        boolean z13 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z13 = true;
            }
            this.f127511zoijcleaow = i13;
        }
        if (z13) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
        } else {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, 1.0f);
        }
        return this;
    }

    zoijcleaow btonecajqb(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, float f13) {
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, f13);
        return this;
    }

    public void cdpycssgdh(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar.f127497nufgyqmvbu.length == 0) {
            return;
        }
        boolean z13 = false;
        while (!z13) {
            int iGxszxtbevo = this.f127506eablkybsjg.gxszxtbevo();
            for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
                dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f127506eablkybsjg.zoijcleaow(i13);
                if (dxjokdxxwwVarZoijcleaow.f127435iwizpuwonk != -1 || dxjokdxxwwVarZoijcleaow.f127437lereixgezr || dxjokdxxwwVarZoijcleaow.f127438lmojexxdyd) {
                    this.f127510wkgbmnqykc.add(dxjokdxxwwVarZoijcleaow);
                }
            }
            int size = this.f127510wkgbmnqykc.size();
            if (size > 0) {
                for (int i14 = 0; i14 < size; i14++) {
                    dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) this.f127510wkgbmnqykc.get(i14);
                    if (dxjokdxxwwVar.f127437lereixgezr) {
                        pmvmpeiblj(wkgbmnqykcVar, dxjokdxxwwVar, true);
                    } else if (dxjokdxxwwVar.f127438lmojexxdyd) {
                        istkbnxepw(wkgbmnqykcVar, dxjokdxxwwVar, true);
                    } else {
                        zynmafqrjb(wkgbmnqykcVar, wkgbmnqykcVar.f127497nufgyqmvbu[dxjokdxxwwVar.f127435iwizpuwonk], true);
                    }
                }
                this.f127510wkgbmnqykc.clear();
            } else {
                z13 = true;
            }
        }
        if (wkgbmnqykc.f127486yggfygwlhe && this.f127508iobyxmoadg != null && this.f127506eablkybsjg.gxszxtbevo() == 0) {
            this.f127507gxszxtbevo = true;
            wkgbmnqykcVar.f127505zoijcleaow = true;
        }
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public void clear() {
        this.f127506eablkybsjg.clear();
        this.f127508iobyxmoadg = null;
        this.f127511zoijcleaow = 0.0f;
    }

    void cqumvgiudr(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww dxjokdxxwwVar2 = this.f127508iobyxmoadg;
        if (dxjokdxxwwVar2 != null) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127508iobyxmoadg.f127435iwizpuwonk = -1;
            this.f127508iobyxmoadg = null;
        }
        float fWkgbmnqykc = this.f127506eablkybsjg.wkgbmnqykc(dxjokdxxwwVar, true) * (-1.0f);
        this.f127508iobyxmoadg = dxjokdxxwwVar;
        if (fWkgbmnqykc == 1.0f) {
            return;
        }
        this.f127511zoijcleaow /= fWkgbmnqykc;
        this.f127506eablkybsjg.gtknphoqwx(fWkgbmnqykc);
    }

    public zoijcleaow draadjrbmk(float f13, float f14, float f15, dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4) {
        this.f127511zoijcleaow = 0.0f;
        if (f14 == 0.0f || f13 == f15) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, -1.0f);
        } else if (f13 == 0.0f) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
        } else if (f15 == 0.0f) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, -1.0f);
        } else {
            float f16 = (f13 / f14) / (f15 / f14);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, f16);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, -f16);
        }
        return this;
    }

    zoijcleaow dxjokdxxww(dxjokdxxww dxjokdxxwwVar, int i13) {
        this.f127508iobyxmoadg = dxjokdxxwwVar;
        float f13 = i13;
        dxjokdxxwwVar.f127432esjtqupxsv = f13;
        this.f127511zoijcleaow = f13;
        this.f127507gxszxtbevo = true;
        return this;
    }

    zoijcleaow eablkybsjg(dxjokdxxww dxjokdxxwwVar, int i13) {
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, i13);
        return this;
    }

    public void esjtqupxsv() {
        this.f127508iobyxmoadg = null;
        this.f127506eablkybsjg.clear();
        this.f127511zoijcleaow = 0.0f;
        this.f127507gxszxtbevo = false;
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public dxjokdxxww getKey() {
        return this.f127508iobyxmoadg;
    }

    public zoijcleaow gtknphoqwx(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4, float f13) {
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, 1.0f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, f13);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, -f13);
        return this;
    }

    boolean gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
        boolean z13;
        dxjokdxxww dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(wkgbmnqykcVar);
        if (dxjokdxxwwVarLqeggnwhkg == null) {
            z13 = true;
        } else {
            cqumvgiudr(dxjokdxxwwVarLqeggnwhkg);
            z13 = false;
        }
        if (this.f127506eablkybsjg.gxszxtbevo() == 0) {
            this.f127507gxszxtbevo = true;
        }
        return z13;
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public void iobyxmoadg(wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar instanceof zoijcleaow) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) iobyxmoadgVar;
            this.f127508iobyxmoadg = null;
            this.f127506eablkybsjg.clear();
            for (int i13 = 0; i13 < zoijcleaowVar.f127506eablkybsjg.gxszxtbevo(); i13++) {
                this.f127506eablkybsjg.dxjokdxxww(zoijcleaowVar.f127506eablkybsjg.zoijcleaow(i13), zoijcleaowVar.f127506eablkybsjg.lqeggnwhkg(i13), true);
            }
        }
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public boolean isEmpty() {
        return this.f127508iobyxmoadg == null && this.f127511zoijcleaow == 0.0f && this.f127506eablkybsjg.gxszxtbevo() == 0;
    }

    public void istkbnxepw(wkgbmnqykc wkgbmnqykcVar, dxjokdxxww dxjokdxxwwVar, boolean z13) {
        if (dxjokdxxwwVar == null || !dxjokdxxwwVar.f127438lmojexxdyd) {
            return;
        }
        float fNufgyqmvbu = this.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVar);
        this.f127511zoijcleaow += dxjokdxxwwVar.f127444ylkuphrtab * fNufgyqmvbu;
        this.f127506eablkybsjg.wkgbmnqykc(dxjokdxxwwVar, z13);
        if (z13) {
            dxjokdxxwwVar.wkgbmnqykc(this);
        }
        this.f127506eablkybsjg.dxjokdxxww(wkgbmnqykcVar.f127498ojitshcjhn.f127479wkgbmnqykc[dxjokdxxwwVar.f127441wwaezpbzkn], fNufgyqmvbu, z13);
        if (wkgbmnqykc.f127486yggfygwlhe && this.f127506eablkybsjg.gxszxtbevo() == 0) {
            this.f127507gxszxtbevo = true;
            wkgbmnqykcVar.f127505zoijcleaow = true;
        }
    }

    public dxjokdxxww jyumaefscl(dxjokdxxww dxjokdxxwwVar) {
        return iwizpuwonk(null, dxjokdxxwwVar);
    }

    boolean kcexrzcfyt() {
        dxjokdxxww dxjokdxxwwVar = this.f127508iobyxmoadg;
        return dxjokdxxwwVar != null && (dxjokdxxwwVar.f127434istkbnxepw == dxjokdxxww.iobyxmoadg.UNRESTRICTED || this.f127511zoijcleaow >= 0.0f);
    }

    String lereixgezr() {
        boolean z13;
        String str = (this.f127508iobyxmoadg == null ? "" + CommonUrlParts.Values.FALSE_INTEGER : "" + this.f127508iobyxmoadg) + " = ";
        if (this.f127511zoijcleaow != 0.0f) {
            str = str + this.f127511zoijcleaow;
            z13 = true;
        } else {
            z13 = false;
        }
        int iGxszxtbevo = this.f127506eablkybsjg.gxszxtbevo();
        for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f127506eablkybsjg.zoijcleaow(i13);
            if (dxjokdxxwwVarZoijcleaow != null) {
                float fLqeggnwhkg = this.f127506eablkybsjg.lqeggnwhkg(i13);
                if (fLqeggnwhkg != 0.0f) {
                    String string = dxjokdxxwwVarZoijcleaow.toString();
                    if (z13) {
                        if (fLqeggnwhkg > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fLqeggnwhkg *= -1.0f;
                        }
                    } else if (fLqeggnwhkg < 0.0f) {
                        str = str + "- ";
                        fLqeggnwhkg *= -1.0f;
                    }
                    str = fLqeggnwhkg == 1.0f ? str + string : str + fLqeggnwhkg + " " + string;
                    z13 = true;
                }
            }
        }
        if (z13) {
            return str;
        }
        return str + "0.0";
    }

    dxjokdxxww lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar) {
        int iGxszxtbevo = this.f127506eablkybsjg.gxszxtbevo();
        dxjokdxxww dxjokdxxwwVar = null;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z13 = false;
        boolean z14 = false;
        dxjokdxxww dxjokdxxwwVar2 = null;
        for (int i13 = 0; i13 < iGxszxtbevo; i13++) {
            float fLqeggnwhkg = this.f127506eablkybsjg.lqeggnwhkg(i13);
            dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f127506eablkybsjg.zoijcleaow(i13);
            if (dxjokdxxwwVarZoijcleaow.f127434istkbnxepw == dxjokdxxww.iobyxmoadg.UNRESTRICTED) {
                if (dxjokdxxwwVar == null || f13 > fLqeggnwhkg) {
                    boolean zYggfygwlhe = yggfygwlhe(dxjokdxxwwVarZoijcleaow, wkgbmnqykcVar);
                    z13 = zYggfygwlhe;
                    f13 = fLqeggnwhkg;
                    dxjokdxxwwVar = dxjokdxxwwVarZoijcleaow;
                } else if (!z13 && yggfygwlhe(dxjokdxxwwVarZoijcleaow, wkgbmnqykcVar)) {
                    f13 = fLqeggnwhkg;
                    dxjokdxxwwVar = dxjokdxxwwVarZoijcleaow;
                    z13 = true;
                }
            } else if (dxjokdxxwwVar == null && fLqeggnwhkg < 0.0f) {
                if (dxjokdxxwwVar2 == null || f14 > fLqeggnwhkg) {
                    boolean zYggfygwlhe2 = yggfygwlhe(dxjokdxxwwVarZoijcleaow, wkgbmnqykcVar);
                    z14 = zYggfygwlhe2;
                    f14 = fLqeggnwhkg;
                    dxjokdxxwwVar2 = dxjokdxxwwVarZoijcleaow;
                } else if (!z14 && yggfygwlhe(dxjokdxxwwVarZoijcleaow, wkgbmnqykcVar)) {
                    f14 = fLqeggnwhkg;
                    dxjokdxxwwVar2 = dxjokdxxwwVarZoijcleaow;
                    z14 = true;
                }
            }
        }
        return dxjokdxxwwVar != null ? dxjokdxxwwVar : dxjokdxxwwVar2;
    }

    zoijcleaow nufgyqmvbu(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, int i13, float f13, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4, int i14) {
        if (dxjokdxxwwVar2 == dxjokdxxwwVar3) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -2.0f);
            return this;
        }
        if (f13 == 0.5f) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, 1.0f);
            if (i13 > 0 || i14 > 0) {
                this.f127511zoijcleaow = (-i13) + i14;
            }
        } else if (f13 <= 0.0f) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, 1.0f);
            this.f127511zoijcleaow = i13;
        } else if (f13 >= 1.0f) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, 1.0f);
            this.f127511zoijcleaow = -i14;
        } else {
            float f14 = 1.0f - f13;
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, f14 * 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, f14 * (-1.0f));
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, (-1.0f) * f13);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, 1.0f * f13);
            if (i13 > 0 || i14 > 0) {
                this.f127511zoijcleaow = ((-i13) * f14) + (i14 * f13);
            }
        }
        return this;
    }

    public zoijcleaow ojitshcjhn(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, int i13) {
        boolean z13 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z13 = true;
            }
            this.f127511zoijcleaow = i13;
        }
        if (z13) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, -1.0f);
        } else {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, 1.0f);
        }
        return this;
    }

    void oxmwwwfdhm() {
        float f13 = this.f127511zoijcleaow;
        if (f13 < 0.0f) {
            this.f127511zoijcleaow = f13 * (-1.0f);
            this.f127506eablkybsjg.ppxfxbqfkf();
        }
    }

    public void pmvmpeiblj(wkgbmnqykc wkgbmnqykcVar, dxjokdxxww dxjokdxxwwVar, boolean z13) {
        if (dxjokdxxwwVar == null || !dxjokdxxwwVar.f127437lereixgezr) {
            return;
        }
        this.f127511zoijcleaow += dxjokdxxwwVar.f127432esjtqupxsv * this.f127506eablkybsjg.nufgyqmvbu(dxjokdxxwwVar);
        this.f127506eablkybsjg.wkgbmnqykc(dxjokdxxwwVar, z13);
        if (z13) {
            dxjokdxxwwVar.wkgbmnqykc(this);
        }
        if (wkgbmnqykc.f127486yggfygwlhe && this.f127506eablkybsjg.gxszxtbevo() == 0) {
            this.f127507gxszxtbevo = true;
            wkgbmnqykcVar.f127505zoijcleaow = true;
        }
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public void ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar) {
        int i13 = dxjokdxxwwVar.f127431cqumvgiudr;
        float f13 = 1.0f;
        if (i13 != 1) {
            if (i13 == 2) {
                f13 = 1000.0f;
            } else if (i13 == 3) {
                f13 = 1000000.0f;
            } else if (i13 == 4) {
                f13 = 1.0E9f;
            } else if (i13 == 5) {
                f13 = 1.0E12f;
            }
        }
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, f13);
    }

    public zoijcleaow rgvfuqvkyq(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, int i13) {
        boolean z13 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z13 = true;
            }
            this.f127511zoijcleaow = i13;
        }
        if (z13) {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, 1.0f);
        } else {
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, 1.0f);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, -1.0f);
        }
        return this;
    }

    public String toString() {
        return lereixgezr();
    }

    public zoijcleaow vdvldrhtss(dxjokdxxww dxjokdxxwwVar, dxjokdxxww dxjokdxxwwVar2, dxjokdxxww dxjokdxxwwVar3, dxjokdxxww dxjokdxxwwVar4, float f13) {
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar3, 0.5f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar4, 0.5f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -0.5f);
        this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar2, -0.5f);
        this.f127511zoijcleaow = -f13;
        return this;
    }

    public zoijcleaow wflxmlrfwp(dxjokdxxww dxjokdxxwwVar, int i13) {
        if (i13 < 0) {
            this.f127511zoijcleaow = i13 * (-1);
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, 1.0f);
        } else {
            this.f127511zoijcleaow = i13;
            this.f127506eablkybsjg.btonecajqb(dxjokdxxwwVar, -1.0f);
        }
        return this;
    }

    public zoijcleaow wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, int i13) {
        this.f127506eablkybsjg.btonecajqb(wkgbmnqykcVar.ojitshcjhn(i13, "ep"), 1.0f);
        this.f127506eablkybsjg.btonecajqb(wkgbmnqykcVar.ojitshcjhn(i13, "em"), -1.0f);
        return this;
    }

    boolean zdlpuopuiu(dxjokdxxww dxjokdxxwwVar) {
        return this.f127506eablkybsjg.iobyxmoadg(dxjokdxxwwVar);
    }

    @Override // z0.wkgbmnqykc.iobyxmoadg
    public dxjokdxxww zoijcleaow(wkgbmnqykc wkgbmnqykcVar, boolean[] zArr) {
        return iwizpuwonk(zArr, null);
    }

    public void zynmafqrjb(wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar, boolean z13) {
        this.f127511zoijcleaow += zoijcleaowVar.f127511zoijcleaow * this.f127506eablkybsjg.eablkybsjg(zoijcleaowVar, z13);
        if (z13) {
            zoijcleaowVar.f127508iobyxmoadg.wkgbmnqykc(this);
        }
        if (wkgbmnqykc.f127486yggfygwlhe && this.f127508iobyxmoadg != null && this.f127506eablkybsjg.gxszxtbevo() == 0) {
            this.f127507gxszxtbevo = true;
            wkgbmnqykcVar.f127505zoijcleaow = true;
        }
    }

    public zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f127506eablkybsjg = new z0.iobyxmoadg(this, ppxfxbqfkfVar);
    }
}
