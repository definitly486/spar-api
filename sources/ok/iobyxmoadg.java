package ok;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.eablkybsjg;
import lk.iwizpuwonk;
import lk.oxmwwwfdhm;
import lk.pmvmpeiblj;
import lk.ppxfxbqfkf;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import mk.draadjrbmk;
import mk.wflxmlrfwp;
import qk.nufgyqmvbu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1588iobyxmoadg f72995iobyxmoadg = new C1588iobyxmoadg(null);

    /* JADX INFO: renamed from: ok.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1588iobyxmoadg {
        public /* synthetic */ C1588iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final boolean ppxfxbqfkf(String str) {
            return kcexrzcfyt.istkbnxepw("Content-Length", str, true) || kcexrzcfyt.istkbnxepw("Content-Encoding", str, true) || kcexrzcfyt.istkbnxepw("Content-Type", str, true);
        }

        private final boolean wkgbmnqykc(String str) {
            return (kcexrzcfyt.istkbnxepw("Connection", str, true) || kcexrzcfyt.istkbnxepw("Keep-Alive", str, true) || kcexrzcfyt.istkbnxepw("Proxy-Authenticate", str, true) || kcexrzcfyt.istkbnxepw("Proxy-Authorization", str, true) || kcexrzcfyt.istkbnxepw("TE", str, true) || kcexrzcfyt.istkbnxepw("Trailers", str, true) || kcexrzcfyt.istkbnxepw("Transfer-Encoding", str, true) || kcexrzcfyt.istkbnxepw("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final yggfygwlhe zoijcleaow(yggfygwlhe yggfygwlheVar, yggfygwlhe yggfygwlheVar2) {
            yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
            int size = yggfygwlheVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                String strWkgbmnqykc = yggfygwlheVar.wkgbmnqykc(i13);
                String strBtonecajqb = yggfygwlheVar.btonecajqb(i13);
                if ((!kcexrzcfyt.istkbnxepw("Warning", strWkgbmnqykc, true) || !kcexrzcfyt.stevsuqkhv(strBtonecajqb, "1", false, 2, null)) && (ppxfxbqfkf(strWkgbmnqykc) || !wkgbmnqykc(strWkgbmnqykc) || yggfygwlheVar2.iobyxmoadg(strWkgbmnqykc) == null)) {
                    iobyxmoadgVar.wkgbmnqykc(strWkgbmnqykc, strBtonecajqb);
                }
            }
            int size2 = yggfygwlheVar2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String strWkgbmnqykc2 = yggfygwlheVar2.wkgbmnqykc(i14);
                if (!ppxfxbqfkf(strWkgbmnqykc2) && wkgbmnqykc(strWkgbmnqykc2)) {
                    iobyxmoadgVar.wkgbmnqykc(strWkgbmnqykc2, yggfygwlheVar2.btonecajqb(i14));
                }
            }
            return iobyxmoadgVar.gxszxtbevo();
        }

        private C1588iobyxmoadg() {
        }
    }

    public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        oxmwwwfdhm oxmwwwfdhmVarAgtfadlqog;
        zdlpuopuiu.btonecajqb(chain, "chain");
        eablkybsjg eablkybsjgVarCall = chain.call();
        zoijcleaow zoijcleaowVarZoijcleaow = new zoijcleaow.C1589zoijcleaow(System.currentTimeMillis(), chain.dxjokdxxww(), null).zoijcleaow();
        zynmafqrjb zynmafqrjbVarZoijcleaow = zoijcleaowVarZoijcleaow.zoijcleaow();
        cdpycssgdh cdpycssgdhVarIobyxmoadg = zoijcleaowVarZoijcleaow.iobyxmoadg();
        nufgyqmvbu nufgyqmvbuVar = eablkybsjgVarCall instanceof nufgyqmvbu ? (nufgyqmvbu) eablkybsjgVarCall : null;
        if (nufgyqmvbuVar == null || (oxmwwwfdhmVarAgtfadlqog = nufgyqmvbuVar.agtfadlqog()) == null) {
            oxmwwwfdhmVarAgtfadlqog = oxmwwwfdhm.f63179zoijcleaow;
        }
        if (zynmafqrjbVarZoijcleaow == null && cdpycssgdhVarIobyxmoadg == null) {
            cdpycssgdh cdpycssgdhVarPpxfxbqfkf = new cdpycssgdh.iobyxmoadg().vdvldrhtss(chain.dxjokdxxww()).ojitshcjhn(pmvmpeiblj.HTTP_1_1).eablkybsjg(504).draadjrbmk("Unsatisfiable Request (only-if-cached)").oxmwwwfdhm(-1L).rgvfuqvkyq(System.currentTimeMillis()).ppxfxbqfkf();
            oxmwwwfdhmVarAgtfadlqog.lereixgezr(eablkybsjgVarCall, cdpycssgdhVarPpxfxbqfkf);
            return cdpycssgdhVarPpxfxbqfkf;
        }
        if (zynmafqrjbVarZoijcleaow == null) {
            zdlpuopuiu.lqeggnwhkg(cdpycssgdhVarIobyxmoadg);
            cdpycssgdh cdpycssgdhVarPpxfxbqfkf2 = cdpycssgdhVarIobyxmoadg.cqumvgiudr().wkgbmnqykc(draadjrbmk.yggfygwlhe(cdpycssgdhVarIobyxmoadg)).ppxfxbqfkf();
            oxmwwwfdhmVarAgtfadlqog.zoijcleaow(eablkybsjgVarCall, cdpycssgdhVarPpxfxbqfkf2);
            return cdpycssgdhVarPpxfxbqfkf2;
        }
        if (cdpycssgdhVarIobyxmoadg != null) {
            oxmwwwfdhmVarAgtfadlqog.iobyxmoadg(eablkybsjgVarCall, cdpycssgdhVarIobyxmoadg);
        }
        cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(zynmafqrjbVarZoijcleaow);
        if (cdpycssgdhVarIobyxmoadg != null) {
            if (cdpycssgdhVarZoijcleaow != null && cdpycssgdhVarZoijcleaow.btonecajqb() == 304) {
                cdpycssgdhVarIobyxmoadg.cqumvgiudr().btonecajqb(f72995iobyxmoadg.zoijcleaow(cdpycssgdhVarIobyxmoadg.kcexrzcfyt(), cdpycssgdhVarZoijcleaow.kcexrzcfyt())).oxmwwwfdhm(cdpycssgdhVarZoijcleaow.wwaezpbzkn()).rgvfuqvkyq(cdpycssgdhVarZoijcleaow.istkbnxepw()).wkgbmnqykc(draadjrbmk.yggfygwlhe(cdpycssgdhVarIobyxmoadg)).wflxmlrfwp(draadjrbmk.yggfygwlhe(cdpycssgdhVarZoijcleaow)).ppxfxbqfkf();
                cdpycssgdhVarZoijcleaow.wkgbmnqykc().close();
                zdlpuopuiu.lqeggnwhkg(null);
                throw null;
            }
            wflxmlrfwp.gxszxtbevo(cdpycssgdhVarIobyxmoadg.wkgbmnqykc());
        }
        zdlpuopuiu.lqeggnwhkg(cdpycssgdhVarZoijcleaow);
        return cdpycssgdhVarZoijcleaow.cqumvgiudr().wkgbmnqykc(cdpycssgdhVarIobyxmoadg != null ? draadjrbmk.yggfygwlhe(cdpycssgdhVarIobyxmoadg) : null).wflxmlrfwp(draadjrbmk.yggfygwlhe(cdpycssgdhVarZoijcleaow)).ppxfxbqfkf();
    }
}
