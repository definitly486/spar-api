package cj0;

import dj0.ppxfxbqfkf;
import dj0.wkgbmnqykc;
import dj0.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.domain.models.order.OrderItem;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.orders.impl.screens.orders.domain.store.State;
import tg.draadjrbmk;
import xi0.gxszxtbevo;
import xi0.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f19914zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f19914zdlpuopuiu = resourcesManager;
    }

    private final String iobyxmoadg(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        return this.f19914zdlpuopuiu.nufgyqmvbu(gxszxtbevo.plural_purchase_bonuses, iIntValue, n30.iobyxmoadg.f68492iobyxmoadg.wkgbmnqykc(Integer.valueOf(iIntValue)));
    }

    private final wkgbmnqykc ppxfxbqfkf(OrderItem orderItem) {
        boolean z13 = orderItem.getDelivery().getPhone().length() > 0;
        String string = this.f19914zdlpuopuiu.getString(lqeggnwhkg.format_order_number_2, orderItem.getId());
        String string2 = this.f19914zdlpuopuiu.getString(lqeggnwhkg.space_format, orderItem.getDelivery().getDate(), orderItem.getDelivery().getHours());
        String string3 = this.f19914zdlpuopuiu.getString(lqeggnwhkg.price_format, n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(orderItem.getSum().getSum())));
        String strIobyxmoadg = iobyxmoadg(orderItem.getSum().getBonuses());
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(new ppxfxbqfkf(orderItem.getRecipient().getFullName(), zoijcleaow.RECEIVER));
        listPpxfxbqfkf.add(new ppxfxbqfkf(string2, zoijcleaow.DATETIME));
        if (orderItem.getOrdersStatus() != OrderStatus.UNDEFINED) {
            listPpxfxbqfkf.add(new ppxfxbqfkf(this.f19914zdlpuopuiu.getString(orderItem.getOrdersStatus().getTitleStringRes()), zoijcleaow.ORDER_STATUS));
        }
        listPpxfxbqfkf.add(new ppxfxbqfkf(string3, zoijcleaow.TOTAL_PRICE));
        if (strIobyxmoadg != null && !kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) {
            listPpxfxbqfkf.add(new ppxfxbqfkf(strIobyxmoadg, zoijcleaow.BONUSES));
        }
        return new wkgbmnqykc(orderItem.getId(), string, z13, orderItem.getIsPhoneEnabled(), orderItem.getDelivery().getPhone(), orderItem.getWithProductReplacement(), orderItem.getIsOrderHasPostamatCode(), new dj0.iobyxmoadg(jyumaefscl.iobyxmoadg(listPpxfxbqfkf)));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public aj0.gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        boolean z13 = state.getIsLoading() && state.getCurrentPage() == 0;
        c10.gxszxtbevo ordersStatus = state.getOrdersStatus();
        List orders = state.getOrders();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(orders, 10));
        Iterator it = orders.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((OrderItem) it.next()));
        }
        return new aj0.gxszxtbevo(z13, ordersStatus, new aj0.lqeggnwhkg(arrayList, state.getIsLoading(), state.getCurrentPage()));
    }
}
