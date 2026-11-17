package vg0;

import gg.wwaezpbzkn;
import gk.cdpycssgdh;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;
import sg0.GetBannersRequest;
import sg0.NotRatedOrderDto;
import sg0.PopupsDto;
import sg0.SetBonusReviewRequest;
import tg0.ConfirmPopupTypesRequest;
import ug0.BonusReviewDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H§@¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@¢\u0006\u0004\b\u0015\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lvg0/iobyxmoadg;", "", "Lsg0/lqeggnwhkg;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lsg0/wflxmlrfwp;", "gxszxtbevo", "(Lsg0/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lgk/cdpycssgdh;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Ltg0/iobyxmoadg;", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Ltg0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lug0/iobyxmoadg;", "ppxfxbqfkf", "Lsg0/agtfadlqog;", "eablkybsjg", "(Lsg0/agtfadlqog;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsg0/dxjokdxxww;", "zoijcleaow", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("other/review_points/")
    Object eablkybsjg(@om.iobyxmoadg SetBonusReviewRequest agtfadlqogVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("other/popups/")
    Object gxszxtbevo(@om.iobyxmoadg GetBannersRequest lqeggnwhkgVar, gxszxtbevo<? super BasicResponse<PopupsDto>> gxszxtbevoVar);

    @om.gxszxtbevo("other/popup_types/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<cdpycssgdh>> gxszxtbevoVar);

    @om.gxszxtbevo("other/review_points/")
    Object ppxfxbqfkf(gxszxtbevo<? super BasicResponse<BonusReviewDto>> gxszxtbevoVar);

    @ojitshcjhn("other/popup_types/")
    Object wkgbmnqykc(@om.iobyxmoadg ConfirmPopupTypesRequest iobyxmoadgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("orders/notrated/")
    Object zoijcleaow(gxszxtbevo<? super BasicResponse<NotRatedOrderDto>> gxszxtbevoVar);
}
