package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.util.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomOperationStatusSuccessViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg mediaPlayerProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;

    public EcomOperationStatusSuccessViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.appDataRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.ecomMetricUtilProvider = iobyxmoadgVar4;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar5;
        this.mediaPlayerProvider = iobyxmoadgVar6;
    }

    public static EcomOperationStatusSuccessViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new EcomOperationStatusSuccessViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static EcomOperationStatusSuccessViewModel newInstance(AppDataRepository appDataRepository, Reducer reducer, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, MediaPlayer mediaPlayer) {
        return new EcomOperationStatusSuccessViewModel(appDataRepository, reducer, configRepository, ecomMetricUtil, merchantAnalyticRepository, mediaPlayer);
    }

    @Override // fg.iobyxmoadg
    public EcomOperationStatusSuccessViewModel get() {
        return newInstance((AppDataRepository) this.appDataRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (MediaPlayer) this.mediaPlayerProvider.get());
    }
}
