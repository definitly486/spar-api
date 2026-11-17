package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.ecomAndroid.secureChapter.cryptoEntities.Jose4jImpl;
import modern.payments.ecomAndroid.secureChapter.impl.EncryptedCardDataHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/CryptoModule;", "", "()V", "obtainJose4j", "Lmodern/payments/ecomAndroid/secureChapter/cryptoEntities/Jose4jImpl;", "provideEncryptedCardDataHandler", "Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "cardDataManager", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "tracker", "Lmodern/payments/tracker/ITracker;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CryptoModule {
    private final Jose4jImpl obtainJose4j() {
        return new Jose4jImpl();
    }

    @PaymentFlowScope
    public final EncryptedDataHandler provideEncryptedCardDataHandler(CardDataManager cardDataManager, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(cardDataManager, "cardDataManager");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new EncryptedCardDataHandler(cardDataManager, obtainJose4j(), tracker, optionsRepository);
    }
}
