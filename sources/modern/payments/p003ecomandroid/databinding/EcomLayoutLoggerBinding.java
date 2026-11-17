package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutLoggerBinding implements iobyxmoadg {
    public final CardView loggerBackBtn;
    public final ConstraintLayout loggerRoot;
    public final NestedScrollView loggerScrollContainer;
    public final TextView loggerTextView;
    private final ConstraintLayout rootView;

    private EcomLayoutLoggerBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView, TextView textView) {
        this.rootView = constraintLayout;
        this.loggerBackBtn = cardView;
        this.loggerRoot = constraintLayout2;
        this.loggerScrollContainer = nestedScrollView;
        this.loggerTextView = textView;
    }

    public static EcomLayoutLoggerBinding bind(View view) {
        int i13 = R.id.logger_back_btn;
        CardView cardView = (CardView) zoijcleaow.iobyxmoadg(view, i13);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = R.id.loggerScrollContainer;
            NestedScrollView nestedScrollView = (NestedScrollView) zoijcleaow.iobyxmoadg(view, i13);
            if (nestedScrollView != null) {
                i13 = R.id.loggerTextView;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    return new EcomLayoutLoggerBinding(constraintLayout, cardView, constraintLayout, nestedScrollView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutLoggerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutLoggerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_logger, viewGroup, false);
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
