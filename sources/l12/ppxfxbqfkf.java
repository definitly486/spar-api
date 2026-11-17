package l12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f61346iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f61347ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f61348wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f61349zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, MaterialTextView materialTextView) {
        this.f61346iobyxmoadg = constraintLayout;
        this.f61349zoijcleaow = imageView;
        this.f61347ppxfxbqfkf = imageView2;
        this.f61348wkgbmnqykc = materialTextView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = k12.iobyxmoadg.ivArrowForward;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = k12.iobyxmoadg.ivLogo;
            ImageView imageView2 = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView2 != null) {
                i13 = k12.iobyxmoadg.tvAppName;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    return new ppxfxbqfkf((ConstraintLayout) view, imageView, imageView2, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(k12.zoijcleaow.dialog_sbp_select_bank_app_list_item, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f61346iobyxmoadg;
    }
}
