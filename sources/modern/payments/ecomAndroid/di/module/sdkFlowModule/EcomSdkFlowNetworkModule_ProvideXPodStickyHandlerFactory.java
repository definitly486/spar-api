package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        this.module = ecomSdkFlowNetworkModule;
    }

    public static EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return new EcomSdkFlowNetworkModule_ProvideXPodStickyHandlerFactory(ecomSdkFlowNetworkModule);
    }

    public static XPodStickyHandler provideXPodStickyHandler(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return (XPodStickyHandler) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideXPodStickyHandler());
    }

    @Override // fg.iobyxmoadg
    public XPodStickyHandler get() {
        return provideXPodStickyHandler(this.module);
    }
}
