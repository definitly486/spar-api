package modern.payments.ecomAndroid.domain.reducer.impl;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class ReducerImpl_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg clearSdkUtilProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg sdkOptionsRepositoryProvider;
    private final iobyxmoadg stateHandlerProvider;

    public ReducerImpl_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.stateHandlerProvider = iobyxmoadgVar;
        this.appDataRepositoryProvider = iobyxmoadgVar2;
        this.clearSdkUtilProvider = iobyxmoadgVar3;
        this.configRepositoryProvider = iobyxmoadgVar4;
        this.sdkOptionsRepositoryProvider = iobyxmoadgVar5;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar6;
    }

    public static ReducerImpl_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new ReducerImpl_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static ReducerImpl newInstance(StateHandler stateHandler, AppDataRepository appDataRepository, ClearSdkUtil clearSdkUtil, ConfigRepository configRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository, MerchantAnalyticRepository merchantAnalyticRepository) {
        return new ReducerImpl(stateHandler, appDataRepository, clearSdkUtil, configRepository, ecomSdkOptionsRepository, merchantAnalyticRepository);
    }

    @Override // fg.iobyxmoadg
    public ReducerImpl get() {
        return newInstance((StateHandler) this.stateHandlerProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (ClearSdkUtil) this.clearSdkUtilProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (EcomSdkOptionsRepository) this.sdkOptionsRepositoryProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
    }
}
