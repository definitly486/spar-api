package k22;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.CircleProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53534iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final CircleProgressBar f53535ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f53536wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f53537zoijcleaow;

    private agtfadlqog(ConstraintLayout constraintLayout, MaterialTextView materialTextView, CircleProgressBar circleProgressBar, MaterialTextView materialTextView2) {
        this.f53534iobyxmoadg = constraintLayout;
        this.f53537zoijcleaow = materialTextView;
        this.f53535ppxfxbqfkf = circleProgressBar;
        this.f53536wkgbmnqykc = materialTextView2;
    }

    public static agtfadlqog iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.btnReturnProduct;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = s12.zoijcleaow.pbTimer;
            CircleProgressBar circleProgressBar = (CircleProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (circleProgressBar != null) {
                i13 = s12.zoijcleaow.tvTimeLeft;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new agtfadlqog((ConstraintLayout) view, materialTextView, circleProgressBar, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static agtfadlqog ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(s12.ppxfxbqfkf.layout_scan_and_go_return_deleted_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53534iobyxmoadg;
    }
}
