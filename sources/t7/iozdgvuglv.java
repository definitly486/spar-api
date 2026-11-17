package t7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109964iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "r", "hd");

    static q7.agtfadlqog iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        boolean zDraadjrbmk = false;
        String strVdvldrhtss = null;
        p7.zoijcleaow zoijcleaowVarGxszxtbevo = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109964iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                zoijcleaowVarGxszxtbevo = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, true);
            } else if (iCqumvgiudr != 2) {
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            }
        }
        if (zDraadjrbmk) {
            return null;
        }
        return new q7.agtfadlqog(strVdvldrhtss, zoijcleaowVarGxszxtbevo);
    }
}
