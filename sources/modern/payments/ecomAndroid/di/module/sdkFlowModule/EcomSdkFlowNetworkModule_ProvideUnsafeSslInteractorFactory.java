package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory implements wkgbmnqykc {
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        this.module = ecomSdkFlowNetworkModule;
    }

    public static EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return new EcomSdkFlowNetworkModule_ProvideUnsafeSslInteractorFactory(ecomSdkFlowNetworkModule);
    }

    public static SSLInteractor provideUnsafeSslInteractor(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule) {
        return (SSLInteractor) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideUnsafeSslInteractor());
    }

    @Override // fg.iobyxmoadg
    public SSLInteractor get() {
        return provideUnsafeSslInteractor(this.module);
    }
}
