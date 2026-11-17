package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideAppDataRepositoryFactory implements wkgbmnqykc {
    private final RepositoryModule module;

    public RepositoryModule_ProvideAppDataRepositoryFactory(RepositoryModule repositoryModule) {
        this.module = repositoryModule;
    }

    public static RepositoryModule_ProvideAppDataRepositoryFactory create(RepositoryModule repositoryModule) {
        return new RepositoryModule_ProvideAppDataRepositoryFactory(repositoryModule);
    }

    public static AppDataRepository provideAppDataRepository(RepositoryModule repositoryModule) {
        return (AppDataRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideAppDataRepository());
    }

    @Override // fg.iobyxmoadg
    public AppDataRepository get() {
        return provideAppDataRepository(this.module);
    }
}
