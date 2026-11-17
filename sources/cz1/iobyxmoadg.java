package cz1;

import dz1.AddProductToListRequest;
import dz1.CopyPurchaseListRequest;
import dz1.CreatePurchaseListRequest;
import dz1.DeletePurchaseListRequest;
import dz1.PurchaseListDetailsRequest;
import dz1.PurchasesListAddFromSetRequest;
import dz1.PurchasesListAddFromSetResponse;
import dz1.PurchasesListChangeStatusRequest;
import ez1.CopyPurchaseListDto;
import ez1.NewPurchaseListDto;
import ez1.PurchaseListDetailsDto;
import ez1.PurchaseListsDto;
import ez1.SharedPurchaseListDetailsDto;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0014\u0010\u0012J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lcz1/iobyxmoadg;", "", "Lru/myspar/core/network/model/BasicResponse;", "Lez1/lqeggnwhkg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/ppxfxbqfkf;", "request", "Lez1/zoijcleaow;", "zoijcleaow", "(Ldz1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/wkgbmnqykc;", "Lgg/wwaezpbzkn;", "nufgyqmvbu", "(Ldz1/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/eablkybsjg;", "Lez1/eablkybsjg;", "lqeggnwhkg", "(Ldz1/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lez1/dxjokdxxww;", "eablkybsjg", "Ldz1/iobyxmoadg;", "ppxfxbqfkf", "(Ldz1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/zoijcleaow;", "Lez1/iobyxmoadg;", "wkgbmnqykc", "(Ldz1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/nufgyqmvbu;", "gxszxtbevo", "(Ldz1/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ldz1/gxszxtbevo;", "Ldz1/lqeggnwhkg;", "dxjokdxxww", "(Ldz1/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("lists/addfromset/")
    Object dxjokdxxww(@om.iobyxmoadg PurchasesListAddFromSetRequest purchasesListAddFromSetRequest, gxszxtbevo<? super BasicResponse<PurchasesListAddFromSetResponse>> gxszxtbevoVar);

    @ojitshcjhn("lists/detail/")
    Object eablkybsjg(@om.iobyxmoadg PurchaseListDetailsRequest purchaseListDetailsRequest, gxszxtbevo<? super BasicResponse<SharedPurchaseListDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/changestatus/")
    Object gxszxtbevo(@om.iobyxmoadg PurchasesListChangeStatusRequest purchasesListChangeStatusRequest, gxszxtbevo<? super BasicResponse<PurchaseListDetailsDto>> gxszxtbevoVar);

    @om.gxszxtbevo("lists/list/")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<PurchaseListsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/detail/")
    Object lqeggnwhkg(@om.iobyxmoadg PurchaseListDetailsRequest purchaseListDetailsRequest, gxszxtbevo<? super BasicResponse<PurchaseListDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/delete/")
    Object nufgyqmvbu(@om.iobyxmoadg DeletePurchaseListRequest deletePurchaseListRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("lists/addproduct/")
    Object ppxfxbqfkf(@om.iobyxmoadg AddProductToListRequest addProductToListRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("lists/copy/")
    Object wkgbmnqykc(@om.iobyxmoadg CopyPurchaseListRequest copyPurchaseListRequest, gxszxtbevo<? super BasicResponse<CopyPurchaseListDto>> gxszxtbevoVar);

    @ojitshcjhn("lists/create/")
    Object zoijcleaow(@om.iobyxmoadg CreatePurchaseListRequest createPurchaseListRequest, gxszxtbevo<? super BasicResponse<NewPurchaseListDto>> gxszxtbevoVar);
}
