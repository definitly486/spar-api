package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f23513iwizpuwonk = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final TimeModel f23514jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ChipTextInputComboView f23515yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ChipTextInputComboView f23516zdlpuopuiu;

    dxjokdxxww(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f23516zdlpuopuiu = chipTextInputComboView;
        this.f23515yggfygwlhe = chipTextInputComboView2;
        this.f23514jyumaefscl = timeModel;
    }

    private boolean eablkybsjg(int i13, KeyEvent keyEvent, EditText editText) {
        if (i13 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            ppxfxbqfkf(10);
            return true;
        }
        zoijcleaow(editText);
        return false;
    }

    private void ppxfxbqfkf(int i13) {
        this.f23515yggfygwlhe.setChecked(i13 == 12);
        this.f23516zdlpuopuiu.setChecked(i13 == 10);
        this.f23514jyumaefscl.f23492esjtqupxsv = i13;
    }

    private boolean wkgbmnqykc(int i13, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i13 >= 7 && i13 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            ppxfxbqfkf(12);
            return true;
        }
        zoijcleaow(editText);
        return false;
    }

    private void zoijcleaow(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    public void iobyxmoadg() {
        TextInputLayout textInputLayoutEablkybsjg = this.f23516zdlpuopuiu.eablkybsjg();
        TextInputLayout textInputLayoutEablkybsjg2 = this.f23515yggfygwlhe.eablkybsjg();
        EditText editText = textInputLayoutEablkybsjg.getEditText();
        EditText editText2 = textInputLayoutEablkybsjg2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
        boolean z13 = i13 == 5;
        if (z13) {
            ppxfxbqfkf(12);
        }
        return z13;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (this.f23513iwizpuwonk) {
            return false;
        }
        this.f23513iwizpuwonk = true;
        EditText editText = (EditText) view;
        boolean zEablkybsjg = this.f23514jyumaefscl.f23492esjtqupxsv == 12 ? eablkybsjg(i13, keyEvent, editText) : wkgbmnqykc(i13, keyEvent, editText);
        this.f23513iwizpuwonk = false;
        return zEablkybsjg;
    }
}
