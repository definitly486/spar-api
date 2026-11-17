package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetLocalSessionIdUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final UseCaseModule module;

    public UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar) {
        this.module = useCaseModule;
        this.appDataRepositoryProvider = iobyxmoadgVar;
    }

    public static UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar) {
        return new UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory(useCaseModule, iobyxmoadgVar);
    }

    public static GetLocalSessionIdUseCase provideGetLocalSessionIdUseCase(UseCaseModule useCaseModule, AppDataRepository appDataRepository) {
        return (GetLocalSessionIdUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideGetLocalSessionIdUseCase(appDataRepository));
    }

    @Override // fg.iobyxmoadg
    public GetLocalSessionIdUseCase get() {
        return provideGetLocalSessionIdUseCase(this.module, (AppDataRepository) this.appDataRepositoryProvider.get());
    }
}
