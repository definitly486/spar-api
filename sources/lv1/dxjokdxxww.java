package lv1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.PaymentMethod;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {
    public static final PaymentParamsDto iobyxmoadg(PaymentMethod paymentMethod) {
        zdlpuopuiu.btonecajqb(paymentMethod, "<this>");
        if (paymentMethod instanceof PaymentMethod.Online) {
            return new PaymentParamsDto(null, lqeggnwhkg.ONLINE);
        }
        if (paymentMethod instanceof PaymentMethod.SbpOnline) {
            return new PaymentParamsDto(null, lqeggnwhkg.SBP_ONLINE);
        }
        if (paymentMethod instanceof PaymentMethod.UserCard) {
            return new PaymentParamsDto(kcexrzcfyt.vdvldrhtss(((PaymentMethod.UserCard) paymentMethod).getId()), lqeggnwhkg.USER_CARD);
        }
        throw new NoWhenBranchMatchedException();
    }
}
