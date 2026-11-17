package modern.payments.ecomAndroid.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter;
import modern.payments.ecomAndroid.presentation.model.amount.PaymentAmountItem;
import modern.payments.ecomAndroid.util.holder.StringHolder;
import modern.payments.ecomAndroid.util.holder.StringHolderKt;
import modern.payments.p003ecomandroid.databinding.EcomRvItemOrderAmountBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/adapter/OrderAmountAdapter;", "Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "Lmodern/payments/ecomAndroid/presentation/model/amount/PaymentAmountItem;", "Lmodern/payments/ecomandroid/databinding/EcomRvItemOrderAmountBinding;", "<init>", "()V", "item", "Lgg/wwaezpbzkn;", "onBind", "(Lmodern/payments/ecomandroid/databinding/EcomRvItemOrderAmountBinding;Lmodern/payments/ecomAndroid/presentation/model/amount/PaymentAmountItem;)V", "", "", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Lmodern/payments/ecomAndroid/presentation/model/amount/PaymentAmountItem;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OrderAmountAdapter extends ViewBindingDelegateAdapter<PaymentAmountItem, EcomRvItemOrderAmountBinding> {

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.adapter.OrderAmountAdapter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends vdvldrhtss implements tg.vdvldrhtss {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, EcomRvItemOrderAmountBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lmodern/payments/ecomandroid/databinding/EcomRvItemOrderAmountBinding;", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final EcomRvItemOrderAmountBinding invoke(LayoutInflater p13, ViewGroup viewGroup, boolean z13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return EcomRvItemOrderAmountBinding.inflate(p13, viewGroup, z13);
        }
    }

    public OrderAmountAdapter() {
        super(AnonymousClass1.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public boolean isForViewType(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof PaymentAmountItem;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public Object getItemId(PaymentAmountItem paymentAmountItem) {
        zdlpuopuiu.btonecajqb(paymentAmountItem, "<this>");
        return Integer.valueOf(paymentAmountItem.hashCode());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public void onBind(EcomRvItemOrderAmountBinding ecomRvItemOrderAmountBinding, PaymentAmountItem item) {
        zdlpuopuiu.btonecajqb(ecomRvItemOrderAmountBinding, "<this>");
        zdlpuopuiu.btonecajqb(item, "item");
        AppCompatTextView appCompatTextView = ecomRvItemOrderAmountBinding.ecomSloTvAmount;
        StringHolder amount = item.getAmount();
        Context context = ecomRvItemOrderAmountBinding.getRoot().getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        appCompatTextView.setText(StringHolderKt.getText(amount, context));
    }
}
