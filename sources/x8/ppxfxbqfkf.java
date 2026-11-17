package x8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import l8.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends Drawable implements lqeggnwhkg.zoijcleaow, Animatable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private List f121468cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f121469cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f121470esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Rect f121471istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f121472iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f121473jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f121474lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f121475pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f121476yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iobyxmoadg f121477zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Paint f121478zynmafqrjb;

    static final class iobyxmoadg extends Drawable.ConstantState {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final lqeggnwhkg f121479iobyxmoadg;

        iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
            this.f121479iobyxmoadg = lqeggnwhkgVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ppxfxbqfkf(this);
        }
    }

    public ppxfxbqfkf(Context context, h8.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar, int i13, int i14, Bitmap bitmap) {
        this(new iobyxmoadg(new lqeggnwhkg(com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context), iobyxmoadgVar, i13, i14, gtknphoqwxVar, bitmap)));
    }

    private void agtfadlqog() {
        g9.gtknphoqwx.zoijcleaow(!this.f121472iwizpuwonk, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f121477zdlpuopuiu.f121479iobyxmoadg.gxszxtbevo() == 1) {
            invalidateSelf();
        } else {
            if (this.f121476yggfygwlhe) {
                return;
            }
            this.f121476yggfygwlhe = true;
            this.f121477zdlpuopuiu.f121479iobyxmoadg.oxmwwwfdhm(this);
            invalidateSelf();
        }
    }

    private void btonecajqb() {
        List list = this.f121468cdpycssgdh;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.vectordrawable.graphics.drawable.zoijcleaow) this.f121468cdpycssgdh.get(i13)).zoijcleaow(this);
            }
        }
    }

    private void draadjrbmk() {
        this.f121470esjtqupxsv = 0;
    }

    private Paint nufgyqmvbu() {
        if (this.f121478zynmafqrjb == null) {
            this.f121478zynmafqrjb = new Paint(2);
        }
        return this.f121478zynmafqrjb;
    }

    private void ojitshcjhn() {
        this.f121476yggfygwlhe = false;
        this.f121477zdlpuopuiu.f121479iobyxmoadg.kcexrzcfyt(this);
    }

    private Rect wkgbmnqykc() {
        if (this.f121471istkbnxepw == null) {
            this.f121471istkbnxepw = new Rect();
        }
        return this.f121471istkbnxepw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback zoijcleaow() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f121472iwizpuwonk) {
            return;
        }
        if (this.f121475pmvmpeiblj) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), wkgbmnqykc());
            this.f121475pmvmpeiblj = false;
        }
        canvas.drawBitmap(this.f121477zdlpuopuiu.f121479iobyxmoadg.ppxfxbqfkf(), (Rect) null, wkgbmnqykc(), nufgyqmvbu());
    }

    public int dxjokdxxww() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.btonecajqb();
    }

    public Bitmap eablkybsjg() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.eablkybsjg();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f121477zdlpuopuiu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.nufgyqmvbu();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.gtknphoqwx();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void gtknphoqwx() {
        this.f121472iwizpuwonk = true;
        this.f121477zdlpuopuiu.f121479iobyxmoadg.iobyxmoadg();
    }

    public int gxszxtbevo() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.gxszxtbevo();
    }

    @Override // x8.lqeggnwhkg.zoijcleaow
    public void iobyxmoadg() {
        if (zoijcleaow() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (lqeggnwhkg() == gxszxtbevo() - 1) {
            this.f121470esjtqupxsv++;
        }
        int i13 = this.f121474lereixgezr;
        if (i13 == -1 || this.f121470esjtqupxsv < i13) {
            return;
        }
        btonecajqb();
        stop();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f121476yggfygwlhe;
    }

    public int lqeggnwhkg() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.wkgbmnqykc();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f121475pmvmpeiblj = true;
    }

    public ByteBuffer ppxfxbqfkf() {
        return this.f121477zdlpuopuiu.f121479iobyxmoadg.zoijcleaow();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        nufgyqmvbu().setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        nufgyqmvbu().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        g9.gtknphoqwx.zoijcleaow(!this.f121472iwizpuwonk, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f121469cqumvgiudr = z13;
        if (!z13) {
            ojitshcjhn();
        } else if (this.f121473jyumaefscl) {
            agtfadlqog();
        }
        return super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f121473jyumaefscl = true;
        draadjrbmk();
        if (this.f121469cqumvgiudr) {
            agtfadlqog();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f121473jyumaefscl = false;
        ojitshcjhn();
    }

    public void wflxmlrfwp(gtknphoqwx gtknphoqwxVar, Bitmap bitmap) {
        this.f121477zdlpuopuiu.f121479iobyxmoadg.ojitshcjhn(gtknphoqwxVar, bitmap);
    }

    ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f121469cqumvgiudr = true;
        this.f121474lereixgezr = -1;
        this.f121477zdlpuopuiu = (iobyxmoadg) g9.gtknphoqwx.eablkybsjg(iobyxmoadgVar);
    }
}
