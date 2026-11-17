package kk;

import android.webkit.WebView;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class to extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f58711zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(RedirectActivity redirectActivity) {
        super(1);
        this.f58711zdlpuopuiu = redirectActivity;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        nr nrVar = (nr) obj;
        if (nrVar instanceof rk) {
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(this.f58711zdlpuopuiu), null, null, new kt(this.f58711zdlpuopuiu, null), 3, null);
        } else if (nrVar instanceof q0) {
            WebView webView = this.f58711zdlpuopuiu.f107828f;
            if (webView != null) {
                webView.setWebViewClient(new ww(this.f58711zdlpuopuiu, nrVar));
            }
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(new ey(this.f58711zdlpuopuiu, nrVar), "block");
            hz block = new hz(this.f58711zdlpuopuiu, nrVar);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
            block.invoke();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
