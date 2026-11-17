package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import kotlin.KotlinVersion;
import v1.iozdgvuglv;
import v1.jhduphickx;
import v1.lmojexxdyd;
import v1.wwaezpbzkn;
import v1.yadqdtsiqt;
import v1.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements wwaezpbzkn, lmojexxdyd, yadqdtsiqt {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private static final String f13324czzsidtyhn = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private static final int[] f13325uwvvkdfqfp = {R.attr.enabled};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final int[] f13326cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final DecelerateInterpolator f13327cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f13328cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private Animation f13329crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.iobyxmoadg f13330dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f13331esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f13332hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f13333hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f13334ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f13335iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final int[] f13336istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f13337iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    boolean f13338jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private Animation f13339jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    boolean f13340jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    boolean f13341jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private boolean f13342jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    float f13343kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ylkuphrtab f13344lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    int f13345lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    int f13346mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private final Animation f13347metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    int f13348ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    boolean f13349okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f13350pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final iozdgvuglv f13351pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private Animation f13352ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final Animation f13353rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private Animation f13354sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    protected int f13355stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    protected int f13356tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.zoijcleaow f13357ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private Animation f13358vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private float f13359wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f13360wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private Animation.AnimationListener f13361xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f13362yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    btonecajqb f13363yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f13364ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private View f13365zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final int[] f13366zynmafqrjb;

    public interface btonecajqb {
        void iobyxmoadg();
    }

    public interface dxjokdxxww {
    }

    class eablkybsjg implements Animation.AnimationListener {
        eablkybsjg() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f13340jpowsppfya) {
                return;
            }
            swipeRefreshLayout.cqumvgiudr(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class gxszxtbevo extends Animation {
        gxszxtbevo() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f13349okpsazkaxt ? swipeRefreshLayout.f13346mbcevpiqjq - Math.abs(swipeRefreshLayout.f13356tzroggbefp) : swipeRefreshLayout.f13346mbcevpiqjq;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i13 = swipeRefreshLayout2.f13355stevsuqkhv;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i13 + ((int) ((iAbs - i13) * f13))) - swipeRefreshLayout2.f13330dsvhmnatus.getTop());
            SwipeRefreshLayout.this.f13357ulzqkzuiru.eablkybsjg(1.0f - f13);
        }
    }

    class iobyxmoadg implements Animation.AnimationListener {
        iobyxmoadg() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            btonecajqb btonecajqbVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f13341jyumaefscl) {
                swipeRefreshLayout.oxmwwwfdhm();
                return;
            }
            swipeRefreshLayout.f13357ulzqkzuiru.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            SwipeRefreshLayout.this.f13357ulzqkzuiru.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f13338jhduphickx && (btonecajqbVar = swipeRefreshLayout2.f13363yggfygwlhe) != null) {
                btonecajqbVar.iobyxmoadg();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f13345lmojexxdyd = swipeRefreshLayout3.f13330dsvhmnatus.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class lqeggnwhkg extends Animation {
        lqeggnwhkg() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            SwipeRefreshLayout.this.ojitshcjhn(f13);
        }
    }

    class nufgyqmvbu extends Animation {
        nufgyqmvbu() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f14 = swipeRefreshLayout.f13343kegysxyocb;
            swipeRefreshLayout.setAnimationProgress(f14 + ((-f14) * f13));
            SwipeRefreshLayout.this.ojitshcjhn(f13);
        }
    }

    class ppxfxbqfkf extends Animation {
        ppxfxbqfkf() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f13);
        }
    }

    class wkgbmnqykc extends Animation {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f13375yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f13376zdlpuopuiu;

        wkgbmnqykc(int i13, int i14) {
            this.f13376zdlpuopuiu = i13;
            this.f13375yggfygwlhe = i14;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            androidx.swiperefreshlayout.widget.zoijcleaow zoijcleaowVar = SwipeRefreshLayout.this.f13357ulzqkzuiru;
            int i13 = this.f13376zdlpuopuiu;
            zoijcleaowVar.setAlpha((int) (i13 + ((this.f13375yggfygwlhe - i13) * f13)));
        }
    }

    class zoijcleaow extends Animation {
        zoijcleaow() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f13, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f13);
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13341jyumaefscl = false;
        this.f13328cqumvgiudr = -1.0f;
        this.f13366zynmafqrjb = new int[2];
        this.f13336istkbnxepw = new int[2];
        this.f13326cdpycssgdh = new int[2];
        this.f13332hcddaimhww = -1;
        this.f13360wypolnanlu = -1;
        this.f13361xrmfcynszj = new iobyxmoadg();
        this.f13347metgxyhuhe = new gxszxtbevo();
        this.f13353rlfsiqarku = new lqeggnwhkg();
        this.f13337iwizpuwonk = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13335iozdgvuglv = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f13327cllcsxoeiz = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13334ikoacuggdj = (int) (displayMetrics.density * 40.0f);
        wkgbmnqykc();
        setChildrenDrawingOrderEnabled(true);
        int i13 = (int) (displayMetrics.density * 64.0f);
        this.f13346mbcevpiqjq = i13;
        this.f13328cqumvgiudr = i13;
        this.f13344lereixgezr = new ylkuphrtab(this);
        this.f13351pmvmpeiblj = new iozdgvuglv(this);
        setNestedScrollingEnabled(true);
        int i14 = -this.f13334ikoacuggdj;
        this.f13345lmojexxdyd = i14;
        this.f13356tzroggbefp = i14;
        ojitshcjhn(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13325uwvvkdfqfp);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void draadjrbmk(float f13) {
        this.f13357ulzqkzuiru.wkgbmnqykc(true);
        float fMin = Math.min(1.0f, Math.abs(f13 / this.f13328cqumvgiudr));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f13) - this.f13328cqumvgiudr;
        int i13 = this.f13348ntlheqmsrt;
        if (i13 <= 0) {
            i13 = this.f13349okpsazkaxt ? this.f13346mbcevpiqjq - this.f13356tzroggbefp : this.f13346mbcevpiqjq;
        }
        float f14 = i13;
        double dMax = Math.max(0.0f, Math.min(fAbs, f14 * 2.0f) / f14) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i14 = this.f13356tzroggbefp + ((int) ((f14 * fMin) + (f14 * fPow * 2.0f)));
        if (this.f13330dsvhmnatus.getVisibility() != 0) {
            this.f13330dsvhmnatus.setVisibility(0);
        }
        if (!this.f13340jpowsppfya) {
            this.f13330dsvhmnatus.setScaleX(1.0f);
            this.f13330dsvhmnatus.setScaleY(1.0f);
        }
        if (this.f13340jpowsppfya) {
            setAnimationProgress(Math.min(1.0f, f13 / this.f13328cqumvgiudr));
        }
        if (f13 < this.f13328cqumvgiudr) {
            if (this.f13357ulzqkzuiru.getAlpha() > 76 && !nufgyqmvbu(this.f13339jlmebxxoox)) {
                iwizpuwonk();
            }
        } else if (this.f13357ulzqkzuiru.getAlpha() < 255 && !nufgyqmvbu(this.f13352ribwqtqdhb)) {
            jyumaefscl();
        }
        this.f13357ulzqkzuiru.btonecajqb(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f13357ulzqkzuiru.eablkybsjg(Math.min(1.0f, fMax));
        this.f13357ulzqkzuiru.lqeggnwhkg((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i14 - this.f13345lmojexxdyd);
    }

    private void esjtqupxsv(int i13, Animation.AnimationListener animationListener) {
        this.f13355stevsuqkhv = i13;
        this.f13343kegysxyocb = this.f13330dsvhmnatus.getScaleX();
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu();
        this.f13358vipkmwdibw = nufgyqmvbuVar;
        nufgyqmvbuVar.setDuration(150L);
        if (animationListener != null) {
            this.f13330dsvhmnatus.zoijcleaow(animationListener);
        }
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(this.f13358vipkmwdibw);
    }

    private void gxszxtbevo() {
        if (this.f13365zdlpuopuiu == null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (!childAt.equals(this.f13330dsvhmnatus)) {
                    this.f13365zdlpuopuiu = childAt;
                    return;
                }
            }
        }
    }

    private void iobyxmoadg(int i13, Animation.AnimationListener animationListener) {
        this.f13355stevsuqkhv = i13;
        this.f13347metgxyhuhe.reset();
        this.f13347metgxyhuhe.setDuration(200L);
        this.f13347metgxyhuhe.setInterpolator(this.f13327cllcsxoeiz);
        if (animationListener != null) {
            this.f13330dsvhmnatus.zoijcleaow(animationListener);
        }
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(this.f13347metgxyhuhe);
    }

    private void iwizpuwonk() {
        this.f13339jlmebxxoox = zdlpuopuiu(this.f13357ulzqkzuiru.getAlpha(), 76);
    }

    private void jyumaefscl() {
        this.f13352ribwqtqdhb = zdlpuopuiu(this.f13357ulzqkzuiru.getAlpha(), KotlinVersion.MAX_COMPONENT_VALUE);
    }

    private void kcexrzcfyt(boolean z13, boolean z14) {
        if (this.f13341jyumaefscl != z13) {
            this.f13338jhduphickx = z14;
            gxszxtbevo();
            this.f13341jyumaefscl = z13;
            if (z13) {
                iobyxmoadg(this.f13345lmojexxdyd, this.f13361xrmfcynszj);
            } else {
                cqumvgiudr(this.f13361xrmfcynszj);
            }
        }
    }

    private void lereixgezr(Animation.AnimationListener animationListener) {
        this.f13330dsvhmnatus.setVisibility(0);
        this.f13357ulzqkzuiru.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f13354sopmlzcsov = zoijcleaowVar;
        zoijcleaowVar.setDuration(this.f13335iozdgvuglv);
        if (animationListener != null) {
            this.f13330dsvhmnatus.zoijcleaow(animationListener);
        }
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(this.f13354sopmlzcsov);
    }

    private void lqeggnwhkg(float f13) {
        if (f13 > this.f13328cqumvgiudr) {
            kcexrzcfyt(true, true);
            return;
        }
        this.f13341jyumaefscl = false;
        this.f13357ulzqkzuiru.btonecajqb(0.0f, 0.0f);
        zoijcleaow(this.f13345lmojexxdyd, !this.f13340jpowsppfya ? new eablkybsjg() : null);
        this.f13357ulzqkzuiru.wkgbmnqykc(false);
    }

    private boolean nufgyqmvbu(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void setColorViewAlpha(int i13) {
        this.f13330dsvhmnatus.getBackground().setAlpha(i13);
        this.f13357ulzqkzuiru.setAlpha(i13);
    }

    private void vdvldrhtss(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13332hcddaimhww) {
            this.f13332hcddaimhww = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void wkgbmnqykc() {
        this.f13330dsvhmnatus = new androidx.swiperefreshlayout.widget.iobyxmoadg(getContext());
        androidx.swiperefreshlayout.widget.zoijcleaow zoijcleaowVar = new androidx.swiperefreshlayout.widget.zoijcleaow(getContext());
        this.f13357ulzqkzuiru = zoijcleaowVar;
        zoijcleaowVar.draadjrbmk(1);
        this.f13330dsvhmnatus.setImageDrawable(this.f13357ulzqkzuiru);
        this.f13330dsvhmnatus.setVisibility(8);
        addView(this.f13330dsvhmnatus);
    }

    private void yggfygwlhe(float f13) {
        float f14 = this.f13364ylkuphrtab;
        float f15 = f13 - f14;
        int i13 = this.f13337iwizpuwonk;
        if (f15 <= i13 || this.f13350pkzmftpjix) {
            return;
        }
        this.f13359wwaezpbzkn = f14 + i13;
        this.f13350pkzmftpjix = true;
        this.f13357ulzqkzuiru.setAlpha(76);
    }

    private Animation zdlpuopuiu(int i13, int i14) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(i13, i14);
        wkgbmnqykcVar.setDuration(300L);
        this.f13330dsvhmnatus.zoijcleaow(null);
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(wkgbmnqykcVar);
        return wkgbmnqykcVar;
    }

    private void zoijcleaow(int i13, Animation.AnimationListener animationListener) {
        if (this.f13340jpowsppfya) {
            esjtqupxsv(i13, animationListener);
            return;
        }
        this.f13355stevsuqkhv = i13;
        this.f13353rlfsiqarku.reset();
        this.f13353rlfsiqarku.setDuration(200L);
        this.f13353rlfsiqarku.setInterpolator(this.f13327cllcsxoeiz);
        if (animationListener != null) {
            this.f13330dsvhmnatus.zoijcleaow(animationListener);
        }
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(this.f13353rlfsiqarku);
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
        wflxmlrfwp(view, i13, i14, i15, i16, i17, this.f13326cdpycssgdh);
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        if (i13 == 0) {
            onStopNestedScroll(view);
        }
    }

    void cqumvgiudr(Animation.AnimationListener animationListener) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f13329crxdokpmqz = ppxfxbqfkfVar;
        ppxfxbqfkfVar.setDuration(150L);
        this.f13330dsvhmnatus.zoijcleaow(animationListener);
        this.f13330dsvhmnatus.clearAnimation();
        this.f13330dsvhmnatus.startAnimation(this.f13329crxdokpmqz);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f13351pmvmpeiblj.iobyxmoadg(f13, f14, z13);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f13351pmvmpeiblj.zoijcleaow(f13, f14);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return this.f13351pmvmpeiblj.ppxfxbqfkf(i13, i14, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f13351pmvmpeiblj.gxszxtbevo(i13, i14, i15, i16, iArr);
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        if (i14 == 0) {
            onNestedScrollAccepted(view, view2, i13);
        }
    }

    public void eablkybsjg(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        if (i17 == 0) {
            this.f13351pmvmpeiblj.eablkybsjg(i13, i14, i15, i16, iArr, i17, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i13, int i14) {
        int i15 = this.f13360wypolnanlu;
        if (i15 < 0) {
            return i14;
        }
        if (i14 == i13 - 1) {
            return i15;
        }
        return i14 >= i15 ? i14 + 1 : i14;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13344lereixgezr.iobyxmoadg();
    }

    public int getProgressCircleDiameter() {
        return this.f13334ikoacuggdj;
    }

    public int getProgressViewEndOffset() {
        return this.f13346mbcevpiqjq;
    }

    public int getProgressViewStartOffset() {
        return this.f13356tzroggbefp;
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            onNestedPreScroll(view, i13, i14, iArr);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f13351pmvmpeiblj.btonecajqb();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f13351pmvmpeiblj.draadjrbmk();
    }

    void ojitshcjhn(float f13) {
        int i13 = this.f13355stevsuqkhv;
        setTargetOffsetTopAndBottom((i13 + ((int) ((this.f13356tzroggbefp - i13) * f13))) - this.f13330dsvhmnatus.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oxmwwwfdhm();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gxszxtbevo();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13333hkdspvbjdz && actionMasked == 0) {
            this.f13333hkdspvbjdz = false;
        }
        if (!isEnabled() || this.f13333hkdspvbjdz || ppxfxbqfkf() || this.f13341jyumaefscl || this.f13362yadqdtsiqt) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f13356tzroggbefp - this.f13330dsvhmnatus.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f13332hcddaimhww = pointerId;
            this.f13350pkzmftpjix = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f13364ylkuphrtab = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f13350pkzmftpjix = false;
            this.f13332hcddaimhww = -1;
        } else if (actionMasked == 2) {
            int i13 = this.f13332hcddaimhww;
            if (i13 == -1) {
                Log.e(f13324czzsidtyhn, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i13);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            yggfygwlhe(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f13350pkzmftpjix = false;
            this.f13332hcddaimhww = -1;
        } else if (actionMasked == 6) {
            vdvldrhtss(motionEvent);
        }
        return this.f13350pkzmftpjix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f13365zdlpuopuiu == null) {
            gxszxtbevo();
        }
        View view = this.f13365zdlpuopuiu;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f13330dsvhmnatus.getMeasuredWidth();
        int measuredHeight2 = this.f13330dsvhmnatus.getMeasuredHeight();
        int i17 = measuredWidth / 2;
        int i18 = measuredWidth2 / 2;
        int i19 = this.f13345lmojexxdyd;
        this.f13330dsvhmnatus.layout(i17 - i18, i19, i17 + i18, measuredHeight2 + i19);
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f13365zdlpuopuiu == null) {
            gxszxtbevo();
        }
        View view = this.f13365zdlpuopuiu;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f13330dsvhmnatus.measure(View.MeasureSpec.makeMeasureSpec(this.f13334ikoacuggdj, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13334ikoacuggdj, 1073741824));
        this.f13360wypolnanlu = -1;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            if (getChildAt(i15) == this.f13330dsvhmnatus) {
                this.f13360wypolnanlu = i15;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return dispatchNestedFling(f13, f14, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        return dispatchNestedPreFling(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        if (i14 > 0) {
            float f13 = this.f13331esjtqupxsv;
            if (f13 > 0.0f) {
                float f14 = i14;
                if (f14 > f13) {
                    iArr[1] = (int) f13;
                    this.f13331esjtqupxsv = 0.0f;
                } else {
                    this.f13331esjtqupxsv = f13 - f14;
                    iArr[1] = i14;
                }
                draadjrbmk(this.f13331esjtqupxsv);
            }
        }
        if (this.f13349okpsazkaxt && i14 > 0 && this.f13331esjtqupxsv == 0.0f && Math.abs(i14 - iArr[1]) > 0) {
            this.f13330dsvhmnatus.setVisibility(8);
        }
        int[] iArr2 = this.f13366zynmafqrjb;
        if (dispatchNestedPreScroll(i13 - iArr[0], i14 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        wflxmlrfwp(view, i13, i14, i15, i16, 0, this.f13326cdpycssgdh);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        this.f13344lereixgezr.zoijcleaow(view, view2, i13);
        startNestedScroll(i13 & 2);
        this.f13331esjtqupxsv = 0.0f;
        this.f13362yadqdtsiqt = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f13367zdlpuopuiu);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f13341jyumaefscl);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return (!isEnabled() || this.f13333hkdspvbjdz || this.f13341jyumaefscl || (i13 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f13344lereixgezr.wkgbmnqykc(view);
        this.f13362yadqdtsiqt = false;
        float f13 = this.f13331esjtqupxsv;
        if (f13 > 0.0f) {
            lqeggnwhkg(f13);
            this.f13331esjtqupxsv = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13333hkdspvbjdz && actionMasked == 0) {
            this.f13333hkdspvbjdz = false;
        }
        if (!isEnabled() || this.f13333hkdspvbjdz || ppxfxbqfkf() || this.f13341jyumaefscl || this.f13362yadqdtsiqt) {
            return false;
        }
        if (actionMasked == 0) {
            this.f13332hcddaimhww = motionEvent.getPointerId(0);
            this.f13350pkzmftpjix = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f13332hcddaimhww);
                if (iFindPointerIndex < 0) {
                    Log.e(f13324czzsidtyhn, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f13350pkzmftpjix) {
                    float y13 = (motionEvent.getY(iFindPointerIndex) - this.f13359wwaezpbzkn) * 0.5f;
                    this.f13350pkzmftpjix = false;
                    lqeggnwhkg(y13);
                }
                this.f13332hcddaimhww = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f13332hcddaimhww);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f13324czzsidtyhn, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y14 = motionEvent.getY(iFindPointerIndex2);
                yggfygwlhe(y14);
                if (this.f13350pkzmftpjix) {
                    float f13 = (y14 - this.f13359wwaezpbzkn) * 0.5f;
                    if (f13 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    draadjrbmk(f13);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f13324czzsidtyhn, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f13332hcddaimhww = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    vdvldrhtss(motionEvent);
                }
            }
        }
        return true;
    }

    void oxmwwwfdhm() {
        this.f13330dsvhmnatus.clearAnimation();
        this.f13357ulzqkzuiru.stop();
        this.f13330dsvhmnatus.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        if (this.f13340jpowsppfya) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f13356tzroggbefp - this.f13345lmojexxdyd);
        }
        this.f13345lmojexxdyd = this.f13330dsvhmnatus.getTop();
    }

    public boolean ppxfxbqfkf() {
        View view = this.f13365zdlpuopuiu;
        return view instanceof ListView ? androidx.core.widget.lqeggnwhkg.iobyxmoadg((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z13) {
        ViewParent parent;
        View view = this.f13365zdlpuopuiu;
        if (view == null || jhduphickx.mbcevpiqjq(view)) {
            super.requestDisallowInterceptTouchEvent(z13);
        } else {
            if (this.f13342jztzpxfvev || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z13);
        }
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        if (i14 == 0) {
            return onStartNestedScroll(view, view2, i13);
        }
        return false;
    }

    void setAnimationProgress(float f13) {
        this.f13330dsvhmnatus.setScaleX(f13);
        this.f13330dsvhmnatus.setScaleY(f13);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        gxszxtbevo();
        this.f13357ulzqkzuiru.gxszxtbevo(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr2[i13] = androidx.core.content.iobyxmoadg.getColor(context, iArr[i13]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i13) {
        this.f13328cqumvgiudr = i13;
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        if (z13) {
            return;
        }
        oxmwwwfdhm();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z13) {
        this.f13342jztzpxfvev = z13;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z13) {
        this.f13351pmvmpeiblj.wflxmlrfwp(z13);
    }

    public void setOnChildScrollUpCallback(dxjokdxxww dxjokdxxwwVar) {
    }

    public void setOnRefreshListener(btonecajqb btonecajqbVar) {
        this.f13363yggfygwlhe = btonecajqbVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i13) {
        setProgressBackgroundColorSchemeResource(i13);
    }

    public void setProgressBackgroundColorSchemeColor(int i13) {
        this.f13330dsvhmnatus.setBackgroundColor(i13);
    }

    public void setProgressBackgroundColorSchemeResource(int i13) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.iobyxmoadg.getColor(getContext(), i13));
    }

    public void setRefreshing(boolean z13) {
        if (!z13 || this.f13341jyumaefscl == z13) {
            kcexrzcfyt(z13, false);
            return;
        }
        this.f13341jyumaefscl = z13;
        setTargetOffsetTopAndBottom((!this.f13349okpsazkaxt ? this.f13346mbcevpiqjq + this.f13356tzroggbefp : this.f13346mbcevpiqjq) - this.f13345lmojexxdyd);
        this.f13338jhduphickx = false;
        lereixgezr(this.f13361xrmfcynszj);
    }

    public void setSize(int i13) {
        if (i13 == 0 || i13 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i13 == 0) {
                this.f13334ikoacuggdj = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f13334ikoacuggdj = (int) (displayMetrics.density * 40.0f);
            }
            this.f13330dsvhmnatus.setImageDrawable(null);
            this.f13357ulzqkzuiru.draadjrbmk(i13);
            this.f13330dsvhmnatus.setImageDrawable(this.f13357ulzqkzuiru);
        }
    }

    public void setSlingshotDistance(int i13) {
        this.f13348ntlheqmsrt = i13;
    }

    void setTargetOffsetTopAndBottom(int i13) {
        this.f13330dsvhmnatus.bringToFront();
        jhduphickx.ribwqtqdhb(this.f13330dsvhmnatus, i13);
        this.f13345lmojexxdyd = this.f13330dsvhmnatus.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i13) {
        return this.f13351pmvmpeiblj.ojitshcjhn(i13);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f13351pmvmpeiblj.vdvldrhtss();
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (i17 != 0) {
            return;
        }
        int i18 = iArr[1];
        eablkybsjg(i13, i14, i15, i16, this.f13336istkbnxepw, i17, iArr);
        int i19 = i16 - (iArr[1] - i18);
        int i23 = i19 == 0 ? i16 + this.f13336istkbnxepw[1] : i19;
        if (i23 >= 0 || ppxfxbqfkf()) {
            return;
        }
        float fAbs = this.f13331esjtqupxsv + Math.abs(i23);
        this.f13331esjtqupxsv = fAbs;
        draadjrbmk(fAbs);
        iArr[1] = iArr[1] + i19;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final boolean f13367zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        SavedState(Parcelable parcelable, boolean z13) {
            super(parcelable);
            this.f13367zdlpuopuiu = z13;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeByte(this.f13367zdlpuopuiu ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f13367zdlpuopuiu = parcel.readByte() != 0;
        }
    }
}
