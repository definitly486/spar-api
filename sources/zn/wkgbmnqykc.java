package zn;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import ru.myspar.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final PopupTitlesView f130466eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f130467iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f130468ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f130469wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f130470zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, View view, PopupTitlesView popupTitlesView) {
        this.f130467iobyxmoadg = constraintLayout;
        this.f130470zoijcleaow = materialButton;
        this.f130468ppxfxbqfkf = constraintLayout2;
        this.f130469wkgbmnqykc = view;
        this.f130466eablkybsjg = popupTitlesView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        int i13 = yn.zoijcleaow.btnGoTo;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = yn.zoijcleaow.curtain;
            View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
            if (viewIobyxmoadg != null) {
                i13 = yn.zoijcleaow.vTitles;
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
        return this.f130467iobyxmoadg;
    }
}
