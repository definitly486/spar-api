package kk;

import java.util.Comparator;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class tu implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
        Long lValueOf = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getAmountData();
        return kg.iobyxmoadg.wkgbmnqykc(lValueOf, amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null);
    }
}
