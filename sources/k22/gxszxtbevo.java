package k22;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import ru.myspar.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wflxmlrfwp f53566eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScanGoProductCounter f53567gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53568iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f53569ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f53570wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f53571zoijcleaow;

    private gxszxtbevo(ConstraintLayout constraintLayout, MaterialButton materialButton, Guideline guideline, Guideline guideline2, wflxmlrfwp wflxmlrfwpVar, ScanGoProductCounter scanGoProductCounter) {
        this.f53568iobyxmoadg = constraintLayout;
        this.f53571zoijcleaow = materialButton;
        this.f53569ppxfxbqfkf = guideline;
        this.f53570wkgbmnqykc = guideline2;
        this.f53566eablkybsjg = wflxmlrfwpVar;
        this.f53567gxszxtbevo = scanGoProductCounter;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = s12.zoijcleaow.btnCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
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
                        return new gxszxtbevo((ConstraintLayout) view, materialButton, guideline, guideline2, wflxmlrfwpVarIobyxmoadg, scanGoProductCounter);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53568iobyxmoadg;
    }
}
