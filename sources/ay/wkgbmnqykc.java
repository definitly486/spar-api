package ay;

import az.GetCatalogRequest;
import az.GetComboSetRequest;
import az.GetProductDetailsRequest;
import az.GetProductsRequest;
import az.GetProductsWithSelectionRequest;
import az.GetRecommendationFeedsRequest;
import az.GetRecommendationsRequest;
import kotlin.Metadata;
import lz.CatalogSectionsDto;
import lz.GetRecommendationFeedsResponse;
import lz.ProductDetailsDto;
import lz.RecommendationsDto;
import oz.GetComboSetResponse;
import ru.myspar.core.network.model.BasicResponse;
import tz.ProductsDto;
import tz.ProductsWithSelectionDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lay/wkgbmnqykc;", "", "Laz/zoijcleaow;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Llz/wkgbmnqykc;", "zoijcleaow", "(Laz/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Laz/eablkybsjg;", "Ltz/draadjrbmk;", "lqeggnwhkg", "(Laz/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Laz/gxszxtbevo;", "Ltz/agtfadlqog;", "nufgyqmvbu", "(Laz/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "gxszxtbevo", "Laz/wkgbmnqykc;", "Llz/gxszxtbevo;", "wkgbmnqykc", "(Laz/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Laz/nufgyqmvbu;", "Llz/dxjokdxxww;", "eablkybsjg", "(Laz/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Laz/ppxfxbqfkf;", "Loz/wkgbmnqykc;", "iobyxmoadg", "(Laz/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Laz/lqeggnwhkg;", "Llz/eablkybsjg;", "ppxfxbqfkf", "(Laz/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface wkgbmnqykc {
    @om.ojitshcjhn("catalog/recommendations/")
    Object eablkybsjg(@om.iobyxmoadg GetRecommendationsRequest nufgyqmvbuVar, lg.gxszxtbevo<? super BasicResponse<RecommendationsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/favorite/")
    Object gxszxtbevo(@om.iobyxmoadg GetProductsRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<ProductsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/combo/")
    Object iobyxmoadg(@om.iobyxmoadg GetComboSetRequest ppxfxbqfkfVar, lg.gxszxtbevo<? super BasicResponse<GetComboSetResponse>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/list/")
    Object lqeggnwhkg(@om.iobyxmoadg GetProductsRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<ProductsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/selection/")
    Object nufgyqmvbu(@om.iobyxmoadg GetProductsWithSelectionRequest gxszxtbevoVar, lg.gxszxtbevo<? super BasicResponse<ProductsWithSelectionDto>> gxszxtbevoVar2);

    @om.ojitshcjhn("catalog/items_feed/")
    Object ppxfxbqfkf(@om.iobyxmoadg GetRecommendationFeedsRequest lqeggnwhkgVar, lg.gxszxtbevo<? super BasicResponse<GetRecommendationFeedsResponse>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/product/")
    Object wkgbmnqykc(@om.iobyxmoadg GetProductDetailsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<ProductDetailsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("catalog/sections/")
    Object zoijcleaow(@om.iobyxmoadg GetCatalogRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<CatalogSectionsDto>> gxszxtbevoVar);
}
