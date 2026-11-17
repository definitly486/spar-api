package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.google.android.gms.common.ConnectionResult;
import kotlin.KotlinVersion;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class btonecajqb extends RecyclerView.ojitshcjhn implements RecyclerView.zdlpuopuiu {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final int[] f12881cdpycssgdh = {R.attr.state_pressed};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int[] f12882yadqdtsiqt = new int[0];

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    int f12883agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f12884btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f12886draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f12887dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f12888eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    int f12890gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f12891gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f12892iobyxmoadg;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final RecyclerView.yggfygwlhe f12893istkbnxepw;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private RecyclerView f12896kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final ValueAnimator f12897lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final StateListDrawable f12898lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Drawable f12899nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    int f12900ojitshcjhn;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    int f12902pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final StateListDrawable f12903ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    float f12904rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    float f12906wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Drawable f12907wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f12910zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Runnable f12911zynmafqrjb;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f12905vdvldrhtss = 0;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f12901oxmwwwfdhm = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f12909zdlpuopuiu = false;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f12908yggfygwlhe = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f12895jyumaefscl = 0;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f12894iwizpuwonk = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int[] f12885cqumvgiudr = new int[2];

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int[] f12889esjtqupxsv = new int[2];

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            btonecajqb.this.wflxmlrfwp(500);
        }
    }

    private class ppxfxbqfkf extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f12913iobyxmoadg = false;

        ppxfxbqfkf() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12913iobyxmoadg = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f12913iobyxmoadg) {
                this.f12913iobyxmoadg = false;
                return;
            }
            if (((Float) btonecajqb.this.f12897lereixgezr.getAnimatedValue()).floatValue() == 0.0f) {
                btonecajqb btonecajqbVar = btonecajqb.this;
                btonecajqbVar.f12902pmvmpeiblj = 0;
                btonecajqbVar.yggfygwlhe(0);
            } else {
                btonecajqb btonecajqbVar2 = btonecajqb.this;
                btonecajqbVar2.f12902pmvmpeiblj = 2;
                btonecajqbVar2.oxmwwwfdhm();
            }
        }
    }

    private class wkgbmnqykc implements ValueAnimator.AnimatorUpdateListener {
        wkgbmnqykc() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            btonecajqb.this.f12903ppxfxbqfkf.setAlpha(iFloatValue);
            btonecajqb.this.f12907wkgbmnqykc.setAlpha(iFloatValue);
            btonecajqb.this.oxmwwwfdhm();
        }
    }

    class zoijcleaow extends RecyclerView.yggfygwlhe {
        zoijcleaow() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
            btonecajqb.this.cqumvgiudr(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    btonecajqb(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i13, int i14, int i15) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12897lereixgezr = valueAnimatorOfFloat;
        this.f12902pmvmpeiblj = 0;
        this.f12911zynmafqrjb = new iobyxmoadg();
        this.f12893istkbnxepw = new zoijcleaow();
        this.f12903ppxfxbqfkf = stateListDrawable;
        this.f12907wkgbmnqykc = drawable;
        this.f12898lqeggnwhkg = stateListDrawable2;
        this.f12899nufgyqmvbu = drawable2;
        this.f12888eablkybsjg = Math.max(i13, stateListDrawable.getIntrinsicWidth());
        this.f12891gxszxtbevo = Math.max(i13, drawable.getIntrinsicWidth());
        this.f12887dxjokdxxww = Math.max(i13, stateListDrawable2.getIntrinsicWidth());
        this.f12884btonecajqb = Math.max(i13, drawable2.getIntrinsicWidth());
        this.f12892iobyxmoadg = i14;
        this.f12910zoijcleaow = i15;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        valueAnimatorOfFloat.addListener(new ppxfxbqfkf());
        valueAnimatorOfFloat.addUpdateListener(new wkgbmnqykc());
        gxszxtbevo(recyclerView);
    }

    private void agtfadlqog(float f13) {
        int[] iArrGtknphoqwx = gtknphoqwx();
        float fMax = Math.max(iArrGtknphoqwx[0], Math.min(iArrGtknphoqwx[1], f13));
        if (Math.abs(this.f12900ojitshcjhn - fMax) < 2.0f) {
            return;
        }
        int iZdlpuopuiu = zdlpuopuiu(this.f12904rgvfuqvkyq, fMax, iArrGtknphoqwx, this.f12896kcexrzcfyt.computeHorizontalScrollRange(), this.f12896kcexrzcfyt.computeHorizontalScrollOffset(), this.f12905vdvldrhtss);
        if (iZdlpuopuiu != 0) {
            this.f12896kcexrzcfyt.scrollBy(iZdlpuopuiu, 0);
        }
        this.f12904rgvfuqvkyq = fMax;
    }

    private void btonecajqb(Canvas canvas) {
        int i13 = this.f12905vdvldrhtss;
        int i14 = this.f12888eablkybsjg;
        int i15 = i13 - i14;
        int i16 = this.f12886draadjrbmk;
        int i17 = this.f12890gtknphoqwx;
        int i18 = i16 - (i17 / 2);
        this.f12903ppxfxbqfkf.setBounds(0, 0, i14, i17);
        this.f12907wkgbmnqykc.setBounds(0, 0, this.f12891gxszxtbevo, this.f12901oxmwwwfdhm);
        if (!ojitshcjhn()) {
            canvas.translate(i15, 0.0f);
            this.f12907wkgbmnqykc.draw(canvas);
            canvas.translate(0.0f, i18);
            this.f12903ppxfxbqfkf.draw(canvas);
            canvas.translate(-i15, -i18);
            return;
        }
        this.f12907wkgbmnqykc.draw(canvas);
        canvas.translate(this.f12888eablkybsjg, i18);
        canvas.scale(-1.0f, 1.0f);
        this.f12903ppxfxbqfkf.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f12888eablkybsjg, -i18);
    }

    private int[] draadjrbmk() {
        int[] iArr = this.f12885cqumvgiudr;
        int i13 = this.f12910zoijcleaow;
        iArr[0] = i13;
        iArr[1] = this.f12901oxmwwwfdhm - i13;
        return iArr;
    }

    private void dxjokdxxww(Canvas canvas) {
        int i13 = this.f12901oxmwwwfdhm;
        int i14 = this.f12887dxjokdxxww;
        int i15 = i13 - i14;
        int i16 = this.f12900ojitshcjhn;
        int i17 = this.f12883agtfadlqog;
        int i18 = i16 - (i17 / 2);
        this.f12898lqeggnwhkg.setBounds(0, 0, i17, i14);
        this.f12899nufgyqmvbu.setBounds(0, 0, this.f12905vdvldrhtss, this.f12884btonecajqb);
        canvas.translate(0.0f, i15);
        this.f12899nufgyqmvbu.draw(canvas);
        canvas.translate(i18, 0.0f);
        this.f12898lqeggnwhkg.draw(canvas);
        canvas.translate(-i18, -i15);
    }

    private void esjtqupxsv(float f13) {
        int[] iArrDraadjrbmk = draadjrbmk();
        float fMax = Math.max(iArrDraadjrbmk[0], Math.min(iArrDraadjrbmk[1], f13));
        if (Math.abs(this.f12886draadjrbmk - fMax) < 2.0f) {
            return;
        }
        int iZdlpuopuiu = zdlpuopuiu(this.f12906wflxmlrfwp, fMax, iArrDraadjrbmk, this.f12896kcexrzcfyt.computeVerticalScrollRange(), this.f12896kcexrzcfyt.computeVerticalScrollOffset(), this.f12901oxmwwwfdhm);
        if (iZdlpuopuiu != 0) {
            this.f12896kcexrzcfyt.scrollBy(0, iZdlpuopuiu);
        }
        this.f12906wflxmlrfwp = fMax;
    }

    private int[] gtknphoqwx() {
        int[] iArr = this.f12889esjtqupxsv;
        int i13 = this.f12910zoijcleaow;
        iArr[0] = i13;
        iArr[1] = this.f12905vdvldrhtss - i13;
        return iArr;
    }

    private void jyumaefscl() {
        this.f12896kcexrzcfyt.btonecajqb(this);
        this.f12896kcexrzcfyt.wflxmlrfwp(this);
        this.f12896kcexrzcfyt.agtfadlqog(this.f12893istkbnxepw);
    }

    private void kcexrzcfyt(int i13) {
        lqeggnwhkg();
        this.f12896kcexrzcfyt.postDelayed(this.f12911zynmafqrjb, i13);
    }

    private void lqeggnwhkg() {
        this.f12896kcexrzcfyt.removeCallbacks(this.f12911zynmafqrjb);
    }

    private void nufgyqmvbu() {
        this.f12896kcexrzcfyt.o(this);
        this.f12896kcexrzcfyt.q(this);
        this.f12896kcexrzcfyt.r(this.f12893istkbnxepw);
        lqeggnwhkg();
    }

    private boolean ojitshcjhn() {
        return jhduphickx.lereixgezr(this.f12896kcexrzcfyt) == 1;
    }

    private int zdlpuopuiu(float f13, float f14, int[] iArr, int i13, int i14, int i15) {
        int i16 = iArr[1] - iArr[0];
        if (i16 == 0) {
            return 0;
        }
        int i17 = i13 - i15;
        int i18 = (int) (((f14 - f13) / i16) * i17);
        int i19 = i14 + i18;
        if (i19 >= i17 || i19 < 0) {
            return 0;
        }
        return i18;
    }

    void cqumvgiudr(int i13, int i14) {
        int iComputeVerticalScrollRange = this.f12896kcexrzcfyt.computeVerticalScrollRange();
        int i15 = this.f12901oxmwwwfdhm;
        this.f12909zdlpuopuiu = iComputeVerticalScrollRange - i15 > 0 && i15 >= this.f12892iobyxmoadg;
        int iComputeHorizontalScrollRange = this.f12896kcexrzcfyt.computeHorizontalScrollRange();
        int i16 = this.f12905vdvldrhtss;
        boolean z13 = iComputeHorizontalScrollRange - i16 > 0 && i16 >= this.f12892iobyxmoadg;
        this.f12908yggfygwlhe = z13;
        boolean z14 = this.f12909zdlpuopuiu;
        if (!z14 && !z13) {
            if (this.f12895jyumaefscl != 0) {
                yggfygwlhe(0);
                return;
            }
            return;
        }
        if (z14) {
            float f13 = i15;
            this.f12886draadjrbmk = (int) ((f13 * (i14 + (f13 / 2.0f))) / iComputeVerticalScrollRange);
            this.f12890gtknphoqwx = Math.min(i15, (i15 * i15) / iComputeVerticalScrollRange);
        }
        if (this.f12908yggfygwlhe) {
            float f14 = i16;
            this.f12900ojitshcjhn = (int) ((f14 * (i13 + (f14 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f12883agtfadlqog = Math.min(i16, (i16 * i16) / iComputeHorizontalScrollRange);
        }
        int i17 = this.f12895jyumaefscl;
        if (i17 == 0 || i17 == 1) {
            yggfygwlhe(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
    public void eablkybsjg(boolean z13) {
    }

    public void gxszxtbevo(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f12896kcexrzcfyt;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            nufgyqmvbu();
        }
        this.f12896kcexrzcfyt = recyclerView;
        if (recyclerView != null) {
            jyumaefscl();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
    public void iobyxmoadg(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12895jyumaefscl == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zVdvldrhtss = vdvldrhtss(motionEvent.getX(), motionEvent.getY());
            boolean zRgvfuqvkyq = rgvfuqvkyq(motionEvent.getX(), motionEvent.getY());
            if (zVdvldrhtss || zRgvfuqvkyq) {
                if (zRgvfuqvkyq) {
                    this.f12894iwizpuwonk = 1;
                    this.f12904rgvfuqvkyq = (int) motionEvent.getX();
                } else if (zVdvldrhtss) {
                    this.f12894iwizpuwonk = 2;
                    this.f12906wflxmlrfwp = (int) motionEvent.getY();
                }
                yggfygwlhe(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f12895jyumaefscl == 2) {
            this.f12906wflxmlrfwp = 0.0f;
            this.f12904rgvfuqvkyq = 0.0f;
            yggfygwlhe(1);
            this.f12894iwizpuwonk = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f12895jyumaefscl == 2) {
            iwizpuwonk();
            if (this.f12894iwizpuwonk == 1) {
                agtfadlqog(motionEvent.getX());
            }
            if (this.f12894iwizpuwonk == 2) {
                esjtqupxsv(motionEvent.getY());
            }
        }
    }

    public void iwizpuwonk() {
        int i13 = this.f12902pmvmpeiblj;
        if (i13 != 0) {
            if (i13 != 3) {
                return;
            } else {
                this.f12897lereixgezr.cancel();
            }
        }
        this.f12902pmvmpeiblj = 1;
        ValueAnimator valueAnimator = this.f12897lereixgezr;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f12897lereixgezr.setDuration(500L);
        this.f12897lereixgezr.setStartDelay(0L);
        this.f12897lereixgezr.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (this.f12905vdvldrhtss != this.f12896kcexrzcfyt.getWidth() || this.f12901oxmwwwfdhm != this.f12896kcexrzcfyt.getHeight()) {
            this.f12905vdvldrhtss = this.f12896kcexrzcfyt.getWidth();
            this.f12901oxmwwwfdhm = this.f12896kcexrzcfyt.getHeight();
            yggfygwlhe(0);
        } else if (this.f12902pmvmpeiblj != 0) {
            if (this.f12909zdlpuopuiu) {
                btonecajqb(canvas);
            }
            if (this.f12908yggfygwlhe) {
                dxjokdxxww(canvas);
            }
        }
    }

    void oxmwwwfdhm() {
        this.f12896kcexrzcfyt.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
    public boolean ppxfxbqfkf(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i13 = this.f12895jyumaefscl;
        if (i13 == 1) {
            boolean zVdvldrhtss = vdvldrhtss(motionEvent.getX(), motionEvent.getY());
            boolean zRgvfuqvkyq = rgvfuqvkyq(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zVdvldrhtss && !zRgvfuqvkyq) {
                return false;
            }
            if (zRgvfuqvkyq) {
                this.f12894iwizpuwonk = 1;
                this.f12904rgvfuqvkyq = (int) motionEvent.getX();
            } else if (zVdvldrhtss) {
                this.f12894iwizpuwonk = 2;
                this.f12906wflxmlrfwp = (int) motionEvent.getY();
            }
            yggfygwlhe(2);
        } else if (i13 != 2) {
            return false;
        }
        return true;
    }

    boolean rgvfuqvkyq(float f13, float f14) {
        if (f14 >= this.f12901oxmwwwfdhm - this.f12887dxjokdxxww) {
            int i13 = this.f12900ojitshcjhn;
            int i14 = this.f12883agtfadlqog;
            if (f13 >= i13 - (i14 / 2) && f13 <= i13 + (i14 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean vdvldrhtss(float f13, float f14) {
        if (!ojitshcjhn() ? f13 >= this.f12905vdvldrhtss - this.f12888eablkybsjg : f13 <= this.f12888eablkybsjg) {
            int i13 = this.f12886draadjrbmk;
            int i14 = this.f12890gtknphoqwx;
            if (f14 >= i13 - (i14 / 2) && f14 <= i13 + (i14 / 2)) {
                return true;
            }
        }
        return false;
    }

    void wflxmlrfwp(int i13) {
        int i14 = this.f12902pmvmpeiblj;
        if (i14 == 1) {
            this.f12897lereixgezr.cancel();
        } else if (i14 != 2) {
            return;
        }
        this.f12902pmvmpeiblj = 3;
        ValueAnimator valueAnimator = this.f12897lereixgezr;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f12897lereixgezr.setDuration(i13);
        this.f12897lereixgezr.start();
    }

    void yggfygwlhe(int i13) {
        if (i13 == 2 && this.f12895jyumaefscl != 2) {
            this.f12903ppxfxbqfkf.setState(f12881cdpycssgdh);
            lqeggnwhkg();
        }
        if (i13 == 0) {
            oxmwwwfdhm();
        } else {
            iwizpuwonk();
        }
        if (this.f12895jyumaefscl == 2 && i13 != 2) {
            this.f12903ppxfxbqfkf.setState(f12882yadqdtsiqt);
            kcexrzcfyt(1200);
        } else if (i13 == 1) {
            kcexrzcfyt(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f12895jyumaefscl = i13;
    }
}
