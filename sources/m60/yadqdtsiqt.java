package m60;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.screen.personaldata.views.LabeledTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class yadqdtsiqt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final Guideline f66112agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final TextInputEditText f66113btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final MaterialTextView f66114cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final Group f66115draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final TextInputEditText f66116dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f66117eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final TextInputEditText f66118gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComposeView f66119gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f66120iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final LabeledTextView f66121iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final LabeledTextView f66122jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final TextInputLayout f66123kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ComposeView f66124lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final TextInputEditText f66125nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final Guideline f66126ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final TextInputLayout f66127oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f66128ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final Guideline f66129rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final TextInputLayout f66130vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final Guideline f66131wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f66132wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final LabeledTextView f66133yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final TextInputLayout f66134zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f66135zoijcleaow;

    private yadqdtsiqt(ConstraintLayout constraintLayout, Barrier barrier, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, ComposeView composeView, ComposeView composeView2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, Group group, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, LabeledTextView labeledTextView, LabeledTextView labeledTextView2, LabeledTextView labeledTextView3, MaterialTextView materialTextView2) {
        this.f66120iobyxmoadg = constraintLayout;
        this.f66135zoijcleaow = barrier;
        this.f66128ppxfxbqfkf = materialButton;
        this.f66132wkgbmnqykc = materialButton2;
        this.f66117eablkybsjg = materialTextView;
        this.f66119gxszxtbevo = composeView;
        this.f66124lqeggnwhkg = composeView2;
        this.f66125nufgyqmvbu = textInputEditText;
        this.f66116dxjokdxxww = textInputEditText2;
        this.f66113btonecajqb = textInputEditText3;
        this.f66118gtknphoqwx = textInputEditText4;
        this.f66115draadjrbmk = group;
        this.f66131wflxmlrfwp = guideline;
        this.f66112agtfadlqog = guideline2;
        this.f66126ojitshcjhn = guideline3;
        this.f66129rgvfuqvkyq = guideline4;
        this.f66130vdvldrhtss = textInputLayout;
        this.f66127oxmwwwfdhm = textInputLayout2;
        this.f66123kcexrzcfyt = textInputLayout3;
        this.f66134zdlpuopuiu = textInputLayout4;
        this.f66133yggfygwlhe = labeledTextView;
        this.f66122jyumaefscl = labeledTextView2;
        this.f66121iwizpuwonk = labeledTextView3;
        this.f66114cqumvgiudr = materialTextView2;
    }

    public static yadqdtsiqt iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.barrierEmailContent;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = pm.eablkybsjg.btnCancel;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = pm.eablkybsjg.btnSave;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = pm.eablkybsjg.btnVerifyEmail;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.clLoading;
                        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (composeView != null) {
                            i13 = pm.eablkybsjg.cvActionBar;
                            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (composeView2 != null) {
                                i13 = pm.eablkybsjg.etEmail;
                                TextInputEditText textInputEditText = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (textInputEditText != null) {
                                    i13 = pm.eablkybsjg.etFirstName;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (textInputEditText2 != null) {
                                        i13 = pm.eablkybsjg.etGender;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (textInputEditText3 != null) {
                                            i13 = pm.eablkybsjg.etLastName;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textInputEditText4 != null) {
                                                i13 = pm.eablkybsjg.groupVerifyEmail;
                                                Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (group != null) {
                                                    i13 = pm.eablkybsjg.guidelineBottom;
                                                    Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (guideline != null) {
                                                        i13 = pm.eablkybsjg.guidelineEnd;
                                                        Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (guideline2 != null) {
                                                            i13 = pm.eablkybsjg.guidelineStart;
                                                            Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (guideline3 != null) {
                                                                i13 = pm.eablkybsjg.guidelineTop;
                                                                Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                if (guideline4 != null) {
                                                                    i13 = pm.eablkybsjg.ilEmail;
                                                                    TextInputLayout textInputLayout = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                    if (textInputLayout != null) {
                                                                        i13 = pm.eablkybsjg.ilFirstName;
                                                                        TextInputLayout textInputLayout2 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                        if (textInputLayout2 != null) {
                                                                            i13 = pm.eablkybsjg.ilGender;
                                                                            TextInputLayout textInputLayout3 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                            if (textInputLayout3 != null) {
                                                                                i13 = pm.eablkybsjg.ilLastName;
                                                                                TextInputLayout textInputLayout4 = (TextInputLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                if (textInputLayout4 != null) {
                                                                                    i13 = pm.eablkybsjg.ltvBirthDate;
                                                                                    LabeledTextView labeledTextView = (LabeledTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                    if (labeledTextView != null) {
                                                                                        i13 = pm.eablkybsjg.ltvCardNumber;
                                                                                        LabeledTextView labeledTextView2 = (LabeledTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                        if (labeledTextView2 != null) {
                                                                                            i13 = pm.eablkybsjg.ltvPhone;
                                                                                            LabeledTextView labeledTextView3 = (LabeledTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                            if (labeledTextView3 != null) {
                                                                                                i13 = pm.eablkybsjg.tvEmailVerifyError;
                                                                                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                                if (materialTextView2 != null) {
                                                                                                    return new yadqdtsiqt((ConstraintLayout) view, barrier, materialButton, materialButton2, materialTextView, composeView, composeView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, group, guideline, guideline2, guideline3, guideline4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, labeledTextView, labeledTextView2, labeledTextView3, materialTextView2);
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
        return this.f66120iobyxmoadg;
    }
}
