package v61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.specificrestaurantproduct.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final boolean zoijcleaow(double d13, double d14) {
        return d13 > d14;
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : 0.0d, (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (gxszxtbevo.lqeggnwhkg) msg;
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : lqeggnwhkgVar.iobyxmoadg(), (2046 & 16) != 0 ? state.currentAmount : lqeggnwhkgVar.iobyxmoadg().getMeasureTypeModel().getCurrentMeasure().getBasketDefault(), (2046 & 32) != 0 ? state.enableDecrease : zoijcleaow(state.getCurrentAmount(), lqeggnwhkgVar.iobyxmoadg().getMeasureTypeModel().getCurrentMeasure().getMinAvailable()), (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : iobyxmoadgVar.iobyxmoadg(), (2046 & 32) != 0 ? state.enableDecrease : zoijcleaow(iobyxmoadgVar.iobyxmoadg(), state.getProductDetails().getMeasureTypeModel().getCurrentMeasure().getMinAvailable()), (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.wkgbmnqykc.f116210iobyxmoadg)) {
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : 0.0d, (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : 0.0d, (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.C2890gxszxtbevo.f116202iobyxmoadg)) {
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : 0.0d, (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : 0.0d, (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : ppxfxbqfkfVar.zoijcleaow(), (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : ppxfxbqfkfVar.iobyxmoadg(), (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : ppxfxbqfkfVar.ppxfxbqfkf(), (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : null, (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
        }
        if (!(msg instanceof gxszxtbevo.nufgyqmvbu)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.nufgyqmvbu nufgyqmvbuVar = (gxszxtbevo.nufgyqmvbu) msg;
        return state.zoijcleaow((2046 & 1) != 0 ? state.isLoading : false, (2046 & 2) != 0 ? state.partnerCode : null, (2046 & 4) != 0 ? state.article : null, (2046 & 8) != 0 ? state.productDetails : null, (2046 & 16) != 0 ? state.currentAmount : nufgyqmvbuVar.iobyxmoadg().getBasketDefault(), (2046 & 32) != 0 ? state.enableDecrease : false, (2046 & 64) != 0 ? state.currentCartProducts : null, (2046 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.cartPartnerCode : null, (2046 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.deliveryType : null, (2046 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.measure : nufgyqmvbuVar.iobyxmoadg(), (2046 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.buyState : null);
    }
}
