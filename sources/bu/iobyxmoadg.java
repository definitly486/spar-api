package bu;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.order_info.model.OrderTotalInfoItemUiModel;
import ru.myspar.core.domain.models.order.OrderTotalInfoItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final OrderTotalInfoItemUiModel iobyxmoadg(OrderTotalInfoItem orderTotalInfoItem) {
        zdlpuopuiu.btonecajqb(orderTotalInfoItem, "<this>");
        String title = orderTotalInfoItem.getTitle();
        String value = orderTotalInfoItem.getValue();
        String tooltip = orderTotalInfoItem.getTooltip();
        if (tooltip == null) {
            tooltip = "";
        }
        return new OrderTotalInfoItemUiModel(title, value, tooltip);
    }
}
