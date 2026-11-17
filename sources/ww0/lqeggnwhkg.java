package ww0;

import jx0.SpecialBannerMapDto;
import kotlin.Metadata;
import ky0.OrderDetailsDto;
import om.ojitshcjhn;
import px0.GetFeedbackVariantsRequest;
import qx0.GetSpecialBannerMapRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lww0/lqeggnwhkg;", "", "Lqx0/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Ljx0/ojitshcjhn;", "iobyxmoadg", "(Lqx0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/eablkybsjg;", "Lky0/eablkybsjg;", "zoijcleaow", "(Lpx0/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface lqeggnwhkg {
    @ojitshcjhn("other/map/")
    Object iobyxmoadg(@om.iobyxmoadg GetSpecialBannerMapRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<SpecialBannerMapDto>> gxszxtbevoVar);

    @ojitshcjhn("other/refs/")
    Object zoijcleaow(@om.iobyxmoadg GetFeedbackVariantsRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<OrderDetailsDto>> gxszxtbevoVar);
}
