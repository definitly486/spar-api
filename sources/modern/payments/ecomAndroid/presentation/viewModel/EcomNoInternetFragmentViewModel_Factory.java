package modern.payments.ecomAndroid.presentation.viewModel;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.util.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomNoInternetFragmentViewModel_Factory implements wkgbmnqykc {
    private final iobyxmoadg configRepositoryProvider;
    private final iobyxmoadg mediaPlayerProvider;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg screenStateProvider;

    public EcomNoInternetFragmentViewModel_Factory(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        this.screenStateProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.configRepositoryProvider = iobyxmoadgVar3;
        this.mediaPlayerProvider = iobyxmoadgVar4;
    }

    public static EcomNoInternetFragmentViewModel_Factory create(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4) {
        return new EcomNoInternetFragmentViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static EcomNoInternetFragmentViewModel newInstance(StateHandler stateHandler, Reducer reducer, ConfigRepository configRepository, MediaPlayer mediaPlayer) {
        return new EcomNoInternetFragmentViewModel(stateHandler, reducer, configRepository, mediaPlayer);
    }

    @Override // fg.iobyxmoadg
    public EcomNoInternetFragmentViewModel get() {
        return newInstance((StateHandler) this.screenStateProvider.get(), (Reducer) this.reducerProvider.get(), (ConfigRepository) this.configRepositoryProvider.get(), (MediaPlayer) this.mediaPlayerProvider.get());
    }
}
