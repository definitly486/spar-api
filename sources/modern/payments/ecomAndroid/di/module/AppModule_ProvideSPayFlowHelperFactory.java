package modern.payments.ecomAndroid.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class AppModule_ProvideSPayFlowHelperFactory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final AppModule module;
    private final iobyxmoadg trackerProvider;

    public AppModule_ProvideSPayFlowHelperFactory(AppModule appModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = appModule;
        this.configRepositoryProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static AppModule_ProvideSPayFlowHelperFactory create(AppModule appModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new AppModule_ProvideSPayFlowHelperFactory(appModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static SPayFlowHelper provideSPayFlowHelper(AppModule appModule, ConfigRepository configRepository, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (SPayFlowHelper) dxjokdxxww.eablkybsjg(appModule.provideSPayFlowHelper(configRepository, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public SPayFlowHelper get() {
        return provideSPayFlowHelper(this.module, (ConfigRepository) this.configRepositoryProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
