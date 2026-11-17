package jh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public final class jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yi.agtfadlqog f51314iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.lqeggnwhkg f51315ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.lqeggnwhkg f51316wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lmojexxdyd f51317zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ii.zoijcleaow f51318iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f51319zoijcleaow;

        public iobyxmoadg(ii.zoijcleaow classId, List typeParametersCount) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParametersCount, "typeParametersCount");
            this.f51318iobyxmoadg = classId;
            this.f51319zoijcleaow = typeParametersCount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51318iobyxmoadg, iobyxmoadgVar.f51318iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51319zoijcleaow, iobyxmoadgVar.f51319zoijcleaow);
        }

        public int hashCode() {
            return (this.f51318iobyxmoadg.hashCode() * 31) + this.f51319zoijcleaow.hashCode();
        }

        public final ii.zoijcleaow iobyxmoadg() {
            return this.f51318iobyxmoadg;
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f51318iobyxmoadg + ", typeParametersCount=" + this.f51319zoijcleaow + ')';
        }

        public final List zoijcleaow() {
            return this.f51319zoijcleaow;
        }
    }

    public static final class zoijcleaow extends mh.btonecajqb {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final zi.yggfygwlhe f51320cdpycssgdh;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private final List f51321istkbnxepw;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final boolean f51322zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(yi.agtfadlqog storageManager, wflxmlrfwp container, ii.gxszxtbevo name, boolean z13, int i13) {
            super(storageManager, container, name, xrmfcynszj.f51348iobyxmoadg, false);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            this.f51322zynmafqrjb = z13;
            zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i13);
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(btonecajqbVarJyumaefscl, 10));
            Iterator it = btonecajqbVarJyumaefscl.iterator();
            while (it.hasNext()) {
                int iIobyxmoadg = ((hg.stevsuqkhv) it).iobyxmoadg();
                kh.nufgyqmvbu nufgyqmvbuVarZoijcleaow = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT;
                StringBuilder sb3 = new StringBuilder();
                sb3.append('T');
                sb3.append(iIobyxmoadg);
                arrayList.add(mh.mbcevpiqjq.fmlbqenlif(this, nufgyqmvbuVarZoijcleaow, false, mhtqkkgtqmVar, ii.gxszxtbevo.gxszxtbevo(sb3.toString()), iIobyxmoadg, storageManager));
            }
            this.f51321istkbnxepw = arrayList;
            this.f51320cdpycssgdh = new zi.yggfygwlhe(this, oipsdeybqn.lqeggnwhkg(this), hg.ikoacuggdj.wkgbmnqykc(pi.eablkybsjg.kcexrzcfyt(this).wflxmlrfwp().dxjokdxxww()), storageManager);
        }

        @Override // jh.eablkybsjg
        /* JADX INFO: renamed from: ageimvtcrz, reason: merged with bridge method [inline-methods] */
        public si.gtknphoqwx.zoijcleaow uwvvkdfqfp() {
            return si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        }

        @Override // jh.eablkybsjg
        public wkgbmnqykc cdpycssgdh() {
            return null;
        }

        @Override // jh.istkbnxepw
        public boolean czzsidtyhn() {
            return false;
        }

        @Override // jh.eablkybsjg
        public Collection esjtqupxsv() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // jh.nufgyqmvbu
        /* JADX INFO: renamed from: fyldjkxazc, reason: merged with bridge method [inline-methods] */
        public zi.yggfygwlhe btonecajqb() {
            return this.f51320cdpycssgdh;
        }

        @Override // kh.iobyxmoadg
        public kh.nufgyqmvbu getAnnotations() {
            return kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        }

        @Override // jh.eablkybsjg
        public gxszxtbevo getKind() {
            return gxszxtbevo.CLASS;
        }

        @Override // jh.eablkybsjg, jh.istkbnxepw
        public yggfygwlhe getVisibility() {
            yggfygwlhe PUBLIC = zdlpuopuiu.f51354eablkybsjg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // jh.eablkybsjg
        public Collection gtknphoqwx() {
            return hg.ikoacuggdj.eablkybsjg();
        }

        @Override // jh.eablkybsjg
        public boolean hszhottldk() {
            return false;
        }

        @Override // jh.eablkybsjg
        public boolean ikoacuggdj() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // mh.lereixgezr
        /* JADX INFO: renamed from: ipoelvxyzq, reason: merged with bridge method [inline-methods] */
        public si.gtknphoqwx.zoijcleaow uawqvzlxes(aj.lqeggnwhkg kotlinTypeRefiner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
            return si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        }

        @Override // mh.btonecajqb, jh.istkbnxepw
        public boolean isExternal() {
            return false;
        }

        @Override // jh.eablkybsjg
        public boolean isInline() {
            return false;
        }

        @Override // jh.eablkybsjg
        public boolean jlmebxxoox() {
            return false;
        }

        @Override // jh.eablkybsjg
        public boolean kcexrzcfyt() {
            return false;
        }

        @Override // jh.dxjokdxxww
        public boolean lereixgezr() {
            return this.f51322zynmafqrjb;
        }

        @Override // jh.eablkybsjg, jh.dxjokdxxww
        public List rgvfuqvkyq() {
            return this.f51321istkbnxepw;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // jh.eablkybsjg
        public bfopjjpdmp tzroggbefp() {
            return null;
        }

        @Override // jh.istkbnxepw
        public boolean ulzqkzuiru() {
            return false;
        }

        @Override // jh.eablkybsjg, jh.istkbnxepw
        public cdpycssgdh vdvldrhtss() {
            return cdpycssgdh.FINAL;
        }

        @Override // jh.eablkybsjg
        public eablkybsjg yfnezrywwk() {
            return null;
        }
    }

    public jpowsppfya(yi.agtfadlqog storageManager, lmojexxdyd module) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        this.f51314iobyxmoadg = storageManager;
        this.f51317zoijcleaow = module;
        this.f51315ppxfxbqfkf = storageManager.dxjokdxxww(new pkzmftpjix(this));
        this.f51316wkgbmnqykc = storageManager.dxjokdxxww(new hcddaimhww(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hkdspvbjdz eablkybsjg(jpowsppfya jpowsppfyaVar, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return new mh.rgvfuqvkyq(jpowsppfyaVar.f51317zoijcleaow, fqName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg ppxfxbqfkf(jpowsppfya jpowsppfyaVar, iobyxmoadg iobyxmoadgVar) {
        wflxmlrfwp wflxmlrfwpVarWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<destruct>");
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        List listZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (zoijcleaowVarIobyxmoadg.dxjokdxxww()) {
            throw new UnsupportedOperationException("Unresolved local class: " + zoijcleaowVarIobyxmoadg);
        }
        ii.zoijcleaow zoijcleaowVarEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg();
        if (zoijcleaowVarEablkybsjg == null || (wflxmlrfwpVarWkgbmnqykc = jpowsppfyaVar.wkgbmnqykc(zoijcleaowVarEablkybsjg, hg.jyumaefscl.rlfsiqarku(listZoijcleaow, 1))) == null) {
            wflxmlrfwpVarWkgbmnqykc = (lqeggnwhkg) jpowsppfyaVar.f51315ppxfxbqfkf.invoke(zoijcleaowVarIobyxmoadg.gxszxtbevo());
        }
        wflxmlrfwp wflxmlrfwpVar = wflxmlrfwpVarWkgbmnqykc;
        boolean zBtonecajqb = zoijcleaowVarIobyxmoadg.btonecajqb();
        yi.agtfadlqog agtfadlqogVar = jpowsppfyaVar.f51314iobyxmoadg;
        ii.gxszxtbevo gxszxtbevoVarNufgyqmvbu = zoijcleaowVarIobyxmoadg.nufgyqmvbu();
        Integer num = (Integer) hg.jyumaefscl.weqkydbzbr(listZoijcleaow);
        return new zoijcleaow(agtfadlqogVar, wflxmlrfwpVar, gxszxtbevoVarNufgyqmvbu, zBtonecajqb, num != null ? num.intValue() : 0);
    }

    public final eablkybsjg wkgbmnqykc(ii.zoijcleaow classId, List typeParametersCount) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParametersCount, "typeParametersCount");
        return (eablkybsjg) this.f51316wkgbmnqykc.invoke(new iobyxmoadg(classId, typeParametersCount));
    }
}
