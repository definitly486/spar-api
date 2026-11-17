package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        this.module = ecomSdkFlowNetworkModule;
    }

    public static EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return new EcomSdkFlowNetworkModule_ProvideHostSelectionInterceptorFactory(ecomSdkFlowNetworkModule);
    }

    public static HostSelectionInterceptor provideHostSelectionInterceptor(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return (HostSelectionInterceptor) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideHostSelectionInterceptor());
    }

    @Override // fg.iobyxmoadg
    public HostSelectionInterceptor get() {
        return provideHostSelectionInterceptor(this.module);
    }
}
