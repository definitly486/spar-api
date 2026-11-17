package modern.payments.ecomAndroid.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class AppModule_ProvideDefaultSharedPreferencesFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final AppModule module;

    public AppModule_ProvideDefaultSharedPreferencesFactory(AppModule appModule, iobyxmoadg iobyxmoadgVar) {
        this.module = appModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static AppModule_ProvideDefaultSharedPreferencesFactory create(AppModule appModule, iobyxmoadg iobyxmoadgVar) {
        return new AppModule_ProvideDefaultSharedPreferencesFactory(appModule, iobyxmoadgVar);
    }

    public static CustomSharedPreferences provideDefaultSharedPreferences(AppModule appModule, Context context) {
        return (CustomSharedPreferences) dxjokdxxww.eablkybsjg(appModule.provideDefaultSharedPreferences(context));
    }

    @Override // fg.iobyxmoadg
    public CustomSharedPreferences get() {
        return provideDefaultSharedPreferences(this.module, (Context) this.contextProvider.get());
    }
}
