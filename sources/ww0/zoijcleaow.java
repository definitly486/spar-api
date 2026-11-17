package ww0;

import cy0.AddProductListToCartResponseDto;
import cy0.AddToBasketInfoDto;
import cy0.BasketOrderDto;
import cy0.CartSetParamsRequest;
import cy0.ChangeBasketInfoDto;
import cy0.MakeOrderRequest;
import cy0.OrderCommentsDto;
import cy0.OrderCommentsRequest;
import gg.wwaezpbzkn;
import jz0.AddProductListToCartRequest;
import jz0.CartChangeProductsRequest;
import kotlin.Metadata;
import om.ojitshcjhn;
import px0.ClearCartRequest;
import px0.EditCartProductRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import tx0.CartDto;
import tx0.CartSetReceiverResultDto;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lww0/zoijcleaow;", "", "Lpx0/wkgbmnqykc;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lcy0/zoijcleaow;", "wkgbmnqykc", "(Lpx0/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljz0/zoijcleaow;", "Lcy0/eablkybsjg;", "nufgyqmvbu", "(Ljz0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljz0/iobyxmoadg;", "Lcy0/iobyxmoadg;", "eablkybsjg", "(Ljz0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcy0/wkgbmnqykc;", "Ltx0/dxjokdxxww;", "iobyxmoadg", "(Lcy0/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcy0/gtknphoqwx;", "zoijcleaow", "Lcy0/btonecajqb;", "Lcy0/ppxfxbqfkf;", "lqeggnwhkg", "(Lcy0/btonecajqb;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcy0/lqeggnwhkg;", "Ltx0/zoijcleaow;", "dxjokdxxww", "(Lcy0/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lpx0/zoijcleaow;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lpx0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcy0/draadjrbmk;", "gxszxtbevo", "(Lcy0/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface zoijcleaow {
    @ojitshcjhn("basket/order/")
    Object dxjokdxxww(@om.iobyxmoadg cy0.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo<? super BasicResponse<CartDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/addm/")
    Object eablkybsjg(@om.iobyxmoadg AddProductListToCartRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<AddProductListToCartResponseDto>> gxszxtbevoVar);

    @ojitshcjhn("form/order_comments/")
    Object gxszxtbevo(@om.iobyxmoadg OrderCommentsRequest draadjrbmkVar, lg.gxszxtbevo<? super BasicResponse<OrderCommentsDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/set_params/")
    Object iobyxmoadg(@om.iobyxmoadg CartSetParamsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<CartSetReceiverResultDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/order/")
    Object lqeggnwhkg(@om.iobyxmoadg MakeOrderRequest btonecajqbVar, lg.gxszxtbevo<? super BasicResponse<BasketOrderDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/")
    Object nufgyqmvbu(@om.iobyxmoadg CartChangeProductsRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<ChangeBasketInfoDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/clear/")
    Object ppxfxbqfkf(@om.iobyxmoadg ClearCartRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("basket/add/")
    Object wkgbmnqykc(@om.iobyxmoadg EditCartProductRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<AddToBasketInfoDto>> gxszxtbevoVar);

    @ojitshcjhn("basket/set_params/")
    Object zoijcleaow(@om.iobyxmoadg CartSetParamsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<OrderCommentsDto>> gxszxtbevoVar);
}
