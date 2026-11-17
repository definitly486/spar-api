package m60;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class pmvmpeiblj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final Guideline f65892btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final TextInputLayout f65893draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Guideline f65894dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextInputEditText f65895eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final TextInputLayout f65896gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextInputEditText f65897gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65898iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f65899lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f65900nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65901ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final TextInputLayout f65902wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextInputEditText f65903wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65904zoijcleaow;

    private pmvmpeiblj(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.f65898iobyxmoadg = constraintLayout;
        this.f65904zoijcleaow = materialButton;
        this.f65901ppxfxbqfkf = composeView;
        this.f65903wkgbmnqykc = textInputEditText;
        this.f65895eablkybsjg = textInputEditText2;
        this.f65897gxszxtbevo = textInputEditText3;
        this.f65899lqeggnwhkg = guideline;
        this.f65900nufgyqmvbu = guideline2;
        this.f65894dxjokdxxww = guideline3;
        this.f65892btonecajqb = guideline4;
        this.f65896gtknphoqwx = textInputLayout;
        this.f65893draadjrbmk = textInputLayout2;
        this.f65902wflxmlrfwp = textInputLayout3;
    }

    public static pmvmpeiblj iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btSave;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = pm.eablkybsjg.etFirstName;
                TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText != null) {
                    i13 = pm.eablkybsjg.etLastName;
                    TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputEditText2 != null) {
                        i13 = pm.eablkybsjg.etPhone;
                        TextInputEditText textInputEditText3 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textInputEditText3 != null) {
                            i13 = pm.eablkybsjg.glBottom;
                            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline != null) {
                                i13 = pm.eablkybsjg.glEnd;
                                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (guideline2 != null) {
                                    i13 = pm.eablkybsjg.glStart;
                                    Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (guideline3 != null) {
                                        i13 = pm.eablkybsjg.glTop;
                                        Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (guideline4 != null) {
                                            i13 = pm.eablkybsjg.ilFirstName;
                                            TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textInputLayout != null) {
                                                i13 = pm.eablkybsjg.ilLastName;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (textInputLayout2 != null) {
                                                    i13 = pm.eablkybsjg.ilPhone;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (textInputLayout3 != null) {
                                                        return new pmvmpeiblj((ConstraintLayout) view, materialButton, composeView, textInputEditText, textInputEditText2, textInputEditText3, guideline, guideline2, guideline3, guideline4, textInputLayout, textInputLayout2, textInputLayout3);
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
        return this.f65898iobyxmoadg;
    }
}
