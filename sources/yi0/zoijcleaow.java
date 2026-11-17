package yi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import xi0.eablkybsjg;
import xi0.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f125388eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f125389iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f125390ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f125391wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f125392zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, View view, ComposeView composeView, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f125389iobyxmoadg = linearLayout;
        this.f125392zoijcleaow = view;
        this.f125390ppxfxbqfkf = composeView;
        this.f125391wkgbmnqykc = linearLayout2;
        this.f125388eablkybsjg = recyclerView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = wkgbmnqykc.dividerReplaces;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = wkgbmnqykc.horizontalProductCardView;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i13 = wkgbmnqykc.rvReplaces;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new zoijcleaow(linearLayout, viewIobyxmoadg, composeView, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(eablkybsjg.item_product_replace, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f125389iobyxmoadg;
    }
}
