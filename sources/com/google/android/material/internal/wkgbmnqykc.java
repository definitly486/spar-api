package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc extends LinearLayoutCompat {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected boolean f23003cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    boolean f23004esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f23005iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Rect f23006jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Rect f23007yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Drawable f23008zdlpuopuiu;

    public wkgbmnqykc(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f23007yggfygwlhe = new Rect();
        this.f23006jyumaefscl = new Rect();
        this.f23005iwizpuwonk = 119;
        this.f23003cqumvgiudr = true;
        this.f23004esjtqupxsv = false;
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context, attributeSet, da.draadjrbmk.ForegroundLinearLayout, i13, 0, new int[0]);
        this.f23005iwizpuwonk = typedArrayDxjokdxxww.getInt(da.draadjrbmk.ForegroundLinearLayout_android_foregroundGravity, this.f23005iwizpuwonk);
        Drawable drawable = typedArrayDxjokdxxww.getDrawable(da.draadjrbmk.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f23003cqumvgiudr = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayDxjokdxxww.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f23008zdlpuopuiu;
        if (drawable != null) {
            if (this.f23004esjtqupxsv) {
                this.f23004esjtqupxsv = false;
                Rect rect = this.f23007yggfygwlhe;
                Rect rect2 = this.f23006jyumaefscl;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f23003cqumvgiudr) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f23005iwizpuwonk, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f23008zdlpuopuiu;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23008zdlpuopuiu;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f23008zdlpuopuiu.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f23008zdlpuopuiu;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f23005iwizpuwonk;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23008zdlpuopuiu;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        this.f23004esjtqupxsv = z13 | this.f23004esjtqupxsv;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f23004esjtqupxsv = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f23008zdlpuopuiu;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f23008zdlpuopuiu);
            }
            this.f23008zdlpuopuiu = drawable;
            this.f23004esjtqupxsv = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f23005iwizpuwonk == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i13) {
        if (this.f23005iwizpuwonk != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            this.f23005iwizpuwonk = i13;
            if (i13 == 119 && this.f23008zdlpuopuiu != null) {
                this.f23008zdlpuopuiu.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23008zdlpuopuiu;
    }
}
