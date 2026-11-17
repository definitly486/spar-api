package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final PaymentFlowNetworkModule module;

    public PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory(PaymentFlowNetworkModule paymentFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        this.module = paymentFlowNetworkModule;
        this.configRepositoryProvider = iobyxmoadgVar;
    }

    public static PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory create(PaymentFlowNetworkModule paymentFlowNetworkModule, iobyxmoadg iobyxmoadgVar) {
        return new PaymentFlowNetworkModule_ProvideCustomSslInteractorFactory(paymentFlowNetworkModule, iobyxmoadgVar);
    }

    public static SSLInteractor provideCustomSslInteractor(PaymentFlowNetworkModule paymentFlowNetworkModule, ConfigRepository configRepository) {
        return (SSLInteractor) dxjokdxxww.eablkybsjg(paymentFlowNetworkModule.provideCustomSslInteractor(configRepository));
    }

    @Override // fg.iobyxmoadg
    public SSLInteractor get() {
        return provideCustomSslInteractor(this.module, (ConfigRepository) this.configRepositoryProvider.get());
    }
}
