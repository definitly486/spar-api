package t7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109987iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109988zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("p", "k");

    static q7.eablkybsjg iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        p7.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strVdvldrhtss = null;
        q7.lqeggnwhkg lqeggnwhkgVar = null;
        p7.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = null;
        p7.gxszxtbevo gxszxtbevoVarDxjokdxxww = null;
        p7.gxszxtbevo gxszxtbevoVarDxjokdxxww2 = null;
        boolean zDraadjrbmk = false;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f109987iobyxmoadg)) {
                case 0:
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 1:
                    ppxfxbqfkfVar.lqeggnwhkg();
                    int iOjitshcjhn = -1;
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109988zoijcleaow);
                        if (iCqumvgiudr == 0) {
                            iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
                        } else if (iCqumvgiudr != 1) {
                            ppxfxbqfkfVar.lereixgezr();
                            ppxfxbqfkfVar.pmvmpeiblj();
                        } else {
                            ppxfxbqfkfVarLqeggnwhkg = wkgbmnqykc.lqeggnwhkg(ppxfxbqfkfVar, btonecajqbVar, iOjitshcjhn);
                        }
                    }
                    ppxfxbqfkfVar.dxjokdxxww();
                    break;
                case 2:
                    wkgbmnqykcVarNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 3:
                    lqeggnwhkgVar = ppxfxbqfkfVar.ojitshcjhn() == 1 ? q7.lqeggnwhkg.LINEAR : q7.lqeggnwhkg.RADIAL;
                    break;
                case 4:
                    gxszxtbevoVarDxjokdxxww = wkgbmnqykc.dxjokdxxww(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 5:
                    gxszxtbevoVarDxjokdxxww2 = wkgbmnqykc.dxjokdxxww(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 6:
                    fillType = ppxfxbqfkfVar.ojitshcjhn() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                    break;
                default:
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        return new q7.eablkybsjg(strVdvldrhtss, lqeggnwhkgVar, fillType, ppxfxbqfkfVarLqeggnwhkg, wkgbmnqykcVarNufgyqmvbu == null ? new p7.wkgbmnqykc(Collections.singletonList(new w7.iobyxmoadg(100))) : wkgbmnqykcVarNufgyqmvbu, gxszxtbevoVarDxjokdxxww, gxszxtbevoVarDxjokdxxww2, null, null, zDraadjrbmk);
    }
}
