package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final wkgbmnqykc eablkybsjg(KeyEvent keyEvent) {
        long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
        r.iobyxmoadg.C1811iobyxmoadg c1811iobyxmoadg = r.iobyxmoadg.f81183iobyxmoadg;
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.btonecajqb())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.gxszxtbevo());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.dxjokdxxww())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.eablkybsjg());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.ojitshcjhn())) {
            return wkgbmnqykc.dxjokdxxww(r.wkgbmnqykc.gxszxtbevo(keyEvent) ? wkgbmnqykc.f6266zoijcleaow.gxszxtbevo() : wkgbmnqykc.f6266zoijcleaow.eablkybsjg());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.eablkybsjg())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.lqeggnwhkg());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.wkgbmnqykc())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.wkgbmnqykc());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.gxszxtbevo()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.wflxmlrfwp())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.nufgyqmvbu());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.ppxfxbqfkf()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.draadjrbmk())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.iobyxmoadg());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.zoijcleaow()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.lqeggnwhkg()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.gtknphoqwx())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.zoijcleaow());
        }
        if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.iobyxmoadg()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.nufgyqmvbu())) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.ppxfxbqfkf());
        }
        return null;
    }

    public static final w0.zdlpuopuiu gxszxtbevo(int i13) {
        if (i13 == 0) {
            return w0.zdlpuopuiu.Ltr;
        }
        if (i13 != 1) {
            return null;
        }
        return w0.zdlpuopuiu.Rtl;
    }

    public static final g.lqeggnwhkg iobyxmoadg(View view, View view2) {
        eablkybsjg.iobyxmoadg iobyxmoadgVar = eablkybsjg.f6236iobyxmoadg;
        view.getLocationInWindow(iobyxmoadgVar.iobyxmoadg());
        int i13 = iobyxmoadgVar.iobyxmoadg()[0];
        int i14 = iobyxmoadgVar.iobyxmoadg()[1];
        view2.getLocationInWindow(iobyxmoadgVar.iobyxmoadg());
        float f13 = i13 - iobyxmoadgVar.iobyxmoadg()[0];
        float f14 = i14 - iobyxmoadgVar.iobyxmoadg()[1];
        return new g.lqeggnwhkg(f13, f14, view.getWidth() + f13, view.getHeight() + f14);
    }

    public static final Integer ppxfxbqfkf(int i13) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            return 33;
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
            return 130;
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            return 17;
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            return 66;
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg())) {
            return 2;
        }
        return wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo()) ? 1 : null;
    }

    public static final wkgbmnqykc wkgbmnqykc(int i13) {
        if (i13 == 1) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.gxszxtbevo());
        }
        if (i13 == 2) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.eablkybsjg());
        }
        if (i13 == 17) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.wkgbmnqykc());
        }
        if (i13 == 33) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.nufgyqmvbu());
        }
        if (i13 == 66) {
            return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.lqeggnwhkg());
        }
        if (i13 != 130) {
            return null;
        }
        return wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.iobyxmoadg());
    }

    public static final boolean zoijcleaow(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
