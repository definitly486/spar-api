package t7;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109953gxszxtbevo = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("ef");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109954lqeggnwhkg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "v");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private p7.zoijcleaow f109955eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private p7.iobyxmoadg f109956iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private p7.zoijcleaow f109957ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private p7.zoijcleaow f109958wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private p7.zoijcleaow f109959zoijcleaow;

    private void iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        ppxfxbqfkfVar.lqeggnwhkg();
        String strVdvldrhtss = "";
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109954lqeggnwhkg);
            if (iCqumvgiudr == 0) {
                strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
            } else if (iCqumvgiudr == 1) {
                strVdvldrhtss.hashCode();
                switch (strVdvldrhtss) {
                    case "Distance":
                        this.f109958wkgbmnqykc = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
                        break;
                    case "Opacity":
                        this.f109959zoijcleaow = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, false);
                        break;
                    case "Direction":
                        this.f109957ppxfxbqfkf = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, false);
                        break;
                    case "Shadow Color":
                        this.f109956iobyxmoadg = wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar);
                        break;
                    case "Softness":
                        this.f109955eablkybsjg = wkgbmnqykc.eablkybsjg(ppxfxbqfkfVar, btonecajqbVar);
                        break;
                    default:
                        ppxfxbqfkfVar.pmvmpeiblj();
                        break;
                }
            } else {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
    }

    btonecajqb zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        p7.zoijcleaow zoijcleaowVar;
        p7.zoijcleaow zoijcleaowVar2;
        p7.zoijcleaow zoijcleaowVar3;
        p7.zoijcleaow zoijcleaowVar4;
        while (ppxfxbqfkfVar.btonecajqb()) {
            if (ppxfxbqfkfVar.cqumvgiudr(f109953gxszxtbevo) != 0) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                ppxfxbqfkfVar.wkgbmnqykc();
                while (ppxfxbqfkfVar.btonecajqb()) {
                    iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
                }
                ppxfxbqfkfVar.nufgyqmvbu();
            }
        }
        p7.iobyxmoadg iobyxmoadgVar = this.f109956iobyxmoadg;
        if (iobyxmoadgVar == null || (zoijcleaowVar = this.f109959zoijcleaow) == null || (zoijcleaowVar2 = this.f109957ppxfxbqfkf) == null || (zoijcleaowVar3 = this.f109958wkgbmnqykc) == null || (zoijcleaowVar4 = this.f109955eablkybsjg) == null) {
            return null;
        }
        return new btonecajqb(iobyxmoadgVar, zoijcleaowVar, zoijcleaowVar2, zoijcleaowVar3, zoijcleaowVar4);
    }
}
