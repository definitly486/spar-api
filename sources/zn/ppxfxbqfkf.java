package zn;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final PopupTitlesView f130457dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f130458eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f130459gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f130460iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f130461lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f130462nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f130463ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f130464wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f130465zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MaterialTextView materialTextView, PopupTitlesView popupTitlesView) {
        this.f130460iobyxmoadg = constraintLayout;
        this.f130465zoijcleaow = constraintLayout2;
        this.f130463ppxfxbqfkf = view;
        this.f130464wkgbmnqykc = guideline;
        this.f130458eablkybsjg = guideline2;
        this.f130459gxszxtbevo = guideline3;
        this.f130461lqeggnwhkg = guideline4;
        this.f130462nufgyqmvbu = materialTextView;
        this.f130457dxjokdxxww = popupTitlesView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = yn.zoijcleaow.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = yn.zoijcleaow.glBottom;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = yn.zoijcleaow.glEnd;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = yn.zoijcleaow.glStart;
                    Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline3 != null) {
                        i13 = yn.zoijcleaow.glTop;
                        Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline4 != null) {
                            i13 = yn.zoijcleaow.tvPromoCode;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = yn.zoijcleaow.vTitles;
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
        return this.f130460iobyxmoadg;
    }
}
