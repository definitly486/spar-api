package kk;

import java.util.Comparator;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class xv implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return kg.iobyxmoadg.wkgbmnqykc(Boolean.valueOf(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getPriorityCard()), Boolean.valueOf(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getPriorityCard()));
    }
}
