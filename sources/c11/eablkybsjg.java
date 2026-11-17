package c11;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f18495wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f18496ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f18497zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18498cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18500jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18501yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18502zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18500jyumaefscl = obj;
            this.f18498cqumvgiudr |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18503iobyxmoadg;

        public zoijcleaow(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f18503iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f18503iobyxmoadg, ((zoijcleaow) obj).f18503iobyxmoadg);
        }

        public int hashCode() {
            return this.f18503iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18503iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f18503iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18497zoijcleaow = orderLocalSource;
        this.f18496ppxfxbqfkf = orderRemoteSource;
    }

    private final Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18496ppxfxbqfkf.iobyxmoadg(str, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar2;
        eablkybsjg eablkybsjgVar;
        OrderDetail orderDetail;
        OrderPickupStatus orderPickupStatus;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18498cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18498cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = ppxfxbqfkfVar.f18500jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18498cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f18501yggfygwlhe;
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f18502zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OrderDetail orderDetail2 = (OrderDetail) ppxfxbqfkfVar.f18502zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
                orderDetail = orderDetail2;
            }
            orderPickupStatus = (OrderPickupStatus) objWkgbmnqykc;
            if (orderDetail.getDelivery().getCode() != DeliveryCode.PICKUP && zdlpuopuiu.eablkybsjg(LocalDate.parse(orderDetail.getDelivery().getDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy")), LocalDate.now())) {
                if (orderPickupStatus == OrderPickupStatus.NONE && orderDetail.getOrdersStatus() == OrderStatus.READY) {
                    orderPickupStatus = OrderPickupStatus.READY;
                }
            }
            return orderDetail.zoijcleaow((2141192191 & 1) != 0 ? orderDetail.id : null, (2141192191 & 2) != 0 ? orderDetail.dateCreate : null, (2141192191 & 4) != 0 ? orderDetail.blockingTime : null, (2141192191 & 8) != 0 ? orderDetail.canRepeat : false, (2141192191 & 16) != 0 ? orderDetail.ordersStatus : null, (2141192191 & 32) != 0 ? orderDetail.price : 0.0d, (2141192191 & 64) != 0 ? orderDetail.oldPrice : 0.0d, (2141192191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? orderDetail.canRate : false, (2141192191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? orderDetail.canChangePayment : false, (2141192191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? orderDetail.canEdit : false, (2141192191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? orderDetail.rating : 0, (2141192191 & 2048) != 0 ? orderDetail.isMayBeCancelled : false, (2141192191 & 4096) != 0 ? orderDetail.trackingOrder : false, (2141192191 & 8192) != 0 ? orderDetail.delivery : null, (2141192191 & 16384) != 0 ? orderDetail.payment : null, (2141192191 & 32768) != 0 ? orderDetail.recipient : null, (2141192191 & 65536) != 0 ? orderDetail.orderPartner : null, (2141192191 & 131072) != 0 ? orderDetail.sum : null, (2141192191 & 262144) != 0 ? orderDetail.basket : null, (2141192191 & 524288) != 0 ? orderDetail.removedItems : null, (2141192191 & 1048576) != 0 ? orderDetail.isNeedPassport : false, (2141192191 & 2097152) != 0 ? orderDetail.isSubscription : orderDetail.getDelivery().getCode() == DeliveryCode.SUBSCRIPTION, (2141192191 & 4194304) != 0 ? orderDetail.pickupStatus : orderPickupStatus, (2141192191 & 8388608) != 0 ? orderDetail.partnerCode : null, (2141192191 & 16777216) != 0 ? orderDetail.currentTime : null, (2141192191 & 33554432) != 0 ? orderDetail.waitTime : null, (2141192191 & 67108864) != 0 ? orderDetail.hasReplaces : false, (2141192191 & 134217728) != 0 ? orderDetail.message : null, (2141192191 & 268435456) != 0 ? orderDetail.tipsAvailable : false, (2141192191 & 536870912) != 0 ? orderDetail.totalInfo : null, (2141192191 & 1073741824) != 0 ? orderDetail.payments : null);
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        ppxfxbqfkfVar.f18502zdlpuopuiu = this;
        zoijcleaowVar2 = zoijcleaowVar;
        ppxfxbqfkfVar.f18501yggfygwlhe = zoijcleaowVar2;
        ppxfxbqfkfVar.f18498cqumvgiudr = 1;
        objWkgbmnqykc = wkgbmnqykc(strIobyxmoadg, ppxfxbqfkfVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        OrderDetail orderDetail3 = (OrderDetail) objWkgbmnqykc;
        k01.nufgyqmvbu nufgyqmvbuVar = eablkybsjgVar.f18497zoijcleaow;
        String strIobyxmoadg2 = zoijcleaowVar2.iobyxmoadg();
        ppxfxbqfkfVar.f18502zdlpuopuiu = orderDetail3;
        ppxfxbqfkfVar.f18501yggfygwlhe = null;
        ppxfxbqfkfVar.f18498cqumvgiudr = 2;
        Object objPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf(strIobyxmoadg2, ppxfxbqfkfVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        orderDetail = orderDetail3;
        objWkgbmnqykc = objPpxfxbqfkf;
        orderPickupStatus = (OrderPickupStatus) objWkgbmnqykc;
        orderPickupStatus = orderDetail.getDelivery().getCode() != DeliveryCode.PICKUP ? OrderPickupStatus.NONE : OrderPickupStatus.NONE;
        return orderDetail.zoijcleaow((2141192191 & 1) != 0 ? orderDetail.id : null, (2141192191 & 2) != 0 ? orderDetail.dateCreate : null, (2141192191 & 4) != 0 ? orderDetail.blockingTime : null, (2141192191 & 8) != 0 ? orderDetail.canRepeat : false, (2141192191 & 16) != 0 ? orderDetail.ordersStatus : null, (2141192191 & 32) != 0 ? orderDetail.price : 0.0d, (2141192191 & 64) != 0 ? orderDetail.oldPrice : 0.0d, (2141192191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? orderDetail.canRate : false, (2141192191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? orderDetail.canChangePayment : false, (2141192191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? orderDetail.canEdit : false, (2141192191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? orderDetail.rating : 0, (2141192191 & 2048) != 0 ? orderDetail.isMayBeCancelled : false, (2141192191 & 4096) != 0 ? orderDetail.trackingOrder : false, (2141192191 & 8192) != 0 ? orderDetail.delivery : null, (2141192191 & 16384) != 0 ? orderDetail.payment : null, (2141192191 & 32768) != 0 ? orderDetail.recipient : null, (2141192191 & 65536) != 0 ? orderDetail.orderPartner : null, (2141192191 & 131072) != 0 ? orderDetail.sum : null, (2141192191 & 262144) != 0 ? orderDetail.basket : null, (2141192191 & 524288) != 0 ? orderDetail.removedItems : null, (2141192191 & 1048576) != 0 ? orderDetail.isNeedPassport : false, (2141192191 & 2097152) != 0 ? orderDetail.isSubscription : orderDetail.getDelivery().getCode() == DeliveryCode.SUBSCRIPTION, (2141192191 & 4194304) != 0 ? orderDetail.pickupStatus : orderPickupStatus, (2141192191 & 8388608) != 0 ? orderDetail.partnerCode : null, (2141192191 & 16777216) != 0 ? orderDetail.currentTime : null, (2141192191 & 33554432) != 0 ? orderDetail.waitTime : null, (2141192191 & 67108864) != 0 ? orderDetail.hasReplaces : false, (2141192191 & 134217728) != 0 ? orderDetail.message : null, (2141192191 & 268435456) != 0 ? orderDetail.tipsAvailable : false, (2141192191 & 536870912) != 0 ? orderDetail.totalInfo : null, (2141192191 & 1073741824) != 0 ? orderDetail.payments : null);
    }
}
