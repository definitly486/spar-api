package s22;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((2047 & 1) != 0 ? state.article : null, (2047 & 2) != 0 ? state.id : 0, (2047 & 4) != 0 ? state.measure : null, (2047 & 8) != 0 ? state.name : null, (2047 & 16) != 0 ? state.pictureUrl : null, (2047 & 32) != 0 ? state.price : 0.0d, (2047 & 64) != 0 ? state.quantity : 0.0d, (2047 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.markCodes : null, (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.warningMessage : null, (2047 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.scanGoAmountMode : null, (2047 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.allowChangeQuantityAction : false, (2047 & 2048) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg();
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((2047 & 1) != 0 ? state.article : null, (2047 & 2) != 0 ? state.id : 0, (2047 & 4) != 0 ? state.measure : null, (2047 & 8) != 0 ? state.name : null, (2047 & 16) != 0 ? state.pictureUrl : null, (2047 & 32) != 0 ? state.price : 0.0d, (2047 & 64) != 0 ? state.quantity : 0.0d, (2047 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.markCodes : null, (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.warningMessage : null, (2047 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.scanGoAmountMode : null, (2047 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.allowChangeQuantityAction : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (2047 & 2048) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((2047 & 1) != 0 ? state.article : null, (2047 & 2) != 0 ? state.id : 0, (2047 & 4) != 0 ? state.measure : null, (2047 & 8) != 0 ? state.name : null, (2047 & 16) != 0 ? state.pictureUrl : null, (2047 & 32) != 0 ? state.price : 0.0d, (2047 & 64) != 0 ? state.quantity : 0.0d, (2047 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.markCodes : null, (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.warningMessage : null, (2047 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.scanGoAmountMode : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (2047 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.allowChangeQuantityAction : false, (2047 & 2048) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((2047 & 1) != 0 ? state.article : null, (2047 & 2) != 0 ? state.id : 0, (2047 & 4) != 0 ? state.measure : null, (2047 & 8) != 0 ? state.name : null, (2047 & 16) != 0 ? state.pictureUrl : null, (2047 & 32) != 0 ? state.price : 0.0d, (2047 & 64) != 0 ? state.quantity : 0.0d, (2047 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.markCodes : null, (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.warningMessage : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (2047 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.scanGoAmountMode : null, (2047 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.allowChangeQuantityAction : false, (2047 & 2048) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
