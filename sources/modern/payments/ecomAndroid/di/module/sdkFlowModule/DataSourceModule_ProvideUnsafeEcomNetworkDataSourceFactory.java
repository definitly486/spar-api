package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory implements wkgbmnqykc {
    private final DataSourceModule module;
    private final iobyxmoadg unsafeCallEcomApiProvider;

    public DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar) {
        this.module = dataSourceModule;
        this.unsafeCallEcomApiProvider = iobyxmoadgVar;
    }

    public static DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory create(DataSourceModule dataSourceModule, iobyxmoadg iobyxmoadgVar) {
        return new DataSourceModule_ProvideUnsafeEcomNetworkDataSourceFactory(dataSourceModule, iobyxmoadgVar);
    }

    public static UnsafeEcomDataSource provideUnsafeEcomNetworkDataSource(DataSourceModule dataSourceModule, UnsafeCallEcomApi unsafeCallEcomApi) {
        return (UnsafeEcomDataSource) dxjokdxxww.eablkybsjg(dataSourceModule.provideUnsafeEcomNetworkDataSource(unsafeCallEcomApi));
    }

    @Override // fg.iobyxmoadg
    public UnsafeEcomDataSource get() {
        return provideUnsafeEcomNetworkDataSource(this.module, (UnsafeCallEcomApi) this.unsafeCallEcomApiProvider.get());
    }
}
