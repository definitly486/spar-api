package t7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109998iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "c", "o", "fillEnabled", "r", "hd");

    static q7.rgvfuqvkyq iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        p7.wkgbmnqykc wkgbmnqykcVar = null;
        String strVdvldrhtss = null;
        p7.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = null;
        boolean zDraadjrbmk = false;
        boolean zDraadjrbmk2 = false;
        int iOjitshcjhn = 1;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109998iobyxmoadg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                iobyxmoadgVarPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 2) {
                wkgbmnqykcVar = wkgbmnqykc.nufgyqmvbu(ppxfxbqfkfVar, btonecajqbVar);
            } else if (iCqumvgiudr == 3) {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            } else if (iCqumvgiudr == 4) {
                iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
            } else if (iCqumvgiudr != 5) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                zDraadjrbmk2 = ppxfxbqfkfVar.draadjrbmk();
            }
        }
        if (wkgbmnqykcVar == null) {
            wkgbmnqykcVar = new p7.wkgbmnqykc(Collections.singletonList(new w7.iobyxmoadg(100)));
        }
        return new q7.rgvfuqvkyq(strVdvldrhtss, zDraadjrbmk, iOjitshcjhn == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, iobyxmoadgVarPpxfxbqfkf, wkgbmnqykcVar, zDraadjrbmk2);
    }
}
