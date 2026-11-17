package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class sopmlzcsov implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128385iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f128386ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProgressBar f128387zoijcleaow;

    private sopmlzcsov(LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f128385iobyxmoadg = linearLayout;
        this.f128387zoijcleaow = progressBar;
        this.f128386ppxfxbqfkf = recyclerView;
    }

    public static sopmlzcsov iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.pbLoading;
        ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (progressBar != null) {
            i13 = vk0.wkgbmnqykc.rvButtons;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                return new sopmlzcsov((LinearLayout) view, progressBar, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static sopmlzcsov ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_myspar_buttons_panel_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f128385iobyxmoadg;
    }
}
