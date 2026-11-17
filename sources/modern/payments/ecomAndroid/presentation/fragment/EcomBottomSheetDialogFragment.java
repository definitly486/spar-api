package modern.payments.ecomAndroid.presentation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import gg.wwaezpbzkn;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment;
import modern.payments.ecomAndroid.presentation.view.CurvedContainerLayout;
import modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetDialogEvent;
import modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel;
import modern.payments.ecomAndroid.util.shaker.ShakeDetector;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomLayoutBottomsheetBinding;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;
import modern.payments.tracker.util.logging.LogFileManager;
import modern.payments.tracker.util.logging.logWriter.LogToFileWriter;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 R2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0006J\u0019\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0006J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R\u0016\u00105\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomBottomSheetDialogFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseBottomSheetDialogFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomLayoutBottomsheetBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "invokeSPayPayment", "showLoadingFragment", "Lmodern/payments/ecomAndroid/domain/State$Error;", "state", "showErrorFragment", "(Lmodern/payments/ecomAndroid/domain/State$Error;)V", "showSbpFragment", "showPaymentModeFragment", "showEcomAddNewCardFragment", "showChallengeFragment", "show3dsMethodFragment", "showSuccessfulFragment", "showFailureFragment", "showOrderFragment", "Landroidx/fragment/app/Fragment;", "newFragment", "", "tag", "transitToFragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "initShakeDetector", "setupShakeEntities", "showLoggerDialog", "showLoggerFragment", "sendLoggerFile", "inject", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomLayoutBottomsheetBinding;", "setUpViews", "observeViewModel", "onResume", "onPause", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "shakeDetector", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "Landroid/hardware/Sensor;", "accelerometer", "Landroid/hardware/Sensor;", "Landroid/app/Dialog;", "loggerDialog", "Landroid/app/Dialog;", "Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;", "sPayFlowHelper", "Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;", "getSPayFlowHelper", "()Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;", "setSPayFlowHelper", "(Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;)V", "Lmodern/payments/tracker/util/logging/LogFileManager;", "logFileManager", "Lmodern/payments/tracker/util/logging/LogFileManager;", "getLogFileManager", "()Lmodern/payments/tracker/util/logging/LogFileManager;", "setLogFileManager", "(Lmodern/payments/tracker/util/logging/LogFileManager;)V", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomBottomSheetDialogFragment extends BaseBottomSheetDialogFragment<EcomBottomSheetDialogEvent, EcomBottomSheetViewModel, EcomLayoutBottomsheetBinding> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long ON_CLOSE_DELAY = 200;
    private Sensor accelerometer;
    public LogFileManager logFileManager;
    private Dialog loggerDialog;
    public SPayFlowHelper sPayFlowHelper;
    private SensorManager sensorManager;
    private final ShakeDetector shakeDetector;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomBottomSheetDialogFragment$Companion;", "", "()V", "ON_CLOSE_DELAY", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$invokeSPayPayment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements tg.draadjrbmk {
        AnonymousClass1() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SPayPaymentResult) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(SPayPaymentResult it) {
            zdlpuopuiu.btonecajqb(it, "it");
            EcomBottomSheetDialogFragment.access$getViewModel(EcomBottomSheetDialogFragment.this).handleEvent((EcomBottomSheetDialogEvent) new EcomBottomSheetDialogEvent.HandleSPaySdkResult(it));
        }
    }

    public EcomBottomSheetDialogFragment() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        this.shakeDetector = paymentFlowSubcomponent$ecomAndroid_release != null ? paymentFlowSubcomponent$ecomAndroid_release.getShakeDetector() : null;
    }

    public static final /* synthetic */ EcomBottomSheetViewModel access$getViewModel(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
        return ecomBottomSheetDialogFragment.getViewModel();
    }

    private final void initShakeDetector() {
        setupShakeEntities();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeSPayPayment() {
        SPayFlowHelper sPayFlowHelper = getSPayFlowHelper();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        sPayFlowHelper.pay(oxmwwwfdhmVarRequireActivity, new AnonymousClass1());
        requireDialog().hide();
    }

    private final void sendLoggerFile() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        File file = new File(ExternalLogFileStorage.getFileStorageDirectory$default(new ExternalLogFileStorage(contextRequireContext), null, 1, null), LogToFileWriter.INSTANCE.getCurrentLogfileName());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.STREAM", FileProvider.nufgyqmvbu(requireContext(), requireContext().getApplicationContext().getPackageName() + ".fileprovider", file));
        startActivity(intent);
    }

    private final void setupShakeEntities() {
        Object systemService = requireContext().getSystemService("sensor");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        ShakeDetector shakeDetector = this.shakeDetector;
        if (shakeDetector != null) {
            shakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment.setupShakeEntities.1
                @Override // modern.payments.ecomAndroid.util.shaker.ShakeDetector.OnShakeListener
                public void onShake(int count) {
                    EcomBottomSheetDialogFragment.this.showLoggerDialog();
                    Toast.makeText(EcomBottomSheetDialogFragment.this.requireContext(), "Shake", 0).show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void show3dsMethodFragment() {
        transitToFragment(Ecom3DsMethodFragment.INSTANCE.newInstance(), Ecom3DsMethodFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showChallengeFragment() {
        transitToFragment(EcomChallengeFragment.INSTANCE.newInstance(), EcomChallengeFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEcomAddNewCardFragment() {
        transitToFragment(EcomAddNewCardFragment.INSTANCE.newInstance(), EcomAddNewCardFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorFragment(State.Error state) {
        if (state instanceof State.Error.NoInternet) {
            transitToFragment(EcomNoInternetFragment.INSTANCE.newInstance(), EcomNoInternetFragment.TAG);
        } else if (state instanceof State.Error.ServerUnavailable) {
            transitToFragment(EcomServerUnavailableFragment.INSTANCE.newInstance(), EcomServerUnavailableFragment.TAG);
        } else if (state instanceof State.Error.DefaultException) {
            transitToFragment(EcomDefaultErrorFragment.INSTANCE.newInstance(), EcomDefaultErrorFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFailureFragment() {
        transitToFragment(EcomDefaultErrorFragment.INSTANCE.newInstance(), EcomDefaultErrorFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoadingFragment() {
        transitToFragment(EcomLoadingFragment.INSTANCE.newInstance(), EcomLoadingFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoggerDialog() {
        wwaezpbzkn wwaezpbzknVar;
        Dialog dialog = this.loggerDialog;
        if (dialog != null) {
            if (!dialog.isShowing()) {
                dialog.show();
            }
            wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            final Dialog dialog2 = new Dialog(requireContext(), R.style.EcomLoggerDialog);
            dialog2.requestWindowFeature(1);
            dialog2.setCancelable(false);
            dialog2.setContentView(R.layout.ecom_layout_logger_dialog);
            ((CardView) dialog2.findViewById(R.id.show_logger)).setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.ppxfxbqfkf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcomBottomSheetDialogFragment.showLoggerDialog$lambda$7$lambda$6$lambda$5$lambda$3(this.f67698zdlpuopuiu, dialog2, view);
                }
            });
            ((CardView) dialog2.findViewById(R.id.send_logger_file)).setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.wkgbmnqykc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcomBottomSheetDialogFragment.showLoggerDialog$lambda$7$lambda$6$lambda$5$lambda$4(this.f67700zdlpuopuiu, dialog2, view);
                }
            });
            dialog2.setCanceledOnTouchOutside(true);
            dialog2.show();
            this.loggerDialog = dialog2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoggerDialog$lambda$7$lambda$6$lambda$5$lambda$3(EcomBottomSheetDialogFragment this$0, Dialog this_apply, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this$0.showLoggerFragment();
        this_apply.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoggerDialog$lambda$7$lambda$6$lambda$5$lambda$4(EcomBottomSheetDialogFragment this$0, Dialog this_apply, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this$0.sendLoggerFile();
        this_apply.dismiss();
    }

    private final void showLoggerFragment() {
        transitToFragment(EcomLoggerFragment.INSTANCE.newInstance(), EcomLoggerFragment.TAG);
    }

    private final void showOrderFragment() {
        transitToFragment(EcomOrderFragment.INSTANCE.newInstance(), EcomOrderFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPaymentModeFragment() {
        transitToFragment(EcomPaymentModeFragment.INSTANCE.newInstance(), EcomPaymentModeFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSbpFragment() {
        transitToFragment(EcomSbpFragment.INSTANCE.newInstance(), EcomSbpFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccessfulFragment() {
        transitToFragment(EcomOperationStatusSuccessFragment.INSTANCE.newInstance(), EcomOperationStatusSuccessFragment.TAG);
    }

    private final void transitToFragment(Fragment newFragment, String tag) {
        if (zdlpuopuiu.eablkybsjg(((Fragment) getChildFragmentManager().igdgnonuha().get(0)).getTag(), tag)) {
            return;
        }
        getChildFragmentManager().kcexrzcfyt().zdlpuopuiu(R.anim.grow_fade_in, R.anim.grow_fade_in_from_bottom).oxmwwwfdhm(R.id.elbs_fcv_container, newFragment, tag).dxjokdxxww();
    }

    public final LogFileManager getLogFileManager() {
        LogFileManager logFileManager = this.logFileManager;
        if (logFileManager != null) {
            return logFileManager;
        }
        zdlpuopuiu.pmvmpeiblj("logFileManager");
        return null;
    }

    public final SPayFlowHelper getSPayFlowHelper() {
        SPayFlowHelper sPayFlowHelper = this.sPayFlowHelper;
        if (sPayFlowHelper != null) {
            return sPayFlowHelper;
        }
        zdlpuopuiu.pmvmpeiblj("sPayFlowHelper");
        return null;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment
    public Class<EcomBottomSheetViewModel> getViewModelType() {
        return EcomBottomSheetViewModel.class;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment
    public void inject() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment
    public void observeViewModel() {
        wypolnanlu state = getViewModel().getState();
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, state, null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        getViewModel().sendAnalytic();
        getViewModel().handleEvent((EcomBottomSheetDialogEvent) EcomBottomSheetDialogEvent.SendCallback.INSTANCE);
        super.onCancel(dialog);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.EcomTransparentBackgroundDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        if (uIColorPreferences != null) {
            ((CurvedContainerLayout) requireView().findViewById(R.id.elbs_cc_container)).setCurvedViewBackground(uIColorPreferences.getMainBG());
        }
    }

    public final void setLogFileManager(LogFileManager logFileManager) {
        zdlpuopuiu.btonecajqb(logFileManager, "<set-?>");
        this.logFileManager = logFileManager;
    }

    public final void setSPayFlowHelper(SPayFlowHelper sPayFlowHelper) {
        zdlpuopuiu.btonecajqb(sPayFlowHelper, "<set-?>");
        this.sPayFlowHelper = sPayFlowHelper;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment
    public void setUpViews() {
        getChildFragmentManager().kcexrzcfyt().zoijcleaow(R.id.elbs_fcv_container, EmptyFragment.INSTANCE.newInstance()).nufgyqmvbu(EmptyFragment.TAG).dxjokdxxww();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseBottomSheetDialogFragment
    public EcomLayoutBottomsheetBinding getViewBinding() {
        EcomLayoutBottomsheetBinding ecomLayoutBottomsheetBindingInflate = EcomLayoutBottomsheetBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomLayoutBottomsheetBindingInflate, "inflate(...)");
        return ecomLayoutBottomsheetBindingInflate;
    }
}
