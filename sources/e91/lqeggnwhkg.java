package e91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f30981eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f30982gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f30983iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f30984ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f30985wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30986zoijcleaow;

    public lqeggnwhkg(int i13, String date, String address, String totalPriceInt, String totalPriceFractional, boolean z13) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        this.f30983iobyxmoadg = i13;
        this.f30986zoijcleaow = date;
        this.f30984ppxfxbqfkf = address;
        this.f30985wkgbmnqykc = totalPriceInt;
        this.f30981eablkybsjg = totalPriceFractional;
        this.f30982gxszxtbevo = z13;
    }

    public final String eablkybsjg() {
        return this.f30985wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f30983iobyxmoadg == lqeggnwhkgVar.f30983iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f30986zoijcleaow, lqeggnwhkgVar.f30986zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30984ppxfxbqfkf, lqeggnwhkgVar.f30984ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f30985wkgbmnqykc, lqeggnwhkgVar.f30985wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f30981eablkybsjg, lqeggnwhkgVar.f30981eablkybsjg) && this.f30982gxszxtbevo == lqeggnwhkgVar.f30982gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f30982gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f30983iobyxmoadg) * 31) + this.f30986zoijcleaow.hashCode()) * 31) + this.f30984ppxfxbqfkf.hashCode()) * 31) + this.f30985wkgbmnqykc.hashCode()) * 31) + this.f30981eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f30982gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f30984ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f30986zoijcleaow;
    }

    public String toString() {
        return "Model(currentRating=" + this.f30983iobyxmoadg + ", date=" + this.f30986zoijcleaow + ", address=" + this.f30984ppxfxbqfkf + ", totalPriceInt=" + this.f30985wkgbmnqykc + ", totalPriceFractional=" + this.f30981eablkybsjg + ", isLoading=" + this.f30982gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f30981eablkybsjg;
    }

    public final int zoijcleaow() {
        return this.f30983iobyxmoadg;
    }
}
