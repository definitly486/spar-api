package cn1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f20240iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f20241ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f20242wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f20243zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, MaterialTextView materialTextView) {
        this.f20240iobyxmoadg = constraintLayout;
        this.f20243zoijcleaow = imageView;
        this.f20241ppxfxbqfkf = imageView2;
        this.f20242wkgbmnqykc = materialTextView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = bn1.iobyxmoadg.ivArrowForward;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = bn1.iobyxmoadg.ivLogo;
            ImageView imageView2 = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView2 != null) {
                i13 = bn1.iobyxmoadg.tvAppName;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    return new zoijcleaow((ConstraintLayout) view, imageView, imageView2, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(bn1.zoijcleaow.dialog_sbp_select_bank_app_list_item_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f20240iobyxmoadg;
    }
}
