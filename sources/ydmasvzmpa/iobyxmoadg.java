package ydmasvzmpa;

import androidx.compose.foundation.lazy.layout.dvvnrvtcbc;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements tzroggbefp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f124457gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f124458iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f124460wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f124461zoijcleaow = -1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f124459ppxfxbqfkf = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow[16], 0);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f124456eablkybsjg = -1;

    public iobyxmoadg(int i13) {
        this.f124458iobyxmoadg = i13;
    }

    private final int eablkybsjg(yadqdtsiqt yadqdtsiqtVar, boolean z13) {
        return z13 ? ((rgvfuqvkyq) hg.jyumaefscl.skhdrjzrfn(yadqdtsiqtVar.nufgyqmvbu())).getIndex() + 1 : ((rgvfuqvkyq) hg.jyumaefscl.opjhrmiecq(yadqdtsiqtVar.nufgyqmvbu())).getIndex() - 1;
    }

    private final int gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, boolean z13) {
        if (z13) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) hg.jyumaefscl.skhdrjzrfn(yadqdtsiqtVar.nufgyqmvbu());
            return (yadqdtsiqtVar.getOrientation() == jztzpxfvev.jlmebxxoox.Vertical ? rgvfuqvkyqVar.lqeggnwhkg() : rgvfuqvkyqVar.dxjokdxxww()) + 1;
        }
        rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) hg.jyumaefscl.opjhrmiecq(yadqdtsiqtVar.nufgyqmvbu());
        return (yadqdtsiqtVar.getOrientation() == jztzpxfvev.jlmebxxoox.Vertical ? rgvfuqvkyqVar2.lqeggnwhkg() : rgvfuqvkyqVar2.dxjokdxxww()) - 1;
    }

    private final void lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar, int i13, boolean z13) {
        if (i13 == -1 || yadqdtsiqtVar.nufgyqmvbu().isEmpty() || i13 == gxszxtbevo(yadqdtsiqtVar, z13)) {
            return;
        }
        nufgyqmvbu();
    }

    private final void nufgyqmvbu() {
        this.f124461zoijcleaow = -1;
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f124459ppxfxbqfkf;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            ((androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow) objArr[i13]).cancel();
        }
        this.f124459ppxfxbqfkf.nufgyqmvbu();
    }

    @Override // ydmasvzmpa.tzroggbefp
    public void iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar, int i13) {
        int iZoijcleaow = dvvnrvtcbcVar.zoijcleaow() == -1 ? this.f124458iobyxmoadg : dvvnrvtcbcVar.zoijcleaow();
        for (int i14 = 0; i14 < iZoijcleaow; i14++) {
            dvvnrvtcbcVar.iobyxmoadg(i13 + i14);
        }
    }

    @Override // ydmasvzmpa.tzroggbefp
    public void ppxfxbqfkf(kegysxyocb kegysxyocbVar, yadqdtsiqt yadqdtsiqtVar) {
        lqeggnwhkg(yadqdtsiqtVar, this.f124461zoijcleaow, this.f124460wkgbmnqykc);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int i13 = this.f124456eablkybsjg;
        if (i13 != -1 && this.f124457gxszxtbevo != 0.0f && i13 != iGxszxtbevo && !yadqdtsiqtVar.nufgyqmvbu().isEmpty()) {
            int iGxszxtbevo2 = gxszxtbevo(yadqdtsiqtVar, this.f124457gxszxtbevo < 0.0f);
            int iEablkybsjg = eablkybsjg(yadqdtsiqtVar, this.f124457gxszxtbevo < 0.0f);
            if (iEablkybsjg >= 0 && iEablkybsjg < yadqdtsiqtVar.gxszxtbevo() && iGxszxtbevo2 != this.f124461zoijcleaow && iGxszxtbevo2 >= 0) {
                this.f124461zoijcleaow = iGxszxtbevo2;
                this.f124459ppxfxbqfkf.nufgyqmvbu();
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f124459ppxfxbqfkf;
                ppxfxbqfkfVar.eablkybsjg(ppxfxbqfkfVar.draadjrbmk(), kegysxyocbVar.iobyxmoadg(iGxszxtbevo2));
            }
        }
        this.f124456eablkybsjg = iGxszxtbevo;
    }

    @Override // ydmasvzmpa.tzroggbefp
    public void wkgbmnqykc(kegysxyocb kegysxyocbVar, float f13, yadqdtsiqt yadqdtsiqtVar) {
        if (!yadqdtsiqtVar.nufgyqmvbu().isEmpty()) {
            int i13 = 0;
            boolean z13 = f13 < 0.0f;
            int iGxszxtbevo = gxszxtbevo(yadqdtsiqtVar, z13);
            int iEablkybsjg = eablkybsjg(yadqdtsiqtVar, z13);
            if (iEablkybsjg >= 0 && iEablkybsjg < yadqdtsiqtVar.gxszxtbevo()) {
                if (iGxszxtbevo != this.f124461zoijcleaow && iGxszxtbevo >= 0) {
                    if (this.f124460wkgbmnqykc != z13) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f124459ppxfxbqfkf;
                        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
                        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                        for (int i14 = 0; i14 < iDraadjrbmk; i14++) {
                            ((androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow) objArr[i14]).cancel();
                        }
                    }
                    this.f124460wkgbmnqykc = z13;
                    this.f124461zoijcleaow = iGxszxtbevo;
                    this.f124459ppxfxbqfkf.nufgyqmvbu();
                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = this.f124459ppxfxbqfkf;
                    ppxfxbqfkfVar2.eablkybsjg(ppxfxbqfkfVar2.draadjrbmk(), kegysxyocbVar.iobyxmoadg(iGxszxtbevo));
                }
                if (z13) {
                    rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) hg.jyumaefscl.skhdrjzrfn(yadqdtsiqtVar.nufgyqmvbu());
                    if (((xrmfcynszj.eablkybsjg.zoijcleaow(rgvfuqvkyqVar, yadqdtsiqtVar.getOrientation()) + xrmfcynszj.eablkybsjg.ppxfxbqfkf(rgvfuqvkyqVar, yadqdtsiqtVar.getOrientation())) + yadqdtsiqtVar.lqeggnwhkg()) - yadqdtsiqtVar.ppxfxbqfkf() < (-f13)) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = this.f124459ppxfxbqfkf;
                        Object[] objArr2 = ppxfxbqfkfVar3.f49169zdlpuopuiu;
                        int iDraadjrbmk2 = ppxfxbqfkfVar3.draadjrbmk();
                        while (i13 < iDraadjrbmk2) {
                            ((androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow) objArr2[i13]).iobyxmoadg();
                            i13++;
                        }
                    }
                } else if (yadqdtsiqtVar.eablkybsjg() - xrmfcynszj.eablkybsjg.zoijcleaow((rgvfuqvkyq) hg.jyumaefscl.opjhrmiecq(yadqdtsiqtVar.nufgyqmvbu()), yadqdtsiqtVar.getOrientation()) < f13) {
                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar4 = this.f124459ppxfxbqfkf;
                    Object[] objArr3 = ppxfxbqfkfVar4.f49169zdlpuopuiu;
                    int iDraadjrbmk3 = ppxfxbqfkfVar4.draadjrbmk();
                    while (i13 < iDraadjrbmk3) {
                        ((androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow) objArr3[i13]).iobyxmoadg();
                        i13++;
                    }
                }
            }
        }
        this.f124457gxszxtbevo = f13;
    }
}
