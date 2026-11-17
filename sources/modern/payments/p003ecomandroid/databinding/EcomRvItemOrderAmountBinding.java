package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomRvItemOrderAmountBinding implements iobyxmoadg {
    public final AppCompatTextView ecomSloTvAmount;
    private final ConstraintLayout rootView;

    private EcomRvItemOrderAmountBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.ecomSloTvAmount = appCompatTextView;
    }

    public static EcomRvItemOrderAmountBinding bind(View view) {
        int i13 = R.id.ecom_slo_tv_amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatTextView != null) {
            return new EcomRvItemOrderAmountBinding((ConstraintLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemOrderAmountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemOrderAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_order_amount, viewGroup, false);
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
