package km0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final PopupTitlesView f59824dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f59825eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f59826gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f59827iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f59828lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f59829nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f59830ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f59831wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f59832zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MaterialTextView materialTextView, PopupTitlesView popupTitlesView) {
        this.f59827iobyxmoadg = constraintLayout;
        this.f59832zoijcleaow = constraintLayout2;
        this.f59830ppxfxbqfkf = view;
        this.f59831wkgbmnqykc = guideline;
        this.f59825eablkybsjg = guideline2;
        this.f59826gxszxtbevo = guideline3;
        this.f59828lqeggnwhkg = guideline4;
        this.f59829nufgyqmvbu = materialTextView;
        this.f59824dxjokdxxww = popupTitlesView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = jm0.zoijcleaow.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = jm0.zoijcleaow.glBottom;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = jm0.zoijcleaow.glEnd;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = jm0.zoijcleaow.glStart;
                    Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline3 != null) {
                        i13 = jm0.zoijcleaow.glTop;
                        Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline4 != null) {
                            i13 = jm0.zoijcleaow.tvPromoCode;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = jm0.zoijcleaow.vTitles;
                                PopupTitlesView popupTitlesView = (PopupTitlesView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (popupTitlesView != null) {
                                    return new ppxfxbqfkf(constraintLayout, constraintLayout, viewIobyxmoadg, guideline, guideline2, guideline3, guideline4, materialTextView, popupTitlesView);
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
        return this.f59827iobyxmoadg;
    }
}
