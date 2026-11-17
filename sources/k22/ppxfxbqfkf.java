package k22;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53626iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProgressBar f53627zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ProgressBar progressBar) {
        this.f53626iobyxmoadg = constraintLayout;
        this.f53627zoijcleaow = progressBar;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.pbLoading;
        ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (progressBar != null) {
            return new ppxfxbqfkf((ConstraintLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(s12.ppxfxbqfkf.dialog_scan_go_loading, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53626iobyxmoadg;
    }
}
