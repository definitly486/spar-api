package dxjokdxxww;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Drawable f29811zdlpuopuiu;

    public iobyxmoadg(Drawable drawable) {
        iobyxmoadg(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f29811zdlpuopuiu.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f29811zdlpuopuiu.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f29811zdlpuopuiu.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29811zdlpuopuiu.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29811zdlpuopuiu.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f29811zdlpuopuiu.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f29811zdlpuopuiu.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f29811zdlpuopuiu.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f29811zdlpuopuiu.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f29811zdlpuopuiu.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f29811zdlpuopuiu.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void iobyxmoadg(Drawable drawable) {
        Drawable drawable2 = this.f29811zdlpuopuiu;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29811zdlpuopuiu = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return k1.iobyxmoadg.nufgyqmvbu(this.f29811zdlpuopuiu);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f29811zdlpuopuiu.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f29811zdlpuopuiu.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f29811zdlpuopuiu.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i13) {
        return this.f29811zdlpuopuiu.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        scheduleSelf(runnable, j13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f29811zdlpuopuiu.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z13) {
        k1.iobyxmoadg.btonecajqb(this.f29811zdlpuopuiu, z13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i13) {
        this.f29811zdlpuopuiu.setChangingConfigurations(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29811zdlpuopuiu.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z13) {
        this.f29811zdlpuopuiu.setDither(z13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z13) {
        this.f29811zdlpuopuiu.setFilterBitmap(z13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f13, float f14) {
        k1.iobyxmoadg.gtknphoqwx(this.f29811zdlpuopuiu, f13, f14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i13, int i14, int i15, int i16) {
        k1.iobyxmoadg.draadjrbmk(this.f29811zdlpuopuiu, i13, i14, i15, i16);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f29811zdlpuopuiu.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i13) {
        k1.iobyxmoadg.agtfadlqog(this.f29811zdlpuopuiu, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        k1.iobyxmoadg.ojitshcjhn(this.f29811zdlpuopuiu, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        k1.iobyxmoadg.rgvfuqvkyq(this.f29811zdlpuopuiu, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        return super.setVisible(z13, z14) || this.f29811zdlpuopuiu.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
