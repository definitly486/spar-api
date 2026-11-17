package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.util.AppNameUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideAppNameUtilFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final UtilModule module;

    public UtilModule_ProvideAppNameUtilFactory(UtilModule utilModule, iobyxmoadg iobyxmoadgVar) {
        this.module = utilModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static UtilModule_ProvideAppNameUtilFactory create(UtilModule utilModule, iobyxmoadg iobyxmoadgVar) {
        return new UtilModule_ProvideAppNameUtilFactory(utilModule, iobyxmoadgVar);
    }

    public static AppNameUtil provideAppNameUtil(UtilModule utilModule, Context context) {
        return (AppNameUtil) dxjokdxxww.eablkybsjg(utilModule.provideAppNameUtil(context));
    }

    @Override // fg.iobyxmoadg
    public AppNameUtil get() {
        return provideAppNameUtil(this.module, (Context) this.contextProvider.get());
    }
}
