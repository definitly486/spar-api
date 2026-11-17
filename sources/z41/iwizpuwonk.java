package z41;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;

/* JADX INFO: loaded from: classes5.dex */
public final class iwizpuwonk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialDivider f128131eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128132iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f128133ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f128134wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128135zoijcleaow;

    private iwizpuwonk(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, RecyclerView recyclerView, MaterialDivider materialDivider) {
        this.f128132iobyxmoadg = constraintLayout;
        this.f128135zoijcleaow = materialButton;
        this.f128133ppxfxbqfkf = composeView;
        this.f128134wkgbmnqykc = recyclerView;
        this.f128131eablkybsjg = materialDivider;
    }

    public static iwizpuwonk iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnApplyFilters;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = vk0.wkgbmnqykc.rvFilters;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    i13 = vk0.wkgbmnqykc.vBottomLine;
                    MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialDivider != null) {
                        return new iwizpuwonk((ConstraintLayout) view, materialButton, composeView, recyclerView, materialDivider);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128132iobyxmoadg;
    }
}
