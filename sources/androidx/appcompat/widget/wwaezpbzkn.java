package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class wwaezpbzkn implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Runnable f3414cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Runnable f3415esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final View f3416iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f3417jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f3418lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f3419pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f3420yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f3421zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final int[] f3422zynmafqrjb = new int[2];

    private class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = wwaezpbzkn.this.f3416iwizpuwonk.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wwaezpbzkn.this.eablkybsjg();
        }
    }

    public wwaezpbzkn(View view) {
        this.f3416iwizpuwonk = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3421zdlpuopuiu = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3420yggfygwlhe = tapTimeout;
        this.f3417jyumaefscl = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean btonecajqb(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3422zynmafqrjb;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private boolean dxjokdxxww(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3422zynmafqrjb;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean gxszxtbevo(MotionEvent motionEvent) {
        iozdgvuglv iozdgvuglvVar;
        View view = this.f3416iwizpuwonk;
        draadjrbmk.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
        if (eablkybsjgVarZoijcleaow == null || !eablkybsjgVarZoijcleaow.zoijcleaow() || (iozdgvuglvVar = (iozdgvuglv) eablkybsjgVarZoijcleaow.rgvfuqvkyq()) == null || !iozdgvuglvVar.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        dxjokdxxww(view, motionEventObtainNoHistory);
        btonecajqb(iozdgvuglvVar, motionEventObtainNoHistory);
        boolean zEablkybsjg = iozdgvuglvVar.eablkybsjg(motionEventObtainNoHistory, this.f3419pmvmpeiblj);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zEablkybsjg && (actionMasked != 1 && actionMasked != 3);
    }

    private void iobyxmoadg() {
        Runnable runnable = this.f3415esjtqupxsv;
        if (runnable != null) {
            this.f3416iwizpuwonk.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3414cqumvgiudr;
        if (runnable2 != null) {
            this.f3416iwizpuwonk.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean lqeggnwhkg(MotionEvent motionEvent) {
        View view = this.f3416iwizpuwonk;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3419pmvmpeiblj = motionEvent.getPointerId(0);
            if (this.f3414cqumvgiudr == null) {
                this.f3414cqumvgiudr = new iobyxmoadg();
            }
            view.postDelayed(this.f3414cqumvgiudr, this.f3420yggfygwlhe);
            if (this.f3415esjtqupxsv == null) {
                this.f3415esjtqupxsv = new zoijcleaow();
            }
            view.postDelayed(this.f3415esjtqupxsv, this.f3417jyumaefscl);
        } else if (actionMasked == 1) {
            iobyxmoadg();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f3419pmvmpeiblj);
            if (iFindPointerIndex >= 0 && !nufgyqmvbu(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f3421zdlpuopuiu)) {
                iobyxmoadg();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            iobyxmoadg();
        }
        return false;
    }

    private static boolean nufgyqmvbu(View view, float f13, float f14, float f15) {
        float f16 = -f15;
        return f13 >= f16 && f14 >= f16 && f13 < ((float) (view.getRight() - view.getLeft())) + f15 && f14 < ((float) (view.getBottom() - view.getTop())) + f15;
    }

    void eablkybsjg() {
        iobyxmoadg();
        View view = this.f3416iwizpuwonk;
        if (view.isEnabled() && !view.isLongClickable() && ppxfxbqfkf()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f3418lereixgezr = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z13;
        boolean z14 = this.f3418lereixgezr;
        if (z14) {
            z13 = gxszxtbevo(motionEvent) || !wkgbmnqykc();
        } else {
            z13 = lqeggnwhkg(motionEvent) && ppxfxbqfkf();
            if (z13) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3416iwizpuwonk.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f3418lereixgezr = z13;
        return z13 || z14;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3418lereixgezr = false;
        this.f3419pmvmpeiblj = -1;
        Runnable runnable = this.f3414cqumvgiudr;
        if (runnable != null) {
            this.f3416iwizpuwonk.removeCallbacks(runnable);
        }
    }

    protected abstract boolean ppxfxbqfkf();

    protected boolean wkgbmnqykc() {
        draadjrbmk.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
        if (eablkybsjgVarZoijcleaow == null || !eablkybsjgVarZoijcleaow.zoijcleaow()) {
            return true;
        }
        eablkybsjgVarZoijcleaow.dismiss();
        return true;
    }

    public abstract draadjrbmk.eablkybsjg zoijcleaow();
}
