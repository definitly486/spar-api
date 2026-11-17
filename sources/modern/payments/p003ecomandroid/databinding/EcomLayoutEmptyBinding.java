package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutEmptyBinding implements iobyxmoadg {
    public final FrameLayout ecomSleRoot;
    private final FrameLayout rootView;

    private EcomLayoutEmptyBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.ecomSleRoot = frameLayout2;
    }

    public static EcomLayoutEmptyBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new EcomLayoutEmptyBinding(frameLayout, frameLayout);
    }

    public static EcomLayoutEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_empty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
