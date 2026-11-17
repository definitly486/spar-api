package z41;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class pkzmftpjix implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128325iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f128326ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f128327wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f128328zoijcleaow;

    private pkzmftpjix(LinearLayout linearLayout, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView) {
        this.f128325iobyxmoadg = linearLayout;
        this.f128328zoijcleaow = composeView;
        this.f128326ppxfxbqfkf = composeView2;
        this.f128327wkgbmnqykc = recyclerView;
    }

    public static pkzmftpjix iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = vk0.wkgbmnqykc.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null) {
                i13 = vk0.wkgbmnqykc.rvBanners;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new pkzmftpjix((LinearLayout) view, composeView, composeView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f128325iobyxmoadg;
    }
}
