package mh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class wypolnanlu extends si.draadjrbmk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ii.ppxfxbqfkf f67178ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.lmojexxdyd f67179zoijcleaow;

    public wypolnanlu(jh.lmojexxdyd moduleDescriptor, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        this.f67179zoijcleaow = moduleDescriptor;
        this.f67178ppxfxbqfkf = fqName;
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    public Collection gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        if (!kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.gxszxtbevo())) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        if (this.f67178ppxfxbqfkf.wkgbmnqykc() && kindFilter.draadjrbmk().contains(si.ppxfxbqfkf.zoijcleaow.f106729iobyxmoadg)) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Collection collectionOxmwwwfdhm = this.f67179zoijcleaow.oxmwwwfdhm(this.f67178ppxfxbqfkf, nameFilter);
        ArrayList arrayList = new ArrayList(collectionOxmwwwfdhm.size());
        Iterator it = collectionOxmwwwfdhm.iterator();
        while (it.hasNext()) {
            ii.gxszxtbevo gxszxtbevoVarLqeggnwhkg = ((ii.ppxfxbqfkf) it.next()).lqeggnwhkg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, "shortName(...)");
            if (((Boolean) nameFilter.invoke(gxszxtbevoVarLqeggnwhkg)).booleanValue()) {
                jj.iobyxmoadg.iobyxmoadg(arrayList, nufgyqmvbu(gxszxtbevoVarLqeggnwhkg));
            }
        }
        return arrayList;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set lqeggnwhkg() {
        return ikoacuggdj.eablkybsjg();
    }

    protected final jh.mbcevpiqjq nufgyqmvbu(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (name.lqeggnwhkg()) {
            return null;
        }
        jh.lmojexxdyd lmojexxdydVar = this.f67179zoijcleaow;
        ii.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = this.f67178ppxfxbqfkf.ppxfxbqfkf(name);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "child(...)");
        jh.mbcevpiqjq mbcevpiqjqVarWwaezpbzkn = lmojexxdydVar.wwaezpbzkn(ppxfxbqfkfVarPpxfxbqfkf);
        if (mbcevpiqjqVarWwaezpbzkn.isEmpty()) {
            return null;
        }
        return mbcevpiqjqVarWwaezpbzkn;
    }

    public String toString() {
        return "subpackages of " + this.f67178ppxfxbqfkf + " from " + this.f67179zoijcleaow;
    }
}
