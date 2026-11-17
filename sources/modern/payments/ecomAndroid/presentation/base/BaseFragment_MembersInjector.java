package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseFragment_MembersInjector<ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> implements pf.iobyxmoadg {
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public BaseFragment_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar2;
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        return new BaseFragment_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> void injectUiPreferencesRepository(BaseFragment<ActionEvent, VM, B> baseFragment, UIPreferencesRepository uIPreferencesRepository) {
        baseFragment.uiPreferencesRepository = uIPreferencesRepository;
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> void injectViewModelFactory(BaseFragment<ActionEvent, VM, B> baseFragment, ViewModelFactory<Object> viewModelFactory) {
        baseFragment.viewModelFactory = viewModelFactory;
    }

    public void injectMembers(BaseFragment<ActionEvent, VM, B> baseFragment) {
        injectViewModelFactory(baseFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
        injectUiPreferencesRepository(baseFragment, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
    }
}
