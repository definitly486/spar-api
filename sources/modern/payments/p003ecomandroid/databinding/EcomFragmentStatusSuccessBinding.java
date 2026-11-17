package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentStatusSuccessBinding implements iobyxmoadg {
    public final AppCompatImageView efssAcivStatusIcon;
    public final AppCompatTextView efssActvAmount;
    public final AppCompatTextView efssActvDetailedText;
    public final AppCompatTextView efssActvLocalSessionId;
    public final AppCompatTextView efssActvMerchantName;
    public final EcomButtonView efssFdbMbToPaymentMethods;
    private final LinearLayoutCompat rootView;

    private EcomFragmentStatusSuccessBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, EcomButtonView ecomButtonView) {
        this.rootView = linearLayoutCompat;
        this.efssAcivStatusIcon = appCompatImageView;
        this.efssActvAmount = appCompatTextView;
        this.efssActvDetailedText = appCompatTextView2;
        this.efssActvLocalSessionId = appCompatTextView3;
        this.efssActvMerchantName = appCompatTextView4;
        this.efssFdbMbToPaymentMethods = ecomButtonView;
    }

    public static EcomFragmentStatusSuccessBinding bind(View view) {
        int i13 = R.id.efss_aciv_status_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = R.id.efss_actv_amount;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView != null) {
                i13 = R.id.efss_actv_detailed_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView2 != null) {
                    i13 = R.id.efss_actv_local_session_id;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatTextView3 != null) {
                        i13 = R.id.efss_actv_merchant_name;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatTextView4 != null) {
                            i13 = R.id.efss_fdb_mb_to_payment_methods;
                            EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
                            if (ecomButtonView != null) {
                                return new EcomFragmentStatusSuccessBinding((LinearLayoutCompat) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, ecomButtonView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentStatusSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentStatusSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_status_success, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
