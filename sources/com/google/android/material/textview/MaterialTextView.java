package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import da.draadjrbmk;
import oa.ppxfxbqfkf;
import oa.zoijcleaow;
import ta.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private static boolean cqumvgiudr(Context context, Resources.Theme theme, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, draadjrbmk.MaterialTextView, i13, i14);
        int iIwizpuwonk = iwizpuwonk(context, typedArrayObtainStyledAttributes, draadjrbmk.MaterialTextView_android_lineHeight, draadjrbmk.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iIwizpuwonk != -1;
    }

    private static int iwizpuwonk(Context context, TypedArray typedArray, int... iArr) {
        int iPpxfxbqfkf = -1;
        for (int i13 = 0; i13 < iArr.length && iPpxfxbqfkf < 0; i13++) {
            iPpxfxbqfkf = ppxfxbqfkf.ppxfxbqfkf(context, typedArray, iArr[i13], -1);
        }
        return iPpxfxbqfkf;
    }

    private void jyumaefscl(AttributeSet attributeSet, int i13, int i14) {
        int iYggfygwlhe;
        Context context = getContext();
        if (zdlpuopuiu(context)) {
            Resources.Theme theme = context.getTheme();
            if (cqumvgiudr(context, theme, attributeSet, i13, i14) || (iYggfygwlhe = yggfygwlhe(theme, attributeSet, i13, i14)) == -1) {
                return;
            }
            kcexrzcfyt(theme, iYggfygwlhe);
        }
    }

    private void kcexrzcfyt(Resources.Theme theme, int i13) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i13, draadjrbmk.MaterialTextAppearance);
        int iIwizpuwonk = iwizpuwonk(getContext(), typedArrayObtainStyledAttributes, draadjrbmk.MaterialTextAppearance_android_lineHeight, draadjrbmk.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iIwizpuwonk >= 0) {
            setLineHeight(iIwizpuwonk);
        }
    }

    private static int yggfygwlhe(Resources.Theme theme, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, draadjrbmk.MaterialTextView, i13, i14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(draadjrbmk.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static boolean zdlpuopuiu(Context context) {
        return zoijcleaow.zoijcleaow(context, da.zoijcleaow.textAppearanceLineHeightEnabled, true);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        if (zdlpuopuiu(context)) {
            kcexrzcfyt(context.getTheme(), i13);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i13) {
        super(iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, 0), attributeSet, i13);
        jyumaefscl(attributeSet, i13, 0);
    }
}
