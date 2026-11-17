package wh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd extends vipkmwdibw {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final zh.yggfygwlhe f119803agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final cdpycssgdh f119804ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final yi.btonecajqb f119805rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final yi.nufgyqmvbu f119806vdvldrhtss;

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ii.gxszxtbevo f119807iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zh.lqeggnwhkg f119808zoijcleaow;

        public iobyxmoadg(ii.gxszxtbevo name, zh.lqeggnwhkg lqeggnwhkgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            this.f119807iobyxmoadg = name;
            this.f119808zoijcleaow = lqeggnwhkgVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f119807iobyxmoadg, ((iobyxmoadg) obj).f119807iobyxmoadg);
        }

        public int hashCode() {
            return this.f119807iobyxmoadg.hashCode();
        }

        public final zh.lqeggnwhkg iobyxmoadg() {
            return this.f119808zoijcleaow;
        }

        public final ii.gxszxtbevo zoijcleaow() {
            return this.f119807iobyxmoadg;
        }
    }

    private static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final jh.eablkybsjg f119809iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(jh.eablkybsjg descriptor) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
                this.f119809iobyxmoadg = descriptor;
            }

            public final jh.eablkybsjg iobyxmoadg() {
                return this.f119809iobyxmoadg;
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final ppxfxbqfkf f119810iobyxmoadg = new ppxfxbqfkf();

            private ppxfxbqfkf() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: wh.lmojexxdyd$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2996zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2996zoijcleaow f119811iobyxmoadg = new C2996zoijcleaow();

            private C2996zoijcleaow() {
                super(null);
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmojexxdyd(vh.gtknphoqwx c13, zh.yggfygwlhe jPackage, cdpycssgdh ownerDescriptor) {
        super(c13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jPackage, "jPackage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ownerDescriptor, "ownerDescriptor");
        this.f119803agtfadlqog = jPackage;
        this.f119804ojitshcjhn = ownerDescriptor;
        this.f119805rgvfuqvkyq = c13.eablkybsjg().iobyxmoadg(new yadqdtsiqt(c13, this));
        this.f119806vdvldrhtss = c13.eablkybsjg().eablkybsjg(new iozdgvuglv(this, c13));
    }

    private final zoijcleaow bfopjjpdmp(bi.cqumvgiudr cqumvgiudrVar) {
        if (cqumvgiudrVar == null) {
            return zoijcleaow.C2996zoijcleaow.f119811iobyxmoadg;
        }
        if (cqumvgiudrVar.gxszxtbevo().ppxfxbqfkf() != ci.iobyxmoadg.EnumC0363iobyxmoadg.CLASS) {
            return zoijcleaow.ppxfxbqfkf.f119810iobyxmoadg;
        }
        jh.eablkybsjg eablkybsjgVarAgtfadlqog = jpowsppfya().iobyxmoadg().zoijcleaow().agtfadlqog(cqumvgiudrVar);
        return eablkybsjgVarAgtfadlqog != null ? new zoijcleaow.iobyxmoadg(eablkybsjgVarAgtfadlqog) : zoijcleaow.C2996zoijcleaow.f119811iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.eablkybsjg czzsidtyhn(lmojexxdyd lmojexxdydVar, vh.gtknphoqwx gtknphoqwxVar, iobyxmoadg request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        ii.zoijcleaow zoijcleaowVar = new ii.zoijcleaow(lmojexxdydVar.kegysxyocb().gxszxtbevo(), request.zoijcleaow());
        bi.jyumaefscl.iobyxmoadg iobyxmoadgVarZoijcleaow = request.iobyxmoadg() != null ? gtknphoqwxVar.iobyxmoadg().btonecajqb().zoijcleaow(request.iobyxmoadg(), lmojexxdydVar.sflfametgt()) : gtknphoqwxVar.iobyxmoadg().btonecajqb().iobyxmoadg(zoijcleaowVar, lmojexxdydVar.sflfametgt());
        bi.cqumvgiudr cqumvgiudrVarIobyxmoadg = iobyxmoadgVarZoijcleaow != null ? iobyxmoadgVarZoijcleaow.iobyxmoadg() : null;
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = cqumvgiudrVarIobyxmoadg != null ? cqumvgiudrVarIobyxmoadg.ppxfxbqfkf() : null;
        if (zoijcleaowVarPpxfxbqfkf != null && (zoijcleaowVarPpxfxbqfkf.btonecajqb() || zoijcleaowVarPpxfxbqfkf.dxjokdxxww())) {
            return null;
        }
        zoijcleaow zoijcleaowVarBfopjjpdmp = lmojexxdydVar.bfopjjpdmp(cqumvgiudrVarIobyxmoadg);
        if (zoijcleaowVarBfopjjpdmp instanceof zoijcleaow.iobyxmoadg) {
            return ((zoijcleaow.iobyxmoadg) zoijcleaowVarBfopjjpdmp).iobyxmoadg();
        }
        if (zoijcleaowVarBfopjjpdmp instanceof zoijcleaow.ppxfxbqfkf) {
            return null;
        }
        if (!(zoijcleaowVarBfopjjpdmp instanceof zoijcleaow.C2996zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        zh.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = request.iobyxmoadg();
        if (lqeggnwhkgVarIobyxmoadg == null) {
            lqeggnwhkgVarIobyxmoadg = gtknphoqwxVar.iobyxmoadg().wkgbmnqykc().ppxfxbqfkf(new sh.yggfygwlhe.iobyxmoadg(zoijcleaowVar, null, null, 4, null));
        }
        zh.lqeggnwhkg lqeggnwhkgVar = lqeggnwhkgVarIobyxmoadg;
        if ((lqeggnwhkgVar != null ? lqeggnwhkgVar.jpowsppfya() : null) != zh.cdpycssgdh.BINARY) {
            ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = lqeggnwhkgVar != null ? lqeggnwhkgVar.gxszxtbevo() : null;
            if (ppxfxbqfkfVarGxszxtbevo == null || ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarGxszxtbevo.eablkybsjg(), lmojexxdydVar.kegysxyocb().gxszxtbevo())) {
                return null;
            }
            agtfadlqog agtfadlqogVar = new agtfadlqog(gtknphoqwxVar, lmojexxdydVar.kegysxyocb(), lqeggnwhkgVar, null, 8, null);
            gtknphoqwxVar.iobyxmoadg().eablkybsjg().iobyxmoadg(agtfadlqogVar);
            return agtfadlqogVar;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + lqeggnwhkgVar + "\nClassId: " + zoijcleaowVar + "\nfindKotlinClass(JavaClass) = " + bi.iwizpuwonk.zoijcleaow(gtknphoqwxVar.iobyxmoadg().btonecajqb(), lqeggnwhkgVar, lmojexxdydVar.sflfametgt()) + "\nfindKotlinClass(ClassId) = " + bi.iwizpuwonk.iobyxmoadg(gtknphoqwxVar.iobyxmoadg().btonecajqb(), zoijcleaowVar, lmojexxdydVar.sflfametgt()) + '\n');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set oipsdeybqn(vh.gtknphoqwx gtknphoqwxVar, lmojexxdyd lmojexxdydVar) {
        return gtknphoqwxVar.iobyxmoadg().wkgbmnqykc().iobyxmoadg(lmojexxdydVar.kegysxyocb().gxszxtbevo());
    }

    private final hi.eablkybsjg sflfametgt() {
        return jj.ppxfxbqfkf.iobyxmoadg(jpowsppfya().iobyxmoadg().zoijcleaow().gxszxtbevo().lqeggnwhkg());
    }

    private final jh.eablkybsjg uwvvkdfqfp(ii.gxszxtbevo gxszxtbevoVar, zh.lqeggnwhkg lqeggnwhkgVar) {
        if (!ii.nufgyqmvbu.f44467iobyxmoadg.iobyxmoadg(gxszxtbevoVar)) {
            return null;
        }
        Set set = (Set) this.f119805rgvfuqvkyq.invoke();
        if (lqeggnwhkgVar != null || set == null || set.contains(gxszxtbevoVar.zoijcleaow())) {
            return (jh.eablkybsjg) this.f119806vdvldrhtss.invoke(new iobyxmoadg(gxszxtbevoVar, lqeggnwhkgVar));
        }
        return null;
    }

    @Override // wh.mbcevpiqjq
    protected Set cdpycssgdh(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        return ikoacuggdj.eablkybsjg();
    }

    @Override // wh.mbcevpiqjq
    protected Set cqumvgiudr(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        return ikoacuggdj.eablkybsjg();
    }

    @Override // wh.mbcevpiqjq, si.draadjrbmk, si.agtfadlqog
    public Collection gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        si.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = si.wkgbmnqykc.f106753ppxfxbqfkf;
        if (!kindFilter.iobyxmoadg(iobyxmoadgVar.eablkybsjg() | iobyxmoadgVar.ppxfxbqfkf())) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Iterable iterable = (Iterable) hcddaimhww().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            jh.wflxmlrfwp wflxmlrfwpVar = (jh.wflxmlrfwp) obj;
            if (wflxmlrfwpVar instanceof jh.eablkybsjg) {
                ii.gxszxtbevo name = ((jh.eablkybsjg) wflxmlrfwpVar).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // wh.mbcevpiqjq
    protected Set jyumaefscl(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        if (!kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.eablkybsjg())) {
            return ikoacuggdj.eablkybsjg();
        }
        Set set = (Set) this.f119805rgvfuqvkyq.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(ii.gxszxtbevo.gxszxtbevo((String) it.next()));
            }
            return hashSet;
        }
        zh.yggfygwlhe yggfygwlheVar = this.f119803agtfadlqog;
        if (draadjrbmkVar == null) {
            draadjrbmkVar = jj.btonecajqb.gtknphoqwx();
        }
        Collection<zh.lqeggnwhkg> collectionWwaezpbzkn = yggfygwlheVar.wwaezpbzkn(draadjrbmkVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zh.lqeggnwhkg lqeggnwhkgVar : collectionWwaezpbzkn) {
            ii.gxszxtbevo name = lqeggnwhkgVar.jpowsppfya() == zh.cdpycssgdh.SOURCE ? null : lqeggnwhkgVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // wh.mbcevpiqjq
    protected ppxfxbqfkf lereixgezr() {
        return ppxfxbqfkf.iobyxmoadg.f119842iobyxmoadg;
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public jh.eablkybsjg eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return uwvvkdfqfp(name, null);
    }

    public final jh.eablkybsjg yfnezrywwk(zh.lqeggnwhkg javaClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaClass, "javaClass");
        return uwvvkdfqfp(javaClass.getName(), javaClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public cdpycssgdh kegysxyocb() {
        return this.f119804ojitshcjhn;
    }

    @Override // wh.mbcevpiqjq, si.draadjrbmk, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // wh.mbcevpiqjq
    protected void zynmafqrjb(Collection result, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
    }
}
