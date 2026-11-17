package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65465dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f65466eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f65467gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65468iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f65469lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65470nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65471ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f65472wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65473zoijcleaow;

    private dxjokdxxww(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageView appCompatImageView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65468iobyxmoadg = constraintLayout;
        this.f65473zoijcleaow = materialButton;
        this.f65471ppxfxbqfkf = appCompatImageView;
        this.f65472wkgbmnqykc = guideline;
        this.f65466eablkybsjg = guideline2;
        this.f65467gxszxtbevo = guideline3;
        this.f65469lqeggnwhkg = guideline4;
        this.f65470nufgyqmvbu = materialTextView;
        this.f65465dxjokdxxww = materialTextView2;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnApply;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.glBottom;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = pm.eablkybsjg.glEnd;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = pm.eablkybsjg.glStart;
                        Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline3 != null) {
                            i13 = pm.eablkybsjg.glTop;
                            Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline4 != null) {
                                i13 = pm.eablkybsjg.tvReadAgreements;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = pm.eablkybsjg.tvTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        return new dxjokdxxww((ConstraintLayout) view, materialButton, appCompatImageView, guideline, guideline2, guideline3, guideline4, materialTextView, materialTextView2);
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

    public static dxjokdxxww ppxfxbqfkf(LayoutInflater layoutInflater) {
        return wkgbmnqykc(layoutInflater, null, false);
    }

    public static dxjokdxxww wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.dialog_fragment_iqos_agreements, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65468iobyxmoadg;
    }
}
