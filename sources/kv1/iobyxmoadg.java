package kv1;

import kotlin.Metadata;
import lg.gxszxtbevo;
import lv1.GetTipsRequest;
import lv1.LinkDto;
import lv1.SendTipsRequest;
import lv1.TipsOrderParamsDto;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lkv1/iobyxmoadg;", "", "Llv1/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Llv1/ojitshcjhn;", "iobyxmoadg", "(Llv1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Llv1/gtknphoqwx;", "Llv1/zoijcleaow;", "zoijcleaow", "(Llv1/gtknphoqwx;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("order/tips/")
    Object iobyxmoadg(@om.iobyxmoadg GetTipsRequest getTipsRequest, gxszxtbevo<? super BasicResponse<TipsOrderParamsDto>> gxszxtbevoVar);

    @ojitshcjhn("order/tips/confirm/")
    Object zoijcleaow(@om.iobyxmoadg SendTipsRequest sendTipsRequest, gxszxtbevo<? super BasicResponse<LinkDto>> gxszxtbevoVar);
}
