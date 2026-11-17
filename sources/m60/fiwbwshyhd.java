package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class fiwbwshyhd implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65504iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65505ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final LinearLayout f65506zoijcleaow;

    private fiwbwshyhd(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f65504iobyxmoadg = linearLayout;
        this.f65506zoijcleaow = linearLayout2;
        this.f65505ppxfxbqfkf = materialTextView;
    }

    public static fiwbwshyhd iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.llContent;
        LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (linearLayout != null) {
            i13 = pm.eablkybsjg.tvControl;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new fiwbwshyhd((LinearLayout) view, linearLayout, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static fiwbwshyhd ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.partial_expandable_linear_layout, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65504iobyxmoadg;
    }
}
