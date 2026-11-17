package yi1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.aitsuki.swipe.SwipeLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f125430eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f125431gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SwipeLayout f125432iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f125433ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f125434wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f125435zoijcleaow;

    private lqeggnwhkg(SwipeLayout swipeLayout, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f125432iobyxmoadg = swipeLayout;
        this.f125435zoijcleaow = materialCardView;
        this.f125433ppxfxbqfkf = appCompatImageView;
        this.f125434wkgbmnqykc = constraintLayout;
        this.f125430eablkybsjg = materialTextView;
        this.f125431gxszxtbevo = materialTextView2;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        int i13 = ti1.eablkybsjg.content;
        MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialCardView != null) {
            i13 = ti1.eablkybsjg.right_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = ti1.eablkybsjg.right_menu;
                ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout != null) {
                    i13 = ti1.eablkybsjg.tvSubTitle;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = ti1.eablkybsjg.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new lqeggnwhkg((SwipeLayout) view, materialCardView, appCompatImageView, constraintLayout, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public SwipeLayout getRoot() {
        return this.f125432iobyxmoadg;
    }
}
