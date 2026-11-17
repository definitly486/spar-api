package yo;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f125967btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f125968dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextInputEditText f125969eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextInputLayout f125970gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f125971iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextInputLayout f125972lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f125973nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f125974ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextInputEditText f125975wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f125976zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f125971iobyxmoadg = constraintLayout;
        this.f125976zoijcleaow = materialButton;
        this.f125974ppxfxbqfkf = composeView;
        this.f125975wkgbmnqykc = textInputEditText;
        this.f125969eablkybsjg = textInputEditText2;
        this.f125970gxszxtbevo = textInputLayout;
        this.f125972lqeggnwhkg = textInputLayout2;
        this.f125973nufgyqmvbu = materialTextView;
        this.f125968dxjokdxxww = materialTextView2;
        this.f125967btonecajqb = materialTextView3;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = uo.zoijcleaow.btnDeleteAccount;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = uo.zoijcleaow.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = uo.zoijcleaow.etPhone;
                TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText != null) {
                    i13 = uo.zoijcleaow.etSms;
                    TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputEditText2 != null) {
                        i13 = uo.zoijcleaow.ilPhone;
                        TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textInputLayout != null) {
                            i13 = uo.zoijcleaow.ilSmsCode;
                            TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textInputLayout2 != null) {
                                i13 = uo.zoijcleaow.tvHint;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = uo.zoijcleaow.tvSmsRepeatHint;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = uo.zoijcleaow.tvSmsRepeatRequest;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            return new iobyxmoadg((ConstraintLayout) view, materialButton, composeView, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, materialTextView, materialTextView2, materialTextView3);
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
        return this.f125971iobyxmoadg;
    }
}
