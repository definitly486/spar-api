package modern.payments.ecomAndroid.data.repository;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class SafeEcomApiRepositoryImpl_Factory implements wkgbmnqykc {
    private final iobyxmoadg apiErrorHandlerImplProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg okHttpErrorHandlerImplProvider;
    private final iobyxmoadg safeEcomMockDataSourceProvider;
    private final iobyxmoadg safeEcomNetworkDataSourceProvider;
    private final iobyxmoadg trackerProvider;

    public SafeEcomApiRepositoryImpl_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        this.okHttpErrorHandlerImplProvider = iobyxmoadgVar;
        this.apiErrorHandlerImplProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.ecomMetricUtilProvider = iobyxmoadgVar4;
        this.safeEcomMockDataSourceProvider = iobyxmoadgVar5;
        this.safeEcomNetworkDataSourceProvider = iobyxmoadgVar6;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar7;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar8;
    }

    public static SafeEcomApiRepositoryImpl_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        return new SafeEcomApiRepositoryImpl_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8);
    }

    public static SafeEcomApiRepositoryImpl newInstance(NetworkErrorHandler<Throwable> networkErrorHandler, NetworkErrorHandler<EcomApiError> networkErrorHandler2, ITracker iTracker, EcomMetricUtil ecomMetricUtil, SafeEcomDataSource safeEcomDataSource, SafeEcomDataSource safeEcomDataSource2, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return new SafeEcomApiRepositoryImpl(networkErrorHandler, networkErrorHandler2, iTracker, ecomMetricUtil, safeEcomDataSource, safeEcomDataSource2, merchantAnalyticRepository, ecomSdkOptionsRepository);
    }

    @Override // fg.iobyxmoadg
    public SafeEcomApiRepositoryImpl get() {
        return newInstance((NetworkErrorHandler) this.okHttpErrorHandlerImplProvider.get(), (NetworkErrorHandler) this.apiErrorHandlerImplProvider.get(), (ITracker) this.trackerProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (SafeEcomDataSource) this.safeEcomMockDataSourceProvider.get(), (SafeEcomDataSource) this.safeEcomNetworkDataSourceProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
