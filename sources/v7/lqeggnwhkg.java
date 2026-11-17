package v7;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends iobyxmoadg implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private com.airbnb.lottie.btonecajqb f116271yadqdtsiqt;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f116267iwizpuwonk = 1.0f;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f116263cqumvgiudr = false;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f116264esjtqupxsv = 0;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f116268lereixgezr = 0.0f;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f116270pmvmpeiblj = 0.0f;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f116272zynmafqrjb = 0;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float f116266istkbnxepw = -2.14748365E9f;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float f116262cdpycssgdh = 2.14748365E9f;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    protected boolean f116265iozdgvuglv = false;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f116269lmojexxdyd = false;

    private float agtfadlqog() {
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        if (btonecajqbVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / btonecajqbVar.dxjokdxxww()) / Math.abs(this.f116267iwizpuwonk);
    }

    private void lmojexxdyd() {
        if (this.f116271yadqdtsiqt == null) {
            return;
        }
        float f13 = this.f116270pmvmpeiblj;
        if (f13 < this.f116266istkbnxepw || f13 > this.f116262cdpycssgdh) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f116266istkbnxepw), Float.valueOf(this.f116262cdpycssgdh), Float.valueOf(this.f116270pmvmpeiblj)));
        }
    }

    private boolean oxmwwwfdhm() {
        return vdvldrhtss() < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        iobyxmoadg();
        jyumaefscl();
    }

    public void cdpycssgdh(int i13) {
        istkbnxepw(i13, (int) this.f116262cdpycssgdh);
    }

    public void cqumvgiudr() {
        this.f116265iozdgvuglv = true;
        yggfygwlhe();
        this.f116264esjtqupxsv = 0L;
        if (oxmwwwfdhm() && wflxmlrfwp() == rgvfuqvkyq()) {
            pmvmpeiblj(ojitshcjhn());
        } else if (!oxmwwwfdhm() && wflxmlrfwp() == ojitshcjhn()) {
            pmvmpeiblj(rgvfuqvkyq());
        }
        eablkybsjg();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j13) {
        yggfygwlhe();
        if (this.f116271yadqdtsiqt == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("LottieValueAnimator#doFrame");
        long j14 = this.f116264esjtqupxsv;
        float fAgtfadlqog = (j14 != 0 ? j13 - j14 : 0L) / agtfadlqog();
        float f13 = this.f116268lereixgezr;
        if (oxmwwwfdhm()) {
            fAgtfadlqog = -fAgtfadlqog;
        }
        float f14 = f13 + fAgtfadlqog;
        boolean zWkgbmnqykc = dxjokdxxww.wkgbmnqykc(f14, rgvfuqvkyq(), ojitshcjhn());
        float f15 = this.f116268lereixgezr;
        float fZoijcleaow = dxjokdxxww.zoijcleaow(f14, rgvfuqvkyq(), ojitshcjhn());
        this.f116268lereixgezr = fZoijcleaow;
        if (this.f116269lmojexxdyd) {
            fZoijcleaow = (float) Math.floor(fZoijcleaow);
        }
        this.f116270pmvmpeiblj = fZoijcleaow;
        this.f116264esjtqupxsv = j13;
        if (!this.f116269lmojexxdyd || this.f116268lereixgezr != f15) {
            lqeggnwhkg();
        }
        if (!zWkgbmnqykc) {
            if (getRepeatCount() == -1 || this.f116272zynmafqrjb < getRepeatCount()) {
                wkgbmnqykc();
                this.f116272zynmafqrjb++;
                if (getRepeatMode() == 2) {
                    this.f116263cqumvgiudr = !this.f116263cqumvgiudr;
                    esjtqupxsv();
                } else {
                    float fOjitshcjhn = oxmwwwfdhm() ? ojitshcjhn() : rgvfuqvkyq();
                    this.f116268lereixgezr = fOjitshcjhn;
                    this.f116270pmvmpeiblj = fOjitshcjhn;
                }
                this.f116264esjtqupxsv = j13;
            } else {
                float fRgvfuqvkyq = this.f116267iwizpuwonk < 0.0f ? rgvfuqvkyq() : ojitshcjhn();
                this.f116268lereixgezr = fRgvfuqvkyq;
                this.f116270pmvmpeiblj = fRgvfuqvkyq;
                jyumaefscl();
                zoijcleaow(oxmwwwfdhm());
            }
        }
        lmojexxdyd();
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("LottieValueAnimator#doFrame");
    }

    public float draadjrbmk() {
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        if (btonecajqbVar == null) {
            return 0.0f;
        }
        return (this.f116270pmvmpeiblj - btonecajqbVar.rgvfuqvkyq()) / (this.f116271yadqdtsiqt.gxszxtbevo() - this.f116271yadqdtsiqt.rgvfuqvkyq());
    }

    public void esjtqupxsv() {
        yadqdtsiqt(-vdvldrhtss());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fRgvfuqvkyq;
        float fOjitshcjhn;
        float fRgvfuqvkyq2;
        if (this.f116271yadqdtsiqt == null) {
            return 0.0f;
        }
        if (oxmwwwfdhm()) {
            fRgvfuqvkyq = ojitshcjhn() - this.f116270pmvmpeiblj;
            fOjitshcjhn = ojitshcjhn();
            fRgvfuqvkyq2 = rgvfuqvkyq();
        } else {
            fRgvfuqvkyq = this.f116270pmvmpeiblj - rgvfuqvkyq();
            fOjitshcjhn = ojitshcjhn();
            fRgvfuqvkyq2 = rgvfuqvkyq();
        }
        return fRgvfuqvkyq / (fOjitshcjhn - fRgvfuqvkyq2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(draadjrbmk());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        if (btonecajqbVar == null) {
            return 0L;
        }
        return (long) btonecajqbVar.wkgbmnqykc();
    }

    public void gtknphoqwx() {
        jyumaefscl();
        zoijcleaow(oxmwwwfdhm());
    }

    @Override // v7.iobyxmoadg
    void iobyxmoadg() {
        super.iobyxmoadg();
        zoijcleaow(oxmwwwfdhm());
    }

    public void iozdgvuglv(boolean z13) {
        this.f116269lmojexxdyd = z13;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f116265iozdgvuglv;
    }

    public void istkbnxepw(float f13, float f14) {
        if (f13 > f14) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f13), Float.valueOf(f14)));
        }
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        float fRgvfuqvkyq = btonecajqbVar == null ? -3.4028235E38f : btonecajqbVar.rgvfuqvkyq();
        com.airbnb.lottie.btonecajqb btonecajqbVar2 = this.f116271yadqdtsiqt;
        float fGxszxtbevo = btonecajqbVar2 == null ? Float.MAX_VALUE : btonecajqbVar2.gxszxtbevo();
        float fZoijcleaow = dxjokdxxww.zoijcleaow(f13, fRgvfuqvkyq, fGxszxtbevo);
        float fZoijcleaow2 = dxjokdxxww.zoijcleaow(f14, fRgvfuqvkyq, fGxszxtbevo);
        if (fZoijcleaow == this.f116266istkbnxepw && fZoijcleaow2 == this.f116262cdpycssgdh) {
            return;
        }
        this.f116266istkbnxepw = fZoijcleaow;
        this.f116262cdpycssgdh = fZoijcleaow2;
        pmvmpeiblj((int) dxjokdxxww.zoijcleaow(this.f116270pmvmpeiblj, fZoijcleaow, fZoijcleaow2));
    }

    protected void iwizpuwonk(boolean z13) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z13) {
            this.f116265iozdgvuglv = false;
        }
    }

    protected void jyumaefscl() {
        iwizpuwonk(true);
    }

    public void kcexrzcfyt() {
        jyumaefscl();
        ppxfxbqfkf();
    }

    public void lereixgezr(com.airbnb.lottie.btonecajqb btonecajqbVar) {
        boolean z13 = this.f116271yadqdtsiqt == null;
        this.f116271yadqdtsiqt = btonecajqbVar;
        if (z13) {
            istkbnxepw(Math.max(this.f116266istkbnxepw, btonecajqbVar.rgvfuqvkyq()), Math.min(this.f116262cdpycssgdh, btonecajqbVar.gxszxtbevo()));
        } else {
            istkbnxepw((int) btonecajqbVar.rgvfuqvkyq(), (int) btonecajqbVar.gxszxtbevo());
        }
        float f13 = this.f116270pmvmpeiblj;
        this.f116270pmvmpeiblj = 0.0f;
        this.f116268lereixgezr = 0.0f;
        pmvmpeiblj((int) f13);
        lqeggnwhkg();
    }

    public void nufgyqmvbu() {
        this.f116271yadqdtsiqt = null;
        this.f116266istkbnxepw = -2.14748365E9f;
        this.f116262cdpycssgdh = 2.14748365E9f;
    }

    public float ojitshcjhn() {
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        if (btonecajqbVar == null) {
            return 0.0f;
        }
        float f13 = this.f116262cdpycssgdh;
        return f13 == 2.14748365E9f ? btonecajqbVar.gxszxtbevo() : f13;
    }

    public void pmvmpeiblj(float f13) {
        if (this.f116268lereixgezr == f13) {
            return;
        }
        float fZoijcleaow = dxjokdxxww.zoijcleaow(f13, rgvfuqvkyq(), ojitshcjhn());
        this.f116268lereixgezr = fZoijcleaow;
        if (this.f116269lmojexxdyd) {
            fZoijcleaow = (float) Math.floor(fZoijcleaow);
        }
        this.f116270pmvmpeiblj = fZoijcleaow;
        this.f116264esjtqupxsv = 0L;
        lqeggnwhkg();
    }

    public float rgvfuqvkyq() {
        com.airbnb.lottie.btonecajqb btonecajqbVar = this.f116271yadqdtsiqt;
        if (btonecajqbVar == null) {
            return 0.0f;
        }
        float f13 = this.f116266istkbnxepw;
        return f13 == -2.14748365E9f ? btonecajqbVar.rgvfuqvkyq() : f13;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i13) {
        super.setRepeatMode(i13);
        if (i13 == 2 || !this.f116263cqumvgiudr) {
            return;
        }
        this.f116263cqumvgiudr = false;
        esjtqupxsv();
    }

    public float vdvldrhtss() {
        return this.f116267iwizpuwonk;
    }

    public float wflxmlrfwp() {
        return this.f116270pmvmpeiblj;
    }

    public void yadqdtsiqt(float f13) {
        this.f116267iwizpuwonk = f13;
    }

    protected void yggfygwlhe() {
        if (isRunning()) {
            iwizpuwonk(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void zdlpuopuiu() {
        this.f116265iozdgvuglv = true;
        gxszxtbevo(oxmwwwfdhm());
        pmvmpeiblj((int) (oxmwwwfdhm() ? ojitshcjhn() : rgvfuqvkyq()));
        this.f116264esjtqupxsv = 0L;
        this.f116272zynmafqrjb = 0;
        yggfygwlhe();
    }

    public void zynmafqrjb(float f13) {
        istkbnxepw(this.f116266istkbnxepw, f13);
    }
}
