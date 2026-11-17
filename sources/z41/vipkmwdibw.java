package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class vipkmwdibw implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128428dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128429eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f128430gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128431iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final NestedScrollView f128432lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128433nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128434ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f128435wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f128436zoijcleaow;

    private vipkmwdibw(ConstraintLayout constraintLayout, Barrier barrier, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView2, AppCompatImageView appCompatImageView2, NestedScrollView nestedScrollView, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f128431iobyxmoadg = constraintLayout;
        this.f128436zoijcleaow = barrier;
        this.f128434ppxfxbqfkf = materialTextView;
        this.f128435wkgbmnqykc = appCompatImageView;
        this.f128429eablkybsjg = materialTextView2;
        this.f128430gxszxtbevo = appCompatImageView2;
        this.f128432lqeggnwhkg = nestedScrollView;
        this.f128433nufgyqmvbu = materialTextView3;
        this.f128428dxjokdxxww = materialTextView4;
    }

    public static vipkmwdibw iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.barrierControl;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = vk0.wkgbmnqykc.btnBack;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = vk0.wkgbmnqykc.btnClose;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = vk0.wkgbmnqykc.btnNext;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        i13 = vk0.wkgbmnqykc.ivOnboardingPicture;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = vk0.wkgbmnqykc.nestedScrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (nestedScrollView != null) {
                                i13 = vk0.wkgbmnqykc.tvHeader;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = vk0.wkgbmnqykc.tvInfo;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        return new vipkmwdibw((ConstraintLayout) view, barrier, materialTextView, appCompatImageView, materialTextView2, appCompatImageView2, nestedScrollView, materialTextView3, materialTextView4);
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

    public static vipkmwdibw ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_promo_onboarding_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128431iobyxmoadg;
    }
}
