package bj;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends lqeggnwhkg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(nufgyqmvbu kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(formatParams, "formatParams");
    }

    @Override // bj.lqeggnwhkg, si.gtknphoqwx
    /* JADX INFO: renamed from: dxjokdxxww */
    public Set zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        throw new IllegalStateException(btonecajqb() + ", required name: " + name);
    }

    @Override // bj.lqeggnwhkg, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        throw new IllegalStateException(btonecajqb() + ", required name: " + name);
    }

    @Override // bj.lqeggnwhkg, si.agtfadlqog
    public Collection gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        throw new IllegalStateException(btonecajqb());
    }

    @Override // bj.lqeggnwhkg, si.gtknphoqwx
    public Set iobyxmoadg() {
        throw new IllegalStateException();
    }

    @Override // bj.lqeggnwhkg, si.gtknphoqwx
    public Set lqeggnwhkg() {
        throw new IllegalStateException();
    }

    @Override // bj.lqeggnwhkg, si.gtknphoqwx
    /* JADX INFO: renamed from: nufgyqmvbu */
    public Set wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        throw new IllegalStateException(btonecajqb() + ", required name: " + name);
    }

    @Override // bj.lqeggnwhkg, si.gtknphoqwx
    public Set ppxfxbqfkf() {
        throw new IllegalStateException();
    }

    @Override // bj.lqeggnwhkg
    public String toString() {
        return "ThrowingScope{" + btonecajqb() + '}';
    }
}
