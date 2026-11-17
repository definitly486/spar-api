package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.iobyxmoadg;
import com.google.android.material.internal.draadjrbmk;
import da.gtknphoqwx;
import da.wkgbmnqykc;
import da.zoijcleaow;
import oa.ppxfxbqfkf;
import ra.lqeggnwhkg;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final int f22723esjtqupxsv = gtknphoqwx.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f22724cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f22725iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f22726jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22727yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f22728zdlpuopuiu;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zoijcleaow.materialDividerStyle);
    }

    public int getDividerColor() {
        return this.f22726jyumaefscl;
    }

    public int getDividerInsetEnd() {
        return this.f22724cqumvgiudr;
    }

    public int getDividerInsetStart() {
        return this.f22725iwizpuwonk;
    }

    public int getDividerThickness() {
        return this.f22727yggfygwlhe;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i13;
        super.onDraw(canvas);
        boolean z13 = jhduphickx.lereixgezr(this) == 1;
        int i14 = z13 ? this.f22724cqumvgiudr : this.f22725iwizpuwonk;
        if (z13) {
            width = getWidth();
            i13 = this.f22725iwizpuwonk;
        } else {
            width = getWidth();
            i13 = this.f22724cqumvgiudr;
        }
        this.f22728zdlpuopuiu.setBounds(i14, 0, width - i13, getBottom() - getTop());
        this.f22728zdlpuopuiu.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i15 = this.f22727yggfygwlhe;
            if (i15 > 0 && measuredHeight != i15) {
                measuredHeight = i15;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i13) {
        if (this.f22726jyumaefscl != i13) {
            this.f22726jyumaefscl = i13;
            this.f22728zdlpuopuiu.crxdokpmqz(ColorStateList.valueOf(i13));
            invalidate();
        }
    }

    public void setDividerColorResource(int i13) {
        setDividerColor(iobyxmoadg.getColor(getContext(), i13));
    }

    public void setDividerInsetEnd(int i13) {
        this.f22724cqumvgiudr = i13;
    }

    public void setDividerInsetEndResource(int i13) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i13));
    }

    public void setDividerInsetStart(int i13) {
        this.f22725iwizpuwonk = i13;
    }

    public void setDividerInsetStartResource(int i13) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i13));
    }

    public void setDividerThickness(int i13) {
        if (this.f22727yggfygwlhe != i13) {
            this.f22727yggfygwlhe = i13;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i13) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i13));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22723esjtqupxsv;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        Context context2 = getContext();
        this.f22728zdlpuopuiu = new lqeggnwhkg();
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.MaterialDivider, i13, i14, new int[0]);
        this.f22727yggfygwlhe = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(wkgbmnqykc.material_divider_thickness));
        this.f22725iwizpuwonk = typedArrayDxjokdxxww.getDimensionPixelOffset(da.draadjrbmk.MaterialDivider_dividerInsetStart, 0);
        this.f22724cqumvgiudr = typedArrayDxjokdxxww.getDimensionPixelOffset(da.draadjrbmk.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayDxjokdxxww.recycle();
    }
}
