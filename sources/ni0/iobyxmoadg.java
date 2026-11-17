package ni0;

import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatRadioButton f70116eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final RadioGroup f70117gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f70118iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatRadioButton f70119ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatRadioButton f70120wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f70121zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, View view, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, RadioGroup radioGroup) {
        this.f70118iobyxmoadg = constraintLayout;
        this.f70121zoijcleaow = view;
        this.f70119ppxfxbqfkf = appCompatRadioButton;
        this.f70120wkgbmnqykc = appCompatRadioButton2;
        this.f70116eablkybsjg = appCompatRadioButton3;
        this.f70117gxszxtbevo = radioGroup;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = mi0.ppxfxbqfkf.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = mi0.ppxfxbqfkf.rbDark;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatRadioButton != null) {
                i13 = mi0.ppxfxbqfkf.rbLight;
                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatRadioButton2 != null) {
                    i13 = mi0.ppxfxbqfkf.rbSystem;
                    AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatRadioButton3 != null) {
                        i13 = mi0.ppxfxbqfkf.rgThemeSort;
                        RadioGroup radioGroup = (RadioGroup) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (radioGroup != null) {
                            return new iobyxmoadg((ConstraintLayout) view, viewIobyxmoadg, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, radioGroup);
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
        return this.f70118iobyxmoadg;
    }
}
