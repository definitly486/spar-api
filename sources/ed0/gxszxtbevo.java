package ed0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f31123eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31124iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f31125ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f31126wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f31127zoijcleaow;

    public gxszxtbevo(String deliveryPrice, String deliveryTime, String workingHours, String address, boolean z13) {
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(workingHours, "workingHours");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f31124iobyxmoadg = deliveryPrice;
        this.f31127zoijcleaow = deliveryTime;
        this.f31125ppxfxbqfkf = workingHours;
        this.f31126wkgbmnqykc = address;
        this.f31123eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f31124iobyxmoadg, gxszxtbevoVar.f31124iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31127zoijcleaow, gxszxtbevoVar.f31127zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31125ppxfxbqfkf, gxszxtbevoVar.f31125ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31126wkgbmnqykc, gxszxtbevoVar.f31126wkgbmnqykc) && this.f31123eablkybsjg == gxszxtbevoVar.f31123eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f31124iobyxmoadg.hashCode() * 31) + this.f31127zoijcleaow.hashCode()) * 31) + this.f31125ppxfxbqfkf.hashCode()) * 31) + this.f31126wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f31123eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f31126wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f31127zoijcleaow;
    }

    public String toString() {
        return "Model(deliveryPrice=" + this.f31124iobyxmoadg + ", deliveryTime=" + this.f31127zoijcleaow + ", workingHours=" + this.f31125ppxfxbqfkf + ", address=" + this.f31126wkgbmnqykc + ", isLoading=" + this.f31123eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f31125ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f31124iobyxmoadg;
    }
}
