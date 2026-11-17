package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.tracker.util.logging.logWriter.LogWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class LogWriterModule_ProvideLogToConsoleWriterFactory implements wkgbmnqykc {
    private final LogWriterModule module;

    public LogWriterModule_ProvideLogToConsoleWriterFactory(LogWriterModule logWriterModule) {
        this.module = logWriterModule;
    }

    public static LogWriterModule_ProvideLogToConsoleWriterFactory create(LogWriterModule logWriterModule) {
        return new LogWriterModule_ProvideLogToConsoleWriterFactory(logWriterModule);
    }

    public static LogWriter provideLogToConsoleWriter(LogWriterModule logWriterModule) {
        return (LogWriter) dxjokdxxww.eablkybsjg(logWriterModule.provideLogToConsoleWriter());
    }

    @Override // fg.iobyxmoadg
    public LogWriter get() {
        return provideLogToConsoleWriter(this.module);
    }
}
