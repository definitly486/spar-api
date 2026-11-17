package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCase;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetPaymentTokenUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final iobyxmoadg encryptedDataHandlerProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg merchantDataProvider;
    private final UseCaseModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg trackerProvider;

    public UseCaseModule_ProvideGetPaymentTokenUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8, iobyxmoadg iobyxmoadgVar9) {
        this.module = useCaseModule;
        this.ecomApiRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.merchantDataProvider = iobyxmoadgVar3;
        this.stateHandlerProvider = iobyxmoadgVar4;
        this.trackerProvider = iobyxmoadgVar5;
        this.appDataRepositoryProvider = iobyxmoadgVar6;
        this.encryptedDataHandlerProvider = iobyxmoadgVar7;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar8;
        this.optionsRepositoryProvider = iobyxmoadgVar9;
    }

    public static UseCaseModule_ProvideGetPaymentTokenUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8, iobyxmoadg iobyxmoadgVar9) {
        return new UseCaseModule_ProvideGetPaymentTokenUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8, iobyxmoadgVar9);
    }

    public static GetPaymentTokenUseCase provideGetPaymentTokenUseCase(UseCaseModule useCaseModule, SafeEcomApiRepository safeEcomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, ITracker iTracker, AppDataRepository appDataRepository, EncryptedDataHandler encryptedDataHandler, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (GetPaymentTokenUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideGetPaymentTokenUseCase(safeEcomApiRepository, reducer, merchantDataProvider, stateHandler, iTracker, appDataRepository, encryptedDataHandler, merchantAnalyticRepository, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public GetPaymentTokenUseCase get() {
        return provideGetPaymentTokenUseCase(this.module, (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get(), (StateHandler) this.stateHandlerProvider.get(), (ITracker) this.trackerProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (EncryptedDataHandler) this.encryptedDataHandlerProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
