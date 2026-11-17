package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.util.contract.LoggingContract;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory implements wkgbmnqykc {
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final iobyxmoadg loggingContractProvider;
    private final EcomSdkFlowNetworkModule module;

    public EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        this.module = ecomSdkFlowNetworkModule;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar;
        this.loggingContractProvider = iobyxmoadgVar2;
    }

    public static EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        return new EcomSdkFlowNetworkModule_ProvideCustomHttpLoggerFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static zk.iobyxmoadg.zoijcleaow provideCustomHttpLogger(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, EcomSdkOptionsRepository ecomSdkOptionsRepository, LoggingContract loggingContract) {
        return (zk.iobyxmoadg.zoijcleaow) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideCustomHttpLogger(ecomSdkOptionsRepository, loggingContract));
    }

    @Override // fg.iobyxmoadg
    public zk.iobyxmoadg.zoijcleaow get() {
        return provideCustomHttpLogger(this.module, (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get(), (LoggingContract) this.loggingContractProvider.get());
    }
}
