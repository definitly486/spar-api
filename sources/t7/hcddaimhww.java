package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static u7.ppxfxbqfkf.iobyxmoadg f109961iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "ind", "ks", "hd");

    static q7.oxmwwwfdhm iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        String strVdvldrhtss = null;
        int iOjitshcjhn = 0;
        boolean zDraadjrbmk = false;
        p7.nufgyqmvbu nufgyqmvbuVarGtknphoqwx = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109961iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
            } else if (iCqumvgiudr == 2) {
                nufgyqmvbuVarGtknphoqwx = wkgbmnqykc.gtknphoqwx(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr != 3) {
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            }
        }
        return new q7.oxmwwwfdhm(strVdvldrhtss, iOjitshcjhn, nufgyqmvbuVarGtknphoqwx, zDraadjrbmk);
    }
}
