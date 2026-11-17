package vo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.common.view.order_info.model.OrderTotalInfoItemUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.CartInfoItem;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements tg.draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wo0.vdvldrhtss invoke(List infoList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(infoList, "infoList");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(infoList, 10));
        Iterator it = infoList.iterator();
        while (it.hasNext()) {
            CartInfoItem cartInfoItem = (CartInfoItem) it.next();
            arrayList.add(new OrderTotalInfoItemUiModel(cartInfoItem.getTitle(), cartInfoItem.getValue(), cartInfoItem.getTooltip()));
        }
        return new wo0.vdvldrhtss(arrayList);
    }
}
