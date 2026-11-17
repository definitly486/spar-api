package modern.payments.ecomAndroid.data.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.presentation.model.card.NewCardPresentationData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/data/manager/CardDataManagerImpl;", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "<init>", "()V", "Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "getCardData", "()Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "newCardPresentationData", "Lgg/wwaezpbzkn;", "saveCardData", "(Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;)V", "Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardDataManagerImpl implements CardDataManager {
    private NewCardPresentationData newCardPresentationData;

    @Override // modern.payments.ecomAndroid.domain.manager.CardDataManager
    public NewCardPresentationData getCardData() {
        NewCardPresentationData newCardPresentationData = this.newCardPresentationData;
        return newCardPresentationData == null ? new NewCardPresentationData(null, null, null, null, 15, null) : newCardPresentationData;
    }

    @Override // modern.payments.ecomAndroid.domain.manager.CardDataManager
    public void saveCardData(NewCardPresentationData newCardPresentationData) {
        zdlpuopuiu.btonecajqb(newCardPresentationData, "newCardPresentationData");
        this.newCardPresentationData = newCardPresentationData;
    }
}
