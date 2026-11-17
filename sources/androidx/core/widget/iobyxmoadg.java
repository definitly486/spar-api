package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements View.OnTouchListener {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final int f8546hcddaimhww = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    boolean f8550iozdgvuglv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Runnable f8552iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final View f8553jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f8554lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    boolean f8555lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f8556pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f8557pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    boolean f8558wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f8559yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f8561ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final C0137iobyxmoadg f8562zdlpuopuiu = new C0137iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Interpolator f8560yggfygwlhe = new AccelerateInterpolator();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float[] f8548cqumvgiudr = {0.0f, 0.0f};

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float[] f8549esjtqupxsv = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float[] f8563zynmafqrjb = {0.0f, 0.0f};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float[] f8551istkbnxepw = {0.0f, 0.0f};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float[] f8547cdpycssgdh = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0137iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private float f8564btonecajqb;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f8567gtknphoqwx;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f8569iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float f8572ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private float f8573wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f8574zoijcleaow;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f8566eablkybsjg = Long.MIN_VALUE;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private long f8565dxjokdxxww = -1;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f8568gxszxtbevo = 0;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f8570lqeggnwhkg = 0;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f8571nufgyqmvbu = 0;

        C0137iobyxmoadg() {
        }

        private float eablkybsjg(long j13) {
            long j14 = this.f8566eablkybsjg;
            if (j13 < j14) {
                return 0.0f;
            }
            long j15 = this.f8565dxjokdxxww;
            if (j15 < 0 || j13 < j15) {
                return iobyxmoadg.eablkybsjg((j13 - j14) / this.f8569iobyxmoadg, 0.0f, 1.0f) * 0.5f;
            }
            float f13 = this.f8564btonecajqb;
            return (1.0f - f13) + (f13 * iobyxmoadg.eablkybsjg((j13 - j15) / this.f8567gtknphoqwx, 0.0f, 1.0f));
        }

        private float lqeggnwhkg(float f13) {
            return ((-4.0f) * f13 * f13) + (f13 * 4.0f);
        }

        public void btonecajqb(int i13) {
            this.f8574zoijcleaow = i13;
        }

        public void draadjrbmk(float f13, float f14) {
            this.f8572ppxfxbqfkf = f13;
            this.f8573wkgbmnqykc = f14;
        }

        public void dxjokdxxww() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f8567gtknphoqwx = iobyxmoadg.gxszxtbevo((int) (jCurrentAnimationTimeMillis - this.f8566eablkybsjg), 0, this.f8574zoijcleaow);
            this.f8564btonecajqb = eablkybsjg(jCurrentAnimationTimeMillis);
            this.f8565dxjokdxxww = jCurrentAnimationTimeMillis;
        }

        public void gtknphoqwx(int i13) {
            this.f8569iobyxmoadg = i13;
        }

        public int gxszxtbevo() {
            float f13 = this.f8573wkgbmnqykc;
            return (int) (f13 / Math.abs(f13));
        }

        public void iobyxmoadg() {
            if (this.f8568gxszxtbevo == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fLqeggnwhkg = lqeggnwhkg(eablkybsjg(jCurrentAnimationTimeMillis));
            long j13 = jCurrentAnimationTimeMillis - this.f8568gxszxtbevo;
            this.f8568gxszxtbevo = jCurrentAnimationTimeMillis;
            float f13 = j13 * fLqeggnwhkg;
            this.f8570lqeggnwhkg = (int) (this.f8572ppxfxbqfkf * f13);
            this.f8571nufgyqmvbu = (int) (f13 * this.f8573wkgbmnqykc);
        }

        public boolean nufgyqmvbu() {
            return this.f8565dxjokdxxww > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f8565dxjokdxxww + ((long) this.f8567gtknphoqwx);
        }

        public int ppxfxbqfkf() {
            return this.f8571nufgyqmvbu;
        }

        public void wflxmlrfwp() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f8566eablkybsjg = jCurrentAnimationTimeMillis;
            this.f8565dxjokdxxww = -1L;
            this.f8568gxszxtbevo = jCurrentAnimationTimeMillis;
            this.f8564btonecajqb = 0.5f;
            this.f8570lqeggnwhkg = 0;
            this.f8571nufgyqmvbu = 0;
        }

        public int wkgbmnqykc() {
            float f13 = this.f8572ppxfxbqfkf;
            return (int) (f13 / Math.abs(f13));
        }

        public int zoijcleaow() {
            return this.f8570lqeggnwhkg;
        }
    }

    private class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            if (iobyxmoadgVar.f8558wwaezpbzkn) {
                if (iobyxmoadgVar.f8550iozdgvuglv) {
                    iobyxmoadgVar.f8550iozdgvuglv = false;
                    iobyxmoadgVar.f8562zdlpuopuiu.wflxmlrfwp();
                }
                C0137iobyxmoadg c0137iobyxmoadg = iobyxmoadg.this.f8562zdlpuopuiu;
                if (c0137iobyxmoadg.nufgyqmvbu() || !iobyxmoadg.this.yggfygwlhe()) {
                    iobyxmoadg.this.f8558wwaezpbzkn = false;
                    return;
                }
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                if (iobyxmoadgVar2.f8555lmojexxdyd) {
                    iobyxmoadgVar2.f8555lmojexxdyd = false;
                    iobyxmoadgVar2.ppxfxbqfkf();
                }
                c0137iobyxmoadg.iobyxmoadg();
                iobyxmoadg.this.btonecajqb(c0137iobyxmoadg.zoijcleaow(), c0137iobyxmoadg.ppxfxbqfkf());
                jhduphickx.metgxyhuhe(iobyxmoadg.this.f8553jyumaefscl, this);
            }
        }
    }

    public iobyxmoadg(View view) {
        this.f8553jyumaefscl = view;
        float f13 = Resources.getSystem().getDisplayMetrics().density;
        float f14 = (int) ((1575.0f * f13) + 0.5f);
        ojitshcjhn(f14, f14);
        float f15 = (int) ((f13 * 315.0f) + 0.5f);
        rgvfuqvkyq(f15, f15);
        draadjrbmk(1);
        agtfadlqog(Float.MAX_VALUE, Float.MAX_VALUE);
        kcexrzcfyt(0.2f, 0.2f);
        zdlpuopuiu(1.0f, 1.0f);
        gtknphoqwx(f8546hcddaimhww);
        oxmwwwfdhm(500);
        vdvldrhtss(500);
    }

    private void dxjokdxxww() {
        if (this.f8550iozdgvuglv) {
            this.f8558wwaezpbzkn = false;
        } else {
            this.f8562zdlpuopuiu.dxjokdxxww();
        }
    }

    static float eablkybsjg(float f13, float f14, float f15) {
        if (f13 > f15) {
            return f15;
        }
        return f13 < f14 ? f14 : f13;
    }

    static int gxszxtbevo(int i13, int i14, int i15) {
        if (i13 > i15) {
            return i15;
        }
        return i13 < i14 ? i14 : i13;
    }

    private void jyumaefscl() {
        int i13;
        if (this.f8552iwizpuwonk == null) {
            this.f8552iwizpuwonk = new zoijcleaow();
        }
        this.f8558wwaezpbzkn = true;
        this.f8550iozdgvuglv = true;
        if (this.f8559yadqdtsiqt || (i13 = this.f8557pmvmpeiblj) <= 0) {
            this.f8552iwizpuwonk.run();
        } else {
            jhduphickx.rlfsiqarku(this.f8553jyumaefscl, this.f8552iwizpuwonk, i13);
        }
        this.f8559yadqdtsiqt = true;
    }

    private float lqeggnwhkg(float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        int i13 = this.f8554lereixgezr;
        if (i13 == 0 || i13 == 1) {
            if (f13 < f14) {
                if (f13 >= 0.0f) {
                    return 1.0f - (f13 / f14);
                }
                if (this.f8558wwaezpbzkn && i13 == 1) {
                    return 1.0f;
                }
            }
        } else if (i13 == 2 && f13 < 0.0f) {
            return f13 / (-f14);
        }
        return 0.0f;
    }

    private float nufgyqmvbu(float f13, float f14, float f15, float f16) {
        float interpolation;
        float fEablkybsjg = eablkybsjg(f13 * f14, 0.0f, f15);
        float fLqeggnwhkg = lqeggnwhkg(f14 - f16, fEablkybsjg) - lqeggnwhkg(f16, fEablkybsjg);
        if (fLqeggnwhkg < 0.0f) {
            interpolation = -this.f8560yggfygwlhe.getInterpolation(-fLqeggnwhkg);
        } else {
            if (fLqeggnwhkg <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f8560yggfygwlhe.getInterpolation(fLqeggnwhkg);
        }
        return eablkybsjg(interpolation, -1.0f, 1.0f);
    }

    private float wkgbmnqykc(int i13, float f13, float f14, float f15) {
        float fNufgyqmvbu = nufgyqmvbu(this.f8548cqumvgiudr[i13], f14, this.f8549esjtqupxsv[i13], f13);
        if (fNufgyqmvbu == 0.0f) {
            return 0.0f;
        }
        float f16 = this.f8563zynmafqrjb[i13];
        float f17 = this.f8551istkbnxepw[i13];
        float f18 = this.f8547cdpycssgdh[i13];
        float f19 = f16 * f15;
        return fNufgyqmvbu > 0.0f ? eablkybsjg(fNufgyqmvbu * f19, f17, f18) : -eablkybsjg((-fNufgyqmvbu) * f19, f17, f18);
    }

    public iobyxmoadg agtfadlqog(float f13, float f14) {
        float[] fArr = this.f8549esjtqupxsv;
        fArr[0] = f13;
        fArr[1] = f14;
        return this;
    }

    public abstract void btonecajqb(int i13, int i14);

    public iobyxmoadg draadjrbmk(int i13) {
        this.f8554lereixgezr = i13;
        return this;
    }

    public iobyxmoadg gtknphoqwx(int i13) {
        this.f8557pmvmpeiblj = i13;
        return this;
    }

    public abstract boolean iobyxmoadg(int i13);

    public iobyxmoadg kcexrzcfyt(float f13, float f14) {
        float[] fArr = this.f8548cqumvgiudr;
        fArr[0] = f13;
        fArr[1] = f14;
        return this;
    }

    public iobyxmoadg ojitshcjhn(float f13, float f14) {
        float[] fArr = this.f8547cdpycssgdh;
        fArr[0] = f13 / 1000.0f;
        fArr[1] = f14 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f8561ylkuphrtab) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                dxjokdxxww();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    dxjokdxxww();
                }
            }
            return this.f8556pkzmftpjix && this.f8558wwaezpbzkn;
        }
        this.f8555lmojexxdyd = true;
        this.f8559yadqdtsiqt = false;
        this.f8562zdlpuopuiu.draadjrbmk(wkgbmnqykc(0, motionEvent.getX(), view.getWidth(), this.f8553jyumaefscl.getWidth()), wkgbmnqykc(1, motionEvent.getY(), view.getHeight(), this.f8553jyumaefscl.getHeight()));
        if (!this.f8558wwaezpbzkn && yggfygwlhe()) {
            jyumaefscl();
        }
        if (this.f8556pkzmftpjix) {
            return false;
        }
    }

    public iobyxmoadg oxmwwwfdhm(int i13) {
        this.f8562zdlpuopuiu.gtknphoqwx(i13);
        return this;
    }

    void ppxfxbqfkf() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f8553jyumaefscl.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public iobyxmoadg rgvfuqvkyq(float f13, float f14) {
        float[] fArr = this.f8551istkbnxepw;
        fArr[0] = f13 / 1000.0f;
        fArr[1] = f14 / 1000.0f;
        return this;
    }

    public iobyxmoadg vdvldrhtss(int i13) {
        this.f8562zdlpuopuiu.btonecajqb(i13);
        return this;
    }

    public iobyxmoadg wflxmlrfwp(boolean z13) {
        if (this.f8561ylkuphrtab && !z13) {
            dxjokdxxww();
        }
        this.f8561ylkuphrtab = z13;
        return this;
    }

    boolean yggfygwlhe() {
        C0137iobyxmoadg c0137iobyxmoadg = this.f8562zdlpuopuiu;
        int iGxszxtbevo = c0137iobyxmoadg.gxszxtbevo();
        int iWkgbmnqykc = c0137iobyxmoadg.wkgbmnqykc();
        return (iGxszxtbevo != 0 && zoijcleaow(iGxszxtbevo)) || (iWkgbmnqykc != 0 && iobyxmoadg(iWkgbmnqykc));
    }

    public iobyxmoadg zdlpuopuiu(float f13, float f14) {
        float[] fArr = this.f8563zynmafqrjb;
        fArr[0] = f13 / 1000.0f;
        fArr[1] = f14 / 1000.0f;
        return this;
    }

    public abstract boolean zoijcleaow(int i13);
}
