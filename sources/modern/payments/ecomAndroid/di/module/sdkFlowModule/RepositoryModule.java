package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.data.cache.AppDataRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.ConfigRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.EcomSdkOptionsRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.MerchantAnalyticRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.UIPreferencesRepositoryImpl;
import modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl;
import modern.payments.ecomAndroid.di.qualifier.dataSource.EcomUnsafe;
import modern.payments.ecomAndroid.di.qualifier.dataSource.MockUnsafe;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.ApiErrorHandler;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.OkHttpErrorHandler;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.configService.ConfigService;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.configService.ConfigServiceImpl;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007JX\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000e2\u000e\b\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0007J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0007J\\\u0010-\u001a\u00020\n2\u000e\b\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u0002012\b\b\u0001\u00102\u001a\u0002012\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u00063"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/RepositoryModule;", "", "()V", "provideAppDataRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "provideConfigRepository", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configService", "Lmodern/payments/ecomAndroid/domain/configService/ConfigService;", "unsafeEcomApiRepository", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "customSharedPreferences", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "tracker", "Lmodern/payments/tracker/ITracker;", "ecomSdkOptionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "hostSelectionInterceptor", "Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "provideConfigService", "resourceManager", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "optionsRepository", "provideEcomSdkOptionsRepository", "uiPreferencesRepository", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "provideMerchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticManager", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "provideThreeDSecureRepository", "Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "storage", "unsafeCallEcomApi", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "okHttpErrorHandlerImpl", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "apiErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "context", "Landroid/content/Context;", "provideUIPreferencesRepository", "provideUnsafeEcomApiRepository", "ipAddressProvider", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "unsafeEcomMockDataSource", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "unsafeEcomNetworkDataSource", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RepositoryModule {
    @SdkFlowScope
    public final AppDataRepository provideAppDataRepository() {
        return new AppDataRepositoryImpl();
    }

    @SdkFlowScope
    public final ConfigRepository provideConfigRepository(ConfigService configService, UnsafeEcomApiRepository unsafeEcomApiRepository, CustomSharedPreferences customSharedPreferences, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository, HostSelectionInterceptor hostSelectionInterceptor) {
        zdlpuopuiu.btonecajqb(configService, "configService");
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(customSharedPreferences, "customSharedPreferences");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        zdlpuopuiu.btonecajqb(hostSelectionInterceptor, "hostSelectionInterceptor");
        return new ConfigRepositoryImpl(configService, unsafeEcomApiRepository, customSharedPreferences, tracker, ecomSdkOptionsRepository, hostSelectionInterceptor);
    }

    @SdkFlowScope
    public final ConfigService provideConfigService(ResourceManager resourceManager, UnsafeEcomApiRepository unsafeEcomApiRepository, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new ConfigServiceImpl(resourceManager, unsafeEcomApiRepository, tracker, optionsRepository);
    }

    @SdkFlowScope
    public final EcomSdkOptionsRepository provideEcomSdkOptionsRepository(UIPreferencesRepository uiPreferencesRepository) {
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        return new EcomSdkOptionsRepositoryImpl(uiPreferencesRepository);
    }

    @SdkFlowScope
    public final MerchantAnalyticRepository provideMerchantAnalyticRepository(MerchantAnalyticManager merchantAnalyticManager) {
        zdlpuopuiu.btonecajqb(merchantAnalyticManager, "merchantAnalyticManager");
        return new MerchantAnalyticRepositoryImpl(merchantAnalyticManager);
    }

    @SdkFlowScope
    public final ThreeDSecureRepository provideThreeDSecureRepository(CustomSharedPreferences storage, UnsafeCallEcomApi unsafeCallEcomApi, ITracker tracker, @OkHttpErrorHandler NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, @ApiErrorHandler NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository, Context context) {
        zdlpuopuiu.btonecajqb(storage, "storage");
        zdlpuopuiu.btonecajqb(unsafeCallEcomApi, "unsafeCallEcomApi");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        zdlpuopuiu.btonecajqb(context, "context");
        return new ThreeDSecureRepositoryImpl(storage, unsafeCallEcomApi, tracker, okHttpErrorHandlerImpl, apiErrorHandlerImpl, ecomMetricUtil, ecomSdkOptionsRepository, context);
    }

    @SdkFlowScope
    public final UIPreferencesRepository provideUIPreferencesRepository(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new UIPreferencesRepositoryImpl(context);
    }

    @SdkFlowScope
    public final UnsafeEcomApiRepository provideUnsafeEcomApiRepository(@OkHttpErrorHandler NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, @ApiErrorHandler NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, ITracker tracker, IpAddressProvider ipAddressProvider, @MockUnsafe UnsafeEcomDataSource unsafeEcomMockDataSource, @EcomUnsafe UnsafeEcomDataSource unsafeEcomNetworkDataSource, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        zdlpuopuiu.btonecajqb(unsafeEcomMockDataSource, "unsafeEcomMockDataSource");
        zdlpuopuiu.btonecajqb(unsafeEcomNetworkDataSource, "unsafeEcomNetworkDataSource");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        return new UnsafeEcomApiRepositoryImpl(okHttpErrorHandlerImpl, apiErrorHandlerImpl, tracker, ipAddressProvider, unsafeEcomMockDataSource, unsafeEcomNetworkDataSource, ecomMetricUtil, ecomSdkOptionsRepository);
    }
}
