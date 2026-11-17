package ay;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import ru.myspar.core.network.model.BasicResponse;
import sz.PurchaseHistoryDetailsDto;
import sz.PurchasesDto;
import uy.PurchasesHistoryDetailsRequest;
import uy.PurchasesHistoryRequest;
import uy.RepeatPurchaseRequest;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lay/gtknphoqwx;", "", "Luy/kcexrzcfyt;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lsz/cqumvgiudr;", "zoijcleaow", "(Luy/kcexrzcfyt;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/oxmwwwfdhm;", "Lsz/yggfygwlhe;", "ppxfxbqfkf", "(Luy/oxmwwwfdhm;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/jyumaefscl;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Luy/jyumaefscl;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface gtknphoqwx {
    @om.ojitshcjhn("purchases/retry/")
    Object iobyxmoadg(@om.iobyxmoadg RepeatPurchaseRequest jyumaefsclVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("purchases/detail/")
    Object ppxfxbqfkf(@om.iobyxmoadg PurchasesHistoryDetailsRequest oxmwwwfdhmVar, lg.gxszxtbevo<? super BasicResponse<PurchaseHistoryDetailsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("purchases/list/")
    Object zoijcleaow(@om.iobyxmoadg PurchasesHistoryRequest kcexrzcfytVar, lg.gxszxtbevo<? super BasicResponse<PurchasesDto>> gxszxtbevoVar);
}
