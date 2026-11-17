package ww0;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import ky0.PurchaseHistoryDetailsDto;
import ky0.PurchasesDto;
import om.ojitshcjhn;
import px0.PurchasesHistoryDetailsRequest;
import px0.PurchasesHistoryRequest;
import px0.RepeatPurchaseRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lww0/btonecajqb;", "", "Lpx0/agtfadlqog;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lky0/esjtqupxsv;", "zoijcleaow", "(Lpx0/agtfadlqog;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/wflxmlrfwp;", "Lky0/jyumaefscl;", "iobyxmoadg", "(Lpx0/wflxmlrfwp;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/rgvfuqvkyq;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lpx0/rgvfuqvkyq;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface btonecajqb {
    @ojitshcjhn("purchases/detail/")
    Object iobyxmoadg(@om.iobyxmoadg PurchasesHistoryDetailsRequest wflxmlrfwpVar, lg.gxszxtbevo<? super BasicResponse<PurchaseHistoryDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("purchases/retry/")
    Object ppxfxbqfkf(@om.iobyxmoadg RepeatPurchaseRequest rgvfuqvkyqVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("purchases/list/")
    Object zoijcleaow(@om.iobyxmoadg PurchasesHistoryRequest agtfadlqogVar, lg.gxszxtbevo<? super BasicResponse<PurchasesDto>> gxszxtbevoVar);
}
