package op1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((4095 & 1) != 0 ? state.id : 0, (4095 & 2) != 0 ? state.article : null, (4095 & 4) != 0 ? state.name : null, (4095 & 8) != 0 ? state.pictureUrl : null, (4095 & 16) != 0 ? state.amount : null, (4095 & 32) != 0 ? state.quantity : 0.0d, (4095 & 64) != 0 ? state.pricePerUnit : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.totalPrice : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.measureType : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.markCodes : null, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.warningMessage : null, (4095 & 2048) != 0 ? state.price : 0.0d, (4095 & 4096) != 0 ? state.isLoading : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg());
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
                return state.zoijcleaow((4095 & 1) != 0 ? state.id : 0, (4095 & 2) != 0 ? state.article : null, (4095 & 4) != 0 ? state.name : null, (4095 & 8) != 0 ? state.pictureUrl : null, (4095 & 16) != 0 ? state.amount : null, (4095 & 32) != 0 ? state.quantity : 0.0d, (4095 & 64) != 0 ? state.pricePerUnit : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.totalPrice : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.measureType : null, (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.markCodes : null, (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.warningMessage : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (4095 & 2048) != 0 ? state.price : 0.0d, (4095 & 4096) != 0 ? state.isLoading : false);
            }
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        return state.zoijcleaow((4095 & 1) != 0 ? state.id : zoijcleaowVar.zoijcleaow(), (4095 & 2) != 0 ? state.article : zoijcleaowVar.iobyxmoadg(), (4095 & 4) != 0 ? state.name : zoijcleaowVar.eablkybsjg(), (4095 & 8) != 0 ? state.pictureUrl : zoijcleaowVar.gxszxtbevo(), (4095 & 16) != 0 ? state.amount : null, (4095 & 32) != 0 ? state.quantity : zoijcleaowVar.nufgyqmvbu(), (4095 & 64) != 0 ? state.pricePerUnit : null, (4095 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.totalPrice : null, (4095 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.measureType : zoijcleaowVar.wkgbmnqykc(), (4095 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.markCodes : zoijcleaowVar.ppxfxbqfkf(), (4095 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.warningMessage : null, (4095 & 2048) != 0 ? state.price : zoijcleaowVar.lqeggnwhkg(), (4095 & 4096) != 0 ? state.isLoading : false);
    }
}
