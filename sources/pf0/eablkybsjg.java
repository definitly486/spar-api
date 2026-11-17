package pf0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f76510eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f76511gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76512iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f76513ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f76514wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76515zoijcleaow;

    public eablkybsjg(String id2, String date, DeliveryCode deliveryCode, String address, String totalPriceInt, String totalPriceFractional) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        this.f76512iobyxmoadg = id2;
        this.f76515zoijcleaow = date;
        this.f76513ppxfxbqfkf = deliveryCode;
        this.f76514wkgbmnqykc = address;
        this.f76510eablkybsjg = totalPriceInt;
        this.f76511gxszxtbevo = totalPriceFractional;
    }

    public final String eablkybsjg() {
        return this.f76510eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f76512iobyxmoadg, eablkybsjgVar.f76512iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76515zoijcleaow, eablkybsjgVar.f76515zoijcleaow) && this.f76513ppxfxbqfkf == eablkybsjgVar.f76513ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f76514wkgbmnqykc, eablkybsjgVar.f76514wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f76510eablkybsjg, eablkybsjgVar.f76510eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f76511gxszxtbevo, eablkybsjgVar.f76511gxszxtbevo);
    }

    public int hashCode() {
        int iHashCode = ((this.f76512iobyxmoadg.hashCode() * 31) + this.f76515zoijcleaow.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f76513ppxfxbqfkf;
        return ((((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f76514wkgbmnqykc.hashCode()) * 31) + this.f76510eablkybsjg.hashCode()) * 31) + this.f76511gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f76514wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f76512iobyxmoadg;
    }

    public String toString() {
        return "RateOrderDialogParams(id=" + this.f76512iobyxmoadg + ", date=" + this.f76515zoijcleaow + ", type=" + this.f76513ppxfxbqfkf + ", address=" + this.f76514wkgbmnqykc + ", totalPriceInt=" + this.f76510eablkybsjg + ", totalPriceFractional=" + this.f76511gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f76511gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f76515zoijcleaow;
    }
}
