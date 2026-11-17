package vo0;

import ru.myspar.proloyalty.cart.impl.presentation.model.PaymentBonusesUiModel;
import ru.myspar.proloyalty.cart.impl.utils.BonusesEditorState;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vo0.iobyxmoadg f117588iobyxmoadg;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117589iobyxmoadg;

        static {
            int[] iArr = new int[PaymentBonusesUiModel.iobyxmoadg.values().length];
            try {
                iArr[PaymentBonusesUiModel.iobyxmoadg.InsufficientBonusesBalance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentBonusesUiModel.iobyxmoadg.InsufficientBonusesAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f117589iobyxmoadg = iArr;
        }
    }

    public dxjokdxxww(vo0.iobyxmoadg bonusesErrorMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesErrorMapper, "bonusesErrorMapper");
        this.f117588iobyxmoadg = bonusesErrorMapper;
    }

    public final String iobyxmoadg(PaymentBonusesUiModel.iobyxmoadg iobyxmoadgVar, String availableBonuses, tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(availableBonuses, "availableBonuses");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        int i13 = iobyxmoadgVar == null ? -1 : iobyxmoadg.f117589iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return (String) getStringRes.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_few_bonuses), null);
        }
        if (i13 != 2) {
            return null;
        }
        return (String) getStringRes.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_unavailable_bonuses_value), availableBonuses);
    }

    public final PaymentBonusesUiModel ppxfxbqfkf(CartBonuses bonusesFromServer, BonusesEditorState bonusesLocal, tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesFromServer, "bonusesFromServer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesLocal, "bonusesLocal");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        PaymentBonusesUiModel.iobyxmoadg iobyxmoadgVarInvoke = this.f117588iobyxmoadg.invoke(bonusesFromServer, bonusesLocal.getValue().draadjrbmk());
        return new PaymentBonusesUiModel(String.valueOf(bonusesFromServer.getBalance()), String.valueOf(bonusesFromServer.getApplied()), String.valueOf(bonusesFromServer.getAvailable()), zoijcleaow(bonusesFromServer, bonusesLocal.getIsEnabled()), bonusesLocal.getIsEnabled(), bonusesLocal.getValue(), iobyxmoadg(iobyxmoadgVarInvoke, String.valueOf(bonusesFromServer.getAvailable()), getStringRes), wkgbmnqykc(bonusesFromServer, iobyxmoadgVarInvoke != null), bonusesFromServer.getTooltip());
    }

    public final PaymentBonusesUiModel.Notifications wkgbmnqykc(CartBonuses bonusesFromServer, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesFromServer, "bonusesFromServer");
        boolean z14 = bonusesFromServer.getBalance() == 0;
        boolean z15 = bonusesFromServer.getAvailable() == 0;
        if (z14) {
            return PaymentBonusesUiModel.Notifications.EmptyBalance.f92969yggfygwlhe;
        }
        if (z15) {
            return PaymentBonusesUiModel.Notifications.Unavailable.f92970yggfygwlhe;
        }
        if (z13) {
            return null;
        }
        return PaymentBonusesUiModel.Notifications.Available.f92968yggfygwlhe;
    }

    public final boolean zoijcleaow(CartBonuses bonusesFromServer, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesFromServer, "bonusesFromServer");
        return (z13 && ((bonusesFromServer.getBalance() == 0) || (bonusesFromServer.getAvailable() == 0))) ? false : true;
    }
}
