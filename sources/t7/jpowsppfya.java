package t7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
abstract class jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109970iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109971zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    static q7.kcexrzcfyt iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ArrayList arrayList = new ArrayList();
        float fAgtfadlqog = 0.0f;
        boolean zDraadjrbmk = false;
        String strVdvldrhtss = null;
        p7.zoijcleaow zoijcleaowVar = null;
        p7.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = null;
        p7.zoijcleaow zoijcleaowVarEablkybsjg = null;
        p7.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = null;
        q7.kcexrzcfyt.zoijcleaow zoijcleaowVar2 = null;
        q7.kcexrzcfyt.ppxfxbqfkf ppxfxbqfkfVar2 = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f109970iobyxmoadg)) {
                case 0:
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 1:
                    iobyxmoadgVarPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 2:
                    zoijcleaowVarEablkybsjg = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 3:
                    wkgbmnqykcVarNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 4:
                    zoijcleaowVar2 = q7.kcexrzcfyt.zoijcleaow.values()[ppxfxbqfkfVar.ojitshcjhn() - 1];
                    break;
                case 5:
                    ppxfxbqfkfVar2 = q7.kcexrzcfyt.ppxfxbqfkf.values()[ppxfxbqfkfVar.ojitshcjhn() - 1];
                    break;
                case 6:
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 7:
                    zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                    break;
                case 8:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        ppxfxbqfkfVar.lqeggnwhkg();
                        String strVdvldrhtss2 = null;
                        p7.zoijcleaow zoijcleaowVarEablkybsjg2 = null;
                        while (ppxfxbqfkfVar.btonecajqb()) {
                            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109971zoijcleaow);
                            if (iCqumvgiudr == 0) {
                                strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
                            } else if (iCqumvgiudr != 1) {
                                ppxfxbqfkfVar.lereixgezr();
                                ppxfxbqfkfVar.pmvmpeiblj();
                            } else {
                                zoijcleaowVarEablkybsjg2 = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
                            }
                        }
                        ppxfxbqfkfVar.dxjokdxxww();
                        strVdvldrhtss2.hashCode();
                        switch (strVdvldrhtss2) {
                            case "d":
                            case "g":
                                btonecajqbVar.jyumaefscl(true);
                                arrayList.add(zoijcleaowVarEablkybsjg2);
                                break;
                            case "o":
                                zoijcleaowVar = zoijcleaowVarEablkybsjg2;
                                break;
                        }
                    }
                    ppxfxbqfkfVar.nufgyqmvbu();
                    if (arrayList.size() == 1) {
                        arrayList.add((p7.zoijcleaow) arrayList.get(0));
                    }
                    break;
                default:
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        return new q7.kcexrzcfyt(strVdvldrhtss, zoijcleaowVar, arrayList, iobyxmoadgVarPpxfxbqfkf, wkgbmnqykcVarNufgyqmvbu == null ? new p7.wkgbmnqykc(Collections.singletonList(new w7.iobyxmoadg(100))) : wkgbmnqykcVarNufgyqmvbu, zoijcleaowVarEablkybsjg, zoijcleaowVar2 == null ? q7.kcexrzcfyt.zoijcleaow.BUTT : zoijcleaowVar2, ppxfxbqfkfVar2 == null ? q7.kcexrzcfyt.ppxfxbqfkf.MITER : ppxfxbqfkfVar2, fAgtfadlqog, zDraadjrbmk);
    }
}
