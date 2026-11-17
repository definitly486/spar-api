package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.data.dataSource.UnsafeEcomMockDataSourceImpl;
import modern.payments.ecomAndroid.data.dataSource.UnsafeEcomNetworkDataSourceImpl;
import modern.payments.ecomAndroid.di.qualifier.dataSource.EcomUnsafe;
import modern.payments.ecomAndroid.di.qualifier.dataSource.MockUnsafe;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/DataSourceModule;", "", "()V", "provideUnsafeEcomMockDataSource", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "context", "Landroid/content/Context;", "tracker", "Lmodern/payments/tracker/ITracker;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "provideUnsafeEcomNetworkDataSource", "unsafeCallEcomApi", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DataSourceModule {
    @SdkFlowScope
    @MockUnsafe
    public final UnsafeEcomDataSource provideUnsafeEcomMockDataSource(Context context, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new UnsafeEcomMockDataSourceImpl(context, tracker, optionsRepository);
    }

    @EcomUnsafe
    @SdkFlowScope
    public final UnsafeEcomDataSource provideUnsafeEcomNetworkDataSource(UnsafeCallEcomApi unsafeCallEcomApi) {
        zdlpuopuiu.btonecajqb(unsafeCallEcomApi, "unsafeCallEcomApi");
        return new UnsafeEcomNetworkDataSourceImpl(unsafeCallEcomApi);
    }
}
