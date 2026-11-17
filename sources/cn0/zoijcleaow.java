package cn0;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bn0.ppxfxbqfkf;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f20223btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f20224dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextInputEditText f20225eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextInputLayout f20226gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f20227iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextInputLayout f20228lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f20229nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f20230ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextInputEditText f20231wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f20232zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f20227iobyxmoadg = constraintLayout;
        this.f20232zoijcleaow = materialButton;
        this.f20230ppxfxbqfkf = composeView;
        this.f20231wkgbmnqykc = textInputEditText;
        this.f20225eablkybsjg = textInputEditText2;
        this.f20226gxszxtbevo = textInputLayout;
        this.f20228lqeggnwhkg = textInputLayout2;
        this.f20229nufgyqmvbu = materialTextView;
        this.f20224dxjokdxxww = materialTextView2;
        this.f20223btonecajqb = materialTextView3;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.btnDeleteAccount;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = ppxfxbqfkf.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = ppxfxbqfkf.etPhone;
                TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText != null) {
                    i13 = ppxfxbqfkf.etSms;
                    TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputEditText2 != null) {
                        i13 = ppxfxbqfkf.ilPhone;
                        TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textInputLayout != null) {
                            i13 = ppxfxbqfkf.ilSmsCode;
                            TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textInputLayout2 != null) {
                                i13 = ppxfxbqfkf.tvHint;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = ppxfxbqfkf.tvSmsRepeatHint;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = ppxfxbqfkf.tvSmsRepeatRequest;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            return new zoijcleaow((ConstraintLayout) view, materialButton, composeView, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, materialTextView, materialTextView2, materialTextView3);
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
        return this.f20227iobyxmoadg;
    }
}
