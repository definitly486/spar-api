package t7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109963iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("k", "x", "y");

    public static p7.eablkybsjg iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ArrayList arrayList = new ArrayList();
        if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY) {
            ppxfxbqfkfVar.wkgbmnqykc();
            while (ppxfxbqfkfVar.btonecajqb()) {
                arrayList.add(lereixgezr.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar));
            }
            ppxfxbqfkfVar.nufgyqmvbu();
            yggfygwlhe.zoijcleaow(arrayList);
        } else {
            arrayList.add(new w7.iobyxmoadg(kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, v7.btonecajqb.eablkybsjg())));
        }
        return new p7.eablkybsjg(arrayList);
    }

    static p7.wflxmlrfwp zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        p7.eablkybsjg eablkybsjgVarIobyxmoadg = null;
        p7.zoijcleaow zoijcleaowVarEablkybsjg = null;
        boolean z13 = false;
        p7.zoijcleaow zoijcleaowVarEablkybsjg2 = null;
        while (ppxfxbqfkfVar.zdlpuopuiu() != u7.ppxfxbqfkf.zoijcleaow.END_OBJECT) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109963iobyxmoadg);
            if (iCqumvgiudr == 0) {
                eablkybsjgVarIobyxmoadg = iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr != 1) {
                if (iCqumvgiudr != 2) {
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                } else if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.STRING) {
                    ppxfxbqfkfVar.pmvmpeiblj();
                    z13 = true;
                } else {
                    zoijcleaowVarEablkybsjg = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
                }
            } else if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.STRING) {
                ppxfxbqfkfVar.pmvmpeiblj();
                z13 = true;
            } else {
                zoijcleaowVarEablkybsjg2 = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        if (z13) {
            btonecajqbVar.iobyxmoadg("Lottie doesn't support expressions.");
        }
        return eablkybsjgVarIobyxmoadg != null ? eablkybsjgVarIobyxmoadg : new p7.dxjokdxxww(zoijcleaowVarEablkybsjg2, zoijcleaowVarEablkybsjg);
    }
}
