package z41;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class lmojexxdyd implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f128232eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128233iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f128234ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f128235wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128236zoijcleaow;

    private lmojexxdyd(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView) {
        this.f128233iobyxmoadg = constraintLayout;
        this.f128236zoijcleaow = materialButton;
        this.f128234ppxfxbqfkf = composeView;
        this.f128235wkgbmnqykc = composeView2;
        this.f128232eablkybsjg = recyclerView;
    }

    public static lmojexxdyd iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnClearFilters;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = vk0.wkgbmnqykc.cvActionBar;
                ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView2 != null) {
                    i13 = vk0.wkgbmnqykc.rvFilters;
                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (recyclerView != null) {
                        return new lmojexxdyd((ConstraintLayout) view, materialButton, composeView, composeView2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128233iobyxmoadg;
    }
}
