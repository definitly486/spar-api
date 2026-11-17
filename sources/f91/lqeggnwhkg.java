package f91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f33337eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f33338iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f33339ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f33340wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f33341zoijcleaow;

    public lqeggnwhkg(int i13, String shopType, String shopAddress, String shopOpeningHours, int i14) {
        zdlpuopuiu.btonecajqb(shopType, "shopType");
        zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
        zdlpuopuiu.btonecajqb(shopOpeningHours, "shopOpeningHours");
        this.f33338iobyxmoadg = i13;
        this.f33341zoijcleaow = shopType;
        this.f33339ppxfxbqfkf = shopAddress;
        this.f33340wkgbmnqykc = shopOpeningHours;
        this.f33337eablkybsjg = i14;
    }

    public final String eablkybsjg() {
        return this.f33341zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f33338iobyxmoadg == lqeggnwhkgVar.f33338iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f33341zoijcleaow, lqeggnwhkgVar.f33341zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f33339ppxfxbqfkf, lqeggnwhkgVar.f33339ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f33340wkgbmnqykc, lqeggnwhkgVar.f33340wkgbmnqykc) && this.f33337eablkybsjg == lqeggnwhkgVar.f33337eablkybsjg;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f33338iobyxmoadg) * 31) + this.f33341zoijcleaow.hashCode()) * 31) + this.f33339ppxfxbqfkf.hashCode()) * 31) + this.f33340wkgbmnqykc.hashCode()) * 31) + Integer.hashCode(this.f33337eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f33337eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f33339ppxfxbqfkf;
    }

    public String toString() {
        return "Model(dialogTitle=" + this.f33338iobyxmoadg + ", shopType=" + this.f33341zoijcleaow + ", shopAddress=" + this.f33339ppxfxbqfkf + ", shopOpeningHours=" + this.f33340wkgbmnqykc + ", btnAcceptText=" + this.f33337eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f33340wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f33338iobyxmoadg;
    }
}
