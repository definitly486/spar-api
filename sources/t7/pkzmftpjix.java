package t7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
abstract class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109983iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "hd", "it");

    static q7.vdvldrhtss iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ArrayList arrayList = new ArrayList();
        String strVdvldrhtss = null;
        boolean zDraadjrbmk = false;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109983iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            } else if (iCqumvgiudr != 2) {
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                ppxfxbqfkfVar.wkgbmnqykc();
                while (ppxfxbqfkfVar.btonecajqb()) {
                    q7.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
                    if (ppxfxbqfkfVarIobyxmoadg != null) {
                        arrayList.add(ppxfxbqfkfVarIobyxmoadg);
                    }
                }
                ppxfxbqfkfVar.nufgyqmvbu();
            }
        }
        return new q7.vdvldrhtss(strVdvldrhtss, arrayList, zDraadjrbmk);
    }
}
