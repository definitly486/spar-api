package e10;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f30192dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f30193eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f30194gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30195iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f30196lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f30197nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f30198ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f30199wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30200zoijcleaow;

    public nufgyqmvbu(String address, String receiverFirstName, String receiverLastName, String receiverPhone, String receiverEmail, String dateReceipt, String intervalDelivery, String change, List commentsGroups) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(receiverFirstName, "receiverFirstName");
        zdlpuopuiu.btonecajqb(receiverLastName, "receiverLastName");
        zdlpuopuiu.btonecajqb(receiverPhone, "receiverPhone");
        zdlpuopuiu.btonecajqb(receiverEmail, "receiverEmail");
        zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
        zdlpuopuiu.btonecajqb(intervalDelivery, "intervalDelivery");
        zdlpuopuiu.btonecajqb(change, "change");
        zdlpuopuiu.btonecajqb(commentsGroups, "commentsGroups");
        this.f30195iobyxmoadg = address;
        this.f30200zoijcleaow = receiverFirstName;
        this.f30198ppxfxbqfkf = receiverLastName;
        this.f30199wkgbmnqykc = receiverPhone;
        this.f30193eablkybsjg = receiverEmail;
        this.f30194gxszxtbevo = dateReceipt;
        this.f30196lqeggnwhkg = intervalDelivery;
        this.f30197nufgyqmvbu = change;
        this.f30192dxjokdxxww = commentsGroups;
    }

    public final String btonecajqb() {
        return this.f30198ppxfxbqfkf;
    }

    public final String dxjokdxxww() {
        return this.f30200zoijcleaow;
    }

    public final List eablkybsjg() {
        return this.f30192dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f30195iobyxmoadg, nufgyqmvbuVar.f30195iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30200zoijcleaow, nufgyqmvbuVar.f30200zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30198ppxfxbqfkf, nufgyqmvbuVar.f30198ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f30199wkgbmnqykc, nufgyqmvbuVar.f30199wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f30193eablkybsjg, nufgyqmvbuVar.f30193eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f30194gxszxtbevo, nufgyqmvbuVar.f30194gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f30196lqeggnwhkg, nufgyqmvbuVar.f30196lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f30197nufgyqmvbu, nufgyqmvbuVar.f30197nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f30192dxjokdxxww, nufgyqmvbuVar.f30192dxjokdxxww);
    }

    public final String gtknphoqwx() {
        return this.f30199wkgbmnqykc;
    }

    public final String gxszxtbevo() {
        return this.f30194gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((((((((this.f30195iobyxmoadg.hashCode() * 31) + this.f30200zoijcleaow.hashCode()) * 31) + this.f30198ppxfxbqfkf.hashCode()) * 31) + this.f30199wkgbmnqykc.hashCode()) * 31) + this.f30193eablkybsjg.hashCode()) * 31) + this.f30194gxszxtbevo.hashCode()) * 31) + this.f30196lqeggnwhkg.hashCode()) * 31) + this.f30197nufgyqmvbu.hashCode()) * 31) + this.f30192dxjokdxxww.hashCode();
    }

    public final nufgyqmvbu iobyxmoadg(String address, String receiverFirstName, String receiverLastName, String receiverPhone, String receiverEmail, String dateReceipt, String intervalDelivery, String change, List commentsGroups) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(receiverFirstName, "receiverFirstName");
        zdlpuopuiu.btonecajqb(receiverLastName, "receiverLastName");
        zdlpuopuiu.btonecajqb(receiverPhone, "receiverPhone");
        zdlpuopuiu.btonecajqb(receiverEmail, "receiverEmail");
        zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
        zdlpuopuiu.btonecajqb(intervalDelivery, "intervalDelivery");
        zdlpuopuiu.btonecajqb(change, "change");
        zdlpuopuiu.btonecajqb(commentsGroups, "commentsGroups");
        return new nufgyqmvbu(address, receiverFirstName, receiverLastName, receiverPhone, receiverEmail, dateReceipt, intervalDelivery, change, commentsGroups);
    }

    public final String lqeggnwhkg() {
        return this.f30196lqeggnwhkg;
    }

    public final String nufgyqmvbu() {
        return this.f30193eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f30195iobyxmoadg;
    }

    public String toString() {
        return "OrderEditProperties(address=" + this.f30195iobyxmoadg + ", receiverFirstName=" + this.f30200zoijcleaow + ", receiverLastName=" + this.f30198ppxfxbqfkf + ", receiverPhone=" + this.f30199wkgbmnqykc + ", receiverEmail=" + this.f30193eablkybsjg + ", dateReceipt=" + this.f30194gxszxtbevo + ", intervalDelivery=" + this.f30196lqeggnwhkg + ", change=" + this.f30197nufgyqmvbu + ", commentsGroups=" + this.f30192dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f30197nufgyqmvbu;
    }

    public /* synthetic */ nufgyqmvbu(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? str8 : "", (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
