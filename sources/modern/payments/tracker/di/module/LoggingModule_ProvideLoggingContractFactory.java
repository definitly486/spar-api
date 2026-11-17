package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.tracker.util.contract.LoggingContract;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggingModule_ProvideLoggingContractFactory implements wkgbmnqykc {
    private final LoggingModule module;

    public LoggingModule_ProvideLoggingContractFactory(LoggingModule loggingModule) {
        this.module = loggingModule;
    }

    public static LoggingModule_ProvideLoggingContractFactory create(LoggingModule loggingModule) {
        return new LoggingModule_ProvideLoggingContractFactory(loggingModule);
    }

    public static LoggingContract provideLoggingContract(LoggingModule loggingModule) {
        return (LoggingContract) dxjokdxxww.eablkybsjg(loggingModule.provideLoggingContract());
    }

    @Override // fg.iobyxmoadg
    public LoggingContract get() {
        return provideLoggingContract(this.module);
    }
}
