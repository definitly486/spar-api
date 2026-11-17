package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.util.ResourceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagerModule_ProvideResourceManagerFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final ManagerModule module;

    public ManagerModule_ProvideResourceManagerFactory(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        this.module = managerModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static ManagerModule_ProvideResourceManagerFactory create(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        return new ManagerModule_ProvideResourceManagerFactory(managerModule, iobyxmoadgVar);
    }

    public static ResourceManager provideResourceManager(ManagerModule managerModule, Context context) {
        return (ResourceManager) dxjokdxxww.eablkybsjg(managerModule.provideResourceManager(context));
    }

    @Override // fg.iobyxmoadg
    public ResourceManager get() {
        return provideResourceManager(this.module, (Context) this.contextProvider.get());
    }
}
