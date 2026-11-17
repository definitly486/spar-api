package o41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b31.dxjokdxxww;
import b31.nufgyqmvbu;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f72037eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f72038gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f72039iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f72040lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FrameLayout f72041ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f72042wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f72043zoijcleaow;

    private zoijcleaow(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ShapeableImageView shapeableImageView, LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f72039iobyxmoadg = frameLayout;
        this.f72043zoijcleaow = imageView;
        this.f72041ppxfxbqfkf = frameLayout2;
        this.f72042wkgbmnqykc = shapeableImageView;
        this.f72037eablkybsjg = linearLayout;
        this.f72038gxszxtbevo = materialTextView;
        this.f72040lqeggnwhkg = materialTextView2;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = nufgyqmvbu.closeButton;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i13 = nufgyqmvbu.image;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                i13 = nufgyqmvbu.llActions;
                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (linearLayout != null) {
                    i13 = nufgyqmvbu.tvMessage;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = nufgyqmvbu.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new zoijcleaow(frameLayout, imageView, frameLayout, shapeableImageView, linearLayout, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(dxjokdxxww.dialog_custom_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f72039iobyxmoadg;
    }
}
