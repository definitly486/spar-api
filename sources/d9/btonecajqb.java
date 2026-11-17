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
public abstract class btonecajqb extends d9.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static boolean f27198esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static int f27199lereixgezr = gtknphoqwx.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f27200cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f27201iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private View.OnAttachStateChangeListener f27202jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iobyxmoadg f27203yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final View f27204zdlpuopuiu;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static Integer f27205eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f27206iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f27207ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0506iobyxmoadg f27208wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f27209zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: d9.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0506iobyxmoadg implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final WeakReference f27210zdlpuopuiu;

            ViewTreeObserverOnPreDrawListenerC0506iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f27210zdlpuopuiu = new WeakReference(iobyxmoadgVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f27210zdlpuopuiu.get();
                if (iobyxmoadgVar == null) {
                    return true;
                }
                iobyxmoadgVar.iobyxmoadg();
                return true;
            }
        }

        iobyxmoadg(View view) {
            this.f27206iobyxmoadg = view;
        }

        private void btonecajqb(int i13, int i14) {
            Iterator it = new ArrayList(this.f27209zoijcleaow).iterator();
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
            if (this.f27207ppxfxbqfkf && this.f27206iobyxmoadg.isLayoutRequested()) {
                return 0;
            }
            int i17 = i13 - i15;
            if (i17 > 0) {
                return i17;
            }
            if (this.f27206iobyxmoadg.isLayoutRequested() || i14 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return ppxfxbqfkf(this.f27206iobyxmoadg.getContext());
        }

        private int gxszxtbevo() {
            int paddingTop = this.f27206iobyxmoadg.getPaddingTop() + this.f27206iobyxmoadg.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f27206iobyxmoadg.getLayoutParams();
            return eablkybsjg(this.f27206iobyxmoadg.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int lqeggnwhkg() {
            int paddingLeft = this.f27206iobyxmoadg.getPaddingLeft() + this.f27206iobyxmoadg.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f27206iobyxmoadg.getLayoutParams();
            return eablkybsjg(this.f27206iobyxmoadg.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean nufgyqmvbu(int i13) {
            return i13 > 0 || i13 == Integer.MIN_VALUE;
        }

        private static int ppxfxbqfkf(Context context) {
            if (f27205eablkybsjg == null) {
                Display defaultDisplay = ((WindowManager) g9.gtknphoqwx.eablkybsjg((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f27205eablkybsjg = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f27205eablkybsjg.intValue();
        }

        void gtknphoqwx(nufgyqmvbu nufgyqmvbuVar) {
            this.f27209zoijcleaow.remove(nufgyqmvbuVar);
        }

        void iobyxmoadg() {
            if (this.f27209zoijcleaow.isEmpty()) {
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
            if (!this.f27209zoijcleaow.contains(nufgyqmvbuVar)) {
                this.f27209zoijcleaow.add(nufgyqmvbuVar);
            }
            if (this.f27208wkgbmnqykc == null) {
                ViewTreeObserver viewTreeObserver = this.f27206iobyxmoadg.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0506iobyxmoadg viewTreeObserverOnPreDrawListenerC0506iobyxmoadg = new ViewTreeObserverOnPreDrawListenerC0506iobyxmoadg(this);
                this.f27208wkgbmnqykc = viewTreeObserverOnPreDrawListenerC0506iobyxmoadg;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0506iobyxmoadg);
            }
        }

        void zoijcleaow() {
            ViewTreeObserver viewTreeObserver = this.f27206iobyxmoadg.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f27208wkgbmnqykc);
            }
            this.f27208wkgbmnqykc = null;
            this.f27209zoijcleaow.clear();
        }
    }

    public btonecajqb(View view) {
        this.f27204zdlpuopuiu = (View) g9.gtknphoqwx.eablkybsjg(view);
        this.f27203yggfygwlhe = new iobyxmoadg(view);
    }

    private void agtfadlqog(Object obj) {
        f27198esjtqupxsv = true;
        this.f27204zdlpuopuiu.setTag(f27199lereixgezr, obj);
    }

    private void draadjrbmk() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f27202jyumaefscl;
        if (onAttachStateChangeListener == null || this.f27200cqumvgiudr) {
            return;
        }
        this.f27204zdlpuopuiu.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f27200cqumvgiudr = true;
    }

    private Object gtknphoqwx() {
        return this.f27204zdlpuopuiu.getTag(f27199lereixgezr);
    }

    private void wflxmlrfwp() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f27202jyumaefscl;
        if (onAttachStateChangeListener == null || !this.f27200cqumvgiudr) {
            return;
        }
        this.f27204zdlpuopuiu.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f27200cqumvgiudr = false;
    }

    @Override // d9.dxjokdxxww
    public void btonecajqb(nufgyqmvbu nufgyqmvbuVar) {
        this.f27203yggfygwlhe.wkgbmnqykc(nufgyqmvbuVar);
    }

    @Override // d9.iobyxmoadg, d9.dxjokdxxww
    public void gxszxtbevo(Drawable drawable) {
        super.gxszxtbevo(drawable);
        draadjrbmk();
    }

    @Override // d9.dxjokdxxww
    public c9.ppxfxbqfkf iobyxmoadg() {
        Object objGtknphoqwx = gtknphoqwx();
        if (objGtknphoqwx == null) {
            return null;
        }
        if (objGtknphoqwx instanceof c9.ppxfxbqfkf) {
            return (c9.ppxfxbqfkf) objGtknphoqwx;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // d9.iobyxmoadg, d9.dxjokdxxww
    public void lqeggnwhkg(Drawable drawable) {
        super.lqeggnwhkg(drawable);
        this.f27203yggfygwlhe.zoijcleaow();
        if (this.f27201iwizpuwonk) {
            return;
        }
        wflxmlrfwp();
    }

    @Override // d9.dxjokdxxww
    public void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
        this.f27203yggfygwlhe.gtknphoqwx(nufgyqmvbuVar);
    }

    public String toString() {
        return "Target for: " + this.f27204zdlpuopuiu;
    }

    @Override // d9.dxjokdxxww
    public void zoijcleaow(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        agtfadlqog(ppxfxbqfkfVar);
    }
}
