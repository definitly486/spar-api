package bj;

import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public class lqeggnwhkg implements si.gtknphoqwx {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16516ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f16517zoijcleaow;

    public lqeggnwhkg(nufgyqmvbu kind, String... formatParams) {
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(formatParams, "formatParams");
        this.f16517zoijcleaow = kind;
        String strWkgbmnqykc = kind.wkgbmnqykc();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strWkgbmnqykc, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        this.f16516ppxfxbqfkf = str;
    }

    protected final String btonecajqb() {
        return this.f16516ppxfxbqfkf;
    }

    @Override // si.gtknphoqwx
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public Set zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        return draadjrbmk.f16409iobyxmoadg.btonecajqb();
    }

    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        String str = String.format(zoijcleaow.ERROR_CLASS.wkgbmnqykc(), Arrays.copyOf(new Object[]{name}, 1));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        ii.gxszxtbevo gxszxtbevoVarDxjokdxxww = ii.gxszxtbevo.dxjokdxxww(str);
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarDxjokdxxww, "special(...)");
        return new iobyxmoadg(gxszxtbevoVarDxjokdxxww);
    }

    @Override // si.agtfadlqog
    public Collection gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return jyumaefscl.wflxmlrfwp();
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        return ikoacuggdj.eablkybsjg();
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        return ikoacuggdj.eablkybsjg();
    }

    @Override // si.gtknphoqwx
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public Set wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(location, "location");
        return ikoacuggdj.wkgbmnqykc(new ppxfxbqfkf(draadjrbmk.f16409iobyxmoadg.nufgyqmvbu()));
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        return ikoacuggdj.eablkybsjg();
    }

    public String toString() {
        return "ErrorScope{" + this.f16516ppxfxbqfkf + '}';
    }
}
