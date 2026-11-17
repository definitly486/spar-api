package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import modern.payments.ecomAndroid.presentation.view.CurvedContainerLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutBottomsheetBinding implements iobyxmoadg {
    public final CurvedContainerLayout elbsCcContainer;
    public final FragmentContainerView elbsFcvContainer;
    public final EcomIncludeSwipeIndicatorBinding elbsIncludeIndicator;
    private final CurvedContainerLayout rootView;

    private EcomLayoutBottomsheetBinding(CurvedContainerLayout curvedContainerLayout, CurvedContainerLayout curvedContainerLayout2, FragmentContainerView fragmentContainerView, EcomIncludeSwipeIndicatorBinding ecomIncludeSwipeIndicatorBinding) {
        this.rootView = curvedContainerLayout;
        this.elbsCcContainer = curvedContainerLayout2;
        this.elbsFcvContainer = fragmentContainerView;
        this.elbsIncludeIndicator = ecomIncludeSwipeIndicatorBinding;
    }

    public static EcomLayoutBottomsheetBinding bind(View view) {
        View viewIobyxmoadg;
        CurvedContainerLayout curvedContainerLayout = (CurvedContainerLayout) view;
        int i13 = R.id.elbs_fcv_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) zoijcleaow.iobyxmoadg(view, i13);
        if (fragmentContainerView == null || (viewIobyxmoadg = zoijcleaow.iobyxmoadg(view, (i13 = R.id.elbs_include_indicator))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        return new EcomLayoutBottomsheetBinding(curvedContainerLayout, curvedContainerLayout, fragmentContainerView, EcomIncludeSwipeIndicatorBinding.bind(viewIobyxmoadg));
    }

    public static EcomLayoutBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_bottomsheet, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public CurvedContainerLayout getRoot() {
        return this.rootView;
    }
}
