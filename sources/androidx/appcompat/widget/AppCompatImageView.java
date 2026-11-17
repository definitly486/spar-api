package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f3081jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final draadjrbmk f3082yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f3083zdlpuopuiu;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.ppxfxbqfkf();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.wkgbmnqykc();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.eablkybsjg();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f3082yggfygwlhe.gxszxtbevo() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.ppxfxbqfkf();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null && drawable != null && !this.f3081jyumaefscl) {
            draadjrbmkVar.nufgyqmvbu(drawable);
        }
        super.setImageDrawable(drawable);
        draadjrbmk draadjrbmkVar2 = this.f3082yggfygwlhe;
        if (draadjrbmkVar2 != null) {
            draadjrbmkVar2.ppxfxbqfkf();
            if (this.f3081jyumaefscl) {
                return;
            }
            this.f3082yggfygwlhe.zoijcleaow();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i13) {
        super.setImageLevel(i13);
        this.f3081jyumaefscl = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.dxjokdxxww(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.ppxfxbqfkf();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wkgbmnqykc wkgbmnqykcVar = this.f3083zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.btonecajqb(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        draadjrbmk draadjrbmkVar = this.f3082yggfygwlhe;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.gtknphoqwx(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i13) {
        super(stevsuqkhv.zoijcleaow(context), attributeSet, i13);
        this.f3081jyumaefscl = false;
        wypolnanlu.iobyxmoadg(this, getContext());
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
        this.f3083zdlpuopuiu = wkgbmnqykcVar;
        wkgbmnqykcVar.eablkybsjg(attributeSet, i13);
        draadjrbmk draadjrbmkVar = new draadjrbmk(this);
        this.f3082yggfygwlhe = draadjrbmkVar;
        draadjrbmkVar.lqeggnwhkg(attributeSet, i13);
    }
}
