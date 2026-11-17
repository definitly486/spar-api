package vw0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements hz0.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eg.iobyxmoadg f118137zoijcleaow;

    public wkgbmnqykc(eg.iobyxmoadg version) {
        zdlpuopuiu.btonecajqb(version, "version");
        this.f118137zoijcleaow = version;
    }

    public long eablkybsjg() {
        return this.f118137zoijcleaow.eablkybsjg();
    }

    @Override // hz0.iobyxmoadg
    public boolean iobyxmoadg(hz0.iobyxmoadg lessVersion) {
        zdlpuopuiu.btonecajqb(lessVersion, "lessVersion");
        return this.f118137zoijcleaow.lqeggnwhkg(((wkgbmnqykc) lessVersion).f118137zoijcleaow);
    }

    public long ppxfxbqfkf() {
        return this.f118137zoijcleaow.ppxfxbqfkf();
    }

    public String toString() {
        return "Version: " + ppxfxbqfkf() + "." + wkgbmnqykc() + "." + eablkybsjg();
    }

    public long wkgbmnqykc() {
        return this.f118137zoijcleaow.wkgbmnqykc();
    }

    @Override // hz0.iobyxmoadg
    public boolean zoijcleaow(hz0.iobyxmoadg lessVersion) {
        zdlpuopuiu.btonecajqb(lessVersion, "lessVersion");
        eg.iobyxmoadg iobyxmoadgVar = ((wkgbmnqykc) lessVersion).f118137zoijcleaow;
        if (this.f118137zoijcleaow.gxszxtbevo(iobyxmoadgVar)) {
            return true;
        }
        return this.f118137zoijcleaow.lqeggnwhkg(iobyxmoadgVar);
    }
}
