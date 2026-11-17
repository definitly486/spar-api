package x20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.core.domain.models.order.OrderPickupStatus;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f121019wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f121020ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f121021zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f121022cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f121024jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f121025yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121026zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121024jyumaefscl = obj;
            this.f121022cqumvgiudr |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121027iobyxmoadg;

        public zoijcleaow(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f121027iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f121027iobyxmoadg, ((zoijcleaow) obj).f121027iobyxmoadg);
        }

        public int hashCode() {
            return this.f121027iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121027iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f121027iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121021zoijcleaow = orderLocalSource;
        this.f121020ppxfxbqfkf = orderRemoteSource;
    }

    private final Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121020ppxfxbqfkf.iobyxmoadg(str, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar2;
        eablkybsjg eablkybsjgVar;
        Order order;
        OrderPickupStatus orderPickupStatus;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f121022cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f121022cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = ppxfxbqfkfVar.f121024jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f121022cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f121025yggfygwlhe;
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f121026zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Order order2 = (Order) ppxfxbqfkfVar.f121026zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
                order = order2;
            }
            orderPickupStatus = (OrderPickupStatus) objWkgbmnqykc;
            if (order.getDelivery().getCode() != DeliveryCode.PICKUP && zdlpuopuiu.eablkybsjg(LocalDate.parse(order.getDelivery().getDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy")), LocalDate.now())) {
                if (orderPickupStatus == OrderPickupStatus.NONE && order.getOrdersStatus() == OrderStatus.READY) {
                    orderPickupStatus = OrderPickupStatus.READY;
                }
            }
            return order.zoijcleaow((1070596095 & 1) != 0 ? order.id : null, (1070596095 & 2) != 0 ? order.dateCreate : null, (1070596095 & 4) != 0 ? order.blockingTime : null, (1070596095 & 8) != 0 ? order.canRepeat : false, (1070596095 & 16) != 0 ? order.ordersStatus : null, (1070596095 & 32) != 0 ? order.price : 0.0d, (1070596095 & 64) != 0 ? order.oldPrice : 0.0d, (1070596095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? order.canRate : false, (1070596095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? order.canChangePayment : false, (1070596095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? order.canEdit : false, (1070596095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? order.rating : 0, (1070596095 & 2048) != 0 ? order.isMayBeCancelled : false, (1070596095 & 4096) != 0 ? order.trackingOrder : false, (1070596095 & 8192) != 0 ? order.delivery : null, (1070596095 & 16384) != 0 ? order.payment : null, (1070596095 & 32768) != 0 ? order.recipient : null, (1070596095 & 65536) != 0 ? order.orderPartner : null, (1070596095 & 131072) != 0 ? order.sum : null, (1070596095 & 262144) != 0 ? order.basket : null, (1070596095 & 524288) != 0 ? order.isNeedPassport : false, (1070596095 & 1048576) != 0 ? order.isSubscription : order.getDelivery().getCode() == DeliveryCode.SUBSCRIPTION, (1070596095 & 2097152) != 0 ? order.pickupStatus : orderPickupStatus, (1070596095 & 4194304) != 0 ? order.partnerCode : null, (1070596095 & 8388608) != 0 ? order.currentTime : null, (1070596095 & 16777216) != 0 ? order.waitTime : null, (1070596095 & 33554432) != 0 ? order.hasReplaces : false, (1070596095 & 67108864) != 0 ? order.message : null, (1070596095 & 134217728) != 0 ? order.tipsAvailable : false, (1070596095 & 268435456) != 0 ? order.totalInfo : null, (1070596095 & 536870912) != 0 ? order.payments : null);
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        ppxfxbqfkfVar.f121026zdlpuopuiu = this;
        zoijcleaowVar2 = zoijcleaowVar;
        ppxfxbqfkfVar.f121025yggfygwlhe = zoijcleaowVar2;
        ppxfxbqfkfVar.f121022cqumvgiudr = 1;
        objWkgbmnqykc = wkgbmnqykc(strIobyxmoadg, ppxfxbqfkfVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        Order order3 = (Order) objWkgbmnqykc;
        w10.nufgyqmvbu nufgyqmvbuVar = eablkybsjgVar.f121021zoijcleaow;
        String strIobyxmoadg2 = zoijcleaowVar2.iobyxmoadg();
        ppxfxbqfkfVar.f121026zdlpuopuiu = order3;
        ppxfxbqfkfVar.f121025yggfygwlhe = null;
        ppxfxbqfkfVar.f121022cqumvgiudr = 2;
        Object objPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf(strIobyxmoadg2, ppxfxbqfkfVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        order = order3;
        objWkgbmnqykc = objPpxfxbqfkf;
        orderPickupStatus = (OrderPickupStatus) objWkgbmnqykc;
        orderPickupStatus = order.getDelivery().getCode() != DeliveryCode.PICKUP ? OrderPickupStatus.NONE : OrderPickupStatus.NONE;
        return order.zoijcleaow((1070596095 & 1) != 0 ? order.id : null, (1070596095 & 2) != 0 ? order.dateCreate : null, (1070596095 & 4) != 0 ? order.blockingTime : null, (1070596095 & 8) != 0 ? order.canRepeat : false, (1070596095 & 16) != 0 ? order.ordersStatus : null, (1070596095 & 32) != 0 ? order.price : 0.0d, (1070596095 & 64) != 0 ? order.oldPrice : 0.0d, (1070596095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? order.canRate : false, (1070596095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? order.canChangePayment : false, (1070596095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? order.canEdit : false, (1070596095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? order.rating : 0, (1070596095 & 2048) != 0 ? order.isMayBeCancelled : false, (1070596095 & 4096) != 0 ? order.trackingOrder : false, (1070596095 & 8192) != 0 ? order.delivery : null, (1070596095 & 16384) != 0 ? order.payment : null, (1070596095 & 32768) != 0 ? order.recipient : null, (1070596095 & 65536) != 0 ? order.orderPartner : null, (1070596095 & 131072) != 0 ? order.sum : null, (1070596095 & 262144) != 0 ? order.basket : null, (1070596095 & 524288) != 0 ? order.isNeedPassport : false, (1070596095 & 1048576) != 0 ? order.isSubscription : order.getDelivery().getCode() == DeliveryCode.SUBSCRIPTION, (1070596095 & 2097152) != 0 ? order.pickupStatus : orderPickupStatus, (1070596095 & 4194304) != 0 ? order.partnerCode : null, (1070596095 & 8388608) != 0 ? order.currentTime : null, (1070596095 & 16777216) != 0 ? order.waitTime : null, (1070596095 & 33554432) != 0 ? order.hasReplaces : false, (1070596095 & 67108864) != 0 ? order.message : null, (1070596095 & 134217728) != 0 ? order.tipsAvailable : false, (1070596095 & 268435456) != 0 ? order.totalInfo : null, (1070596095 & 536870912) != 0 ? order.payments : null);
    }
}
