package fb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f33381eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f33382gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f33383iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f33384ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f33385wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f33386zoijcleaow;

    public lqeggnwhkg(int i13, String date, String address, String totalPriceInt, String totalPriceFractional, boolean z13) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        this.f33383iobyxmoadg = i13;
        this.f33386zoijcleaow = date;
        this.f33384ppxfxbqfkf = address;
        this.f33385wkgbmnqykc = totalPriceInt;
        this.f33381eablkybsjg = totalPriceFractional;
        this.f33382gxszxtbevo = z13;
    }

    public final String eablkybsjg() {
        return this.f33385wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f33383iobyxmoadg == lqeggnwhkgVar.f33383iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f33386zoijcleaow, lqeggnwhkgVar.f33386zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f33384ppxfxbqfkf, lqeggnwhkgVar.f33384ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f33385wkgbmnqykc, lqeggnwhkgVar.f33385wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f33381eablkybsjg, lqeggnwhkgVar.f33381eablkybsjg) && this.f33382gxszxtbevo == lqeggnwhkgVar.f33382gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f33382gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f33383iobyxmoadg) * 31) + this.f33386zoijcleaow.hashCode()) * 31) + this.f33384ppxfxbqfkf.hashCode()) * 31) + this.f33385wkgbmnqykc.hashCode()) * 31) + this.f33381eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f33382gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f33384ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f33386zoijcleaow;
    }

    public String toString() {
        return "Model(currentRating=" + this.f33383iobyxmoadg + ", date=" + this.f33386zoijcleaow + ", address=" + this.f33384ppxfxbqfkf + ", totalPriceInt=" + this.f33385wkgbmnqykc + ", totalPriceFractional=" + this.f33381eablkybsjg + ", isLoading=" + this.f33382gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f33381eablkybsjg;
    }

    public final int zoijcleaow() {
        return this.f33383iobyxmoadg;
    }
}
