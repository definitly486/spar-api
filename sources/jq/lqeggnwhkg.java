package jq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.common.view.order_info.model.OrderTotalInfoItemUiModel;
import ru.myspar.core.domain.models.cart.CartInfoItem;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg implements tg.draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public kq.rgvfuqvkyq invoke(List infoList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(infoList, "infoList");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(infoList, 10));
        Iterator it = infoList.iterator();
        while (it.hasNext()) {
            CartInfoItem cartInfoItem = (CartInfoItem) it.next();
            arrayList.add(new OrderTotalInfoItemUiModel(cartInfoItem.getTitle(), cartInfoItem.getValue(), cartInfoItem.getTooltip()));
        }
        return new kq.rgvfuqvkyq(arrayList);
    }
}
