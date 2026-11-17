package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class fyldjkxazc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128009iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FlexboxLayout f128010ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f128011wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f128012zoijcleaow;

    private fyldjkxazc(ConstraintLayout constraintLayout, MaterialTextView materialTextView, FlexboxLayout flexboxLayout, MaterialTextView materialTextView2) {
        this.f128009iobyxmoadg = constraintLayout;
        this.f128012zoijcleaow = materialTextView;
        this.f128010ppxfxbqfkf = flexboxLayout;
        this.f128011wkgbmnqykc = materialTextView2;
    }

    public static fyldjkxazc iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnShowAllFilters;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = vk0.wkgbmnqykc.flFilters;
            FlexboxLayout flexboxLayout = (FlexboxLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (flexboxLayout != null) {
                i13 = vk0.wkgbmnqykc.tvTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new fyldjkxazc((ConstraintLayout) view, materialTextView, flexboxLayout, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static fyldjkxazc ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.view_filters_view_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128009iobyxmoadg;
    }
}
