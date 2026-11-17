package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
class esjtqupxsv extends kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f23291eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private EditText f23292gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final View.OnClickListener f23293lqeggnwhkg;

    esjtqupxsv(oxmwwwfdhm oxmwwwfdhmVar, int i13) {
        super(oxmwwwfdhmVar);
        this.f23291eablkybsjg = da.eablkybsjg.design_password_eye;
        this.f23293lqeggnwhkg = new View.OnClickListener() { // from class: com.google.android.material.textfield.cqumvgiudr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23287zdlpuopuiu.esjtqupxsv(view);
            }
        };
        if (i13 != 0) {
            this.f23291eablkybsjg = i13;
        }
    }

    private static boolean cqumvgiudr(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void esjtqupxsv(View view) {
        EditText editText = this.f23292gxszxtbevo;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (iwizpuwonk()) {
            this.f23292gxszxtbevo.setTransformationMethod(null);
        } else {
            this.f23292gxszxtbevo.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f23292gxszxtbevo.setSelection(selectionEnd);
        }
        oxmwwwfdhm();
    }

    private boolean iwizpuwonk() {
        EditText editText = this.f23292gxszxtbevo;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void agtfadlqog(EditText editText) {
        this.f23292gxszxtbevo = editText;
        oxmwwwfdhm();
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean draadjrbmk() {
        return true;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    View.OnClickListener gxszxtbevo() {
        return this.f23293lqeggnwhkg;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void kcexrzcfyt() {
        if (cqumvgiudr(this.f23292gxszxtbevo)) {
            this.f23292gxszxtbevo.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int ppxfxbqfkf() {
        return da.btonecajqb.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    boolean wflxmlrfwp() {
        return !iwizpuwonk();
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    int wkgbmnqykc() {
        return this.f23291eablkybsjg;
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void yggfygwlhe() {
        EditText editText = this.f23292gxszxtbevo;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.kcexrzcfyt
    void zoijcleaow(CharSequence charSequence, int i13, int i14, int i15) {
        oxmwwwfdhm();
    }
}
