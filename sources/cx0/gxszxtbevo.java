package cx0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f26036dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f26037eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f26038gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f26039iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f26040lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f26041nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f26042ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f26043wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f26044zoijcleaow;

    public gxszxtbevo(String address, String receiverFirstName, String receiverLastName, String receiverPhone, String receiverEmail, String dateReceipt, String internalDelivery, String change, List list) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(receiverFirstName, "receiverFirstName");
        zdlpuopuiu.btonecajqb(receiverLastName, "receiverLastName");
        zdlpuopuiu.btonecajqb(receiverPhone, "receiverPhone");
        zdlpuopuiu.btonecajqb(receiverEmail, "receiverEmail");
        zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
        zdlpuopuiu.btonecajqb(internalDelivery, "internalDelivery");
        zdlpuopuiu.btonecajqb(change, "change");
        this.f26039iobyxmoadg = address;
        this.f26044zoijcleaow = receiverFirstName;
        this.f26042ppxfxbqfkf = receiverLastName;
        this.f26043wkgbmnqykc = receiverPhone;
        this.f26037eablkybsjg = receiverEmail;
        this.f26038gxszxtbevo = dateReceipt;
        this.f26040lqeggnwhkg = internalDelivery;
        this.f26041nufgyqmvbu = change;
        this.f26036dxjokdxxww = list;
    }

    public final String dxjokdxxww() {
        return this.f26043wkgbmnqykc;
    }

    public final List eablkybsjg() {
        return this.f26036dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f26039iobyxmoadg, gxszxtbevoVar.f26039iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f26044zoijcleaow, gxszxtbevoVar.f26044zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f26042ppxfxbqfkf, gxszxtbevoVar.f26042ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f26043wkgbmnqykc, gxszxtbevoVar.f26043wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f26037eablkybsjg, gxszxtbevoVar.f26037eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f26038gxszxtbevo, gxszxtbevoVar.f26038gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f26040lqeggnwhkg, gxszxtbevoVar.f26040lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f26041nufgyqmvbu, gxszxtbevoVar.f26041nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f26036dxjokdxxww, gxszxtbevoVar.f26036dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f26037eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f26039iobyxmoadg.hashCode() * 31) + this.f26044zoijcleaow.hashCode()) * 31) + this.f26042ppxfxbqfkf.hashCode()) * 31) + this.f26043wkgbmnqykc.hashCode()) * 31) + this.f26037eablkybsjg.hashCode()) * 31) + this.f26038gxszxtbevo.hashCode()) * 31) + this.f26040lqeggnwhkg.hashCode()) * 31) + this.f26041nufgyqmvbu.hashCode()) * 31;
        List list = this.f26036dxjokdxxww;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f26039iobyxmoadg;
    }

    public final String lqeggnwhkg() {
        return this.f26044zoijcleaow;
    }

    public final String nufgyqmvbu() {
        return this.f26042ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f26038gxszxtbevo;
    }

    public String toString() {
        return "OrderEditPropertiesEntity(address=" + this.f26039iobyxmoadg + ", receiverFirstName=" + this.f26044zoijcleaow + ", receiverLastName=" + this.f26042ppxfxbqfkf + ", receiverPhone=" + this.f26043wkgbmnqykc + ", receiverEmail=" + this.f26037eablkybsjg + ", dateReceipt=" + this.f26038gxszxtbevo + ", internalDelivery=" + this.f26040lqeggnwhkg + ", change=" + this.f26041nufgyqmvbu + ", orderComments=" + this.f26036dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f26040lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f26041nufgyqmvbu;
    }
}
