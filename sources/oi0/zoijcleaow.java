package oi0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.options.impl.options.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (gxszxtbevo.lqeggnwhkg) msg;
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : lqeggnwhkgVar.iobyxmoadg(), (1015 & 16) != 0 ? state.isShowQrEnabled : lqeggnwhkgVar.zoijcleaow(), (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg(), (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.dxjokdxxww) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : ((gxszxtbevo.dxjokdxxww) msg).iobyxmoadg(), (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.btonecajqb) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : ((gxszxtbevo.btonecajqb) msg).iobyxmoadg(), (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.gtknphoqwx) {
            gxszxtbevo.gtknphoqwx gtknphoqwxVar = (gxszxtbevo.gtknphoqwx) msg;
            List listIobyxmoadg = gtknphoqwxVar.iobyxmoadg();
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : gtknphoqwxVar.zoijcleaow(), (1015 & 2) != 0 ? state.isSmsNotificationEnabled : gtknphoqwxVar.wkgbmnqykc(), (1015 & 4) != 0 ? state.isPushNotificationEnabled : gtknphoqwxVar.ppxfxbqfkf(), (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : listIobyxmoadg, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.C1584gxszxtbevo) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : ((gxszxtbevo.C1584gxszxtbevo) msg).iobyxmoadg(), (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : null, (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((1015 & 1) != 0 ? state.isEmailNotificationEnabled : false, (1015 & 2) != 0 ? state.isSmsNotificationEnabled : false, (1015 & 4) != 0 ? state.isPushNotificationEnabled : false, (1015 & 8) != 0 ? state.isAutoBrightnessEnabled : false, (1015 & 16) != 0 ? state.isShowQrEnabled : false, (1015 & 32) != 0 ? state.userSubscriptions : null, (1015 & 64) != 0 ? state.loadingSubscriptions : null, (1015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isDarkModeOptionVisible : false, (1015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.darkModeState : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (1015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
