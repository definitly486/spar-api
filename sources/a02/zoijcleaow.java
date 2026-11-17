package a02;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_bonus_product.impl.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            return state.zoijcleaow((367 & 1) != 0 ? state.article : null, (367 & 2) != 0 ? state.imageUrl : null, (367 & 4) != 0 ? state.productName : null, (367 & 8) != 0 ? state.bonusQuantity : null, (367 & 16) != 0 ? state.starsQuantity : ppxfxbqfkfVar.iobyxmoadg(), (367 & 32) != 0 ? state.review : null, (367 & 64) != 0 ? state.placeholder : null, (367 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isSendButtonEnabled : ppxfxbqfkfVar.zoijcleaow(), (367 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((367 & 1) != 0 ? state.article : null, (367 & 2) != 0 ? state.imageUrl : null, (367 & 4) != 0 ? state.productName : null, (367 & 8) != 0 ? state.bonusQuantity : null, (367 & 16) != 0 ? state.starsQuantity : 0, (367 & 32) != 0 ? state.review : zoijcleaowVar.iobyxmoadg(), (367 & 64) != 0 ? state.placeholder : null, (367 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isSendButtonEnabled : zoijcleaowVar.zoijcleaow(), (367 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((367 & 1) != 0 ? state.article : null, (367 & 2) != 0 ? state.imageUrl : null, (367 & 4) != 0 ? state.productName : null, (367 & 8) != 0 ? state.bonusQuantity : null, (367 & 16) != 0 ? state.starsQuantity : 0, (367 & 32) != 0 ? state.review : null, (367 & 64) != 0 ? state.placeholder : null, (367 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.isSendButtonEnabled : false, (367 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
