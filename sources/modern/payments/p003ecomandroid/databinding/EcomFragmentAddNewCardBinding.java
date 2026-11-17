package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.ecomAndroid.presentation.view.EcomCardDataView;
import modern.payments.ecomAndroid.presentation.view.MerchantLogoCompositeView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentAddNewCardBinding implements iobyxmoadg {
    public final TextView ecomEfancCardErrorMessageTextView;
    public final EcomCardDataView ecomEfancCvCardSelectionButton;
    public final EcomButtonView ecomEfancEbvCancel;
    public final EcomButtonView ecomEfancEbvPay;
    public final ConstraintLayout ecomEfancRoot;
    public final TextView ecomEfancTvAmount;
    public final TextView ecomEfancTvClientName;
    public final MerchantLogoCompositeView ecomEfpmMlcvLogo;
    private final NestedScrollView rootView;

    private EcomFragmentAddNewCardBinding(NestedScrollView nestedScrollView, TextView textView, EcomCardDataView ecomCardDataView, EcomButtonView ecomButtonView, EcomButtonView ecomButtonView2, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, MerchantLogoCompositeView merchantLogoCompositeView) {
        this.rootView = nestedScrollView;
        this.ecomEfancCardErrorMessageTextView = textView;
        this.ecomEfancCvCardSelectionButton = ecomCardDataView;
        this.ecomEfancEbvCancel = ecomButtonView;
        this.ecomEfancEbvPay = ecomButtonView2;
        this.ecomEfancRoot = constraintLayout;
        this.ecomEfancTvAmount = textView2;
        this.ecomEfancTvClientName = textView3;
        this.ecomEfpmMlcvLogo = merchantLogoCompositeView;
    }

    public static EcomFragmentAddNewCardBinding bind(View view) {
        int i13 = R.id.ecomEfancCardErrorMessageTextView;
        TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
        if (textView != null) {
            i13 = R.id.ecomEfancCvCardSelectionButton;
            EcomCardDataView ecomCardDataView = (EcomCardDataView) zoijcleaow.iobyxmoadg(view, i13);
            if (ecomCardDataView != null) {
                i13 = R.id.ecomEfancEbvCancel;
                EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
                if (ecomButtonView != null) {
                    i13 = R.id.ecomEfancEbvPay;
                    EcomButtonView ecomButtonView2 = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
                    if (ecomButtonView2 != null) {
                        i13 = R.id.ecomEfancRoot;
                        ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
                        if (constraintLayout != null) {
                            i13 = R.id.ecomEfancTvAmount;
                            TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                            if (textView2 != null) {
                                i13 = R.id.ecomEfancTvClientName;
                                TextView textView3 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                                if (textView3 != null) {
                                    i13 = R.id.ecomEfpmMlcvLogo;
                                    MerchantLogoCompositeView merchantLogoCompositeView = (MerchantLogoCompositeView) zoijcleaow.iobyxmoadg(view, i13);
                                    if (merchantLogoCompositeView != null) {
                                        return new EcomFragmentAddNewCardBinding((NestedScrollView) view, textView, ecomCardDataView, ecomButtonView, ecomButtonView2, constraintLayout, textView2, textView3, merchantLogoCompositeView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentAddNewCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentAddNewCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_add_new_card, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
