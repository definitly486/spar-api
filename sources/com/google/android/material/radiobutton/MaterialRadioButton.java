package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.ppxfxbqfkf;
import com.google.android.material.internal.draadjrbmk;
import da.gtknphoqwx;
import da.zoijcleaow;
import ia.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int f23015lereixgezr = gtknphoqwx.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int[][] f23016pmvmpeiblj = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private ColorStateList f23017cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f23018esjtqupxsv;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zoijcleaow.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23017cqumvgiudr == null) {
            int iWkgbmnqykc = iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorControlActivated);
            int iWkgbmnqykc2 = iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorOnSurface);
            int iWkgbmnqykc3 = iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorSurface);
            int[][] iArr = f23016pmvmpeiblj;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc, 1.0f);
            iArr2[1] = iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc2, 0.54f);
            iArr2[2] = iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc2, 0.38f);
            iArr2[3] = iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc2, 0.38f);
            this.f23017cqumvgiudr = new ColorStateList(iArr, iArr2);
        }
        return this.f23017cqumvgiudr;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23018esjtqupxsv && ppxfxbqfkf.zoijcleaow(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z13) {
        this.f23018esjtqupxsv = z13;
        if (z13) {
            ppxfxbqfkf.wkgbmnqykc(this, getMaterialThemeColorsTintList());
        } else {
            ppxfxbqfkf.wkgbmnqykc(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f23015lereixgezr;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        Context context2 = getContext();
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.MaterialRadioButton, i13, i14, new int[0]);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialRadioButton_buttonTint)) {
            ppxfxbqfkf.wkgbmnqykc(this, oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.MaterialRadioButton_buttonTint));
        }
        this.f23018esjtqupxsv = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayDxjokdxxww.recycle();
    }
}
