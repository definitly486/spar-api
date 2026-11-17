package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lk.lereixgezr;
import lm.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideRetrofitFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg okHttpClientProvider;

    public EcomSdkFlowNetworkModule_ProvideRetrofitFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        this.module = ecomSdkFlowNetworkModule;
        this.okHttpClientProvider = iobyxmoadgVar;
    }

    public static EcomSdkFlowNetworkModule_ProvideRetrofitFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        return new EcomSdkFlowNetworkModule_ProvideRetrofitFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar);
    }

    public static zdlpuopuiu provideRetrofit(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, lereixgezr lereixgezrVar) {
        return (zdlpuopuiu) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideRetrofit(lereixgezrVar));
    }

    @Override // fg.iobyxmoadg
    public zdlpuopuiu get() {
        return provideRetrofit(this.module, (lereixgezr) this.okHttpClientProvider.get());
    }
}
