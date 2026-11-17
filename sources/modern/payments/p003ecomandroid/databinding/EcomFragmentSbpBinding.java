package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import modern.payments.ecomAndroid.presentation.view.EcomSbpSearchCompositeView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentSbpBinding implements iobyxmoadg {
    public final ImageView ecomEfsbpIvLogo;
    public final ConstraintLayout ecomEfsbpRoot;
    public final RecyclerView ecomEfsbpRvBankList;
    public final TextView ecomEfsbpTvSubtitle;
    public final TextView ecomEfsbpTvTitle;
    public final EcomSbpSearchCompositeView ecomEsscvSbpSearchView;
    public final TextView ecomSbpEmptyTitle;
    private final ConstraintLayout rootView;

    private EcomFragmentSbpBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, EcomSbpSearchCompositeView ecomSbpSearchCompositeView, TextView textView3) {
        this.rootView = constraintLayout;
        this.ecomEfsbpIvLogo = imageView;
        this.ecomEfsbpRoot = constraintLayout2;
        this.ecomEfsbpRvBankList = recyclerView;
        this.ecomEfsbpTvSubtitle = textView;
        this.ecomEfsbpTvTitle = textView2;
        this.ecomEsscvSbpSearchView = ecomSbpSearchCompositeView;
        this.ecomSbpEmptyTitle = textView3;
    }

    public static EcomFragmentSbpBinding bind(View view) {
        int i13 = R.id.ecom_efsbp_iv_logo;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = R.id.ecom_efsbp_rv_bank_list;
            RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                i13 = R.id.ecom_efsbp_tv_subtitle;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    i13 = R.id.ecom_efsbp_tv_title;
                    TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (textView2 != null) {
                        i13 = R.id.ecom_esscv_sbp_search_view;
                        EcomSbpSearchCompositeView ecomSbpSearchCompositeView = (EcomSbpSearchCompositeView) zoijcleaow.iobyxmoadg(view, i13);
                        if (ecomSbpSearchCompositeView != null) {
                            i13 = R.id.ecom_sbp_empty_title;
                            TextView textView3 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                            if (textView3 != null) {
                                return new EcomFragmentSbpBinding(constraintLayout, imageView, constraintLayout, recyclerView, textView, textView2, ecomSbpSearchCompositeView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentSbpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentSbpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_sbp, viewGroup, false);
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
