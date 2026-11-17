package m22;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow extends PopupWindow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f65005iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f65006zoijcleaow;

    public static final class iobyxmoadg implements androidx.lifecycle.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            zoijcleaow.this.dismiss();
            super.onDestroy(owner);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(Context context, tg.iobyxmoadg iobyxmoadgVar) {
        super(-2, -2);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f65005iobyxmoadg = context;
        this.f65006zoijcleaow = iobyxmoadgVar;
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(false);
    }

    private final void dxjokdxxww(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.getLifecycle().iobyxmoadg(new iobyxmoadg());
    }

    private final int eablkybsjg(int i13) {
        return this.f65005iobyxmoadg.getResources().getDimensionPixelSize(i13);
    }

    public static /* synthetic */ void gtknphoqwx(zoijcleaow zoijcleaowVar, View view, vdvldrhtss vdvldrhtssVar, View view2, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAbove");
        }
        if ((i14 & 4) != 0) {
            view2 = view;
        }
        if ((i14 & 8) != 0) {
            i13 = s40.eablkybsjg.scan_and_go_tutorial_popup_default_bottom_margin;
        }
        zoijcleaowVar.btonecajqb(view, vdvldrhtssVar, view2, i13);
    }

    private final void gxszxtbevo() {
        setBackgroundDrawable(androidx.core.content.iobyxmoadg.getDrawable(this.f65005iobyxmoadg, wkgbmnqykc()));
    }

    private final void lqeggnwhkg(final tg.iobyxmoadg iobyxmoadgVar) {
        setOnDismissListener(iobyxmoadgVar != null ? new PopupWindow.OnDismissListener() { // from class: m22.iobyxmoadg
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                zoijcleaow.nufgyqmvbu(iobyxmoadgVar);
            }
        } : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
    }

    private final int ppxfxbqfkf(View view) {
        return c60.nufgyqmvbu.lqeggnwhkg(view).top + c60.nufgyqmvbu.gxszxtbevo(view)[1] + view.getHeight();
    }

    private final int zoijcleaow(View view) {
        return c60.nufgyqmvbu.lqeggnwhkg(view).bottom - c60.nufgyqmvbu.gxszxtbevo(view)[1];
    }

    public final void btonecajqb(View anchor, vdvldrhtss lifecycleOwner, View windowTokenProvider, int i13) {
        zdlpuopuiu.btonecajqb(anchor, "anchor");
        zdlpuopuiu.btonecajqb(lifecycleOwner, "lifecycleOwner");
        zdlpuopuiu.btonecajqb(windowTokenProvider, "windowTokenProvider");
        gxszxtbevo();
        lqeggnwhkg(this.f65006zoijcleaow);
        dxjokdxxww(lifecycleOwner);
        showAtLocation(windowTokenProvider, 81, 0, zoijcleaow(anchor) + eablkybsjg(i13));
    }

    public final void draadjrbmk(View anchor, vdvldrhtss lifecycleOwner, View windowTokenProvider, int i13) {
        zdlpuopuiu.btonecajqb(anchor, "anchor");
        zdlpuopuiu.btonecajqb(lifecycleOwner, "lifecycleOwner");
        zdlpuopuiu.btonecajqb(windowTokenProvider, "windowTokenProvider");
        gxszxtbevo();
        lqeggnwhkg(this.f65006zoijcleaow);
        dxjokdxxww(lifecycleOwner);
        showAtLocation(windowTokenProvider, 49, 0, ppxfxbqfkf(anchor) + eablkybsjg(i13));
    }

    public abstract int wkgbmnqykc();
}
