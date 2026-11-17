package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.ojitshcjhn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final int f23444cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f23445cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f23446cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f23447esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private zoijcleaow f23448hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f23449hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final Paint f23450iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final List f23451istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f23452iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private double f23453jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ValueAnimator f23454jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f23455lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final RectF f23456lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f23457pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f23458pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final int f23459wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final float f23460yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final TimeInterpolator f23461yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f23462ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f23463zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f23464zynmafqrjb;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface ppxfxbqfkf {
        void gxszxtbevo(float f13, boolean z13);
    }

    public interface zoijcleaow {
        void ppxfxbqfkf(float f13, boolean z13);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.materialClockStyle);
    }

    private boolean draadjrbmk(float f13, float f14, boolean z13, boolean z14, boolean z15) {
        float fLqeggnwhkg = lqeggnwhkg(f13, f14);
        boolean z16 = false;
        boolean z17 = nufgyqmvbu() != fLqeggnwhkg;
        if (z14 && z17) {
            return true;
        }
        if (!z17 && !z13) {
            return false;
        }
        if (z15 && this.f23452iwizpuwonk) {
            z16 = true;
        }
        oxmwwwfdhm(fLqeggnwhkg, z16);
        return true;
    }

    private int dxjokdxxww(int i13) {
        return i13 == 2 ? Math.round(this.f23449hkdspvbjdz * 0.66f) : this.f23449hkdspvbjdz;
    }

    private Pair gtknphoqwx(float f13) {
        float fNufgyqmvbu = nufgyqmvbu();
        if (Math.abs(fNufgyqmvbu - f13) > 180.0f) {
            if (fNufgyqmvbu > 180.0f && f13 < 180.0f) {
                f13 += 360.0f;
            }
            if (fNufgyqmvbu < 180.0f && f13 > 180.0f) {
                fNufgyqmvbu += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fNufgyqmvbu), Float.valueOf(f13));
    }

    private void kcexrzcfyt(float f13, boolean z13) {
        float f14 = f13 % 360.0f;
        this.f23462ylkuphrtab = f14;
        this.f23453jpowsppfya = Math.toRadians(f14 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fDxjokdxxww = dxjokdxxww(this.f23445cllcsxoeiz);
        float fCos = width + (((float) Math.cos(this.f23453jpowsppfya)) * fDxjokdxxww);
        float fSin = height + (fDxjokdxxww * ((float) Math.sin(this.f23453jpowsppfya)));
        RectF rectF = this.f23456lmojexxdyd;
        int i13 = this.f23444cdpycssgdh;
        rectF.set(fCos - i13, fSin - i13, fCos + i13, fSin + i13);
        Iterator it = this.f23451istkbnxepw.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).gxszxtbevo(f14, z13);
        }
        invalidate();
    }

    private int lqeggnwhkg(float f13, float f14) {
        int degrees = (int) Math.toDegrees(Math.atan2(f14 - (getHeight() / 2), f13 - (getWidth() / 2)));
        int i13 = degrees + 90;
        return i13 < 0 ? degrees + 450 : i13;
    }

    private void ppxfxbqfkf(float f13, float f14) {
        this.f23445cllcsxoeiz = ma.iobyxmoadg.iobyxmoadg((float) (getWidth() / 2), (float) (getHeight() / 2), f13, f14) > ((float) dxjokdxxww(2)) + ojitshcjhn.ppxfxbqfkf(getContext(), 12) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wflxmlrfwp(ValueAnimator valueAnimator) {
        kcexrzcfyt(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void wkgbmnqykc(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iDxjokdxxww = dxjokdxxww(this.f23445cllcsxoeiz);
        float f13 = width;
        float f14 = iDxjokdxxww;
        float fCos = (((float) Math.cos(this.f23453jpowsppfya)) * f14) + f13;
        float f15 = height;
        float fSin = (f14 * ((float) Math.sin(this.f23453jpowsppfya))) + f15;
        this.f23450iozdgvuglv.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f23444cdpycssgdh, this.f23450iozdgvuglv);
        double dSin = Math.sin(this.f23453jpowsppfya);
        double dCos = Math.cos(this.f23453jpowsppfya);
        double d13 = iDxjokdxxww - this.f23444cdpycssgdh;
        this.f23450iozdgvuglv.setStrokeWidth(this.f23459wwaezpbzkn);
        canvas.drawLine(f13, f15, width + ((int) (dCos * d13)), height + ((int) (d13 * dSin)), this.f23450iozdgvuglv);
        canvas.drawCircle(f13, f15, this.f23460yadqdtsiqt, this.f23450iozdgvuglv);
    }

    public void agtfadlqog(boolean z13) {
        this.f23452iwizpuwonk = z13;
    }

    public int btonecajqb() {
        return this.f23444cdpycssgdh;
    }

    int eablkybsjg() {
        return this.f23445cllcsxoeiz;
    }

    public RectF gxszxtbevo() {
        return this.f23456lmojexxdyd;
    }

    public float nufgyqmvbu() {
        return this.f23462ylkuphrtab;
    }

    public void ojitshcjhn(int i13) {
        this.f23449hkdspvbjdz = i13;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wkgbmnqykc(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (this.f23454jyumaefscl.isRunning()) {
            return;
        }
        vdvldrhtss(nufgyqmvbu());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        boolean z14;
        boolean z15;
        zoijcleaow zoijcleaowVar;
        int actionMasked = motionEvent.getActionMasked();
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f23446cqumvgiudr = x13;
            this.f23447esjtqupxsv = y13;
            this.f23455lereixgezr = true;
            this.f23457pkzmftpjix = false;
            z13 = false;
            z14 = false;
            z15 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i13 = (int) (x13 - this.f23446cqumvgiudr);
            int i14 = (int) (y13 - this.f23447esjtqupxsv);
            this.f23455lereixgezr = (i13 * i13) + (i14 * i14) > this.f23458pmvmpeiblj;
            boolean z16 = this.f23457pkzmftpjix;
            z13 = actionMasked == 1;
            if (this.f23464zynmafqrjb) {
                ppxfxbqfkf(x13, y13);
            }
            z15 = false;
            z14 = z16;
        } else {
            z13 = false;
            z14 = false;
            z15 = false;
        }
        boolean zDraadjrbmk = draadjrbmk(x13, y13, z14, z15, z13) | this.f23457pkzmftpjix;
        this.f23457pkzmftpjix = zDraadjrbmk;
        if (zDraadjrbmk && z13 && (zoijcleaowVar = this.f23448hcddaimhww) != null) {
            zoijcleaowVar.ppxfxbqfkf(lqeggnwhkg(x13, y13), this.f23455lereixgezr);
        }
        return true;
    }

    public void oxmwwwfdhm(float f13, boolean z13) {
        ValueAnimator valueAnimator = this.f23454jyumaefscl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z13) {
            kcexrzcfyt(f13, false);
            return;
        }
        Pair pairGtknphoqwx = gtknphoqwx(f13);
        this.f23454jyumaefscl.setFloatValues(((Float) pairGtknphoqwx.first).floatValue(), ((Float) pairGtknphoqwx.second).floatValue());
        this.f23454jyumaefscl.setDuration(this.f23463zdlpuopuiu);
        this.f23454jyumaefscl.setInterpolator(this.f23461yggfygwlhe);
        this.f23454jyumaefscl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.zoijcleaow
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f23551iobyxmoadg.wflxmlrfwp(valueAnimator2);
            }
        });
        this.f23454jyumaefscl.addListener(new iobyxmoadg());
        this.f23454jyumaefscl.start();
    }

    void rgvfuqvkyq(int i13) {
        this.f23445cllcsxoeiz = i13;
        invalidate();
    }

    public void vdvldrhtss(float f13) {
        oxmwwwfdhm(f13, false);
    }

    public void yggfygwlhe(zoijcleaow zoijcleaowVar) {
        this.f23448hcddaimhww = zoijcleaowVar;
    }

    void zdlpuopuiu(boolean z13) {
        if (this.f23464zynmafqrjb && !z13) {
            this.f23445cllcsxoeiz = 1;
        }
        this.f23464zynmafqrjb = z13;
        invalidate();
    }

    public void zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f23451istkbnxepw.add(ppxfxbqfkfVar);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f23454jyumaefscl = new ValueAnimator();
        this.f23451istkbnxepw = new ArrayList();
        Paint paint = new Paint();
        this.f23450iozdgvuglv = paint;
        this.f23456lmojexxdyd = new RectF();
        this.f23445cllcsxoeiz = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.ClockHandView, i13, da.gtknphoqwx.Widget_MaterialComponents_TimePicker_Clock);
        this.f23463zdlpuopuiu = na.nufgyqmvbu.gxszxtbevo(context, da.zoijcleaow.motionDurationLong2, 200);
        this.f23461yggfygwlhe = na.nufgyqmvbu.lqeggnwhkg(context, da.zoijcleaow.motionEasingEmphasizedInterpolator, ea.iobyxmoadg.f31023zoijcleaow);
        this.f23449hkdspvbjdz = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ClockHandView_materialCircleRadius, 0);
        this.f23444cdpycssgdh = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f23459wwaezpbzkn = resources.getDimensionPixelSize(da.wkgbmnqykc.material_clock_hand_stroke_width);
        this.f23460yadqdtsiqt = resources.getDimensionPixelSize(da.wkgbmnqykc.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(da.draadjrbmk.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        vdvldrhtss(0.0f);
        this.f23458pmvmpeiblj = ViewConfiguration.get(context).getScaledTouchSlop();
        jhduphickx.uawqvzlxes(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
