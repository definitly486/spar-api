package modern.payments.ecomAndroid.presentation.fragment;

import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseFragment_MembersInjector;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class Ecom3DsMethodFragment_MembersInjector implements pf.iobyxmoadg {
    private final fg.iobyxmoadg optionsRepositoryProvider;
    private final fg.iobyxmoadg trackerProvider;
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public Ecom3DsMethodFragment_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.optionsRepositoryProvider = iobyxmoadgVar4;
    }

    public static pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        return new Ecom3DsMethodFragment_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static void injectOptionsRepository(Ecom3DsMethodFragment ecom3DsMethodFragment, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        ecom3DsMethodFragment.optionsRepository = ecomSdkOptionsRepository;
    }

    public static void injectTracker(Ecom3DsMethodFragment ecom3DsMethodFragment, ITracker iTracker) {
        ecom3DsMethodFragment.tracker = iTracker;
    }

    public void injectMembers(Ecom3DsMethodFragment ecom3DsMethodFragment) {
        BaseFragment_MembersInjector.injectViewModelFactory(ecom3DsMethodFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
        BaseFragment_MembersInjector.injectUiPreferencesRepository(ecom3DsMethodFragment, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
        injectTracker(ecom3DsMethodFragment, (ITracker) this.trackerProvider.get());
        injectOptionsRepository(ecom3DsMethodFragment, (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get());
    }
}
