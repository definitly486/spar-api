package modern.payments.tracker.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;

/* JADX INFO: loaded from: classes3.dex */
public final class StorageModule_ProvideStorageModuleFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideStorageModuleFactory(StorageModule storageModule, iobyxmoadg iobyxmoadgVar) {
        this.module = storageModule;
        this.contextProvider = iobyxmoadgVar;
    }

    public static StorageModule_ProvideStorageModuleFactory create(StorageModule storageModule, iobyxmoadg iobyxmoadgVar) {
        return new StorageModule_ProvideStorageModuleFactory(storageModule, iobyxmoadgVar);
    }

    public static ExternalLogFileStorage provideStorageModule(StorageModule storageModule, Context context) {
        return (ExternalLogFileStorage) dxjokdxxww.eablkybsjg(storageModule.provideStorageModule(context));
    }

    @Override // fg.iobyxmoadg
    public ExternalLogFileStorage get() {
        return provideStorageModule(this.module, (Context) this.contextProvider.get());
    }
}
