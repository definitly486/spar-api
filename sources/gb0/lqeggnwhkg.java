package gb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f36737eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f36738iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f36739ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f36740wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f36741zoijcleaow;

    public lqeggnwhkg(int i13, String shopType, String shopAddress, String shopOpeningHours, int i14) {
        zdlpuopuiu.btonecajqb(shopType, "shopType");
        zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
        zdlpuopuiu.btonecajqb(shopOpeningHours, "shopOpeningHours");
        this.f36738iobyxmoadg = i13;
        this.f36741zoijcleaow = shopType;
        this.f36739ppxfxbqfkf = shopAddress;
        this.f36740wkgbmnqykc = shopOpeningHours;
        this.f36737eablkybsjg = i14;
    }

    public final String eablkybsjg() {
        return this.f36741zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f36738iobyxmoadg == lqeggnwhkgVar.f36738iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f36741zoijcleaow, lqeggnwhkgVar.f36741zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36739ppxfxbqfkf, lqeggnwhkgVar.f36739ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f36740wkgbmnqykc, lqeggnwhkgVar.f36740wkgbmnqykc) && this.f36737eablkybsjg == lqeggnwhkgVar.f36737eablkybsjg;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f36738iobyxmoadg) * 31) + this.f36741zoijcleaow.hashCode()) * 31) + this.f36739ppxfxbqfkf.hashCode()) * 31) + this.f36740wkgbmnqykc.hashCode()) * 31) + Integer.hashCode(this.f36737eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f36737eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f36739ppxfxbqfkf;
    }

    public String toString() {
        return "Model(dialogTitle=" + this.f36738iobyxmoadg + ", shopType=" + this.f36741zoijcleaow + ", shopAddress=" + this.f36739ppxfxbqfkf + ", shopOpeningHours=" + this.f36740wkgbmnqykc + ", btnAcceptText=" + this.f36737eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36740wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f36738iobyxmoadg;
    }
}
