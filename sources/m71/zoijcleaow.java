package m71;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import l71.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f66454btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f66455dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final SwitchCompat f66456eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f66457gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f66458iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f66459lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f66460nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f66461ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f66462wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f66463zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f66458iobyxmoadg = constraintLayout;
        this.f66463zoijcleaow = composeView;
        this.f66461ppxfxbqfkf = composeView2;
        this.f66462wkgbmnqykc = appCompatImageView;
        this.f66456eablkybsjg = switchCompat;
        this.f66457gxszxtbevo = materialTextView;
        this.f66459lqeggnwhkg = materialTextView2;
        this.f66460nufgyqmvbu = materialTextView3;
        this.f66455dxjokdxxww = materialTextView4;
        this.f66454btonecajqb = materialTextView5;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = ppxfxbqfkf.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null) {
                i13 = ppxfxbqfkf.ivBannerPicture;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = ppxfxbqfkf.switchReceiveEchecks;
                    SwitchCompat switchCompat = (SwitchCompat) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (switchCompat != null) {
                        i13 = ppxfxbqfkf.tvEchecksTitle;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            i13 = ppxfxbqfkf.tvEmail;
                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView2 != null) {
                                i13 = ppxfxbqfkf.tvEmailHeader;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = ppxfxbqfkf.tvReceiptChecks;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        i13 = ppxfxbqfkf.tvSubtitle;
                                        MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView5 != null) {
                                            return new zoijcleaow((ConstraintLayout) view, composeView, composeView2, appCompatImageView, switchCompat, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                                        }
                                    }
                                }
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
        return this.f66458iobyxmoadg;
    }
}
