package t7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f110003iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("a");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f110004zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("fc", "sc", "sw", "t");

    public static p7.gtknphoqwx iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        p7.gtknphoqwx gtknphoqwxVarZoijcleaow = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            if (ppxfxbqfkfVar.cqumvgiudr(f110003iobyxmoadg) != 0) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                gtknphoqwxVarZoijcleaow = zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return gtknphoqwxVarZoijcleaow == null ? new p7.gtknphoqwx(null, null, null, null) : gtknphoqwxVarZoijcleaow;
    }

    private static p7.gtknphoqwx zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        p7.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = null;
        p7.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = null;
        p7.zoijcleaow zoijcleaowVarEablkybsjg = null;
        p7.zoijcleaow zoijcleaowVarEablkybsjg2 = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f110004zoijcleaow);
            if (iCqumvgiudr == 0) {
                iobyxmoadgVarPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 1) {
                iobyxmoadgVarPpxfxbqfkf2 = wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 2) {
                zoijcleaowVarEablkybsjg = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr != 3) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zoijcleaowVarEablkybsjg2 = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new p7.gtknphoqwx(iobyxmoadgVarPpxfxbqfkf, iobyxmoadgVarPpxfxbqfkf2, zoijcleaowVarEablkybsjg, zoijcleaowVarEablkybsjg2);
    }
}
