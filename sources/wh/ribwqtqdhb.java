package wh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.jztzpxfvev;

/* JADX INFO: loaded from: classes3.dex */
public final class ribwqtqdhb extends vipkmwdibw {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final zh.lqeggnwhkg f119845agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final uh.ppxfxbqfkf f119846ojitshcjhn;

    public static final class iobyxmoadg extends jj.zoijcleaow.AbstractC1108zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ jh.eablkybsjg f119847iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f119848ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Set f119849zoijcleaow;

        iobyxmoadg(jh.eablkybsjg eablkybsjgVar, Set set, tg.draadjrbmk draadjrbmkVar) {
            this.f119847iobyxmoadg = eablkybsjgVar;
            this.f119849zoijcleaow = set;
            this.f119848ppxfxbqfkf = draadjrbmkVar;
        }

        public void eablkybsjg() {
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        public /* bridge */ /* synthetic */ Object iobyxmoadg() {
            eablkybsjg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean ppxfxbqfkf(jh.eablkybsjg current) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(current, "current");
            if (current == this.f119847iobyxmoadg) {
                return true;
            }
            si.gtknphoqwx gtknphoqwxVarUwvvkdfqfp = current.uwvvkdfqfp();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarUwvvkdfqfp, "getStaticScope(...)");
            if (!(gtknphoqwxVarUwvvkdfqfp instanceof vipkmwdibw)) {
                return true;
            }
            this.f119849zoijcleaow.addAll((Collection) this.f119848ppxfxbqfkf.invoke(gtknphoqwxVarUwvvkdfqfp));
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ribwqtqdhb(vh.gtknphoqwx c13, zh.lqeggnwhkg jClass, uh.ppxfxbqfkf ownerDescriptor) {
        super(c13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ownerDescriptor, "ownerDescriptor");
        this.f119845agtfadlqog = jClass;
        this.f119846ojitshcjhn = ownerDescriptor;
    }

    private final Set bfopjjpdmp(jh.eablkybsjg eablkybsjgVar, Set set, tg.draadjrbmk draadjrbmkVar) {
        jj.zoijcleaow.zoijcleaow(hg.jyumaefscl.eablkybsjg(eablkybsjgVar), crxdokpmqz.f119768iobyxmoadg, new iobyxmoadg(eablkybsjgVar, set, draadjrbmkVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.eablkybsjg iyctptxqzt(zi.kegysxyocb kegysxyocbVar) {
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarYlkuphrtab instanceof jh.eablkybsjg) {
            return (jh.eablkybsjg) nufgyqmvbuVarYlkuphrtab;
        }
        return null;
    }

    private final jh.crxdokpmqz lrnfpwlwnk(jh.crxdokpmqz crxdokpmqzVar) {
        if (crxdokpmqzVar.getKind().iobyxmoadg()) {
            return crxdokpmqzVar;
        }
        Collection collectionEablkybsjg = crxdokpmqzVar.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
        Collection<jh.crxdokpmqz> collection = collectionEablkybsjg;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
        for (jh.crxdokpmqz crxdokpmqzVar2 : collection) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(crxdokpmqzVar2);
            arrayList.add(lrnfpwlwnk(crxdokpmqzVar2));
        }
        return (jh.crxdokpmqz) hg.jyumaefscl.yzdjzghtvl(hg.jyumaefscl.metgxyhuhe(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection oipsdeybqn(si.gtknphoqwx it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable opjhrmiecq(jh.eablkybsjg eablkybsjgVar) {
        Collection collectionZoijcleaow = eablkybsjgVar.btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        return lj.wflxmlrfwp.jyumaefscl(lj.wflxmlrfwp.stevsuqkhv(hg.jyumaefscl.ikoacuggdj(collectionZoijcleaow), jlmebxxoox.f119789zdlpuopuiu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sflfametgt(zh.vdvldrhtss it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.wkgbmnqykc();
    }

    private final Set zeieaojujs(ii.gxszxtbevo gxszxtbevoVar, jh.eablkybsjg eablkybsjgVar) {
        ribwqtqdhb ribwqtqdhbVarZoijcleaow = uh.nufgyqmvbu.zoijcleaow(eablkybsjgVar);
        return ribwqtqdhbVarZoijcleaow == null ? ikoacuggdj.eablkybsjg() : hg.jyumaefscl.r(ribwqtqdhbVarZoijcleaow.wkgbmnqykc(gxszxtbevoVar, rh.wkgbmnqykc.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection zfvoamnweg(ii.gxszxtbevo gxszxtbevoVar, si.gtknphoqwx it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.zoijcleaow(gxszxtbevoVar, rh.wkgbmnqykc.WHEN_GET_SUPER_MEMBERS);
    }

    @Override // wh.mbcevpiqjq
    protected Set cdpycssgdh(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        Set setQ = hg.jyumaefscl.q(((ppxfxbqfkf) cllcsxoeiz().invoke()).ppxfxbqfkf());
        bfopjjpdmp(kegysxyocb(), setQ, ulzqkzuiru.f119853zdlpuopuiu);
        if (this.f119845agtfadlqog.iwizpuwonk()) {
            setQ.add(gh.ojitshcjhn.f37245eablkybsjg);
        }
        return setQ;
    }

    @Override // wh.mbcevpiqjq
    protected Set cqumvgiudr(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        Set setQ = hg.jyumaefscl.q(((ppxfxbqfkf) cllcsxoeiz().invoke()).iobyxmoadg());
        ribwqtqdhb ribwqtqdhbVarZoijcleaow = uh.nufgyqmvbu.zoijcleaow(kegysxyocb());
        Set setIobyxmoadg = ribwqtqdhbVarZoijcleaow != null ? ribwqtqdhbVarZoijcleaow.iobyxmoadg() : null;
        if (setIobyxmoadg == null) {
            setIobyxmoadg = ikoacuggdj.eablkybsjg();
        }
        setQ.addAll(setIobyxmoadg);
        if (this.f119845agtfadlqog.iwizpuwonk()) {
            setQ.addAll(hg.jyumaefscl.rgvfuqvkyq(gh.ojitshcjhn.f37248gxszxtbevo, gh.ojitshcjhn.f37266wkgbmnqykc));
        }
        setQ.addAll(jpowsppfya().iobyxmoadg().iwizpuwonk().ppxfxbqfkf(kegysxyocb(), jpowsppfya()));
        return setQ;
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return null;
    }

    @Override // wh.mbcevpiqjq
    protected void esjtqupxsv(Collection result, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        jpowsppfya().iobyxmoadg().iwizpuwonk().nufgyqmvbu(kegysxyocb(), name, result, jpowsppfya());
    }

    @Override // wh.vipkmwdibw, wh.mbcevpiqjq
    protected void istkbnxepw(ii.gxszxtbevo name, Collection result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        Set setBfopjjpdmp = bfopjjpdmp(kegysxyocb(), new LinkedHashSet(), new sopmlzcsov(name));
        if (result.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setBfopjjpdmp) {
                jh.crxdokpmqz crxdokpmqzVarLrnfpwlwnk = lrnfpwlwnk((jh.crxdokpmqz) obj);
                Object arrayList = linkedHashMap.get(crxdokpmqzVarLrnfpwlwnk);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(crxdokpmqzVarLrnfpwlwnk, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionEablkybsjg = th.iobyxmoadg.eablkybsjg(name, (Collection) ((Map.Entry) it.next()).getValue(), result, kegysxyocb(), jpowsppfya().iobyxmoadg().ppxfxbqfkf(), jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "resolveOverridesForStaticMembers(...)");
                hg.jyumaefscl.istkbnxepw(arrayList2, collectionEablkybsjg);
            }
            result.addAll(arrayList2);
        } else {
            Collection collectionEablkybsjg2 = th.iobyxmoadg.eablkybsjg(name, setBfopjjpdmp, result, kegysxyocb(), jpowsppfya().iobyxmoadg().ppxfxbqfkf(), jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg2, "resolveOverridesForStaticMembers(...)");
            result.addAll(collectionEablkybsjg2);
        }
        if (this.f119845agtfadlqog.iwizpuwonk() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, gh.ojitshcjhn.f37245eablkybsjg)) {
            jj.iobyxmoadg.iobyxmoadg(result, li.nufgyqmvbu.gxszxtbevo(kegysxyocb()));
        }
    }

    @Override // wh.mbcevpiqjq
    protected Set jyumaefscl(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        return ikoacuggdj.eablkybsjg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public uh.ppxfxbqfkf kegysxyocb() {
        return this.f119846ojitshcjhn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public zoijcleaow lereixgezr() {
        return new zoijcleaow(this.f119845agtfadlqog, ntlheqmsrt.f119833zdlpuopuiu);
    }

    @Override // wh.mbcevpiqjq
    protected void zynmafqrjb(Collection result, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        Collection collectionEablkybsjg = th.iobyxmoadg.eablkybsjg(name, zeieaojujs(name, kegysxyocb()), result, kegysxyocb(), jpowsppfya().iobyxmoadg().ppxfxbqfkf(), jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionEablkybsjg);
        if (this.f119845agtfadlqog.iwizpuwonk()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, gh.ojitshcjhn.f37248gxszxtbevo)) {
                jztzpxfvev jztzpxfvevVarLqeggnwhkg = li.nufgyqmvbu.lqeggnwhkg(kegysxyocb());
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jztzpxfvevVarLqeggnwhkg, "createEnumValueOfMethod(...)");
                result.add(jztzpxfvevVarLqeggnwhkg);
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, gh.ojitshcjhn.f37266wkgbmnqykc)) {
                jztzpxfvev jztzpxfvevVarNufgyqmvbu = li.nufgyqmvbu.nufgyqmvbu(kegysxyocb());
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jztzpxfvevVarNufgyqmvbu, "createEnumValuesMethod(...)");
                result.add(jztzpxfvevVarNufgyqmvbu);
            }
        }
    }
}
