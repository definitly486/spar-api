package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceModule_ProvideSafeEcomMockDataSourceFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final DataSourceModule module;
    private final iobyxmoadg trackerProvider;

    public DataSourceModule_ProvideSafeEcomMockDataSourceFactory(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = dataSourceModule;
        this.contextProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static DataSourceModule_ProvideSafeEcomMockDataSourceFactory create(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new DataSourceModule_ProvideSafeEcomMockDataSourceFactory(dataSourceModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static SafeEcomDataSource provideSafeEcomMockDataSource(DataSourceModule dataSourceModule, Context context, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (SafeEcomDataSource) dxjokdxxww.eablkybsjg(dataSourceModule.provideSafeEcomMockDataSource(context, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public SafeEcomDataSource get() {
        return provideSafeEcomMockDataSource(this.module, (Context) this.contextProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
