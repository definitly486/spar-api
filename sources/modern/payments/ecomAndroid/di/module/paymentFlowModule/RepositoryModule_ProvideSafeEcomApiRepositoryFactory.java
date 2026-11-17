package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideSafeEcomApiRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg apiErrorHandlerImplProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final RepositoryModule module;
    private final iobyxmoadg okHttpErrorHandlerImplProvider;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg safeEcomMockDataSourceProvider;
    private final iobyxmoadg safeEcomNetworkDataSourceProvider;
    private final iobyxmoadg trackerProvider;

    public RepositoryModule_ProvideSafeEcomApiRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        this.module = repositoryModule;
        this.okHttpErrorHandlerImplProvider = iobyxmoadgVar;
        this.apiErrorHandlerImplProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.safeEcomMockDataSourceProvider = iobyxmoadgVar4;
        this.safeEcomNetworkDataSourceProvider = iobyxmoadgVar5;
        this.ecomMetricUtilProvider = iobyxmoadgVar6;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar7;
        this.optionsRepositoryProvider = iobyxmoadgVar8;
    }

    public static RepositoryModule_ProvideSafeEcomApiRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        return new RepositoryModule_ProvideSafeEcomApiRepositoryFactory(repositoryModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8);
    }

    public static SafeEcomApiRepository provideSafeEcomApiRepository(RepositoryModule repositoryModule, NetworkErrorHandler<Throwable> networkErrorHandler, NetworkErrorHandler<EcomApiError> networkErrorHandler2, ITracker iTracker, SafeEcomDataSource safeEcomDataSource, SafeEcomDataSource safeEcomDataSource2, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (SafeEcomApiRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideSafeEcomApiRepository(networkErrorHandler, networkErrorHandler2, iTracker, safeEcomDataSource, safeEcomDataSource2, ecomMetricUtil, merchantAnalyticRepository, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public SafeEcomApiRepository get() {
        return provideSafeEcomApiRepository(this.module, (NetworkErrorHandler) this.okHttpErrorHandlerImplProvider.get(), (NetworkErrorHandler) this.apiErrorHandlerImplProvider.get(), (ITracker) this.trackerProvider.get(), (SafeEcomDataSource) this.safeEcomMockDataSourceProvider.get(), (SafeEcomDataSource) this.safeEcomNetworkDataSourceProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
