package zx;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements p00.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eg.iobyxmoadg f131456zoijcleaow;

    public eablkybsjg(eg.iobyxmoadg version) {
        zdlpuopuiu.btonecajqb(version, "version");
        this.f131456zoijcleaow = version;
    }

    public long eablkybsjg() {
        return this.f131456zoijcleaow.eablkybsjg();
    }

    @Override // p00.iobyxmoadg
    public boolean iobyxmoadg(p00.iobyxmoadg lessVersion) {
        zdlpuopuiu.btonecajqb(lessVersion, "lessVersion");
        return this.f131456zoijcleaow.lqeggnwhkg(((eablkybsjg) lessVersion).f131456zoijcleaow);
    }

    public long ppxfxbqfkf() {
        return this.f131456zoijcleaow.ppxfxbqfkf();
    }

    public String toString() {
        return "Version: " + ppxfxbqfkf() + "." + wkgbmnqykc() + "." + eablkybsjg();
    }

    public long wkgbmnqykc() {
        return this.f131456zoijcleaow.wkgbmnqykc();
    }

    @Override // p00.iobyxmoadg
    public boolean zoijcleaow(p00.iobyxmoadg lessVersion) {
        zdlpuopuiu.btonecajqb(lessVersion, "lessVersion");
        eg.iobyxmoadg iobyxmoadgVar = ((eablkybsjg) lessVersion).f131456zoijcleaow;
        if (this.f131456zoijcleaow.gxszxtbevo(iobyxmoadgVar)) {
            return true;
        }
        return this.f131456zoijcleaow.lqeggnwhkg(iobyxmoadgVar);
    }
}
