package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutLoggerDialogBinding implements iobyxmoadg {
    private final ConstraintLayout rootView;
    public final CardView sendLoggerFile;
    public final CardView showLogger;

    private EcomLayoutLoggerDialogBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2) {
        this.rootView = constraintLayout;
        this.sendLoggerFile = cardView;
        this.showLogger = cardView2;
    }

    public static EcomLayoutLoggerDialogBinding bind(View view) {
        int i13 = R.id.send_logger_file;
        CardView cardView = (CardView) zoijcleaow.iobyxmoadg(view, i13);
        if (cardView != null) {
            i13 = R.id.show_logger;
            CardView cardView2 = (CardView) zoijcleaow.iobyxmoadg(view, i13);
            if (cardView2 != null) {
                return new EcomLayoutLoggerDialogBinding((ConstraintLayout) view, cardView, cardView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutLoggerDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutLoggerDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_logger_dialog, viewGroup, false);
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
