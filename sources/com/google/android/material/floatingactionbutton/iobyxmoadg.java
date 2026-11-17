package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.wkgbmnqykc;
import ra.draadjrbmk;
import ra.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg extends Drawable {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f22758btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f22759draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f22760dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f22762gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    float f22766nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private gtknphoqwx f22767ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private ColorStateList f22769rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f22770wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f22772zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f22764iobyxmoadg = draadjrbmk.gtknphoqwx();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Path f22768ppxfxbqfkf = new Path();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f22771wkgbmnqykc = new Rect();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final RectF f22761eablkybsjg = new RectF();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final RectF f22763gxszxtbevo = new RectF();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f22765lqeggnwhkg = new zoijcleaow();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f22757agtfadlqog = true;

    private class zoijcleaow extends Drawable.ConstantState {
        private zoijcleaow() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return iobyxmoadg.this;
        }
    }

    iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        this.f22767ojitshcjhn = gtknphoqwxVar;
        Paint paint = new Paint(1);
        this.f22772zoijcleaow = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader iobyxmoadg() {
        Rect rect = this.f22771wkgbmnqykc;
        copyBounds(rect);
        float fHeight = this.f22766nufgyqmvbu / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{j1.ppxfxbqfkf.lqeggnwhkg(this.f22760dxjokdxxww, this.f22770wflxmlrfwp), j1.ppxfxbqfkf.lqeggnwhkg(this.f22758btonecajqb, this.f22770wflxmlrfwp), j1.ppxfxbqfkf.lqeggnwhkg(j1.ppxfxbqfkf.gtknphoqwx(this.f22758btonecajqb, 0), this.f22770wflxmlrfwp), j1.ppxfxbqfkf.lqeggnwhkg(j1.ppxfxbqfkf.gtknphoqwx(this.f22759draadjrbmk, 0), this.f22770wflxmlrfwp), j1.ppxfxbqfkf.lqeggnwhkg(this.f22759draadjrbmk, this.f22770wflxmlrfwp), j1.ppxfxbqfkf.lqeggnwhkg(this.f22762gtknphoqwx, this.f22770wflxmlrfwp)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f22757agtfadlqog) {
            this.f22772zoijcleaow.setShader(iobyxmoadg());
            this.f22757agtfadlqog = false;
        }
        float strokeWidth = this.f22772zoijcleaow.getStrokeWidth() / 2.0f;
        copyBounds(this.f22771wkgbmnqykc);
        this.f22761eablkybsjg.set(this.f22771wkgbmnqykc);
        float fMin = Math.min(this.f22767ojitshcjhn.oxmwwwfdhm().iobyxmoadg(zoijcleaow()), this.f22761eablkybsjg.width() / 2.0f);
        if (this.f22767ojitshcjhn.yggfygwlhe(zoijcleaow())) {
            this.f22761eablkybsjg.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f22761eablkybsjg, fMin, fMin, this.f22772zoijcleaow);
        }
    }

    void eablkybsjg(int i13, int i14, int i15, int i16) {
        this.f22760dxjokdxxww = i13;
        this.f22758btonecajqb = i14;
        this.f22762gtknphoqwx = i15;
        this.f22759draadjrbmk = i16;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f22765lqeggnwhkg;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f22766nufgyqmvbu > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f22767ojitshcjhn.yggfygwlhe(zoijcleaow())) {
            outline.setRoundRect(getBounds(), this.f22767ojitshcjhn.oxmwwwfdhm().iobyxmoadg(zoijcleaow()));
        } else {
            copyBounds(this.f22771wkgbmnqykc);
            this.f22761eablkybsjg.set(this.f22771wkgbmnqykc);
            this.f22764iobyxmoadg.wkgbmnqykc(this.f22767ojitshcjhn, 1.0f, this.f22761eablkybsjg, this.f22768ppxfxbqfkf);
            wkgbmnqykc.btonecajqb(outline, this.f22768ppxfxbqfkf);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f22767ojitshcjhn.yggfygwlhe(zoijcleaow())) {
            return true;
        }
        int iRound = Math.round(this.f22766nufgyqmvbu);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this.f22767ojitshcjhn = gtknphoqwxVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f22769rgvfuqvkyq;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f22757agtfadlqog = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f22769rgvfuqvkyq;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f22770wflxmlrfwp)) != this.f22770wflxmlrfwp) {
            this.f22757agtfadlqog = true;
            this.f22770wflxmlrfwp = colorForState;
        }
        if (this.f22757agtfadlqog) {
            invalidateSelf();
        }
        return this.f22757agtfadlqog;
    }

    void ppxfxbqfkf(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f22770wflxmlrfwp = colorStateList.getColorForState(getState(), this.f22770wflxmlrfwp);
        }
        this.f22769rgvfuqvkyq = colorStateList;
        this.f22757agtfadlqog = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f22772zoijcleaow.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f22772zoijcleaow.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void wkgbmnqykc(float f13) {
        if (this.f22766nufgyqmvbu != f13) {
            this.f22766nufgyqmvbu = f13;
            this.f22772zoijcleaow.setStrokeWidth(f13 * 1.3333f);
            this.f22757agtfadlqog = true;
            invalidateSelf();
        }
    }

    protected RectF zoijcleaow() {
        this.f22763gxszxtbevo.set(getBounds());
        return this.f22763gxszxtbevo;
    }
}
