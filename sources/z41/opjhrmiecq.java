package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class opjhrmiecq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128309iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128310ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialDivider f128311zoijcleaow;

    private opjhrmiecq(LinearLayout linearLayout, MaterialDivider materialDivider, MaterialTextView materialTextView) {
        this.f128309iobyxmoadg = linearLayout;
        this.f128311zoijcleaow = materialDivider;
        this.f128310ppxfxbqfkf = materialTextView;
    }

    public static opjhrmiecq iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.divider;
        MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialDivider != null) {
            i13 = vk0.wkgbmnqykc.tv_row_title;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new opjhrmiecq((LinearLayout) view, materialDivider, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static opjhrmiecq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_table_banner_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f128309iobyxmoadg;
    }
}
