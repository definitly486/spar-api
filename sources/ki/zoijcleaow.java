package ki;

import java.util.ArrayList;
import jh.hkdspvbjdz;
import jh.yfnezrywwk;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f55668iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        @Override // ki.zoijcleaow
        public String iobyxmoadg(jh.nufgyqmvbu classifier, agtfadlqog renderer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classifier, "classifier");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(renderer, "renderer");
            if (classifier instanceof yfnezrywwk) {
                ii.gxszxtbevo name = ((yfnezrywwk) classifier).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                return renderer.mbcevpiqjq(name, false);
            }
            ii.wkgbmnqykc wkgbmnqykcVarWflxmlrfwp = li.dxjokdxxww.wflxmlrfwp(classifier);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarWflxmlrfwp, "getFqName(...)");
            return renderer.tzroggbefp(wkgbmnqykcVarWflxmlrfwp);
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f55669iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        private final String ppxfxbqfkf(jh.wflxmlrfwp wflxmlrfwpVar) {
            if (wflxmlrfwpVar instanceof jh.eablkybsjg) {
                return zoijcleaow((jh.nufgyqmvbu) wflxmlrfwpVar);
            }
            if (!(wflxmlrfwpVar instanceof hkdspvbjdz)) {
                return null;
            }
            ii.wkgbmnqykc wkgbmnqykcVarBtonecajqb = ((hkdspvbjdz) wflxmlrfwpVar).gxszxtbevo().btonecajqb();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarBtonecajqb, "toUnsafe(...)");
            return lmojexxdyd.iobyxmoadg(wkgbmnqykcVarBtonecajqb);
        }

        private final String zoijcleaow(jh.nufgyqmvbu nufgyqmvbuVar) {
            ii.gxszxtbevo name = nufgyqmvbuVar.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            String strZoijcleaow = lmojexxdyd.zoijcleaow(name);
            if (nufgyqmvbuVar instanceof yfnezrywwk) {
                return strZoijcleaow;
            }
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = nufgyqmvbuVar.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
            String strPpxfxbqfkf = ppxfxbqfkf(wflxmlrfwpVarZoijcleaow);
            if (strPpxfxbqfkf == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strPpxfxbqfkf, "")) {
                return strZoijcleaow;
            }
            return strPpxfxbqfkf + '.' + strZoijcleaow;
        }

        @Override // ki.zoijcleaow
        public String iobyxmoadg(jh.nufgyqmvbu classifier, agtfadlqog renderer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classifier, "classifier");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(renderer, "renderer");
            return zoijcleaow(classifier);
        }
    }

    /* JADX INFO: renamed from: ki.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1184zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1184zoijcleaow f55670iobyxmoadg = new C1184zoijcleaow();

        private C1184zoijcleaow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jh.nufgyqmvbu] */
        /* JADX WARN: Type inference failed for: r2v1, types: [jh.wflxmlrfwp, jh.ylkuphrtab] */
        /* JADX WARN: Type inference failed for: r2v2, types: [jh.wflxmlrfwp] */
        @Override // ki.zoijcleaow
        public String iobyxmoadg(jh.nufgyqmvbu classifier, agtfadlqog renderer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classifier, "classifier");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(renderer, "renderer");
            if (classifier instanceof yfnezrywwk) {
                ii.gxszxtbevo name = ((yfnezrywwk) classifier).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                return renderer.mbcevpiqjq(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.zoijcleaow();
            } while (classifier instanceof jh.eablkybsjg);
            return lmojexxdyd.ppxfxbqfkf(hg.jyumaefscl.ntlheqmsrt(arrayList));
        }
    }

    String iobyxmoadg(jh.nufgyqmvbu nufgyqmvbuVar, agtfadlqog agtfadlqogVar);
}
