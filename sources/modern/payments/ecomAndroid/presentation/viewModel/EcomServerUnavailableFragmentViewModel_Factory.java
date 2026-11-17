package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomServerUnavailableFragmentViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg reducerProvider;

    public EcomServerUnavailableFragmentViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        this.reducerProvider = iobyxmoadgVar;
        this.configRepositoryProvider = iobyxmoadgVar2;
    }

    public static EcomServerUnavailableFragmentViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        return new EcomServerUnavailableFragmentViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static EcomServerUnavailableFragmentViewModel newInstance(Reducer reducer, ConfigRepository configRepository) {
        return new EcomServerUnavailableFragmentViewModel(reducer, configRepository);
    }

    @Override // fg.iobyxmoadg
    public EcomServerUnavailableFragmentViewModel get() {
        return newInstance((Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get());
    }
}
