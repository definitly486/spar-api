package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109940iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("fFamily", "fName", "fStyle", "ascent");

    static o7.ppxfxbqfkf iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        String strVdvldrhtss = null;
        String strVdvldrhtss2 = null;
        float fAgtfadlqog = 0.0f;
        String strVdvldrhtss3 = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109940iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                strVdvldrhtss3 = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 2) {
                strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr != 3) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new o7.ppxfxbqfkf(strVdvldrhtss, strVdvldrhtss3, strVdvldrhtss2, fAgtfadlqog);
    }
}
