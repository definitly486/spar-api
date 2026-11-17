package ww0;

import gg.wwaezpbzkn;
import gz0.ConfirmProductReplacesRequest;
import kotlin.Metadata;
import ky0.ChangeOrderInfoDto;
import ky0.OrderDetailsDto;
import ky0.OrderEditResultDto;
import ky0.OrdersDto;
import om.ojitshcjhn;
import px0.CancelOrderRequest;
import px0.GetOrdersRequest;
import px0.ModifyOrderRequest;
import px0.OrderDetailsRequest;
import px0.RateOrderRequest;
import px0.UpdatePickupStatusRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import tz0.OrderChangeProductsRequest;
import vx0.OrderEditRequest;
import xx0.OrderPaymentsRequest;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b%\u0010 J \u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lww0/gxszxtbevo;", "", "Lpx0/gxszxtbevo;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lky0/zdlpuopuiu;", "zoijcleaow", "(Lpx0/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/btonecajqb;", "orderDetailsRequest", "Lky0/eablkybsjg;", "gxszxtbevo", "(Lpx0/btonecajqb;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/iobyxmoadg;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lpx0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/nufgyqmvbu;", "ppxfxbqfkf", "(Lpx0/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/ojitshcjhn;", "eablkybsjg", "(Lpx0/ojitshcjhn;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lxx0/iobyxmoadg;", "nufgyqmvbu", "(Lxx0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/kcexrzcfyt;", "gtknphoqwx", "(Lpx0/kcexrzcfyt;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lvx0/zoijcleaow;", "Lky0/draadjrbmk;", "dxjokdxxww", "(Lvx0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ltz0/zoijcleaow;", "Lky0/iobyxmoadg;", "wkgbmnqykc", "(Ltz0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "btonecajqb", "Lgz0/eablkybsjg;", "lqeggnwhkg", "(Lgz0/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface gxszxtbevo {
    @ojitshcjhn("orders/edit/")
    Object btonecajqb(@om.iobyxmoadg OrderEditRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/edit/")
    Object dxjokdxxww(@om.iobyxmoadg OrderEditRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<OrderEditResultDto>> gxszxtbevoVar);

    @ojitshcjhn("orders/rate/")
    Object eablkybsjg(@om.iobyxmoadg RateOrderRequest ojitshcjhnVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/tracking/")
    Object gtknphoqwx(@om.iobyxmoadg UpdatePickupStatusRequest kcexrzcfytVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/detail/")
    Object gxszxtbevo(@om.iobyxmoadg OrderDetailsRequest btonecajqbVar, lg.gxszxtbevo<? super BasicResponse<OrderDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("orders/cancel/")
    Object iobyxmoadg(@om.iobyxmoadg CancelOrderRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/replaces_selected/")
    Object lqeggnwhkg(@om.iobyxmoadg ConfirmProductReplacesRequest confirmProductReplacesRequest, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/payment/")
    Object nufgyqmvbu(@om.iobyxmoadg OrderPaymentsRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/retry/")
    Object ppxfxbqfkf(@om.iobyxmoadg ModifyOrderRequest nufgyqmvbuVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("orders/")
    Object wkgbmnqykc(@om.iobyxmoadg OrderChangeProductsRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<ChangeOrderInfoDto>> gxszxtbevoVar);

    @ojitshcjhn("orders/list/")
    Object zoijcleaow(@om.iobyxmoadg GetOrdersRequest gxszxtbevoVar, lg.gxszxtbevo<? super BasicResponse<OrdersDto>> gxszxtbevoVar2);
}
