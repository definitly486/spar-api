package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl;
import modern.payments.ecomAndroid.di.qualifier.dataSource.EcomSafe;
import modern.payments.ecomAndroid.di.qualifier.dataSource.MockSafe;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.ApiErrorHandler;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.OkHttpErrorHandler;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/RepositoryModule;", "", "()V", "provideSafeEcomApiRepository", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "okHttpErrorHandlerImpl", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "apiErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "tracker", "Lmodern/payments/tracker/ITracker;", "safeEcomMockDataSource", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "safeEcomNetworkDataSource", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RepositoryModule {
    @PaymentFlowScope
    public final SafeEcomApiRepository provideSafeEcomApiRepository(@OkHttpErrorHandler NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, @ApiErrorHandler NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, ITracker tracker, @MockSafe SafeEcomDataSource safeEcomMockDataSource, @EcomSafe SafeEcomDataSource safeEcomNetworkDataSource, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(safeEcomMockDataSource, "safeEcomMockDataSource");
        zdlpuopuiu.btonecajqb(safeEcomNetworkDataSource, "safeEcomNetworkDataSource");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new SafeEcomApiRepositoryImpl(okHttpErrorHandlerImpl, apiErrorHandlerImpl, tracker, ecomMetricUtil, safeEcomMockDataSource, safeEcomNetworkDataSource, merchantAnalyticRepository, optionsRepository);
    }
}
