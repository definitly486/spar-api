package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class Ecom3dsMethodViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public Ecom3dsMethodViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.screenStateProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.ecomMetricUtilProvider = iobyxmoadgVar4;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar5;
    }

    public static Ecom3dsMethodViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new Ecom3dsMethodViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static Ecom3dsMethodViewModel newInstance(StateHandler stateHandler, Reducer reducer, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        return new Ecom3dsMethodViewModel(stateHandler, reducer, configRepository, ecomMetricUtil, merchantAnalyticRepository);
    }

    @Override // fg.iobyxmoadg
    public Ecom3dsMethodViewModel get() {
        return newInstance((StateHandler) this.screenStateProvider.get(), (Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
    }
}
