package d9;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.gtknphoqwx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc implements dxjokdxxww {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final int f27215esjtqupxsv = gtknphoqwx.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f27216cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f27217iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private View.OnAttachStateChangeListener f27218jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final View f27219yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iobyxmoadg f27220zdlpuopuiu;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static Integer f27221eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f27222iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f27223ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0507iobyxmoadg f27224wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f27225zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: d9.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0507iobyxmoadg implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final WeakReference f27226zdlpuopuiu;

            ViewTreeObserverOnPreDrawListenerC0507iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f27226zdlpuopuiu = new WeakReference(iobyxmoadgVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f27226zdlpuopuiu.get();
                if (iobyxmoadgVar == null) {
                    return true;
                }
                iobyxmoadgVar.iobyxmoadg();
                return true;
            }
        }

        iobyxmoadg(View view) {
            this.f27222iobyxmoadg = view;
        }

        private void btonecajqb(int i13, int i14) {
            Iterator it = new ArrayList(this.f27225zoijcleaow).iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).gxszxtbevo(i13, i14);
            }
        }

        private boolean dxjokdxxww(int i13, int i14) {
            return nufgyqmvbu(i13) && nufgyqmvbu(i14);
        }

        private int eablkybsjg(int i13, int i14, int i15) {
            int i16 = i14 - i15;
            if (i16 > 0) {
                return i16;
            }
            if (this.f27223ppxfxbqfkf && this.f27222iobyxmoadg.isLayoutRequested()) {
                return 0;
            }
            int i17 = i13 - i15;
            if (i17 > 0) {
                return i17;
            }
            if (this.f27222iobyxmoadg.isLayoutRequested() || i14 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return ppxfxbqfkf(this.f27222iobyxmoadg.getContext());
        }

        private int gxszxtbevo() {
            int paddingTop = this.f27222iobyxmoadg.getPaddingTop() + this.f27222iobyxmoadg.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f27222iobyxmoadg.getLayoutParams();
            return eablkybsjg(this.f27222iobyxmoadg.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int lqeggnwhkg() {
            int paddingLeft = this.f27222iobyxmoadg.getPaddingLeft() + this.f27222iobyxmoadg.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f27222iobyxmoadg.getLayoutParams();
            return eablkybsjg(this.f27222iobyxmoadg.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean nufgyqmvbu(int i13) {
            return i13 > 0 || i13 == Integer.MIN_VALUE;
        }

        private static int ppxfxbqfkf(Context context) {
            if (f27221eablkybsjg == null) {
                Display defaultDisplay = ((WindowManager) g9.gtknphoqwx.eablkybsjg((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f27221eablkybsjg = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f27221eablkybsjg.intValue();
        }

        void gtknphoqwx(nufgyqmvbu nufgyqmvbuVar) {
            this.f27225zoijcleaow.remove(nufgyqmvbuVar);
        }

        void iobyxmoadg() {
            if (this.f27225zoijcleaow.isEmpty()) {
                return;
            }
            int iLqeggnwhkg = lqeggnwhkg();
            int iGxszxtbevo = gxszxtbevo();
            if (dxjokdxxww(iLqeggnwhkg, iGxszxtbevo)) {
                btonecajqb(iLqeggnwhkg, iGxszxtbevo);
                zoijcleaow();
            }
        }

        void wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar) {
            int iLqeggnwhkg = lqeggnwhkg();
            int iGxszxtbevo = gxszxtbevo();
            if (dxjokdxxww(iLqeggnwhkg, iGxszxtbevo)) {
                nufgyqmvbuVar.gxszxtbevo(iLqeggnwhkg, iGxszxtbevo);
                return;
            }
            if (!this.f27225zoijcleaow.contains(nufgyqmvbuVar)) {
                this.f27225zoijcleaow.add(nufgyqmvbuVar);
            }
            if (this.f27224wkgbmnqykc == null) {
                ViewTreeObserver viewTreeObserver = this.f27222iobyxmoadg.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0507iobyxmoadg viewTreeObserverOnPreDrawListenerC0507iobyxmoadg = new ViewTreeObserverOnPreDrawListenerC0507iobyxmoadg(this);
                this.f27224wkgbmnqykc = viewTreeObserverOnPreDrawListenerC0507iobyxmoadg;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0507iobyxmoadg);
            }
        }

        void zoijcleaow() {
            ViewTreeObserver viewTreeObserver = this.f27222iobyxmoadg.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f27224wkgbmnqykc);
            }
            this.f27224wkgbmnqykc = null;
            this.f27225zoijcleaow.clear();
        }
    }

    public wkgbmnqykc(View view) {
        this.f27219yggfygwlhe = (View) g9.gtknphoqwx.eablkybsjg(view);
        this.f27220zdlpuopuiu = new iobyxmoadg(view);
    }

    private void agtfadlqog(Object obj) {
        this.f27219yggfygwlhe.setTag(f27215esjtqupxsv, obj);
    }

    private void eablkybsjg() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f27218jyumaefscl;
        if (onAttachStateChangeListener == null || this.f27216cqumvgiudr) {
            return;
        }
        this.f27219yggfygwlhe.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f27216cqumvgiudr = true;
    }

    private void gtknphoqwx() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f27218jyumaefscl;
        if (onAttachStateChangeListener == null || !this.f27216cqumvgiudr) {
            return;
        }
        this.f27219yggfygwlhe.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f27216cqumvgiudr = false;
    }

    private Object wkgbmnqykc() {
        return this.f27219yggfygwlhe.getTag(f27215esjtqupxsv);
    }

    @Override // d9.dxjokdxxww
    public final void btonecajqb(nufgyqmvbu nufgyqmvbuVar) {
        this.f27220zdlpuopuiu.wkgbmnqykc(nufgyqmvbuVar);
    }

    protected abstract void draadjrbmk(Drawable drawable);

    @Override // d9.dxjokdxxww
    public final void gxszxtbevo(Drawable drawable) {
        eablkybsjg();
        wflxmlrfwp(drawable);
    }

    @Override // d9.dxjokdxxww
    public final c9.ppxfxbqfkf iobyxmoadg() {
        Object objWkgbmnqykc = wkgbmnqykc();
        if (objWkgbmnqykc == null) {
            return null;
        }
        if (objWkgbmnqykc instanceof c9.ppxfxbqfkf) {
            return (c9.ppxfxbqfkf) objWkgbmnqykc;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // d9.dxjokdxxww
    public final void lqeggnwhkg(Drawable drawable) {
        this.f27220zdlpuopuiu.zoijcleaow();
        draadjrbmk(drawable);
        if (this.f27217iwizpuwonk) {
            return;
        }
        gtknphoqwx();
    }

    @Override // z8.draadjrbmk
    public void onDestroy() {
    }

    @Override // z8.draadjrbmk
    public void onStart() {
    }

    @Override // z8.draadjrbmk
    public void onStop() {
    }

    @Override // d9.dxjokdxxww
    public final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
        this.f27220zdlpuopuiu.gtknphoqwx(nufgyqmvbuVar);
    }

    public String toString() {
        return "Target for: " + this.f27219yggfygwlhe;
    }

    protected void wflxmlrfwp(Drawable drawable) {
    }

    @Override // d9.dxjokdxxww
    public final void zoijcleaow(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        agtfadlqog(ppxfxbqfkfVar);
    }
}
