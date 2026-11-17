package si;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jh.uwvvkdfqfp;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends draadjrbmk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f106723zoijcleaow;

    public lqeggnwhkg(gtknphoqwx workerScope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerScope, "workerScope");
        this.f106723zoijcleaow = workerScope;
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = this.f106723zoijcleaow.eablkybsjg(name, location);
        if (nufgyqmvbuVarEablkybsjg == null) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVar = nufgyqmvbuVarEablkybsjg instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarEablkybsjg : null;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        if (nufgyqmvbuVarEablkybsjg instanceof uwvvkdfqfp) {
            return (uwvvkdfqfp) nufgyqmvbuVarEablkybsjg;
        }
        return null;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set iobyxmoadg() {
        return this.f106723zoijcleaow.iobyxmoadg();
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set lqeggnwhkg() {
        return this.f106723zoijcleaow.lqeggnwhkg();
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public List gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        wkgbmnqykc wkgbmnqykcVarAgtfadlqog = kindFilter.agtfadlqog(wkgbmnqykc.f106753ppxfxbqfkf.ppxfxbqfkf());
        if (wkgbmnqykcVarAgtfadlqog == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Collection collectionGxszxtbevo = this.f106723zoijcleaow.gxszxtbevo(wkgbmnqykcVarAgtfadlqog, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionGxszxtbevo) {
            if (obj instanceof jh.dxjokdxxww) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set ppxfxbqfkf() {
        return this.f106723zoijcleaow.ppxfxbqfkf();
    }

    public String toString() {
        return "Classes from " + this.f106723zoijcleaow;
    }
}
