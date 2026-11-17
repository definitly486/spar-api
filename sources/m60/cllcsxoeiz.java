package m60;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class cllcsxoeiz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f65408eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65409iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65410ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f65411wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65412zoijcleaow;

    private cllcsxoeiz(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView) {
        this.f65409iobyxmoadg = constraintLayout;
        this.f65412zoijcleaow = materialButton;
        this.f65410ppxfxbqfkf = composeView;
        this.f65411wkgbmnqykc = composeView2;
        this.f65408eablkybsjg = recyclerView;
    }

    public static cllcsxoeiz iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnClearFilters;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = pm.eablkybsjg.cvActionBar;
                ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView2 != null) {
                    i13 = pm.eablkybsjg.rvFilters;
                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (recyclerView != null) {
                        return new cllcsxoeiz((ConstraintLayout) view, materialButton, composeView, composeView2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65409iobyxmoadg;
    }
}
