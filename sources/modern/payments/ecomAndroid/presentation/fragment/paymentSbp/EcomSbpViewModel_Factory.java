package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import ag.wkgbmnqykc;
import android.content.Context;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSbpViewModel_Factory implements wkgbmnqykc {
    private final fg.iobyxmoadg appContextProvider;
    private final fg.iobyxmoadg appDataRepositoryProvider;
    private final fg.iobyxmoadg configRepositoryProvider;
    private final fg.iobyxmoadg ecomMetricUtilProvider;
    private final fg.iobyxmoadg merchantAnalyticRepositoryProvider;
    private final fg.iobyxmoadg reducerProvider;

    public EcomSbpViewModel_Factory(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6) {
        this.configRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.appDataRepositoryProvider = iobyxmoadgVar3;
        this.appContextProvider = iobyxmoadgVar4;
        this.ecomMetricUtilProvider = iobyxmoadgVar5;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar6;
    }

    public static EcomSbpViewModel_Factory create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6) {
        return new EcomSbpViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static EcomSbpViewModel newInstance(ConfigRepository configRepository, Reducer reducer, AppDataRepository appDataRepository, Context context, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        return new EcomSbpViewModel(configRepository, reducer, appDataRepository, context, ecomMetricUtil, merchantAnalyticRepository);
    }

    @Override // fg.iobyxmoadg
    public EcomSbpViewModel get() {
        return newInstance((ConfigRepository) this.configRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (Context) this.appContextProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get());
    }
}
