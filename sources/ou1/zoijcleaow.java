package ou1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import j0.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import pt0.btonecajqb;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailInfo;
import ru.myspar.proloyalty.subscription.impl.detail.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final btonecajqb ppxfxbqfkf(Promocode promocode) {
        if (promocode == null || kcexrzcfyt.zfvoamnweg(promocode.getValue())) {
            return btonecajqb.NOT_ENTERED;
        }
        if (promocode.getStatus()) {
            return btonecajqb.APPLIED;
        }
        return !promocode.getStatus() ? btonecajqb.NOT_APPLIED : btonecajqb.NOT_ENTERED;
    }

    private final PromoCodeEditorState zoijcleaow(Promocode promocode) {
        String value = promocode != null ? promocode.getValue() : null;
        if (value == null) {
            value = "";
        }
        btonecajqb btonecajqbVarPpxfxbqfkf = ppxfxbqfkf(promocode);
        return new PromoCodeEditorState(new tzroggbefp(value, 0L, (l) null, 6, (gtknphoqwx) null), value, btonecajqbVarPpxfxbqfkf, btonecajqbVarPpxfxbqfkf);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : wkgbmnqykcVar.iobyxmoadg().getId(), (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : wkgbmnqykcVar.iobyxmoadg(), (507 & 32) != 0 ? state.promoCodeEditorState : zoijcleaow(wkgbmnqykcVar.iobyxmoadg().getPromoCode()), (507 & 64) != 0 ? state.changedParamsBuffer : hg.tzroggbefp.dxjokdxxww(), (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : hg.tzroggbefp.ojitshcjhn(state.getChangedParamsBuffer(), cqumvgiudr.iobyxmoadg(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow())), (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.dxjokdxxww.f74746iobyxmoadg)) {
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : hg.tzroggbefp.dxjokdxxww(), (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg(), (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (msg instanceof gxszxtbevo.C1625gxszxtbevo) {
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : ((gxszxtbevo.C1625gxszxtbevo) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            SubscriptionDetailInfo detailInfo = state.getDetailInfo();
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : detailInfo != null ? detailInfo.zoijcleaow((8183 & 1) != 0 ? detailInfo.id : null, (8183 & 2) != 0 ? detailInfo.title : null, (8183 & 4) != 0 ? detailInfo.isAvailableForOrder : false, (8183 & 8) != 0 ? detailInfo.autoRenewal : Boolean.valueOf(((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg()), (8183 & 16) != 0 ? detailInfo.imageBanner : null, (8183 & 32) != 0 ? detailInfo.progressBar : null, (8183 & 64) != 0 ? detailInfo.availableProducts : null, (8183 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? detailInfo.customizableParameters : null, (8183 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? detailInfo.promoCode : null, (8183 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? detailInfo.terms : null, (8183 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? detailInfo.agreement : null, (8183 & 2048) != 0 ? detailInfo.priceInfo : null, (8183 & 4096) != 0 ? detailInfo.payments : null) : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : null, (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
        }
        if (!(msg instanceof gxszxtbevo.lqeggnwhkg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (gxszxtbevo.lqeggnwhkg) msg;
        return state.zoijcleaow((507 & 1) != 0 ? state.subscriptionId : null, (507 & 2) != 0 ? state.isNeededShowSkeleton : false, (507 & 4) != 0 ? state.isLoading : false, (507 & 8) != 0 ? state.isAutoRenewalLoading : false, (507 & 16) != 0 ? state.detailInfo : null, (507 & 32) != 0 ? state.promoCodeEditorState : PromoCodeEditorState.eablkybsjg(state.getPromoCodeEditorState(), lqeggnwhkgVar.iobyxmoadg(), null, lqeggnwhkgVar.zoijcleaow(), null, 10, null), (507 & 64) != 0 ? state.changedParamsBuffer : null, (507 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.additionalInfoSettingId : null, (507 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.openSettingsBottomSheet : false);
    }
}
