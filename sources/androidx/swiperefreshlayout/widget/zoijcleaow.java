package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow extends Drawable implements Animatable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Interpolator f13384lereixgezr = new LinearInterpolator();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Interpolator f13385pmvmpeiblj = new o2.zoijcleaow();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int[] f13386zynmafqrjb = {-16777216};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    float f13387cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    boolean f13388esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Animator f13389iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Resources f13390jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f13391yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f13392zdlpuopuiu;

    class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f13393iobyxmoadg;

        iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f13393iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            zoijcleaow.this.agtfadlqog(fFloatValue, this.f13393iobyxmoadg);
            zoijcleaow.this.zoijcleaow(fFloatValue, this.f13393iobyxmoadg, false);
            zoijcleaow.this.invalidateSelf();
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        boolean f13395agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        int f13396btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        float f13397draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        int[] f13398dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        float f13399eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f13400gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        float f13401gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final RectF f13402iobyxmoadg = new RectF();

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        int f13403kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        float f13404lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        float f13405nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Path f13406ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        int f13407oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final Paint f13408ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        float f13409rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        float f13410vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        float f13411wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final Paint f13412wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f13413yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13414zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Paint f13415zoijcleaow;

        ppxfxbqfkf() {
            Paint paint = new Paint();
            this.f13415zoijcleaow = paint;
            Paint paint2 = new Paint();
            this.f13408ppxfxbqfkf = paint2;
            Paint paint3 = new Paint();
            this.f13412wkgbmnqykc = paint3;
            this.f13399eablkybsjg = 0.0f;
            this.f13401gxszxtbevo = 0.0f;
            this.f13404lqeggnwhkg = 0.0f;
            this.f13405nufgyqmvbu = 5.0f;
            this.f13409rgvfuqvkyq = 1.0f;
            this.f13414zdlpuopuiu = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void agtfadlqog(int i13) {
            this.f13414zdlpuopuiu = i13;
        }

        float btonecajqb() {
            return this.f13411wflxmlrfwp;
        }

        void cqumvgiudr(boolean z13) {
            if (this.f13395agtfadlqog != z13) {
                this.f13395agtfadlqog = z13;
            }
        }

        void draadjrbmk() {
            zdlpuopuiu(gxszxtbevo());
        }

        float dxjokdxxww() {
            return this.f13397draadjrbmk;
        }

        int eablkybsjg() {
            return this.f13398dxjokdxxww[gxszxtbevo()];
        }

        void esjtqupxsv(float f13) {
            this.f13399eablkybsjg = f13;
        }

        float gtknphoqwx() {
            return this.f13400gtknphoqwx;
        }

        int gxszxtbevo() {
            return (this.f13396btonecajqb + 1) % this.f13398dxjokdxxww.length;
        }

        void iobyxmoadg(Canvas canvas, Rect rect) {
            RectF rectF = this.f13402iobyxmoadg;
            float f13 = this.f13410vdvldrhtss;
            float fMin = (this.f13405nufgyqmvbu / 2.0f) + f13;
            if (f13 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f13407oxmwwwfdhm * this.f13409rgvfuqvkyq) / 2.0f, this.f13405nufgyqmvbu / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f14 = this.f13399eablkybsjg;
            float f15 = this.f13404lqeggnwhkg;
            float f16 = (f14 + f15) * 360.0f;
            float f17 = ((this.f13401gxszxtbevo + f15) * 360.0f) - f16;
            this.f13415zoijcleaow.setColor(this.f13413yggfygwlhe);
            this.f13415zoijcleaow.setAlpha(this.f13414zdlpuopuiu);
            float f18 = this.f13405nufgyqmvbu / 2.0f;
            rectF.inset(f18, f18);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f13412wkgbmnqykc);
            float f19 = -f18;
            rectF.inset(f19, f19);
            canvas.drawArc(rectF, f16, f17, false, this.f13415zoijcleaow);
            zoijcleaow(canvas, f16, f17, rectF);
        }

        void iwizpuwonk(float f13) {
            this.f13404lqeggnwhkg = f13;
        }

        void jyumaefscl(float f13) {
            this.f13401gxszxtbevo = f13;
        }

        void kcexrzcfyt(ColorFilter colorFilter) {
            this.f13415zoijcleaow.setColorFilter(colorFilter);
        }

        void lereixgezr(float f13) {
            this.f13405nufgyqmvbu = f13;
            this.f13415zoijcleaow.setStrokeWidth(f13);
        }

        float lqeggnwhkg() {
            return this.f13399eablkybsjg;
        }

        int nufgyqmvbu() {
            return this.f13398dxjokdxxww[this.f13396btonecajqb];
        }

        void ojitshcjhn(float f13, float f14) {
            this.f13407oxmwwwfdhm = (int) f13;
            this.f13403kcexrzcfyt = (int) f14;
        }

        void oxmwwwfdhm(int i13) {
            this.f13413yggfygwlhe = i13;
        }

        void pmvmpeiblj() {
            this.f13400gtknphoqwx = this.f13399eablkybsjg;
            this.f13397draadjrbmk = this.f13401gxszxtbevo;
            this.f13411wflxmlrfwp = this.f13404lqeggnwhkg;
        }

        int ppxfxbqfkf() {
            return this.f13414zdlpuopuiu;
        }

        void rgvfuqvkyq(float f13) {
            if (f13 != this.f13409rgvfuqvkyq) {
                this.f13409rgvfuqvkyq = f13;
            }
        }

        void vdvldrhtss(float f13) {
            this.f13410vdvldrhtss = f13;
        }

        void wflxmlrfwp() {
            this.f13400gtknphoqwx = 0.0f;
            this.f13397draadjrbmk = 0.0f;
            this.f13411wflxmlrfwp = 0.0f;
            esjtqupxsv(0.0f);
            jyumaefscl(0.0f);
            iwizpuwonk(0.0f);
        }

        float wkgbmnqykc() {
            return this.f13401gxszxtbevo;
        }

        void yggfygwlhe(int[] iArr) {
            this.f13398dxjokdxxww = iArr;
            zdlpuopuiu(0);
        }

        void zdlpuopuiu(int i13) {
            this.f13396btonecajqb = i13;
            this.f13413yggfygwlhe = this.f13398dxjokdxxww[i13];
        }

        void zoijcleaow(Canvas canvas, float f13, float f14, RectF rectF) {
            if (this.f13395agtfadlqog) {
                Path path = this.f13406ojitshcjhn;
                if (path == null) {
                    Path path2 = new Path();
                    this.f13406ojitshcjhn = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f15 = (this.f13407oxmwwwfdhm * this.f13409rgvfuqvkyq) / 2.0f;
                this.f13406ojitshcjhn.moveTo(0.0f, 0.0f);
                this.f13406ojitshcjhn.lineTo(this.f13407oxmwwwfdhm * this.f13409rgvfuqvkyq, 0.0f);
                Path path3 = this.f13406ojitshcjhn;
                float f16 = this.f13407oxmwwwfdhm;
                float f17 = this.f13409rgvfuqvkyq;
                path3.lineTo((f16 * f17) / 2.0f, this.f13403kcexrzcfyt * f17);
                this.f13406ojitshcjhn.offset((fMin + rectF.centerX()) - f15, rectF.centerY() + (this.f13405nufgyqmvbu / 2.0f));
                this.f13406ojitshcjhn.close();
                this.f13408ppxfxbqfkf.setColor(this.f13413yggfygwlhe);
                this.f13408ppxfxbqfkf.setAlpha(this.f13414zdlpuopuiu);
                canvas.save();
                canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f13406ojitshcjhn, this.f13408ppxfxbqfkf);
                canvas.restore();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0199zoijcleaow implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f13416iobyxmoadg;

        C0199zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f13416iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            zoijcleaow.this.zoijcleaow(1.0f, this.f13416iobyxmoadg, true);
            this.f13416iobyxmoadg.pmvmpeiblj();
            this.f13416iobyxmoadg.draadjrbmk();
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            if (!zoijcleaowVar.f13388esjtqupxsv) {
                zoijcleaowVar.f13387cqumvgiudr += 1.0f;
                return;
            }
            zoijcleaowVar.f13388esjtqupxsv = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f13416iobyxmoadg.cqumvgiudr(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            zoijcleaow.this.f13387cqumvgiudr = 0.0f;
        }
    }

    public zoijcleaow(Context context) {
        this.f13390jyumaefscl = ((Context) nufgyqmvbu.gxszxtbevo(context)).getResources();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f13392zdlpuopuiu = ppxfxbqfkfVar;
        ppxfxbqfkfVar.yggfygwlhe(f13386zynmafqrjb);
        gtknphoqwx(2.5f);
        wflxmlrfwp();
    }

    private void dxjokdxxww(float f13, float f14, float f15, float f16) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f13392zdlpuopuiu;
        float f17 = this.f13390jyumaefscl.getDisplayMetrics().density;
        ppxfxbqfkfVar.lereixgezr(f14 * f17);
        ppxfxbqfkfVar.vdvldrhtss(f13 * f17);
        ppxfxbqfkfVar.zdlpuopuiu(0);
        ppxfxbqfkfVar.ojitshcjhn(f15 * f17, f16 * f17);
    }

    private void iobyxmoadg(float f13, ppxfxbqfkf ppxfxbqfkfVar) {
        agtfadlqog(f13, ppxfxbqfkfVar);
        float fFloor = (float) (Math.floor(ppxfxbqfkfVar.btonecajqb() / 0.8f) + 1.0d);
        ppxfxbqfkfVar.esjtqupxsv(ppxfxbqfkfVar.gtknphoqwx() + (((ppxfxbqfkfVar.dxjokdxxww() - 0.01f) - ppxfxbqfkfVar.gtknphoqwx()) * f13));
        ppxfxbqfkfVar.jyumaefscl(ppxfxbqfkfVar.dxjokdxxww());
        ppxfxbqfkfVar.iwizpuwonk(ppxfxbqfkfVar.btonecajqb() + ((fFloor - ppxfxbqfkfVar.btonecajqb()) * f13));
    }

    private void nufgyqmvbu(float f13) {
        this.f13391yggfygwlhe = f13;
    }

    private int ppxfxbqfkf(float f13, int i13, int i14) {
        int i15 = (i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i16 = (i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i17 = (i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i18 = i13 & KotlinVersion.MAX_COMPONENT_VALUE;
        return ((i15 + ((int) ((((i14 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i15) * f13))) << 24) | ((i16 + ((int) ((((i14 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i16) * f13))) << 16) | ((i17 + ((int) ((((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i17) * f13))) << 8) | (i18 + ((int) (f13 * ((i14 & KotlinVersion.MAX_COMPONENT_VALUE) - i18))));
    }

    private void wflxmlrfwp() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f13392zdlpuopuiu;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new iobyxmoadg(ppxfxbqfkfVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f13384lereixgezr);
        valueAnimatorOfFloat.addListener(new C0199zoijcleaow(ppxfxbqfkfVar));
        this.f13389iwizpuwonk = valueAnimatorOfFloat;
    }

    void agtfadlqog(float f13, ppxfxbqfkf ppxfxbqfkfVar) {
        if (f13 > 0.75f) {
            ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkf((f13 - 0.75f) / 0.25f, ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.eablkybsjg()));
        } else {
            ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.nufgyqmvbu());
        }
    }

    public void btonecajqb(float f13, float f14) {
        this.f13392zdlpuopuiu.esjtqupxsv(f13);
        this.f13392zdlpuopuiu.jyumaefscl(f14);
        invalidateSelf();
    }

    public void draadjrbmk(int i13) {
        if (i13 == 0) {
            dxjokdxxww(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            dxjokdxxww(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f13391yggfygwlhe, bounds.exactCenterX(), bounds.exactCenterY());
        this.f13392zdlpuopuiu.iobyxmoadg(canvas, bounds);
        canvas.restore();
    }

    public void eablkybsjg(float f13) {
        this.f13392zdlpuopuiu.rgvfuqvkyq(f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13392zdlpuopuiu.ppxfxbqfkf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void gtknphoqwx(float f13) {
        this.f13392zdlpuopuiu.lereixgezr(f13);
        invalidateSelf();
    }

    public void gxszxtbevo(int... iArr) {
        this.f13392zdlpuopuiu.yggfygwlhe(iArr);
        this.f13392zdlpuopuiu.zdlpuopuiu(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f13389iwizpuwonk.isRunning();
    }

    public void lqeggnwhkg(float f13) {
        this.f13392zdlpuopuiu.iwizpuwonk(f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f13392zdlpuopuiu.agtfadlqog(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13392zdlpuopuiu.kcexrzcfyt(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f13389iwizpuwonk.cancel();
        this.f13392zdlpuopuiu.pmvmpeiblj();
        if (this.f13392zdlpuopuiu.wkgbmnqykc() != this.f13392zdlpuopuiu.lqeggnwhkg()) {
            this.f13388esjtqupxsv = true;
            this.f13389iwizpuwonk.setDuration(666L);
            this.f13389iwizpuwonk.start();
        } else {
            this.f13392zdlpuopuiu.zdlpuopuiu(0);
            this.f13392zdlpuopuiu.wflxmlrfwp();
            this.f13389iwizpuwonk.setDuration(1332L);
            this.f13389iwizpuwonk.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f13389iwizpuwonk.cancel();
        nufgyqmvbu(0.0f);
        this.f13392zdlpuopuiu.cqumvgiudr(false);
        this.f13392zdlpuopuiu.zdlpuopuiu(0);
        this.f13392zdlpuopuiu.wflxmlrfwp();
        invalidateSelf();
    }

    public void wkgbmnqykc(boolean z13) {
        this.f13392zdlpuopuiu.cqumvgiudr(z13);
        invalidateSelf();
    }

    void zoijcleaow(float f13, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        float interpolation;
        float interpolation2;
        if (this.f13388esjtqupxsv) {
            iobyxmoadg(f13, ppxfxbqfkfVar);
            return;
        }
        if (f13 != 1.0f || z13) {
            float fBtonecajqb = ppxfxbqfkfVar.btonecajqb();
            if (f13 < 0.5f) {
                interpolation = ppxfxbqfkfVar.gtknphoqwx();
                interpolation2 = (f13385pmvmpeiblj.getInterpolation(f13 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fGtknphoqwx = ppxfxbqfkfVar.gtknphoqwx() + 0.79f;
                interpolation = fGtknphoqwx - (((1.0f - f13385pmvmpeiblj.getInterpolation((f13 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fGtknphoqwx;
            }
            float f14 = fBtonecajqb + (0.20999998f * f13);
            float f15 = (f13 + this.f13387cqumvgiudr) * 216.0f;
            ppxfxbqfkfVar.esjtqupxsv(interpolation);
            ppxfxbqfkfVar.jyumaefscl(interpolation2);
            ppxfxbqfkfVar.iwizpuwonk(f14);
            nufgyqmvbu(f15);
        }
    }
}
