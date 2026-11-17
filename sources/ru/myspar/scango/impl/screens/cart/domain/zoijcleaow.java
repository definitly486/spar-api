package ru.myspar.scango.impl.screens.cart.domain;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v22.iobyxmoadg f103358iobyxmoadg;

    public zoijcleaow(v22.iobyxmoadg stateFactory) {
        zdlpuopuiu.btonecajqb(stateFactory, "stateFactory");
        this.f103358iobyxmoadg = stateFactory;
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.C2500gxszxtbevo) {
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : ((gxszxtbevo.C2500gxszxtbevo) msg).iobyxmoadg(), (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : null, (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : null, (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : iobyxmoadgVar.wkgbmnqykc(), (4094 & 4) != 0 ? state.totalPriceFractional : iobyxmoadgVar.ppxfxbqfkf(), (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : iobyxmoadgVar.eablkybsjg(), (4094 & 16) != 0 ? state.content : iobyxmoadgVar.zoijcleaow(), (4094 & 32) != 0 ? state.cartState : iobyxmoadgVar.iobyxmoadg(), (4094 & 64) != 0 ? state.isTutorialCart : iobyxmoadgVar.gxszxtbevo(), (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
            Boolean boolZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            boolean zBooleanValue = boolZoijcleaow != null ? boolZoijcleaow.booleanValue() : state.getIsReturnProductFlatEnabled();
            Long lIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : null, (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : zBooleanValue, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : lIobyxmoadg != null ? lIobyxmoadg.longValue() : state.getTimerValue(), (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            return this.f103358iobyxmoadg.iobyxmoadg(state.getStartText(), ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.dxjokdxxww.f103271iobyxmoadg)) {
            return this.f103358iobyxmoadg.zoijcleaow(new ScanGoCartModel(null, 0L, null, null, 0.0d, 0, null, null, null, 511, null), state.getStartText());
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : null, (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (4094 & 2048) != 0 ? state.currentTutorialOption : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((4094 & 1) != 0 ? state.isLoadingVisible : false, (4094 & 2) != 0 ? state.totalPriceInt : null, (4094 & 4) != 0 ? state.totalPriceFractional : null, (4094 & 8) != 0 ? state.isCheckoutBtnEnabled : false, (4094 & 16) != 0 ? state.content : null, (4094 & 32) != 0 ? state.cartState : null, (4094 & 64) != 0 ? state.isTutorialCart : false, (4094 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isReturnProductFlatEnabled : false, (4094 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : 0L, (4094 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.startText : null, (4094 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deletedProduct : null, (4094 & 2048) != 0 ? state.currentTutorialOption : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
