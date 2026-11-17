package modern.payments.ecomAndroid;

import android.os.Bundle;
import androidx.appcompat.app.wkgbmnqykc;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.oxmwwwfdhm;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory;
import modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/EcomActivity;", "Landroidx/appcompat/app/wkgbmnqykc;", "<init>", "()V", "Lgg/wwaezpbzkn;", "observeViewModel", "", "show", "showBottomSheetSdk", "(Z)V", "setUncaughtSPaySdkExceptionHandler", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "", "viewModelFactory", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "getViewModelFactory", "()Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "setViewModelFactory", "(Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;)V", "Lmodern/payments/ecomAndroid/EcomActivityViewModel;", "viewModel", "Lmodern/payments/ecomAndroid/EcomActivityViewModel;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomActivity extends wkgbmnqykc {
    public static final String BOTTOM_SHEET_FRAGMENT = "EcomBottomSheetDialogFragment";
    private EcomActivityViewModel viewModel;
    public ViewModelFactory<Object> viewModelFactory;

    private final void observeViewModel() {
        EcomActivityViewModel ecomActivityViewModel = this.viewModel;
        if (ecomActivityViewModel == null) {
            zdlpuopuiu.pmvmpeiblj("viewModel");
            ecomActivityViewModel = null;
        }
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(ecomActivityViewModel.getBottomSheetShowEvent());
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomActivity$observeViewModel$$inlined$observeEvent$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }

    private final void setUncaughtSPaySdkExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: modern.payments.ecomAndroid.iobyxmoadg
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                EcomActivity.setUncaughtSPaySdkExceptionHandler$lambda$2(this.f67665iobyxmoadg, thread, th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUncaughtSPaySdkExceptionHandler$lambda$2(EcomActivity this$0, Thread thread, Throwable th2) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        EcomActivityViewModel ecomActivityViewModel = this$0.viewModel;
        if (ecomActivityViewModel == null) {
            zdlpuopuiu.pmvmpeiblj("viewModel");
            ecomActivityViewModel = null;
        }
        zdlpuopuiu.lqeggnwhkg(th2);
        ecomActivityViewModel.processUncaughtException(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void showBottomSheetSdk(boolean show) {
        try {
            if (show) {
                List listIgdgnonuha = getSupportFragmentManager().igdgnonuha();
                zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
                Iterator it = listIgdgnonuha.iterator();
                while (it.hasNext()) {
                    if (((Fragment) it.next()) instanceof EcomBottomSheetDialogFragment) {
                        return;
                    }
                }
                getSupportFragmentManager().kcexrzcfyt().eablkybsjg(new EcomBottomSheetDialogFragment(), BOTTOM_SHEET_FRAGMENT).gtknphoqwx();
            } else {
                List listIgdgnonuha2 = getSupportFragmentManager().igdgnonuha();
                zdlpuopuiu.dxjokdxxww(listIgdgnonuha2, "getFragments(...)");
                Object objLrnfpwlwnk = jyumaefscl.lrnfpwlwnk(listIgdgnonuha2, 0);
                EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment = objLrnfpwlwnk instanceof EcomBottomSheetDialogFragment ? (EcomBottomSheetDialogFragment) objLrnfpwlwnk : null;
                if (ecomBottomSheetDialogFragment != null) {
                    ecomBottomSheetDialogFragment.dismiss();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final ViewModelFactory<Object> getViewModelFactory() {
        ViewModelFactory<Object> viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        zdlpuopuiu.pmvmpeiblj("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
        this.viewModel = (EcomActivityViewModel) new crxdokpmqz(this, getViewModelFactory()).zoijcleaow(EcomActivityViewModel.class);
        setUncaughtSPaySdkExceptionHandler();
        observeViewModel();
    }

    public final void setViewModelFactory(ViewModelFactory<Object> viewModelFactory) {
        zdlpuopuiu.btonecajqb(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }
}
