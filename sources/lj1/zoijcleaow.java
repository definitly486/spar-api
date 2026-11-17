package lj1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.list_details.domain.store.State;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseProduct;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.C1273gxszxtbevo) {
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : null, (3583 & 64) != 0 ? state.productsBought : null, (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : ((gxszxtbevo.C1273gxszxtbevo) msg).iobyxmoadg(), (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : null, (3583 & 64) != 0 ? state.productsBought : null, (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : false, (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            gxszxtbevo.eablkybsjg eablkybsjgVar = (gxszxtbevo.eablkybsjg) msg;
            boolean zNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : eablkybsjgVar.ppxfxbqfkf(), (3583 & 4) != 0 ? state.sum : eablkybsjgVar.gxszxtbevo(), (3583 & 8) != 0 ? state.count : eablkybsjgVar.iobyxmoadg(), (3583 & 16) != 0 ? state.url : eablkybsjgVar.lqeggnwhkg(), (3583 & 32) != 0 ? state.productsBuy : eablkybsjgVar.eablkybsjg(), (3583 & 64) != 0 ? state.productsBought : eablkybsjgVar.wkgbmnqykc(), (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : eablkybsjgVar.zoijcleaow(), (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : zNufgyqmvbu, (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return zoijcleaow(state, zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : null, (3583 & 64) != 0 ? state.productsBought : null, (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : false, (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (3583 & 2048) != 0 ? state.productDataList : null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : null, (3583 & 64) != 0 ? state.productsBought : null, (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : false, (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List wkgbmnqykc(List list, String productId, boolean z13) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        zdlpuopuiu.btonecajqb(productId, "productId");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchaseProduct purchaseProductZoijcleaow = (PurchaseProduct) it.next();
            if (zdlpuopuiu.eablkybsjg(purchaseProductZoijcleaow.getId(), productId)) {
                purchaseProductZoijcleaow = purchaseProductZoijcleaow.zoijcleaow((4063231 & 1) != 0 ? purchaseProductZoijcleaow.id : null, (4063231 & 2) != 0 ? purchaseProductZoijcleaow.article : null, (4063231 & 4) != 0 ? purchaseProductZoijcleaow.name : null, (4063231 & 8) != 0 ? purchaseProductZoijcleaow.price : 0.0d, (4063231 & 16) != 0 ? purchaseProductZoijcleaow.oldPrice : null, (4063231 & 32) != 0 ? purchaseProductZoijcleaow.discount : null, (4063231 & 64) != 0 ? purchaseProductZoijcleaow.hints : null, (4063231 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? purchaseProductZoijcleaow.hidePrice : false, (4063231 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? purchaseProductZoijcleaow.isDispPer100 : false, (4063231 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? purchaseProductZoijcleaow.measureTypeModel : null, (4063231 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? purchaseProductZoijcleaow.avgWeight : null, (4063231 & 2048) != 0 ? purchaseProductZoijcleaow.isProductWithZeroPrice : false, (4063231 & 4096) != 0 ? purchaseProductZoijcleaow.pic : null, (4063231 & 8192) != 0 ? purchaseProductZoijcleaow.quantity : 0.0d, (4063231 & 16384) != 0 ? purchaseProductZoijcleaow.country : null, (32768 & 4063231) != 0 ? purchaseProductZoijcleaow.region : null, (4063231 & 65536) != 0 ? purchaseProductZoijcleaow.countryFlagEmoji : null, (4063231 & 131072) != 0 ? purchaseProductZoijcleaow.isFavorite : z13, (4063231 & 262144) != 0 ? purchaseProductZoijcleaow.isAvailable : false, (4063231 & 524288) != 0 ? purchaseProductZoijcleaow.rating : null, (4063231 & 1048576) != 0 ? purchaseProductZoijcleaow.reviews : 0, (4063231 & 2097152) != 0 ? purchaseProductZoijcleaow.isInPiece : false);
            }
            arrayList.add(purchaseProductZoijcleaow);
        }
        return arrayList;
    }

    public final State zoijcleaow(State state, String productId, boolean z13) {
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(productId, "productId");
        return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : wkgbmnqykc(state.getProductsBuy(), productId, z13), (3583 & 64) != 0 ? state.productsBought : wkgbmnqykc(state.getProductsBought(), productId, z13), (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : false, (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : null);
    }
}
