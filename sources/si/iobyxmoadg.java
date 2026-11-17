package si;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements gtknphoqwx {
    protected abstract gtknphoqwx dxjokdxxww();

    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return dxjokdxxww().eablkybsjg(name, location);
    }

    @Override // si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return dxjokdxxww().gxszxtbevo(kindFilter, nameFilter);
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        return dxjokdxxww().iobyxmoadg();
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        return dxjokdxxww().lqeggnwhkg();
    }

    public final gtknphoqwx nufgyqmvbu() {
        if (!(dxjokdxxww() instanceof iobyxmoadg)) {
            return dxjokdxxww();
        }
        gtknphoqwx gtknphoqwxVarDxjokdxxww = dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gtknphoqwxVarDxjokdxxww, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((iobyxmoadg) gtknphoqwxVarDxjokdxxww).nufgyqmvbu();
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        return dxjokdxxww().ppxfxbqfkf();
    }

    @Override // si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return dxjokdxxww().wkgbmnqykc(name, location);
    }

    @Override // si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return dxjokdxxww().zoijcleaow(name, location);
    }
}
