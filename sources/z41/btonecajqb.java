package z41;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final View f127838btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f127839dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f127840eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f127841gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127842iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f127843lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f127844nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f127845ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f127846wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f127847zoijcleaow;

    private btonecajqb(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view) {
        this.f127842iobyxmoadg = constraintLayout;
        this.f127847zoijcleaow = materialButton;
        this.f127845ppxfxbqfkf = materialButton2;
        this.f127846wkgbmnqykc = guideline;
        this.f127840eablkybsjg = guideline2;
        this.f127841gxszxtbevo = guideline3;
        this.f127843lqeggnwhkg = guideline4;
        this.f127844nufgyqmvbu = materialTextView;
        this.f127839dxjokdxxww = materialTextView2;
        this.f127838btonecajqb = view;
    }

    public static btonecajqb iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnConfirm;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.btnIgnore;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
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
                                i13 = vk0.wkgbmnqykc.tvMessage;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = vk0.wkgbmnqykc.tvTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vCurtain))) != null) {
                                        return new btonecajqb((ConstraintLayout) view, materialButton, materialButton2, guideline, guideline2, guideline3, guideline4, materialTextView, materialTextView2, viewIobyxmoadg);
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
        return this.f127842iobyxmoadg;
    }
}
