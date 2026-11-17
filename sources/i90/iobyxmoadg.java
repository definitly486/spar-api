package i90;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import h90.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f42128eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f42129gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f42130iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f42131lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f42132ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final SwitchCompat f42133wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f42134zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, ComposeView composeView, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f42130iobyxmoadg = constraintLayout;
        this.f42134zoijcleaow = composeView;
        this.f42132ppxfxbqfkf = appCompatImageView;
        this.f42133wkgbmnqykc = switchCompat;
        this.f42128eablkybsjg = materialTextView;
        this.f42129gxszxtbevo = materialTextView2;
        this.f42131lqeggnwhkg = materialTextView3;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = ppxfxbqfkf.ivBannerPicture;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = ppxfxbqfkf.switchReceiveEchecks;
                SwitchCompat switchCompat = (SwitchCompat) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (switchCompat != null) {
                    i13 = ppxfxbqfkf.tvCloseAction;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = ppxfxbqfkf.tvMsgChecks;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = ppxfxbqfkf.tvReceiptChecks;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                return new iobyxmoadg((ConstraintLayout) view, composeView, appCompatImageView, switchCompat, materialTextView, materialTextView2, materialTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f42130iobyxmoadg;
    }
}
