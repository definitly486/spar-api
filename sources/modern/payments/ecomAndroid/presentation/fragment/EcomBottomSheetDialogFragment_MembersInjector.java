package modern.payments.ecomAndroid.presentation.fragment;

import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment_MembersInjector;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomBottomSheetDialogFragment_MembersInjector implements pf.iobyxmoadg {
    private final fg.iobyxmoadg logFileManagerProvider;
    private final fg.iobyxmoadg sPayFlowHelperProvider;
    private final fg.iobyxmoadg uiPreferencesRepositoryProvider;
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public EcomBottomSheetDialogFragment_MembersInjector(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
        this.uiPreferencesRepositoryProvider = iobyxmoadgVar2;
        this.sPayFlowHelperProvider = iobyxmoadgVar3;
        this.logFileManagerProvider = iobyxmoadgVar4;
    }

    public static pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        return new EcomBottomSheetDialogFragment_MembersInjector(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static void injectLogFileManager(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment, LogFileManager logFileManager) {
        ecomBottomSheetDialogFragment.logFileManager = logFileManager;
    }

    public static void injectSPayFlowHelper(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment, SPayFlowHelper sPayFlowHelper) {
        ecomBottomSheetDialogFragment.sPayFlowHelper = sPayFlowHelper;
    }

    public void injectMembers(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
        BaseBottomSheetDialogFragment_MembersInjector.injectViewModelFactory(ecomBottomSheetDialogFragment, (ViewModelFactory) this.viewModelFactoryProvider.get());
        BaseBottomSheetDialogFragment_MembersInjector.injectUiPreferencesRepository(ecomBottomSheetDialogFragment, (UIPreferencesRepository) this.uiPreferencesRepositoryProvider.get());
        injectSPayFlowHelper(ecomBottomSheetDialogFragment, (SPayFlowHelper) this.sPayFlowHelperProvider.get());
        injectLogFileManager(ecomBottomSheetDialogFragment, (LogFileManager) this.logFileManagerProvider.get());
    }
}
