package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.configService.ConfigService;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideConfigServiceFactory implements wkgbmnqykc {
    private final RepositoryModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg resourceManagerProvider;
    private final iobyxmoadg trackerProvider;
    private final iobyxmoadg unsafeEcomApiRepositoryProvider;

    public RepositoryModule_ProvideConfigServiceFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        this.module = repositoryModule;
        this.resourceManagerProvider = iobyxmoadgVar;
        this.unsafeEcomApiRepositoryProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.optionsRepositoryProvider = iobyxmoadgVar4;
    }

    public static RepositoryModule_ProvideConfigServiceFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        return new RepositoryModule_ProvideConfigServiceFactory(repositoryModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static ConfigService provideConfigService(RepositoryModule repositoryModule, ResourceManager resourceManager, UnsafeEcomApiRepository unsafeEcomApiRepository, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (ConfigService) dxjokdxxww.eablkybsjg(repositoryModule.provideConfigService(resourceManager, unsafeEcomApiRepository, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public ConfigService get() {
        return provideConfigService(this.module, (ResourceManager) this.resourceManagerProvider.get(), (UnsafeEcomApiRepository) this.unsafeEcomApiRepositoryProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
