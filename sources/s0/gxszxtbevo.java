package s0;

import j0.cllcsxoeiz;
import j0.iozdgvuglv;
import j0.jpowsppfya;
import j0.n;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final iozdgvuglv iobyxmoadg(String str, n nVar, List list, List list2, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        return new eablkybsjg(str, nVar, list, list2, zoijcleaowVar, wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(n nVar) {
        jpowsppfya jpowsppfyaVarIobyxmoadg;
        cllcsxoeiz cllcsxoeizVarIwizpuwonk = nVar.iwizpuwonk();
        j0.ojitshcjhn ojitshcjhnVarWkgbmnqykc = (cllcsxoeizVarIwizpuwonk == null || (jpowsppfyaVarIobyxmoadg = cllcsxoeizVarIwizpuwonk.iobyxmoadg()) == null) ? null : j0.ojitshcjhn.wkgbmnqykc(jpowsppfyaVarIobyxmoadg.zoijcleaow());
        return !(ojitshcjhnVarWkgbmnqykc == null ? false : j0.ojitshcjhn.lqeggnwhkg(ojitshcjhnVarWkgbmnqykc.btonecajqb(), j0.ojitshcjhn.f50305zoijcleaow.ppxfxbqfkf()));
    }

    public static final int wkgbmnqykc(int i13, r0.eablkybsjg eablkybsjgVar) {
        Locale localeIobyxmoadg;
        v0.draadjrbmk.iobyxmoadg iobyxmoadgVar = v0.draadjrbmk.f114942zoijcleaow;
        if (v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.zoijcleaow())) {
            return 2;
        }
        if (!v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            if (v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.wkgbmnqykc())) {
                return 0;
            }
            if (v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.eablkybsjg())) {
                return 1;
            }
            if (!v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.iobyxmoadg()) && !v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.gxszxtbevo())) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if (eablkybsjgVar == null || (localeIobyxmoadg = eablkybsjgVar.ppxfxbqfkf(0).iobyxmoadg()) == null) {
                localeIobyxmoadg = Locale.getDefault();
            }
            int iIobyxmoadg = t1.ojitshcjhn.iobyxmoadg(localeIobyxmoadg);
            if (iIobyxmoadg == 0 || iIobyxmoadg != 1) {
                return 2;
            }
        }
        return 3;
    }
}
