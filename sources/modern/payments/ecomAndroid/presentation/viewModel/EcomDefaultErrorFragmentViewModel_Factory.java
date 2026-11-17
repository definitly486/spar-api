package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.util.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomDefaultErrorFragmentViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg mediaPlayerProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public EcomDefaultErrorFragmentViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7) {
        this.reducerProvider = iobyxmoadgVar;
        this.screenStateProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.appDataRepositoryProvider = iobyxmoadgVar4;
        this.ecomMetricUtilProvider = iobyxmoadgVar5;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar6;
        this.mediaPlayerProvider = iobyxmoadgVar7;
    }

    public static EcomDefaultErrorFragmentViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7) {
        return new EcomDefaultErrorFragmentViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7);
    }

    public static EcomDefaultErrorFragmentViewModel newInstance(Reducer reducer, StateHandler stateHandler, ConfigRepository configRepository, AppDataRepository appDataRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, MediaPlayer mediaPlayer) {
        return new EcomDefaultErrorFragmentViewModel(reducer, stateHandler, configRepository, appDataRepository, ecomMetricUtil, merchantAnalyticRepository, mediaPlayer);
    }

    @Override // fg.iobyxmoadg
    public EcomDefaultErrorFragmentViewModel get() {
        return newInstance((Reducer) this.reducerProvider.get(), (StateHandler) this.screenStateProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (MediaPlayer) this.mediaPlayerProvider.get());
    }
}
