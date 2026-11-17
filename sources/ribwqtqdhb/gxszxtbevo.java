package ribwqtqdhb;

import vipkmwdibw.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a.eablkybsjg f82727iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wwaezpbzkn f82728ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f82729wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f82730zoijcleaow;

    public gxszxtbevo(a.eablkybsjg eablkybsjgVar, tg.draadjrbmk draadjrbmkVar, wwaezpbzkn wwaezpbzknVar, boolean z13) {
        this.f82727iobyxmoadg = eablkybsjgVar;
        this.f82730zoijcleaow = draadjrbmkVar;
        this.f82728ppxfxbqfkf = wwaezpbzknVar;
        this.f82729wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82727iobyxmoadg, gxszxtbevoVar.f82727iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82730zoijcleaow, gxszxtbevoVar.f82730zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82728ppxfxbqfkf, gxszxtbevoVar.f82728ppxfxbqfkf) && this.f82729wkgbmnqykc == gxszxtbevoVar.f82729wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f82727iobyxmoadg.hashCode() * 31) + this.f82730zoijcleaow.hashCode()) * 31) + this.f82728ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f82729wkgbmnqykc);
    }

    public final a.eablkybsjg iobyxmoadg() {
        return this.f82727iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f82729wkgbmnqykc;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f82727iobyxmoadg + ", size=" + this.f82730zoijcleaow + ", animationSpec=" + this.f82728ppxfxbqfkf + ", clip=" + this.f82729wkgbmnqykc + ')';
    }

    public final tg.draadjrbmk wkgbmnqykc() {
        return this.f82730zoijcleaow;
    }

    public final wwaezpbzkn zoijcleaow() {
        return this.f82728ppxfxbqfkf;
    }
}
