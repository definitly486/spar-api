package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lk.iwizpuwonk;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideInterceptorFactory implements wkgbmnqykc {
    private final iobyxmoadg httpHeadersHandlerProvider;
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg trackerProvider;

    public EcomSdkFlowNetworkModule_ProvideInterceptorFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = ecomSdkFlowNetworkModule;
        this.httpHeadersHandlerProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.optionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static EcomSdkFlowNetworkModule_ProvideInterceptorFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new EcomSdkFlowNetworkModule_ProvideInterceptorFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static iwizpuwonk provideInterceptor(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, HttpHeadersHandler httpHeadersHandler, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (iwizpuwonk) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideInterceptor(httpHeadersHandler, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public iwizpuwonk get() {
        return provideInterceptor(this.module, (HttpHeadersHandler) this.httpHeadersHandlerProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
