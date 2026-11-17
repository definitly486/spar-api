package modern.payments.ecomAndroid.presentation.fragment;

import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseFragment_MembersInjector;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomChallengeFragment_MembersInjector implements pf.iobyxmoadg {
    private final fg.iobyxmoadg optionsRepositoryProvider;
    private final fg.iobyxmoadg trackerProvider;
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public EcomChallengeFragment_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.optionsRepositoryProvider = iobyxmoadgVar4;
    }

    public static pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        return new EcomChallengeFragment_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static void injectOptionsRepository(EcomChallengeFragment ecomChallengeFragment, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        ecomChallengeFragment.optionsRepository = ecomSdkOptionsRepository;
    }

    public static void injectTracker(EcomChallengeFragment ecomChallengeFragment, ITracker iTracker) {
        ecomChallengeFragment.tracker = iTracker;
    }

    public void injectMembers(EcomChallengeFragment ecomChallengeFragment) {
        BaseFragment_MembersInjector.injectViewModelFactory(ecomChallengeFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
        BaseFragment_MembersInjector.injectUiPreferencesRepository(ecomChallengeFragment, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
        injectTracker(ecomChallengeFragment, (ITracker) this.trackerProvider.get());
        injectOptionsRepository(ecomChallengeFragment, (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
