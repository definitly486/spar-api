package tc1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f110272eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f110273gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f110274iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f110275ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f110276wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f110277zoijcleaow;

    public ppxfxbqfkf(String id2, String date, DeliveryCode deliveryCode, String address, String totalPriceInt, String totalPriceFractional) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        this.f110274iobyxmoadg = id2;
        this.f110277zoijcleaow = date;
        this.f110275ppxfxbqfkf = deliveryCode;
        this.f110276wkgbmnqykc = address;
        this.f110272eablkybsjg = totalPriceInt;
        this.f110273gxszxtbevo = totalPriceFractional;
    }

    public final String eablkybsjg() {
        return this.f110272eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f110274iobyxmoadg, ppxfxbqfkfVar.f110274iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f110277zoijcleaow, ppxfxbqfkfVar.f110277zoijcleaow) && this.f110275ppxfxbqfkf == ppxfxbqfkfVar.f110275ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f110276wkgbmnqykc, ppxfxbqfkfVar.f110276wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f110272eablkybsjg, ppxfxbqfkfVar.f110272eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f110273gxszxtbevo, ppxfxbqfkfVar.f110273gxszxtbevo);
    }

    public int hashCode() {
        int iHashCode = ((this.f110274iobyxmoadg.hashCode() * 31) + this.f110277zoijcleaow.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f110275ppxfxbqfkf;
        return ((((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f110276wkgbmnqykc.hashCode()) * 31) + this.f110272eablkybsjg.hashCode()) * 31) + this.f110273gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f110276wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f110274iobyxmoadg;
    }

    public String toString() {
        return "RateOrderDialogParams(id=" + this.f110274iobyxmoadg + ", date=" + this.f110277zoijcleaow + ", type=" + this.f110275ppxfxbqfkf + ", address=" + this.f110276wkgbmnqykc + ", totalPriceInt=" + this.f110272eablkybsjg + ", totalPriceFractional=" + this.f110273gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f110273gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f110277zoijcleaow;
    }
}
