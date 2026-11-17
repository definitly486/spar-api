package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetSessionIdUseCaseImplFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg merchantDataProvider;
    private final UseCaseModule module;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg unsafeEcomApiRepositoryProvider;

    public UseCaseModule_ProvideGetSessionIdUseCaseImplFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        this.module = useCaseModule;
        this.unsafeEcomApiRepositoryProvider = iobyxmoadgVar;
        this.ecomApiRepositoryProvider = iobyxmoadgVar2;
        this.reducerProvider = iobyxmoadgVar3;
        this.merchantDataProvider = iobyxmoadgVar4;
        this.stateHandlerProvider = iobyxmoadgVar5;
        this.appDataRepositoryProvider = iobyxmoadgVar6;
        this.ecomMetricUtilProvider = iobyxmoadgVar7;
        this.configRepositoryProvider = iobyxmoadgVar8;
    }

    public static UseCaseModule_ProvideGetSessionIdUseCaseImplFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        return new UseCaseModule_ProvideGetSessionIdUseCaseImplFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8);
    }

    public static GetSessionIdUseCase provideGetSessionIdUseCaseImpl(UseCaseModule useCaseModule, UnsafeEcomApiRepository unsafeEcomApiRepository, SafeEcomApiRepository safeEcomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, AppDataRepository appDataRepository, EcomMetricUtil ecomMetricUtil, ConfigRepository configRepository) {
        return (GetSessionIdUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideGetSessionIdUseCaseImpl(unsafeEcomApiRepository, safeEcomApiRepository, reducer, merchantDataProvider, stateHandler, appDataRepository, ecomMetricUtil, configRepository));
    }

    @Override // fg.iobyxmoadg
    public GetSessionIdUseCase get() {
        return provideGetSessionIdUseCaseImpl(this.module, (UnsafeEcomApiRepository) this.unsafeEcomApiRepositoryProvider.get(), (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get(), (StateHandler) this.stateHandlerProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (ConfigRepository) this.configRepositoryProvider.get());
    }
}
