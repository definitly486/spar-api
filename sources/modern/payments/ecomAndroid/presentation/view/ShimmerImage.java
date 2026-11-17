package modern.payments.ecomAndroid.presentation.view;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import e7.gxszxtbevo;
import e7.nufgyqmvbu;
import e7.rgvfuqvkyq;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.extension.ImageViewExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/ShimmerImage;", "", "", "imageUrl", "Landroid/widget/ImageView;", "shimmerImageView", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "shimmerFrame", "Landroid/graphics/drawable/Drawable;", "defaultImage", "Lgg/wwaezpbzkn;", "loadImageAsyncWithShimmer", "(Ljava/lang/String;Landroid/widget/ImageView;Lcom/facebook/shimmer/ShimmerFrameLayout;Landroid/graphics/drawable/Drawable;)V", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "getCoilImpl", "()Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ShimmerImage {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void loadImageAsyncWithShimmer(ShimmerImage shimmerImage, String str, final ImageView shimmerImageView, final ShimmerFrameLayout shimmerFrame, final Drawable drawable) {
            zdlpuopuiu.btonecajqb(shimmerImageView, "shimmerImageView");
            zdlpuopuiu.btonecajqb(shimmerFrame, "shimmerFrame");
            ImageViewExtensionsKt.loadImageAsync(shimmerImageView, shimmerImage.getCoilImpl(), str, new nufgyqmvbu.zoijcleaow() { // from class: modern.payments.ecomAndroid.presentation.view.ShimmerImage$loadImageAsyncWithShimmer$listener$1
                @Override // e7.nufgyqmvbu.zoijcleaow
                public /* bridge */ /* synthetic */ void onCancel(nufgyqmvbu nufgyqmvbuVar) {
                    super.onCancel(nufgyqmvbuVar);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public void onError(nufgyqmvbu request, gxszxtbevo result) {
                    zdlpuopuiu.btonecajqb(request, "request");
                    zdlpuopuiu.btonecajqb(result, "result");
                    Log.i("ShimmerImage", "A famous Shimmer case");
                    ShimmerFrameLayout shimmerFrameLayout = shimmerFrame;
                    shimmerFrameLayout.wkgbmnqykc();
                    shimmerFrameLayout.setVisibility(8);
                    shimmerImageView.setImageDrawable(drawable);
                    shimmerImageView.setVisibility(0);
                    super.onError(request, result);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public void onStart(nufgyqmvbu request) {
                    zdlpuopuiu.btonecajqb(request, "request");
                    ShimmerFrameLayout shimmerFrameLayout = shimmerFrame;
                    shimmerFrameLayout.ppxfxbqfkf();
                    shimmerFrameLayout.setVisibility(0);
                    super.onStart(request);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public void onSuccess(nufgyqmvbu request, rgvfuqvkyq result) {
                    zdlpuopuiu.btonecajqb(request, "request");
                    zdlpuopuiu.btonecajqb(result, "result");
                    ShimmerFrameLayout shimmerFrameLayout = shimmerFrame;
                    shimmerFrameLayout.wkgbmnqykc();
                    shimmerFrameLayout.setVisibility(8);
                    shimmerImageView.setVisibility(0);
                    super.onSuccess(request, result);
                }
            });
        }
    }

    CoilImpl getCoilImpl();

    void loadImageAsyncWithShimmer(String imageUrl, ImageView shimmerImageView, ShimmerFrameLayout shimmerFrame, Drawable defaultImage);
}
