package modern.payments.ecomAndroid.presentation.fragment;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.viewModel.EcomOrderViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.OrderEvent;
import modern.payments.p003ecomandroid.databinding.EcomFragmentOrderBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomOrderFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/OrderEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomOrderViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentOrderBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "inject", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentOrderBinding;", "setUpViews", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomOrderFragment extends BaseFragment<OrderEvent, EcomOrderViewModel, EcomFragmentOrderBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "EcomOrderFragment";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomOrderFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomOrderFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomOrderFragment newInstance() {
            return new EcomOrderFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpViews$lambda$0(EcomOrderFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getViewModel().handleEvent((OrderEvent) OrderEvent.OnCloseButtonClickedEvent.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomOrderViewModel> getViewModelType() {
        return EcomOrderViewModel.class;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void inject() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        super.setUpViews();
        getBinding().ecomEfoAcbCancel.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomOrderFragment.setUpViews$lambda$0(this.f67674zdlpuopuiu, view);
            }
        });
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentOrderBinding getViewBinding() {
        EcomFragmentOrderBinding ecomFragmentOrderBindingInflate = EcomFragmentOrderBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentOrderBindingInflate, "inflate(...)");
        return ecomFragmentOrderBindingInflate;
    }
}
