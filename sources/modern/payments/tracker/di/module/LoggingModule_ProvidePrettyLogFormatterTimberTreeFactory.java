package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.tracker.util.logging.ILogTree;
import modern.payments.tracker.util.logging.logWriter.LogWriter;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory implements wkgbmnqykc {
    private final iobyxmoadg logToConsoleWriterProvider;
    private final iobyxmoadg logToFileWriterProvider;
    private final LoggingModule module;
    private final iobyxmoadg scopeProvider;

    public LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory(LoggingModule loggingModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = loggingModule;
        this.scopeProvider = iobyxmoadgVar;
        this.logToConsoleWriterProvider = iobyxmoadgVar2;
        this.logToFileWriterProvider = iobyxmoadgVar3;
    }

    public static LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory create(LoggingModule loggingModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory(loggingModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static ILogTree providePrettyLogFormatterTimberTree(LoggingModule loggingModule, cllcsxoeiz cllcsxoeizVar, LogWriter logWriter, LogWriter logWriter2) {
        return (ILogTree) dxjokdxxww.eablkybsjg(loggingModule.providePrettyLogFormatterTimberTree(cllcsxoeizVar, logWriter, logWriter2));
    }

    @Override // fg.iobyxmoadg
    public ILogTree get() {
        return providePrettyLogFormatterTimberTree(this.module, (cllcsxoeiz) this.scopeProvider.get(), (LogWriter) this.logToConsoleWriterProvider.get(), (LogWriter) this.logToFileWriterProvider.get());
    }
}
