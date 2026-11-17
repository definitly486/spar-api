package tm1;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wm1.GetReviewRequest;
import wm1.SetReviewRequest;
import xm1.ReviewsDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ltm1/iobyxmoadg;", "", "Lwm1/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lxm1/wkgbmnqykc;", "iobyxmoadg", "(Lwm1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lwm1/zoijcleaow;", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lwm1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("reviews/list/")
    Object iobyxmoadg(@om.iobyxmoadg GetReviewRequest getReviewRequest, gxszxtbevo<? super BasicResponse<ReviewsDto>> gxszxtbevoVar);

    @ojitshcjhn("reviews/set/")
    Object zoijcleaow(@om.iobyxmoadg SetReviewRequest setReviewRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
