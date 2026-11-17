package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109996iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "c", "o", "tr", "hd");

    static q7.wflxmlrfwp iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        String strVdvldrhtss = null;
        p7.zoijcleaow zoijcleaowVarGxszxtbevo = null;
        p7.zoijcleaow zoijcleaowVarGxszxtbevo2 = null;
        p7.draadjrbmk draadjrbmkVarLqeggnwhkg = null;
        boolean zDraadjrbmk = false;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109996iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                zoijcleaowVarGxszxtbevo = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, false);
            } else if (iCqumvgiudr == 2) {
                zoijcleaowVarGxszxtbevo2 = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, false);
            } else if (iCqumvgiudr == 3) {
                draadjrbmkVarLqeggnwhkg = ppxfxbqfkf.lqeggnwhkg(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr != 4) {
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            }
        }
        return new q7.wflxmlrfwp(strVdvldrhtss, zoijcleaowVarGxszxtbevo, zoijcleaowVarGxszxtbevo2, draadjrbmkVarLqeggnwhkg, zDraadjrbmk);
    }
}
