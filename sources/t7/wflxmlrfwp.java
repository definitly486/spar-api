package t7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109992iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109993zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("shapes");

    static o7.wkgbmnqykc iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ArrayList arrayList = new ArrayList();
        ppxfxbqfkfVar.lqeggnwhkg();
        double dAgtfadlqog = 0.0d;
        String strVdvldrhtss = null;
        String strVdvldrhtss2 = null;
        char cCharAt = 0;
        double dAgtfadlqog2 = 0.0d;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109992iobyxmoadg);
            if (iCqumvgiudr == 0) {
                cCharAt = ppxfxbqfkfVar.vdvldrhtss().charAt(0);
            } else if (iCqumvgiudr == 1) {
                dAgtfadlqog2 = ppxfxbqfkfVar.agtfadlqog();
            } else if (iCqumvgiudr == 2) {
                dAgtfadlqog = ppxfxbqfkfVar.agtfadlqog();
            } else if (iCqumvgiudr == 3) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 4) {
                strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr != 5) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                ppxfxbqfkfVar.lqeggnwhkg();
                while (ppxfxbqfkfVar.btonecajqb()) {
                    if (ppxfxbqfkfVar.cqumvgiudr(f109993zoijcleaow) != 0) {
                        ppxfxbqfkfVar.lereixgezr();
                        ppxfxbqfkfVar.pmvmpeiblj();
                    } else {
                        ppxfxbqfkfVar.wkgbmnqykc();
                        while (ppxfxbqfkfVar.btonecajqb()) {
                            arrayList.add((q7.vdvldrhtss) nufgyqmvbu.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar));
                        }
                        ppxfxbqfkfVar.nufgyqmvbu();
                    }
                }
                ppxfxbqfkfVar.dxjokdxxww();
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new o7.wkgbmnqykc(arrayList, cCharAt, dAgtfadlqog2, dAgtfadlqog, strVdvldrhtss, strVdvldrhtss2);
    }
}
