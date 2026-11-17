package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.vdvldrhtss;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ppxfxbqfkf;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.jyumaefscl;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends vdvldrhtss {
    @Override // androidx.appcompat.app.vdvldrhtss
    protected AppCompatCheckBox eablkybsjg(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.vdvldrhtss
    protected AppCompatRadioButton gtknphoqwx(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.vdvldrhtss
    protected AppCompatTextView ojitshcjhn(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.vdvldrhtss
    protected ppxfxbqfkf ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        return new jyumaefscl(context, attributeSet);
    }

    @Override // androidx.appcompat.app.vdvldrhtss
    protected AppCompatButton wkgbmnqykc(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
