package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomPaymentModeViewModel_Factory implements wkgbmnqykc {
    private final fg.iobyxmoadg appDataRepositoryProvider;
    private final fg.iobyxmoadg configRepositoryProvider;
    private final fg.iobyxmoadg merchantAnalyticRepositoryProvider;
    private final fg.iobyxmoadg metricFacadeProvider;
    private final fg.iobyxmoadg optionsRepositoryProvider;
    private final fg.iobyxmoadg reducerProvider;
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;

    public EcomPaymentModeViewModel_Factory(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6, fg.iobyxmoadg iobyxmoadgVar7) {
        this.reducerProvider = iobyxmoadgVar;
        this.configRepositoryProvider = iobyxmoadgVar2;
        this.appDataRepositoryProvider = iobyxmoadgVar3;
        this.optionsRepositoryProvider = iobyxmoadgVar4;
        this.metricFacadeProvider = iobyxmoadgVar5;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar6;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar7;
    }

    public static EcomPaymentModeViewModel_Factory create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6, fg.iobyxmoadg iobyxmoadgVar7) {
        return new EcomPaymentModeViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7);
    }

    public static EcomPaymentModeViewModel newInstance(Reducer reducer, ConfigRepository configRepository, AppDataRepository appDataRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, UIPreferencesRepository uIPreferencesRepository) {
        return new EcomPaymentModeViewModel(reducer, configRepository, appDataRepository, ecomSdkOptionsRepository, ecomMetricUtil, merchantAnalyticRepository, uIPreferencesRepository);
    }

    @Override // fg.iobyxmoadg
    public EcomPaymentModeViewModel get() {
        return newInstance((Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get(), (EcomMetricUtil) this.metricFacadeProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
    }
}
