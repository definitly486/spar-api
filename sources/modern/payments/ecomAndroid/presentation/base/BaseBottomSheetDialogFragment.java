package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.lifecycle.crxdokpmqz;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R*\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0004@\u0004X\u0085.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00028\u00018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00018\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0014X\u0094D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00028\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\n¨\u0006P"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseBottomSheetDialogFragment;", "ActionEvent", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "VM", "La6/iobyxmoadg;", "B", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "getViewBinding", "()La6/iobyxmoadg;", "Lgg/wwaezpbzkn;", "setUpViews", "observeViewModel", "inject", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "", "state", "setBottomSheetState", "(I)V", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "", "viewModelFactory", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "getViewModelFactory", "()Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "setViewModelFactory", "(Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;)V", "viewModel", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "getViewModel", "()Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "setViewModel", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetState", "I", "realBinding", "La6/iobyxmoadg;", "", "hideTopIndicator", "Z", "getHideTopIndicator", "()Z", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "getUiPreferencesRepository", "()Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "setUiPreferencesRepository", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)V", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "getBinding", "binding", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseBottomSheetDialogFragment<ActionEvent, VM extends BaseViewModel<ActionEvent>, B extends a6.iobyxmoadg> extends BottomSheetDialogFragment {
    private BottomSheetBehavior<?> bottomBehavior;
    private int bottomSheetState = 3;
    private final boolean hideTopIndicator;
    private B realBinding;
    public UIPreferencesRepository uiPreferencesRepository;
    protected VM viewModel;
    protected ViewModelFactory<Object> viewModelFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(BaseBottomSheetDialogFragment this$0, DialogInterface dialogInterface) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        BottomSheetBehavior<?> bottomSheetBehavior = this$0.bottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(this$0.bottomSheetState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBottomSheetState$lambda$5(BaseBottomSheetDialogFragment this$0, DialogInterface dialogInterface) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        BottomSheetBehavior<?> bottomSheetBehavior = this$0.bottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(this$0.bottomSheetState);
        }
    }

    protected final B getBinding() {
        B b13 = this.realBinding;
        if (b13 != null) {
            return b13;
        }
        throw EcomInternalException.ViewBindingNotCreatedYet.INSTANCE;
    }

    protected boolean getHideTopIndicator() {
        return this.hideTopIndicator;
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

    protected final ViewModelFactory<Object> getViewModelFactory() {
        ViewModelFactory<Object> viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        zdlpuopuiu.pmvmpeiblj("viewModelFactory");
        return null;
    }

    public abstract Class<VM> getViewModelType();

    public abstract void inject();

    public void observeViewModel() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        inject();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        super.onCancel(dialog);
        oxmwwwfdhm activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel((BaseViewModel) new crxdokpmqz(this, getViewModelFactory()).zoijcleaow(getViewModelType()));
        setStyle(2, R.style.EcomBaseBottomSheetDialog);
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar;
        View view2;
        View viewFindViewById;
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn = null;
        if (dialog instanceof com.google.android.material.bottomsheet.ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialog;
        } else {
            ppxfxbqfkfVar = null;
        }
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar = ppxfxbqfkfVar2;
            bottomSheetBehaviorOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        }
        ppxfxbqfkfVar = ppxfxbqfkfVar2;
        this.bottomBehavior = bottomSheetBehaviorOjitshcjhn;
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: modern.payments.ecomAndroid.presentation.base.ppxfxbqfkf
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    BaseBottomSheetDialogFragment.onViewCreated$lambda$1(this.f67668iobyxmoadg, dialogInterface);
                }
            });
        }
        setUpViews();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view2 = parentFragment.getView()) == null || (viewFindViewById = view2.findViewById(R.id.elbs_include_indicator)) == null) {
            return;
        }
        viewFindViewById.setVisibility(!getHideTopIndicator() ? 0 : 8);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        if (uIColorPreferences != null) {
            viewFindViewById.setBackgroundColor(uIColorPreferences.getMainBG());
        }
    }

    public final void setBottomSheetState(int state) {
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar;
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar2;
        this.bottomSheetState = state;
        Dialog dialog = getDialog();
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn = null;
        if (dialog instanceof com.google.android.material.bottomsheet.ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialog;
        } else {
            ppxfxbqfkfVar = null;
        }
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar = ppxfxbqfkfVar2;
            bottomSheetBehaviorOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        }
        ppxfxbqfkfVar = ppxfxbqfkfVar2;
        this.bottomBehavior = bottomSheetBehaviorOjitshcjhn;
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: modern.payments.ecomAndroid.presentation.base.zoijcleaow
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    BaseBottomSheetDialogFragment.setBottomSheetState$lambda$5(this.f67669iobyxmoadg, dialogInterface);
                }
            });
        }
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

    protected final void setViewModelFactory(ViewModelFactory<Object> viewModelFactory) {
        zdlpuopuiu.btonecajqb(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }
}
