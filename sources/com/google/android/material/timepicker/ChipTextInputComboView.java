package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.ojitshcjhn;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private TextView f23421cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TextWatcher f23422iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final EditText f23423jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final TextInputLayout f23424yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Chip f23425zdlpuopuiu;

    private class zoijcleaow extends com.google.android.material.internal.gtknphoqwx {
        private zoijcleaow() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f23425zdlpuopuiu.setText(ChipTextInputComboView.this.wkgbmnqykc("00"));
                return;
            }
            String strWkgbmnqykc = ChipTextInputComboView.this.wkgbmnqykc(editable);
            Chip chip = ChipTextInputComboView.this.f23425zdlpuopuiu;
            if (TextUtils.isEmpty(strWkgbmnqykc)) {
                strWkgbmnqykc = ChipTextInputComboView.this.wkgbmnqykc("00");
            }
            chip.setText(strWkgbmnqykc);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void nufgyqmvbu() {
        this.f23423jyumaefscl.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String wkgbmnqykc(CharSequence charSequence) {
        return TimeModel.zoijcleaow(getResources(), charSequence);
    }

    public TextInputLayout eablkybsjg() {
        return this.f23424yggfygwlhe;
    }

    public void gxszxtbevo(v1.iobyxmoadg iobyxmoadgVar) {
        jhduphickx.oipsdeybqn(this.f23425zdlpuopuiu, iobyxmoadgVar);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f23425zdlpuopuiu.isChecked();
    }

    public void lqeggnwhkg(CharSequence charSequence) {
        String strWkgbmnqykc = wkgbmnqykc(charSequence);
        this.f23425zdlpuopuiu.setText(strWkgbmnqykc);
        if (TextUtils.isEmpty(strWkgbmnqykc)) {
            return;
        }
        this.f23423jyumaefscl.removeTextChangedListener(this.f23422iwizpuwonk);
        this.f23423jyumaefscl.setText(strWkgbmnqykc);
        this.f23423jyumaefscl.addTextChangedListener(this.f23422iwizpuwonk);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nufgyqmvbu();
    }

    public void ppxfxbqfkf(InputFilter inputFilter) {
        InputFilter[] filters = this.f23423jyumaefscl.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f23423jyumaefscl.setFilters(inputFilterArr);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z13) {
        this.f23425zdlpuopuiu.setChecked(z13);
        this.f23423jyumaefscl.setVisibility(z13 ? 0 : 4);
        this.f23425zdlpuopuiu.setVisibility(z13 ? 8 : 0);
        if (isChecked()) {
            ojitshcjhn.draadjrbmk(this.f23423jyumaefscl, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23425zdlpuopuiu.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i13, Object obj) {
        this.f23425zdlpuopuiu.setTag(i13, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f23425zdlpuopuiu.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(da.nufgyqmvbu.material_time_chip, (ViewGroup) this, false);
        this.f23425zdlpuopuiu = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(da.nufgyqmvbu.material_time_input, (ViewGroup) this, false);
        this.f23424yggfygwlhe = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f23423jyumaefscl = editText;
        editText.setVisibility(4);
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f23422iwizpuwonk = zoijcleaowVar;
        editText.addTextChangedListener(zoijcleaowVar);
        nufgyqmvbu();
        addView(chip);
        addView(textInputLayout);
        this.f23421cqumvgiudr = (TextView) findViewById(da.gxszxtbevo.material_label);
        editText.setId(jhduphickx.gtknphoqwx());
        jhduphickx.dvvnrvtcbc(this.f23421cqumvgiudr, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
