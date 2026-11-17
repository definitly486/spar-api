package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\bJ\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\bJ\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\bJ\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\bR*\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00028\u00018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00018\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00028\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\n¨\u0006D"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "ActionEvent", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "VM", "La6/iobyxmoadg;", "B", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "getViewBinding", "()La6/iobyxmoadg;", "Lgg/wwaezpbzkn;", "setUpViews", "observeViewModel", "initClickListeners", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "inject", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "", "viewModelFactory", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "getViewModelFactory", "()Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "setViewModelFactory", "(Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;)V", "viewModel", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "getViewModel", "()Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "setViewModel", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;)V", "realBinding", "La6/iobyxmoadg;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "getUiPreferencesRepository", "()Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "setUiPreferencesRepository", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)V", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "getBinding", "binding", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseFragment<ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> extends Fragment {
    private B realBinding;
    public UIPreferencesRepository uiPreferencesRepository;
    protected VM viewModel;
    public ViewModelFactory<Object> viewModelFactory;

    protected final B getBinding() {
        B b13 = this.realBinding;
        if (b13 != null) {
            return b13;
        }
        throw EcomInternalException.ViewBindingNotCreatedYet.INSTANCE;
    }

    public final UIPreferencesRepository getUiPreferencesRepository() {
        UIPreferencesRepository uIPreferencesRepository = this.uiPreferencesRepository;
        if (uIPreferencesRepository != null) {
            return uIPreferencesRepository;
        }
        zdlpuopuiu.pmvmpeiblj("uiPreferencesRepository");
        return null;
    }

    public B getViewBinding() {
        return null;
    }

    protected final VM getViewModel() {
        VM vm2 = this.viewModel;
        if (vm2 != null) {
            return vm2;
        }
        zdlpuopuiu.pmvmpeiblj("viewModel");
        return null;
    }

    public final ViewModelFactory<Object> getViewModelFactory() {
        ViewModelFactory<Object> viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        zdlpuopuiu.pmvmpeiblj("viewModelFactory");
        return null;
    }

    public abstract Class<VM> getViewModelType();

    public void initClickListeners() {
    }

    public abstract void inject();

    public void observeViewModel() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        inject();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel((BaseViewModel) getViewModelFactory().create(getViewModelType()));
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnCreate.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        this.realBinding = (B) getViewBinding();
        View root = getBinding().getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        observeViewModel();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnDestroy.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnPause.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnResume.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnStart.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getViewModel().handleViewState(BaseViewModel.LifecycleEvent.OnStop.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        if (uIColorPreferences != null) {
            getBinding().getRoot().setBackgroundColor(uIColorPreferences.getMainBG());
        }
        setUpViews();
        initClickListeners();
    }

    public final void setUiPreferencesRepository(UIPreferencesRepository uIPreferencesRepository) {
        zdlpuopuiu.btonecajqb(uIPreferencesRepository, "<set-?>");
        this.uiPreferencesRepository = uIPreferencesRepository;
    }

    public void setUpViews() {
    }

    protected final void setViewModel(VM vm2) {
        zdlpuopuiu.btonecajqb(vm2, "<set-?>");
        this.viewModel = vm2;
    }

    public final void setViewModelFactory(ViewModelFactory<Object> viewModelFactory) {
        zdlpuopuiu.btonecajqb(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }
}
