package v8;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb implements n8.ppxfxbqfkf, n8.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final Drawable f116312zdlpuopuiu;

    public btonecajqb(Drawable drawable) {
        this.f116312zdlpuopuiu = (Drawable) g9.gtknphoqwx.eablkybsjg(drawable);
    }

    @Override // n8.zoijcleaow
    public void iobyxmoadg() {
        Drawable drawable = this.f116312zdlpuopuiu;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof x8.ppxfxbqfkf) {
            ((x8.ppxfxbqfkf) drawable).eablkybsjg().prepareToDraw();
        }
    }

    @Override // n8.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f116312zdlpuopuiu.getConstantState();
        return constantState == null ? this.f116312zdlpuopuiu : constantState.newDrawable();
    }
}
