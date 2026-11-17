package jztzpxfvev;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f53033zoijcleaow = ipoelvxyzq.ppxfxbqfkf.f49166iwizpuwonk;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f53034iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new nufgyqmvbu.iobyxmoadg[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(wkgbmnqykc wkgbmnqykcVar, nufgyqmvbu.iobyxmoadg iobyxmoadgVar, Throwable th2) {
        wkgbmnqykcVar.f53034iobyxmoadg.rgvfuqvkyq(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void gxszxtbevo() {
        zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, this.f53034iobyxmoadg.draadjrbmk());
        int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
        int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
        if (iWkgbmnqykc <= iEablkybsjg) {
            while (true) {
                ((nufgyqmvbu.iobyxmoadg) this.f53034iobyxmoadg.f49169zdlpuopuiu[iWkgbmnqykc]).iobyxmoadg().resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
                if (iWkgbmnqykc == iEablkybsjg) {
                    break;
                } else {
                    iWkgbmnqykc++;
                }
            }
        }
        this.f53034iobyxmoadg.nufgyqmvbu();
    }

    public final void ppxfxbqfkf(Throwable th2) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f53034iobyxmoadg;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        pj.agtfadlqog[] agtfadlqogVarArr = new pj.agtfadlqog[iDraadjrbmk];
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            agtfadlqogVarArr[i13] = ((nufgyqmvbu.iobyxmoadg) ppxfxbqfkfVar.f49169zdlpuopuiu[i13]).iobyxmoadg();
        }
        for (int i14 = 0; i14 < iDraadjrbmk; i14++) {
            agtfadlqogVarArr[i14].hkdspvbjdz(th2);
        }
        if (this.f53034iobyxmoadg.draadjrbmk() == 0) {
            return;
        }
        rlfsiqarku.eablkybsjg.ppxfxbqfkf("uncancelled requests present");
    }

    public final boolean wkgbmnqykc(final nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        g.lqeggnwhkg lqeggnwhkgVar = (g.lqeggnwhkg) iobyxmoadgVar.zoijcleaow().invoke();
        if (lqeggnwhkgVar == null) {
            pj.agtfadlqog agtfadlqogVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVarIobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
            return false;
        }
        iobyxmoadgVar.iobyxmoadg().stevsuqkhv(new tg.draadjrbmk() { // from class: jztzpxfvev.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.eablkybsjg(this.f52948zdlpuopuiu, iobyxmoadgVar, (Throwable) obj);
            }
        });
        zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, this.f53034iobyxmoadg.draadjrbmk());
        int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
        int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
        if (iWkgbmnqykc <= iEablkybsjg) {
            while (true) {
                g.lqeggnwhkg lqeggnwhkgVar2 = (g.lqeggnwhkg) ((nufgyqmvbu.iobyxmoadg) this.f53034iobyxmoadg.f49169zdlpuopuiu[iEablkybsjg]).zoijcleaow().invoke();
                if (lqeggnwhkgVar2 != null) {
                    g.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = lqeggnwhkgVar.agtfadlqog(lqeggnwhkgVar2);
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVarAgtfadlqog, lqeggnwhkgVar)) {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVarAgtfadlqog, lqeggnwhkgVar2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int iDraadjrbmk = this.f53034iobyxmoadg.draadjrbmk() - 1;
                            if (iDraadjrbmk <= iEablkybsjg) {
                                while (true) {
                                    ((nufgyqmvbu.iobyxmoadg) this.f53034iobyxmoadg.f49169zdlpuopuiu[iEablkybsjg]).iobyxmoadg().hkdspvbjdz(cancellationException);
                                    if (iDraadjrbmk == iEablkybsjg) {
                                        break;
                                    }
                                    iDraadjrbmk++;
                                }
                            }
                        }
                    } else {
                        this.f53034iobyxmoadg.iobyxmoadg(iEablkybsjg + 1, iobyxmoadgVar);
                        return true;
                    }
                }
                if (iEablkybsjg != iWkgbmnqykc) {
                    iEablkybsjg--;
                }
            }
        }
        this.f53034iobyxmoadg.iobyxmoadg(0, iobyxmoadgVar);
        return true;
    }
}
