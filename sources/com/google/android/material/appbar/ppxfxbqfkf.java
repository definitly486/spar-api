package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
abstract class ppxfxbqfkf extends eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    OverScroller f22041cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f22042esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private VelocityTracker f22043istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Runnable f22044iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f22045lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22046pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f22047zynmafqrjb;

    private class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final View f22049yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final CoordinatorLayout f22050zdlpuopuiu;

        iobyxmoadg(CoordinatorLayout coordinatorLayout, View view) {
            this.f22050zdlpuopuiu = coordinatorLayout;
            this.f22049yggfygwlhe = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f22049yggfygwlhe == null || (overScroller = ppxfxbqfkf.this.f22041cqumvgiudr) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                ppxfxbqfkf.this.kegysxyocb(this.f22050zdlpuopuiu, this.f22049yggfygwlhe);
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
            ppxfxbqfkfVar.mbcevpiqjq(this.f22050zdlpuopuiu, this.f22049yggfygwlhe, ppxfxbqfkfVar.f22041cqumvgiudr.getCurrY());
            jhduphickx.metgxyhuhe(this.f22049yggfygwlhe, this);
        }
    }

    public ppxfxbqfkf() {
        this.f22045lereixgezr = -1;
        this.f22047zynmafqrjb = -1;
    }

    private void hkdspvbjdz() {
        if (this.f22043istkbnxepw == null) {
            this.f22043istkbnxepw = VelocityTracker.obtain();
        }
    }

    final boolean cllcsxoeiz(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, float f13) {
        Runnable runnable = this.f22044iwizpuwonk;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f22044iwizpuwonk = null;
        }
        if (this.f22041cqumvgiudr == null) {
            this.f22041cqumvgiudr = new OverScroller(view.getContext());
        }
        this.f22041cqumvgiudr.fling(0, ylkuphrtab(), 0, Math.round(f13), 0, 0, i13, i14);
        if (!this.f22041cqumvgiudr.computeScrollOffset()) {
            kegysxyocb(coordinatorLayout, view);
            return false;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(coordinatorLayout, view);
        this.f22044iwizpuwonk = iobyxmoadgVar;
        jhduphickx.metgxyhuhe(view, iobyxmoadgVar);
        return true;
    }

    abstract int dsvhmnatus(View view);

    abstract boolean jpowsppfya(View view);

    abstract void kegysxyocb(CoordinatorLayout coordinatorLayout, View view);

    int mbcevpiqjq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        return ntlheqmsrt(coordinatorLayout, view, i13, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int ntlheqmsrt(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f22047zynmafqrjb < 0) {
            this.f22047zynmafqrjb = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f22042esjtqupxsv) {
            int i13 = this.f22045lereixgezr;
            if (i13 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i13)) == -1) {
                return false;
            }
            int y13 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y13 - this.f22046pmvmpeiblj) > this.f22047zynmafqrjb) {
                this.f22046pmvmpeiblj = y13;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f22045lereixgezr = -1;
            int x13 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            boolean z13 = jpowsppfya(view) && coordinatorLayout.zynmafqrjb(view, x13, y14);
            this.f22042esjtqupxsv = z13;
            if (z13) {
                this.f22046pmvmpeiblj = y14;
                this.f22045lereixgezr = motionEvent.getPointerId(0);
                hkdspvbjdz();
                OverScroller overScroller = this.f22041cqumvgiudr;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f22041cqumvgiudr.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f22043istkbnxepw;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    abstract int stevsuqkhv();

    final int tzroggbefp(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
        return ntlheqmsrt(coordinatorLayout, view, stevsuqkhv() - i13, i14, i15);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z13;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f22043istkbnxepw;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f22043istkbnxepw.computeCurrentVelocity(1000);
                cllcsxoeiz(coordinatorLayout, view, -wypolnanlu(view), 0, this.f22043istkbnxepw.getYVelocity(this.f22045lereixgezr));
                z13 = true;
            }
            this.f22042esjtqupxsv = false;
            this.f22045lereixgezr = -1;
            velocityTracker = this.f22043istkbnxepw;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22043istkbnxepw = null;
            }
            velocityTracker2 = this.f22043istkbnxepw;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f22042esjtqupxsv) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f22045lereixgezr);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y13 = (int) motionEvent.getY(iFindPointerIndex);
            int i13 = this.f22046pmvmpeiblj - y13;
            this.f22046pmvmpeiblj = y13;
            tzroggbefp(coordinatorLayout, view, i13, dsvhmnatus(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i14 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f22045lereixgezr = motionEvent.getPointerId(i14);
                this.f22046pmvmpeiblj = (int) (motionEvent.getY(i14) + 0.5f);
            }
        }
        z13 = false;
        velocityTracker2 = this.f22043istkbnxepw;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f22042esjtqupxsv || z13;
        z13 = false;
        this.f22042esjtqupxsv = false;
        this.f22045lereixgezr = -1;
        velocityTracker = this.f22043istkbnxepw;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22043istkbnxepw = null;
        }
        velocityTracker2 = this.f22043istkbnxepw;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f22042esjtqupxsv) {
            return true;
        }
    }

    abstract int wypolnanlu(View view);

    public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22045lereixgezr = -1;
        this.f22047zynmafqrjb = -1;
    }
}
