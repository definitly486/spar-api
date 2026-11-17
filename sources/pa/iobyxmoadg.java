package pa;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ra.agtfadlqog;
import ra.gtknphoqwx;
import ra.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg extends Drawable implements agtfadlqog {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private zoijcleaow f76250zdlpuopuiu;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        zoijcleaow zoijcleaowVar = this.f76250zdlpuopuiu;
        if (zoijcleaowVar.f76252zoijcleaow) {
            zoijcleaowVar.f76251iobyxmoadg.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f76250zdlpuopuiu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f76250zdlpuopuiu.f76251iobyxmoadg.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg mutate() {
        this.f76250zdlpuopuiu = new zoijcleaow(this.f76250zdlpuopuiu);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f76250zdlpuopuiu.f76251iobyxmoadg.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zEablkybsjg = pa.zoijcleaow.eablkybsjg(iArr);
        zoijcleaow zoijcleaowVar = this.f76250zdlpuopuiu;
        if (zoijcleaowVar.f76252zoijcleaow == zEablkybsjg) {
            return zOnStateChange;
        }
        zoijcleaowVar.f76252zoijcleaow = zEablkybsjg;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setColorFilter(colorFilter);
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(gtknphoqwx gtknphoqwxVar) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setShapeAppearanceModel(gtknphoqwxVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i13) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setTint(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f76250zdlpuopuiu.f76251iobyxmoadg.setTintMode(mode);
    }

    public iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        this(new zoijcleaow(new lqeggnwhkg(gtknphoqwxVar)));
    }

    static final class zoijcleaow extends Drawable.ConstantState {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        lqeggnwhkg f76251iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f76252zoijcleaow;

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar) {
            this.f76251iobyxmoadg = lqeggnwhkgVar;
            this.f76252zoijcleaow = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg newDrawable() {
            return new iobyxmoadg(new zoijcleaow(this));
        }

        public zoijcleaow(zoijcleaow zoijcleaowVar) {
            this.f76251iobyxmoadg = (lqeggnwhkg) zoijcleaowVar.f76251iobyxmoadg.getConstantState().newDrawable();
            this.f76252zoijcleaow = zoijcleaowVar.f76252zoijcleaow;
        }
    }

    private iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f76250zdlpuopuiu = zoijcleaowVar;
    }
}
