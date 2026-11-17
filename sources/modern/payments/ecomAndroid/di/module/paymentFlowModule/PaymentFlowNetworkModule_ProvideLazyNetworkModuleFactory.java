package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import lk.lereixgezr;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory implements wkgbmnqykc {
    private final PaymentFlowNetworkModule module;
    private final iobyxmoadg okHttpBuilderProvider;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg sslInteractorProvider;
    private final iobyxmoadg trackerProvider;

    public PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory(PaymentFlowNetworkModule paymentFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        this.module = paymentFlowNetworkModule;
        this.optionsRepositoryProvider = iobyxmoadgVar;
        this.okHttpBuilderProvider = iobyxmoadgVar2;
        this.sslInteractorProvider = iobyxmoadgVar3;
        this.trackerProvider = iobyxmoadgVar4;
    }

    public static PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory create(PaymentFlowNetworkModule paymentFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        return new PaymentFlowNetworkModule_ProvideLazyNetworkModuleFactory(paymentFlowNetworkModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static LazyNetworkModule provideLazyNetworkModule(PaymentFlowNetworkModule paymentFlowNetworkModule, EcomSdkOptionsRepository ecomSdkOptionsRepository, lereixgezr.iobyxmoadg iobyxmoadgVar, SSLInteractor sSLInteractor, ITracker iTracker) {
        return (LazyNetworkModule) dxjokdxxww.eablkybsjg(paymentFlowNetworkModule.provideLazyNetworkModule(ecomSdkOptionsRepository, iobyxmoadgVar, sSLInteractor, iTracker));
    }

    @Override // fg.iobyxmoadg
    public LazyNetworkModule get() {
        return provideLazyNetworkModule(this.module, (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get(), (lereixgezr.iobyxmoadg) this.okHttpBuilderProvider.get(), (SSLInteractor) this.sslInteractorProvider.get(), (ITracker) this.trackerProvider.get());
    }
}
