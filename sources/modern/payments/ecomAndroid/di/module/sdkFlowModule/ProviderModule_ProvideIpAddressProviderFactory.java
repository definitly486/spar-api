package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class ProviderModule_ProvideIpAddressProviderFactory implements wkgbmnqykc {
    private final ProviderModule module;

    public ProviderModule_ProvideIpAddressProviderFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideIpAddressProviderFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideIpAddressProviderFactory(providerModule);
    }

    public static IpAddressProvider provideIpAddressProvider(ProviderModule providerModule) {
        return (IpAddressProvider) dxjokdxxww.eablkybsjg(providerModule.provideIpAddressProvider());
    }

    @Override // fg.iobyxmoadg
    public IpAddressProvider get() {
        return provideIpAddressProvider(this.module);
    }
}
