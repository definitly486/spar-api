package go1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class cqumvgiudr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38007iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f38008ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f38009wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageButton f38010zoijcleaow;

    private cqumvgiudr(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, MaterialTextView materialTextView) {
        this.f38007iobyxmoadg = constraintLayout;
        this.f38010zoijcleaow = appCompatImageButton;
        this.f38008ppxfxbqfkf = appCompatImageButton2;
        this.f38009wkgbmnqykc = materialTextView;
    }

    public static cqumvgiudr iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.btnMinusQuantity;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageButton != null) {
            i13 = on1.zoijcleaow.btnPlusQuantity;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton2 != null) {
                i13 = on1.zoijcleaow.tvAmount;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    return new cqumvgiudr((ConstraintLayout) view, appCompatImageButton, appCompatImageButton2, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static cqumvgiudr ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(on1.ppxfxbqfkf.view_scan_go_product_counter_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38007iobyxmoadg;
    }
}
