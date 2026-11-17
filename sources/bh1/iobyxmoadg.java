package bh1;

import eh1.PopupConfirmRequest;
import eh1.PopupGetRequest;
import fh1.PopupDto;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lbh1/iobyxmoadg;", "", "Leh1/zoijcleaow;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lfh1/nufgyqmvbu;", "iobyxmoadg", "(Leh1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Leh1/iobyxmoadg;", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Leh1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "popups_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("spar-banner/popup")
    Object iobyxmoadg(@om.iobyxmoadg PopupGetRequest zoijcleaowVar, gxszxtbevo<? super BasicResponse<PopupDto>> gxszxtbevoVar);

    @ojitshcjhn("spar-banner/popup/status")
    Object zoijcleaow(@om.iobyxmoadg PopupConfirmRequest iobyxmoadgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
