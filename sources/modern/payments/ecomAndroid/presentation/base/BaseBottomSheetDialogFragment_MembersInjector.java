package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseBottomSheetDialogFragment_MembersInjector<ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> implements pf.iobyxmoadg {
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public BaseBottomSheetDialogFragment_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar2;
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        return new BaseBottomSheetDialogFragment_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> void injectUiPreferencesRepository(BaseBottomSheetDialogFragment<ActionEvent, VM, B> baseBottomSheetDialogFragment, UIPreferencesRepository uIPreferencesRepository) {
        baseBottomSheetDialogFragment.uiPreferencesRepository = uIPreferencesRepository;
    }

    public static <ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> void injectViewModelFactory(BaseBottomSheetDialogFragment<ActionEvent, VM, B> baseBottomSheetDialogFragment, ViewModelFactory<Object> viewModelFactory) {
        baseBottomSheetDialogFragment.viewModelFactory = viewModelFactory;
    }

    public void injectMembers(BaseBottomSheetDialogFragment<ActionEvent, VM, B> baseBottomSheetDialogFragment) {
        injectViewModelFactory(baseBottomSheetDialogFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
        injectUiPreferencesRepository(baseBottomSheetDialogFragment, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
    }
}
