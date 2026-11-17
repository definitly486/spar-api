package modern.payments.ecomAndroid;

import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdk_MembersInjector implements pf.iobyxmoadg {
    private final fg.iobyxmoadg configRepositoryProvider;
    private final fg.iobyxmoadg externalMetricsManagerProvider;
    private final fg.iobyxmoadg merchantAnalyticManagerProvider;
    private final fg.iobyxmoadg merchantAnalyticRepositoryProvider;
    private final fg.iobyxmoadg merchantDataProvider;

    public EcomSdk_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5) {
        this.externalMetricsManagerProvider = iobyxmoadgVar;
        this.configRepositoryProvider = iobyxmoadgVar2;
        this.merchantDataProvider = iobyxmoadgVar3;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar4;
        this.merchantAnalyticManagerProvider = iobyxmoadgVar5;
    }

    public static pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5) {
        return new EcomSdk_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static void injectConfigRepository(EcomSdk ecomSdk, ConfigRepository configRepository) {
        ecomSdk.configRepository = configRepository;
    }

    public static void injectExternalMetricsManager(EcomSdk ecomSdk, ExternalMetricsManager externalMetricsManager) {
        ecomSdk.externalMetricsManager = externalMetricsManager;
    }

    public static void injectMerchantAnalyticManager(EcomSdk ecomSdk, MerchantAnalyticManager merchantAnalyticManager) {
        ecomSdk.merchantAnalyticManager = merchantAnalyticManager;
    }

    public static void injectMerchantAnalyticRepository(EcomSdk ecomSdk, MerchantAnalyticRepository merchantAnalyticRepository) {
        ecomSdk.merchantAnalyticRepository = merchantAnalyticRepository;
    }

    public static void injectMerchantDataProvider(EcomSdk ecomSdk, MerchantDataProvider merchantDataProvider) {
        ecomSdk.merchantDataProvider = merchantDataProvider;
    }

    public void injectMembers(EcomSdk ecomSdk) {
        injectExternalMetricsManager(ecomSdk, (ExternalMetricsManager) this.externalMetricsManagerProvider.get());
        injectConfigRepository(ecomSdk, (ConfigRepository) this.configRepositoryProvider.get());
        injectMerchantDataProvider(ecomSdk, (MerchantDataProvider) this.merchantDataProvider.get());
        injectMerchantAnalyticRepository(ecomSdk, (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
        injectMerchantAnalyticManager(ecomSdk, (MerchantAnalyticManager) this.merchantAnalyticManagerProvider.get());
    }
}
