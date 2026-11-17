package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109960iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "p", "s", "hd", "d");

    static q7.zoijcleaow iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, int i13) {
        boolean z13 = i13 == 3;
        boolean zDraadjrbmk = false;
        String strVdvldrhtss = null;
        p7.wflxmlrfwp wflxmlrfwpVarZoijcleaow = null;
        p7.gxszxtbevo gxszxtbevoVarDxjokdxxww = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109960iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                wflxmlrfwpVarZoijcleaow = iobyxmoadg.zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 2) {
                gxszxtbevoVarDxjokdxxww = wkgbmnqykc.dxjokdxxww(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 3) {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            } else if (iCqumvgiudr != 4) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                z13 = ppxfxbqfkfVar.ojitshcjhn() == 3;
            }
        }
        return new q7.zoijcleaow(strVdvldrhtss, wflxmlrfwpVarZoijcleaow, gxszxtbevoVarDxjokdxxww, z13, zDraadjrbmk);
    }
}
