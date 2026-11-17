package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomChallengeViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg htmlFormParserProvider;
    private final iobyxmoadg merchantAnalyticRepositoryProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public EcomChallengeViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        this.screenStateProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.ecomMetricUtilProvider = iobyxmoadgVar4;
        this.merchantAnalyticRepositoryProvider = iobyxmoadgVar5;
        this.htmlFormParserProvider = iobyxmoadgVar6;
    }

    public static EcomChallengeViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6) {
        return new EcomChallengeViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6);
    }

    public static EcomChallengeViewModel newInstance(StateHandler stateHandler, Reducer reducer, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, HtmlFormParser htmlFormParser) {
        return new EcomChallengeViewModel(stateHandler, reducer, configRepository, ecomMetricUtil, merchantAnalyticRepository, htmlFormParser);
    }

    @Override // fg.iobyxmoadg
    public EcomChallengeViewModel get() {
        return newInstance((StateHandler) this.screenStateProvider.get(), (Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (MerchantAnalyticRepository) this.merchantAnalyticRepositoryProvider.get(), (HtmlFormParser) this.htmlFormParserProvider.get());
    }
}
