package yq;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.impl.pager.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (254 & 2) != 0 ? state.isLoading : false, (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : false, (254 & 4) != 0 ? state.sections : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : false, (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : false, (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : null, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        if (msg instanceof gxszxtbevo.C3210gxszxtbevo) {
            return state.zoijcleaow((254 & 1) != 0 ? state.addressData : null, (254 & 2) != 0 ? state.isLoading : false, (254 & 4) != 0 ? state.sections : null, (254 & 8) != 0 ? state.adultDialogWasShown : false, (254 & 16) != 0 ? state.isRestaurantsEnabled : false, (254 & 32) != 0 ? state.selectedTab : null, (254 & 64) != 0 ? state.restaurants : ((gxszxtbevo.C3210gxszxtbevo) msg).iobyxmoadg(), (254 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.args : null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
