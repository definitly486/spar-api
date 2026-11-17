package z41;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class zynmafqrjb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128580btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128581draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128582dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f128583eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128584gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f128585gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128586iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f128587lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128588nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f128589ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f128590wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f128591zoijcleaow;

    private zynmafqrjb(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f128586iobyxmoadg = constraintLayout;
        this.f128591zoijcleaow = constraintLayout2;
        this.f128589ppxfxbqfkf = view;
        this.f128590wkgbmnqykc = guideline;
        this.f128583eablkybsjg = guideline2;
        this.f128585gxszxtbevo = guideline3;
        this.f128587lqeggnwhkg = guideline4;
        this.f128588nufgyqmvbu = materialTextView;
        this.f128582dxjokdxxww = materialTextView2;
        this.f128580btonecajqb = materialTextView3;
        this.f128584gtknphoqwx = materialTextView4;
        this.f128581draadjrbmk = materialTextView5;
    }

    public static zynmafqrjb iobyxmoadg(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = vk0.wkgbmnqykc.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = vk0.wkgbmnqykc.glBottom;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = vk0.wkgbmnqykc.glEnd;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = vk0.wkgbmnqykc.glStart;
                    Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline3 != null) {
                        i13 = vk0.wkgbmnqykc.glTop;
                        Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline4 != null) {
                            i13 = vk0.wkgbmnqykc.tvDeliveryPrice;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = vk0.wkgbmnqykc.tvDeliveryTime;
                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView2 != null) {
                                    i13 = vk0.wkgbmnqykc.tvRestaurantAddress;
                                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView3 != null) {
                                        i13 = vk0.wkgbmnqykc.tvTitle;
                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView4 != null) {
                                            i13 = vk0.wkgbmnqykc.tvWorkingHours;
                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView5 != null) {
                                                return new zynmafqrjb(constraintLayout, constraintLayout, viewIobyxmoadg, guideline, guideline2, guideline3, guideline4, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                                            }
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
        return this.f128586iobyxmoadg;
    }
}
