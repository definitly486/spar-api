package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f21764jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f21765yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Paint f21766zdlpuopuiu;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21766zdlpuopuiu = new Paint();
        this.f21765yggfygwlhe = new zoijcleaow();
        this.f21764jyumaefscl = true;
        iobyxmoadg(context, attributeSet);
    }

    private void iobyxmoadg(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f21765yggfygwlhe.setCallback(this);
        if (attributeSet == null) {
            zoijcleaow(new iobyxmoadg.C0393iobyxmoadg().iobyxmoadg());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j9.iobyxmoadg.ShimmerFrameLayout, 0, 0);
        try {
            zoijcleaow(((typedArrayObtainStyledAttributes.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_colored, false)) ? new iobyxmoadg.ppxfxbqfkf() : new iobyxmoadg.C0393iobyxmoadg()).ppxfxbqfkf(typedArrayObtainStyledAttributes).iobyxmoadg());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21764jyumaefscl) {
            this.f21765yggfygwlhe.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21765yggfygwlhe.zoijcleaow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wkgbmnqykc();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        this.f21765yggfygwlhe.setBounds(0, 0, getWidth(), getHeight());
    }

    public void ppxfxbqfkf() {
        this.f21765yggfygwlhe.eablkybsjg();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21765yggfygwlhe;
    }

    public void wkgbmnqykc() {
        this.f21765yggfygwlhe.gxszxtbevo();
    }

    public ShimmerFrameLayout zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.f21765yggfygwlhe.wkgbmnqykc(iobyxmoadgVar);
        if (iobyxmoadgVar == null || !iobyxmoadgVar.f21778ojitshcjhn) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f21766zdlpuopuiu);
        }
        return this;
    }
}
