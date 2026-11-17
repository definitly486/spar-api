package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class zfvoamnweg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f66193dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f66194eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f66195gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f66196iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final NestedScrollView f66197lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f66198nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f66199ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f66200wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f66201zoijcleaow;

    private zfvoamnweg(ConstraintLayout constraintLayout, Barrier barrier, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView2, AppCompatImageView appCompatImageView2, NestedScrollView nestedScrollView, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f66196iobyxmoadg = constraintLayout;
        this.f66201zoijcleaow = barrier;
        this.f66199ppxfxbqfkf = materialTextView;
        this.f66200wkgbmnqykc = appCompatImageView;
        this.f66194eablkybsjg = materialTextView2;
        this.f66195gxszxtbevo = appCompatImageView2;
        this.f66197lqeggnwhkg = nestedScrollView;
        this.f66198nufgyqmvbu = materialTextView3;
        this.f66193dxjokdxxww = materialTextView4;
    }

    public static zfvoamnweg iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.barrierControl;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = pm.eablkybsjg.btnBack;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = pm.eablkybsjg.btnClose;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = pm.eablkybsjg.btnNext;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        i13 = pm.eablkybsjg.ivOnboardingPicture;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = pm.eablkybsjg.nestedScrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (nestedScrollView != null) {
                                i13 = pm.eablkybsjg.tvHeader;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = pm.eablkybsjg.tvInfo;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        return new zfvoamnweg((ConstraintLayout) view, barrier, materialTextView, appCompatImageView, materialTextView2, appCompatImageView2, nestedScrollView, materialTextView3, materialTextView4);
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

    public static zfvoamnweg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_promo_onboarding, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f66196iobyxmoadg;
    }
}
