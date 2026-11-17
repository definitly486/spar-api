package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class ProviderModule_ProvideMerchantDataProviderFactory implements wkgbmnqykc {
    private final ProviderModule module;

    public ProviderModule_ProvideMerchantDataProviderFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideMerchantDataProviderFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideMerchantDataProviderFactory(providerModule);
    }

    public static MerchantDataProvider provideMerchantDataProvider(ProviderModule providerModule) {
        return (MerchantDataProvider) dxjokdxxww.eablkybsjg(providerModule.provideMerchantDataProvider());
    }

    @Override // fg.iobyxmoadg
    public MerchantDataProvider get() {
        return provideMerchantDataProvider(this.module);
    }
}
