package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.ojitshcjhn;
import da.gtknphoqwx;
import da.wkgbmnqykc;
import da.zoijcleaow;
import ka.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private boolean f23097bfopjjpdmp;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private ColorStateList f23098oipsdeybqn;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private final iobyxmoadg f23099sflfametgt;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private ColorStateList f23100zfvoamnweg;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private static final int f23096opjhrmiecq = gtknphoqwx.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private static final int[][] f23095iyctptxqzt = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zoijcleaow.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f23100zfvoamnweg == null) {
            int iWkgbmnqykc = ia.iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorSurface);
            int iWkgbmnqykc2 = ia.iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorControlActivated);
            float dimension = getResources().getDimension(wkgbmnqykc.mtrl_switch_thumb_elevation);
            if (this.f23099sflfametgt.eablkybsjg()) {
                dimension += ojitshcjhn.gxszxtbevo(this);
            }
            int iPpxfxbqfkf = this.f23099sflfametgt.ppxfxbqfkf(iWkgbmnqykc, dimension);
            int[][] iArr = f23095iyctptxqzt;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc2, 1.0f);
            iArr2[1] = iPpxfxbqfkf;
            iArr2[2] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc2, 0.38f);
            iArr2[3] = iPpxfxbqfkf;
            this.f23100zfvoamnweg = new ColorStateList(iArr, iArr2);
        }
        return this.f23100zfvoamnweg;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f23098oipsdeybqn == null) {
            int[][] iArr = f23095iyctptxqzt;
            int[] iArr2 = new int[iArr.length];
            int iWkgbmnqykc = ia.iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorSurface);
            int iWkgbmnqykc2 = ia.iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorControlActivated);
            int iWkgbmnqykc3 = ia.iobyxmoadg.wkgbmnqykc(this, zoijcleaow.colorOnSurface);
            iArr2[0] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc2, 0.54f);
            iArr2[1] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc3, 0.32f);
            iArr2[2] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc2, 0.12f);
            iArr2[3] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc, iWkgbmnqykc3, 0.12f);
            this.f23098oipsdeybqn = new ColorStateList(iArr, iArr2);
        }
        return this.f23098oipsdeybqn;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23097bfopjjpdmp && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f23097bfopjjpdmp && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z13) {
        this.f23097bfopjjpdmp = z13;
        if (z13) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f23096opjhrmiecq;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        Context context2 = getContext();
        this.f23099sflfametgt = new iobyxmoadg(context2);
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.SwitchMaterial, i13, i14, new int[0]);
        this.f23097bfopjjpdmp = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayDxjokdxxww.recycle();
    }
}
