package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomCompositeLayoutCardLogoBinding implements iobyxmoadg {
    public final FrameLayout ecomFlCardIconRoot;
    public final ImageView ecomIvCardIcon;
    public final ImageView ecomIvCardIconSkeleton;
    public final ShimmerFrameLayout ecomShimmerFlCardIcon;
    private final FrameLayout rootView;

    private EcomCompositeLayoutCardLogoBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = frameLayout;
        this.ecomFlCardIconRoot = frameLayout2;
        this.ecomIvCardIcon = imageView;
        this.ecomIvCardIconSkeleton = imageView2;
        this.ecomShimmerFlCardIcon = shimmerFrameLayout;
    }

    public static EcomCompositeLayoutCardLogoBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i13 = R.id.ecom_iv_card_icon;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecom_iv_card_icon_skeleton;
            ImageView imageView2 = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (imageView2 != null) {
                i13 = R.id.ecom_shimmer_fl_card_icon;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) zoijcleaow.iobyxmoadg(view, i13);
                if (shimmerFrameLayout != null) {
                    return new EcomCompositeLayoutCardLogoBinding(frameLayout, frameLayout, imageView, imageView2, shimmerFrameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomCompositeLayoutCardLogoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomCompositeLayoutCardLogoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_composite_layout_card_logo, viewGroup, false);
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
