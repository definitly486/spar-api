package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg apiErrorHandlerImplProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final iobyxmoadg ipAddressProvider;
    private final RepositoryModule module;
    private final iobyxmoadg okHttpErrorHandlerImplProvider;
    private final iobyxmoadg trackerProvider;
    private final iobyxmoadg unsafeEcomMockDataSourceProvider;
    private final iobyxmoadg unsafeEcomNetworkDataSourceProvider;

    public RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        this.module = repositoryModule;
        this.okHttpErrorHandlerImplProvider = iobyxmoadgVar;
        this.apiErrorHandlerImplProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.ipAddressProvider = iobyxmoadgVar4;
        this.unsafeEcomMockDataSourceProvider = iobyxmoadgVar5;
        this.unsafeEcomNetworkDataSourceProvider = iobyxmoadgVar6;
        this.ecomMetricUtilProvider = iobyxmoadgVar7;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar8;
    }

    public static RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        return new RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory(repositoryModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8);
    }

    public static UnsafeEcomApiRepository provideUnsafeEcomApiRepository(RepositoryModule repositoryModule, NetworkErrorHandler<Throwable> networkErrorHandler, NetworkErrorHandler<EcomApiError> networkErrorHandler2, ITracker iTracker, IpAddressProvider ipAddressProvider, UnsafeEcomDataSource unsafeEcomDataSource, UnsafeEcomDataSource unsafeEcomDataSource2, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (UnsafeEcomApiRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideUnsafeEcomApiRepository(networkErrorHandler, networkErrorHandler2, iTracker, ipAddressProvider, unsafeEcomDataSource, unsafeEcomDataSource2, ecomMetricUtil, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public UnsafeEcomApiRepository get() {
        return provideUnsafeEcomApiRepository(this.module, (NetworkErrorHandler) this.okHttpErrorHandlerImplProvider.get(), (NetworkErrorHandler) this.apiErrorHandlerImplProvider.get(), (ITracker) this.trackerProvider.get(), (IpAddressProvider) this.ipAddressProvider.get(), (UnsafeEcomDataSource) this.unsafeEcomMockDataSourceProvider.get(), (UnsafeEcomDataSource) this.unsafeEcomNetworkDataSourceProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
