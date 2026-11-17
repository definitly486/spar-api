package yf1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.divider.MaterialDivider;
import xf1.eablkybsjg;
import xf1.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f124737eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f124738iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f124739ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f124740wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialDivider f124741zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, MaterialDivider materialDivider, ComposeView composeView, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f124738iobyxmoadg = linearLayout;
        this.f124741zoijcleaow = materialDivider;
        this.f124739ppxfxbqfkf = composeView;
        this.f124740wkgbmnqykc = linearLayout2;
        this.f124737eablkybsjg = recyclerView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = wkgbmnqykc.dividerReplaces;
        MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialDivider != null) {
            i13 = wkgbmnqykc.horizontalProductCardView;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i13 = wkgbmnqykc.rvReplaces;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new zoijcleaow(linearLayout, materialDivider, composeView, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(eablkybsjg.item_product_replace_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f124738iobyxmoadg;
    }
}
