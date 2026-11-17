package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v1.jhduphickx;
import w1.iwizpuwonk;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f22130cqumvgiudr;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f22134jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f22137yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    b2.ppxfxbqfkf f22138zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f22133iwizpuwonk = 0.0f;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f22131esjtqupxsv = 2;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    float f22135lereixgezr = 0.5f;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    float f22136pmvmpeiblj = 0.0f;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    float f22139zynmafqrjb = 0.5f;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf f22132istkbnxepw = new iobyxmoadg();

    class iobyxmoadg extends b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f22140iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f22142zoijcleaow = -1;

        iobyxmoadg() {
        }

        private boolean agtfadlqog(View view, float f13) {
            if (f13 == 0.0f) {
                return Math.abs(view.getLeft() - this.f22140iobyxmoadg) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f22135lereixgezr);
            }
            boolean z13 = jhduphickx.lereixgezr(view) == 1;
            int i13 = SwipeDismissBehavior.this.f22131esjtqupxsv;
            if (i13 == 2) {
                return true;
            }
            if (i13 == 0) {
                if (z13) {
                    if (f13 >= 0.0f) {
                        return false;
                    }
                } else if (f13 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i13 != 1) {
                return false;
            }
            if (z13) {
                if (f13 <= 0.0f) {
                    return false;
                }
            } else if (f13 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void btonecajqb(int i13) {
            SwipeDismissBehavior.this.getClass();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void draadjrbmk(View view, float f13, float f14) {
            int i13;
            boolean z13;
            this.f22142zoijcleaow = -1;
            int width = view.getWidth();
            if (agtfadlqog(view, f13)) {
                if (f13 >= 0.0f) {
                    int left = view.getLeft();
                    int i14 = this.f22140iobyxmoadg;
                    if (left < i14) {
                        i13 = this.f22140iobyxmoadg - width;
                    } else {
                        i13 = i14 + width;
                    }
                } else {
                    i13 = this.f22140iobyxmoadg - width;
                }
                z13 = true;
            } else {
                i13 = this.f22140iobyxmoadg;
                z13 = false;
            }
            if (SwipeDismissBehavior.this.f22138zdlpuopuiu.jpowsppfya(i13, view.getTop())) {
                jhduphickx.metgxyhuhe(view, new ppxfxbqfkf(view, z13));
            } else if (z13) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void dxjokdxxww(View view, int i13) {
            this.f22142zoijcleaow = i13;
            this.f22140iobyxmoadg = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f22134jyumaefscl = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f22134jyumaefscl = false;
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14, int i15, int i16) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f22136pmvmpeiblj;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f22139zynmafqrjb;
            float fAbs = Math.abs(i13 - this.f22140iobyxmoadg);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.hcddaimhww(0.0f, 1.0f - SwipeDismissBehavior.cllcsxoeiz(width, width2, fAbs), 1.0f));
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int iobyxmoadg(View view, int i13, int i14) {
            int width;
            int width2;
            int width3;
            boolean z13 = jhduphickx.lereixgezr(view) == 1;
            int i15 = SwipeDismissBehavior.this.f22131esjtqupxsv;
            if (i15 == 0) {
                if (z13) {
                    width = this.f22140iobyxmoadg - view.getWidth();
                    width2 = this.f22140iobyxmoadg;
                } else {
                    width = this.f22140iobyxmoadg;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i15 != 1) {
                width = this.f22140iobyxmoadg - view.getWidth();
                width2 = view.getWidth() + this.f22140iobyxmoadg;
            } else if (z13) {
                width = this.f22140iobyxmoadg;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f22140iobyxmoadg - view.getWidth();
                width2 = this.f22140iobyxmoadg;
            }
            return SwipeDismissBehavior.jpowsppfya(width, i13, width2);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public boolean wflxmlrfwp(View view, int i13) {
            int i14 = this.f22142zoijcleaow;
            return (i14 == -1 || i14 == i13) && SwipeDismissBehavior.this.pkzmftpjix(view);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int wkgbmnqykc(View view) {
            return view.getWidth();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int zoijcleaow(View view, int i13, int i14) {
            return view.getTop();
        }
    }

    private class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f22144yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final View f22145zdlpuopuiu;

        ppxfxbqfkf(View view, boolean z13) {
            this.f22145zdlpuopuiu = view;
            this.f22144yggfygwlhe = z13;
        }

        @Override // java.lang.Runnable
        public void run() {
            b2.ppxfxbqfkf ppxfxbqfkfVar = SwipeDismissBehavior.this.f22138zdlpuopuiu;
            if (ppxfxbqfkfVar != null && ppxfxbqfkfVar.draadjrbmk(true)) {
                jhduphickx.metgxyhuhe(this.f22145zdlpuopuiu, this);
            } else if (this.f22144yggfygwlhe) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    class zoijcleaow implements iwizpuwonk {
        zoijcleaow() {
        }

        @Override // w1.iwizpuwonk
        public boolean iobyxmoadg(View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
            if (!SwipeDismissBehavior.this.pkzmftpjix(view)) {
                return false;
            }
            boolean z13 = jhduphickx.lereixgezr(view) == 1;
            int i13 = SwipeDismissBehavior.this.f22131esjtqupxsv;
            jhduphickx.jlmebxxoox(view, (!(i13 == 0 && z13) && (i13 != 1 || z13)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    static float cllcsxoeiz(float f13, float f14, float f15) {
        return (f15 - f13) / (f14 - f13);
    }

    static float hcddaimhww(float f13, float f14, float f15) {
        return Math.min(Math.max(f13, f14), f15);
    }

    private void hkdspvbjdz(ViewGroup viewGroup) {
        if (this.f22138zdlpuopuiu == null) {
            this.f22138zdlpuopuiu = this.f22130cqumvgiudr ? b2.ppxfxbqfkf.wflxmlrfwp(viewGroup, this.f22133iwizpuwonk, this.f22132istkbnxepw) : b2.ppxfxbqfkf.agtfadlqog(viewGroup, this.f22132istkbnxepw);
        }
    }

    static int jpowsppfya(int i13, int i14, int i15) {
        return Math.min(Math.max(i13, i14), i15);
    }

    private void kegysxyocb(View view) {
        jhduphickx.czzsidtyhn(view, 1048576);
        if (pkzmftpjix(view)) {
            jhduphickx.yfnezrywwk(view, zdlpuopuiu.iobyxmoadg.f118519esjtqupxsv, null, new zoijcleaow());
        }
    }

    public void dsvhmnatus(float f13) {
        this.f22139zynmafqrjb = hcddaimhww(0.0f, f13, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zZynmafqrjb = this.f22137yggfygwlhe;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zZynmafqrjb = coordinatorLayout.zynmafqrjb(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f22137yggfygwlhe = zZynmafqrjb;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22137yggfygwlhe = false;
        }
        if (!zZynmafqrjb) {
            return false;
        }
        hkdspvbjdz(coordinatorLayout);
        return !this.f22134jyumaefscl && this.f22138zdlpuopuiu.hkdspvbjdz(motionEvent);
    }

    public boolean pkzmftpjix(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        boolean zRgvfuqvkyq = super.rgvfuqvkyq(coordinatorLayout, view, i13);
        if (jhduphickx.cqumvgiudr(view) == 0) {
            jhduphickx.uawqvzlxes(view, 1);
            kegysxyocb(view);
        }
        return zRgvfuqvkyq;
    }

    public void stevsuqkhv(int i13) {
        this.f22131esjtqupxsv = i13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f22138zdlpuopuiu == null) {
            return false;
        }
        if (this.f22134jyumaefscl && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f22138zdlpuopuiu.istkbnxepw(motionEvent);
        return true;
    }

    public void wypolnanlu(float f13) {
        this.f22136pmvmpeiblj = hcddaimhww(0.0f, f13, 1.0f);
    }
}
