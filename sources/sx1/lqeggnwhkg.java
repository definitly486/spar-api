package sx1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.aitsuki.swipe.SwipeLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f108659eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f108660gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SwipeLayout f108661iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f108662ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f108663wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f108664zoijcleaow;

    private lqeggnwhkg(SwipeLayout swipeLayout, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f108661iobyxmoadg = swipeLayout;
        this.f108664zoijcleaow = materialCardView;
        this.f108662ppxfxbqfkf = appCompatImageView;
        this.f108663wkgbmnqykc = constraintLayout;
        this.f108659eablkybsjg = materialTextView;
        this.f108660gxszxtbevo = materialTextView2;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        int i13 = nx1.eablkybsjg.content;
        MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialCardView != null) {
            i13 = nx1.eablkybsjg.right_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = nx1.eablkybsjg.right_menu;
                ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout != null) {
                    i13 = nx1.eablkybsjg.tvSubTitle;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = nx1.eablkybsjg.tvTitle;
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
        return this.f108661iobyxmoadg;
    }
}
