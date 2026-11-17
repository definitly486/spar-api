package gm1;

import im1.GetRateProductRequest;
import im1.SendRateProductReviewData;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import qm1.RateProductItemDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lgm1/iobyxmoadg;", "", "Lim1/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lqm1/iobyxmoadg;", "zoijcleaow", "(Lim1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lim1/zoijcleaow;", "ppxfxbqfkf", "(Lim1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("reviews/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<RateProductItemDto>> gxszxtbevoVar);

    @ojitshcjhn("reviews/")
    Object ppxfxbqfkf(@om.iobyxmoadg SendRateProductReviewData sendRateProductReviewData, gxszxtbevo<? super BasicResponse<RateProductItemDto>> gxszxtbevoVar);

    @ojitshcjhn("reviews/")
    Object zoijcleaow(@om.iobyxmoadg GetRateProductRequest getRateProductRequest, gxszxtbevo<? super BasicResponse<RateProductItemDto>> gxszxtbevoVar);
}
