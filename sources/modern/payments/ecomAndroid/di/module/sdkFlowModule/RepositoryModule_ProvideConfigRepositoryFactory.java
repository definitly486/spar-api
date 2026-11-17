package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.configService.ConfigService;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideConfigRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg configServiceProvider;
    private final iobyxmoadg customSharedPreferencesProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final iobyxmoadg hostSelectionInterceptorProvider;
    private final RepositoryModule module;
    private final iobyxmoadg trackerProvider;
    private final iobyxmoadg unsafeEcomApiRepositoryProvider;

    public RepositoryModule_ProvideConfigRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.module = repositoryModule;
        this.configServiceProvider = iobyxmoadgVar;
        this.unsafeEcomApiRepositoryProvider = iobyxmoadgVar2;
        this.customSharedPreferencesProvider = iobyxmoadgVar3;
        this.trackerProvider = iobyxmoadgVar4;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar5;
        this.hostSelectionInterceptorProvider = iobyxmoadgVar6;
    }

    public static RepositoryModule_ProvideConfigRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new RepositoryModule_ProvideConfigRepositoryFactory(repositoryModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static ConfigRepository provideConfigRepository(RepositoryModule repositoryModule, ConfigService configService, UnsafeEcomApiRepository unsafeEcomApiRepository, CustomSharedPreferences customSharedPreferences, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository, HostSelectionInterceptor hostSelectionInterceptor) {
        return (ConfigRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideConfigRepository(configService, unsafeEcomApiRepository, customSharedPreferences, iTracker, ecomSdkOptionsRepository, hostSelectionInterceptor));
    }

    @Override // fg.iobyxmoadg
    public ConfigRepository get() {
        return provideConfigRepository(this.module, (ConfigService) this.configServiceProvider.get(), (UnsafeEcomApiRepository) this.unsafeEcomApiRepositoryProvider.get(), (CustomSharedPreferences) this.customSharedPreferencesProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get(), (HostSelectionInterceptor) this.hostSelectionInterceptorProvider.get());
    }
}
