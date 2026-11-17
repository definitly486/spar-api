package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCase;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideDeactivateBindingUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final UseCaseModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg trackerProvider;

    public UseCaseModule_ProvideDeactivateBindingUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.module = useCaseModule;
        this.appDataRepositoryProvider = iobyxmoadgVar;
        this.ecomApiRepositoryProvider = iobyxmoadgVar2;
        this.stateHandlerProvider = iobyxmoadgVar3;
        this.trackerProvider = iobyxmoadgVar4;
        this.reducerProvider = iobyxmoadgVar5;
        this.optionsRepositoryProvider = iobyxmoadgVar6;
    }

    public static UseCaseModule_ProvideDeactivateBindingUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new UseCaseModule_ProvideDeactivateBindingUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static DeactivateBindingUseCase provideDeactivateBindingUseCase(UseCaseModule useCaseModule, AppDataRepository appDataRepository, SafeEcomApiRepository safeEcomApiRepository, StateHandler stateHandler, ITracker iTracker, Reducer reducer, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (DeactivateBindingUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideDeactivateBindingUseCase(appDataRepository, safeEcomApiRepository, stateHandler, iTracker, reducer, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public DeactivateBindingUseCase get() {
        return provideDeactivateBindingUseCase(this.module, (AppDataRepository) this.appDataRepositoryProvider.get(), (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (StateHandler) this.stateHandlerProvider.get(), (ITracker) this.trackerProvider.get(), (Reducer) this.reducerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
