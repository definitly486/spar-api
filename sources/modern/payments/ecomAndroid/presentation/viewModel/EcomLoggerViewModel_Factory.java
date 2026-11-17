package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLoggerViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg logFileManagerProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public EcomLoggerViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        this.configRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.logFileManagerProvider = iobyxmoadgVar3;
        this.screenStateProvider = iobyxmoadgVar4;
    }

    public static EcomLoggerViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        return new EcomLoggerViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static EcomLoggerViewModel newInstance(ConfigRepository configRepository, Reducer reducer, LogFileManager logFileManager, StateHandler stateHandler) {
        return new EcomLoggerViewModel(configRepository, reducer, logFileManager, stateHandler);
    }

    @Override // fg.iobyxmoadg
    public EcomLoggerViewModel get() {
        return newInstance((ConfigRepository) this.configRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (LogFileManager) this.logFileManagerProvider.get(), (StateHandler) this.screenStateProvider.get());
    }
}
