package df0;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import lf0.ConfirmPopupRequest;
import lf0.GetPopupRequest;
import lg.gxszxtbevo;
import mf0.LoymaxPopupDto;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Ldf0/iobyxmoadg;", "", "Llf0/zoijcleaow;", "request", "Lru/myspar/core/network/model/BasicResponse;", "", "Lmf0/ppxfxbqfkf;", "zoijcleaow", "(Llf0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Llf0/iobyxmoadg;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Llf0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("popup/confirm")
    Object iobyxmoadg(@om.iobyxmoadg ConfirmPopupRequest confirmPopupRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("popup")
    Object zoijcleaow(@om.iobyxmoadg GetPopupRequest getPopupRequest, gxszxtbevo<? super BasicResponse<List<LoymaxPopupDto>>> gxszxtbevoVar);
}
