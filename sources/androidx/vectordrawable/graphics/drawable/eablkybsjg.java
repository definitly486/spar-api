package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg extends Drawable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    Drawable f13596zdlpuopuiu;

    eablkybsjg() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.iobyxmoadg(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.dxjokdxxww(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.setLevel(i13) : super.onLevelChange(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setChangingConfigurations(i13);
        } else {
            super.setChangingConfigurations(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i13, PorterDuff.Mode mode) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setColorFilter(i13, mode);
        } else {
            super.setColorFilter(i13, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setFilterBitmap(z13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f13, float f14) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.gtknphoqwx(drawable, f13, f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i13, int i14, int i15, int i16) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.draadjrbmk(drawable, i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
