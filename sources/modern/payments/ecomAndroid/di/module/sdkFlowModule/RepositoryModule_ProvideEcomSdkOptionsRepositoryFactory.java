package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory implements wkgbmnqykc {
    private final RepositoryModule module;
    private final iobyxmoadg uiPreferencesRepositoryProvider;

    public RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        this.module = repositoryModule;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar;
    }

    public static RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        return new RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory(repositoryModule, iobyxmoadgVar);
    }

    public static EcomSdkOptionsRepository provideEcomSdkOptionsRepository(RepositoryModule repositoryModule, UIPreferencesRepository uIPreferencesRepository) {
        return (EcomSdkOptionsRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideEcomSdkOptionsRepository(uIPreferencesRepository));
    }

    @Override // fg.iobyxmoadg
    public EcomSdkOptionsRepository get() {
        return provideEcomSdkOptionsRepository(this.module, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
    }
}
