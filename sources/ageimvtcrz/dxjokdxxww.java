package ageimvtcrz;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends View {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f1809esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f1810lereixgezr = 8;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int[] f1811pmvmpeiblj = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int[] f1812zynmafqrjb = new int[0];

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private tg.iobyxmoadg f1813cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Runnable f1814iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Long f1815jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Boolean f1816yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private agtfadlqog f1817zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(Context context) {
        super(context);
    }

    private final void ppxfxbqfkf(boolean z13) {
        agtfadlqog agtfadlqogVar = new agtfadlqog(z13);
        setBackground(agtfadlqogVar);
        this.f1817zdlpuopuiu = agtfadlqogVar;
    }

    private final void setRippleState(boolean z13) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1814iwizpuwonk;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l13 = this.f1815jyumaefscl;
        long jLongValue = jCurrentAnimationTimeMillis - (l13 != null ? l13.longValue() : 0L);
        if (z13 || jLongValue >= 5) {
            int[] iArr = z13 ? f1811pmvmpeiblj : f1812zynmafqrjb;
            agtfadlqog agtfadlqogVar = this.f1817zdlpuopuiu;
            if (agtfadlqogVar != null) {
                agtfadlqogVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: ageimvtcrz.nufgyqmvbu
                @Override // java.lang.Runnable
                public final void run() {
                    dxjokdxxww.setRippleState$lambda$2(this.f1842zdlpuopuiu);
                }
            };
            this.f1814iwizpuwonk = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f1815jyumaefscl = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(dxjokdxxww dxjokdxxwwVar) {
        agtfadlqog agtfadlqogVar = dxjokdxxwwVar.f1817zdlpuopuiu;
        if (agtfadlqogVar != null) {
            agtfadlqogVar.setState(f1812zynmafqrjb);
        }
        dxjokdxxwwVar.f1814iwizpuwonk = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            wkgbmnqykc();
        }
    }

    public final void eablkybsjg() {
        setRippleState(false);
    }

    public final void gxszxtbevo(long j13, int i13, long j14, float f13) {
        agtfadlqog agtfadlqogVar = this.f1817zdlpuopuiu;
        if (agtfadlqogVar == null) {
            return;
        }
        agtfadlqogVar.ppxfxbqfkf(i13);
        agtfadlqogVar.zoijcleaow(j14, f13);
        Rect rect = new Rect(0, 0, vg.iobyxmoadg.wkgbmnqykc(g.gtknphoqwx.gtknphoqwx(j13)), vg.iobyxmoadg.wkgbmnqykc(g.gtknphoqwx.dxjokdxxww(j13)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        agtfadlqogVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        tg.iobyxmoadg iobyxmoadgVar = this.f1813cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void wkgbmnqykc() {
        this.f1813cqumvgiudr = null;
        Runnable runnable = this.f1814iwizpuwonk;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f1814iwizpuwonk;
            zdlpuopuiu.lqeggnwhkg(runnable2);
            runnable2.run();
        } else {
            agtfadlqog agtfadlqogVar = this.f1817zdlpuopuiu;
            if (agtfadlqogVar != null) {
                agtfadlqogVar.setState(f1812zynmafqrjb);
            }
        }
        agtfadlqog agtfadlqogVar2 = this.f1817zdlpuopuiu;
        if (agtfadlqogVar2 == null) {
            return;
        }
        agtfadlqogVar2.setVisible(false, false);
        unscheduleDrawable(agtfadlqogVar2);
    }

    public final void zoijcleaow(metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar, boolean z13, long j13, int i13, long j14, float f13, tg.iobyxmoadg iobyxmoadgVar) {
        if (this.f1817zdlpuopuiu == null || !zdlpuopuiu.eablkybsjg(Boolean.valueOf(z13), this.f1816yggfygwlhe)) {
            ppxfxbqfkf(z13);
            this.f1816yggfygwlhe = Boolean.valueOf(z13);
        }
        agtfadlqog agtfadlqogVar = this.f1817zdlpuopuiu;
        zdlpuopuiu.lqeggnwhkg(agtfadlqogVar);
        this.f1813cqumvgiudr = iobyxmoadgVar;
        gxszxtbevo(j13, i13, j14, f13);
        if (z13) {
            agtfadlqogVar.setHotspot(g.eablkybsjg.wflxmlrfwp(zoijcleaowVar.iobyxmoadg()), g.eablkybsjg.agtfadlqog(zoijcleaowVar.iobyxmoadg()));
        } else {
            agtfadlqogVar.setHotspot(agtfadlqogVar.getBounds().centerX(), agtfadlqogVar.getBounds().centerY());
        }
        setRippleState(true);
    }
}
