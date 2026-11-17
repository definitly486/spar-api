package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory implements wkgbmnqykc {
    private final iobyxmoadg customHttpLoggerImplProvider;
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        this.module = ecomSdkFlowNetworkModule;
        this.customHttpLoggerImplProvider = iobyxmoadgVar;
    }

    public static EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        return new EcomSdkFlowNetworkModule_ProvideLoggingInterceptorFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar);
    }

    public static zk.iobyxmoadg provideLoggingInterceptor(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, zk.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        return (zk.iobyxmoadg) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideLoggingInterceptor(zoijcleaowVar));
    }

    @Override // fg.iobyxmoadg
    public zk.iobyxmoadg get() {
        return provideLoggingInterceptor(this.module, (zk.iobyxmoadg.zoijcleaow) this.customHttpLoggerImplProvider.get());
    }
}
