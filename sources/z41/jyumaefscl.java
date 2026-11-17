package z41;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class jyumaefscl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final Guideline f128183btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final TextInputLayout f128184draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Guideline f128185dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextInputEditText f128186eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final TextInputLayout f128187gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextInputEditText f128188gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128189iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f128190lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f128191nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f128192ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final TextInputLayout f128193wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextInputEditText f128194wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128195zoijcleaow;

    private jyumaefscl(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.f128189iobyxmoadg = constraintLayout;
        this.f128195zoijcleaow = materialButton;
        this.f128192ppxfxbqfkf = composeView;
        this.f128194wkgbmnqykc = textInputEditText;
        this.f128186eablkybsjg = textInputEditText2;
        this.f128188gxszxtbevo = textInputEditText3;
        this.f128190lqeggnwhkg = guideline;
        this.f128191nufgyqmvbu = guideline2;
        this.f128185dxjokdxxww = guideline3;
        this.f128183btonecajqb = guideline4;
        this.f128187gtknphoqwx = textInputLayout;
        this.f128184draadjrbmk = textInputLayout2;
        this.f128193wflxmlrfwp = textInputLayout3;
    }

    public static jyumaefscl iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btSave;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = vk0.wkgbmnqykc.etFirstName;
                TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText != null) {
                    i13 = vk0.wkgbmnqykc.etLastName;
                    TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputEditText2 != null) {
                        i13 = vk0.wkgbmnqykc.etPhone;
                        TextInputEditText textInputEditText3 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textInputEditText3 != null) {
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
                                            i13 = vk0.wkgbmnqykc.ilFirstName;
                                            TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textInputLayout != null) {
                                                i13 = vk0.wkgbmnqykc.ilLastName;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (textInputLayout2 != null) {
                                                    i13 = vk0.wkgbmnqykc.ilPhone;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (textInputLayout3 != null) {
                                                        return new jyumaefscl((ConstraintLayout) view, materialButton, composeView, textInputEditText, textInputEditText2, textInputEditText3, guideline, guideline2, guideline3, guideline4, textInputLayout, textInputLayout2, textInputLayout3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128189iobyxmoadg;
    }
}
