package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagerModule_ProvideLogFileManagerFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final ManagerModule module;

    public ManagerModule_ProvideLogFileManagerFactory(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        this.module = managerModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static ManagerModule_ProvideLogFileManagerFactory create(ManagerModule managerModule, iobyxmoadg iobyxmoadgVar) {
        return new ManagerModule_ProvideLogFileManagerFactory(managerModule, iobyxmoadgVar);
    }

    public static LogFileManager provideLogFileManager(ManagerModule managerModule, Context context) {
        return (LogFileManager) dxjokdxxww.eablkybsjg(managerModule.provideLogFileManager(context));
    }

    @Override // fg.iobyxmoadg
    public LogFileManager get() {
        return provideLogFileManager(this.module, (Context) this.contextProvider.get());
    }
}
