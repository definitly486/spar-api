package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomCompositeLayoutMerchantLogoBinding implements iobyxmoadg {
    public final ImageView ecomEclmlIvMerchantLogoSkeleton;
    public final ShimmerFrameLayout ecomEclmlShimmerFlMerchantLogo;
    public final ShapeableImageView ecomEclmlSivMerchantLogo;
    public final FrameLayout ecomFlMerchantLogoRoot;
    private final FrameLayout rootView;

    private EcomCompositeLayoutMerchantLogoBinding(FrameLayout frameLayout, ImageView imageView, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.ecomEclmlIvMerchantLogoSkeleton = imageView;
        this.ecomEclmlShimmerFlMerchantLogo = shimmerFrameLayout;
        this.ecomEclmlSivMerchantLogo = shapeableImageView;
        this.ecomFlMerchantLogoRoot = frameLayout2;
    }

    public static EcomCompositeLayoutMerchantLogoBinding bind(View view) {
        int i13 = R.id.ecom_eclml_iv_merchant_logo_skeleton;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecom_eclml_shimmer_fl_merchant_logo;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) zoijcleaow.iobyxmoadg(view, i13);
            if (shimmerFrameLayout != null) {
                i13 = R.id.ecom_eclml_siv_merchant_logo;
                ShapeableImageView shapeableImageView = (ShapeableImageView) zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    return new EcomCompositeLayoutMerchantLogoBinding(frameLayout, imageView, shimmerFrameLayout, shapeableImageView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomCompositeLayoutMerchantLogoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomCompositeLayoutMerchantLogoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_composite_layout_merchant_logo, viewGroup, false);
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
