package cg1;

import dg1.ppxfxbqfkf;
import dg1.wkgbmnqykc;
import dg1.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.domain.models.order.OrderItem;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.orders.impl.screens.orders.domain.store.State;
import sz0.eablkybsjg;
import tg.draadjrbmk;
import xf1.gxszxtbevo;
import xf1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f19846zdlpuopuiu;

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f19846zdlpuopuiu = resourcesManager;
    }

    private final wkgbmnqykc eablkybsjg(OrderItem orderItem) {
        boolean z13 = orderItem.getDelivery().getPhone().length() > 0;
        return new wkgbmnqykc(orderItem.getId(), this.f19846zdlpuopuiu.getString(lqeggnwhkg.proloyalty_format_order_number_2, orderItem.getId()), z13, orderItem.getIsPhoneEnabled(), orderItem.getDelivery().getPhone(), orderItem.getWithProductReplacement(), orderItem.getIsOrderHasPostamatCode(), new dg1.iobyxmoadg(zoijcleaow(orderItem)), orderItem.getNpsUrl());
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
        return this.f19846zdlpuopuiu.nufgyqmvbu(gxszxtbevo.plural_purchase_bonuses, iIntValue, t11.iobyxmoadg.f109303iobyxmoadg.ppxfxbqfkf(Integer.valueOf(iIntValue)));
    }

    private final List zoijcleaow(OrderItem orderItem) {
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(new ppxfxbqfkf(orderItem.getRecipient().getFullName(), zoijcleaow.RECEIVER));
        listPpxfxbqfkf.add(new ppxfxbqfkf(this.f19846zdlpuopuiu.getString(lqeggnwhkg.proloyalty_space_format, orderItem.getDelivery().getDate(), orderItem.getDelivery().getHours()), zoijcleaow.DATETIME));
        if (orderItem.getOrdersStatus() != OrderStatus.UNDEFINED) {
            listPpxfxbqfkf.add(new ppxfxbqfkf(this.f19846zdlpuopuiu.getString(orderItem.getOrdersStatus().getTitleStringRes()), zoijcleaow.ORDER_STATUS));
        }
        listPpxfxbqfkf.add(new ppxfxbqfkf(this.f19846zdlpuopuiu.getString(lqeggnwhkg.proloyalty_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(orderItem.getSum().getSum()))), zoijcleaow.TOTAL_PRICE));
        String strIobyxmoadg = iobyxmoadg(orderItem.getSum().getBonuses());
        if (strIobyxmoadg != null) {
            if (kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) {
                strIobyxmoadg = null;
            }
            if (strIobyxmoadg != null) {
                listPpxfxbqfkf.add(new ppxfxbqfkf(strIobyxmoadg, zoijcleaow.BONUSES));
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public ag1.gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        boolean z13 = state.getIsLoading() && state.getCurrentPage() == 0;
        eablkybsjg ordersStatus = state.getOrdersStatus();
        List orders = state.getOrders();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(orders, 10));
        Iterator it = orders.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((OrderItem) it.next()));
        }
        return new ag1.gxszxtbevo(z13, ordersStatus, new ag1.lqeggnwhkg(arrayList, state.getIsLoading(), state.getCurrentPage()));
    }
}
