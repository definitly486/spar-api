package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.B3HeaderBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        this.module = ecomSdkFlowNetworkModule;
    }

    public static EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return new EcomSdkFlowNetworkModule_ProvideB3HeaderBuilderFactory(ecomSdkFlowNetworkModule);
    }

    public static B3HeaderBuilder provideB3HeaderBuilder(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return (B3HeaderBuilder) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideB3HeaderBuilder());
    }

    @Override // fg.iobyxmoadg
    public B3HeaderBuilder get() {
        return provideB3HeaderBuilder(this.module);
    }
}
