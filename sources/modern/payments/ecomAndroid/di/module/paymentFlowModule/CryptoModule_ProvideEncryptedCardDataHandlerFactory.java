package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class CryptoModule_ProvideEncryptedCardDataHandlerFactory implements wkgbmnqykc {
    private final iobyxmoadg cardDataManagerProvider;
    private final CryptoModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg trackerProvider;

    public CryptoModule_ProvideEncryptedCardDataHandlerFactory(CryptoModule cryptoModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = cryptoModule;
        this.cardDataManagerProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.optionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static CryptoModule_ProvideEncryptedCardDataHandlerFactory create(CryptoModule cryptoModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new CryptoModule_ProvideEncryptedCardDataHandlerFactory(cryptoModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static EncryptedDataHandler provideEncryptedCardDataHandler(CryptoModule cryptoModule, CardDataManager cardDataManager, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (EncryptedDataHandler) dxjokdxxww.eablkybsjg(cryptoModule.provideEncryptedCardDataHandler(cardDataManager, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public EncryptedDataHandler get() {
        return provideEncryptedCardDataHandler(this.module, (CardDataManager) this.cardDataManagerProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
