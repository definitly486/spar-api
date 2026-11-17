package eu;

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
import ru.myspar.core.base.api.fragment.BaseFragment;
import tg.draadjrbmk;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f32049iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f32050ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f32051wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private WebView f32052zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            wkgbmnqykc.this.f32052zoijcleaow = null;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {
        zoijcleaow() {
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            WebView webView = wkgbmnqykc.this.f32052zoijcleaow;
            ViewParent parent = webView != null ? webView.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(wkgbmnqykc.this.f32052zoijcleaow);
            }
        }
    }

    public wkgbmnqykc(ppxfxbqfkf paymentWebViewClientProvider) {
        zdlpuopuiu.btonecajqb(paymentWebViewClientProvider, "paymentWebViewClientProvider");
        this.f32049iobyxmoadg = paymentWebViewClientProvider;
        this.f32050ppxfxbqfkf = new zoijcleaow();
        this.f32051wkgbmnqykc = new iobyxmoadg();
    }

    private final void eablkybsjg(WebView webView) {
        p30.zoijcleaow.iobyxmoadg(webView, this.f32049iobyxmoadg.ppxfxbqfkf());
    }

    private final void gxszxtbevo(gtknphoqwx gtknphoqwxVar, gxszxtbevo gxszxtbevoVar) {
        gtknphoqwxVar.wkgbmnqykc(gxszxtbevoVar);
        gtknphoqwxVar.iobyxmoadg(gxszxtbevoVar);
    }

    public final void lqeggnwhkg() {
        this.f32049iobyxmoadg.dxjokdxxww();
    }

    public final void ppxfxbqfkf(tg.iobyxmoadg onSuccess, draadjrbmk onError, tg.iobyxmoadg onCancel) {
        zdlpuopuiu.btonecajqb(onSuccess, "onSuccess");
        zdlpuopuiu.btonecajqb(onError, "onError");
        zdlpuopuiu.btonecajqb(onCancel, "onCancel");
        this.f32049iobyxmoadg.draadjrbmk(onSuccess);
        this.f32049iobyxmoadg.btonecajqb(onCancel);
        this.f32049iobyxmoadg.gtknphoqwx(onError);
    }

    public final void wkgbmnqykc(BaseFragment fragment, View view) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(view, "view");
        gxszxtbevo(fragment.getViewLifecycleOwner().getLifecycle(), this.f32050ppxfxbqfkf);
        gtknphoqwx lifecycle = fragment.getLifecycle();
        zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
        gxszxtbevo(lifecycle, this.f32051wkgbmnqykc);
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
            WebView webView2 = this.f32052zoijcleaow;
            if (webView2 != null) {
                viewGroup.addView(webView2, iIntValue);
                WebView webView3 = this.f32052zoijcleaow;
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
            this.f32052zoijcleaow = webView;
        }
    }
}
