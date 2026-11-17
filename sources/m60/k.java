package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65684iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FlexboxLayout f65685ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f65686wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f65687zoijcleaow;

    private k(ConstraintLayout constraintLayout, MaterialTextView materialTextView, FlexboxLayout flexboxLayout, MaterialTextView materialTextView2) {
        this.f65684iobyxmoadg = constraintLayout;
        this.f65687zoijcleaow = materialTextView;
        this.f65685ppxfxbqfkf = flexboxLayout;
        this.f65686wkgbmnqykc = materialTextView2;
    }

    public static k iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnShowAllFilters;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = pm.eablkybsjg.flFilters;
            FlexboxLayout flexboxLayout = (FlexboxLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (flexboxLayout != null) {
                i13 = pm.eablkybsjg.tvTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new k((ConstraintLayout) view, materialTextView, flexboxLayout, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static k ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_filters_view, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65684iobyxmoadg;
    }
}
