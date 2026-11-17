package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class z implements t {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float[] f117379agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private kcexrzcfyt f117380btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private kcexrzcfyt f117381draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private kcexrzcfyt f117382dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yadqdtsiqt f117383eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private kcexrzcfyt f117384gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f117385gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.wflxmlrfwp f117386iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int[] f117387lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float[] f117388nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private iwizpuwonk f117389ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f117390ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float[] f117391wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f117392wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.ojitshcjhn f117393zoijcleaow;

    public /* synthetic */ z(androidx.collection.wflxmlrfwp wflxmlrfwpVar, androidx.collection.ojitshcjhn ojitshcjhnVar, int i13, int i14, yadqdtsiqt yadqdtsiqtVar, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(wflxmlrfwpVar, ojitshcjhnVar, i13, i14, yadqdtsiqtVar, i15);
    }

    private final float btonecajqb(int i13, int i14, boolean z13) {
        yadqdtsiqt yadqdtsiqtVarZoijcleaow;
        float f13;
        androidx.collection.wflxmlrfwp wflxmlrfwpVar = this.f117386iobyxmoadg;
        if (i13 >= wflxmlrfwpVar.f4401zoijcleaow - 1) {
            f13 = i14;
        } else {
            int iEablkybsjg = wflxmlrfwpVar.eablkybsjg(i13);
            int iEablkybsjg2 = this.f117386iobyxmoadg.eablkybsjg(i13 + 1);
            if (i14 == iEablkybsjg) {
                f13 = iEablkybsjg;
            } else {
                int i15 = iEablkybsjg2 - iEablkybsjg;
                y yVar = (y) this.f117393zoijcleaow.zoijcleaow(iEablkybsjg);
                if (yVar == null || (yadqdtsiqtVarZoijcleaow = yVar.zoijcleaow()) == null) {
                    yadqdtsiqtVarZoijcleaow = this.f117383eablkybsjg;
                }
                float f14 = i15;
                float fIobyxmoadg = yadqdtsiqtVarZoijcleaow.iobyxmoadg((i14 - iEablkybsjg) / f14);
                if (z13) {
                    return fIobyxmoadg;
                }
                f13 = (f14 * fIobyxmoadg) + iEablkybsjg;
            }
        }
        return f13 / 1000;
    }

    private final float dxjokdxxww(int i13) {
        return btonecajqb(nufgyqmvbu(i13), i13, false);
    }

    private final void gtknphoqwx(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        float[] fArr;
        boolean z13 = this.f117389ojitshcjhn != r.f117225ppxfxbqfkf;
        if (this.f117382dxjokdxxww == null) {
            this.f117382dxjokdxxww = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
            this.f117380btonecajqb = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar3);
            int i13 = this.f117386iobyxmoadg.f4401zoijcleaow;
            float[] fArr2 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr2[i14] = this.f117386iobyxmoadg.eablkybsjg(i14) / 1000;
            }
            this.f117388nufgyqmvbu = fArr2;
            int i15 = this.f117386iobyxmoadg.f4401zoijcleaow;
            int[] iArr = new int[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                y yVar = (y) this.f117393zoijcleaow.zoijcleaow(this.f117386iobyxmoadg.eablkybsjg(i16));
                int iIobyxmoadg = yVar != null ? yVar.iobyxmoadg() : this.f117385gxszxtbevo;
                if (!jyumaefscl.ppxfxbqfkf(iIobyxmoadg, jyumaefscl.f117163iobyxmoadg.iobyxmoadg())) {
                    z13 = true;
                }
                iArr[i16] = iIobyxmoadg;
            }
            this.f117387lqeggnwhkg = iArr;
        }
        if (z13) {
            if (this.f117389ojitshcjhn != r.f117225ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117384gtknphoqwx, kcexrzcfytVar) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117381draadjrbmk, kcexrzcfytVar2)) {
                return;
            }
            this.f117384gtknphoqwx = kcexrzcfytVar;
            this.f117381draadjrbmk = kcexrzcfytVar2;
            int iZoijcleaow = (kcexrzcfytVar.zoijcleaow() % 2) + kcexrzcfytVar.zoijcleaow();
            this.f117391wflxmlrfwp = new float[iZoijcleaow];
            this.f117379agtfadlqog = new float[iZoijcleaow];
            int i17 = this.f117386iobyxmoadg.f4401zoijcleaow;
            float[][] fArr3 = new float[i17][];
            for (int i18 = 0; i18 < i17; i18++) {
                int iEablkybsjg = this.f117386iobyxmoadg.eablkybsjg(i18);
                y yVar2 = (y) this.f117393zoijcleaow.zoijcleaow(iEablkybsjg);
                if (iEablkybsjg == 0 && yVar2 == null) {
                    fArr = new float[iZoijcleaow];
                    for (int i19 = 0; i19 < iZoijcleaow; i19++) {
                        fArr[i19] = kcexrzcfytVar.iobyxmoadg(i19);
                    }
                } else if (iEablkybsjg == wkgbmnqykc() && yVar2 == null) {
                    fArr = new float[iZoijcleaow];
                    for (int i23 = 0; i23 < iZoijcleaow; i23++) {
                        fArr[i23] = kcexrzcfytVar2.iobyxmoadg(i23);
                    }
                } else {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yVar2);
                    kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = yVar2.ppxfxbqfkf();
                    float[] fArr4 = new float[iZoijcleaow];
                    for (int i24 = 0; i24 < iZoijcleaow; i24++) {
                        fArr4[i24] = kcexrzcfytVarPpxfxbqfkf.iobyxmoadg(i24);
                    }
                    fArr = fArr4;
                }
                fArr3[i18] = fArr;
            }
            this.f117389ojitshcjhn = new iwizpuwonk(this.f117387lqeggnwhkg, this.f117388nufgyqmvbu, fArr3);
        }
    }

    private final int nufgyqmvbu(int i13) {
        int iZoijcleaow = androidx.collection.wflxmlrfwp.zoijcleaow(this.f117386iobyxmoadg, i13, 0, 0, 6, null);
        return iZoijcleaow < -1 ? -(iZoijcleaow + 2) : iZoijcleaow;
    }

    @Override // vipkmwdibw.t
    public int eablkybsjg() {
        return this.f117392wkgbmnqykc;
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt gxszxtbevo(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        long jEablkybsjg = r.eablkybsjg(this, j13 / 1000000);
        if (jEablkybsjg < 0) {
            return kcexrzcfytVar3;
        }
        gtknphoqwx(kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
        kcexrzcfyt kcexrzcfytVar4 = this.f117380btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar4);
        int i13 = 0;
        if (this.f117389ojitshcjhn == r.f117225ppxfxbqfkf) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg = r.lqeggnwhkg(this, jEablkybsjg - 1, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg2 = r.lqeggnwhkg(this, jEablkybsjg, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
            int iZoijcleaow = kcexrzcfytVarLqeggnwhkg.zoijcleaow();
            while (i13 < iZoijcleaow) {
                kcexrzcfytVar4.eablkybsjg(i13, (kcexrzcfytVarLqeggnwhkg.iobyxmoadg(i13) - kcexrzcfytVarLqeggnwhkg2.iobyxmoadg(i13)) * 1000.0f);
                i13++;
            }
            return kcexrzcfytVar4;
        }
        float fDxjokdxxww = dxjokdxxww((int) jEablkybsjg);
        float[] fArr = this.f117379agtfadlqog;
        this.f117389ojitshcjhn.zoijcleaow(fDxjokdxxww, fArr);
        int length = fArr.length;
        while (i13 < length) {
            kcexrzcfytVar4.eablkybsjg(i13, fArr[i13]);
            i13++;
        }
        return kcexrzcfytVar4;
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt lqeggnwhkg(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf;
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf2;
        int iEablkybsjg = (int) r.eablkybsjg(this, j13 / 1000000);
        y yVar = (y) this.f117393zoijcleaow.zoijcleaow(iEablkybsjg);
        if (yVar != null) {
            return yVar.ppxfxbqfkf();
        }
        if (iEablkybsjg >= wkgbmnqykc()) {
            return kcexrzcfytVar2;
        }
        if (iEablkybsjg <= 0) {
            return kcexrzcfytVar;
        }
        gtknphoqwx(kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
        kcexrzcfyt kcexrzcfytVar4 = this.f117382dxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar4);
        int i13 = 0;
        if (this.f117389ojitshcjhn != r.f117225ppxfxbqfkf) {
            float fDxjokdxxww = dxjokdxxww(iEablkybsjg);
            float[] fArr = this.f117391wflxmlrfwp;
            this.f117389ojitshcjhn.iobyxmoadg(fDxjokdxxww, fArr);
            int length = fArr.length;
            while (i13 < length) {
                kcexrzcfytVar4.eablkybsjg(i13, fArr[i13]);
                i13++;
            }
            return kcexrzcfytVar4;
        }
        int iNufgyqmvbu = nufgyqmvbu(iEablkybsjg);
        float fBtonecajqb = btonecajqb(iNufgyqmvbu, iEablkybsjg, true);
        y yVar2 = (y) this.f117393zoijcleaow.zoijcleaow(this.f117386iobyxmoadg.eablkybsjg(iNufgyqmvbu));
        if (yVar2 != null && (kcexrzcfytVarPpxfxbqfkf2 = yVar2.ppxfxbqfkf()) != null) {
            kcexrzcfytVar = kcexrzcfytVarPpxfxbqfkf2;
        }
        y yVar3 = (y) this.f117393zoijcleaow.zoijcleaow(this.f117386iobyxmoadg.eablkybsjg(iNufgyqmvbu + 1));
        if (yVar3 != null && (kcexrzcfytVarPpxfxbqfkf = yVar3.ppxfxbqfkf()) != null) {
            kcexrzcfytVar2 = kcexrzcfytVarPpxfxbqfkf;
        }
        int iZoijcleaow = kcexrzcfytVar4.zoijcleaow();
        while (i13 < iZoijcleaow) {
            kcexrzcfytVar4.eablkybsjg(i13, (kcexrzcfytVar.iobyxmoadg(i13) * (1 - fBtonecajqb)) + (kcexrzcfytVar2.iobyxmoadg(i13) * fBtonecajqb));
            i13++;
        }
        return kcexrzcfytVar4;
    }

    @Override // vipkmwdibw.t
    public int wkgbmnqykc() {
        return this.f117390ppxfxbqfkf;
    }

    private z(androidx.collection.wflxmlrfwp wflxmlrfwpVar, androidx.collection.ojitshcjhn ojitshcjhnVar, int i13, int i14, yadqdtsiqt yadqdtsiqtVar, int i15) {
        this.f117386iobyxmoadg = wflxmlrfwpVar;
        this.f117393zoijcleaow = ojitshcjhnVar;
        this.f117390ppxfxbqfkf = i13;
        this.f117392wkgbmnqykc = i14;
        this.f117383eablkybsjg = yadqdtsiqtVar;
        this.f117385gxszxtbevo = i15;
        this.f117387lqeggnwhkg = r.f117224iobyxmoadg;
        this.f117388nufgyqmvbu = r.f117226zoijcleaow;
        this.f117391wflxmlrfwp = r.f117226zoijcleaow;
        this.f117379agtfadlqog = r.f117226zoijcleaow;
        this.f117389ojitshcjhn = r.f117225ppxfxbqfkf;
    }
}
