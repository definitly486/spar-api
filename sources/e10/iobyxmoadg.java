package e10;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final OrderEditBonuses f30173agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lqeggnwhkg f30174btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f30175draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final DeliveryCode f30176dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f30177eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wkgbmnqykc f30178gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final PaymentCode f30179gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30180iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final nufgyqmvbu f30181lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ppxfxbqfkf f30182nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final String f30183ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final OrderStatus f30184ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final List f30185rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final List f30186vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Warning f30187wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f30188wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f30189zoijcleaow;

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
        this.f30180iobyxmoadg = id2;
        this.f30189zoijcleaow = list;
        this.f30184ppxfxbqfkf = orderStatus;
        this.f30188wkgbmnqykc = str;
        this.f30177eablkybsjg = str2;
        this.f30179gxszxtbevo = payment;
        this.f30181lqeggnwhkg = properties;
        this.f30182nufgyqmvbu = sum;
        this.f30176dxjokdxxww = deliveryCode;
        this.f30174btonecajqb = promocode;
        this.f30178gtknphoqwx = orderProperties;
        this.f30175draadjrbmk = basket;
        this.f30187wflxmlrfwp = warning;
        this.f30173agtfadlqog = orderEditBonuses;
        this.f30183ojitshcjhn = groups;
        this.f30185rgvfuqvkyq = totalInfo;
        this.f30186vdvldrhtss = payments;
    }

    public final nufgyqmvbu agtfadlqog() {
        return this.f30181lqeggnwhkg;
    }

    public final OrderStatus btonecajqb() {
        return this.f30184ppxfxbqfkf;
    }

    public final List draadjrbmk() {
        return this.f30186vdvldrhtss;
    }

    public final wkgbmnqykc dxjokdxxww() {
        return this.f30178gtknphoqwx;
    }

    public final DeliveryCode eablkybsjg() {
        return this.f30176dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f30180iobyxmoadg, iobyxmoadgVar.f30180iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30189zoijcleaow, iobyxmoadgVar.f30189zoijcleaow) && this.f30184ppxfxbqfkf == iobyxmoadgVar.f30184ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f30188wkgbmnqykc, iobyxmoadgVar.f30188wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f30177eablkybsjg, iobyxmoadgVar.f30177eablkybsjg) && this.f30179gxszxtbevo == iobyxmoadgVar.f30179gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f30181lqeggnwhkg, iobyxmoadgVar.f30181lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f30182nufgyqmvbu, iobyxmoadgVar.f30182nufgyqmvbu) && this.f30176dxjokdxxww == iobyxmoadgVar.f30176dxjokdxxww && zdlpuopuiu.eablkybsjg(this.f30174btonecajqb, iobyxmoadgVar.f30174btonecajqb) && zdlpuopuiu.eablkybsjg(this.f30178gtknphoqwx, iobyxmoadgVar.f30178gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f30175draadjrbmk, iobyxmoadgVar.f30175draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f30187wflxmlrfwp, iobyxmoadgVar.f30187wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f30173agtfadlqog, iobyxmoadgVar.f30173agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f30183ojitshcjhn, iobyxmoadgVar.f30183ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f30185rgvfuqvkyq, iobyxmoadgVar.f30185rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f30186vdvldrhtss, iobyxmoadgVar.f30186vdvldrhtss);
    }

    public final PaymentCode gtknphoqwx() {
        return this.f30179gxszxtbevo;
    }

    public final String gxszxtbevo() {
        return this.f30177eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f30180iobyxmoadg.hashCode() * 31;
        List list = this.f30189zoijcleaow;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f30184ppxfxbqfkf.hashCode()) * 31;
        String str = this.f30188wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30177eablkybsjg;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f30179gxszxtbevo.hashCode()) * 31) + this.f30181lqeggnwhkg.hashCode()) * 31) + this.f30182nufgyqmvbu.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f30176dxjokdxxww;
        int iHashCode5 = (((((((((iHashCode4 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f30174btonecajqb.hashCode()) * 31) + this.f30178gtknphoqwx.hashCode()) * 31) + this.f30175draadjrbmk.hashCode()) * 31) + this.f30187wflxmlrfwp.hashCode()) * 31;
        OrderEditBonuses orderEditBonuses = this.f30173agtfadlqog;
        return ((((((iHashCode5 + (orderEditBonuses != null ? orderEditBonuses.hashCode() : 0)) * 31) + this.f30183ojitshcjhn.hashCode()) * 31) + this.f30185rgvfuqvkyq.hashCode()) * 31) + this.f30186vdvldrhtss.hashCode();
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
        return this.f30183ojitshcjhn;
    }

    public final String nufgyqmvbu() {
        return this.f30180iobyxmoadg;
    }

    public final String ojitshcjhn() {
        return this.f30188wkgbmnqykc;
    }

    public final Warning oxmwwwfdhm() {
        return this.f30187wflxmlrfwp;
    }

    public final List ppxfxbqfkf() {
        return this.f30175draadjrbmk;
    }

    public final ppxfxbqfkf rgvfuqvkyq() {
        return this.f30182nufgyqmvbu;
    }

    public String toString() {
        return "OrderEdit(id=" + this.f30180iobyxmoadg + ", fields=" + this.f30189zoijcleaow + ", orderStatus=" + this.f30184ppxfxbqfkf + ", shopId=" + this.f30188wkgbmnqykc + ", deliveryArea=" + this.f30177eablkybsjg + ", payment=" + this.f30179gxszxtbevo + ", properties=" + this.f30181lqeggnwhkg + ", sum=" + this.f30182nufgyqmvbu + ", delivery=" + this.f30176dxjokdxxww + ", promocode=" + this.f30174btonecajqb + ", orderProperties=" + this.f30178gtknphoqwx + ", basket=" + this.f30175draadjrbmk + ", warning=" + this.f30187wflxmlrfwp + ", bonuses=" + this.f30173agtfadlqog + ", groups=" + this.f30183ojitshcjhn + ", totalInfo=" + this.f30185rgvfuqvkyq + ", payments=" + this.f30186vdvldrhtss + ")";
    }

    public final List vdvldrhtss() {
        return this.f30185rgvfuqvkyq;
    }

    public final lqeggnwhkg wflxmlrfwp() {
        return this.f30174btonecajqb;
    }

    public final OrderEditBonuses wkgbmnqykc() {
        return this.f30173agtfadlqog;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, OrderStatus orderStatus, String str2, String str3, PaymentCode paymentCode, nufgyqmvbu nufgyqmvbuVar, ppxfxbqfkf ppxfxbqfkfVar, DeliveryCode deliveryCode, lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar, List list2, Warning warning, OrderEditBonuses orderEditBonuses, String str4, List list3, List list4, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? OrderStatus.UNDEFINED : orderStatus, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? PaymentCode.UNDEFINED : paymentCode, (i13 & 64) != 0 ? new nufgyqmvbu(null, null, null, null, null, null, null, null, null, 511, null) : nufgyqmvbuVar, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new ppxfxbqfkf(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 511, null) : ppxfxbqfkfVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : deliveryCode, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new lqeggnwhkg(null, false, 3, null) : lqeggnwhkgVar, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new wkgbmnqykc(0.0d, null, 3, null) : wkgbmnqykcVar, (i13 & 2048) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 4096) != 0 ? Warning.Empty.f87479jyumaefscl : warning, (i13 & 8192) == 0 ? orderEditBonuses : null, (i13 & 16384) != 0 ? "" : str4, (32768 & i13) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & 65536) != 0 ? jyumaefscl.wflxmlrfwp() : list4);
    }
}
