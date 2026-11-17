package modern.payments.ecomAndroid.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.StateHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class AppModule_ProvideStateHandlerFactory implements wkgbmnqykc {
    private final AppModule module;

    public AppModule_ProvideStateHandlerFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideStateHandlerFactory create(AppModule appModule) {
        return new AppModule_ProvideStateHandlerFactory(appModule);
    }

    public static StateHandler provideStateHandler(AppModule appModule) {
        return (StateHandler) dxjokdxxww.eablkybsjg(appModule.provideStateHandler());
    }

    @Override // fg.iobyxmoadg
    public StateHandler get() {
        return provideStateHandler(this.module);
    }
}
