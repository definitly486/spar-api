package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLoadingFragmentViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public EcomLoadingFragmentViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.screenStateProvider = iobyxmoadgVar;
        this.appDataRepositoryProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.reducerProvider = iobyxmoadgVar4;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar5;
    }

    public static EcomLoadingFragmentViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new EcomLoadingFragmentViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static EcomLoadingFragmentViewModel newInstance(StateHandler stateHandler, AppDataRepository appDataRepository, ConfigRepository configRepository, Reducer reducer, MerchantAnalyticRepository merchantAnalyticRepository) {
        return new EcomLoadingFragmentViewModel(stateHandler, appDataRepository, configRepository, reducer, merchantAnalyticRepository);
    }

    @Override // fg.iobyxmoadg
    public EcomLoadingFragmentViewModel get() {
        return newInstance((StateHandler) this.screenStateProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
    }
}
