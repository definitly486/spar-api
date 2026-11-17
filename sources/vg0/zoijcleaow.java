package vg0;

import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;
import sg0.BannersDto;
import sg0.BrandsDto;
import sg0.GetBannersRequest;
import sg0.GetBrandsRequest;
import sg0.OrderStatusResponse;
import uy.PromotionRequest;
import uz.PromotionDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lvg0/zoijcleaow;", "", "Lsg0/nufgyqmvbu;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lsg0/gxszxtbevo;", "ppxfxbqfkf", "(Lsg0/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsg0/gtknphoqwx;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsg0/lqeggnwhkg;", "Lsg0/wkgbmnqykc;", "wkgbmnqykc", "(Lsg0/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/vdvldrhtss;", "body", "Luz/iobyxmoadg;", "zoijcleaow", "(Luy/vdvldrhtss;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface zoijcleaow {
    @ojitshcjhn("orders/status/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<OrderStatusResponse>> gxszxtbevoVar);

    @ojitshcjhn("catalog/brands/")
    Object ppxfxbqfkf(@om.iobyxmoadg GetBrandsRequest nufgyqmvbuVar, gxszxtbevo<? super BasicResponse<BrandsDto>> gxszxtbevoVar);

    @ojitshcjhn("other/banners/")
    Object wkgbmnqykc(@om.iobyxmoadg GetBannersRequest lqeggnwhkgVar, gxszxtbevo<? super BasicResponse<BannersDto>> gxszxtbevoVar);

    @ojitshcjhn("promo/info/")
    Object zoijcleaow(@om.iobyxmoadg PromotionRequest vdvldrhtssVar, gxszxtbevo<? super BasicResponse<PromotionDto>> gxszxtbevoVar);
}
