package fy1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.list_details.domain.store.State;
import ru.myspar.purchases_list.api.models.PurchaseProduct;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.C0795gxszxtbevo) {
            return state.zoijcleaow((3583 & 1) != 0 ? state.args : null, (3583 & 2) != 0 ? state.listName : null, (3583 & 4) != 0 ? state.sum : 0.0d, (3583 & 8) != 0 ? state.count : 0, (3583 & 16) != 0 ? state.url : null, (3583 & 32) != 0 ? state.productsBuy : null, (3583 & 64) != 0 ? state.productsBought : null, (3583 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.deliveryCode : null, (3583 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false, (3583 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isEmptyViewVisible : ((gxszxtbevo.C0795gxszxtbevo) msg).iobyxmoadg(), (3583 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.isShareListFeatureEnabled : false, (3583 & 2048) != 0 ? state.productDataList : null);
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
                purchaseProductZoijcleaow = purchaseProductZoijcleaow.zoijcleaow((16646143 & 1) != 0 ? purchaseProductZoijcleaow.id : null, (16646143 & 2) != 0 ? purchaseProductZoijcleaow.article : null, (16646143 & 4) != 0 ? purchaseProductZoijcleaow.name : null, (16646143 & 8) != 0 ? purchaseProductZoijcleaow.price : 0.0d, (16646143 & 16) != 0 ? purchaseProductZoijcleaow.oldPrice : null, (16646143 & 32) != 0 ? purchaseProductZoijcleaow.discount : null, (16646143 & 64) != 0 ? purchaseProductZoijcleaow.hints : null, (16646143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? purchaseProductZoijcleaow.hidePrice : false, (16646143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? purchaseProductZoijcleaow.isDispPer100 : false, (16646143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? purchaseProductZoijcleaow.measureTypeModel : null, (16646143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? purchaseProductZoijcleaow.avgWeight : null, (16646143 & 2048) != 0 ? purchaseProductZoijcleaow.isProductWithZeroPrice : false, (16646143 & 4096) != 0 ? purchaseProductZoijcleaow.pic : null, (16646143 & 8192) != 0 ? purchaseProductZoijcleaow.quantity : 0.0d, (16646143 & 16384) != 0 ? purchaseProductZoijcleaow.country : null, (32768 & 16646143) != 0 ? purchaseProductZoijcleaow.region : null, (16646143 & 65536) != 0 ? purchaseProductZoijcleaow.countryFlagEmoji : null, (16646143 & 131072) != 0 ? purchaseProductZoijcleaow.isFavorite : z13, (16646143 & 262144) != 0 ? purchaseProductZoijcleaow.isAvailable : false, (16646143 & 524288) != 0 ? purchaseProductZoijcleaow.availableOnlyForPickup : false, (16646143 & 1048576) != 0 ? purchaseProductZoijcleaow.onlyInShop : false, (16646143 & 2097152) != 0 ? purchaseProductZoijcleaow.rating : null, (16646143 & 4194304) != 0 ? purchaseProductZoijcleaow.reviews : 0, (16646143 & 8388608) != 0 ? purchaseProductZoijcleaow.isInPiece : false);
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
