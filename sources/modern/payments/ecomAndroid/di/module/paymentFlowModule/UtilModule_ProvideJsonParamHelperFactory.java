package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideJsonParamHelperFactory implements wkgbmnqykc {
    private final UtilModule module;
    private final iobyxmoadg threeDSecureRepositoryProvider;

    public UtilModule_ProvideJsonParamHelperFactory(UtilModule utilModule, iobyxmoadg iobyxmoadgVar) {
        this.module = utilModule;
        this.threeDSecureRepositoryProvider = iobyxmoadgVar;
    }

    public static UtilModule_ProvideJsonParamHelperFactory create(UtilModule utilModule, iobyxmoadg iobyxmoadgVar) {
        return new UtilModule_ProvideJsonParamHelperFactory(utilModule, iobyxmoadgVar);
    }

    public static JsonParamHelperUtil provideJsonParamHelper(UtilModule utilModule, ThreeDSecureRepository threeDSecureRepository) {
        return (JsonParamHelperUtil) dxjokdxxww.eablkybsjg(utilModule.provideJsonParamHelper(threeDSecureRepository));
    }

    @Override // fg.iobyxmoadg
    public JsonParamHelperUtil get() {
        return provideJsonParamHelper(this.module, (ThreeDSecureRepository) this.threeDSecureRepositoryProvider.get());
    }
}
