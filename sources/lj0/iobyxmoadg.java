package lj0;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kj0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f62693iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f62694ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f62695zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, ComposeView composeView, RecyclerView recyclerView) {
        this.f62693iobyxmoadg = constraintLayout;
        this.f62695zoijcleaow = composeView;
        this.f62694ppxfxbqfkf = recyclerView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = ppxfxbqfkf.rvPartners;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                return new iobyxmoadg((ConstraintLayout) view, composeView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f62693iobyxmoadg;
    }
}
