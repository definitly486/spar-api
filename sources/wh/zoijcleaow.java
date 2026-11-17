package wh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f119866eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f119867gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zh.lqeggnwhkg f119868iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f119869ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f119870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f119871zoijcleaow;

    public zoijcleaow(zh.lqeggnwhkg jClass, tg.draadjrbmk memberFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(memberFilter, "memberFilter");
        this.f119868iobyxmoadg = jClass;
        this.f119871zoijcleaow = memberFilter;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this);
        this.f119869ppxfxbqfkf = iobyxmoadgVar;
        lj.btonecajqb btonecajqbVarIstkbnxepw = lj.wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(jClass.zynmafqrjb()), iobyxmoadgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : btonecajqbVarIstkbnxepw) {
            ii.gxszxtbevo name = ((zh.oxmwwwfdhm) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f119870wkgbmnqykc = linkedHashMap;
        lj.btonecajqb btonecajqbVarIstkbnxepw2 = lj.wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(this.f119868iobyxmoadg.getFields()), this.f119871zoijcleaow);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : btonecajqbVarIstkbnxepw2) {
            linkedHashMap2.put(((zh.agtfadlqog) obj2).getName(), obj2);
        }
        this.f119866eablkybsjg = linkedHashMap2;
        Collection collectionNufgyqmvbu = this.f119868iobyxmoadg.nufgyqmvbu();
        tg.draadjrbmk draadjrbmkVar = this.f119871zoijcleaow;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionNufgyqmvbu) {
            if (((Boolean) draadjrbmkVar.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((zh.iwizpuwonk) obj4).getName(), obj4);
        }
        this.f119867gxszxtbevo = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(zoijcleaow zoijcleaowVar, zh.oxmwwwfdhm m13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(m13, "m");
        return ((Boolean) zoijcleaowVar.f119871zoijcleaow.invoke(m13)).booleanValue() && !zh.rgvfuqvkyq.ppxfxbqfkf(m13);
    }

    @Override // wh.ppxfxbqfkf
    public zh.iwizpuwonk eablkybsjg(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return (zh.iwizpuwonk) this.f119867gxszxtbevo.get(name);
    }

    @Override // wh.ppxfxbqfkf
    public Collection gxszxtbevo(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        List list = (List) this.f119870wkgbmnqykc.get(name);
        return list != null ? list : hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // wh.ppxfxbqfkf
    public Set iobyxmoadg() {
        lj.btonecajqb btonecajqbVarIstkbnxepw = lj.wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(this.f119868iobyxmoadg.zynmafqrjb()), this.f119869ppxfxbqfkf);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = btonecajqbVarIstkbnxepw.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((zh.oxmwwwfdhm) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // wh.ppxfxbqfkf
    public Set ppxfxbqfkf() {
        lj.btonecajqb btonecajqbVarIstkbnxepw = lj.wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(this.f119868iobyxmoadg.getFields()), this.f119871zoijcleaow);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = btonecajqbVarIstkbnxepw.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((zh.agtfadlqog) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // wh.ppxfxbqfkf
    public zh.agtfadlqog wkgbmnqykc(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return (zh.agtfadlqog) this.f119866eablkybsjg.get(name);
    }

    @Override // wh.ppxfxbqfkf
    public Set zoijcleaow() {
        return this.f119867gxszxtbevo.keySet();
    }
}
