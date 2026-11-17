package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lm.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg retrofitProvider;

    public EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        this.module = ecomSdkFlowNetworkModule;
        this.retrofitProvider = iobyxmoadgVar;
    }

    public static EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        return new EcomSdkFlowNetworkModule_ProvideUnsafeEcomApiFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar);
    }

    public static UnsafeCallEcomApi provideUnsafeEcomApi(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, zdlpuopuiu zdlpuopuiuVar) {
        return (UnsafeCallEcomApi) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideUnsafeEcomApi(zdlpuopuiuVar));
    }

    @Override // fg.iobyxmoadg
    public UnsafeCallEcomApi get() {
        return provideUnsafeEcomApi(this.module, (zdlpuopuiu) this.retrofitProvider.get());
    }
}
