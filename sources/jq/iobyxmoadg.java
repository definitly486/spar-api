package jq;

import ru.myspar.cart.impl.presentation.model.PaymentBonusesUiModel;
import ru.myspar.core.domain.models.cart.CartBonuses;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements tg.rgvfuqvkyq {
    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public PaymentBonusesUiModel.iobyxmoadg invoke(CartBonuses bonusesFromServer, String inputText) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesFromServer, "bonusesFromServer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputText, "inputText");
        Integer numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(inputText);
        if (inputText.length() == 0) {
            return null;
        }
        if (numVdvldrhtss == null) {
            return PaymentBonusesUiModel.iobyxmoadg.ErrorValue;
        }
        if (numVdvldrhtss.intValue() > bonusesFromServer.getBalance()) {
            return PaymentBonusesUiModel.iobyxmoadg.InsufficientBonusesBalance;
        }
        if (numVdvldrhtss.intValue() > bonusesFromServer.getAvailable()) {
            return PaymentBonusesUiModel.iobyxmoadg.InsufficientBonusesAvailable;
        }
        return null;
    }
}
