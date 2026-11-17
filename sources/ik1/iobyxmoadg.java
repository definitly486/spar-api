package ik1;

import gg.wwaezpbzkn;
import jk1.AddProductToListRequest;
import jk1.CopyPurchaseListRequest;
import jk1.CreatePurchaseListRequest;
import jk1.DeletePurchaseListRequest;
import jk1.PurchaseListDetailsRequest;
import jk1.PurchasesListAddFromSetRequest;
import jk1.PurchasesListAddFromSetResponse;
import jk1.PurchasesListChangeStatusRequest;
import kk1.CopyPurchaseListDto;
import kk1.NewPurchaseListDto;
import kk1.PurchaseListDetailsDto;
import kk1.PurchaseListsDto;
import kk1.SharedPurchaseListDetailsDto;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0014\u0010\u0012J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lik1/iobyxmoadg;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lkk1/lqeggnwhkg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/ppxfxbqfkf;", "request", "Lkk1/zoijcleaow;", "wkgbmnqykc", "(Ljk1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/wkgbmnqykc;", "Lgg/wwaezpbzkn;", "gxszxtbevo", "(Ljk1/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/eablkybsjg;", "Lkk1/eablkybsjg;", "lqeggnwhkg", "(Ljk1/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkk1/dxjokdxxww;", "dxjokdxxww", "Ljk1/iobyxmoadg;", "zoijcleaow", "(Ljk1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/zoijcleaow;", "Lkk1/iobyxmoadg;", "eablkybsjg", "(Ljk1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/nufgyqmvbu;", "ppxfxbqfkf", "(Ljk1/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ljk1/gxszxtbevo;", "Ljk1/lqeggnwhkg;", "nufgyqmvbu", "(Ljk1/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("lists/detail/")
    Object dxjokdxxww(@om.iobyxmoadg PurchaseListDetailsRequest purchaseListDetailsRequest, gxszxtbevo<? super BasicResponse<SharedPurchaseListDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/copy/")
    Object eablkybsjg(@om.iobyxmoadg CopyPurchaseListRequest copyPurchaseListRequest, gxszxtbevo<? super BasicResponse<CopyPurchaseListDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/delete/")
    Object gxszxtbevo(@om.iobyxmoadg DeletePurchaseListRequest deletePurchaseListRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("lists/list/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<PurchaseListsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/detail/")
    Object lqeggnwhkg(@om.iobyxmoadg PurchaseListDetailsRequest purchaseListDetailsRequest, gxszxtbevo<? super BasicResponse<PurchaseListDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/addfromset/")
    Object nufgyqmvbu(@om.iobyxmoadg PurchasesListAddFromSetRequest purchasesListAddFromSetRequest, gxszxtbevo<? super BasicResponse<PurchasesListAddFromSetResponse>> gxszxtbevoVar);

    @ojitshcjhn("lists/changestatus/")
    Object ppxfxbqfkf(@om.iobyxmoadg PurchasesListChangeStatusRequest purchasesListChangeStatusRequest, gxszxtbevo<? super BasicResponse<PurchaseListDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/create/")
    Object wkgbmnqykc(@om.iobyxmoadg CreatePurchaseListRequest createPurchaseListRequest, gxszxtbevo<? super BasicResponse<NewPurchaseListDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/addproduct/")
    Object zoijcleaow(@om.iobyxmoadg AddProductToListRequest addProductToListRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
