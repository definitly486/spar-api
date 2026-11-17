package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideFinishPaymentUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final UseCaseModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg trackerProvider;

    public UseCaseModule_ProvideFinishPaymentUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.module = useCaseModule;
        this.ecomApiRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.stateHandlerProvider = iobyxmoadgVar3;
        this.trackerProvider = iobyxmoadgVar4;
        this.optionsRepositoryProvider = iobyxmoadgVar5;
    }

    public static UseCaseModule_ProvideFinishPaymentUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new UseCaseModule_ProvideFinishPaymentUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static FinishPaymentUseCase provideFinishPaymentUseCase(UseCaseModule useCaseModule, SafeEcomApiRepository safeEcomApiRepository, Reducer reducer, StateHandler stateHandler, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (FinishPaymentUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideFinishPaymentUseCase(safeEcomApiRepository, reducer, stateHandler, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public FinishPaymentUseCase get() {
        return provideFinishPaymentUseCase(this.module, (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (StateHandler) this.stateHandlerProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
