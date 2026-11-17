package vi;

import hg.ikoacuggdj;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf implements jh.tzroggbefp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.nufgyqmvbu f116949eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yi.agtfadlqog f116950iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jh.lmojexxdyd f116951ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected agtfadlqog f116952wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pmvmpeiblj f116953zoijcleaow;

    public ppxfxbqfkf(yi.agtfadlqog storageManager, pmvmpeiblj finder, jh.lmojexxdyd moduleDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finder, "finder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleDescriptor, "moduleDescriptor");
        this.f116950iobyxmoadg = storageManager;
        this.f116953zoijcleaow = finder;
        this.f116951ppxfxbqfkf = moduleDescriptor;
        this.f116949eablkybsjg = storageManager.eablkybsjg(new zoijcleaow(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.hkdspvbjdz gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        oxmwwwfdhm oxmwwwfdhmVarEablkybsjg = ppxfxbqfkfVar.eablkybsjg(fqName);
        if (oxmwwwfdhmVarEablkybsjg == null) {
            return null;
        }
        oxmwwwfdhmVarEablkybsjg.fyldjkxazc(ppxfxbqfkfVar.lqeggnwhkg());
        return oxmwwwfdhmVarEablkybsjg;
    }

    protected final yi.agtfadlqog btonecajqb() {
        return this.f116950iobyxmoadg;
    }

    protected final jh.lmojexxdyd dxjokdxxww() {
        return this.f116951ppxfxbqfkf;
    }

    protected abstract oxmwwwfdhm eablkybsjg(ii.ppxfxbqfkf ppxfxbqfkfVar);

    protected final void gtknphoqwx(agtfadlqog agtfadlqogVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(agtfadlqogVar, "<set-?>");
        this.f116952wkgbmnqykc = agtfadlqogVar;
    }

    @Override // jh.tzroggbefp
    public boolean iobyxmoadg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return (this.f116949eablkybsjg.rgvfuqvkyq(fqName) ? (jh.hkdspvbjdz) this.f116949eablkybsjg.invoke(fqName) : eablkybsjg(fqName)) == null;
    }

    protected final agtfadlqog lqeggnwhkg() {
        agtfadlqog agtfadlqogVar = this.f116952wkgbmnqykc;
        if (agtfadlqogVar != null) {
            return agtfadlqogVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("components");
        return null;
    }

    protected final pmvmpeiblj nufgyqmvbu() {
        return this.f116953zoijcleaow;
    }

    @Override // jh.cllcsxoeiz
    public Collection oxmwwwfdhm(ii.ppxfxbqfkf fqName, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return ikoacuggdj.eablkybsjg();
    }

    @Override // jh.tzroggbefp
    public void ppxfxbqfkf(ii.ppxfxbqfkf fqName, Collection packageFragments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        jj.iobyxmoadg.iobyxmoadg(packageFragments, this.f116949eablkybsjg.invoke(fqName));
    }

    @Override // jh.cllcsxoeiz
    public List zoijcleaow(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return hg.jyumaefscl.vdvldrhtss(this.f116949eablkybsjg.invoke(fqName));
    }
}
