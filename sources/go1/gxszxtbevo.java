package go1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wflxmlrfwp f38033eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScanGoProductCounter f38034gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38035iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f38036ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f38037wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f38038zoijcleaow;

    private gxszxtbevo(ConstraintLayout constraintLayout, MaterialButton materialButton, Guideline guideline, Guideline guideline2, wflxmlrfwp wflxmlrfwpVar, ScanGoProductCounter scanGoProductCounter) {
        this.f38035iobyxmoadg = constraintLayout;
        this.f38038zoijcleaow = materialButton;
        this.f38036ppxfxbqfkf = guideline;
        this.f38037wkgbmnqykc = guideline2;
        this.f38033eablkybsjg = wflxmlrfwpVar;
        this.f38034gxszxtbevo = scanGoProductCounter;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = on1.zoijcleaow.btnCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = on1.zoijcleaow.glEnd;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = on1.zoijcleaow.glStart;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.includeContentProduct))) != null) {
                    wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg);
                    i13 = on1.zoijcleaow.productCounter;
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
        return this.f38035iobyxmoadg;
    }
}
