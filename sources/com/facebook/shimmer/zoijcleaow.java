package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends Drawable {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ValueAnimator f21789eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private com.facebook.shimmer.iobyxmoadg f21790gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f21791iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rect f21792ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Matrix f21793wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f21794zoijcleaow;

    class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {
        iobyxmoadg() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            zoijcleaow.this.invalidateSelf();
        }
    }

    public zoijcleaow() {
        Paint paint = new Paint();
        this.f21794zoijcleaow = paint;
        this.f21792ppxfxbqfkf = new Rect();
        this.f21793wkgbmnqykc = new Matrix();
        paint.setAntiAlias(true);
    }

    private void lqeggnwhkg() {
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (iobyxmoadgVar = this.f21790gxszxtbevo) == null) {
            return;
        }
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(iWidth);
        int iIobyxmoadg = this.f21790gxszxtbevo.iobyxmoadg(iHeight);
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar2 = this.f21790gxszxtbevo;
        boolean z13 = true;
        if (iobyxmoadgVar2.f21776lqeggnwhkg != 1) {
            int i13 = iobyxmoadgVar2.f21784wkgbmnqykc;
            if (i13 != 1 && i13 != 3) {
                z13 = false;
            }
            if (z13) {
                iWkgbmnqykc = 0;
            }
            if (!z13) {
                iIobyxmoadg = 0;
            }
            float f13 = iIobyxmoadg;
            com.facebook.shimmer.iobyxmoadg iobyxmoadgVar3 = this.f21790gxszxtbevo;
            radialGradient = new LinearGradient(0.0f, 0.0f, iWkgbmnqykc, f13, iobyxmoadgVar3.f21787zoijcleaow, iobyxmoadgVar3.f21774iobyxmoadg, Shader.TileMode.CLAMP);
        } else {
            float f14 = iIobyxmoadg / 2.0f;
            float fMax = (float) (((double) Math.max(iWkgbmnqykc, iIobyxmoadg)) / Math.sqrt(2.0d));
            com.facebook.shimmer.iobyxmoadg iobyxmoadgVar4 = this.f21790gxszxtbevo;
            radialGradient = new RadialGradient(iWkgbmnqykc / 2.0f, f14, fMax, iobyxmoadgVar4.f21787zoijcleaow, iobyxmoadgVar4.f21774iobyxmoadg, Shader.TileMode.CLAMP);
        }
        this.f21794zoijcleaow.setShader(radialGradient);
    }

    private void nufgyqmvbu() {
        boolean zIsStarted;
        if (this.f21790gxszxtbevo == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f21789eablkybsjg;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f21789eablkybsjg.cancel();
            this.f21789eablkybsjg.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar = this.f21790gxszxtbevo;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (iobyxmoadgVar.f21785yggfygwlhe / iobyxmoadgVar.f21786zdlpuopuiu) + 1.0f);
        this.f21789eablkybsjg = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f21790gxszxtbevo.f21775kcexrzcfyt);
        this.f21789eablkybsjg.setRepeatCount(this.f21790gxszxtbevo.f21779oxmwwwfdhm);
        ValueAnimator valueAnimator2 = this.f21789eablkybsjg;
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar2 = this.f21790gxszxtbevo;
        valueAnimator2.setDuration(iobyxmoadgVar2.f21786zdlpuopuiu + iobyxmoadgVar2.f21785yggfygwlhe);
        this.f21789eablkybsjg.addUpdateListener(this.f21791iobyxmoadg);
        if (zIsStarted) {
            this.f21789eablkybsjg.start();
        }
    }

    private float ppxfxbqfkf(float f13, float f14, float f15) {
        return f13 + ((f14 - f13) * f15);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fPpxfxbqfkf;
        float fPpxfxbqfkf2;
        if (this.f21790gxszxtbevo == null || this.f21794zoijcleaow.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f21790gxszxtbevo.f21767agtfadlqog));
        float fHeight = this.f21792ppxfxbqfkf.height() + (this.f21792ppxfxbqfkf.width() * fTan);
        float fWidth = this.f21792ppxfxbqfkf.width() + (fTan * this.f21792ppxfxbqfkf.height());
        ValueAnimator valueAnimator = this.f21789eablkybsjg;
        float f13 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i13 = this.f21790gxszxtbevo.f21784wkgbmnqykc;
        if (i13 != 1) {
            if (i13 == 2) {
                fPpxfxbqfkf2 = ppxfxbqfkf(fWidth, -fWidth, animatedFraction);
            } else if (i13 != 3) {
                fPpxfxbqfkf2 = ppxfxbqfkf(-fWidth, fWidth, animatedFraction);
            } else {
                fPpxfxbqfkf = ppxfxbqfkf(fHeight, -fHeight, animatedFraction);
            }
            f13 = fPpxfxbqfkf2;
            fPpxfxbqfkf = 0.0f;
        } else {
            fPpxfxbqfkf = ppxfxbqfkf(-fHeight, fHeight, animatedFraction);
        }
        this.f21793wkgbmnqykc.reset();
        this.f21793wkgbmnqykc.setRotate(this.f21790gxszxtbevo.f21767agtfadlqog, this.f21792ppxfxbqfkf.width() / 2.0f, this.f21792ppxfxbqfkf.height() / 2.0f);
        this.f21793wkgbmnqykc.postTranslate(f13, fPpxfxbqfkf);
        this.f21794zoijcleaow.getShader().setLocalMatrix(this.f21793wkgbmnqykc);
        canvas.drawRect(this.f21792ppxfxbqfkf, this.f21794zoijcleaow);
    }

    public void eablkybsjg() {
        if (this.f21789eablkybsjg == null || iobyxmoadg() || getCallback() == null) {
            return;
        }
        this.f21789eablkybsjg.start();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar = this.f21790gxszxtbevo;
        return (iobyxmoadgVar == null || !(iobyxmoadgVar.f21778ojitshcjhn || iobyxmoadgVar.f21782vdvldrhtss)) ? -1 : -3;
    }

    public void gxszxtbevo() {
        if (this.f21789eablkybsjg == null || !iobyxmoadg()) {
            return;
        }
        this.f21789eablkybsjg.cancel();
    }

    public boolean iobyxmoadg() {
        ValueAnimator valueAnimator = this.f21789eablkybsjg;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21792ppxfxbqfkf.set(0, 0, rect.width(), rect.height());
        lqeggnwhkg();
        zoijcleaow();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void wkgbmnqykc(com.facebook.shimmer.iobyxmoadg iobyxmoadgVar) {
        this.f21790gxszxtbevo = iobyxmoadgVar;
        if (iobyxmoadgVar != null) {
            this.f21794zoijcleaow.setXfermode(new PorterDuffXfermode(this.f21790gxszxtbevo.f21782vdvldrhtss ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        lqeggnwhkg();
        nufgyqmvbu();
        invalidateSelf();
    }

    void zoijcleaow() {
        com.facebook.shimmer.iobyxmoadg iobyxmoadgVar;
        ValueAnimator valueAnimator = this.f21789eablkybsjg;
        if (valueAnimator == null || valueAnimator.isStarted() || (iobyxmoadgVar = this.f21790gxszxtbevo) == null || !iobyxmoadgVar.f21781rgvfuqvkyq || getCallback() == null) {
            return;
        }
        this.f21789eablkybsjg.start();
    }
}
