package k22;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wflxmlrfwp f53572eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScanGoProductCounter f53573gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53574iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f53575lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f53576ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f53577wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f53578zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, View view, Guideline guideline, Guideline guideline2, wflxmlrfwp wflxmlrfwpVar, ScanGoProductCounter scanGoProductCounter, MaterialTextView materialTextView) {
        this.f53574iobyxmoadg = constraintLayout;
        this.f53578zoijcleaow = view;
        this.f53576ppxfxbqfkf = guideline;
        this.f53577wkgbmnqykc = guideline2;
        this.f53572eablkybsjg = wflxmlrfwpVar;
        this.f53573gxszxtbevo = scanGoProductCounter;
        this.f53575lqeggnwhkg = materialTextView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = s12.zoijcleaow.curtain;
        View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg2 != null) {
            i13 = s12.zoijcleaow.glEnd;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = s12.zoijcleaow.glStart;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.includeContentProduct))) != null) {
                    wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg);
                    i13 = s12.zoijcleaow.productCounter;
                    ScanGoProductCounter scanGoProductCounter = (ScanGoProductCounter) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (scanGoProductCounter != null) {
                        i13 = s12.zoijcleaow.tvFirstMessage;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            return new iobyxmoadg((ConstraintLayout) view, viewIobyxmoadg2, guideline, guideline2, wflxmlrfwpVarIobyxmoadg, scanGoProductCounter, materialTextView);
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
        return this.f53574iobyxmoadg;
    }
}
