package ae1;

import kotlin.Metadata;
import lg.gxszxtbevo;
import my0.PromotionDto;
import om.ojitshcjhn;
import px0.PromotionRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import xd1.BrandsDto;
import xd1.GetBrandsRequest;
import xd1.OrderStatusResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lae1/zoijcleaow;", "", "Lxd1/ppxfxbqfkf;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lxd1/zoijcleaow;", "ppxfxbqfkf", "(Lxd1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lxd1/gxszxtbevo;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/draadjrbmk;", "body", "Lmy0/iobyxmoadg;", "zoijcleaow", "(Lpx0/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface zoijcleaow {
    @ojitshcjhn("orders/status/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<OrderStatusResponse>> gxszxtbevoVar);

    @ojitshcjhn("catalog/brands/")
    Object ppxfxbqfkf(@om.iobyxmoadg GetBrandsRequest ppxfxbqfkfVar, gxszxtbevo<? super BasicResponse<BrandsDto>> gxszxtbevoVar);

    @ojitshcjhn("promo/info/")
    Object zoijcleaow(@om.iobyxmoadg PromotionRequest draadjrbmkVar, gxszxtbevo<? super BasicResponse<PromotionDto>> gxszxtbevoVar);
}
