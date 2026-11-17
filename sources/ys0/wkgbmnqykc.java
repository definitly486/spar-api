package ys0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import hg.jyumaefscl;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.api.fragment.BaseFragment;
import tg.draadjrbmk;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f126340iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f126341ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f126342wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private WebView f126343zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            wkgbmnqykc.this.f126343zoijcleaow = null;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {
        zoijcleaow() {
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            WebView webView = wkgbmnqykc.this.f126343zoijcleaow;
            ViewParent parent = webView != null ? webView.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(wkgbmnqykc.this.f126343zoijcleaow);
            }
        }
    }

    public wkgbmnqykc(ppxfxbqfkf paymentWebViewClientProvider) {
        zdlpuopuiu.btonecajqb(paymentWebViewClientProvider, "paymentWebViewClientProvider");
        this.f126340iobyxmoadg = paymentWebViewClientProvider;
        this.f126341ppxfxbqfkf = new zoijcleaow();
        this.f126342wkgbmnqykc = new iobyxmoadg();
    }

    private final void eablkybsjg(WebView webView) {
        v11.zoijcleaow.iobyxmoadg(webView, this.f126340iobyxmoadg.ppxfxbqfkf());
    }

    private final void gxszxtbevo(gtknphoqwx gtknphoqwxVar, gxszxtbevo gxszxtbevoVar) {
        gtknphoqwxVar.wkgbmnqykc(gxszxtbevoVar);
        gtknphoqwxVar.iobyxmoadg(gxszxtbevoVar);
    }

    public final void lqeggnwhkg() {
        this.f126340iobyxmoadg.dxjokdxxww();
    }

    public final void ppxfxbqfkf(tg.iobyxmoadg onSuccess, draadjrbmk onError, tg.iobyxmoadg onCancel) {
        zdlpuopuiu.btonecajqb(onSuccess, "onSuccess");
        zdlpuopuiu.btonecajqb(onError, "onError");
        zdlpuopuiu.btonecajqb(onCancel, "onCancel");
        this.f126340iobyxmoadg.draadjrbmk(onSuccess);
        this.f126340iobyxmoadg.btonecajqb(onCancel);
        this.f126340iobyxmoadg.gtknphoqwx(onError);
    }

    public final void wkgbmnqykc(BaseFragment fragment, View view) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(view, "view");
        gxszxtbevo(fragment.getViewLifecycleOwner().getLifecycle(), this.f126341ppxfxbqfkf);
        gtknphoqwx lifecycle = fragment.getLifecycle();
        zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
        gxszxtbevo(lifecycle, this.f126342wkgbmnqykc);
        ViewGroup viewGroup = (ViewGroup) view;
        Iterator it = metgxyhuhe.iobyxmoadg(viewGroup).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            Object next = it.next();
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            if (((View) next) instanceof WebView) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        WebView webView = null;
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            WebView webView2 = this.f126343zoijcleaow;
            if (webView2 != null) {
                viewGroup.addView(webView2, iIntValue);
                WebView webView3 = this.f126343zoijcleaow;
                if (webView3 != null) {
                    eablkybsjg(webView3);
                    return;
                }
                return;
            }
            View childAt = viewGroup.getChildAt(iIntValue);
            WebView webView4 = childAt instanceof WebView ? (WebView) childAt : null;
            if (webView4 != null) {
                eablkybsjg(webView4);
                webView = webView4;
            }
            this.f126343zoijcleaow = webView;
        }
    }
}
