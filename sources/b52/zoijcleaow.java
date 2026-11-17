package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RelativeLayout f15351iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ProgressBar f15352ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f15353zoijcleaow;

    private zoijcleaow(RelativeLayout relativeLayout, MaterialButton materialButton, ProgressBar progressBar) {
        this.f15351iobyxmoadg = relativeLayout;
        this.f15353zoijcleaow = materialButton;
        this.f15352ppxfxbqfkf = progressBar;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = t42.iobyxmoadg.btnBanner;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = t42.iobyxmoadg.progress;
            ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (progressBar != null) {
                return new zoijcleaow((RelativeLayout) view, materialButton, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_button, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f15351iobyxmoadg;
    }
}
