package modern.payments.ecomAndroid.domain.manager;

import kotlin.Metadata;
import modern.payments.ecomAndroid.presentation.model.card.NewCardPresentationData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "", "Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "getCardData", "()Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "newCardPresentationData", "Lgg/wwaezpbzkn;", "saveCardData", "(Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CardDataManager {
    NewCardPresentationData getCardData();

    void saveCardData(NewCardPresentationData newCardPresentationData);
}
