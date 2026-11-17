package nf1;

import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatRadioButton f70022eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final RadioGroup f70023gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f70024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatRadioButton f70025ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatRadioButton f70026wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f70027zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, View view, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, RadioGroup radioGroup) {
        this.f70024iobyxmoadg = constraintLayout;
        this.f70027zoijcleaow = view;
        this.f70025ppxfxbqfkf = appCompatRadioButton;
        this.f70026wkgbmnqykc = appCompatRadioButton2;
        this.f70022eablkybsjg = appCompatRadioButton3;
        this.f70023gxszxtbevo = radioGroup;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = mf1.ppxfxbqfkf.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = mf1.ppxfxbqfkf.rbDark;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatRadioButton != null) {
                i13 = mf1.ppxfxbqfkf.rbLight;
                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatRadioButton2 != null) {
                    i13 = mf1.ppxfxbqfkf.rbSystem;
                    AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatRadioButton3 != null) {
                        i13 = mf1.ppxfxbqfkf.rgThemeSort;
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
        return this.f70024iobyxmoadg;
    }
}
