package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.Finish3dsMethodUseCase;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideFinish3dsMethodUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final UseCaseModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;
    private final iobyxmoadg trackerProvider;

    public UseCaseModule_ProvideFinish3dsMethodUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.module = useCaseModule;
        this.ecomApiRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.stateHandlerProvider = iobyxmoadgVar3;
        this.trackerProvider = iobyxmoadgVar4;
        this.optionsRepositoryProvider = iobyxmoadgVar5;
    }

    public static UseCaseModule_ProvideFinish3dsMethodUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new UseCaseModule_ProvideFinish3dsMethodUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static Finish3dsMethodUseCase provideFinish3dsMethodUseCase(UseCaseModule useCaseModule, SafeEcomApiRepository safeEcomApiRepository, Reducer reducer, StateHandler stateHandler, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (Finish3dsMethodUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideFinish3dsMethodUseCase(safeEcomApiRepository, reducer, stateHandler, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public Finish3dsMethodUseCase get() {
        return provideFinish3dsMethodUseCase(this.module, (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (StateHandler) this.stateHandlerProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
