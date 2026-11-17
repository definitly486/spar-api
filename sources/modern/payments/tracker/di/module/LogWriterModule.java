package modern.payments.tracker.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.di.qualifier.logWriter.ConsoleWriter;
import modern.payments.tracker.di.qualifier.logWriter.FileWriter;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;
import modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter;
import modern.payments.tracker.util.logging.logWriter.LogToFileWriter;
import modern.payments.tracker.util.logging.logWriter.LogWriter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/tracker/di/module/LogWriterModule;", "", "()V", "provideLogToConsoleWriter", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "provideLogToFileWriter", "externalLogFileStorage", "Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogWriterModule {
    @ConsoleWriter
    public final LogWriter provideLogToConsoleWriter() {
        return new LogToConsoleWriter();
    }

    @FileWriter
    public final LogWriter provideLogToFileWriter(ExternalLogFileStorage externalLogFileStorage) {
        zdlpuopuiu.btonecajqb(externalLogFileStorage, "externalLogFileStorage");
        return new LogToFileWriter(externalLogFileStorage);
    }
}
