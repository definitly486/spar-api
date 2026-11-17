package modern.payments.ecomAndroid.di.component;

import ag.dxjokdxxww;
import ag.eablkybsjg;
import ag.nufgyqmvbu;
import ag.ppxfxbqfkf;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import lk.lereixgezr;
import modern.payments.ecomAndroid.EcomActivity;
import modern.payments.ecomAndroid.EcomActivityViewModel;
import modern.payments.ecomAndroid.EcomActivityViewModel_Factory;
import modern.payments.ecomAndroid.EcomActivity_MembersInjector;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.EcomSdk_MembersInjector;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.di.module.AppModule;
import modern.payments.ecomAndroid.di.module.AppModule_ProvideDefaultSharedPreferencesFactory;
import modern.payments.ecomAndroid.di.module.AppModule_ProvideReducerFactory;
import modern.payments.ecomAndroid.di.module.AppModule_ProvideSPayFlowHelperFactory;
import modern.payments.ecomAndroid.di.module.AppModule_ProvideStateHandlerFactory;
import modern.payments.ecomAndroid.di.module.SdkFlowModule;
import modern.payments.ecomAndroid.di.module.SdkFlowModule_ProvideExternalMetricsManagerFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.CoilModule;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.CoilModule_ProvideCoilFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.CryptoModule;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.CryptoModule_ProvideEncryptedCardDataHandlerFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.DataSourceModule_ProvideSafeEcomMockDataSourceFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.ManagerModule_ProvideCardDataManagerFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.ManagerModule_ProvideLogFileManagerFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModule;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.RepositoryModule_ProvideSafeEcomApiRepositoryFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideDeactivateBindingUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideFinish3dsMethodUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideFinishPaymentUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideGetIpAddressUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideGetPaymentOrderUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideGetPaymentTokenUseCaseFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UseCaseModule_ProvideGetSessionIdUseCaseImplFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule_ProvideHtmlFormParserFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule_ProvideJsonParamHelperFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule_ProvideShakeDetectorFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory_Factory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.DataSourceModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideInterceptorFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideRetrofitFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ManagerModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ManagerModule_ProvideMerchantAnalyticManagerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ManagerModule_ProvideResourceManagerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.MediaModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.MediaModule_ProvideMediaPlayerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.NetworkErrorHandlerModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ProviderModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ProviderModule_ProvideIpAddressProviderFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.ProviderModule_ProvideMerchantDataProviderFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideAppDataRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideConfigRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideConfigServiceFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideMerchantAnalyticRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideThreeDSecureRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideUIPreferencesRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.UtilModule;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.UtilModule_ProvideAppNameUtilFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.UtilModule_ProvideClearSdkUtilFactory;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.UtilModule_ProvideMetricUtilFactory;
import modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment_MembersInjector;
import modern.payments.ecomAndroid.presentation.base.BaseFragment_MembersInjector;
import modern.payments.ecomAndroid.presentation.fragment.Ecom3DsMethodFragment;
import modern.payments.ecomAndroid.presentation.fragment.Ecom3DsMethodFragment_MembersInjector;
import modern.payments.ecomAndroid.presentation.fragment.EcomAddNewCardFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment_MembersInjector;
import modern.payments.ecomAndroid.presentation.fragment.EcomChallengeFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomChallengeFragment_MembersInjector;
import modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoadingFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoggerFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomNoInternetFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomOperationStatusSuccessFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomOrderFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomServerUnavailableFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel_Factory;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomDefaultErrorFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomDefaultErrorFragmentViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoadingFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoadingFragmentViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomOperationStatusSuccessViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomOperationStatusSuccessViewModel_Factory;
import modern.payments.ecomAndroid.presentation.viewModel.EcomServerUnavailableFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomServerUnavailableFragmentViewModel_Factory;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.shaker.ShakeDetector;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.di.component.TrackerComponent;
import modern.payments.tracker.util.contract.LoggingContract;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
public final class DaggerEcomSdkFlowComponent {

    private static final class Builder implements EcomSdkFlowComponent.Builder {
        private Context context;
        private TrackerComponent trackerComponent;

        private Builder() {
        }

        @Override // modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent.Builder
        public EcomSdkFlowComponent build() {
            dxjokdxxww.iobyxmoadg(this.trackerComponent, TrackerComponent.class);
            dxjokdxxww.iobyxmoadg(this.context, Context.class);
            return new EcomSdkFlowComponentImpl(new SdkFlowModule(), new AppModule(), new RepositoryModule(), new ProviderModule(), new DataSourceModule(), new EcomSdkFlowNetworkModule(), new NetworkErrorHandlerModule(), new ManagerModule(), new UtilModule(), new MediaModule(), this.trackerComponent, this.context);
        }

        @Override // modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) dxjokdxxww.zoijcleaow(context);
            return this;
        }

        @Override // modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent.Builder
        public Builder trackerComponent(TrackerComponent trackerComponent) {
            this.trackerComponent = (TrackerComponent) dxjokdxxww.zoijcleaow(trackerComponent);
            return this;
        }
    }

    private static final class EcomSdkFlowComponentImpl implements EcomSdkFlowComponent {
        private final Context context;
        private iobyxmoadg contextProvider;
        private final EcomSdkFlowComponentImpl ecomSdkFlowComponentImpl;
        private iobyxmoadg getITrackerProvider;
        private iobyxmoadg getLoggingContractProvider;
        private iobyxmoadg provideApiErrorHandlerProvider;
        private iobyxmoadg provideAppDataRepositoryProvider;
        private iobyxmoadg provideAppNameUtilProvider;
        private iobyxmoadg provideB3HeaderBuilderProvider;
        private iobyxmoadg provideClearSdkUtilProvider;
        private iobyxmoadg provideConfigRepositoryProvider;
        private iobyxmoadg provideConfigServiceProvider;
        private iobyxmoadg provideCustomHttpLoggerProvider;
        private iobyxmoadg provideDefaultSharedPreferencesProvider;
        private iobyxmoadg provideEcomSdkOptionsRepositoryProvider;
        private iobyxmoadg provideExternalMetricsManagerProvider;
        private iobyxmoadg provideHostSelectionInterceptorProvider;
        private iobyxmoadg provideHttpHeadersHandlerProvider;
        private iobyxmoadg provideInterceptorProvider;
        private iobyxmoadg provideIpAddressProvider;
        private iobyxmoadg provideLoggingInterceptorProvider;
        private iobyxmoadg provideMediaPlayerProvider;
        private iobyxmoadg provideMerchantAnalyticManagerProvider;
        private iobyxmoadg provideMerchantAnalyticRepositoryProvider;
        private iobyxmoadg provideMerchantDataProvider;
        private iobyxmoadg provideMetricUtilProvider;
        private iobyxmoadg provideNoSslPinningOkHttpBuilderProvider;
        private iobyxmoadg provideOkHttpClientProvider;
        private iobyxmoadg provideOkHttpErrorHandlerProvider;
        private iobyxmoadg provideReducerProvider;
        private iobyxmoadg provideResourceManagerProvider;
        private iobyxmoadg provideRetrofitProvider;
        private iobyxmoadg provideSPayFlowHelperProvider;
        private iobyxmoadg provideSetCookieHandlerProvider;
        private iobyxmoadg provideStateHandlerProvider;
        private iobyxmoadg provideThreeDSecureRepositoryProvider;
        private iobyxmoadg provideUIPreferencesRepositoryProvider;
        private iobyxmoadg provideUnsafeEcomApiProvider;
        private iobyxmoadg provideUnsafeEcomApiRepositoryProvider;
        private iobyxmoadg provideUnsafeEcomMockDataSourceProvider;
        private iobyxmoadg provideUnsafeEcomNetworkDataSourceProvider;
        private iobyxmoadg provideUnsafeSslInteractorProvider;
        private iobyxmoadg provideXPodStickyHandlerProvider;
        private final TrackerComponent trackerComponent;

        private static final class GetITrackerProvider implements iobyxmoadg {
            private final TrackerComponent trackerComponent;

            GetITrackerProvider(TrackerComponent trackerComponent) {
                this.trackerComponent = trackerComponent;
            }

            @Override // fg.iobyxmoadg
            public ITracker get() {
                return (ITracker) dxjokdxxww.wkgbmnqykc(this.trackerComponent.getITracker());
            }
        }

        private static final class GetLoggingContractProvider implements iobyxmoadg {
            private final TrackerComponent trackerComponent;

            GetLoggingContractProvider(TrackerComponent trackerComponent) {
                this.trackerComponent = trackerComponent;
            }

            @Override // fg.iobyxmoadg
            public LoggingContract get() {
                return (LoggingContract) dxjokdxxww.wkgbmnqykc(this.trackerComponent.getLoggingContract());
            }
        }

        private void initialize(SdkFlowModule sdkFlowModule, AppModule appModule, RepositoryModule repositoryModule, ProviderModule providerModule, DataSourceModule dataSourceModule, EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, NetworkErrorHandlerModule networkErrorHandlerModule, ManagerModule managerModule, UtilModule utilModule, MediaModule mediaModule, TrackerComponent trackerComponent, Context context) {
            this.provideExternalMetricsManagerProvider = ppxfxbqfkf.zoijcleaow(SdkFlowModule_ProvideExternalMetricsManagerFactory.create(sdkFlowModule));
            wkgbmnqykc wkgbmnqykcVarIobyxmoadg = eablkybsjg.iobyxmoadg(context);
            this.contextProvider = wkgbmnqykcVarIobyxmoadg;
            this.provideResourceManagerProvider = ManagerModule_ProvideResourceManagerFactory.create(managerModule, wkgbmnqykcVarIobyxmoadg);
            this.provideOkHttpErrorHandlerProvider = ppxfxbqfkf.zoijcleaow(NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory.create(networkErrorHandlerModule));
            this.provideApiErrorHandlerProvider = ppxfxbqfkf.zoijcleaow(NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory.create(networkErrorHandlerModule));
            this.getITrackerProvider = new GetITrackerProvider(trackerComponent);
            this.provideIpAddressProvider = ppxfxbqfkf.zoijcleaow(ProviderModule_ProvideIpAddressProviderFactory.create(providerModule));
            iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideUIPreferencesRepositoryFactory.create(repositoryModule, this.contextProvider));
            this.provideUIPreferencesRepositoryProvider = iobyxmoadgVarZoijcleaow;
            iobyxmoadg iobyxmoadgVarZoijcleaow2 = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideEcomSdkOptionsRepositoryFactory.create(repositoryModule, iobyxmoadgVarZoijcleaow));
            this.provideEcomSdkOptionsRepositoryProvider = iobyxmoadgVarZoijcleaow2;
            this.provideUnsafeEcomMockDataSourceProvider = ppxfxbqfkf.zoijcleaow(DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory.create(dataSourceModule, this.contextProvider, this.getITrackerProvider, iobyxmoadgVarZoijcleaow2));
            this.provideB3HeaderBuilderProvider = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory.create(ecomSdkFlowNetworkModule));
            this.provideSetCookieHandlerProvider = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory.create(ecomSdkFlowNetworkModule));
            this.provideMerchantDataProvider = ppxfxbqfkf.zoijcleaow(ProviderModule_ProvideMerchantDataProviderFactory.create(providerModule));
            this.provideAppDataRepositoryProvider = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideAppDataRepositoryFactory.create(repositoryModule));
            iobyxmoadg iobyxmoadgVarZoijcleaow3 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory.create(ecomSdkFlowNetworkModule));
            this.provideXPodStickyHandlerProvider = iobyxmoadgVarZoijcleaow3;
            iobyxmoadg iobyxmoadgVarZoijcleaow4 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory.create(ecomSdkFlowNetworkModule, this.provideB3HeaderBuilderProvider, this.provideResourceManagerProvider, this.provideSetCookieHandlerProvider, this.provideMerchantDataProvider, this.provideAppDataRepositoryProvider, iobyxmoadgVarZoijcleaow3, this.provideIpAddressProvider));
            this.provideHttpHeadersHandlerProvider = iobyxmoadgVarZoijcleaow4;
            this.provideInterceptorProvider = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideInterceptorFactory.create(ecomSdkFlowNetworkModule, iobyxmoadgVarZoijcleaow4, this.getITrackerProvider, this.provideEcomSdkOptionsRepositoryProvider));
            GetLoggingContractProvider getLoggingContractProvider = new GetLoggingContractProvider(trackerComponent);
            this.getLoggingContractProvider = getLoggingContractProvider;
            iobyxmoadg iobyxmoadgVarZoijcleaow5 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory.create(ecomSdkFlowNetworkModule, this.provideEcomSdkOptionsRepositoryProvider, getLoggingContractProvider));
            this.provideCustomHttpLoggerProvider = iobyxmoadgVarZoijcleaow5;
            this.provideLoggingInterceptorProvider = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory.create(ecomSdkFlowNetworkModule, iobyxmoadgVarZoijcleaow5));
            this.provideUnsafeSslInteractorProvider = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory.create(ecomSdkFlowNetworkModule));
            iobyxmoadg iobyxmoadgVarZoijcleaow6 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory.create(ecomSdkFlowNetworkModule));
            this.provideHostSelectionInterceptorProvider = iobyxmoadgVarZoijcleaow6;
            iobyxmoadg iobyxmoadgVarZoijcleaow7 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory.create(ecomSdkFlowNetworkModule, this.provideInterceptorProvider, this.provideLoggingInterceptorProvider, this.provideUnsafeSslInteractorProvider, iobyxmoadgVarZoijcleaow6));
            this.provideNoSslPinningOkHttpBuilderProvider = iobyxmoadgVarZoijcleaow7;
            iobyxmoadg iobyxmoadgVarZoijcleaow8 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory.create(ecomSdkFlowNetworkModule, iobyxmoadgVarZoijcleaow7));
            this.provideOkHttpClientProvider = iobyxmoadgVarZoijcleaow8;
            iobyxmoadg iobyxmoadgVarZoijcleaow9 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideRetrofitFactory.create(ecomSdkFlowNetworkModule, iobyxmoadgVarZoijcleaow8));
            this.provideRetrofitProvider = iobyxmoadgVarZoijcleaow9;
            iobyxmoadg iobyxmoadgVarZoijcleaow10 = ppxfxbqfkf.zoijcleaow(EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory.create(ecomSdkFlowNetworkModule, iobyxmoadgVarZoijcleaow9));
            this.provideUnsafeEcomApiProvider = iobyxmoadgVarZoijcleaow10;
            this.provideUnsafeEcomNetworkDataSourceProvider = ppxfxbqfkf.zoijcleaow(DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory.create(dataSourceModule, iobyxmoadgVarZoijcleaow10));
            UtilModule_ProvideAppNameUtilFactory utilModule_ProvideAppNameUtilFactoryCreate = UtilModule_ProvideAppNameUtilFactory.create(utilModule, this.contextProvider);
            this.provideAppNameUtilProvider = utilModule_ProvideAppNameUtilFactoryCreate;
            iobyxmoadg iobyxmoadgVarZoijcleaow11 = ppxfxbqfkf.zoijcleaow(UtilModule_ProvideMetricUtilFactory.create(utilModule, this.contextProvider, this.provideEcomSdkOptionsRepositoryProvider, this.provideAppDataRepositoryProvider, utilModule_ProvideAppNameUtilFactoryCreate, this.getITrackerProvider));
            this.provideMetricUtilProvider = iobyxmoadgVarZoijcleaow11;
            iobyxmoadg iobyxmoadgVarZoijcleaow12 = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideUnsafeEcomApiRepositoryFactory.create(repositoryModule, this.provideOkHttpErrorHandlerProvider, this.provideApiErrorHandlerProvider, this.getITrackerProvider, this.provideIpAddressProvider, this.provideUnsafeEcomMockDataSourceProvider, this.provideUnsafeEcomNetworkDataSourceProvider, iobyxmoadgVarZoijcleaow11, this.provideEcomSdkOptionsRepositoryProvider));
            this.provideUnsafeEcomApiRepositoryProvider = iobyxmoadgVarZoijcleaow12;
            this.provideConfigServiceProvider = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideConfigServiceFactory.create(repositoryModule, this.provideResourceManagerProvider, iobyxmoadgVarZoijcleaow12, this.getITrackerProvider, this.provideEcomSdkOptionsRepositoryProvider));
            iobyxmoadg iobyxmoadgVarZoijcleaow13 = ppxfxbqfkf.zoijcleaow(AppModule_ProvideDefaultSharedPreferencesFactory.create(appModule, this.contextProvider));
            this.provideDefaultSharedPreferencesProvider = iobyxmoadgVarZoijcleaow13;
            iobyxmoadg iobyxmoadgVarZoijcleaow14 = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideConfigRepositoryFactory.create(repositoryModule, this.provideConfigServiceProvider, this.provideUnsafeEcomApiRepositoryProvider, iobyxmoadgVarZoijcleaow13, this.getITrackerProvider, this.provideEcomSdkOptionsRepositoryProvider, this.provideHostSelectionInterceptorProvider));
            this.provideConfigRepositoryProvider = iobyxmoadgVarZoijcleaow14;
            iobyxmoadg iobyxmoadgVarZoijcleaow15 = ppxfxbqfkf.zoijcleaow(ManagerModule_ProvideMerchantAnalyticManagerFactory.create(managerModule, iobyxmoadgVarZoijcleaow14));
            this.provideMerchantAnalyticManagerProvider = iobyxmoadgVarZoijcleaow15;
            this.provideMerchantAnalyticRepositoryProvider = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideMerchantAnalyticRepositoryFactory.create(repositoryModule, iobyxmoadgVarZoijcleaow15));
            this.provideStateHandlerProvider = ppxfxbqfkf.zoijcleaow(AppModule_ProvideStateHandlerFactory.create(appModule));
            iobyxmoadg iobyxmoadgVarZoijcleaow16 = ppxfxbqfkf.zoijcleaow(UtilModule_ProvideClearSdkUtilFactory.create(utilModule, this.provideSetCookieHandlerProvider, this.provideIpAddressProvider, this.provideMerchantDataProvider));
            this.provideClearSdkUtilProvider = iobyxmoadgVarZoijcleaow16;
            this.provideReducerProvider = ppxfxbqfkf.zoijcleaow(AppModule_ProvideReducerFactory.create(appModule, this.provideStateHandlerProvider, this.provideAppDataRepositoryProvider, iobyxmoadgVarZoijcleaow16, this.provideConfigRepositoryProvider, this.provideEcomSdkOptionsRepositoryProvider, this.provideMerchantAnalyticRepositoryProvider));
            this.provideThreeDSecureRepositoryProvider = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideThreeDSecureRepositoryFactory.create(repositoryModule, this.provideDefaultSharedPreferencesProvider, this.provideUnsafeEcomApiProvider, this.getITrackerProvider, this.provideOkHttpErrorHandlerProvider, this.provideApiErrorHandlerProvider, this.provideMetricUtilProvider, this.provideEcomSdkOptionsRepositoryProvider, this.contextProvider));
            this.provideMediaPlayerProvider = ppxfxbqfkf.zoijcleaow(MediaModule_ProvideMediaPlayerFactory.create(mediaModule, this.contextProvider, this.getITrackerProvider, this.provideEcomSdkOptionsRepositoryProvider));
            this.provideSPayFlowHelperProvider = ppxfxbqfkf.zoijcleaow(AppModule_ProvideSPayFlowHelperFactory.create(appModule, this.provideConfigRepositoryProvider, this.getITrackerProvider, this.provideEcomSdkOptionsRepositoryProvider));
        }

        private EcomSdk injectEcomSdk(EcomSdk ecomSdk) {
            EcomSdk_MembersInjector.injectExternalMetricsManager(ecomSdk, (ExternalMetricsManager) this.provideExternalMetricsManagerProvider.get());
            EcomSdk_MembersInjector.injectConfigRepository(ecomSdk, (ConfigRepository) this.provideConfigRepositoryProvider.get());
            EcomSdk_MembersInjector.injectMerchantDataProvider(ecomSdk, (MerchantDataProvider) this.provideMerchantDataProvider.get());
            EcomSdk_MembersInjector.injectMerchantAnalyticRepository(ecomSdk, (MerchantAnalyticRepository) this.provideMerchantAnalyticRepositoryProvider.get());
            EcomSdk_MembersInjector.injectMerchantAnalyticManager(ecomSdk, (MerchantAnalyticManager) this.provideMerchantAnalyticManagerProvider.get());
            return ecomSdk;
        }

        @Override // modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent
        public PaymentFlowSubcomponent.Builder getPaymentFlowSubcomponent() {
            return new PaymentFlowSubcomponentBuilder(this.ecomSdkFlowComponentImpl);
        }

        @Override // modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent
        public void inject(EcomSdk ecomSdk) {
            injectEcomSdk(ecomSdk);
        }

        private EcomSdkFlowComponentImpl(SdkFlowModule sdkFlowModule, AppModule appModule, RepositoryModule repositoryModule, ProviderModule providerModule, DataSourceModule dataSourceModule, EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, NetworkErrorHandlerModule networkErrorHandlerModule, ManagerModule managerModule, UtilModule utilModule, MediaModule mediaModule, TrackerComponent trackerComponent, Context context) {
            this.ecomSdkFlowComponentImpl = this;
            this.trackerComponent = trackerComponent;
            this.context = context;
            initialize(sdkFlowModule, appModule, repositoryModule, providerModule, dataSourceModule, ecomSdkFlowNetworkModule, networkErrorHandlerModule, managerModule, utilModule, mediaModule, trackerComponent, context);
        }
    }

    private static final class PaymentFlowSubcomponentBuilder implements PaymentFlowSubcomponent.Builder {
        private final EcomSdkFlowComponentImpl ecomSdkFlowComponentImpl;

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent.Builder
        public PaymentFlowSubcomponent build() {
            return new PaymentFlowSubcomponentImpl(this.ecomSdkFlowComponentImpl, new UseCaseModule(), new CoilModule(), new modern.payments.ecomAndroid.di.module.paymentFlowModule.ManagerModule(), new modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule(), new modern.payments.ecomAndroid.di.module.paymentFlowModule.RepositoryModule(), new modern.payments.ecomAndroid.di.module.paymentFlowModule.DataSourceModule(), new CryptoModule(), new PaymentFlowNetworkModule());
        }

        private PaymentFlowSubcomponentBuilder(EcomSdkFlowComponentImpl ecomSdkFlowComponentImpl) {
            this.ecomSdkFlowComponentImpl = ecomSdkFlowComponentImpl;
        }
    }

    private static final class PaymentFlowSubcomponentImpl implements PaymentFlowSubcomponent {
        private final CoilModule coilModule;
        private iobyxmoadg ecom3dsMethodViewModelProvider;
        private iobyxmoadg ecomActivityViewModelProvider;
        private iobyxmoadg ecomAddNewCardViewModelProvider;
        private iobyxmoadg ecomBottomSheetViewModelProvider;
        private iobyxmoadg ecomChallengeViewModelProvider;
        private iobyxmoadg ecomDefaultErrorFragmentViewModelProvider;
        private iobyxmoadg ecomLoadingFragmentViewModelProvider;
        private iobyxmoadg ecomLoggerViewModelProvider;
        private iobyxmoadg ecomNoInternetFragmentViewModelProvider;
        private iobyxmoadg ecomOperationStatusSuccessViewModelProvider;
        private iobyxmoadg ecomPaymentModeViewModelProvider;
        private iobyxmoadg ecomSbpViewModelProvider;
        private final EcomSdkFlowComponentImpl ecomSdkFlowComponentImpl;
        private iobyxmoadg ecomServerUnavailableFragmentViewModelProvider;
        private iobyxmoadg mapOfClassOfAndProviderOfViewModelProvider;
        private final PaymentFlowSubcomponentImpl paymentFlowSubcomponentImpl;
        private iobyxmoadg provideCardDataManagerProvider;
        private iobyxmoadg provideCustomSslInteractorProvider;
        private iobyxmoadg provideDeactivateBindingUseCaseProvider;
        private iobyxmoadg provideEncryptedCardDataHandlerProvider;
        private iobyxmoadg provideFinish3dsMethodUseCaseProvider;
        private iobyxmoadg provideFinishPaymentUseCaseProvider;
        private iobyxmoadg provideGetIpAddressUseCaseProvider;
        private iobyxmoadg provideGetLocalSessionIdUseCaseProvider;
        private iobyxmoadg provideGetPaymentOrderUseCaseProvider;
        private iobyxmoadg provideGetPaymentTokenUseCaseProvider;
        private iobyxmoadg provideGetSessionIdUseCaseImplProvider;
        private iobyxmoadg provideHtmlFormParserProvider;
        private iobyxmoadg provideJsonParamHelperProvider;
        private iobyxmoadg provideLazyNetworkModuleProvider;
        private iobyxmoadg provideLogFileManagerProvider;
        private iobyxmoadg provideSafeEcomApiRepositoryProvider;
        private iobyxmoadg provideSafeEcomMockDataSourceProvider;
        private iobyxmoadg provideSafeEcomNetworkDataSourceProvider;
        private final modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule utilModule;
        private iobyxmoadg viewModelFactoryProvider;

        private void initialize(UseCaseModule useCaseModule, CoilModule coilModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.ManagerModule managerModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule utilModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.RepositoryModule repositoryModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.DataSourceModule dataSourceModule, CryptoModule cryptoModule, PaymentFlowNetworkModule paymentFlowNetworkModule) {
            this.ecomActivityViewModelProvider = EcomActivityViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider);
            this.provideSafeEcomMockDataSourceProvider = ppxfxbqfkf.zoijcleaow(DataSourceModule_ProvideSafeEcomMockDataSourceFactory.create(dataSourceModule, this.ecomSdkFlowComponentImpl.contextProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider));
            this.provideCustomSslInteractorProvider = ppxfxbqfkf.zoijcleaow(PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory.create(paymentFlowNetworkModule, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider));
            iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkf.zoijcleaow(PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory.create(paymentFlowNetworkModule, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider, this.ecomSdkFlowComponentImpl.provideNoSslPinningOkHttpBuilderProvider, this.provideCustomSslInteractorProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider));
            this.provideLazyNetworkModuleProvider = iobyxmoadgVarZoijcleaow;
            this.provideSafeEcomNetworkDataSourceProvider = ppxfxbqfkf.zoijcleaow(DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory.create(dataSourceModule, iobyxmoadgVarZoijcleaow));
            this.provideSafeEcomApiRepositoryProvider = ppxfxbqfkf.zoijcleaow(RepositoryModule_ProvideSafeEcomApiRepositoryFactory.create(repositoryModule, this.ecomSdkFlowComponentImpl.provideOkHttpErrorHandlerProvider, this.ecomSdkFlowComponentImpl.provideApiErrorHandlerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.provideSafeEcomMockDataSourceProvider, this.provideSafeEcomNetworkDataSourceProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider));
            this.provideGetSessionIdUseCaseImplProvider = UseCaseModule_ProvideGetSessionIdUseCaseImplFactory.create(useCaseModule, this.ecomSdkFlowComponentImpl.provideUnsafeEcomApiRepositoryProvider, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideMerchantDataProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider);
            iobyxmoadg iobyxmoadgVarZoijcleaow2 = ppxfxbqfkf.zoijcleaow(ManagerModule_ProvideCardDataManagerFactory.create(managerModule));
            this.provideCardDataManagerProvider = iobyxmoadgVarZoijcleaow2;
            this.provideEncryptedCardDataHandlerProvider = ppxfxbqfkf.zoijcleaow(CryptoModule_ProvideEncryptedCardDataHandlerFactory.create(cryptoModule, iobyxmoadgVarZoijcleaow2, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider));
            this.provideGetPaymentTokenUseCaseProvider = UseCaseModule_ProvideGetPaymentTokenUseCaseFactory.create(useCaseModule, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideMerchantDataProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.provideEncryptedCardDataHandlerProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider);
            this.provideJsonParamHelperProvider = ppxfxbqfkf.zoijcleaow(UtilModule_ProvideJsonParamHelperFactory.create(utilModule, this.ecomSdkFlowComponentImpl.provideThreeDSecureRepositoryProvider));
            this.provideGetPaymentOrderUseCaseProvider = UseCaseModule_ProvideGetPaymentOrderUseCaseFactory.create(useCaseModule, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideMerchantDataProvider, this.provideJsonParamHelperProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider);
            this.provideFinishPaymentUseCaseProvider = UseCaseModule_ProvideFinishPaymentUseCaseFactory.create(useCaseModule, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider);
            this.provideFinish3dsMethodUseCaseProvider = UseCaseModule_ProvideFinish3dsMethodUseCaseFactory.create(useCaseModule, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider);
            this.provideGetLocalSessionIdUseCaseProvider = UseCaseModule_ProvideGetLocalSessionIdUseCaseFactory.create(useCaseModule, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider);
            this.provideGetIpAddressUseCaseProvider = UseCaseModule_ProvideGetIpAddressUseCaseFactory.create(useCaseModule, this.ecomSdkFlowComponentImpl.provideUnsafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideIpAddressProvider);
            this.provideDeactivateBindingUseCaseProvider = UseCaseModule_ProvideDeactivateBindingUseCaseFactory.create(useCaseModule, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.provideSafeEcomApiRepositoryProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider);
            this.provideLogFileManagerProvider = ppxfxbqfkf.zoijcleaow(ManagerModule_ProvideLogFileManagerFactory.create(managerModule, this.ecomSdkFlowComponentImpl.contextProvider));
            this.ecomBottomSheetViewModelProvider = EcomBottomSheetViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMerchantDataProvider, this.provideGetSessionIdUseCaseImplProvider, this.provideGetPaymentTokenUseCaseProvider, this.provideGetPaymentOrderUseCaseProvider, this.provideFinishPaymentUseCaseProvider, this.provideFinish3dsMethodUseCaseProvider, this.provideGetLocalSessionIdUseCaseProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.provideGetIpAddressUseCaseProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.provideDeactivateBindingUseCaseProvider, this.provideLazyNetworkModuleProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.provideCustomSslInteractorProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider, this.provideLogFileManagerProvider, this.ecomSdkFlowComponentImpl.getITrackerProvider);
            this.ecomLoadingFragmentViewModelProvider = EcomLoadingFragmentViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider);
            this.ecomAddNewCardViewModelProvider = EcomAddNewCardViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.provideCardDataManagerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider);
            this.ecomSbpViewModelProvider = EcomSbpViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.contextProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider);
            this.ecomPaymentModeViewModelProvider = EcomPaymentModeViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider);
            this.ecomDefaultErrorFragmentViewModelProvider = EcomDefaultErrorFragmentViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMediaPlayerProvider);
            this.ecomNoInternetFragmentViewModelProvider = EcomNoInternetFragmentViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMediaPlayerProvider);
            this.ecomServerUnavailableFragmentViewModelProvider = EcomServerUnavailableFragmentViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider);
            this.ecomOperationStatusSuccessViewModelProvider = EcomOperationStatusSuccessViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideAppDataRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMediaPlayerProvider);
            this.provideHtmlFormParserProvider = ppxfxbqfkf.zoijcleaow(UtilModule_ProvideHtmlFormParserFactory.create(utilModule));
            this.ecomChallengeViewModelProvider = EcomChallengeViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider, this.provideHtmlFormParserProvider);
            this.ecom3dsMethodViewModelProvider = Ecom3dsMethodViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideStateHandlerProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideMetricUtilProvider, this.ecomSdkFlowComponentImpl.provideMerchantAnalyticRepositoryProvider);
            this.ecomLoggerViewModelProvider = EcomLoggerViewModel_Factory.create(this.ecomSdkFlowComponentImpl.provideConfigRepositoryProvider, this.ecomSdkFlowComponentImpl.provideReducerProvider, this.provideLogFileManagerProvider, this.ecomSdkFlowComponentImpl.provideStateHandlerProvider);
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = nufgyqmvbu.zoijcleaow(13).wkgbmnqykc(EcomActivityViewModel.class, this.ecomActivityViewModelProvider).wkgbmnqykc(EcomBottomSheetViewModel.class, this.ecomBottomSheetViewModelProvider).wkgbmnqykc(EcomLoadingFragmentViewModel.class, this.ecomLoadingFragmentViewModelProvider).wkgbmnqykc(EcomAddNewCardViewModel.class, this.ecomAddNewCardViewModelProvider).wkgbmnqykc(EcomSbpViewModel.class, this.ecomSbpViewModelProvider).wkgbmnqykc(EcomPaymentModeViewModel.class, this.ecomPaymentModeViewModelProvider).wkgbmnqykc(EcomDefaultErrorFragmentViewModel.class, this.ecomDefaultErrorFragmentViewModelProvider).wkgbmnqykc(EcomNoInternetFragmentViewModel.class, this.ecomNoInternetFragmentViewModelProvider).wkgbmnqykc(EcomServerUnavailableFragmentViewModel.class, this.ecomServerUnavailableFragmentViewModelProvider).wkgbmnqykc(EcomOperationStatusSuccessViewModel.class, this.ecomOperationStatusSuccessViewModelProvider).wkgbmnqykc(EcomChallengeViewModel.class, this.ecomChallengeViewModelProvider).wkgbmnqykc(Ecom3dsMethodViewModel.class, this.ecom3dsMethodViewModelProvider).wkgbmnqykc(EcomLoggerViewModel.class, this.ecomLoggerViewModelProvider).zoijcleaow();
            this.mapOfClassOfAndProviderOfViewModelProvider = nufgyqmvbuVarZoijcleaow;
            this.viewModelFactoryProvider = ppxfxbqfkf.zoijcleaow(ViewModelFactory_Factory.create(nufgyqmvbuVarZoijcleaow));
        }

        private Ecom3DsMethodFragment injectEcom3DsMethodFragment(Ecom3DsMethodFragment ecom3DsMethodFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecom3DsMethodFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecom3DsMethodFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            Ecom3DsMethodFragment_MembersInjector.injectTracker(ecom3DsMethodFragment, (ITracker) dxjokdxxww.wkgbmnqykc(this.ecomSdkFlowComponentImpl.trackerComponent.getITracker()));
            Ecom3DsMethodFragment_MembersInjector.injectOptionsRepository(ecom3DsMethodFragment, (EcomSdkOptionsRepository) this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider.get());
            return ecom3DsMethodFragment;
        }

        private EcomActivity injectEcomActivity(EcomActivity ecomActivity) {
            EcomActivity_MembersInjector.injectViewModelFactory(ecomActivity, (ViewModelFactory) this.viewModelFactoryProvider.get());
            return ecomActivity;
        }

        private EcomAddNewCardFragment injectEcomAddNewCardFragment(EcomAddNewCardFragment ecomAddNewCardFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomAddNewCardFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomAddNewCardFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomAddNewCardFragment;
        }

        private EcomBottomSheetDialogFragment injectEcomBottomSheetDialogFragment(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
            BaseBottomSheetDialogFragment_MembersInjector.injectViewModelFactory(ecomBottomSheetDialogFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseBottomSheetDialogFragment_MembersInjector.injectUiPreferencesRepository(ecomBottomSheetDialogFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            EcomBottomSheetDialogFragment_MembersInjector.injectSPayFlowHelper(ecomBottomSheetDialogFragment, (SPayFlowHelper) this.ecomSdkFlowComponentImpl.provideSPayFlowHelperProvider.get());
            EcomBottomSheetDialogFragment_MembersInjector.injectLogFileManager(ecomBottomSheetDialogFragment, (LogFileManager) this.provideLogFileManagerProvider.get());
            return ecomBottomSheetDialogFragment;
        }

        private EcomChallengeFragment injectEcomChallengeFragment(EcomChallengeFragment ecomChallengeFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomChallengeFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomChallengeFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            EcomChallengeFragment_MembersInjector.injectTracker(ecomChallengeFragment, (ITracker) dxjokdxxww.wkgbmnqykc(this.ecomSdkFlowComponentImpl.trackerComponent.getITracker()));
            EcomChallengeFragment_MembersInjector.injectOptionsRepository(ecomChallengeFragment, (EcomSdkOptionsRepository) this.ecomSdkFlowComponentImpl.provideEcomSdkOptionsRepositoryProvider.get());
            return ecomChallengeFragment;
        }

        private EcomDefaultErrorFragment injectEcomDefaultErrorFragment(EcomDefaultErrorFragment ecomDefaultErrorFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomDefaultErrorFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomDefaultErrorFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomDefaultErrorFragment;
        }

        private EcomLoadingFragment injectEcomLoadingFragment(EcomLoadingFragment ecomLoadingFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomLoadingFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomLoadingFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomLoadingFragment;
        }

        private EcomLoggerFragment injectEcomLoggerFragment(EcomLoggerFragment ecomLoggerFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomLoggerFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomLoggerFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomLoggerFragment;
        }

        private EcomNoInternetFragment injectEcomNoInternetFragment(EcomNoInternetFragment ecomNoInternetFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomNoInternetFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomNoInternetFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomNoInternetFragment;
        }

        private EcomOperationStatusSuccessFragment injectEcomOperationStatusSuccessFragment(EcomOperationStatusSuccessFragment ecomOperationStatusSuccessFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomOperationStatusSuccessFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomOperationStatusSuccessFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomOperationStatusSuccessFragment;
        }

        private EcomOrderFragment injectEcomOrderFragment(EcomOrderFragment ecomOrderFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomOrderFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomOrderFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomOrderFragment;
        }

        private EcomPaymentModeFragment injectEcomPaymentModeFragment(EcomPaymentModeFragment ecomPaymentModeFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomPaymentModeFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomPaymentModeFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomPaymentModeFragment;
        }

        private EcomSbpFragment injectEcomSbpFragment(EcomSbpFragment ecomSbpFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomSbpFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomSbpFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomSbpFragment;
        }

        private EcomServerUnavailableFragment injectEcomServerUnavailableFragment(EcomServerUnavailableFragment ecomServerUnavailableFragment) {
            BaseFragment_MembersInjector.injectViewModelFactory(ecomServerUnavailableFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
            BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomServerUnavailableFragment, (UIPreferencesRepository) this.ecomSdkFlowComponentImpl.provideUIPreferencesRepositoryProvider.get());
            return ecomServerUnavailableFragment;
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public CoilImpl getCoil() {
            return CoilModule_ProvideCoilFactory.provideCoil(this.coilModule, this.ecomSdkFlowComponentImpl.context, (lereixgezr) this.ecomSdkFlowComponentImpl.provideOkHttpClientProvider.get());
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public ShakeDetector getShakeDetector() {
            return UtilModule_ProvideShakeDetectorFactory.provideShakeDetector(this.utilModule);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomActivity ecomActivity) {
            injectEcomActivity(ecomActivity);
        }

        private PaymentFlowSubcomponentImpl(EcomSdkFlowComponentImpl ecomSdkFlowComponentImpl, UseCaseModule useCaseModule, CoilModule coilModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.ManagerModule managerModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.UtilModule utilModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.RepositoryModule repositoryModule, modern.payments.ecomAndroid.di.module.paymentFlowModule.DataSourceModule dataSourceModule, CryptoModule cryptoModule, PaymentFlowNetworkModule paymentFlowNetworkModule) {
            this.paymentFlowSubcomponentImpl = this;
            this.ecomSdkFlowComponentImpl = ecomSdkFlowComponentImpl;
            this.coilModule = coilModule;
            this.utilModule = utilModule;
            initialize(useCaseModule, coilModule, managerModule, utilModule, repositoryModule, dataSourceModule, cryptoModule, paymentFlowNetworkModule);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
            injectEcomBottomSheetDialogFragment(ecomBottomSheetDialogFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(Ecom3DsMethodFragment ecom3DsMethodFragment) {
            injectEcom3DsMethodFragment(ecom3DsMethodFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomAddNewCardFragment ecomAddNewCardFragment) {
            injectEcomAddNewCardFragment(ecomAddNewCardFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomChallengeFragment ecomChallengeFragment) {
            injectEcomChallengeFragment(ecomChallengeFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomDefaultErrorFragment ecomDefaultErrorFragment) {
            injectEcomDefaultErrorFragment(ecomDefaultErrorFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomLoadingFragment ecomLoadingFragment) {
            injectEcomLoadingFragment(ecomLoadingFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomLoggerFragment ecomLoggerFragment) {
            injectEcomLoggerFragment(ecomLoggerFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomNoInternetFragment ecomNoInternetFragment) {
            injectEcomNoInternetFragment(ecomNoInternetFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomOperationStatusSuccessFragment ecomOperationStatusSuccessFragment) {
            injectEcomOperationStatusSuccessFragment(ecomOperationStatusSuccessFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomOrderFragment ecomOrderFragment) {
            injectEcomOrderFragment(ecomOrderFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomPaymentModeFragment ecomPaymentModeFragment) {
            injectEcomPaymentModeFragment(ecomPaymentModeFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomSbpFragment ecomSbpFragment) {
            injectEcomSbpFragment(ecomSbpFragment);
        }

        @Override // modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent
        public void inject(EcomServerUnavailableFragment ecomServerUnavailableFragment) {
            injectEcomServerUnavailableFragment(ecomServerUnavailableFragment);
        }
    }

    private DaggerEcomSdkFlowComponent() {
    }

    public static EcomSdkFlowComponent.Builder builder() {
        return new Builder();
    }
}
