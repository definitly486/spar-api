package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideUIPreferencesRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideUIPreferencesRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        this.module = repositoryModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static RepositoryModule_ProvideUIPreferencesRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar) {
        return new RepositoryModule_ProvideUIPreferencesRepositoryFactory(repositoryModule, iobyxmoadgVar);
    }

    public static UIPreferencesRepository provideUIPreferencesRepository(RepositoryModule repositoryModule, Context context) {
        return (UIPreferencesRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideUIPreferencesRepository(context));
    }

    @Override // fg.iobyxmoadg
    public UIPreferencesRepository get() {
        return provideUIPreferencesRepository(this.module, (Context) this.contextProvider.get());
    }
}
