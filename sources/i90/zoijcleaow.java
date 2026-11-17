package i90;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import h90.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f42135btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f42136dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final SwitchCompat f42137eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f42138gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f42139iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f42140lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f42141nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f42142ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f42143wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f42144zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f42139iobyxmoadg = constraintLayout;
        this.f42144zoijcleaow = composeView;
        this.f42142ppxfxbqfkf = composeView2;
        this.f42143wkgbmnqykc = appCompatImageView;
        this.f42137eablkybsjg = switchCompat;
        this.f42138gxszxtbevo = materialTextView;
        this.f42140lqeggnwhkg = materialTextView2;
        this.f42141nufgyqmvbu = materialTextView3;
        this.f42136dxjokdxxww = materialTextView4;
        this.f42135btonecajqb = materialTextView5;
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
        return this.f42139iobyxmoadg;
    }
}
