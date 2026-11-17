package modern.payments.ecomAndroid;

import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomActivity_MembersInjector implements pf.iobyxmoadg {
    private final fg.iobyxmoadg viewModelFactoryProvider;

    public EcomActivity_MembersInjector(fg.iobyxmoadg iobyxmoadgVar) {
        this.viewModelFactoryProvider = iobyxmoadgVar;
    }

    public static pf.iobyxmoadg create(fg.iobyxmoadg iobyxmoadgVar) {
        return new EcomActivity_MembersInjector(iobyxmoadgVar);
    }

    public static void injectViewModelFactory(EcomActivity ecomActivity, ViewModelFactory<Object> viewModelFactory) {
        ecomActivity.viewModelFactory = viewModelFactory;
    }

    public void injectMembers(EcomActivity ecomActivity) {
        injectViewModelFactory(ecomActivity, (ViewModelFactory) this.viewModelFactoryProvider.get());
    }
}
