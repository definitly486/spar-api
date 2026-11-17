package ay;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kz.AddProductListToCartResponseDto;
import kz.AddToBasketInfoDto;
import kz.BasketOrderDto;
import kz.CartSetParamsRequest;
import kz.ChangeBasketInfoDto;
import kz.MakeOrderRequest;
import kz.OrderCommentsDto;
import kz.OrderCommentsRequest;
import ru.myspar.core.network.model.BasicResponse;
import s00.AddProductListToCartRequest;
import s00.CartChangeProductsRequest;
import uy.ClearCartRequest;
import uy.EditCartProductRequest;
import zy.CartDto;
import zy.CartSetReceiverResultDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lay/zoijcleaow;", "", "Luy/nufgyqmvbu;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lkz/zoijcleaow;", "eablkybsjg", "(Luy/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ls00/zoijcleaow;", "Lkz/eablkybsjg;", "iobyxmoadg", "(Ls00/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ls00/iobyxmoadg;", "Lkz/iobyxmoadg;", "nufgyqmvbu", "(Ls00/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkz/wkgbmnqykc;", "Lzy/dxjokdxxww;", "wkgbmnqykc", "(Lkz/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkz/gtknphoqwx;", "lqeggnwhkg", "Lkz/btonecajqb;", "Lkz/ppxfxbqfkf;", "gxszxtbevo", "(Lkz/btonecajqb;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkz/lqeggnwhkg;", "Lzy/zoijcleaow;", "zoijcleaow", "(Lkz/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/eablkybsjg;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Luy/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkz/draadjrbmk;", "dxjokdxxww", "(Lkz/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface zoijcleaow {
    @om.ojitshcjhn("form/order_comments/")
    Object dxjokdxxww(@om.iobyxmoadg OrderCommentsRequest draadjrbmkVar, lg.gxszxtbevo<? super BasicResponse<OrderCommentsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/add/")
    Object eablkybsjg(@om.iobyxmoadg EditCartProductRequest nufgyqmvbuVar, lg.gxszxtbevo<? super BasicResponse<AddToBasketInfoDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/order/")
    Object gxszxtbevo(@om.iobyxmoadg MakeOrderRequest btonecajqbVar, lg.gxszxtbevo<? super BasicResponse<BasketOrderDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/")
    Object iobyxmoadg(@om.iobyxmoadg CartChangeProductsRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<ChangeBasketInfoDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/set_params/")
    Object lqeggnwhkg(@om.iobyxmoadg CartSetParamsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<OrderCommentsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/addm/")
    Object nufgyqmvbu(@om.iobyxmoadg AddProductListToCartRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<AddProductListToCartResponseDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/clear/")
    Object ppxfxbqfkf(@om.iobyxmoadg ClearCartRequest eablkybsjgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/set_params/")
    Object wkgbmnqykc(@om.iobyxmoadg CartSetParamsRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<CartSetReceiverResultDto>> gxszxtbevoVar);

    @om.ojitshcjhn("basket/order/")
    Object zoijcleaow(@om.iobyxmoadg kz.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo<? super BasicResponse<CartDto>> gxszxtbevoVar);
}
