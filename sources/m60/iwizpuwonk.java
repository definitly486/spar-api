package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class iwizpuwonk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65614btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65615dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f65616eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65617gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialCardView f65618gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f65619iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f65620lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ConstraintLayout f65621nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65622ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f65623wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65624zoijcleaow;

    private iwizpuwonk(MaterialCardView materialCardView, MaterialButton materialButton, AppCompatImageView appCompatImageView, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65619iobyxmoadg = materialCardView;
        this.f65624zoijcleaow = materialButton;
        this.f65622ppxfxbqfkf = appCompatImageView;
        this.f65623wkgbmnqykc = materialButton2;
        this.f65616eablkybsjg = materialButton3;
        this.f65618gxszxtbevo = materialCardView2;
        this.f65620lqeggnwhkg = appCompatImageView2;
        this.f65621nufgyqmvbu = constraintLayout;
        this.f65615dxjokdxxww = materialTextView;
        this.f65614btonecajqb = materialTextView2;
        this.f65617gtknphoqwx = materialTextView3;
    }

    public static iwizpuwonk iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnCall;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.btnFeedback;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = pm.eablkybsjg.btnRoute;
                    MaterialButton materialButton3 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialButton3 != null) {
                        MaterialCardView materialCardView = (MaterialCardView) view;
                        i13 = pm.eablkybsjg.ivClock;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = pm.eablkybsjg.relativeLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (constraintLayout != null) {
                                i13 = pm.eablkybsjg.tvAddress;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = pm.eablkybsjg.tvHours;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = pm.eablkybsjg.tvType;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            return new iwizpuwonk(materialCardView, materialButton, appCompatImageView, materialButton2, materialButton3, materialCardView, appCompatImageView2, constraintLayout, materialTextView, materialTextView2, materialTextView3);
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

    public static iwizpuwonk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.dialog_special_banner_shop_details, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f65619iobyxmoadg;
    }
}
