package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        this.module = ecomSdkFlowNetworkModule;
    }

    public static EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return new EcomSdkFlowNetworkModule_ProvideSetCookieHandlerFactory(ecomSdkFlowNetworkModule);
    }

    public static SetCookieHandler provideSetCookieHandler(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return (SetCookieHandler) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideSetCookieHandler());
    }

    @Override // fg.iobyxmoadg
    public SetCookieHandler get() {
        return provideSetCookieHandler(this.module);
    }
}
