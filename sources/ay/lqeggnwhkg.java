package ay;

import cz.OrderEditRequest;
import d10.OrderChangeProductsRequest;
import ez.OrderPaymentsRequest;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import o00.ConfirmProductReplacesRequest;
import ru.myspar.core.network.model.BasicResponse;
import sz.ChangeOrderInfoDto;
import sz.OrderDetailsDto;
import sz.OrderEditResultDto;
import sz.OrdersDto;
import uy.CancelOrderRequest;
import uy.GetOrdersRequest;
import uy.ModifyOrderRequest;
import uy.OrderDetailsRequest;
import uy.RateOrderRequest;
import uy.UpdatePickupStatusRequest;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b%\u0010 J \u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lay/lqeggnwhkg;", "", "Luy/gtknphoqwx;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lsz/kcexrzcfyt;", "eablkybsjg", "(Luy/gtknphoqwx;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/ojitshcjhn;", "orderDetailsRequest", "Lsz/wkgbmnqykc;", "zoijcleaow", "(Luy/ojitshcjhn;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/zoijcleaow;", "Lgg/wwaezpbzkn;", "dxjokdxxww", "(Luy/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/wflxmlrfwp;", "lqeggnwhkg", "(Luy/wflxmlrfwp;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/zdlpuopuiu;", "nufgyqmvbu", "(Luy/zdlpuopuiu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lez/iobyxmoadg;", "iobyxmoadg", "(Lez/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/lereixgezr;", "gxszxtbevo", "(Luy/lereixgezr;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcz/zoijcleaow;", "Lsz/gtknphoqwx;", "gtknphoqwx", "(Lcz/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ld10/zoijcleaow;", "Lsz/iobyxmoadg;", "btonecajqb", "(Ld10/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "ppxfxbqfkf", "Lo00/eablkybsjg;", "wkgbmnqykc", "(Lo00/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface lqeggnwhkg {
    @om.ojitshcjhn("orders/")
    Object btonecajqb(@om.iobyxmoadg OrderChangeProductsRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<ChangeOrderInfoDto>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/cancel/")
    Object dxjokdxxww(@om.iobyxmoadg CancelOrderRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/list/")
    Object eablkybsjg(@om.iobyxmoadg GetOrdersRequest gtknphoqwxVar, lg.gxszxtbevo<? super BasicResponse<OrdersDto>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/edit/")
    Object gtknphoqwx(@om.iobyxmoadg OrderEditRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<OrderEditResultDto>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/tracking/")
    Object gxszxtbevo(@om.iobyxmoadg UpdatePickupStatusRequest lereixgezrVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/payment/")
    Object iobyxmoadg(@om.iobyxmoadg OrderPaymentsRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/retry/")
    Object lqeggnwhkg(@om.iobyxmoadg ModifyOrderRequest wflxmlrfwpVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/rate/")
    Object nufgyqmvbu(@om.iobyxmoadg RateOrderRequest zdlpuopuiuVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/edit/")
    Object ppxfxbqfkf(@om.iobyxmoadg OrderEditRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/replaces_selected/")
    Object wkgbmnqykc(@om.iobyxmoadg ConfirmProductReplacesRequest confirmProductReplacesRequest, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("orders/detail/")
    Object zoijcleaow(@om.iobyxmoadg OrderDetailsRequest ojitshcjhnVar, lg.gxszxtbevo<? super BasicResponse<OrderDetailsDto>> gxszxtbevoVar);
}
