package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.LazyNetworkModule;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCase;
import modern.payments.ecomAndroid.domain.useCase.Finish3dsMethodUseCase;
import modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCase;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetLocalSessionIdUseCase;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCase;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomBottomSheetViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg deactivateBindingUseCaseProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg finish3dsMethodUseCaseProvider;
    private final iobyxmoadg finishPaymentUseCaseProvider;
    private final iobyxmoadg getIpAddressUseCaseProvider;
    private final iobyxmoadg getLocalSessionIdUseCaseProvider;
    private final iobyxmoadg getPaymentOrderUseCaseProvider;
    private final iobyxmoadg getPaymentTokenUseCaseProvider;
    private final iobyxmoadg getSessionIdUseCaseProvider;
    private final iobyxmoadg lazyNetworkModuleProvider;
    private final iobyxmoadg logFileManagerProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg merchantDataProvider;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg sslInteractorProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg trackerProvider;

    public EcomBottomSheetViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8, iobyxmoadg iobyxmoadgVar9, iobyxmoadg iobyxmoadgVar10, iobyxmoadg iobyxmoadgVar11, iobyxmoadg iobyxmoadgVar12, iobyxmoadg iobyxmoadgVar13, iobyxmoadg iobyxmoadgVar14, iobyxmoadg iobyxmoadgVar15, iobyxmoadg iobyxmoadgVar16, iobyxmoadg iobyxmoadgVar17, iobyxmoadg iobyxmoadgVar18, iobyxmoadg iobyxmoadgVar19, iobyxmoadg iobyxmoadgVar20) {
        this.stateHandlerProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.merchantDataProvider = iobyxmoadgVar4;
        this.getSessionIdUseCaseProvider = iobyxmoadgVar5;
        this.getPaymentTokenUseCaseProvider = iobyxmoadgVar6;
        this.getPaymentOrderUseCaseProvider = iobyxmoadgVar7;
        this.finishPaymentUseCaseProvider = iobyxmoadgVar8;
        this.finish3dsMethodUseCaseProvider = iobyxmoadgVar9;
        this.getLocalSessionIdUseCaseProvider = iobyxmoadgVar10;
        this.appDataRepositoryProvider = iobyxmoadgVar11;
        this.getIpAddressUseCaseProvider = iobyxmoadgVar12;
        this.ecomMetricUtilProvider = iobyxmoadgVar13;
        this.deactivateBindingUseCaseProvider = iobyxmoadgVar14;
        this.lazyNetworkModuleProvider = iobyxmoadgVar15;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar16;
        this.sslInteractorProvider = iobyxmoadgVar17;
        this.optionsRepositoryProvider = iobyxmoadgVar18;
        this.logFileManagerProvider = iobyxmoadgVar19;
        this.trackerProvider = iobyxmoadgVar20;
    }

    public static EcomBottomSheetViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8, iobyxmoadg iobyxmoadgVar9, iobyxmoadg iobyxmoadgVar10, iobyxmoadg iobyxmoadgVar11, iobyxmoadg iobyxmoadgVar12, iobyxmoadg iobyxmoadgVar13, iobyxmoadg iobyxmoadgVar14, iobyxmoadg iobyxmoadgVar15, iobyxmoadg iobyxmoadgVar16, iobyxmoadg iobyxmoadgVar17, iobyxmoadg iobyxmoadgVar18, iobyxmoadg iobyxmoadgVar19, iobyxmoadg iobyxmoadgVar20) {
        return new EcomBottomSheetViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8, iobyxmoadgVar9, iobyxmoadgVar10, iobyxmoadgVar11, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar14, iobyxmoadgVar15, iobyxmoadgVar16, iobyxmoadgVar17, iobyxmoadgVar18, iobyxmoadgVar19, iobyxmoadgVar20);
    }

    public static EcomBottomSheetViewModel newInstance(StateHandler stateHandler, Reducer reducer, ConfigRepository configRepository, MerchantDataProvider merchantDataProvider, GetSessionIdUseCase getSessionIdUseCase, GetPaymentTokenUseCase getPaymentTokenUseCase, GetPaymentOrderUseCase getPaymentOrderUseCase, FinishPaymentUseCase finishPaymentUseCase, Finish3dsMethodUseCase finish3dsMethodUseCase, GetLocalSessionIdUseCase getLocalSessionIdUseCase, AppDataRepository appDataRepository, GetIpAddressUseCase getIpAddressUseCase, EcomMetricUtil ecomMetricUtil, DeactivateBindingUseCase deactivateBindingUseCase, LazyNetworkModule lazyNetworkModule, MerchantAnalyticRepository merchantAnalyticRepository, SSLInteractor sSLInteractor, EcomSdkOptionsRepository ecomSdkOptionsRepository, LogFileManager logFileManager, ITracker iTracker) {
        return new EcomBottomSheetViewModel(stateHandler, reducer, configRepository, merchantDataProvider, getSessionIdUseCase, getPaymentTokenUseCase, getPaymentOrderUseCase, finishPaymentUseCase, finish3dsMethodUseCase, getLocalSessionIdUseCase, appDataRepository, getIpAddressUseCase, ecomMetricUtil, deactivateBindingUseCase, lazyNetworkModule, merchantAnalyticRepository, sSLInteractor, ecomSdkOptionsRepository, logFileManager, iTracker);
    }

    @Override // fg.iobyxmoadg
    public EcomBottomSheetViewModel get() {
        return newInstance((StateHandler) this.stateHandlerProvider.get(), (Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get(), (GetSessionIdUseCase) this.getSessionIdUseCaseProvider.get(), (GetPaymentTokenUseCase) this.getPaymentTokenUseCaseProvider.get(), (GetPaymentOrderUseCase) this.getPaymentOrderUseCaseProvider.get(), (FinishPaymentUseCase) this.finishPaymentUseCaseProvider.get(), (Finish3dsMethodUseCase) this.finish3dsMethodUseCaseProvider.get(), (GetLocalSessionIdUseCase) this.getLocalSessionIdUseCaseProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (GetIpAddressUseCase) this.getIpAddressUseCaseProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (DeactivateBindingUseCase) this.deactivateBindingUseCaseProvider.get(), (LazyNetworkModule) this.lazyNetworkModuleProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (SSLInteractor) this.sslInteractorProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get(), (LogFileManager) this.logFileManagerProvider.get(), (ITracker) this.trackerProvider.get());
    }
}
