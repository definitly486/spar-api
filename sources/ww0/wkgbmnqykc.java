package ww0;

import dy0.CatalogSectionsDto;
import dy0.GetRecommendationFeedsResponse;
import dy0.ProductDetailsDto;
import dy0.RecommendationsDto;
import gy0.GetComboSetResponse;
import kotlin.Metadata;
import ly0.ProductsDto;
import ly0.ProductsWithSelectionDto;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ux0.GetCatalogRequest;
import ux0.GetComboSetRequest;
import ux0.GetProductDetailsRequest;
import ux0.GetProductsRequest;
import ux0.GetProductsWithSelectionRequest;
import ux0.GetRecommendationFeedsRequest;
import ux0.GetRecommendationsRequest;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lww0/wkgbmnqykc;", "", "Lux0/zoijcleaow;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Ldy0/wkgbmnqykc;", "iobyxmoadg", "(Lux0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lux0/eablkybsjg;", "Lly0/wflxmlrfwp;", "nufgyqmvbu", "(Lux0/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lux0/gxszxtbevo;", "Lly0/rgvfuqvkyq;", "zoijcleaow", "(Lux0/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "eablkybsjg", "Lux0/wkgbmnqykc;", "Ldy0/gxszxtbevo;", "ppxfxbqfkf", "(Lux0/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lux0/nufgyqmvbu;", "Ldy0/dxjokdxxww;", "wkgbmnqykc", "(Lux0/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lux0/ppxfxbqfkf;", "Lgy0/eablkybsjg;", "gxszxtbevo", "(Lux0/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lux0/lqeggnwhkg;", "Ldy0/eablkybsjg;", "lqeggnwhkg", "(Lux0/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface wkgbmnqykc {
    @ojitshcjhn("catalog/favorite/")
    Object eablkybsjg(@om.iobyxmoadg GetProductsRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<ProductsDto>> gxszxtbevoVar);

    @ojitshcjhn("catalog/combo/")
    Object gxszxtbevo(@om.iobyxmoadg GetComboSetRequest ppxfxbqfkfVar, lg.gxszxtbevo<? super BasicResponse<GetComboSetResponse>> gxszxtbevoVar);

    @ojitshcjhn("catalog/sections/")
    Object iobyxmoadg(@om.iobyxmoadg GetCatalogRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<CatalogSectionsDto>> gxszxtbevoVar);

    @ojitshcjhn("catalog/items_feed/")
    Object lqeggnwhkg(@om.iobyxmoadg GetRecommendationFeedsRequest lqeggnwhkgVar, lg.gxszxtbevo<? super BasicResponse<GetRecommendationFeedsResponse>> gxszxtbevoVar);

    @ojitshcjhn("catalog/list/")
    Object nufgyqmvbu(@om.iobyxmoadg GetProductsRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<ProductsDto>> gxszxtbevoVar);

    @ojitshcjhn("catalog/product/")
    Object ppxfxbqfkf(@om.iobyxmoadg GetProductDetailsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<ProductDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("catalog/recommendations/")
    Object wkgbmnqykc(@om.iobyxmoadg GetRecommendationsRequest nufgyqmvbuVar, lg.gxszxtbevo<? super BasicResponse<RecommendationsDto>> gxszxtbevoVar);

    @ojitshcjhn("catalog/selection/")
    Object zoijcleaow(@om.iobyxmoadg GetProductsWithSelectionRequest gxszxtbevoVar, lg.gxszxtbevo<? super BasicResponse<ProductsWithSelectionDto>> gxszxtbevoVar2);
}
