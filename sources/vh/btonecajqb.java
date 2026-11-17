package vh;

import hg.jyumaefscl;
import java.util.Collection;
import java.util.List;
import jh.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import wh.cdpycssgdh;
import zh.yggfygwlhe;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb implements tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f116742iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yi.iobyxmoadg f116743zoijcleaow;

    public btonecajqb(wkgbmnqykc components) {
        zdlpuopuiu.btonecajqb(components, "components");
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(components, rgvfuqvkyq.iobyxmoadg.f116761iobyxmoadg, gg.draadjrbmk.ppxfxbqfkf(null));
        this.f116742iobyxmoadg = gtknphoqwxVar;
        this.f116743zoijcleaow = gtknphoqwxVar.eablkybsjg().ppxfxbqfkf();
    }

    private final cdpycssgdh eablkybsjg(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        yggfygwlhe yggfygwlheVarIobyxmoadg = sh.zdlpuopuiu.iobyxmoadg(this.f116742iobyxmoadg.iobyxmoadg().wkgbmnqykc(), ppxfxbqfkfVar, false, 2, null);
        if (yggfygwlheVarIobyxmoadg == null) {
            return null;
        }
        return (cdpycssgdh) this.f116743zoijcleaow.iobyxmoadg(ppxfxbqfkfVar, new dxjokdxxww(this, yggfygwlheVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cdpycssgdh gxszxtbevo(btonecajqb btonecajqbVar, yggfygwlhe yggfygwlheVar) {
        return new cdpycssgdh(btonecajqbVar.f116742iobyxmoadg, yggfygwlheVar);
    }

    @Override // jh.tzroggbefp
    public boolean iobyxmoadg(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        return sh.zdlpuopuiu.iobyxmoadg(this.f116742iobyxmoadg.iobyxmoadg().wkgbmnqykc(), fqName, false, 2, null) == null;
    }

    @Override // jh.cllcsxoeiz
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public List oxmwwwfdhm(ii.ppxfxbqfkf fqName, tg.draadjrbmk nameFilter) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        cdpycssgdh cdpycssgdhVarEablkybsjg = eablkybsjg(fqName);
        List listJrbgnlbqoe = cdpycssgdhVarEablkybsjg != null ? cdpycssgdhVarEablkybsjg.jrbgnlbqoe() : null;
        return listJrbgnlbqoe == null ? jyumaefscl.wflxmlrfwp() : listJrbgnlbqoe;
    }

    @Override // jh.tzroggbefp
    public void ppxfxbqfkf(ii.ppxfxbqfkf fqName, Collection packageFragments) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        jj.iobyxmoadg.iobyxmoadg(packageFragments, eablkybsjg(fqName));
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f116742iobyxmoadg.iobyxmoadg().wflxmlrfwp();
    }

    @Override // jh.cllcsxoeiz
    public List zoijcleaow(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        return jyumaefscl.vdvldrhtss(eablkybsjg(fqName));
    }
}
