package c12;

import f12.GetReviewRequest;
import f12.SetReviewRequest;
import g12.ReviewsDto;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lc12/iobyxmoadg;", "", "Lf12/iobyxmoadg;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lg12/wkgbmnqykc;", "iobyxmoadg", "(Lf12/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lf12/zoijcleaow;", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lf12/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("reviews/list/")
    Object iobyxmoadg(@om.iobyxmoadg GetReviewRequest getReviewRequest, gxszxtbevo<? super BasicResponse<ReviewsDto>> gxszxtbevoVar);

    @ojitshcjhn("reviews/set/")
    Object zoijcleaow(@om.iobyxmoadg SetReviewRequest setReviewRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
