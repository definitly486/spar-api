package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109952iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "mm", "hd");

    static q7.btonecajqb iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar) {
        String strVdvldrhtss = null;
        boolean zDraadjrbmk = false;
        q7.btonecajqb.iobyxmoadg iobyxmoadgVarWkgbmnqykc = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109952iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                iobyxmoadgVarWkgbmnqykc = q7.btonecajqb.iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar.ojitshcjhn());
            } else if (iCqumvgiudr != 2) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            }
        }
        return new q7.btonecajqb(strVdvldrhtss, iobyxmoadgVarWkgbmnqykc, zDraadjrbmk);
    }
}
