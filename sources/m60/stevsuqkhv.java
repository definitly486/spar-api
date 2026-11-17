package m60;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class stevsuqkhv implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65983iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65984ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f65985wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f65986zoijcleaow;

    private stevsuqkhv(LinearLayout linearLayout, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView) {
        this.f65983iobyxmoadg = linearLayout;
        this.f65986zoijcleaow = composeView;
        this.f65984ppxfxbqfkf = composeView2;
        this.f65985wkgbmnqykc = recyclerView;
    }

    public static stevsuqkhv iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = pm.eablkybsjg.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null) {
                i13 = pm.eablkybsjg.rvBanners;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new stevsuqkhv((LinearLayout) view, composeView, composeView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65983iobyxmoadg;
    }
}
