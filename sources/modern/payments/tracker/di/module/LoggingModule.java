package modern.payments.tracker.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.di.qualifier.logWriter.ConsoleWriter;
import modern.payments.tracker.di.qualifier.logWriter.FileWriter;
import modern.payments.tracker.di.scope.TrackerComponentScope;
import modern.payments.tracker.util.contract.LoggingContract;
import modern.payments.tracker.util.contract.impl.LoggingContractImpl;
import modern.payments.tracker.util.logging.ILogTree;
import modern.payments.tracker.util.logging.PrettyLogFormatterTree;
import modern.payments.tracker.util.logging.logWriter.LogWriter;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/tracker/di/module/LoggingModule;", "", "<init>", "()V", "Lpj/cllcsxoeiz;", "scope", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "logToConsoleWriter", "logToFileWriter", "Lmodern/payments/tracker/util/logging/ILogTree;", "providePrettyLogFormatterTimberTree", "(Lpj/cllcsxoeiz;Lmodern/payments/tracker/util/logging/logWriter/LogWriter;Lmodern/payments/tracker/util/logging/logWriter/LogWriter;)Lmodern/payments/tracker/util/logging/ILogTree;", "Lmodern/payments/tracker/util/contract/LoggingContract;", "provideLoggingContract", "()Lmodern/payments/tracker/util/contract/LoggingContract;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoggingModule {
    @TrackerComponentScope
    public final LoggingContract provideLoggingContract() {
        return new LoggingContractImpl();
    }

    public final ILogTree providePrettyLogFormatterTimberTree(cllcsxoeiz scope, @ConsoleWriter LogWriter logToConsoleWriter, @FileWriter LogWriter logToFileWriter) {
        zdlpuopuiu.btonecajqb(scope, "scope");
        zdlpuopuiu.btonecajqb(logToConsoleWriter, "logToConsoleWriter");
        zdlpuopuiu.btonecajqb(logToFileWriter, "logToFileWriter");
        return new PrettyLogFormatterTree(logToConsoleWriter, logToFileWriter, scope);
    }
}
