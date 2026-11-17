package b60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import s40.dxjokdxxww;
import s40.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f15363eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f15364gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f15365iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f15366lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FrameLayout f15367ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f15368wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f15369zoijcleaow;

    private zoijcleaow(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ShapeableImageView shapeableImageView, LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f15365iobyxmoadg = frameLayout;
        this.f15369zoijcleaow = imageView;
        this.f15367ppxfxbqfkf = frameLayout2;
        this.f15368wkgbmnqykc = shapeableImageView;
        this.f15363eablkybsjg = linearLayout;
        this.f15364gxszxtbevo = materialTextView;
        this.f15366lqeggnwhkg = materialTextView2;
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
        View viewInflate = layoutInflater.inflate(dxjokdxxww.dialog_custom, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f15365iobyxmoadg;
    }
}
