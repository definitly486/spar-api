package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final DataSourceModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg trackerProvider;

    public DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = dataSourceModule;
        this.contextProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.optionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory create(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new DataSourceModule_ProvideUnsafeEcomMockDataSourceFactory(dataSourceModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static UnsafeEcomDataSource provideUnsafeEcomMockDataSource(DataSourceModule dataSourceModule, Context context, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (UnsafeEcomDataSource) dxjokdxxww.eablkybsjg(dataSourceModule.provideUnsafeEcomMockDataSource(context, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public UnsafeEcomDataSource get() {
        return provideUnsafeEcomMockDataSource(this.module, (Context) this.contextProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
