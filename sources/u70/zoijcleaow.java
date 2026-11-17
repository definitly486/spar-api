package u70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.domain.feature.personaldata.store.State;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State zoijcleaow(State state, User user) {
        String gender = user.getGender();
        b10.iobyxmoadg iobyxmoadgVar = b10.iobyxmoadg.MALE;
        if (!kcexrzcfyt.istkbnxepw(gender, iobyxmoadgVar.wkgbmnqykc(), true)) {
            iobyxmoadgVar = b10.iobyxmoadg.FEMALE;
        }
        return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : user.getEmail(), (7680 & 2) != 0 ? state.isEmailConfirmed : user.getIsEmailConfirmed(), (7680 & 4) != 0 ? state.phone : user.getPhone(), (7680 & 8) != 0 ? state.birthDate : user.getDateBirth(), (7680 & 16) != 0 ? state.cardNumber : user.getUserCard().getNumber(), (7680 & 32) != 0 ? state.gender : iobyxmoadgVar, (7680 & 64) != 0 ? state.firstName : user.getFirstName(), (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : user.getLastName(), (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : user.getEmail(), (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : user.getIsEmailConfirmed(), (7680 & 16384) != 0 ? state.isLoading : false);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.dxjokdxxww) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : ((gxszxtbevo.dxjokdxxww) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : iobyxmoadgVar.iobyxmoadg(), (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : iobyxmoadgVar.zoijcleaow(), (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : iobyxmoadgVar.ppxfxbqfkf(), (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : ppxfxbqfkfVar.iobyxmoadg(), (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : ppxfxbqfkfVar.zoijcleaow(), (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (gxszxtbevo.lqeggnwhkg) msg;
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : lqeggnwhkgVar.iobyxmoadg(), (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : lqeggnwhkgVar.zoijcleaow(), (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.btonecajqb) {
            return zoijcleaow(state, ((gxszxtbevo.btonecajqb) msg).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.wkgbmnqykc.f112916iobyxmoadg)) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : true, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.C2795gxszxtbevo.f112907iobyxmoadg)) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : true, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.nufgyqmvbu.f112913iobyxmoadg)) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : true, (7680 & 2048) != 0 ? state.emailError : false, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.zoijcleaow.f112917iobyxmoadg)) {
            return state.zoijcleaow((7680 & 1) != 0 ? state.currentEmail : null, (7680 & 2) != 0 ? state.isEmailConfirmed : false, (7680 & 4) != 0 ? state.phone : null, (7680 & 8) != 0 ? state.birthDate : null, (7680 & 16) != 0 ? state.cardNumber : null, (7680 & 32) != 0 ? state.gender : null, (7680 & 64) != 0 ? state.firstName : null, (7680 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.lastName : null, (7680 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.email : null, (7680 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.firstNameError : false, (7680 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.lastNameError : false, (7680 & 2048) != 0 ? state.emailError : true, (7680 & 4096) != 0 ? state.genderError : false, (7680 & 8192) != 0 ? state.isEmailVerified : false, (7680 & 16384) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
