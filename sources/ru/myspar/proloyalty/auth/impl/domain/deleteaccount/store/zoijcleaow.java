package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof eablkybsjg.gxszxtbevo) {
            eablkybsjg.gxszxtbevo gxszxtbevoVar = (eablkybsjg.gxszxtbevo) msg;
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : true, (199 & 16) != 0 ? state.buttonTitleRes : gxszxtbevoVar.iobyxmoadg(), (199 & 32) != 0 ? state.hintRes : gxszxtbevoVar.zoijcleaow(), (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : gxszxtbevoVar.ppxfxbqfkf());
        }
        if (msg instanceof eablkybsjg.lqeggnwhkg) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : kcexrzcfyt.p(((eablkybsjg.lqeggnwhkg) msg).iobyxmoadg()).toString(), (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.nufgyqmvbu) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : "", (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : true, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.zoijcleaow) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : ((eablkybsjg.zoijcleaow) msg).iobyxmoadg(), (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.wkgbmnqykc) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : ((eablkybsjg.wkgbmnqykc) msg).iobyxmoadg(), (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.ppxfxbqfkf) {
            eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) msg;
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : ppxfxbqfkfVar.zoijcleaow(), (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : ppxfxbqfkfVar.iobyxmoadg(), (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.C2149eablkybsjg) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : ((eablkybsjg.C2149eablkybsjg) msg).iobyxmoadg(), (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : null, (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        if (msg instanceof eablkybsjg.iobyxmoadg) {
            return state.zoijcleaow((199 & 1) != 0 ? state.isLoading : false, (199 & 2) != 0 ? state.phoneNumber : null, (199 & 4) != 0 ? state.smsCode : null, (199 & 8) != 0 ? state.smsFieldIsVisible : false, (199 & 16) != 0 ? state.buttonTitleRes : 0, (199 & 32) != 0 ? state.hintRes : 0, (199 & 64) != 0 ? state.smsErrorIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.timerValue : ((eablkybsjg.iobyxmoadg) msg).iobyxmoadg(), (199 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.smsRepeatRequestIsVisible : false, (199 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.smsHash : null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
