package p70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.editreceiver.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.args : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.firstName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.firstNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.lastName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.lastNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.phone : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.phoneError : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.saveIsVisible : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.args : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.firstName : zoijcleaowVar.iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.firstNameError : zoijcleaowVar.zoijcleaow(), (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.lastName : zoijcleaowVar.ppxfxbqfkf(), (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.lastNameError : zoijcleaowVar.wkgbmnqykc(), (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.phone : zoijcleaowVar.eablkybsjg(), (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.phoneError : zoijcleaowVar.gxszxtbevo(), (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.saveIsVisible : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.args : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.firstName : iobyxmoadgVar.zoijcleaow(), (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.firstNameError : iobyxmoadgVar.iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.lastName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.lastNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.phone : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.phoneError : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.saveIsVisible : true, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.args : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.firstName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.firstNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.lastName : ppxfxbqfkfVar.zoijcleaow(), (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.lastNameError : ppxfxbqfkfVar.iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.phone : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.phoneError : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.saveIsVisible : true, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (!(msg instanceof gxszxtbevo.eablkybsjg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.eablkybsjg eablkybsjgVar = (gxszxtbevo.eablkybsjg) msg;
        return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.args : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.firstName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.firstNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.lastName : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.lastNameError : false, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.phone : eablkybsjgVar.zoijcleaow(), (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.phoneError : eablkybsjgVar.iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.saveIsVisible : true, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
    }
}
