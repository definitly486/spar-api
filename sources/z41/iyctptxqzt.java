package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class iyctptxqzt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128142iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128143ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final LinearLayout f128144zoijcleaow;

    private iyctptxqzt(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f128142iobyxmoadg = linearLayout;
        this.f128144zoijcleaow = linearLayout2;
        this.f128143ppxfxbqfkf = materialTextView;
    }

    public static iyctptxqzt iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.llContent;
        LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (linearLayout != null) {
            i13 = vk0.wkgbmnqykc.tvControl;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new iyctptxqzt((LinearLayout) view, linearLayout, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iyctptxqzt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.partial_expandable_linear_layout_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f128142iobyxmoadg;
    }
}
