package zo;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.impl.domain.authbysms.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : null, (1022 & 8) != 0 ? state.smsCode : null, (1022 & 16) != 0 ? state.isError : false, (1022 & 32) != 0 ? state.errorText : null, (1022 & 64) != 0 ? state.continueBtnIsEnabled : false, (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : false, (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : null, (1022 & 8) != 0 ? state.smsCode : wkgbmnqykcVar.iobyxmoadg(), (1022 & 16) != 0 ? state.isError : wkgbmnqykcVar.ppxfxbqfkf(), (1022 & 32) != 0 ? state.errorText : null, (1022 & 64) != 0 ? state.continueBtnIsEnabled : wkgbmnqykcVar.zoijcleaow(), (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : false, (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : null, (1022 & 8) != 0 ? state.smsCode : null, (1022 & 16) != 0 ? state.isError : zoijcleaowVar.zoijcleaow(), (1022 & 32) != 0 ? state.errorText : zoijcleaowVar.iobyxmoadg(), (1022 & 64) != 0 ? state.continueBtnIsEnabled : false, (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        if (msg instanceof gxszxtbevo.C3329gxszxtbevo) {
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : false, (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : ((gxszxtbevo.C3329gxszxtbevo) msg).iobyxmoadg(), (1022 & 8) != 0 ? state.smsCode : null, (1022 & 16) != 0 ? state.isError : false, (1022 & 32) != 0 ? state.errorText : null, (1022 & 64) != 0 ? state.continueBtnIsEnabled : false, (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : false, (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : null, (1022 & 8) != 0 ? state.smsCode : null, (1022 & 16) != 0 ? state.isError : false, (1022 & 32) != 0 ? state.errorText : null, (1022 & 64) != 0 ? state.continueBtnIsEnabled : false, (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : "", (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((1022 & 1) != 0 ? state.isLoading : false, (1022 & 2) != 0 ? state.phoneNumber : null, (1022 & 4) != 0 ? state.token : null, (1022 & 8) != 0 ? state.smsCode : null, (1022 & 16) != 0 ? state.isError : false, (1022 & 32) != 0 ? state.errorText : null, (1022 & 64) != 0 ? state.continueBtnIsEnabled : false, (1022 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (1022 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.result : null, (1022 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.errorType : null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
