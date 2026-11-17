package km0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import ru.myspar.proloyalty.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final PopupTitlesView f59833eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f59834iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f59835ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f59836wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f59837zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, View view, PopupTitlesView popupTitlesView) {
        this.f59834iobyxmoadg = constraintLayout;
        this.f59837zoijcleaow = materialButton;
        this.f59835ppxfxbqfkf = constraintLayout2;
        this.f59836wkgbmnqykc = view;
        this.f59833eablkybsjg = popupTitlesView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        int i13 = jm0.zoijcleaow.btnGoTo;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = jm0.zoijcleaow.curtain;
            View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
            if (viewIobyxmoadg != null) {
                i13 = jm0.zoijcleaow.vTitles;
                PopupTitlesView popupTitlesView = (PopupTitlesView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (popupTitlesView != null) {
                    return new wkgbmnqykc(constraintLayout, materialButton, constraintLayout, viewIobyxmoadg, popupTitlesView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59834iobyxmoadg;
    }
}
