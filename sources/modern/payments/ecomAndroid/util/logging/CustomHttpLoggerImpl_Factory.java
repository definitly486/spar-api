package modern.payments.ecomAndroid.util.logging;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.util.contract.LoggingContract;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomHttpLoggerImpl_Factory implements wkgbmnqykc {
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final iobyxmoadg loggingContractProvider;

    public CustomHttpLoggerImpl_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        this.loggingContractProvider = iobyxmoadgVar;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar2;
    }

    public static CustomHttpLoggerImpl_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        return new CustomHttpLoggerImpl_Factory(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static CustomHttpLoggerImpl newInstance(LoggingContract loggingContract, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return new CustomHttpLoggerImpl(loggingContract, ecomSdkOptionsRepository);
    }

    @Override // fg.iobyxmoadg
    public CustomHttpLoggerImpl get() {
        return newInstance((LoggingContract) this.loggingContractProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
