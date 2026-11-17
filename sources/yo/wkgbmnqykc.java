package yo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final LinearLayout f126009dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextInputEditText f126010eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextInputEditText f126011gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f126012iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextInputLayout f126013lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final TextInputLayout f126014nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f126015ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f126016wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f126017zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, LinearLayout linearLayout) {
        this.f126012iobyxmoadg = constraintLayout;
        this.f126017zoijcleaow = materialButton;
        this.f126015ppxfxbqfkf = composeView;
        this.f126016wkgbmnqykc = composeView2;
        this.f126010eablkybsjg = textInputEditText;
        this.f126011gxszxtbevo = textInputEditText2;
        this.f126013lqeggnwhkg = textInputLayout;
        this.f126014nufgyqmvbu = textInputLayout2;
        this.f126009dxjokdxxww = linearLayout;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        int i13 = uo.zoijcleaow.btnDone;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = uo.zoijcleaow.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = uo.zoijcleaow.cvActionBar;
                ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView2 != null) {
                    i13 = uo.zoijcleaow.etEmail;
                    TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputEditText != null) {
                        i13 = uo.zoijcleaow.etPhone;
                        TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textInputEditText2 != null) {
                            i13 = uo.zoijcleaow.ilEmail;
                            TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textInputLayout != null) {
                                i13 = uo.zoijcleaow.ilPhone;
                                TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (textInputLayout2 != null) {
                                    i13 = uo.zoijcleaow.root;
                                    LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (linearLayout != null) {
                                        return new wkgbmnqykc((ConstraintLayout) view, materialButton, composeView, composeView2, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, linearLayout);
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
        return this.f126012iobyxmoadg;
    }
}
