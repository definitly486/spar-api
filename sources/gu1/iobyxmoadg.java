package gu1;

import ju1.ChangeCustomizableParametersRequest;
import ju1.SubscriptionDetailRequest;
import ju1.SubscriptionOrderIdRequest;
import kotlin.Metadata;
import ku1.SubscriptionOrderDto;
import lg.gxszxtbevo;
import lu1.SubscriptionDetailDto;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lgu1/iobyxmoadg;", "", "Lju1/ppxfxbqfkf;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lku1/iobyxmoadg;", "iobyxmoadg", "(Lju1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lju1/zoijcleaow;", "Llu1/dxjokdxxww;", "zoijcleaow", "(Lju1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lju1/iobyxmoadg;", "ppxfxbqfkf", "(Lju1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("subscription/order/")
    Object iobyxmoadg(@om.iobyxmoadg SubscriptionOrderIdRequest subscriptionOrderIdRequest, gxszxtbevo<? super BasicResponse<SubscriptionOrderDto>> gxszxtbevoVar);

    @ojitshcjhn("subscriptions/")
    Object ppxfxbqfkf(@om.iobyxmoadg ChangeCustomizableParametersRequest changeCustomizableParametersRequest, gxszxtbevo<? super BasicResponse<SubscriptionDetailDto>> gxszxtbevoVar);

    @ojitshcjhn("subscriptions/")
    Object zoijcleaow(@om.iobyxmoadg SubscriptionDetailRequest subscriptionDetailRequest, gxszxtbevo<? super BasicResponse<SubscriptionDetailDto>> gxszxtbevoVar);
}
