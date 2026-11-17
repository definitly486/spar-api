package f61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.domain.feature.personaldata.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, nw1.gxszxtbevo gxszxtbevoVar) {
        String strPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        String str = strPpxfxbqfkf == null ? "" : strPpxfxbqfkf;
        Boolean boolNufgyqmvbu = gxszxtbevoVar.nufgyqmvbu();
        boolean zBooleanValue = boolNufgyqmvbu != null ? boolNufgyqmvbu.booleanValue() : false;
        String strLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
        String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
        String strIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
        String str2 = strIobyxmoadg == null ? "" : strIobyxmoadg;
        lr0.zoijcleaow zoijcleaowVarWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
        tzroggbefp tzroggbefpVar = new tzroggbefp(gxszxtbevoVar.gxszxtbevo(), 0L, (l) null, 6, (gtknphoqwx) null);
        String strEablkybsjg = gxszxtbevoVar.eablkybsjg();
        tzroggbefp tzroggbefpVar2 = new tzroggbefp(strEablkybsjg == null ? "" : strEablkybsjg, 0L, (l) null, 6, (gtknphoqwx) null);
        String strPpxfxbqfkf2 = gxszxtbevoVar.ppxfxbqfkf();
        tzroggbefp tzroggbefpVar3 = new tzroggbefp(strPpxfxbqfkf2 == null ? "" : strPpxfxbqfkf2, 0L, (l) null, 6, (gtknphoqwx) null);
        Boolean boolNufgyqmvbu2 = gxszxtbevoVar.nufgyqmvbu();
        return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : str, (9984 & 2) != 0 ? state.phone : strLqeggnwhkg, (9984 & 4) != 0 ? state.birthDate : strZoijcleaow, (9984 & 8) != 0 ? state.cardNumber : str2, (9984 & 16) != 0 ? state.gender : zoijcleaowVarWkgbmnqykc, (9984 & 32) != 0 ? state.firstName : tzroggbefpVar, (9984 & 64) != 0 ? state.lastName : tzroggbefpVar2, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : tzroggbefpVar3, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : boolNufgyqmvbu2 != null ? boolNufgyqmvbu2.booleanValue() : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : zBooleanValue, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : false);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.C0720gxszxtbevo) {
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : null, (9984 & 32) != 0 ? state.firstName : null, (9984 & 64) != 0 ? state.lastName : null, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : null, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : ((gxszxtbevo.C0720gxszxtbevo) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : null, (9984 & 32) != 0 ? state.firstName : null, (9984 & 64) != 0 ? state.lastName : null, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : zoijcleaowVar.iobyxmoadg(), (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : zoijcleaowVar.zoijcleaow(), (9984 & 2048) != 0 ? state.isEmailVerified : zoijcleaowVar.ppxfxbqfkf(), (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : null, (9984 & 32) != 0 ? state.firstName : ppxfxbqfkfVar.iobyxmoadg(), (9984 & 64) != 0 ? state.lastName : null, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : null, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : ppxfxbqfkfVar.zoijcleaow(), (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            gxszxtbevo.eablkybsjg eablkybsjgVar = (gxszxtbevo.eablkybsjg) msg;
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : null, (9984 & 32) != 0 ? state.firstName : null, (9984 & 64) != 0 ? state.lastName : eablkybsjgVar.zoijcleaow(), (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : null, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : eablkybsjgVar.iobyxmoadg(), (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (9984 & 32) != 0 ? state.firstName : null, (9984 & 64) != 0 ? state.lastName : null, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : null, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : false, (9984 & 16384) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return ppxfxbqfkf(state, ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((9984 & 1) != 0 ? state.currentEmail : null, (9984 & 2) != 0 ? state.phone : null, (9984 & 4) != 0 ? state.birthDate : null, (9984 & 8) != 0 ? state.cardNumber : null, (9984 & 16) != 0 ? state.gender : null, (9984 & 32) != 0 ? state.firstName : null, (9984 & 64) != 0 ? state.lastName : null, (9984 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.email : null, (9984 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.firstNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.lastNameError : null, (9984 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.emailError : null, (9984 & 2048) != 0 ? state.isEmailVerified : false, (9984 & 4096) != 0 ? state.isEmailConfirmed : false, (9984 & 8192) != 0 ? state.isSavingDataLoading : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (9984 & 16384) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
