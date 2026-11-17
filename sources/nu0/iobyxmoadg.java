package nu0;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import om.gxszxtbevo;
import om.ojitshcjhn;
import ou0.ChooseLoyaltyCategoriesRequest;
import ou0.LoyaltyCategoriesResponse;
import ou0.LoyaltyInfoResponse;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lnu0/iobyxmoadg;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lou0/eablkybsjg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lou0/zoijcleaow;", "zoijcleaow", "Lou0/iobyxmoadg;", "request", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lou0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("loyalty/info/")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<LoyaltyInfoResponse>> gxszxtbevoVar);

    @ojitshcjhn("loyalty/categories_choose/")
    Object ppxfxbqfkf(@om.iobyxmoadg ChooseLoyaltyCategoriesRequest chooseLoyaltyCategoriesRequest, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @gxszxtbevo("loyalty/categories/")
    Object zoijcleaow(lg.gxszxtbevo<? super BasicResponse<LoyaltyCategoriesResponse>> gxszxtbevoVar);
}
