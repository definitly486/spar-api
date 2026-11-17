package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import modern.payments.ecomAndroid.presentation.view.MerchantLogoCompositeView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentOrderBinding implements iobyxmoadg {
    public final TextView ecomEfancTvAmount;
    public final AppCompatButton ecomEfoAcbCancel;
    public final CardView ecomEfoCvCardSelectionButton;
    public final EcomIncludeLayoutSelectedCardBinding ecomEfoIncludeSelectedCard;
    public final MaterialButton ecomEfoMbPay;
    public final MerchantLogoCompositeView ecomEfoMlcvLogo;
    public final ConstraintLayout ecomEfoRoot;
    public final AppCompatTextView ecomEfoTvClientName;
    private final NestedScrollView rootView;

    private EcomFragmentOrderBinding(NestedScrollView nestedScrollView, TextView textView, AppCompatButton appCompatButton, CardView cardView, EcomIncludeLayoutSelectedCardBinding ecomIncludeLayoutSelectedCardBinding, MaterialButton materialButton, MerchantLogoCompositeView merchantLogoCompositeView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.rootView = nestedScrollView;
        this.ecomEfancTvAmount = textView;
        this.ecomEfoAcbCancel = appCompatButton;
        this.ecomEfoCvCardSelectionButton = cardView;
        this.ecomEfoIncludeSelectedCard = ecomIncludeLayoutSelectedCardBinding;
        this.ecomEfoMbPay = materialButton;
        this.ecomEfoMlcvLogo = merchantLogoCompositeView;
        this.ecomEfoRoot = constraintLayout;
        this.ecomEfoTvClientName = appCompatTextView;
    }

    public static EcomFragmentOrderBinding bind(View view) {
        View viewIobyxmoadg;
        int i13 = R.id.ecomEfancTvAmount;
        TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
        if (textView != null) {
            i13 = R.id.ecom_efo_acb_cancel;
            AppCompatButton appCompatButton = (AppCompatButton) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatButton != null) {
                i13 = R.id.ecom_efo_cv_card_selection_button;
                CardView cardView = (CardView) zoijcleaow.iobyxmoadg(view, i13);
                if (cardView != null && (viewIobyxmoadg = zoijcleaow.iobyxmoadg(view, (i13 = R.id.ecom_efo_include_selected_card))) != null) {
                    EcomIncludeLayoutSelectedCardBinding ecomIncludeLayoutSelectedCardBindingBind = EcomIncludeLayoutSelectedCardBinding.bind(viewIobyxmoadg);
                    i13 = R.id.ecom_efo_mb_pay;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(view, i13);
                    if (materialButton != null) {
                        i13 = R.id.ecom_efo_mlcv_logo;
                        MerchantLogoCompositeView merchantLogoCompositeView = (MerchantLogoCompositeView) zoijcleaow.iobyxmoadg(view, i13);
                        if (merchantLogoCompositeView != null) {
                            i13 = R.id.ecom_efo_root;
                            ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
                            if (constraintLayout != null) {
                                i13 = R.id.ecom_efo_tv_client_name;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatTextView != null) {
                                    return new EcomFragmentOrderBinding((NestedScrollView) view, textView, appCompatButton, cardView, ecomIncludeLayoutSelectedCardBindingBind, materialButton, merchantLogoCompositeView, constraintLayout, appCompatTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_order, viewGroup, false);
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
