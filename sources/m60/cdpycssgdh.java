package m60;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class cdpycssgdh implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TabLayout f65402eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ViewPager2 f65403gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65404iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65405ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final hszhottldk f65406wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f65407zoijcleaow;

    private cdpycssgdh(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, hszhottldk hszhottldkVar, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f65404iobyxmoadg = constraintLayout;
        this.f65407zoijcleaow = composeView;
        this.f65405ppxfxbqfkf = composeView2;
        this.f65406wkgbmnqykc = hszhottldkVar;
        this.f65402eablkybsjg = tabLayout;
        this.f65403gxszxtbevo = viewPager2;
    }

    public static cdpycssgdh iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = pm.eablkybsjg.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.flWarning))) != null) {
                hszhottldk hszhottldkVarIobyxmoadg = hszhottldk.iobyxmoadg(viewIobyxmoadg);
                i13 = pm.eablkybsjg.tlTypeToggle;
                TabLayout tabLayout = (TabLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (tabLayout != null) {
                    i13 = pm.eablkybsjg.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (viewPager2 != null) {
                        return new cdpycssgdh((ConstraintLayout) view, composeView, composeView2, hszhottldkVarIobyxmoadg, tabLayout, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65404iobyxmoadg;
    }
}
