package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomAddNewCardViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg cardDataManagerProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;

    public EcomAddNewCardViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.reducerProvider = iobyxmoadgVar;
        this.appDataRepositoryProvider = iobyxmoadgVar2;
        this.cardDataManagerProvider = iobyxmoadgVar3;
        this.configRepositoryProvider = iobyxmoadgVar4;
        this.ecomMetricUtilProvider = iobyxmoadgVar5;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar6;
    }

    public static EcomAddNewCardViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new EcomAddNewCardViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static EcomAddNewCardViewModel newInstance(Reducer reducer, AppDataRepository appDataRepository, CardDataManager cardDataManager, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        return new EcomAddNewCardViewModel(reducer, appDataRepository, cardDataManager, configRepository, ecomMetricUtil, merchantAnalyticRepository);
    }

    @Override // fg.iobyxmoadg
    public EcomAddNewCardViewModel get() {
        return newInstance((Reducer) this.reducerProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (CardDataManager) this.cardDataManagerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
    }
}
