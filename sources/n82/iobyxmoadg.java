package n82;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import q82.ChangeCustomizableParametersRequest;
import q82.SubscriptionDetailRequest;
import q82.SubscriptionOrderIdRequest;
import q82.UpdateAutoRenewalSubscriptionRequest;
import r82.SubscriptionOrderDto;
import ru.myspar.core.network.model.BasicResponse;
import s82.SubscriptionDetailDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Ln82/iobyxmoadg;", "", "Lq82/ppxfxbqfkf;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lr82/iobyxmoadg;", "zoijcleaow", "(Lq82/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lq82/eablkybsjg;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lq82/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lq82/zoijcleaow;", "Ls82/dxjokdxxww;", "ppxfxbqfkf", "(Lq82/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lq82/iobyxmoadg;", "wkgbmnqykc", "(Lq82/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("user/params/")
    Object iobyxmoadg(@om.iobyxmoadg UpdateAutoRenewalSubscriptionRequest updateAutoRenewalSubscriptionRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("subscriptions/")
    Object ppxfxbqfkf(@om.iobyxmoadg SubscriptionDetailRequest subscriptionDetailRequest, gxszxtbevo<? super BasicResponse<SubscriptionDetailDto>> gxszxtbevoVar);

    @ojitshcjhn("subscriptions/")
    Object wkgbmnqykc(@om.iobyxmoadg ChangeCustomizableParametersRequest changeCustomizableParametersRequest, gxszxtbevo<? super BasicResponse<SubscriptionDetailDto>> gxszxtbevoVar);

    @ojitshcjhn("subscription/order/")
    Object zoijcleaow(@om.iobyxmoadg SubscriptionOrderIdRequest subscriptionOrderIdRequest, gxszxtbevo<? super BasicResponse<SubscriptionOrderDto>> gxszxtbevoVar);
}
