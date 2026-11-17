package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl;
import modern.payments.ecomAndroid.data.dataSource.SafeEcomNetworkDataSourceImpl;
import modern.payments.ecomAndroid.di.qualifier.dataSource.EcomSafe;
import modern.payments.ecomAndroid.di.qualifier.dataSource.MockSafe;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/DataSourceModule;", "", "()V", "provideSafeEcomMockDataSource", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "context", "Landroid/content/Context;", "tracker", "Lmodern/payments/tracker/ITracker;", "ecomSdkOptionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "provideSafeEcomNetworkDataSource", "lazyNetworkModule", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DataSourceModule {
    @MockSafe
    @PaymentFlowScope
    public final SafeEcomDataSource provideSafeEcomMockDataSource(Context context, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        return new SafeEcomMockDataSourceImpl(context, tracker, ecomSdkOptionsRepository);
    }

    @PaymentFlowScope
    @EcomSafe
    public final SafeEcomDataSource provideSafeEcomNetworkDataSource(LazyNetworkModule lazyNetworkModule) {
        zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        return new SafeEcomNetworkDataSourceImpl(lazyNetworkModule);
    }
}
