package z41;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class cdpycssgdh implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127885iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f127886ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f127887wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f127888zoijcleaow;

    private cdpycssgdh(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView) {
        this.f127885iobyxmoadg = constraintLayout;
        this.f127888zoijcleaow = composeView;
        this.f127886ppxfxbqfkf = composeView2;
        this.f127887wkgbmnqykc = recyclerView;
    }

    public static cdpycssgdh iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = vk0.wkgbmnqykc.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null) {
                i13 = vk0.wkgbmnqykc.rvSavedCardInfo;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new cdpycssgdh((ConstraintLayout) view, composeView, composeView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f127885iobyxmoadg;
    }
}
