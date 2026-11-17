package q92;

import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import r92.GetTipsRequest;
import r92.LinkDto;
import r92.SendTipsRequest;
import r92.TipsOrderParamsDto;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lq92/iobyxmoadg;", "", "Lr92/iobyxmoadg;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lr92/ojitshcjhn;", "iobyxmoadg", "(Lr92/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lr92/gtknphoqwx;", "Lr92/zoijcleaow;", "zoijcleaow", "(Lr92/gtknphoqwx;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("order/tips/")
    Object iobyxmoadg(@om.iobyxmoadg GetTipsRequest getTipsRequest, gxszxtbevo<? super BasicResponse<TipsOrderParamsDto>> gxszxtbevoVar);

    @ojitshcjhn("order/tips/confirm/")
    Object zoijcleaow(@om.iobyxmoadg SendTipsRequest sendTipsRequest, gxszxtbevo<? super BasicResponse<LinkDto>> gxszxtbevoVar);
}
