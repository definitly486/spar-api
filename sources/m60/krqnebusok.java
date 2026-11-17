package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class krqnebusok implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f65711iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65712ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProgressBar f65713zoijcleaow;

    private krqnebusok(FrameLayout frameLayout, ProgressBar progressBar, MaterialTextView materialTextView) {
        this.f65711iobyxmoadg = frameLayout;
        this.f65713zoijcleaow = progressBar;
        this.f65712ppxfxbqfkf = materialTextView;
    }

    public static krqnebusok iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.pbLoading;
        ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (progressBar != null) {
            i13 = pm.eablkybsjg.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new krqnebusok((FrameLayout) view, progressBar, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static krqnebusok ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_buy_button_new, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f65711iobyxmoadg;
    }
}
