package kk;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import spay.sdk.view.MerchantLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class pb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FrameLayout f58062iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f58063ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MerchantLogoCompositeView f58064zoijcleaow;

    public pb(FrameLayout frameLayout, MerchantLogoCompositeView merchantLogoCompositeView, ShapeableImageView shapeableImageView) {
        this.f58062iobyxmoadg = frameLayout;
        this.f58064zoijcleaow = merchantLogoCompositeView;
        this.f58063ppxfxbqfkf = shapeableImageView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58062iobyxmoadg;
    }
}
