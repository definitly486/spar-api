package ae1;

import gg.wwaezpbzkn;
import gk.cdpycssgdh;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import xd1.NotRatedOrderDto;
import xd1.SetBonusReviewRequest;
import yd1.ConfirmPopupTypesRequest;
import zd1.BonusReviewDto;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lae1/iobyxmoadg;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lzd1/iobyxmoadg;", "ppxfxbqfkf", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lxd1/lqeggnwhkg;", "request", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lxd1/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lxd1/wkgbmnqykc;", "zoijcleaow", "Lgk/cdpycssgdh;", "iobyxmoadg", "Lyd1/iobyxmoadg;", "wkgbmnqykc", "(Lyd1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("other/review_points/")
    Object eablkybsjg(@om.iobyxmoadg SetBonusReviewRequest lqeggnwhkgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("other/popup_types/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<cdpycssgdh>> gxszxtbevoVar);

    @om.gxszxtbevo("other/review_points/")
    Object ppxfxbqfkf(gxszxtbevo<? super BasicResponse<BonusReviewDto>> gxszxtbevoVar);

    @ojitshcjhn("other/popup_types/")
    Object wkgbmnqykc(@om.iobyxmoadg ConfirmPopupTypesRequest iobyxmoadgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("orders/notrated/")
    Object zoijcleaow(gxszxtbevo<? super BasicResponse<NotRatedOrderDto>> gxszxtbevoVar);
}
