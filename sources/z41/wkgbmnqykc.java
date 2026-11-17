package z41;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128448eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128449gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128450iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f128451ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f128452wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128453zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, View view, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128450iobyxmoadg = constraintLayout;
        this.f128453zoijcleaow = materialButton;
        this.f128451ppxfxbqfkf = materialButton2;
        this.f128452wkgbmnqykc = view;
        this.f128448eablkybsjg = materialTextView;
        this.f128449gxszxtbevo = materialTextView2;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnCar;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.btnSupermarket;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.curtain))) != null) {
                i13 = vk0.wkgbmnqykc.tvFooter;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = vk0.wkgbmnqykc.tvTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new wkgbmnqykc((ConstraintLayout) view, materialButton, materialButton2, viewIobyxmoadg, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128450iobyxmoadg;
    }
}
