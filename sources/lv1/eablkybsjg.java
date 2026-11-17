package lv1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.PaymentMethod;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f64199iobyxmoadg;

        static {
            int[] iArr = new int[lqeggnwhkg.values().length];
            try {
                iArr[lqeggnwhkg.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lqeggnwhkg.SBP_ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lqeggnwhkg.USER_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64199iobyxmoadg = iArr;
        }
    }

    public static final PaymentMethod iobyxmoadg(PaymentMethodDto paymentMethodDto) {
        zdlpuopuiu.btonecajqb(paymentMethodDto, "<this>");
        int i13 = iobyxmoadg.f64199iobyxmoadg[paymentMethodDto.getCode().ordinal()];
        if (i13 == 1) {
            return new PaymentMethod.Online(paymentMethodDto.getIcon(), paymentMethodDto.getName());
        }
        if (i13 == 2) {
            return new PaymentMethod.SbpOnline(paymentMethodDto.getIcon(), paymentMethodDto.getName());
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String cardId = paymentMethodDto.getCardId();
        zdlpuopuiu.lqeggnwhkg(cardId);
        return new PaymentMethod.UserCard(cardId, paymentMethodDto.getIcon(), paymentMethodDto.getName());
    }
}
