package lx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ky0.DeliveryDto;
import ky0.OrderDto;
import ky0.OrderSumDto;
import ky0.RecipientDto;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.domain.models.delivery.Delivery;
import ru.myspar.proloyalty.core.domain.models.order.OrderItem;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderSum;
import ru.myspar.proloyalty.core.domain.models.recipient.Recipient;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final c11.zoijcleaow f64360iobyxmoadg;

    public wkgbmnqykc(c11.zoijcleaow checkOrderPhoneCallEnabledUseCase) {
        zdlpuopuiu.btonecajqb(checkOrderPhoneCallEnabledUseCase, "checkOrderPhoneCallEnabledUseCase");
        this.f64360iobyxmoadg = checkOrderPhoneCallEnabledUseCase;
    }

    private final boolean iobyxmoadg(Delivery delivery, sz0.eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar == sz0.eablkybsjg.CURRENT && !kcexrzcfyt.zfvoamnweg(delivery.getPostamatCode());
    }

    private final OrderItem wkgbmnqykc(OrderDto orderDto, sz0.eablkybsjg eablkybsjgVar) {
        Delivery delivery;
        Recipient recipient;
        OrderSum orderSumZoijcleaow;
        DeliveryDto delivery2 = orderDto.getDelivery();
        if (delivery2 == null || (delivery = eablkybsjg.iobyxmoadg(delivery2)) == null) {
            delivery = new Delivery(null, null, null, null, null, null, null, 127, null);
        }
        OrderStatus.Companion companion = OrderStatus.INSTANCE;
        String statusId = orderDto.getStatusId();
        if (statusId == null) {
            statusId = "";
        }
        OrderStatus orderStatusIobyxmoadg = companion.iobyxmoadg(statusId);
        String id2 = orderDto.getId();
        String str = id2 == null ? "" : id2;
        RecipientDto recipient2 = orderDto.getRecipient();
        if (recipient2 == null || (recipient = eablkybsjg.ppxfxbqfkf(recipient2)) == null) {
            recipient = new Recipient(null, null, null, 7, null);
        }
        Recipient recipient3 = recipient;
        OrderSumDto sum = orderDto.getSum();
        OrderSum orderSum = (sum == null || (orderSumZoijcleaow = eablkybsjg.zoijcleaow(sum)) == null) ? new OrderSum(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 127, null) : orderSumZoijcleaow;
        boolean zZoijcleaow = zoijcleaow(delivery, orderStatusIobyxmoadg, eablkybsjgVar);
        Boolean hasReplaces = orderDto.getHasReplaces();
        boolean zBooleanValue = hasReplaces != null ? hasReplaces.booleanValue() : false;
        boolean zIobyxmoadg = iobyxmoadg(delivery, eablkybsjgVar);
        String npsUrl = orderDto.getNpsUrl();
        return new OrderItem(str, orderStatusIobyxmoadg, delivery, recipient3, orderSum, zZoijcleaow, zBooleanValue, zIobyxmoadg, npsUrl == null ? "" : npsUrl);
    }

    private final boolean zoijcleaow(Delivery delivery, OrderStatus orderStatus, sz0.eablkybsjg eablkybsjgVar) {
        Object objWkgbmnqykc;
        c11.zoijcleaow.iobyxmoadg iobyxmoadgVar = new c11.zoijcleaow.iobyxmoadg(delivery.getPhone(), delivery.getCode(), orderStatus, eablkybsjgVar);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            Boolean bool = (Boolean) this.f64360iobyxmoadg.zoijcleaow(iobyxmoadgVar);
            bool.booleanValue();
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(bool);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Boolean bool2 = Boolean.FALSE;
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = bool2;
        }
        return ((Boolean) objWkgbmnqykc).booleanValue();
    }

    public final List ppxfxbqfkf(List orders, sz0.eablkybsjg ordersStatus) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(orders, 10));
        Iterator it = orders.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((OrderDto) it.next(), ordersStatus));
        }
        return arrayList;
    }
}
