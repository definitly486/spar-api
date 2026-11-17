package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import modern.payments.ecomAndroid.data.common.MockConstants;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk extends RecyclerView.ojitshcjhn implements RecyclerView.oxmwwwfdhm {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f12918btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f12919cdpycssgdh;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    float f12922dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    float f12923eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f12925gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f12926gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Rect f12928istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private RecyclerView.gtknphoqwx f12929iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f12930jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    v1.kcexrzcfyt f12932lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f12933lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    float f12934nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    int f12935ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    RecyclerView f12936oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private gxszxtbevo f12937pmvmpeiblj;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f12940vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    eablkybsjg f12941wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    float f12942wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f12943yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    VelocityTracker f12944zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final List f12927iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float[] f12945zoijcleaow = new float[2];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    RecyclerView.iozdgvuglv f12938ppxfxbqfkf = null;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f12921draadjrbmk = -1;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f12917agtfadlqog = 0;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    List f12939rgvfuqvkyq = new ArrayList();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    final Runnable f12931kcexrzcfyt = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    View f12920cqumvgiudr = null;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f12924esjtqupxsv = -1;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final RecyclerView.zdlpuopuiu f12946zynmafqrjb = new zoijcleaow();

    public interface dxjokdxxww {
        void nufgyqmvbu(View view, View view2, int i13, int i14);
    }

    public static abstract class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f12949iobyxmoadg = -1;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final Interpolator f12948zoijcleaow = new iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Interpolator f12947ppxfxbqfkf = new zoijcleaow();

        class iobyxmoadg implements Interpolator {
            iobyxmoadg() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f13) {
                return f13 * f13 * f13 * f13 * f13;
            }
        }

        class zoijcleaow implements Interpolator {
            zoijcleaow() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f13) {
                float f14 = f13 - 1.0f;
                return (f14 * f14 * f14 * f14 * f14) + 1.0f;
            }
        }

        private int dxjokdxxww(RecyclerView recyclerView) {
            if (this.f12949iobyxmoadg == -1) {
                this.f12949iobyxmoadg = recyclerView.getResources().getDimensionPixelSize(m5.zoijcleaow.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f12949iobyxmoadg;
        }

        public static int eablkybsjg(int i13, int i14) {
            int i15;
            int i16 = i13 & 789516;
            if (i16 == 0) {
                return i13;
            }
            int i17 = i13 & (~i16);
            if (i14 == 0) {
                i15 = i16 << 2;
            } else {
                int i18 = i16 << 1;
                i17 |= (-789517) & i18;
                i15 = (i18 & 789516) << 2;
            }
            return i17 | i15;
        }

        public static int kcexrzcfyt(int i13, int i14) {
            return i14 << (i13 * 8);
        }

        public static int zdlpuopuiu(int i13, int i14) {
            return kcexrzcfyt(2, i13) | kcexrzcfyt(1, i14) | kcexrzcfyt(0, i14 | i13);
        }

        public float agtfadlqog(float f13) {
            return f13;
        }

        public float btonecajqb(RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return 0.5f;
        }

        void cqumvgiudr(Canvas canvas, RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, List list, int i13, float f13, float f14) {
            int size = list.size();
            boolean z13 = false;
            for (int i14 = 0; i14 < size; i14++) {
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) list.get(i14);
                int iSave = canvas.save();
                jyumaefscl(canvas, recyclerView, lqeggnwhkgVar.f12957eablkybsjg, lqeggnwhkgVar.f12954btonecajqb, lqeggnwhkgVar.f12958gtknphoqwx, lqeggnwhkgVar.f12959gxszxtbevo, false);
                canvas.restoreToCount(iSave);
            }
            if (iozdgvuglvVar != null) {
                int iSave2 = canvas.save();
                jyumaefscl(canvas, recyclerView, iozdgvuglvVar, f13, f14, i13, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i15 = size - 1; i15 >= 0; i15--) {
                lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) list.get(i15);
                boolean z14 = lqeggnwhkgVar2.f12964wflxmlrfwp;
                if (z14 && !lqeggnwhkgVar2.f12956dxjokdxxww) {
                    list.remove(i15);
                } else if (!z14) {
                    z13 = true;
                }
            }
            if (z13) {
                recyclerView.invalidate();
            }
        }

        public float draadjrbmk(float f13) {
            return f13;
        }

        public abstract boolean esjtqupxsv(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2);

        public abstract int gtknphoqwx(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar);

        final int gxszxtbevo(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return wkgbmnqykc(gtknphoqwx(recyclerView, iozdgvuglvVar), jhduphickx.lereixgezr(recyclerView));
        }

        public boolean iobyxmoadg(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2) {
            return true;
        }

        void iwizpuwonk(Canvas canvas, RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, List list, int i13, float f13, float f14) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) list.get(i14);
                lqeggnwhkgVar.eablkybsjg();
                int iSave = canvas.save();
                yggfygwlhe(canvas, recyclerView, lqeggnwhkgVar.f12957eablkybsjg, lqeggnwhkgVar.f12954btonecajqb, lqeggnwhkgVar.f12958gtknphoqwx, lqeggnwhkgVar.f12959gxszxtbevo, false);
                canvas.restoreToCount(iSave);
            }
            if (iozdgvuglvVar != null) {
                int iSave2 = canvas.save();
                yggfygwlhe(canvas, recyclerView, iozdgvuglvVar, f13, f14, i13, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void jyumaefscl(Canvas canvas, RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, float f13, float f14, int i13, boolean z13) {
            agtfadlqog.f12880iobyxmoadg.wkgbmnqykc(canvas, recyclerView, iozdgvuglvVar.itemView, f13, f14, i13, z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void lereixgezr(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, RecyclerView.iozdgvuglv iozdgvuglvVar2, int i14, int i15, int i16) {
            RecyclerView.rgvfuqvkyq layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof dxjokdxxww) {
                ((dxjokdxxww) layoutManager).nufgyqmvbu(iozdgvuglvVar.itemView, iozdgvuglvVar2.itemView, i15, i16);
                return;
            }
            if (layoutManager.pmvmpeiblj()) {
                if (layoutManager.rlfsiqarku(iozdgvuglvVar2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.A(i14);
                }
                if (layoutManager.yfnezrywwk(iozdgvuglvVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.A(i14);
                }
            }
            if (layoutManager.zynmafqrjb()) {
                if (layoutManager.ydmasvzmpa(iozdgvuglvVar2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.A(i14);
                }
                if (layoutManager.xrmfcynszj(iozdgvuglvVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.A(i14);
                }
            }
        }

        public long lqeggnwhkg(RecyclerView recyclerView, int i13, float f13, float f14) {
            RecyclerView.wflxmlrfwp itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i13 == 8 ? 200L : 250L;
            }
            return i13 == 8 ? itemAnimator.agtfadlqog() : itemAnimator.ojitshcjhn();
        }

        public int nufgyqmvbu() {
            return 0;
        }

        boolean ojitshcjhn(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return (gxszxtbevo(recyclerView, iozdgvuglvVar) & 16711680) != 0;
        }

        public boolean oxmwwwfdhm() {
            return true;
        }

        public void pmvmpeiblj(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
            if (iozdgvuglvVar != null) {
                agtfadlqog.f12880iobyxmoadg.zoijcleaow(iozdgvuglvVar.itemView);
            }
        }

        public void ppxfxbqfkf(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            agtfadlqog.f12880iobyxmoadg.iobyxmoadg(iozdgvuglvVar.itemView);
        }

        public int rgvfuqvkyq(RecyclerView recyclerView, int i13, int i14, int i15, long j13) {
            int iSignum = (int) (((int) (((int) Math.signum(i14)) * dxjokdxxww(recyclerView) * f12947ppxfxbqfkf.getInterpolation(Math.min(1.0f, (Math.abs(i14) * 1.0f) / i13)))) * f12948zoijcleaow.getInterpolation(j13 <= MockConstants.TWO_SECONDS_DELAY ? j13 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i14 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean vdvldrhtss() {
            return true;
        }

        public float wflxmlrfwp(RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return 0.5f;
        }

        public int wkgbmnqykc(int i13, int i14) {
            int i15;
            int i16 = i13 & 3158064;
            if (i16 == 0) {
                return i13;
            }
            int i17 = i13 & (~i16);
            if (i14 == 0) {
                i15 = i16 >> 2;
            } else {
                int i18 = i16 >> 1;
                i17 |= (-3158065) & i18;
                i15 = (i18 & 3158064) >> 2;
            }
            return i17 | i15;
        }

        public void yggfygwlhe(Canvas canvas, RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar, float f13, float f14, int i13, boolean z13) {
            agtfadlqog.f12880iobyxmoadg.ppxfxbqfkf(canvas, recyclerView, iozdgvuglvVar.itemView, f13, f14, i13, z13);
        }

        public RecyclerView.iozdgvuglv zoijcleaow(RecyclerView.iozdgvuglv iozdgvuglvVar, List list, int i13, int i14) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i13 + iozdgvuglvVar.itemView.getWidth();
            int height = i14 + iozdgvuglvVar.itemView.getHeight();
            int left2 = i13 - iozdgvuglvVar.itemView.getLeft();
            int top2 = i14 - iozdgvuglvVar.itemView.getTop();
            int size = list.size();
            RecyclerView.iozdgvuglv iozdgvuglvVar2 = null;
            int i15 = -1;
            for (int i16 = 0; i16 < size; i16++) {
                RecyclerView.iozdgvuglv iozdgvuglvVar3 = (RecyclerView.iozdgvuglv) list.get(i16);
                if (left2 > 0 && (right = iozdgvuglvVar3.itemView.getRight() - width) < 0 && iozdgvuglvVar3.itemView.getRight() > iozdgvuglvVar.itemView.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                    iozdgvuglvVar2 = iozdgvuglvVar3;
                    i15 = iAbs4;
                }
                if (left2 < 0 && (left = iozdgvuglvVar3.itemView.getLeft() - i13) > 0 && iozdgvuglvVar3.itemView.getLeft() < iozdgvuglvVar.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                    iozdgvuglvVar2 = iozdgvuglvVar3;
                    i15 = iAbs3;
                }
                if (top2 < 0 && (top = iozdgvuglvVar3.itemView.getTop() - i14) > 0 && iozdgvuglvVar3.itemView.getTop() < iozdgvuglvVar.itemView.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                    iozdgvuglvVar2 = iozdgvuglvVar3;
                    i15 = iAbs2;
                }
                if (top2 > 0 && (bottom = iozdgvuglvVar3.itemView.getBottom() - height) < 0 && iozdgvuglvVar3.itemView.getBottom() > iozdgvuglvVar.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                    iozdgvuglvVar2 = iozdgvuglvVar3;
                    i15 = iAbs;
                }
            }
            return iozdgvuglvVar2;
        }

        public abstract void zynmafqrjb(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13);
    }

    private class gxszxtbevo extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f12951zdlpuopuiu = true;

        gxszxtbevo() {
        }

        void iobyxmoadg() {
            this.f12951zdlpuopuiu = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewAgtfadlqog;
            RecyclerView.iozdgvuglv iozdgvuglvVarSflfametgt;
            if (!this.f12951zdlpuopuiu || (viewAgtfadlqog = draadjrbmk.this.agtfadlqog(motionEvent)) == null || (iozdgvuglvVarSflfametgt = draadjrbmk.this.f12936oxmwwwfdhm.sflfametgt(viewAgtfadlqog)) == null) {
                return;
            }
            draadjrbmk draadjrbmkVar = draadjrbmk.this;
            if (draadjrbmkVar.f12941wflxmlrfwp.ojitshcjhn(draadjrbmkVar.f12936oxmwwwfdhm, iozdgvuglvVarSflfametgt)) {
                int pointerId = motionEvent.getPointerId(0);
                int i13 = draadjrbmk.this.f12921draadjrbmk;
                if (pointerId == i13) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                    float x13 = motionEvent.getX(iFindPointerIndex);
                    float y13 = motionEvent.getY(iFindPointerIndex);
                    draadjrbmk draadjrbmkVar2 = draadjrbmk.this;
                    draadjrbmkVar2.f12942wkgbmnqykc = x13;
                    draadjrbmkVar2.f12923eablkybsjg = y13;
                    draadjrbmkVar2.f12922dxjokdxxww = 0.0f;
                    draadjrbmkVar2.f12934nufgyqmvbu = 0.0f;
                    if (draadjrbmkVar2.f12941wflxmlrfwp.oxmwwwfdhm()) {
                        draadjrbmk.this.lereixgezr(iozdgvuglvVarSflfametgt, 2);
                    }
                }
            }
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            draadjrbmk draadjrbmkVar = draadjrbmk.this;
            if (draadjrbmkVar.f12938ppxfxbqfkf == null || !draadjrbmkVar.esjtqupxsv()) {
                return;
            }
            draadjrbmk draadjrbmkVar2 = draadjrbmk.this;
            RecyclerView.iozdgvuglv iozdgvuglvVar = draadjrbmkVar2.f12938ppxfxbqfkf;
            if (iozdgvuglvVar != null) {
                draadjrbmkVar2.zdlpuopuiu(iozdgvuglvVar);
            }
            draadjrbmk draadjrbmkVar3 = draadjrbmk.this;
            draadjrbmkVar3.f12936oxmwwwfdhm.removeCallbacks(draadjrbmkVar3.f12931kcexrzcfyt);
            jhduphickx.metgxyhuhe(draadjrbmk.this.f12936oxmwwwfdhm, this);
        }
    }

    static class lqeggnwhkg implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private float f12953agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        float f12954btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        boolean f12956dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final RecyclerView.iozdgvuglv f12957eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f12958gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final int f12959gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final float f12960iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final ValueAnimator f12961lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final int f12962nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final float f12963ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final float f12965wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final float f12966zoijcleaow;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        boolean f12955draadjrbmk = false;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        boolean f12964wflxmlrfwp = false;

        class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {
            iobyxmoadg() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                lqeggnwhkg.this.ppxfxbqfkf(valueAnimator.getAnimatedFraction());
            }
        }

        lqeggnwhkg(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, float f13, float f14, float f15, float f16) {
            this.f12959gxszxtbevo = i14;
            this.f12962nufgyqmvbu = i13;
            this.f12957eablkybsjg = iozdgvuglvVar;
            this.f12960iobyxmoadg = f13;
            this.f12966zoijcleaow = f14;
            this.f12963ppxfxbqfkf = f15;
            this.f12965wkgbmnqykc = f16;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f12961lqeggnwhkg = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new iobyxmoadg());
            valueAnimatorOfFloat.setTarget(iozdgvuglvVar.itemView);
            valueAnimatorOfFloat.addListener(this);
            ppxfxbqfkf(0.0f);
        }

        public void eablkybsjg() {
            float f13 = this.f12960iobyxmoadg;
            float f14 = this.f12963ppxfxbqfkf;
            if (f13 == f14) {
                this.f12954btonecajqb = this.f12957eablkybsjg.itemView.getTranslationX();
            } else {
                this.f12954btonecajqb = f13 + (this.f12953agtfadlqog * (f14 - f13));
            }
            float f15 = this.f12966zoijcleaow;
            float f16 = this.f12965wkgbmnqykc;
            if (f15 == f16) {
                this.f12958gtknphoqwx = this.f12957eablkybsjg.itemView.getTranslationY();
            } else {
                this.f12958gtknphoqwx = f15 + (this.f12953agtfadlqog * (f16 - f15));
            }
        }

        public void iobyxmoadg() {
            this.f12961lqeggnwhkg.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ppxfxbqfkf(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f12964wflxmlrfwp) {
                this.f12957eablkybsjg.setIsRecyclable(true);
            }
            this.f12964wflxmlrfwp = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public void ppxfxbqfkf(float f13) {
            this.f12953agtfadlqog = f13;
        }

        public void wkgbmnqykc() {
            this.f12957eablkybsjg.setIsRecyclable(false);
            this.f12961lqeggnwhkg.start();
        }

        public void zoijcleaow(long j13) {
            this.f12961lqeggnwhkg.setDuration(j13);
        }
    }

    public static abstract class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f12968eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f12969wkgbmnqykc;

        public nufgyqmvbu(int i13, int i14) {
            this.f12969wkgbmnqykc = i14;
            this.f12968eablkybsjg = i13;
        }

        public int cdpycssgdh(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return this.f12969wkgbmnqykc;
        }

        @Override // androidx.recyclerview.widget.draadjrbmk.eablkybsjg
        public int gtknphoqwx(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return eablkybsjg.zdlpuopuiu(istkbnxepw(recyclerView, iozdgvuglvVar), cdpycssgdh(recyclerView, iozdgvuglvVar));
        }

        public int istkbnxepw(RecyclerView recyclerView, RecyclerView.iozdgvuglv iozdgvuglvVar) {
            return this.f12968eablkybsjg;
        }
    }

    class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        final /* synthetic */ int f12970ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        final /* synthetic */ RecyclerView.iozdgvuglv f12971rgvfuqvkyq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, float f13, float f14, float f15, float f16, int i15, RecyclerView.iozdgvuglv iozdgvuglvVar2) {
            super(iozdgvuglvVar, i13, i14, f13, f14, f15, f16);
            this.f12970ojitshcjhn = i15;
            this.f12971rgvfuqvkyq = iozdgvuglvVar2;
        }

        @Override // androidx.recyclerview.widget.draadjrbmk.lqeggnwhkg, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f12955draadjrbmk) {
                return;
            }
            if (this.f12970ojitshcjhn <= 0) {
                draadjrbmk draadjrbmkVar = draadjrbmk.this;
                draadjrbmkVar.f12941wflxmlrfwp.ppxfxbqfkf(draadjrbmkVar.f12936oxmwwwfdhm, this.f12971rgvfuqvkyq);
            } else {
                draadjrbmk.this.f12927iobyxmoadg.add(this.f12971rgvfuqvkyq.itemView);
                this.f12956dxjokdxxww = true;
                int i13 = this.f12970ojitshcjhn;
                if (i13 > 0) {
                    draadjrbmk.this.jyumaefscl(this, i13);
                }
            }
            draadjrbmk draadjrbmkVar2 = draadjrbmk.this;
            View view = draadjrbmkVar2.f12920cqumvgiudr;
            View view2 = this.f12971rgvfuqvkyq.itemView;
            if (view == view2) {
                draadjrbmkVar2.cqumvgiudr(view2);
            }
        }
    }

    class wkgbmnqykc implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f12974yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f12975zdlpuopuiu;

        wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, int i13) {
            this.f12975zdlpuopuiu = lqeggnwhkgVar;
            this.f12974yggfygwlhe = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = draadjrbmk.this.f12936oxmwwwfdhm;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            lqeggnwhkg lqeggnwhkgVar = this.f12975zdlpuopuiu;
            if (lqeggnwhkgVar.f12955draadjrbmk || lqeggnwhkgVar.f12957eablkybsjg.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.wflxmlrfwp itemAnimator = draadjrbmk.this.f12936oxmwwwfdhm.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.vdvldrhtss(null)) && !draadjrbmk.this.oxmwwwfdhm()) {
                draadjrbmk.this.f12941wflxmlrfwp.zynmafqrjb(this.f12975zdlpuopuiu.f12957eablkybsjg, this.f12974yggfygwlhe);
            } else {
                draadjrbmk.this.f12936oxmwwwfdhm.post(this);
            }
        }
    }

    class zoijcleaow implements RecyclerView.zdlpuopuiu {
        zoijcleaow() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
        public void eablkybsjg(boolean z13) {
            if (z13) {
                draadjrbmk.this.lereixgezr(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
        public void iobyxmoadg(RecyclerView recyclerView, MotionEvent motionEvent) {
            draadjrbmk.this.f12932lereixgezr.iobyxmoadg(motionEvent);
            VelocityTracker velocityTracker = draadjrbmk.this.f12944zdlpuopuiu;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (draadjrbmk.this.f12921draadjrbmk == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(draadjrbmk.this.f12921draadjrbmk);
            if (iFindPointerIndex >= 0) {
                draadjrbmk.this.dxjokdxxww(actionMasked, motionEvent, iFindPointerIndex);
            }
            draadjrbmk draadjrbmkVar = draadjrbmk.this;
            RecyclerView.iozdgvuglv iozdgvuglvVar = draadjrbmkVar.f12938ppxfxbqfkf;
            if (iozdgvuglvVar == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        draadjrbmkVar.yadqdtsiqt(motionEvent, draadjrbmkVar.f12935ojitshcjhn, iFindPointerIndex);
                        draadjrbmk.this.zdlpuopuiu(iozdgvuglvVar);
                        draadjrbmk draadjrbmkVar2 = draadjrbmk.this;
                        draadjrbmkVar2.f12936oxmwwwfdhm.removeCallbacks(draadjrbmkVar2.f12931kcexrzcfyt);
                        draadjrbmk.this.f12931kcexrzcfyt.run();
                        draadjrbmk.this.f12936oxmwwwfdhm.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    draadjrbmk draadjrbmkVar3 = draadjrbmk.this;
                    if (pointerId == draadjrbmkVar3.f12921draadjrbmk) {
                        draadjrbmkVar3.f12921draadjrbmk = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        draadjrbmk draadjrbmkVar4 = draadjrbmk.this;
                        draadjrbmkVar4.yadqdtsiqt(motionEvent, draadjrbmkVar4.f12935ojitshcjhn, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = draadjrbmkVar.f12944zdlpuopuiu;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            draadjrbmk.this.lereixgezr(null, 0);
            draadjrbmk.this.f12921draadjrbmk = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
        public boolean ppxfxbqfkf(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            lqeggnwhkg lqeggnwhkgVarWflxmlrfwp;
            draadjrbmk.this.f12932lereixgezr.iobyxmoadg(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                draadjrbmk.this.f12921draadjrbmk = motionEvent.getPointerId(0);
                draadjrbmk.this.f12942wkgbmnqykc = motionEvent.getX();
                draadjrbmk.this.f12923eablkybsjg = motionEvent.getY();
                draadjrbmk.this.yggfygwlhe();
                draadjrbmk draadjrbmkVar = draadjrbmk.this;
                if (draadjrbmkVar.f12938ppxfxbqfkf == null && (lqeggnwhkgVarWflxmlrfwp = draadjrbmkVar.wflxmlrfwp(motionEvent)) != null) {
                    draadjrbmk draadjrbmkVar2 = draadjrbmk.this;
                    draadjrbmkVar2.f12942wkgbmnqykc -= lqeggnwhkgVarWflxmlrfwp.f12954btonecajqb;
                    draadjrbmkVar2.f12923eablkybsjg -= lqeggnwhkgVarWflxmlrfwp.f12958gtknphoqwx;
                    draadjrbmkVar2.draadjrbmk(lqeggnwhkgVarWflxmlrfwp.f12957eablkybsjg, true);
                    if (draadjrbmk.this.f12927iobyxmoadg.remove(lqeggnwhkgVarWflxmlrfwp.f12957eablkybsjg.itemView)) {
                        draadjrbmk draadjrbmkVar3 = draadjrbmk.this;
                        draadjrbmkVar3.f12941wflxmlrfwp.ppxfxbqfkf(draadjrbmkVar3.f12936oxmwwwfdhm, lqeggnwhkgVarWflxmlrfwp.f12957eablkybsjg);
                    }
                    draadjrbmk.this.lereixgezr(lqeggnwhkgVarWflxmlrfwp.f12957eablkybsjg, lqeggnwhkgVarWflxmlrfwp.f12959gxszxtbevo);
                    draadjrbmk draadjrbmkVar4 = draadjrbmk.this;
                    draadjrbmkVar4.yadqdtsiqt(motionEvent, draadjrbmkVar4.f12935ojitshcjhn, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                draadjrbmk draadjrbmkVar5 = draadjrbmk.this;
                draadjrbmkVar5.f12921draadjrbmk = -1;
                draadjrbmkVar5.lereixgezr(null, 0);
            } else {
                int i13 = draadjrbmk.this.f12921draadjrbmk;
                if (i13 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i13)) >= 0) {
                    draadjrbmk.this.dxjokdxxww(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = draadjrbmk.this.f12944zdlpuopuiu;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return draadjrbmk.this.f12938ppxfxbqfkf != null;
        }
    }

    public draadjrbmk(eablkybsjg eablkybsjgVar) {
        this.f12941wflxmlrfwp = eablkybsjgVar;
    }

    private int btonecajqb(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        if ((i13 & 3) == 0) {
            return 0;
        }
        int i14 = this.f12922dxjokdxxww > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f12944zdlpuopuiu;
        if (velocityTracker != null && this.f12921draadjrbmk > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f12941wflxmlrfwp.agtfadlqog(this.f12933lqeggnwhkg));
            float xVelocity = this.f12944zdlpuopuiu.getXVelocity(this.f12921draadjrbmk);
            float yVelocity = this.f12944zdlpuopuiu.getYVelocity(this.f12921draadjrbmk);
            int i15 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i15 & i13) != 0 && i15 == i14 && fAbs >= this.f12941wflxmlrfwp.draadjrbmk(this.f12926gxszxtbevo) && fAbs > Math.abs(xVelocity)) {
                return i15;
            }
        }
        float height = this.f12936oxmwwwfdhm.getHeight() * this.f12941wflxmlrfwp.wflxmlrfwp(iozdgvuglvVar);
        if ((i13 & i14) == 0 || Math.abs(this.f12922dxjokdxxww) <= height) {
            return 0;
        }
        return i14;
    }

    private int cdpycssgdh(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        if (this.f12917agtfadlqog == 2) {
            return 0;
        }
        int iGtknphoqwx = this.f12941wflxmlrfwp.gtknphoqwx(this.f12936oxmwwwfdhm, iozdgvuglvVar);
        int iWkgbmnqykc = (this.f12941wflxmlrfwp.wkgbmnqykc(iGtknphoqwx, jhduphickx.lereixgezr(this.f12936oxmwwwfdhm)) & 65280) >> 8;
        if (iWkgbmnqykc == 0) {
            return 0;
        }
        int i13 = (iGtknphoqwx & 65280) >> 8;
        if (Math.abs(this.f12934nufgyqmvbu) > Math.abs(this.f12922dxjokdxxww)) {
            int iNufgyqmvbu = nufgyqmvbu(iozdgvuglvVar, iWkgbmnqykc);
            if (iNufgyqmvbu > 0) {
                return (i13 & iNufgyqmvbu) == 0 ? eablkybsjg.eablkybsjg(iNufgyqmvbu, jhduphickx.lereixgezr(this.f12936oxmwwwfdhm)) : iNufgyqmvbu;
            }
            int iBtonecajqb = btonecajqb(iozdgvuglvVar, iWkgbmnqykc);
            if (iBtonecajqb > 0) {
                return iBtonecajqb;
            }
        } else {
            int iBtonecajqb2 = btonecajqb(iozdgvuglvVar, iWkgbmnqykc);
            if (iBtonecajqb2 > 0) {
                return iBtonecajqb2;
            }
            int iNufgyqmvbu2 = nufgyqmvbu(iozdgvuglvVar, iWkgbmnqykc);
            if (iNufgyqmvbu2 > 0) {
                return (i13 & iNufgyqmvbu2) == 0 ? eablkybsjg.eablkybsjg(iNufgyqmvbu2, jhduphickx.lereixgezr(this.f12936oxmwwwfdhm)) : iNufgyqmvbu2;
            }
        }
        return 0;
    }

    private void gtknphoqwx() {
        this.f12936oxmwwwfdhm.o(this);
        this.f12936oxmwwwfdhm.q(this.f12946zynmafqrjb);
        this.f12936oxmwwwfdhm.p(this);
        for (int size = this.f12939rgvfuqvkyq.size() - 1; size >= 0; size--) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f12939rgvfuqvkyq.get(0);
            lqeggnwhkgVar.iobyxmoadg();
            this.f12941wflxmlrfwp.ppxfxbqfkf(this.f12936oxmwwwfdhm, lqeggnwhkgVar.f12957eablkybsjg);
        }
        this.f12939rgvfuqvkyq.clear();
        this.f12920cqumvgiudr = null;
        this.f12924esjtqupxsv = -1;
        iwizpuwonk();
        istkbnxepw();
    }

    private void gxszxtbevo() {
    }

    private void istkbnxepw() {
        gxszxtbevo gxszxtbevoVar = this.f12937pmvmpeiblj;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg();
            this.f12937pmvmpeiblj = null;
        }
        if (this.f12932lereixgezr != null) {
            this.f12932lereixgezr = null;
        }
    }

    private void iwizpuwonk() {
        VelocityTracker velocityTracker = this.f12944zdlpuopuiu;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12944zdlpuopuiu = null;
        }
    }

    private static boolean kcexrzcfyt(View view, float f13, float f14, float f15, float f16) {
        return f13 >= f15 && f13 <= f15 + ((float) view.getWidth()) && f14 >= f16 && f14 <= f16 + ((float) view.getHeight());
    }

    private int nufgyqmvbu(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        if ((i13 & 12) == 0) {
            return 0;
        }
        int i14 = this.f12934nufgyqmvbu > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f12944zdlpuopuiu;
        if (velocityTracker != null && this.f12921draadjrbmk > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f12941wflxmlrfwp.agtfadlqog(this.f12933lqeggnwhkg));
            float xVelocity = this.f12944zdlpuopuiu.getXVelocity(this.f12921draadjrbmk);
            float yVelocity = this.f12944zdlpuopuiu.getYVelocity(this.f12921draadjrbmk);
            int i15 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i15 & i13) != 0 && i14 == i15 && fAbs >= this.f12941wflxmlrfwp.draadjrbmk(this.f12926gxszxtbevo) && fAbs > Math.abs(yVelocity)) {
                return i15;
            }
        }
        float width = this.f12936oxmwwwfdhm.getWidth() * this.f12941wflxmlrfwp.wflxmlrfwp(iozdgvuglvVar);
        if ((i13 & i14) == 0 || Math.abs(this.f12934nufgyqmvbu) <= width) {
            return 0;
        }
        return i14;
    }

    private List ojitshcjhn(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        RecyclerView.iozdgvuglv iozdgvuglvVar2 = iozdgvuglvVar;
        List list = this.f12943yggfygwlhe;
        if (list == null) {
            this.f12943yggfygwlhe = new ArrayList();
            this.f12930jyumaefscl = new ArrayList();
        } else {
            list.clear();
            this.f12930jyumaefscl.clear();
        }
        int iNufgyqmvbu = this.f12941wflxmlrfwp.nufgyqmvbu();
        int iRound = Math.round(this.f12918btonecajqb + this.f12934nufgyqmvbu) - iNufgyqmvbu;
        int iRound2 = Math.round(this.f12925gtknphoqwx + this.f12922dxjokdxxww) - iNufgyqmvbu;
        int i13 = iNufgyqmvbu * 2;
        int width = iozdgvuglvVar2.itemView.getWidth() + iRound + i13;
        int height = iozdgvuglvVar2.itemView.getHeight() + iRound2 + i13;
        int i14 = (iRound + width) / 2;
        int i15 = (iRound2 + height) / 2;
        RecyclerView.rgvfuqvkyq layoutManager = this.f12936oxmwwwfdhm.getLayoutManager();
        int iVipkmwdibw = layoutManager.vipkmwdibw();
        int i16 = 0;
        while (i16 < iVipkmwdibw) {
            View viewRibwqtqdhb = layoutManager.ribwqtqdhb(i16);
            if (viewRibwqtqdhb != iozdgvuglvVar2.itemView && viewRibwqtqdhb.getBottom() >= iRound2 && viewRibwqtqdhb.getTop() <= height && viewRibwqtqdhb.getRight() >= iRound && viewRibwqtqdhb.getLeft() <= width) {
                RecyclerView.iozdgvuglv iozdgvuglvVarSflfametgt = this.f12936oxmwwwfdhm.sflfametgt(viewRibwqtqdhb);
                if (this.f12941wflxmlrfwp.iobyxmoadg(this.f12936oxmwwwfdhm, this.f12938ppxfxbqfkf, iozdgvuglvVarSflfametgt)) {
                    int iAbs = Math.abs(i14 - ((viewRibwqtqdhb.getLeft() + viewRibwqtqdhb.getRight()) / 2));
                    int iAbs2 = Math.abs(i15 - ((viewRibwqtqdhb.getTop() + viewRibwqtqdhb.getBottom()) / 2));
                    int i17 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f12943yggfygwlhe.size();
                    int i18 = 0;
                    for (int i19 = 0; i19 < size && i17 > ((Integer) this.f12930jyumaefscl.get(i19)).intValue(); i19++) {
                        i18++;
                    }
                    this.f12943yggfygwlhe.add(i18, iozdgvuglvVarSflfametgt);
                    this.f12930jyumaefscl.add(i18, Integer.valueOf(i17));
                }
            }
            i16++;
            iozdgvuglvVar2 = iozdgvuglvVar;
        }
        return this.f12943yggfygwlhe;
    }

    private void pmvmpeiblj() {
        this.f12940vdvldrhtss = ViewConfiguration.get(this.f12936oxmwwwfdhm.getContext()).getScaledTouchSlop();
        this.f12936oxmwwwfdhm.btonecajqb(this);
        this.f12936oxmwwwfdhm.wflxmlrfwp(this.f12946zynmafqrjb);
        this.f12936oxmwwwfdhm.draadjrbmk(this);
        zynmafqrjb();
    }

    private RecyclerView.iozdgvuglv rgvfuqvkyq(MotionEvent motionEvent) {
        View viewAgtfadlqog;
        RecyclerView.rgvfuqvkyq layoutManager = this.f12936oxmwwwfdhm.getLayoutManager();
        int i13 = this.f12921draadjrbmk;
        if (i13 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i13);
        float x13 = motionEvent.getX(iFindPointerIndex) - this.f12942wkgbmnqykc;
        float y13 = motionEvent.getY(iFindPointerIndex) - this.f12923eablkybsjg;
        float fAbs = Math.abs(x13);
        float fAbs2 = Math.abs(y13);
        int i14 = this.f12940vdvldrhtss;
        if (fAbs < i14 && fAbs2 < i14) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.pmvmpeiblj()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.zynmafqrjb()) && (viewAgtfadlqog = agtfadlqog(motionEvent)) != null) {
            return this.f12936oxmwwwfdhm.sflfametgt(viewAgtfadlqog);
        }
        return null;
    }

    private void vdvldrhtss(float[] fArr) {
        if ((this.f12935ojitshcjhn & 12) != 0) {
            fArr[0] = (this.f12918btonecajqb + this.f12934nufgyqmvbu) - this.f12938ppxfxbqfkf.itemView.getLeft();
        } else {
            fArr[0] = this.f12938ppxfxbqfkf.itemView.getTranslationX();
        }
        if ((this.f12935ojitshcjhn & 3) != 0) {
            fArr[1] = (this.f12925gtknphoqwx + this.f12922dxjokdxxww) - this.f12938ppxfxbqfkf.itemView.getTop();
        } else {
            fArr[1] = this.f12938ppxfxbqfkf.itemView.getTranslationY();
        }
    }

    private void zynmafqrjb() {
        this.f12937pmvmpeiblj = new gxszxtbevo();
        this.f12932lereixgezr = new v1.kcexrzcfyt(this.f12936oxmwwwfdhm.getContext(), this.f12937pmvmpeiblj);
    }

    View agtfadlqog(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        RecyclerView.iozdgvuglv iozdgvuglvVar = this.f12938ppxfxbqfkf;
        if (iozdgvuglvVar != null) {
            View view = iozdgvuglvVar.itemView;
            if (kcexrzcfyt(view, x13, y13, this.f12918btonecajqb + this.f12934nufgyqmvbu, this.f12925gtknphoqwx + this.f12922dxjokdxxww)) {
                return view;
            }
        }
        for (int size = this.f12939rgvfuqvkyq.size() - 1; size >= 0; size--) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f12939rgvfuqvkyq.get(size);
            View view2 = lqeggnwhkgVar.f12957eablkybsjg.itemView;
            if (kcexrzcfyt(view2, x13, y13, lqeggnwhkgVar.f12954btonecajqb, lqeggnwhkgVar.f12958gtknphoqwx)) {
                return view2;
            }
        }
        return this.f12936oxmwwwfdhm.crxdokpmqz(x13, y13);
    }

    void cqumvgiudr(View view) {
        if (view == this.f12920cqumvgiudr) {
            this.f12920cqumvgiudr = null;
            if (this.f12929iwizpuwonk != null) {
                this.f12936oxmwwwfdhm.setChildDrawingOrderCallback(null);
            }
        }
    }

    void draadjrbmk(RecyclerView.iozdgvuglv iozdgvuglvVar, boolean z13) {
        for (int size = this.f12939rgvfuqvkyq.size() - 1; size >= 0; size--) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f12939rgvfuqvkyq.get(size);
            if (lqeggnwhkgVar.f12957eablkybsjg == iozdgvuglvVar) {
                lqeggnwhkgVar.f12955draadjrbmk |= z13;
                if (!lqeggnwhkgVar.f12964wflxmlrfwp) {
                    lqeggnwhkgVar.iobyxmoadg();
                }
                this.f12939rgvfuqvkyq.remove(size);
                return;
            }
        }
    }

    void dxjokdxxww(int i13, MotionEvent motionEvent, int i14) {
        RecyclerView.iozdgvuglv iozdgvuglvVarRgvfuqvkyq;
        int iGxszxtbevo;
        if (this.f12938ppxfxbqfkf != null || i13 != 2 || this.f12917agtfadlqog == 2 || !this.f12941wflxmlrfwp.vdvldrhtss() || this.f12936oxmwwwfdhm.getScrollState() == 1 || (iozdgvuglvVarRgvfuqvkyq = rgvfuqvkyq(motionEvent)) == null || (iGxszxtbevo = (this.f12941wflxmlrfwp.gxszxtbevo(this.f12936oxmwwwfdhm, iozdgvuglvVarRgvfuqvkyq) & 65280) >> 8) == 0) {
            return;
        }
        float x13 = motionEvent.getX(i14);
        float y13 = motionEvent.getY(i14);
        float f13 = x13 - this.f12942wkgbmnqykc;
        float f14 = y13 - this.f12923eablkybsjg;
        float fAbs = Math.abs(f13);
        float fAbs2 = Math.abs(f14);
        int i15 = this.f12940vdvldrhtss;
        if (fAbs >= i15 || fAbs2 >= i15) {
            if (fAbs > fAbs2) {
                if (f13 < 0.0f && (iGxszxtbevo & 4) == 0) {
                    return;
                }
                if (f13 > 0.0f && (iGxszxtbevo & 8) == 0) {
                    return;
                }
            } else {
                if (f14 < 0.0f && (iGxszxtbevo & 1) == 0) {
                    return;
                }
                if (f14 > 0.0f && (iGxszxtbevo & 2) == 0) {
                    return;
                }
            }
            this.f12922dxjokdxxww = 0.0f;
            this.f12934nufgyqmvbu = 0.0f;
            this.f12921draadjrbmk = motionEvent.getPointerId(0);
            lereixgezr(iozdgvuglvVarRgvfuqvkyq, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    boolean esjtqupxsv() {
        int iRgvfuqvkyq;
        int iRgvfuqvkyq2;
        int i13;
        int width;
        if (this.f12938ppxfxbqfkf == null) {
            this.f12919cdpycssgdh = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j13 = this.f12919cdpycssgdh;
        long j14 = j13 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j13;
        RecyclerView.rgvfuqvkyq layoutManager = this.f12936oxmwwwfdhm.getLayoutManager();
        if (this.f12928istkbnxepw == null) {
            this.f12928istkbnxepw = new Rect();
        }
        layoutManager.lereixgezr(this.f12938ppxfxbqfkf.itemView, this.f12928istkbnxepw);
        if (layoutManager.pmvmpeiblj()) {
            int i14 = (int) (this.f12918btonecajqb + this.f12934nufgyqmvbu);
            int paddingLeft = (i14 - this.f12928istkbnxepw.left) - this.f12936oxmwwwfdhm.getPaddingLeft();
            float f13 = this.f12934nufgyqmvbu;
            if (f13 < 0.0f && paddingLeft < 0) {
                iRgvfuqvkyq = paddingLeft;
            } else if (f13 <= 0.0f || (width = ((i14 + this.f12938ppxfxbqfkf.itemView.getWidth()) + this.f12928istkbnxepw.right) - (this.f12936oxmwwwfdhm.getWidth() - this.f12936oxmwwwfdhm.getPaddingRight())) <= 0) {
                iRgvfuqvkyq = 0;
            } else {
                iRgvfuqvkyq = width;
            }
        } else {
            iRgvfuqvkyq = 0;
        }
        if (layoutManager.zynmafqrjb()) {
            int i15 = (int) (this.f12925gtknphoqwx + this.f12922dxjokdxxww);
            int paddingTop = (i15 - this.f12928istkbnxepw.top) - this.f12936oxmwwwfdhm.getPaddingTop();
            float f14 = this.f12922dxjokdxxww;
            if (f14 < 0.0f && paddingTop < 0) {
                iRgvfuqvkyq2 = paddingTop;
            } else if (f14 <= 0.0f || (iRgvfuqvkyq2 = ((i15 + this.f12938ppxfxbqfkf.itemView.getHeight()) + this.f12928istkbnxepw.bottom) - (this.f12936oxmwwwfdhm.getHeight() - this.f12936oxmwwwfdhm.getPaddingBottom())) <= 0) {
                iRgvfuqvkyq2 = 0;
            }
        } else {
            iRgvfuqvkyq2 = 0;
        }
        if (iRgvfuqvkyq != 0) {
            iRgvfuqvkyq = this.f12941wflxmlrfwp.rgvfuqvkyq(this.f12936oxmwwwfdhm, this.f12938ppxfxbqfkf.itemView.getWidth(), iRgvfuqvkyq, this.f12936oxmwwwfdhm.getWidth(), j14);
        }
        int i16 = iRgvfuqvkyq;
        if (iRgvfuqvkyq2 != 0) {
            i13 = i16;
            iRgvfuqvkyq2 = this.f12941wflxmlrfwp.rgvfuqvkyq(this.f12936oxmwwwfdhm, this.f12938ppxfxbqfkf.itemView.getHeight(), iRgvfuqvkyq2, this.f12936oxmwwwfdhm.getHeight(), j14);
        } else {
            i13 = i16;
        }
        if (i13 == 0 && iRgvfuqvkyq2 == 0) {
            this.f12919cdpycssgdh = Long.MIN_VALUE;
            return false;
        }
        if (this.f12919cdpycssgdh == Long.MIN_VALUE) {
            this.f12919cdpycssgdh = jCurrentTimeMillis;
        }
        this.f12936oxmwwwfdhm.scrollBy(i13, iRgvfuqvkyq2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        rect.setEmpty();
    }

    void jyumaefscl(lqeggnwhkg lqeggnwhkgVar, int i13) {
        this.f12936oxmwwwfdhm.post(new wkgbmnqykc(lqeggnwhkgVar, i13));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    void lereixgezr(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        boolean z13;
        boolean z14;
        float fSignum;
        float fSignum2;
        int i14;
        if (iozdgvuglvVar == this.f12938ppxfxbqfkf && i13 == this.f12917agtfadlqog) {
            return;
        }
        this.f12919cdpycssgdh = Long.MIN_VALUE;
        int i15 = this.f12917agtfadlqog;
        draadjrbmk(iozdgvuglvVar, true);
        this.f12917agtfadlqog = i13;
        if (i13 == 2) {
            if (iozdgvuglvVar == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f12920cqumvgiudr = iozdgvuglvVar.itemView;
            gxszxtbevo();
        }
        int i16 = (1 << ((i13 * 8) + 8)) - 1;
        RecyclerView.iozdgvuglv iozdgvuglvVar2 = this.f12938ppxfxbqfkf;
        if (iozdgvuglvVar2 != null) {
            if (iozdgvuglvVar2.itemView.getParent() != null) {
                int iCdpycssgdh = i15 == 2 ? 0 : cdpycssgdh(iozdgvuglvVar2);
                iwizpuwonk();
                if (iCdpycssgdh == 1 || iCdpycssgdh == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f12922dxjokdxxww) * this.f12936oxmwwwfdhm.getHeight();
                } else if (iCdpycssgdh == 4 || iCdpycssgdh == 8 || iCdpycssgdh == 16 || iCdpycssgdh == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f12934nufgyqmvbu) * this.f12936oxmwwwfdhm.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i15 == 2) {
                    i14 = 8;
                } else {
                    i14 = iCdpycssgdh > 0 ? 2 : 4;
                }
                vdvldrhtss(this.f12945zoijcleaow);
                float[] fArr = this.f12945zoijcleaow;
                float f13 = fArr[0];
                float f14 = fArr[1];
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iozdgvuglvVar2, i14, i15, f13, f14, fSignum, fSignum2, iCdpycssgdh, iozdgvuglvVar2);
                ppxfxbqfkfVar.zoijcleaow(this.f12941wflxmlrfwp.lqeggnwhkg(this.f12936oxmwwwfdhm, i14, fSignum - f13, fSignum2 - f14));
                this.f12939rgvfuqvkyq.add(ppxfxbqfkfVar);
                ppxfxbqfkfVar.wkgbmnqykc();
                z13 = true;
            } else {
                cqumvgiudr(iozdgvuglvVar2.itemView);
                this.f12941wflxmlrfwp.ppxfxbqfkf(this.f12936oxmwwwfdhm, iozdgvuglvVar2);
                z13 = false;
            }
            this.f12938ppxfxbqfkf = null;
        } else {
            z13 = false;
        }
        if (iozdgvuglvVar != null) {
            this.f12935ojitshcjhn = (this.f12941wflxmlrfwp.gxszxtbevo(this.f12936oxmwwwfdhm, iozdgvuglvVar) & i16) >> (this.f12917agtfadlqog * 8);
            this.f12918btonecajqb = iozdgvuglvVar.itemView.getLeft();
            this.f12925gtknphoqwx = iozdgvuglvVar.itemView.getTop();
            this.f12938ppxfxbqfkf = iozdgvuglvVar;
            if (i13 == 2) {
                z14 = false;
                iozdgvuglvVar.itemView.performHapticFeedback(0);
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        ViewParent parent = this.f12936oxmwwwfdhm.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f12938ppxfxbqfkf != null ? true : z14);
        }
        if (!z13) {
            this.f12936oxmwwwfdhm.getLayoutManager().N();
        }
        this.f12941wflxmlrfwp.pmvmpeiblj(this.f12938ppxfxbqfkf, this.f12917agtfadlqog);
        this.f12936oxmwwwfdhm.invalidate();
    }

    public void lqeggnwhkg(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f12936oxmwwwfdhm;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            gtknphoqwx();
        }
        this.f12936oxmwwwfdhm = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f12926gxszxtbevo = resources.getDimension(m5.zoijcleaow.item_touch_helper_swipe_escape_velocity);
            this.f12933lqeggnwhkg = resources.getDimension(m5.zoijcleaow.item_touch_helper_swipe_escape_max_velocity);
            pmvmpeiblj();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        float f13;
        float f14;
        this.f12924esjtqupxsv = -1;
        if (this.f12938ppxfxbqfkf != null) {
            vdvldrhtss(this.f12945zoijcleaow);
            float[] fArr = this.f12945zoijcleaow;
            float f15 = fArr[0];
            f14 = fArr[1];
            f13 = f15;
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        this.f12941wflxmlrfwp.iwizpuwonk(canvas, recyclerView, this.f12938ppxfxbqfkf, this.f12939rgvfuqvkyq, this.f12917agtfadlqog, f13, f14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        float f13;
        float f14;
        if (this.f12938ppxfxbqfkf != null) {
            vdvldrhtss(this.f12945zoijcleaow);
            float[] fArr = this.f12945zoijcleaow;
            float f15 = fArr[0];
            f14 = fArr[1];
            f13 = f15;
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        this.f12941wflxmlrfwp.cqumvgiudr(canvas, recyclerView, this.f12938ppxfxbqfkf, this.f12939rgvfuqvkyq, this.f12917agtfadlqog, f13, f14);
    }

    boolean oxmwwwfdhm() {
        int size = this.f12939rgvfuqvkyq.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((lqeggnwhkg) this.f12939rgvfuqvkyq.get(i13)).f12964wflxmlrfwp) {
                return true;
            }
        }
        return false;
    }

    lqeggnwhkg wflxmlrfwp(MotionEvent motionEvent) {
        if (this.f12939rgvfuqvkyq.isEmpty()) {
            return null;
        }
        View viewAgtfadlqog = agtfadlqog(motionEvent);
        for (int size = this.f12939rgvfuqvkyq.size() - 1; size >= 0; size--) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f12939rgvfuqvkyq.get(size);
            if (lqeggnwhkgVar.f12957eablkybsjg.itemView == viewAgtfadlqog) {
                return lqeggnwhkgVar;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.oxmwwwfdhm
    public void wkgbmnqykc(View view) {
    }

    void yadqdtsiqt(MotionEvent motionEvent, int i13, int i14) {
        float x13 = motionEvent.getX(i14);
        float y13 = motionEvent.getY(i14);
        float f13 = x13 - this.f12942wkgbmnqykc;
        this.f12934nufgyqmvbu = f13;
        this.f12922dxjokdxxww = y13 - this.f12923eablkybsjg;
        if ((i13 & 4) == 0) {
            this.f12934nufgyqmvbu = Math.max(0.0f, f13);
        }
        if ((i13 & 8) == 0) {
            this.f12934nufgyqmvbu = Math.min(0.0f, this.f12934nufgyqmvbu);
        }
        if ((i13 & 1) == 0) {
            this.f12922dxjokdxxww = Math.max(0.0f, this.f12922dxjokdxxww);
        }
        if ((i13 & 2) == 0) {
            this.f12922dxjokdxxww = Math.min(0.0f, this.f12922dxjokdxxww);
        }
    }

    void yggfygwlhe() {
        VelocityTracker velocityTracker = this.f12944zdlpuopuiu;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f12944zdlpuopuiu = VelocityTracker.obtain();
    }

    void zdlpuopuiu(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        if (!this.f12936oxmwwwfdhm.isLayoutRequested() && this.f12917agtfadlqog == 2) {
            float fBtonecajqb = this.f12941wflxmlrfwp.btonecajqb(iozdgvuglvVar);
            int i13 = (int) (this.f12918btonecajqb + this.f12934nufgyqmvbu);
            int i14 = (int) (this.f12925gtknphoqwx + this.f12922dxjokdxxww);
            if (Math.abs(i14 - iozdgvuglvVar.itemView.getTop()) >= iozdgvuglvVar.itemView.getHeight() * fBtonecajqb || Math.abs(i13 - iozdgvuglvVar.itemView.getLeft()) >= iozdgvuglvVar.itemView.getWidth() * fBtonecajqb) {
                List listOjitshcjhn = ojitshcjhn(iozdgvuglvVar);
                if (listOjitshcjhn.size() == 0) {
                    return;
                }
                RecyclerView.iozdgvuglv iozdgvuglvVarZoijcleaow = this.f12941wflxmlrfwp.zoijcleaow(iozdgvuglvVar, listOjitshcjhn, i13, i14);
                if (iozdgvuglvVarZoijcleaow == null) {
                    this.f12943yggfygwlhe.clear();
                    this.f12930jyumaefscl.clear();
                    return;
                }
                int absoluteAdapterPosition = iozdgvuglvVarZoijcleaow.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = iozdgvuglvVar.getAbsoluteAdapterPosition();
                if (this.f12941wflxmlrfwp.esjtqupxsv(this.f12936oxmwwwfdhm, iozdgvuglvVar, iozdgvuglvVarZoijcleaow)) {
                    this.f12941wflxmlrfwp.lereixgezr(this.f12936oxmwwwfdhm, iozdgvuglvVar, absoluteAdapterPosition2, iozdgvuglvVarZoijcleaow, absoluteAdapterPosition, i13, i14);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.oxmwwwfdhm
    public void zoijcleaow(View view) {
        cqumvgiudr(view);
        RecyclerView.iozdgvuglv iozdgvuglvVarSflfametgt = this.f12936oxmwwwfdhm.sflfametgt(view);
        if (iozdgvuglvVarSflfametgt == null) {
            return;
        }
        RecyclerView.iozdgvuglv iozdgvuglvVar = this.f12938ppxfxbqfkf;
        if (iozdgvuglvVar != null && iozdgvuglvVarSflfametgt == iozdgvuglvVar) {
            lereixgezr(null, 0);
            return;
        }
        draadjrbmk(iozdgvuglvVarSflfametgt, false);
        if (this.f12927iobyxmoadg.remove(iozdgvuglvVarSflfametgt.itemView)) {
            this.f12941wflxmlrfwp.ppxfxbqfkf(this.f12936oxmwwwfdhm, iozdgvuglvVarSflfametgt);
        }
    }
}
