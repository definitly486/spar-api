package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;
import modern.payments.tracker.util.logging.logWriter.LogWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class LogWriterModule_ProvideLogToFileWriterFactory implements wkgbmnqykc {
    private final iobyxmoadg externalLogFileStorageProvider;
    private final LogWriterModule module;

    public LogWriterModule_ProvideLogToFileWriterFactory(LogWriterModule logWriterModule, iobyxmoadg iobyxmoadgVar) {
        this.module = logWriterModule;
        this.externalLogFileStorageProvider = iobyxmoadgVar;
    }

    public static LogWriterModule_ProvideLogToFileWriterFactory create(LogWriterModule logWriterModule, iobyxmoadg iobyxmoadgVar) {
        return new LogWriterModule_ProvideLogToFileWriterFactory(logWriterModule, iobyxmoadgVar);
    }

    public static LogWriter provideLogToFileWriter(LogWriterModule logWriterModule, ExternalLogFileStorage externalLogFileStorage) {
        return (LogWriter) dxjokdxxww.eablkybsjg(logWriterModule.provideLogToFileWriter(externalLogFileStorage));
    }

    @Override // fg.iobyxmoadg
    public LogWriter get() {
        return provideLogToFileWriter(this.module, (ExternalLogFileStorage) this.externalLogFileStorageProvider.get());
    }
}
