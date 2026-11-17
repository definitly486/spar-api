package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lk.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg okHttpBuilderProvider;

    public EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        this.module = ecomSdkFlowNetworkModule;
        this.okHttpBuilderProvider = iobyxmoadgVar;
    }

    public static EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        return new EcomSdkFlowNetworkModule_ProvideOkHttpClientFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar);
    }

    public static lereixgezr provideOkHttpClient(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, lereixgezr.iobyxmoadg iobyxmoadgVar) {
        return (lereixgezr) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideOkHttpClient(iobyxmoadgVar));
    }

    @Override // fg.iobyxmoadg
    public lereixgezr get() {
        return provideOkHttpClient(this.module, (lereixgezr.iobyxmoadg) this.okHttpBuilderProvider.get());
    }
}
