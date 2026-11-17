package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory implements wkgbmnqykc {
    private final iobyxmoadg lazyNetworkModuleProvider;
    private final DataSourceModule module;

    public DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar) {
        this.module = dataSourceModule;
        this.lazyNetworkModuleProvider = iobyxmoadgVar;
    }

    public static DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory create(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar) {
        return new DataSourceModule_ProvideSafeEcomNetworkDataSourceFactory(dataSourceModule, iobyxmoadgVar);
    }

    public static SafeEcomDataSource provideSafeEcomNetworkDataSource(DataSourceModule dataSourceModule, LazyNetworkModule lazyNetworkModule) {
        return (SafeEcomDataSource) dxjokdxxww.eablkybsjg(dataSourceModule.provideSafeEcomNetworkDataSource(lazyNetworkModule));
    }

    @Override // fg.iobyxmoadg
    public SafeEcomDataSource get() {
        return provideSafeEcomNetworkDataSource(this.module, (LazyNetworkModule) this.lazyNetworkModuleProvider.get());
    }
}
