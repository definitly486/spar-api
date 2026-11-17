package m71;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import l71.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f66447eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f66448gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f66449iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f66450lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f66451ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final SwitchCompat f66452wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f66453zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, ComposeView composeView, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f66449iobyxmoadg = constraintLayout;
        this.f66453zoijcleaow = composeView;
        this.f66451ppxfxbqfkf = appCompatImageView;
        this.f66452wkgbmnqykc = switchCompat;
        this.f66447eablkybsjg = materialTextView;
        this.f66448gxszxtbevo = materialTextView2;
        this.f66450lqeggnwhkg = materialTextView3;
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
        return this.f66449iobyxmoadg;
    }
}
