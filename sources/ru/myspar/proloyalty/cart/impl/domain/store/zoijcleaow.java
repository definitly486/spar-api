package ru.myspar.proloyalty.cart.impl.domain.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import j0.l;
import j0.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kz0.nufgyqmvbu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import ru.myspar.proloyalty.cart.impl.utils.BonusesEditorState;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final BonusesEditorState ppxfxbqfkf(BonusesEditorState bonusesEditorState, CartBonuses cartBonuses, CartBonuses cartBonuses2) {
        String string;
        String str;
        int available = cartBonuses != null ? cartBonuses.getAvailable() : 0;
        int available2 = cartBonuses2 != null ? cartBonuses2.getAvailable() : 0;
        int balance = cartBonuses2 != null ? cartBonuses2.getBalance() : 0;
        int applied = cartBonuses2 != null ? cartBonuses2.getApplied() : 0;
        Integer numVdvldrhtss = kcexrzcfyt.vdvldrhtss(bonusesEditorState.getValue().draadjrbmk());
        int iIntValue = numVdvldrhtss != null ? numVdvldrhtss.intValue() : 0;
        int iMin = Math.min(balance, applied);
        boolean z13 = iMin == 0;
        boolean z14 = iIntValue > iMin;
        boolean z15 = iIntValue == 0;
        boolean z16 = z15 || z14;
        boolean z17 = z15 && applied != 0;
        boolean z18 = available != available2 && z14;
        String strDraadjrbmk = "";
        if (z13) {
            str = strDraadjrbmk;
        } else {
            if (z18) {
                strDraadjrbmk = String.valueOf(available2);
            } else if (z17 || z16) {
                Integer numValueOf = Integer.valueOf(applied);
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null && (string = numValueOf.toString()) != null) {
                    str = string;
                }
            } else {
                strDraadjrbmk = bonusesEditorState.getValue().draadjrbmk();
            }
            str = strDraadjrbmk;
        }
        return BonusesEditorState.eablkybsjg(bonusesEditorState, new tzroggbefp(str, m.iobyxmoadg(str.length()), (l) null, 4, (gtknphoqwx) null), bonusesEditorState.getIsEnabled() || !(applied == 0 || available2 == 0 || balance == 0), false, 4, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.gtknphoqwx) {
            gxszxtbevo.gtknphoqwx gtknphoqwxVar = (gxszxtbevo.gtknphoqwx) msg;
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : gtknphoqwxVar.iobyxmoadg(), (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : BonusesEditorState.eablkybsjg(state.getBonusesEditorState(), null, false, !gtknphoqwxVar.iobyxmoadg(), 3, null), (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            Cart cartIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            RestaurantDetails restaurantDetailsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            String partnerCode = iobyxmoadgVar.iobyxmoadg().getPartnerCode();
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : !(partnerCode == null || partnerCode.length() == 0), (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : cartIobyxmoadg, (32510 & 32) != 0 ? state.restaurant : restaurantDetailsPpxfxbqfkf, (32510 & 64) != 0 ? state.warningState : nufgyqmvbuVarWkgbmnqykc, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : iobyxmoadgVar.zoijcleaow(), (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : ppxfxbqfkf(state.getBonusesEditorState(), state.getCart().getCartBonuses(), iobyxmoadgVar.iobyxmoadg().getCartBonuses()), (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.rgvfuqvkyq) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : ((gxszxtbevo.rgvfuqvkyq) msg).iobyxmoadg(), (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.wflxmlrfwp) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : ((gxszxtbevo.wflxmlrfwp) msg).iobyxmoadg(), (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.agtfadlqog) {
            gxszxtbevo.agtfadlqog agtfadlqogVar = (gxszxtbevo.agtfadlqog) msg;
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : PromoCodeEditorState.eablkybsjg(state.getPromoCodeEditorState(), agtfadlqogVar.iobyxmoadg(), null, agtfadlqogVar.zoijcleaow(), null, 10, null), (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.dxjokdxxww.f92721iobyxmoadg)) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : new Cart(0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, 16777215, null), (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : BonusesEditorState.INSTANCE.iobyxmoadg(), (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : jyumaefscl.wflxmlrfwp(), (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : true, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : BonusesEditorState.eablkybsjg(state.getBonusesEditorState(), ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), false, false, 6, null), (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            Cart cart = state.getCart();
            CartBonuses cartBonuses = state.getCart().getCartBonuses();
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : cartBonuses != null ? CartBonuses.ppxfxbqfkf(cartBonuses, 0, 0, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), null, 11, null) : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null), (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : BonusesEditorState.eablkybsjg(state.getBonusesEditorState(), null, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, 5, null), (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.ojitshcjhn) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : ((gxszxtbevo.ojitshcjhn) msg).iobyxmoadg(), (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.C2159gxszxtbevo) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : ((gxszxtbevo.C2159gxszxtbevo) msg).iobyxmoadg(), (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.btonecajqb) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.draadjrbmk) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : ((gxszxtbevo.draadjrbmk) msg).iobyxmoadg(), (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : false);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            return state.zoijcleaow((32510 & 1) != 0 ? state.isLoading : false, (32510 & 2) != 0 ? state.isPartnerCart : false, (32510 & 4) != 0 ? state.isOrderSend : false, (32510 & 8) != 0 ? state.isCartFetched : false, (32510 & 16) != 0 ? state.cart : null, (32510 & 32) != 0 ? state.restaurant : null, (32510 & 64) != 0 ? state.warningState : null, (32510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.promoCodeEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.bonusesEditorState : null, (32510 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.loadInfo : null, (32510 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productDataList : null, (32510 & 2048) != 0 ? state.isRemoveProductLoading : false, (32510 & 4096) != 0 ? state.recommendations : null, (32510 & 8192) != 0 ? state.currentDialogType : null, (32510 & 16384) != 0 ? state.isNeededScrollContentToTop : ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
