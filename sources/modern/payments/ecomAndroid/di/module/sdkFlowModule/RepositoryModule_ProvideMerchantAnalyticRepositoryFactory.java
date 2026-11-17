package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideMerchantAnalyticRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg merchantAnalyticManagerProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideMerchantAnalyticRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        this.module = repositoryModule;
        this.merchantAnalyticManagerProvider = iobyxmoadgVar;
    }

    public static RepositoryModule_ProvideMerchantAnalyticRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        return new RepositoryModule_ProvideMerchantAnalyticRepositoryFactory(repositoryModule, iobyxmoadgVar);
    }

    public static MerchantAnalyticRepository provideMerchantAnalyticRepository(RepositoryModule repositoryModule, MerchantAnalyticManager merchantAnalyticManager) {
        return (MerchantAnalyticRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideMerchantAnalyticRepository(merchantAnalyticManager));
    }

    @Override // fg.iobyxmoadg
    public MerchantAnalyticRepository get() {
        return provideMerchantAnalyticRepository(this.module, (MerchantAnalyticManager) this.merchantAnalyticManagerProvider.get());
    }
}
