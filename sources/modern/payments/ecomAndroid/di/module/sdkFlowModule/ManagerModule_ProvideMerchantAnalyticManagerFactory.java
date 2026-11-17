package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagerModule_ProvideMerchantAnalyticManagerFactory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final ManagerModule module;

    public ManagerModule_ProvideMerchantAnalyticManagerFactory(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        this.module = managerModule;
        this.configRepositoryProvider = iobyxmoadgVar;
    }

    public static ManagerModule_ProvideMerchantAnalyticManagerFactory create(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        return new ManagerModule_ProvideMerchantAnalyticManagerFactory(managerModule, iobyxmoadgVar);
    }

    public static MerchantAnalyticManager provideMerchantAnalyticManager(ManagerModule managerModule, ConfigRepository configRepository) {
        return (MerchantAnalyticManager) dxjokdxxww.eablkybsjg(managerModule.provideMerchantAnalyticManager(configRepository));
    }

    @Override // fg.iobyxmoadg
    public MerchantAnalyticManager get() {
        return provideMerchantAnalyticManager(this.module, (ConfigRepository) this.configRepositoryProvider.get());
    }
}
