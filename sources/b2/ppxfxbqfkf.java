package b2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Interpolator f14979cqumvgiudr = new iobyxmoadg();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f14980agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int[] f14981btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private VelocityTracker f14982draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int[] f14983dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float[] f14984eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f14985gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float[] f14986gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f14987iobyxmoadg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ViewGroup f14989jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final AbstractC0251ppxfxbqfkf f14990kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float[] f14991lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int[] f14992nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f14993ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private OverScroller f14994oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final int f14996rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f14997vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f14998wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float[] f14999wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f15000yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private View f15001zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f15002zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f14995ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Runnable f14988iwizpuwonk = new zoijcleaow();

    class iobyxmoadg implements Interpolator {
        iobyxmoadg() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            float f14 = f13 - 1.0f;
            return (f14 * f14 * f14 * f14 * f14) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: b2.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static abstract class AbstractC0251ppxfxbqfkf {
        public abstract void btonecajqb(int i13);

        public abstract void draadjrbmk(View view, float f13, float f14);

        public void dxjokdxxww(View view, int i13) {
        }

        public int eablkybsjg(View view) {
            return 0;
        }

        public abstract void gtknphoqwx(View view, int i13, int i14, int i15, int i16);

        public void gxszxtbevo(int i13, int i14) {
        }

        public abstract int iobyxmoadg(View view, int i13, int i14);

        public boolean lqeggnwhkg(int i13) {
            return false;
        }

        public void nufgyqmvbu(int i13, int i14) {
        }

        public int ppxfxbqfkf(int i13) {
            return i13;
        }

        public abstract boolean wflxmlrfwp(View view, int i13);

        public int wkgbmnqykc(View view) {
            return 0;
        }

        public abstract int zoijcleaow(View view, int i13, int i14);
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ppxfxbqfkf.this.wwaezpbzkn(0);
        }
    }

    private ppxfxbqfkf(Context context, ViewGroup viewGroup, AbstractC0251ppxfxbqfkf abstractC0251ppxfxbqfkf) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0251ppxfxbqfkf == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f14989jyumaefscl = viewGroup;
        this.f14990kcexrzcfyt = abstractC0251ppxfxbqfkf;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i13 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f14996rgvfuqvkyq = i13;
        this.f14993ojitshcjhn = i13;
        this.f15002zoijcleaow = viewConfiguration.getScaledTouchSlop();
        this.f14998wflxmlrfwp = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f14980agtfadlqog = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14994oxmwwwfdhm = new OverScroller(context, f14979cqumvgiudr);
    }

    public static ppxfxbqfkf agtfadlqog(ViewGroup viewGroup, AbstractC0251ppxfxbqfkf abstractC0251ppxfxbqfkf) {
        return new ppxfxbqfkf(viewGroup.getContext(), viewGroup, abstractC0251ppxfxbqfkf);
    }

    private int btonecajqb(int i13, int i14, int i15) {
        if (i13 == 0) {
            return 0;
        }
        int width = this.f14989jyumaefscl.getWidth();
        float f13 = width / 2;
        float fRgvfuqvkyq = f13 + (rgvfuqvkyq(Math.min(1.0f, Math.abs(i13) / width)) * f13);
        int iAbs = Math.abs(i14);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fRgvfuqvkyq / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / i15) + 1.0f) * 256.0f), 600);
    }

    private void cdpycssgdh() {
        this.f14982draadjrbmk.computeCurrentVelocity(1000, this.f14998wflxmlrfwp);
        ojitshcjhn(gxszxtbevo(this.f14982draadjrbmk.getXVelocity(this.f14995ppxfxbqfkf), this.f14980agtfadlqog, this.f14998wflxmlrfwp), gxszxtbevo(this.f14982draadjrbmk.getYVelocity(this.f14995ppxfxbqfkf), this.f14980agtfadlqog, this.f14998wflxmlrfwp));
    }

    private void dxjokdxxww(int i13) {
        if (this.f14999wkgbmnqykc == null || !lereixgezr(i13)) {
            return;
        }
        this.f14999wkgbmnqykc[i13] = 0.0f;
        this.f14984eablkybsjg[i13] = 0.0f;
        this.f14986gxszxtbevo[i13] = 0.0f;
        this.f14991lqeggnwhkg[i13] = 0.0f;
        this.f14992nufgyqmvbu[i13] = 0;
        this.f14983dxjokdxxww[i13] = 0;
        this.f14981btonecajqb[i13] = 0;
        this.f14985gtknphoqwx = (~(1 << i13)) & this.f14985gtknphoqwx;
    }

    private boolean eablkybsjg(View view, float f13, float f14) {
        if (view == null) {
            return false;
        }
        boolean z13 = this.f14990kcexrzcfyt.wkgbmnqykc(view) > 0;
        boolean z14 = this.f14990kcexrzcfyt.eablkybsjg(view) > 0;
        if (z13 && z14) {
            float f15 = (f13 * f13) + (f14 * f14);
            int i13 = this.f15002zoijcleaow;
            return f15 > ((float) (i13 * i13));
        }
        if (z13) {
            return Math.abs(f13) > ((float) this.f15002zoijcleaow);
        }
        return z14 && Math.abs(f14) > ((float) this.f15002zoijcleaow);
    }

    private int gtknphoqwx(View view, int i13, int i14, int i15, int i16) {
        float f13;
        float f14;
        float f15;
        float f16;
        int iLqeggnwhkg = lqeggnwhkg(i15, (int) this.f14980agtfadlqog, (int) this.f14998wflxmlrfwp);
        int iLqeggnwhkg2 = lqeggnwhkg(i16, (int) this.f14980agtfadlqog, (int) this.f14998wflxmlrfwp);
        int iAbs = Math.abs(i13);
        int iAbs2 = Math.abs(i14);
        int iAbs3 = Math.abs(iLqeggnwhkg);
        int iAbs4 = Math.abs(iLqeggnwhkg2);
        int i17 = iAbs3 + iAbs4;
        int i18 = iAbs + iAbs2;
        if (iLqeggnwhkg != 0) {
            f13 = iAbs3;
            f14 = i17;
        } else {
            f13 = iAbs;
            f14 = i18;
        }
        float f17 = f13 / f14;
        if (iLqeggnwhkg2 != 0) {
            f15 = iAbs4;
            f16 = i17;
        } else {
            f15 = iAbs2;
            f16 = i18;
        }
        return (int) ((btonecajqb(i13, iLqeggnwhkg, this.f14990kcexrzcfyt.wkgbmnqykc(view)) * f17) + (btonecajqb(i14, iLqeggnwhkg2, this.f14990kcexrzcfyt.eablkybsjg(view)) * (f15 / f16)));
    }

    private float gxszxtbevo(float f13, float f14, float f15) {
        float fAbs = Math.abs(f13);
        if (fAbs < f14) {
            return 0.0f;
        }
        if (fAbs > f15) {
            return f13 > 0.0f ? f15 : -f15;
        }
        return f13;
    }

    private void iozdgvuglv(float f13, float f14, int i13) {
        oxmwwwfdhm(i13);
        float[] fArr = this.f14999wkgbmnqykc;
        this.f14986gxszxtbevo[i13] = f13;
        fArr[i13] = f13;
        float[] fArr2 = this.f14984eablkybsjg;
        this.f14991lqeggnwhkg[i13] = f14;
        fArr2[i13] = f14;
        this.f14992nufgyqmvbu[i13] = jyumaefscl((int) f13, (int) f14);
        this.f14985gtknphoqwx |= 1 << i13;
    }

    private int jyumaefscl(int i13, int i14) {
        int i15 = i13 < this.f14989jyumaefscl.getLeft() + this.f14993ojitshcjhn ? 1 : 0;
        if (i14 < this.f14989jyumaefscl.getTop() + this.f14993ojitshcjhn) {
            i15 |= 4;
        }
        if (i13 > this.f14989jyumaefscl.getRight() - this.f14993ojitshcjhn) {
            i15 |= 2;
        }
        return i14 > this.f14989jyumaefscl.getBottom() - this.f14993ojitshcjhn ? i15 | 8 : i15;
    }

    private void lmojexxdyd(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i13 = 0; i13 < pointerCount; i13++) {
            int pointerId = motionEvent.getPointerId(i13);
            if (pmvmpeiblj(pointerId)) {
                float x13 = motionEvent.getX(i13);
                float y13 = motionEvent.getY(i13);
                this.f14986gxszxtbevo[pointerId] = x13;
                this.f14991lqeggnwhkg[pointerId] = y13;
            }
        }
    }

    private int lqeggnwhkg(int i13, int i14, int i15) {
        int iAbs = Math.abs(i13);
        if (iAbs < i14) {
            return 0;
        }
        if (iAbs > i15) {
            return i13 > 0 ? i15 : -i15;
        }
        return i13;
    }

    private void nufgyqmvbu() {
        float[] fArr = this.f14999wkgbmnqykc;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f14984eablkybsjg, 0.0f);
        Arrays.fill(this.f14986gxszxtbevo, 0.0f);
        Arrays.fill(this.f14991lqeggnwhkg, 0.0f);
        Arrays.fill(this.f14992nufgyqmvbu, 0);
        Arrays.fill(this.f14983dxjokdxxww, 0);
        Arrays.fill(this.f14981btonecajqb, 0);
        this.f14985gtknphoqwx = 0;
    }

    private void ojitshcjhn(float f13, float f14) {
        this.f15000yggfygwlhe = true;
        this.f14990kcexrzcfyt.draadjrbmk(this.f15001zdlpuopuiu, f13, f14);
        this.f15000yggfygwlhe = false;
        if (this.f14987iobyxmoadg == 1) {
            wwaezpbzkn(0);
        }
    }

    private void oxmwwwfdhm(int i13) {
        float[] fArr = this.f14999wkgbmnqykc;
        if (fArr == null || fArr.length <= i13) {
            int i14 = i13 + 1;
            float[] fArr2 = new float[i14];
            float[] fArr3 = new float[i14];
            float[] fArr4 = new float[i14];
            float[] fArr5 = new float[i14];
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f14984eablkybsjg;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f14986gxszxtbevo;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f14991lqeggnwhkg;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f14992nufgyqmvbu;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f14983dxjokdxxww;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f14981btonecajqb;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f14999wkgbmnqykc = fArr2;
            this.f14984eablkybsjg = fArr3;
            this.f14986gxszxtbevo = fArr4;
            this.f14991lqeggnwhkg = fArr5;
            this.f14992nufgyqmvbu = iArr;
            this.f14983dxjokdxxww = iArr2;
            this.f14981btonecajqb = iArr3;
        }
    }

    private boolean pmvmpeiblj(int i13) {
        if (lereixgezr(i13)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i13 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private float rgvfuqvkyq(float f13) {
        return (float) Math.sin((f13 - 0.5f) * 0.47123894f);
    }

    private void vdvldrhtss(int i13, int i14, int i15, int i16) {
        int left = this.f15001zdlpuopuiu.getLeft();
        int top = this.f15001zdlpuopuiu.getTop();
        if (i15 != 0) {
            i13 = this.f14990kcexrzcfyt.iobyxmoadg(this.f15001zdlpuopuiu, i13, i15);
            jhduphickx.jlmebxxoox(this.f15001zdlpuopuiu, i13 - left);
        }
        int i17 = i13;
        if (i16 != 0) {
            i14 = this.f14990kcexrzcfyt.zoijcleaow(this.f15001zdlpuopuiu, i14, i16);
            jhduphickx.ribwqtqdhb(this.f15001zdlpuopuiu, i14 - top);
        }
        int i18 = i14;
        if (i15 == 0 && i16 == 0) {
            return;
        }
        this.f14990kcexrzcfyt.gtknphoqwx(this.f15001zdlpuopuiu, i17, i18, i17 - left, i18 - top);
    }

    public static ppxfxbqfkf wflxmlrfwp(ViewGroup viewGroup, float f13, AbstractC0251ppxfxbqfkf abstractC0251ppxfxbqfkf) {
        ppxfxbqfkf ppxfxbqfkfVarAgtfadlqog = agtfadlqog(viewGroup, abstractC0251ppxfxbqfkf);
        ppxfxbqfkfVarAgtfadlqog.f15002zoijcleaow = (int) (ppxfxbqfkfVarAgtfadlqog.f15002zoijcleaow * (1.0f / f13));
        return ppxfxbqfkfVarAgtfadlqog;
    }

    private boolean wkgbmnqykc(float f13, float f14, int i13, int i14) {
        float fAbs = Math.abs(f13);
        float fAbs2 = Math.abs(f14);
        if ((this.f14992nufgyqmvbu[i13] & i14) != i14 || (this.f14997vdvldrhtss & i14) == 0 || (this.f14981btonecajqb[i13] & i14) == i14 || (this.f14983dxjokdxxww[i13] & i14) == i14) {
            return false;
        }
        int i15 = this.f15002zoijcleaow;
        if (fAbs <= i15 && fAbs2 <= i15) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f14990kcexrzcfyt.lqeggnwhkg(i14)) {
            return (this.f14983dxjokdxxww[i13] & i14) == 0 && fAbs > ((float) this.f15002zoijcleaow);
        }
        int[] iArr = this.f14981btonecajqb;
        iArr[i13] = iArr[i13] | i14;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [b2.ppxfxbqfkf$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void yadqdtsiqt(float f13, float f14, int i13) {
        int i14;
        boolean zWkgbmnqykc = wkgbmnqykc(f13, f14, i13, 1);
        ?? r13 = zWkgbmnqykc;
        if (wkgbmnqykc(f14, f13, i13, 4)) {
            r13 = (zWkgbmnqykc ? 1 : 0) | 4;
        }
        ?? r14 = r13;
        if (wkgbmnqykc(f13, f14, i13, 2)) {
            r14 = (r13 == true ? 1 : 0) | 2;
        }
        ?? r15 = r14;
        if (wkgbmnqykc(f14, f13, i13, 8)) {
            i14 = (r14 == true ? 1 : 0) | 8;
        }
        if (r15 == 0) {
            r15 = i14;
            return;
        }
        r15 = i14;
        int[] iArr = this.f14983dxjokdxxww;
        iArr[i13] = (iArr[i13] | r15) == true ? 1 : 0;
        this.f14990kcexrzcfyt.gxszxtbevo(r15, i13);
    }

    private boolean zdlpuopuiu(int i13, int i14, int i15, int i16) {
        int left = this.f15001zdlpuopuiu.getLeft();
        int top = this.f15001zdlpuopuiu.getTop();
        int i17 = i13 - left;
        int i18 = i14 - top;
        if (i17 == 0 && i18 == 0) {
            this.f14994oxmwwwfdhm.abortAnimation();
            wwaezpbzkn(0);
            return false;
        }
        this.f14994oxmwwwfdhm.startScroll(left, top, i17, i18, gtknphoqwx(this.f15001zdlpuopuiu, i17, i18, i15, i16));
        wwaezpbzkn(2);
        return true;
    }

    public boolean cllcsxoeiz(View view, int i13, int i14) {
        this.f15001zdlpuopuiu = view;
        this.f14995ppxfxbqfkf = -1;
        boolean zZdlpuopuiu = zdlpuopuiu(i13, i14, 0, 0);
        if (!zZdlpuopuiu && this.f14987iobyxmoadg == 0 && this.f15001zdlpuopuiu != null) {
            this.f15001zdlpuopuiu = null;
        }
        return zZdlpuopuiu;
    }

    public int cqumvgiudr() {
        return this.f14987iobyxmoadg;
    }

    public boolean draadjrbmk(boolean z13) {
        if (this.f14987iobyxmoadg == 2) {
            boolean zComputeScrollOffset = this.f14994oxmwwwfdhm.computeScrollOffset();
            int currX = this.f14994oxmwwwfdhm.getCurrX();
            int currY = this.f14994oxmwwwfdhm.getCurrY();
            int left = currX - this.f15001zdlpuopuiu.getLeft();
            int top = currY - this.f15001zdlpuopuiu.getTop();
            if (left != 0) {
                jhduphickx.jlmebxxoox(this.f15001zdlpuopuiu, left);
            }
            if (top != 0) {
                jhduphickx.ribwqtqdhb(this.f15001zdlpuopuiu, top);
            }
            if (left != 0 || top != 0) {
                this.f14990kcexrzcfyt.gtknphoqwx(this.f15001zdlpuopuiu, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f14994oxmwwwfdhm.getFinalX() && currY == this.f14994oxmwwwfdhm.getFinalY()) {
                this.f14994oxmwwwfdhm.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z13) {
                    this.f14989jyumaefscl.post(this.f14988iwizpuwonk);
                } else {
                    wwaezpbzkn(0);
                }
            }
        }
        return this.f14987iobyxmoadg == 2;
    }

    boolean dsvhmnatus(View view, int i13) {
        if (view == this.f15001zdlpuopuiu && this.f14995ppxfxbqfkf == i13) {
            return true;
        }
        if (view == null || !this.f14990kcexrzcfyt.wflxmlrfwp(view, i13)) {
            return false;
        }
        this.f14995ppxfxbqfkf = i13;
        ppxfxbqfkf(view, i13);
        return true;
    }

    public boolean esjtqupxsv(int i13, int i14) {
        return zynmafqrjb(this.f15001zdlpuopuiu, i13, i14);
    }

    public void hcddaimhww(float f13) {
        this.f14980agtfadlqog = f13;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public boolean hkdspvbjdz(MotionEvent motionEvent) {
        boolean z13;
        View viewKcexrzcfyt;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            zoijcleaow();
        }
        if (this.f14982draadjrbmk == null) {
            this.f14982draadjrbmk = VelocityTracker.obtain();
        }
        this.f14982draadjrbmk.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                zoijcleaow();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    zoijcleaow();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x13 = motionEvent.getX(actionIndex);
                    float y13 = motionEvent.getY(actionIndex);
                    iozdgvuglv(x13, y13, pointerId);
                    int i13 = this.f14987iobyxmoadg;
                    if (i13 == 0) {
                        int i14 = this.f14992nufgyqmvbu[pointerId];
                        int i15 = this.f14997vdvldrhtss;
                        if ((i14 & i15) != 0) {
                            this.f14990kcexrzcfyt.nufgyqmvbu(i14 & i15, pointerId);
                        }
                    } else if (i13 == 2 && (viewKcexrzcfyt = kcexrzcfyt((int) x13, (int) y13)) == this.f15001zdlpuopuiu) {
                        dsvhmnatus(viewKcexrzcfyt, pointerId);
                    }
                } else if (actionMasked == 6) {
                    dxjokdxxww(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f14999wkgbmnqykc != null && this.f14984eablkybsjg != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i16 = 0; i16 < pointerCount; i16++) {
                    int pointerId2 = motionEvent.getPointerId(i16);
                    if (pmvmpeiblj(pointerId2)) {
                        float x14 = motionEvent.getX(i16);
                        float y14 = motionEvent.getY(i16);
                        float f13 = x14 - this.f14999wkgbmnqykc[pointerId2];
                        float f14 = y14 - this.f14984eablkybsjg[pointerId2];
                        View viewKcexrzcfyt2 = kcexrzcfyt((int) x14, (int) y14);
                        boolean z14 = viewKcexrzcfyt2 != null && eablkybsjg(viewKcexrzcfyt2, f13, f14);
                        if (!z14) {
                            yadqdtsiqt(f13, f14, pointerId2);
                            if (this.f14987iobyxmoadg != 1) {
                                break;
                            }
                        } else {
                            int left = viewKcexrzcfyt2.getLeft();
                            int i17 = (int) f13;
                            int iIobyxmoadg = this.f14990kcexrzcfyt.iobyxmoadg(viewKcexrzcfyt2, left + i17, i17);
                            int top = viewKcexrzcfyt2.getTop();
                            int i18 = (int) f14;
                            int iZoijcleaow = this.f14990kcexrzcfyt.zoijcleaow(viewKcexrzcfyt2, top + i18, i18);
                            int iWkgbmnqykc = this.f14990kcexrzcfyt.wkgbmnqykc(viewKcexrzcfyt2);
                            int iEablkybsjg = this.f14990kcexrzcfyt.eablkybsjg(viewKcexrzcfyt2);
                            if ((iWkgbmnqykc == 0 || (iWkgbmnqykc > 0 && iIobyxmoadg == left)) && (iEablkybsjg == 0 || (iEablkybsjg > 0 && iZoijcleaow == top))) {
                                break;
                            }
                            yadqdtsiqt(f13, f14, pointerId2);
                            if (this.f14987iobyxmoadg != 1 || (z14 && dsvhmnatus(viewKcexrzcfyt2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                lmojexxdyd(motionEvent);
            }
            z13 = false;
        } else {
            float x15 = motionEvent.getX();
            float y15 = motionEvent.getY();
            z13 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            iozdgvuglv(x15, y15, pointerId3);
            View viewKcexrzcfyt3 = kcexrzcfyt((int) x15, (int) y15);
            if (viewKcexrzcfyt3 == this.f15001zdlpuopuiu && this.f14987iobyxmoadg == 2) {
                dsvhmnatus(viewKcexrzcfyt3, pointerId3);
            }
            int i19 = this.f14992nufgyqmvbu[pointerId3];
            int i23 = this.f14997vdvldrhtss;
            if ((i19 & i23) != 0) {
                this.f14990kcexrzcfyt.nufgyqmvbu(i19 & i23, pointerId3);
            }
        }
        if (this.f14987iobyxmoadg == 1) {
            return true;
        }
        return z13;
    }

    public void iobyxmoadg() {
        zoijcleaow();
        if (this.f14987iobyxmoadg == 2) {
            int currX = this.f14994oxmwwwfdhm.getCurrX();
            int currY = this.f14994oxmwwwfdhm.getCurrY();
            this.f14994oxmwwwfdhm.abortAnimation();
            int currX2 = this.f14994oxmwwwfdhm.getCurrX();
            int currY2 = this.f14994oxmwwwfdhm.getCurrY();
            this.f14990kcexrzcfyt.gtknphoqwx(this.f15001zdlpuopuiu, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        wwaezpbzkn(0);
    }

    public void istkbnxepw(MotionEvent motionEvent) {
        int i13;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            zoijcleaow();
        }
        if (this.f14982draadjrbmk == null) {
            this.f14982draadjrbmk = VelocityTracker.obtain();
        }
        this.f14982draadjrbmk.addMovement(motionEvent);
        int i14 = 0;
        if (actionMasked == 0) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewKcexrzcfyt = kcexrzcfyt((int) x13, (int) y13);
            iozdgvuglv(x13, y13, pointerId);
            dsvhmnatus(viewKcexrzcfyt, pointerId);
            int i15 = this.f14992nufgyqmvbu[pointerId];
            int i16 = this.f14997vdvldrhtss;
            if ((i15 & i16) != 0) {
                this.f14990kcexrzcfyt.nufgyqmvbu(i15 & i16, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f14987iobyxmoadg == 1) {
                cdpycssgdh();
            }
            zoijcleaow();
            return;
        }
        if (actionMasked == 2) {
            if (this.f14987iobyxmoadg == 1) {
                if (pmvmpeiblj(this.f14995ppxfxbqfkf)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f14995ppxfxbqfkf);
                    float x14 = motionEvent.getX(iFindPointerIndex);
                    float y14 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f14986gxszxtbevo;
                    int i17 = this.f14995ppxfxbqfkf;
                    int i18 = (int) (x14 - fArr[i17]);
                    int i19 = (int) (y14 - this.f14991lqeggnwhkg[i17]);
                    vdvldrhtss(this.f15001zdlpuopuiu.getLeft() + i18, this.f15001zdlpuopuiu.getTop() + i19, i18, i19);
                    lmojexxdyd(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i14 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i14);
                if (pmvmpeiblj(pointerId2)) {
                    float x15 = motionEvent.getX(i14);
                    float y15 = motionEvent.getY(i14);
                    float f13 = x15 - this.f14999wkgbmnqykc[pointerId2];
                    float f14 = y15 - this.f14984eablkybsjg[pointerId2];
                    yadqdtsiqt(f13, f14, pointerId2);
                    if (this.f14987iobyxmoadg != 1) {
                        View viewKcexrzcfyt2 = kcexrzcfyt((int) x15, (int) y15);
                        if (eablkybsjg(viewKcexrzcfyt2, f13, f14) && dsvhmnatus(viewKcexrzcfyt2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i14++;
            }
            lmojexxdyd(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f14987iobyxmoadg == 1) {
                ojitshcjhn(0.0f, 0.0f);
            }
            zoijcleaow();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x16 = motionEvent.getX(actionIndex);
            float y16 = motionEvent.getY(actionIndex);
            iozdgvuglv(x16, y16, pointerId3);
            if (this.f14987iobyxmoadg != 0) {
                if (esjtqupxsv((int) x16, (int) y16)) {
                    dsvhmnatus(this.f15001zdlpuopuiu, pointerId3);
                    return;
                }
                return;
            } else {
                dsvhmnatus(kcexrzcfyt((int) x16, (int) y16), pointerId3);
                int i23 = this.f14992nufgyqmvbu[pointerId3];
                int i24 = this.f14997vdvldrhtss;
                if ((i23 & i24) != 0) {
                    this.f14990kcexrzcfyt.nufgyqmvbu(i23 & i24, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f14987iobyxmoadg == 1 && pointerId4 == this.f14995ppxfxbqfkf) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i14 >= pointerCount2) {
                    i13 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i14);
                if (pointerId5 != this.f14995ppxfxbqfkf) {
                    View viewKcexrzcfyt3 = kcexrzcfyt((int) motionEvent.getX(i14), (int) motionEvent.getY(i14));
                    View view = this.f15001zdlpuopuiu;
                    if (viewKcexrzcfyt3 == view && dsvhmnatus(view, pointerId5)) {
                        i13 = this.f14995ppxfxbqfkf;
                        break;
                    }
                }
                i14++;
            }
            if (i13 == -1) {
                cdpycssgdh();
            }
        }
        dxjokdxxww(pointerId4);
    }

    public int iwizpuwonk() {
        return this.f15002zoijcleaow;
    }

    public boolean jpowsppfya(int i13, int i14) {
        if (this.f15000yggfygwlhe) {
            return zdlpuopuiu(i13, i14, (int) this.f14982draadjrbmk.getXVelocity(this.f14995ppxfxbqfkf), (int) this.f14982draadjrbmk.getYVelocity(this.f14995ppxfxbqfkf));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public View kcexrzcfyt(int i13, int i14) {
        for (int childCount = this.f14989jyumaefscl.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f14989jyumaefscl.getChildAt(this.f14990kcexrzcfyt.ppxfxbqfkf(childCount));
            if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && i14 >= childAt.getTop() && i14 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean lereixgezr(int i13) {
        return ((1 << i13) & this.f14985gtknphoqwx) != 0;
    }

    public void pkzmftpjix(int i13) {
        this.f14997vdvldrhtss = i13;
    }

    public void ppxfxbqfkf(View view, int i13) {
        if (view.getParent() == this.f14989jyumaefscl) {
            this.f15001zdlpuopuiu = view;
            this.f14995ppxfxbqfkf = i13;
            this.f14990kcexrzcfyt.dxjokdxxww(view, i13);
            wwaezpbzkn(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f14989jyumaefscl + ")");
    }

    void wwaezpbzkn(int i13) {
        this.f14989jyumaefscl.removeCallbacks(this.f14988iwizpuwonk);
        if (this.f14987iobyxmoadg != i13) {
            this.f14987iobyxmoadg = i13;
            this.f14990kcexrzcfyt.btonecajqb(i13);
            if (this.f14987iobyxmoadg == 0) {
                this.f15001zdlpuopuiu = null;
            }
        }
    }

    public int yggfygwlhe() {
        return this.f14996rgvfuqvkyq;
    }

    public void ylkuphrtab(int i13) {
        this.f14993ojitshcjhn = i13;
    }

    public void zoijcleaow() {
        this.f14995ppxfxbqfkf = -1;
        nufgyqmvbu();
        VelocityTracker velocityTracker = this.f14982draadjrbmk;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14982draadjrbmk = null;
        }
    }

    public boolean zynmafqrjb(View view, int i13, int i14) {
        return view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom();
    }
}
