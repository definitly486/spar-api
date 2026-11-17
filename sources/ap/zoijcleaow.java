package ap;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.impl.domain.authorization.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : false, (127 & 2) != 0 ? state.agreementErrorIsVisible : false, (127 & 4) != 0 ? state.phoneNumber : null, (127 & 8) != 0 ? state.agreementIsChecked : false, (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : false, (127 & 2) != 0 ? state.agreementErrorIsVisible : false, (127 & 4) != 0 ? state.phoneNumber : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (127 & 8) != 0 ? state.agreementIsChecked : false, (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : false, (127 & 2) != 0 ? state.agreementErrorIsVisible : false, (127 & 4) != 0 ? state.phoneNumber : null, (127 & 8) != 0 ? state.agreementIsChecked : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (127 & 2) != 0 ? state.agreementErrorIsVisible : false, (127 & 4) != 0 ? state.phoneNumber : null, (127 & 8) != 0 ? state.agreementIsChecked : false, (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : false, (127 & 2) != 0 ? state.agreementErrorIsVisible : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (127 & 4) != 0 ? state.phoneNumber : null, (127 & 8) != 0 ? state.agreementIsChecked : false, (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.C0213gxszxtbevo) {
            return state.zoijcleaow((127 & 1) != 0 ? state.phoneNumberErrorIsVisible : false, (127 & 2) != 0 ? state.agreementErrorIsVisible : false, (127 & 4) != 0 ? state.phoneNumber : null, (127 & 8) != 0 ? state.agreementIsChecked : false, (127 & 16) != 0 ? state.waitingResult : null, (127 & 32) != 0 ? state.errorType : null, (127 & 64) != 0 ? state.showAuthErrorDialog : ((gxszxtbevo.C0213gxszxtbevo) msg).iobyxmoadg(), (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
