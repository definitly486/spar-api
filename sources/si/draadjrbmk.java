package si;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import jh.jztzpxfvev;

/* JADX INFO: loaded from: classes3.dex */
public abstract class draadjrbmk implements gtknphoqwx {
    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return null;
    }

    @Override // si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        Collection collectionGxszxtbevo = gxszxtbevo(wkgbmnqykc.f106746jyumaefscl, jj.btonecajqb.gtknphoqwx());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionGxszxtbevo) {
            if (obj instanceof jztzpxfvev) {
                ii.gxszxtbevo name = ((jztzpxfvev) obj).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        return null;
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        Collection collectionGxszxtbevo = gxszxtbevo(wkgbmnqykc.f106745iwizpuwonk, jj.btonecajqb.gtknphoqwx());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionGxszxtbevo) {
            if (obj instanceof jztzpxfvev) {
                ii.gxszxtbevo name = ((jztzpxfvev) obj).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return hg.jyumaefscl.wflxmlrfwp();
    }
}
