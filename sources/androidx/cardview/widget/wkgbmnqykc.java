package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class wkgbmnqykc extends Drawable {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ColorStateList f4214btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private PorterDuffColorFilter f4215dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f4216eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f4219iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ColorStateList f4221nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final RectF f4222ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f4223wkgbmnqykc;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f4218gxszxtbevo = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f4220lqeggnwhkg = true;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private PorterDuff.Mode f4217gtknphoqwx = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f4224zoijcleaow = new Paint(5);

    wkgbmnqykc(ColorStateList colorStateList, float f13) {
        this.f4219iobyxmoadg = f13;
        eablkybsjg(colorStateList);
        this.f4222ppxfxbqfkf = new RectF();
        this.f4223wkgbmnqykc = new Rect();
    }

    private void dxjokdxxww(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4222ppxfxbqfkf.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f4223wkgbmnqykc.set(rect);
        if (this.f4218gxszxtbevo) {
            this.f4223wkgbmnqykc.inset((int) Math.ceil(eablkybsjg.iobyxmoadg(this.f4216eablkybsjg, this.f4219iobyxmoadg, this.f4220lqeggnwhkg)), (int) Math.ceil(eablkybsjg.zoijcleaow(this.f4216eablkybsjg, this.f4219iobyxmoadg, this.f4220lqeggnwhkg)));
            this.f4222ppxfxbqfkf.set(this.f4223wkgbmnqykc);
        }
    }

    private void eablkybsjg(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4221nufgyqmvbu = colorStateList;
        this.f4224zoijcleaow.setColor(colorStateList.getColorForState(getState(), this.f4221nufgyqmvbu.getDefaultColor()));
    }

    private PorterDuffColorFilter iobyxmoadg(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z13;
        Paint paint = this.f4224zoijcleaow;
        if (this.f4215dxjokdxxww == null || paint.getColorFilter() != null) {
            z13 = false;
        } else {
            paint.setColorFilter(this.f4215dxjokdxxww);
            z13 = true;
        }
        RectF rectF = this.f4222ppxfxbqfkf;
        float f13 = this.f4219iobyxmoadg;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        if (z13) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f4223wkgbmnqykc, this.f4219iobyxmoadg);
    }

    public void gxszxtbevo(ColorStateList colorStateList) {
        eablkybsjg(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4214btonecajqb;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f4221nufgyqmvbu) != null && colorStateList.isStateful()) || super.isStateful();
    }

    void lqeggnwhkg(float f13, boolean z13, boolean z14) {
        if (f13 == this.f4216eablkybsjg && this.f4218gxszxtbevo == z13 && this.f4220lqeggnwhkg == z14) {
            return;
        }
        this.f4216eablkybsjg = f13;
        this.f4218gxszxtbevo = z13;
        this.f4220lqeggnwhkg = z14;
        dxjokdxxww(null);
        invalidateSelf();
    }

    void nufgyqmvbu(float f13) {
        if (f13 == this.f4219iobyxmoadg) {
            return;
        }
        this.f4219iobyxmoadg = f13;
        dxjokdxxww(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        dxjokdxxww(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4221nufgyqmvbu;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z13 = colorForState != this.f4224zoijcleaow.getColor();
        if (z13) {
            this.f4224zoijcleaow.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4214btonecajqb;
        if (colorStateList2 == null || (mode = this.f4217gtknphoqwx) == null) {
            return z13;
        }
        this.f4215dxjokdxxww = iobyxmoadg(colorStateList2, mode);
        return true;
    }

    float ppxfxbqfkf() {
        return this.f4216eablkybsjg;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f4224zoijcleaow.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4224zoijcleaow.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4214btonecajqb = colorStateList;
        this.f4215dxjokdxxww = iobyxmoadg(colorStateList, this.f4217gtknphoqwx);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4217gtknphoqwx = mode;
        this.f4215dxjokdxxww = iobyxmoadg(this.f4214btonecajqb, mode);
        invalidateSelf();
    }

    public float wkgbmnqykc() {
        return this.f4219iobyxmoadg;
    }

    public ColorStateList zoijcleaow() {
        return this.f4221nufgyqmvbu;
    }
}
