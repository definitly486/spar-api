package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class AppModule_ProvideTrackerFactory implements wkgbmnqykc {
    private final AppModule module;

    public AppModule_ProvideTrackerFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideTrackerFactory create(AppModule appModule) {
        return new AppModule_ProvideTrackerFactory(appModule);
    }

    public static ITracker provideTracker(AppModule appModule) {
        return (ITracker) dxjokdxxww.eablkybsjg(appModule.provideTracker());
    }

    @Override // fg.iobyxmoadg
    public ITracker get() {
        return provideTracker(this.module);
    }
}
