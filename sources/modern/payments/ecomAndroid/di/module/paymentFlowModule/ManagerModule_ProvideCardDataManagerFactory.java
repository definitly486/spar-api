package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagerModule_ProvideCardDataManagerFactory implements wkgbmnqykc {
    private final ManagerModule module;

    public ManagerModule_ProvideCardDataManagerFactory(ManagerModule managerModule) {
        this.module = managerModule;
    }

    public static ManagerModule_ProvideCardDataManagerFactory create(ManagerModule managerModule) {
        return new ManagerModule_ProvideCardDataManagerFactory(managerModule);
    }

    public static CardDataManager provideCardDataManager(ManagerModule managerModule) {
        return (CardDataManager) dxjokdxxww.eablkybsjg(managerModule.provideCardDataManager());
    }

    @Override // fg.iobyxmoadg
    public CardDataManager get() {
        return provideCardDataManager(this.module);
    }
}
