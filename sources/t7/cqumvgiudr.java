package t7;

/* JADX INFO: loaded from: classes2.dex */
abstract class cqumvgiudr {
    static q7.dxjokdxxww iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        q7.dxjokdxxww.iobyxmoadg iobyxmoadgVar = null;
        p7.nufgyqmvbu nufgyqmvbuVarGtknphoqwx = null;
        p7.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = null;
        boolean zDraadjrbmk = false;
        while (ppxfxbqfkfVar.btonecajqb()) {
            String strRgvfuqvkyq = ppxfxbqfkfVar.rgvfuqvkyq();
            strRgvfuqvkyq.hashCode();
            switch (strRgvfuqvkyq) {
                case "o":
                    wkgbmnqykcVarNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case "pt":
                    nufgyqmvbuVarGtknphoqwx = wkgbmnqykc.gtknphoqwx(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case "inv":
                    zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                    break;
                case "mode":
                    String strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                    strVdvldrhtss.hashCode();
                    switch (strVdvldrhtss) {
                        case "a":
                            iobyxmoadgVar = q7.dxjokdxxww.iobyxmoadg.MASK_MODE_ADD;
                            break;
                        case "i":
                            btonecajqbVar.iobyxmoadg("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            iobyxmoadgVar = q7.dxjokdxxww.iobyxmoadg.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            iobyxmoadgVar = q7.dxjokdxxww.iobyxmoadg.MASK_MODE_NONE;
                            break;
                        case "s":
                            iobyxmoadgVar = q7.dxjokdxxww.iobyxmoadg.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            v7.wkgbmnqykc.ppxfxbqfkf("Unknown mask mode " + strRgvfuqvkyq + ". Defaulting to Add.");
                            iobyxmoadgVar = q7.dxjokdxxww.iobyxmoadg.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new q7.dxjokdxxww(iobyxmoadgVar, nufgyqmvbuVarGtknphoqwx, wkgbmnqykcVarNufgyqmvbu, zDraadjrbmk);
    }
}
