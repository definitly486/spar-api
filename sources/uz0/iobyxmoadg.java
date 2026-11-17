package uz0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final OrderEditBonuses f114823agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lqeggnwhkg f114824btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f114825draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final DeliveryCode f114826dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f114827eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wkgbmnqykc f114828gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final PaymentCode f114829gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114830iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final nufgyqmvbu f114831lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ppxfxbqfkf f114832nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final String f114833ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final OrderStatus f114834ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final List f114835rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final List f114836vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Warning f114837wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f114838wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f114839zoijcleaow;

    public iobyxmoadg(String id2, List list, OrderStatus orderStatus, String str, String str2, PaymentCode payment, nufgyqmvbu properties, ppxfxbqfkf sum, DeliveryCode deliveryCode, lqeggnwhkg promocode, wkgbmnqykc orderProperties, List basket, Warning warning, OrderEditBonuses orderEditBonuses, String groups, List totalInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        zdlpuopuiu.btonecajqb(payment, "payment");
        zdlpuopuiu.btonecajqb(properties, "properties");
        zdlpuopuiu.btonecajqb(sum, "sum");
        zdlpuopuiu.btonecajqb(promocode, "promocode");
        zdlpuopuiu.btonecajqb(orderProperties, "orderProperties");
        zdlpuopuiu.btonecajqb(basket, "basket");
        zdlpuopuiu.btonecajqb(warning, "warning");
        zdlpuopuiu.btonecajqb(groups, "groups");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        this.f114830iobyxmoadg = id2;
        this.f114839zoijcleaow = list;
        this.f114834ppxfxbqfkf = orderStatus;
        this.f114838wkgbmnqykc = str;
        this.f114827eablkybsjg = str2;
        this.f114829gxszxtbevo = payment;
        this.f114831lqeggnwhkg = properties;
        this.f114832nufgyqmvbu = sum;
        this.f114826dxjokdxxww = deliveryCode;
        this.f114824btonecajqb = promocode;
        this.f114828gtknphoqwx = orderProperties;
        this.f114825draadjrbmk = basket;
        this.f114837wflxmlrfwp = warning;
        this.f114823agtfadlqog = orderEditBonuses;
        this.f114833ojitshcjhn = groups;
        this.f114835rgvfuqvkyq = totalInfo;
        this.f114836vdvldrhtss = payments;
    }

    public final nufgyqmvbu agtfadlqog() {
        return this.f114831lqeggnwhkg;
    }

    public final OrderStatus btonecajqb() {
        return this.f114834ppxfxbqfkf;
    }

    public final List draadjrbmk() {
        return this.f114836vdvldrhtss;
    }

    public final wkgbmnqykc dxjokdxxww() {
        return this.f114828gtknphoqwx;
    }

    public final DeliveryCode eablkybsjg() {
        return this.f114826dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f114830iobyxmoadg, iobyxmoadgVar.f114830iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114839zoijcleaow, iobyxmoadgVar.f114839zoijcleaow) && this.f114834ppxfxbqfkf == iobyxmoadgVar.f114834ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f114838wkgbmnqykc, iobyxmoadgVar.f114838wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f114827eablkybsjg, iobyxmoadgVar.f114827eablkybsjg) && this.f114829gxszxtbevo == iobyxmoadgVar.f114829gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f114831lqeggnwhkg, iobyxmoadgVar.f114831lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f114832nufgyqmvbu, iobyxmoadgVar.f114832nufgyqmvbu) && this.f114826dxjokdxxww == iobyxmoadgVar.f114826dxjokdxxww && zdlpuopuiu.eablkybsjg(this.f114824btonecajqb, iobyxmoadgVar.f114824btonecajqb) && zdlpuopuiu.eablkybsjg(this.f114828gtknphoqwx, iobyxmoadgVar.f114828gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f114825draadjrbmk, iobyxmoadgVar.f114825draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f114837wflxmlrfwp, iobyxmoadgVar.f114837wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f114823agtfadlqog, iobyxmoadgVar.f114823agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f114833ojitshcjhn, iobyxmoadgVar.f114833ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f114835rgvfuqvkyq, iobyxmoadgVar.f114835rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f114836vdvldrhtss, iobyxmoadgVar.f114836vdvldrhtss);
    }

    public final PaymentCode gtknphoqwx() {
        return this.f114829gxszxtbevo;
    }

    public final String gxszxtbevo() {
        return this.f114827eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f114830iobyxmoadg.hashCode() * 31;
        List list = this.f114839zoijcleaow;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f114834ppxfxbqfkf.hashCode()) * 31;
        String str = this.f114838wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114827eablkybsjg;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f114829gxszxtbevo.hashCode()) * 31) + this.f114831lqeggnwhkg.hashCode()) * 31) + this.f114832nufgyqmvbu.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f114826dxjokdxxww;
        int iHashCode5 = (((((((((iHashCode4 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f114824btonecajqb.hashCode()) * 31) + this.f114828gtknphoqwx.hashCode()) * 31) + this.f114825draadjrbmk.hashCode()) * 31) + this.f114837wflxmlrfwp.hashCode()) * 31;
        OrderEditBonuses orderEditBonuses = this.f114823agtfadlqog;
        return ((((((iHashCode5 + (orderEditBonuses != null ? orderEditBonuses.hashCode() : 0)) * 31) + this.f114833ojitshcjhn.hashCode()) * 31) + this.f114835rgvfuqvkyq.hashCode()) * 31) + this.f114836vdvldrhtss.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(String id2, List list, OrderStatus orderStatus, String str, String str2, PaymentCode payment, nufgyqmvbu properties, ppxfxbqfkf sum, DeliveryCode deliveryCode, lqeggnwhkg promocode, wkgbmnqykc orderProperties, List basket, Warning warning, OrderEditBonuses orderEditBonuses, String groups, List totalInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        zdlpuopuiu.btonecajqb(payment, "payment");
        zdlpuopuiu.btonecajqb(properties, "properties");
        zdlpuopuiu.btonecajqb(sum, "sum");
        zdlpuopuiu.btonecajqb(promocode, "promocode");
        zdlpuopuiu.btonecajqb(orderProperties, "orderProperties");
        zdlpuopuiu.btonecajqb(basket, "basket");
        zdlpuopuiu.btonecajqb(warning, "warning");
        zdlpuopuiu.btonecajqb(groups, "groups");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        return new iobyxmoadg(id2, list, orderStatus, str, str2, payment, properties, sum, deliveryCode, promocode, orderProperties, basket, warning, orderEditBonuses, groups, totalInfo, payments);
    }

    public final String lqeggnwhkg() {
        return this.f114833ojitshcjhn;
    }

    public final String nufgyqmvbu() {
        return this.f114830iobyxmoadg;
    }

    public final String ojitshcjhn() {
        return this.f114838wkgbmnqykc;
    }

    public final Warning oxmwwwfdhm() {
        return this.f114837wflxmlrfwp;
    }

    public final List ppxfxbqfkf() {
        return this.f114825draadjrbmk;
    }

    public final ppxfxbqfkf rgvfuqvkyq() {
        return this.f114832nufgyqmvbu;
    }

    public String toString() {
        return "OrderEdit(id=" + this.f114830iobyxmoadg + ", fields=" + this.f114839zoijcleaow + ", orderStatus=" + this.f114834ppxfxbqfkf + ", shopId=" + this.f114838wkgbmnqykc + ", deliveryArea=" + this.f114827eablkybsjg + ", payment=" + this.f114829gxszxtbevo + ", properties=" + this.f114831lqeggnwhkg + ", sum=" + this.f114832nufgyqmvbu + ", delivery=" + this.f114826dxjokdxxww + ", promocode=" + this.f114824btonecajqb + ", orderProperties=" + this.f114828gtknphoqwx + ", basket=" + this.f114825draadjrbmk + ", warning=" + this.f114837wflxmlrfwp + ", bonuses=" + this.f114823agtfadlqog + ", groups=" + this.f114833ojitshcjhn + ", totalInfo=" + this.f114835rgvfuqvkyq + ", payments=" + this.f114836vdvldrhtss + ")";
    }

    public final List vdvldrhtss() {
        return this.f114835rgvfuqvkyq;
    }

    public final lqeggnwhkg wflxmlrfwp() {
        return this.f114824btonecajqb;
    }

    public final OrderEditBonuses wkgbmnqykc() {
        return this.f114823agtfadlqog;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, OrderStatus orderStatus, String str2, String str3, PaymentCode paymentCode, nufgyqmvbu nufgyqmvbuVar, ppxfxbqfkf ppxfxbqfkfVar, DeliveryCode deliveryCode, lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar, List list2, Warning warning, OrderEditBonuses orderEditBonuses, String str4, List list3, List list4, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? OrderStatus.UNDEFINED : orderStatus, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? PaymentCode.UNDEFINED : paymentCode, (i13 & 64) != 0 ? new nufgyqmvbu(null, null, null, null, null, null, null, null, null, 511, null) : nufgyqmvbuVar, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new ppxfxbqfkf(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 511, null) : ppxfxbqfkfVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : deliveryCode, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new lqeggnwhkg(null, false, 3, null) : lqeggnwhkgVar, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new wkgbmnqykc(0.0d, null, 3, null) : wkgbmnqykcVar, (i13 & 2048) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 4096) != 0 ? Warning.Empty.f95255jyumaefscl : warning, (i13 & 8192) == 0 ? orderEditBonuses : null, (i13 & 16384) != 0 ? "" : str4, (32768 & i13) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & 65536) != 0 ? jyumaefscl.wflxmlrfwp() : list4);
    }
}
