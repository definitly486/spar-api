package v1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int[] f115166btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f115167dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private VelocityTracker f115168eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f115169gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f115170iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f115171lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f115172nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f115173ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f115174wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f115175zoijcleaow;

    interface iobyxmoadg {
        float iobyxmoadg(VelocityTracker velocityTracker, MotionEvent motionEvent, int i13);
    }

    interface zoijcleaow {
        void iobyxmoadg(Context context, int[] iArr, MotionEvent motionEvent, int i13);
    }

    public ojitshcjhn(Context context, rgvfuqvkyq rgvfuqvkyqVar) {
        this(context, rgvfuqvkyqVar, new zoijcleaow() { // from class: v1.wflxmlrfwp
            @Override // v1.ojitshcjhn.zoijcleaow
            public final void iobyxmoadg(Context context2, int[] iArr, MotionEvent motionEvent, int i13) {
                ojitshcjhn.ppxfxbqfkf(context2, iArr, motionEvent, i13);
            }
        }, new iobyxmoadg() { // from class: v1.agtfadlqog
            @Override // v1.ojitshcjhn.iobyxmoadg
            public final float iobyxmoadg(VelocityTracker velocityTracker, MotionEvent motionEvent, int i13) {
                return ojitshcjhn.gxszxtbevo(velocityTracker, motionEvent, i13);
            }
        });
    }

    private float eablkybsjg(MotionEvent motionEvent, int i13) {
        if (this.f115168eablkybsjg == null) {
            this.f115168eablkybsjg = VelocityTracker.obtain();
        }
        return this.f115174wkgbmnqykc.iobyxmoadg(this.f115168eablkybsjg, motionEvent, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float gxszxtbevo(VelocityTracker velocityTracker, MotionEvent motionEvent, int i13) {
        jlmebxxoox.iobyxmoadg(velocityTracker, motionEvent);
        jlmebxxoox.zoijcleaow(velocityTracker, 1000);
        return jlmebxxoox.wkgbmnqykc(velocityTracker, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ppxfxbqfkf(Context context, int[] iArr, MotionEvent motionEvent, int i13) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = jztzpxfvev.lqeggnwhkg(context, viewConfiguration, motionEvent.getDeviceId(), i13, motionEvent.getSource());
        iArr[1] = jztzpxfvev.gxszxtbevo(context, viewConfiguration, motionEvent.getDeviceId(), i13, motionEvent.getSource());
    }

    private boolean wkgbmnqykc(MotionEvent motionEvent, int i13) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f115172nufgyqmvbu == source && this.f115167dxjokdxxww == deviceId && this.f115171lqeggnwhkg == i13) {
            return false;
        }
        this.f115173ppxfxbqfkf.iobyxmoadg(this.f115170iobyxmoadg, this.f115166btonecajqb, motionEvent, i13);
        this.f115172nufgyqmvbu = source;
        this.f115167dxjokdxxww = deviceId;
        this.f115171lqeggnwhkg = i13;
        return true;
    }

    public void lqeggnwhkg(MotionEvent motionEvent, int i13) {
        boolean zWkgbmnqykc = wkgbmnqykc(motionEvent, i13);
        if (this.f115166btonecajqb[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f115168eablkybsjg;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f115168eablkybsjg = null;
                return;
            }
            return;
        }
        float fEablkybsjg = eablkybsjg(motionEvent, i13) * this.f115175zoijcleaow.zoijcleaow();
        float fSignum = Math.signum(fEablkybsjg);
        if (zWkgbmnqykc || (fSignum != Math.signum(this.f115169gxszxtbevo) && fSignum != 0.0f)) {
            this.f115175zoijcleaow.ppxfxbqfkf();
        }
        float fAbs = Math.abs(fEablkybsjg);
        int[] iArr = this.f115166btonecajqb;
        if (fAbs < iArr[0]) {
            return;
        }
        int i14 = iArr[1];
        float fMax = Math.max(-i14, Math.min(fEablkybsjg, i14));
        this.f115169gxszxtbevo = this.f115175zoijcleaow.iobyxmoadg(fMax) ? fMax : 0.0f;
    }

    ojitshcjhn(Context context, rgvfuqvkyq rgvfuqvkyqVar, zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
        this.f115171lqeggnwhkg = -1;
        this.f115172nufgyqmvbu = -1;
        this.f115167dxjokdxxww = -1;
        this.f115166btonecajqb = new int[]{Integer.MAX_VALUE, 0};
        this.f115170iobyxmoadg = context;
        this.f115175zoijcleaow = rgvfuqvkyqVar;
        this.f115173ppxfxbqfkf = zoijcleaowVar;
        this.f115174wkgbmnqykc = iobyxmoadgVar;
    }
}
