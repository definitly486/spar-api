package qi;

import hg.jyumaefscl;
import jh.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import si.gtknphoqwx;
import vh.btonecajqb;
import zh.cdpycssgdh;
import zh.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f78872iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final th.btonecajqb f78873zoijcleaow;

    public ppxfxbqfkf(btonecajqb packageFragmentProvider, th.btonecajqb javaResolverCache) {
        zdlpuopuiu.btonecajqb(packageFragmentProvider, "packageFragmentProvider");
        zdlpuopuiu.btonecajqb(javaResolverCache, "javaResolverCache");
        this.f78872iobyxmoadg = packageFragmentProvider;
        this.f78873zoijcleaow = javaResolverCache;
    }

    public final btonecajqb iobyxmoadg() {
        return this.f78872iobyxmoadg;
    }

    public final jh.eablkybsjg zoijcleaow(lqeggnwhkg javaClass) {
        zdlpuopuiu.btonecajqb(javaClass, "javaClass");
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = javaClass.gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo != null && javaClass.jpowsppfya() == cdpycssgdh.SOURCE) {
            return this.f78873zoijcleaow.iobyxmoadg(ppxfxbqfkfVarGxszxtbevo);
        }
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = javaClass.eablkybsjg();
        if (lqeggnwhkgVarEablkybsjg != null) {
            jh.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow(lqeggnwhkgVarEablkybsjg);
            gtknphoqwx gtknphoqwxVarKegysxyocb = eablkybsjgVarZoijcleaow != null ? eablkybsjgVarZoijcleaow.kegysxyocb() : null;
            nufgyqmvbu nufgyqmvbuVarEablkybsjg = gtknphoqwxVarKegysxyocb != null ? gtknphoqwxVarKegysxyocb.eablkybsjg(javaClass.getName(), rh.wkgbmnqykc.FROM_JAVA_LOADER) : null;
            if (nufgyqmvbuVarEablkybsjg instanceof jh.eablkybsjg) {
                return (jh.eablkybsjg) nufgyqmvbuVarEablkybsjg;
            }
            return null;
        }
        if (ppxfxbqfkfVarGxszxtbevo == null) {
            return null;
        }
        btonecajqb btonecajqbVar = this.f78872iobyxmoadg;
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = ppxfxbqfkfVarGxszxtbevo.eablkybsjg();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        wh.cdpycssgdh cdpycssgdhVar = (wh.cdpycssgdh) jyumaefscl.weqkydbzbr(btonecajqbVar.zoijcleaow(ppxfxbqfkfVarEablkybsjg));
        if (cdpycssgdhVar != null) {
            return cdpycssgdhVar.grlcpdaxtj(javaClass);
        }
        return null;
    }
}
