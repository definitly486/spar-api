package ww0;

import kotlin.Metadata;
import om.ojitshcjhn;
import py0.RestaurantDetailsDto;
import py0.RestaurantProductDetailsDto;
import py0.RestaurantsDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wx0.GetRestaurantInfoRequest;
import wx0.GetRestaurantProductRequest;
import wx0.GetRestaurantsRequest;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lww0/nufgyqmvbu;", "", "Lwx0/ppxfxbqfkf;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lpy0/gxszxtbevo;", "iobyxmoadg", "(Lwx0/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lwx0/iobyxmoadg;", "Lpy0/iobyxmoadg;", "zoijcleaow", "(Lwx0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lwx0/zoijcleaow;", "Lpy0/ppxfxbqfkf;", "ppxfxbqfkf", "(Lwx0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface nufgyqmvbu {
    @ojitshcjhn("partners/list/")
    Object iobyxmoadg(@om.iobyxmoadg GetRestaurantsRequest ppxfxbqfkfVar, lg.gxszxtbevo<? super BasicResponse<RestaurantsDto>> gxszxtbevoVar);

    @ojitshcjhn("partners/product/")
    Object ppxfxbqfkf(@om.iobyxmoadg GetRestaurantProductRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<RestaurantProductDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("partners/info/")
    Object zoijcleaow(@om.iobyxmoadg GetRestaurantInfoRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<RestaurantDetailsDto>> gxszxtbevoVar);
}
