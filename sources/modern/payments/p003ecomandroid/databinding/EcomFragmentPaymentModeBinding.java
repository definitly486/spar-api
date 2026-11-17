package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.ecomAndroid.presentation.view.MerchantLogoCompositeView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentPaymentModeBinding implements iobyxmoadg {
    public final EcomButtonView ecomEfpmMbClose;
    public final MerchantLogoCompositeView ecomEfpmMlcvLogo;
    public final RecyclerView ecomEfpmRvModeList;
    public final TextView ecomEfpmTvAmount;
    public final TextView ecomEfpmTvClientName;
    private final ConstraintLayout rootView;

    private EcomFragmentPaymentModeBinding(ConstraintLayout constraintLayout, EcomButtonView ecomButtonView, MerchantLogoCompositeView merchantLogoCompositeView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.ecomEfpmMbClose = ecomButtonView;
        this.ecomEfpmMlcvLogo = merchantLogoCompositeView;
        this.ecomEfpmRvModeList = recyclerView;
        this.ecomEfpmTvAmount = textView;
        this.ecomEfpmTvClientName = textView2;
    }

    public static EcomFragmentPaymentModeBinding bind(View view) {
        int i13 = R.id.ecom_efpm_mb_close;
        EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
        if (ecomButtonView != null) {
            i13 = R.id.ecomEfpmMlcvLogo;
            MerchantLogoCompositeView merchantLogoCompositeView = (MerchantLogoCompositeView) zoijcleaow.iobyxmoadg(view, i13);
            if (merchantLogoCompositeView != null) {
                i13 = R.id.ecom_efpm_rv_mode_list;
                RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    i13 = R.id.ecom_efpm_tv_amount;
                    TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = R.id.ecom_efpm_tv_client_name;
                        TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                        if (textView2 != null) {
                            return new EcomFragmentPaymentModeBinding((ConstraintLayout) view, ecomButtonView, merchantLogoCompositeView, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentPaymentModeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentPaymentModeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_payment_mode, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
