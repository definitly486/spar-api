package wt0;

import au0.CreateOrUpdateDeliveryAddressResponse;
import au0.GetAddressesResponseDto;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import om.gxszxtbevo;
import om.ojitshcjhn;
import om.zdlpuopuiu;
import om.zoijcleaow;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import zt0.CreateOrUpdateDeliveryAddressRequest;
import zt0.CreatePickUpAddressRequest;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lwt0/iobyxmoadg;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lau0/ppxfxbqfkf;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzt0/iobyxmoadg;", "request", "Lau0/zoijcleaow;", "ppxfxbqfkf", "(Lzt0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzt0/zoijcleaow;", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lzt0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "", "addressId", "deliveryType", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("user/addresses/")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<GetAddressesResponseDto>> gxszxtbevoVar);

    @ojitshcjhn("user/delivery-address/")
    Object ppxfxbqfkf(@om.iobyxmoadg CreateOrUpdateDeliveryAddressRequest createOrUpdateDeliveryAddressRequest, lg.gxszxtbevo<? super BasicResponse<CreateOrUpdateDeliveryAddressResponse>> gxszxtbevoVar);

    @ojitshcjhn("user/pickup-address/")
    Object wkgbmnqykc(@om.iobyxmoadg CreatePickUpAddressRequest createPickUpAddressRequest, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @zoijcleaow("user/address/")
    Object zoijcleaow(@zdlpuopuiu("id") String str, @zdlpuopuiu("deliveryType") String str2, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
