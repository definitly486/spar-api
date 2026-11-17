package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private nufgyqmvbu f2801btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f2802draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2803dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f2804eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2805gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private View f2806gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f2807iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f2808lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f2809nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f2810ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f2811wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f2812zoijcleaow;

    class iobyxmoadg implements PopupWindow.OnDismissListener {
        iobyxmoadg() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            dxjokdxxww.this.eablkybsjg();
        }
    }

    public dxjokdxxww(Context context, eablkybsjg eablkybsjgVar, View view, boolean z13, int i13) {
        this(context, eablkybsjgVar, view, z13, i13, 0);
    }

    private void draadjrbmk(int i13, int i14, boolean z13, boolean z14) {
        nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = ppxfxbqfkf();
        nufgyqmvbuVarPpxfxbqfkf.jyumaefscl(z14);
        if (z13) {
            if ((zdlpuopuiu.zoijcleaow(this.f2808lqeggnwhkg, this.f2806gxszxtbevo.getLayoutDirection()) & 7) == 5) {
                i13 -= this.f2806gxszxtbevo.getWidth();
            }
            nufgyqmvbuVarPpxfxbqfkf.zdlpuopuiu(i13);
            nufgyqmvbuVarPpxfxbqfkf.iwizpuwonk(i14);
            int i15 = (int) ((this.f2807iobyxmoadg.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            nufgyqmvbuVarPpxfxbqfkf.vdvldrhtss(new Rect(i13 - i15, i14 - i15, i13 + i15, i14 + i15));
        }
        nufgyqmvbuVarPpxfxbqfkf.iobyxmoadg();
    }

    private nufgyqmvbu iobyxmoadg() {
        Display defaultDisplay = ((WindowManager) this.f2807iobyxmoadg.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        nufgyqmvbu zoijcleaowVar = Math.min(point.x, point.y) >= this.f2807iobyxmoadg.getResources().getDimensionPixelSize(lqeggnwhkg.wkgbmnqykc.abc_cascading_menus_min_smallest_width) ? new zoijcleaow(this.f2807iobyxmoadg, this.f2806gxszxtbevo, this.f2811wkgbmnqykc, this.f2804eablkybsjg, this.f2810ppxfxbqfkf) : new draadjrbmk(this.f2807iobyxmoadg, this.f2812zoijcleaow, this.f2806gxszxtbevo, this.f2811wkgbmnqykc, this.f2804eablkybsjg, this.f2810ppxfxbqfkf);
        zoijcleaowVar.gtknphoqwx(this.f2812zoijcleaow);
        zoijcleaowVar.yggfygwlhe(this.f2802draadjrbmk);
        zoijcleaowVar.ojitshcjhn(this.f2806gxszxtbevo);
        zoijcleaowVar.eablkybsjg(this.f2803dxjokdxxww);
        zoijcleaowVar.oxmwwwfdhm(this.f2809nufgyqmvbu);
        zoijcleaowVar.kcexrzcfyt(this.f2808lqeggnwhkg);
        return zoijcleaowVar;
    }

    public boolean agtfadlqog(int i13, int i14) {
        if (wkgbmnqykc()) {
            return true;
        }
        if (this.f2806gxszxtbevo == null) {
            return false;
        }
        draadjrbmk(i13, i14, true, true);
        return true;
    }

    public void btonecajqb(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        this.f2803dxjokdxxww = iobyxmoadgVar;
        nufgyqmvbu nufgyqmvbuVar = this.f2801btonecajqb;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.eablkybsjg(iobyxmoadgVar);
        }
    }

    public void dxjokdxxww(PopupWindow.OnDismissListener onDismissListener) {
        this.f2805gtknphoqwx = onDismissListener;
    }

    protected void eablkybsjg() {
        this.f2801btonecajqb = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2805gtknphoqwx;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void gtknphoqwx() {
        if (!wflxmlrfwp()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void gxszxtbevo(View view) {
        this.f2806gxszxtbevo = view;
    }

    public void lqeggnwhkg(boolean z13) {
        this.f2809nufgyqmvbu = z13;
        nufgyqmvbu nufgyqmvbuVar = this.f2801btonecajqb;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.oxmwwwfdhm(z13);
        }
    }

    public void nufgyqmvbu(int i13) {
        this.f2808lqeggnwhkg = i13;
    }

    public nufgyqmvbu ppxfxbqfkf() {
        if (this.f2801btonecajqb == null) {
            this.f2801btonecajqb = iobyxmoadg();
        }
        return this.f2801btonecajqb;
    }

    public boolean wflxmlrfwp() {
        if (wkgbmnqykc()) {
            return true;
        }
        if (this.f2806gxszxtbevo == null) {
            return false;
        }
        draadjrbmk(0, 0, false, false);
        return true;
    }

    public boolean wkgbmnqykc() {
        nufgyqmvbu nufgyqmvbuVar = this.f2801btonecajqb;
        return nufgyqmvbuVar != null && nufgyqmvbuVar.zoijcleaow();
    }

    public void zoijcleaow() {
        if (wkgbmnqykc()) {
            this.f2801btonecajqb.dismiss();
        }
    }

    public dxjokdxxww(Context context, eablkybsjg eablkybsjgVar, View view, boolean z13, int i13, int i14) {
        this.f2808lqeggnwhkg = 8388611;
        this.f2802draadjrbmk = new iobyxmoadg();
        this.f2807iobyxmoadg = context;
        this.f2812zoijcleaow = eablkybsjgVar;
        this.f2806gxszxtbevo = view;
        this.f2810ppxfxbqfkf = z13;
        this.f2811wkgbmnqykc = i13;
        this.f2804eablkybsjg = i14;
    }
}
