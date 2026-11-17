package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomIncludeSwipeIndicatorBinding implements iobyxmoadg {
    private final AppCompatImageView rootView;

    private EcomIncludeSwipeIndicatorBinding(AppCompatImageView appCompatImageView) {
        this.rootView = appCompatImageView;
    }

    public static EcomIncludeSwipeIndicatorBinding bind(View view) {
        if (view != null) {
            return new EcomIncludeSwipeIndicatorBinding((AppCompatImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static EcomIncludeSwipeIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomIncludeSwipeIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_include_swipe_indicator, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public AppCompatImageView getRoot() {
        return this.rootView;
    }
}
