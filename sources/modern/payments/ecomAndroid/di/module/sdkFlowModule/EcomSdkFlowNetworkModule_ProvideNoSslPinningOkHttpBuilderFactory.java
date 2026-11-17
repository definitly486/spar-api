package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lk.iwizpuwonk;
import lk.lereixgezr;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory implements wkgbmnqykc {
    private final iobyxmoadg hostSelectionInterceptorProvider;
    private final iobyxmoadg interceptorProvider;
    private final iobyxmoadg loggingInterceptorProvider;
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg sslInteractorProvider;

    public EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        this.module = ecomSdkFlowNetworkModule;
        this.interceptorProvider = iobyxmoadgVar;
        this.loggingInterceptorProvider = iobyxmoadgVar2;
        this.sslInteractorProvider = iobyxmoadgVar3;
        this.hostSelectionInterceptorProvider = iobyxmoadgVar4;
    }

    public static EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        return new EcomSdkFlowNetworkModule_ProvideNoSslPinningOkHttpBuilderFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static lereixgezr.iobyxmoadg provideNoSslPinningOkHttpBuilder(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iwizpuwonk iwizpuwonkVar, zk.iobyxmoadg iobyxmoadgVar, SSLInteractor sSLInteractor, HostSelectionInterceptor hostSelectionInterceptor) {
        return (lereixgezr.iobyxmoadg) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideNoSslPinningOkHttpBuilder(iwizpuwonkVar, iobyxmoadgVar, sSLInteractor, hostSelectionInterceptor));
    }

    @Override // fg.iobyxmoadg
    public lereixgezr.iobyxmoadg get() {
        return provideNoSslPinningOkHttpBuilder(this.module, (iwizpuwonk) this.interceptorProvider.get(), (zk.iobyxmoadg) this.loggingInterceptorProvider.get(), (SSLInteractor) this.sslInteractorProvider.get(), (HostSelectionInterceptor) this.hostSelectionInterceptorProvider.get());
    }
}
