package modern.payments.tracker.di.component;

import ag.dxjokdxxww;
import ag.eablkybsjg;
import ag.ppxfxbqfkf;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.di.module.AppModule;
import modern.payments.tracker.di.module.AppModule_ProvideTrackerFactory;
import modern.payments.tracker.di.module.LogWriterModule;
import modern.payments.tracker.di.module.LogWriterModule_ProvideLogToConsoleWriterFactory;
import modern.payments.tracker.di.module.LogWriterModule_ProvideLogToFileWriterFactory;
import modern.payments.tracker.di.module.LoggingModule;
import modern.payments.tracker.di.module.LoggingModule_ProvideLoggingContractFactory;
import modern.payments.tracker.di.module.LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory;
import modern.payments.tracker.di.module.StorageModule;
import modern.payments.tracker.di.module.StorageModule_ProvideStorageModuleFactory;
import modern.payments.tracker.util.contract.LoggingContract;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;
import modern.payments.tracker.util.logging.ILogTree;
import modern.payments.tracker.util.logging.logWriter.LogWriter;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public final class DaggerTrackerComponent {

    private static final class Builder implements TrackerComponent.Builder {
        private Context context;
        private cllcsxoeiz coroutineScope;

        private Builder() {
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent.Builder
        public TrackerComponent build() {
            dxjokdxxww.iobyxmoadg(this.context, Context.class);
            dxjokdxxww.iobyxmoadg(this.coroutineScope, cllcsxoeiz.class);
            return new TrackerComponentImpl(new AppModule(), new LoggingModule(), new LogWriterModule(), new StorageModule(), this.context, this.coroutineScope);
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) dxjokdxxww.zoijcleaow(context);
            return this;
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent.Builder
        public Builder coroutineScope(cllcsxoeiz cllcsxoeizVar) {
            this.coroutineScope = (cllcsxoeiz) dxjokdxxww.zoijcleaow(cllcsxoeizVar);
            return this;
        }
    }

    private static final class TrackerComponentImpl implements TrackerComponent {
        private iobyxmoadg contextProvider;
        private final cllcsxoeiz coroutineScope;
        private final LogWriterModule logWriterModule;
        private final LoggingModule loggingModule;
        private iobyxmoadg provideLoggingContractProvider;
        private iobyxmoadg provideStorageModuleProvider;
        private iobyxmoadg provideTrackerProvider;
        private final TrackerComponentImpl trackerComponentImpl;

        private LogWriter fileWriterLogWriter() {
            return LogWriterModule_ProvideLogToFileWriterFactory.provideLogToFileWriter(this.logWriterModule, (ExternalLogFileStorage) this.provideStorageModuleProvider.get());
        }

        private void initialize(AppModule appModule, LoggingModule loggingModule, LogWriterModule logWriterModule, StorageModule storageModule, Context context, cllcsxoeiz cllcsxoeizVar) {
            this.provideTrackerProvider = ppxfxbqfkf.zoijcleaow(AppModule_ProvideTrackerFactory.create(appModule));
            wkgbmnqykc wkgbmnqykcVarIobyxmoadg = eablkybsjg.iobyxmoadg(context);
            this.contextProvider = wkgbmnqykcVarIobyxmoadg;
            this.provideStorageModuleProvider = ppxfxbqfkf.zoijcleaow(StorageModule_ProvideStorageModuleFactory.create(storageModule, wkgbmnqykcVarIobyxmoadg));
            this.provideLoggingContractProvider = ppxfxbqfkf.zoijcleaow(LoggingModule_ProvideLoggingContractFactory.create(loggingModule));
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent
        public ITracker getITracker() {
            return (ITracker) this.provideTrackerProvider.get();
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent
        public LoggingContract getLoggingContract() {
            return (LoggingContract) this.provideLoggingContractProvider.get();
        }

        @Override // modern.payments.tracker.di.component.TrackerComponent
        public ILogTree getPrettyLogFormatterTree() {
            return LoggingModule_ProvidePrettyLogFormatterTimberTreeFactory.providePrettyLogFormatterTimberTree(this.loggingModule, this.coroutineScope, LogWriterModule_ProvideLogToConsoleWriterFactory.provideLogToConsoleWriter(this.logWriterModule), fileWriterLogWriter());
        }

        private TrackerComponentImpl(AppModule appModule, LoggingModule loggingModule, LogWriterModule logWriterModule, StorageModule storageModule, Context context, cllcsxoeiz cllcsxoeizVar) {
            this.trackerComponentImpl = this;
            this.loggingModule = loggingModule;
            this.coroutineScope = cllcsxoeizVar;
            this.logWriterModule = logWriterModule;
            initialize(appModule, loggingModule, logWriterModule, storageModule, context, cllcsxoeizVar);
        }
    }

    private DaggerTrackerComponent() {
    }

    public static TrackerComponent.Builder builder() {
        return new Builder();
    }
}
