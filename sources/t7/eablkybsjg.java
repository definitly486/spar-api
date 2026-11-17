package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109950iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("ef");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109951zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("ty", "v");

    private static q7.iobyxmoadg iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        q7.iobyxmoadg iobyxmoadgVar = null;
        while (true) {
            boolean z13 = false;
            while (true) {
                if (!ppxfxbqfkfVar.btonecajqb()) {
                    ppxfxbqfkfVar.dxjokdxxww();
                    return iobyxmoadgVar;
                }
                int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109951zoijcleaow);
                if (iCqumvgiudr != 0) {
                    if (iCqumvgiudr != 1) {
                        ppxfxbqfkfVar.lereixgezr();
                        ppxfxbqfkfVar.pmvmpeiblj();
                    } else if (z13) {
                        iobyxmoadgVar = new q7.iobyxmoadg(wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar));
                    } else {
                        ppxfxbqfkfVar.pmvmpeiblj();
                    }
                } else if (ppxfxbqfkfVar.ojitshcjhn() == 0) {
                    z13 = true;
                }
            }
        }
    }

    static q7.iobyxmoadg zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        q7.iobyxmoadg iobyxmoadgVar = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            if (ppxfxbqfkfVar.cqumvgiudr(f109950iobyxmoadg) != 0) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                ppxfxbqfkfVar.wkgbmnqykc();
                while (ppxfxbqfkfVar.btonecajqb()) {
                    q7.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
                    if (iobyxmoadgVarIobyxmoadg != null) {
                        iobyxmoadgVar = iobyxmoadgVarIobyxmoadg;
                    }
                }
                ppxfxbqfkfVar.nufgyqmvbu();
            }
        }
        return iobyxmoadgVar;
    }
}
