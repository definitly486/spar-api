package dn0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.impl.domain.authbysms.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : false, (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : null);
        }
        if (msg instanceof gxszxtbevo.C0585gxszxtbevo) {
            gxszxtbevo.C0585gxszxtbevo c0585gxszxtbevo = (gxszxtbevo.C0585gxszxtbevo) msg;
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : c0585gxszxtbevo.iobyxmoadg(), (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : c0585gxszxtbevo.zoijcleaow(), (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : false, (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : false, (510 & 64) != 0 ? state.isResendSmsButtonEnabled : true, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : "");
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : false, (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((510 & 1) != 0 ? state.isLoading : false, (510 & 2) != 0 ? state.phoneNumber : null, (510 & 4) != 0 ? state.hash : null, (510 & 8) != 0 ? state.smsCode : null, (510 & 16) != 0 ? state.smsCodeInputEnabled : false, (510 & 32) != 0 ? state.smsInputError : false, (510 & 64) != 0 ? state.isResendSmsButtonEnabled : false, (510 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isAcceptButtonEnabled : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (510 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.timerValue : null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
