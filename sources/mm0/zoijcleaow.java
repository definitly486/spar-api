package mm0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.impl.domain.productday.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((8187 & 1) != 0 ? state.popupId : null, (8187 & 2) != 0 ? state.groupCode : null, (8187 & 4) != 0 ? state.isLoading : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (8187 & 8) != 0 ? state.title : null, (8187 & 16) != 0 ? state.subtitle : null, (8187 & 32) != 0 ? state.subtitleText : null, (8187 & 64) != 0 ? state.text : null, (8187 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.buttonText : null, (8187 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDay : null, (8187 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isCorrectData : false, (8187 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productId : null, (8187 & 2048) != 0 ? state.shopId : null, (8187 & 4096) != 0 ? state.deliveryCode : null);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        return state.zoijcleaow((8187 & 1) != 0 ? state.popupId : null, (8187 & 2) != 0 ? state.groupCode : null, (8187 & 4) != 0 ? state.isLoading : false, (8187 & 8) != 0 ? state.title : null, (8187 & 16) != 0 ? state.subtitle : null, (8187 & 32) != 0 ? state.subtitleText : null, (8187 & 64) != 0 ? state.text : null, (8187 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.buttonText : null, (8187 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDay : zoijcleaowVar.iobyxmoadg(), (8187 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isCorrectData : zoijcleaowVar.zoijcleaow(), (8187 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.productId : null, (8187 & 2048) != 0 ? state.shopId : null, (8187 & 4096) != 0 ? state.deliveryCode : null);
    }
}
