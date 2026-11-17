package modern.payments.ecomAndroid.presentation.fragment;

import android.view.View;
import androidx.lifecycle.oxmwwwfdhm;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.LoggerEvent;
import modern.payments.p003ecomandroid.databinding.EcomLayoutLoggerBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoggerFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/LoggerEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoggerViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomLayoutLoggerBinding;", "<init>", "()V", "", "content", "Lgg/wwaezpbzkn;", "showLogs", "(Ljava/lang/String;)V", "inject", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomLayoutLoggerBinding;", "observeViewModel", "initClickListeners", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomLoggerFragment extends BaseFragment<LoggerEvent, EcomLoggerViewModel, EcomLayoutLoggerBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "LoggerFragment";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoggerFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoggerFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomLoggerFragment newInstance() {
            return new EcomLoggerFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2$lambda$1(EcomLoggerFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getViewModel().handleEvent((LoggerEvent) LoggerEvent.CloseDialog.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLogs(String content) {
        getBinding().loggerTextView.setText(content);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomLoggerViewModel> getViewModelType() {
        return EcomLoggerViewModel.class;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void initClickListeners() {
        getBinding().loggerBackBtn.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomLoggerFragment.initClickListeners$lambda$2$lambda$1(this.f67677zdlpuopuiu, view);
            }
        });
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void inject() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void observeViewModel() {
        sj.lqeggnwhkg lqeggnwhkgVarLereixgezr = sj.dxjokdxxww.lereixgezr(getViewModel().getLogContent());
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomLoggerFragment$observeViewModel$$inlined$observeData$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomLayoutLoggerBinding getViewBinding() {
        EcomLayoutLoggerBinding ecomLayoutLoggerBindingInflate = EcomLayoutLoggerBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomLayoutLoggerBindingInflate, "inflate(...)");
        return ecomLayoutLoggerBindingInflate;
    }
}
