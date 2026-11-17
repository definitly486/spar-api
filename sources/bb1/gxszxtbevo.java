package bb1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f15671eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f15672iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f15673ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f15674wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f15675zoijcleaow;

    public gxszxtbevo(String deliveryPrice, String deliveryTime, String workingHours, String address, boolean z13) {
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(workingHours, "workingHours");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f15672iobyxmoadg = deliveryPrice;
        this.f15675zoijcleaow = deliveryTime;
        this.f15673ppxfxbqfkf = workingHours;
        this.f15674wkgbmnqykc = address;
        this.f15671eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f15672iobyxmoadg, gxszxtbevoVar.f15672iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15675zoijcleaow, gxszxtbevoVar.f15675zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15673ppxfxbqfkf, gxszxtbevoVar.f15673ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f15674wkgbmnqykc, gxszxtbevoVar.f15674wkgbmnqykc) && this.f15671eablkybsjg == gxszxtbevoVar.f15671eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f15672iobyxmoadg.hashCode() * 31) + this.f15675zoijcleaow.hashCode()) * 31) + this.f15673ppxfxbqfkf.hashCode()) * 31) + this.f15674wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f15671eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f15674wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f15675zoijcleaow;
    }

    public String toString() {
        return "Model(deliveryPrice=" + this.f15672iobyxmoadg + ", deliveryTime=" + this.f15675zoijcleaow + ", workingHours=" + this.f15673ppxfxbqfkf + ", address=" + this.f15674wkgbmnqykc + ", isLoading=" + this.f15671eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f15673ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f15672iobyxmoadg;
    }
}
