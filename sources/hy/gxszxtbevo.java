package hy;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f41291dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f41292eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f41293gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41294iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f41295lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f41296nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f41297ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f41298wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f41299zoijcleaow;

    public gxszxtbevo(String address, String receiverFirstName, String receiverLastName, String receiverPhone, String receiverEmail, String dateReceipt, String internalDelivery, String change, List list) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(receiverFirstName, "receiverFirstName");
        zdlpuopuiu.btonecajqb(receiverLastName, "receiverLastName");
        zdlpuopuiu.btonecajqb(receiverPhone, "receiverPhone");
        zdlpuopuiu.btonecajqb(receiverEmail, "receiverEmail");
        zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
        zdlpuopuiu.btonecajqb(internalDelivery, "internalDelivery");
        zdlpuopuiu.btonecajqb(change, "change");
        this.f41294iobyxmoadg = address;
        this.f41299zoijcleaow = receiverFirstName;
        this.f41297ppxfxbqfkf = receiverLastName;
        this.f41298wkgbmnqykc = receiverPhone;
        this.f41292eablkybsjg = receiverEmail;
        this.f41293gxszxtbevo = dateReceipt;
        this.f41295lqeggnwhkg = internalDelivery;
        this.f41296nufgyqmvbu = change;
        this.f41291dxjokdxxww = list;
    }

    public final String dxjokdxxww() {
        return this.f41298wkgbmnqykc;
    }

    public final List eablkybsjg() {
        return this.f41291dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f41294iobyxmoadg, gxszxtbevoVar.f41294iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41299zoijcleaow, gxszxtbevoVar.f41299zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41297ppxfxbqfkf, gxszxtbevoVar.f41297ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f41298wkgbmnqykc, gxszxtbevoVar.f41298wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f41292eablkybsjg, gxszxtbevoVar.f41292eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f41293gxszxtbevo, gxszxtbevoVar.f41293gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f41295lqeggnwhkg, gxszxtbevoVar.f41295lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f41296nufgyqmvbu, gxszxtbevoVar.f41296nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f41291dxjokdxxww, gxszxtbevoVar.f41291dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f41292eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f41294iobyxmoadg.hashCode() * 31) + this.f41299zoijcleaow.hashCode()) * 31) + this.f41297ppxfxbqfkf.hashCode()) * 31) + this.f41298wkgbmnqykc.hashCode()) * 31) + this.f41292eablkybsjg.hashCode()) * 31) + this.f41293gxszxtbevo.hashCode()) * 31) + this.f41295lqeggnwhkg.hashCode()) * 31) + this.f41296nufgyqmvbu.hashCode()) * 31;
        List list = this.f41291dxjokdxxww;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f41294iobyxmoadg;
    }

    public final String lqeggnwhkg() {
        return this.f41299zoijcleaow;
    }

    public final String nufgyqmvbu() {
        return this.f41297ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f41293gxszxtbevo;
    }

    public String toString() {
        return "OrderEditPropertiesEntity(address=" + this.f41294iobyxmoadg + ", receiverFirstName=" + this.f41299zoijcleaow + ", receiverLastName=" + this.f41297ppxfxbqfkf + ", receiverPhone=" + this.f41298wkgbmnqykc + ", receiverEmail=" + this.f41292eablkybsjg + ", dateReceipt=" + this.f41293gxszxtbevo + ", internalDelivery=" + this.f41295lqeggnwhkg + ", change=" + this.f41296nufgyqmvbu + ", orderComments=" + this.f41291dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f41295lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f41296nufgyqmvbu;
    }
}
