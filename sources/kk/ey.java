package kk;

import android.webkit.WebView;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ey extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ nr f56472yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f56473zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(RedirectActivity redirectActivity, nr nrVar) {
        super(0);
        this.f56473zdlpuopuiu = redirectActivity;
        this.f56472yggfygwlhe = nrVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        WebView webView = this.f56473zdlpuopuiu.f107828f;
        if (webView != null) {
            webView.loadUrl(((q0) this.f56472yggfygwlhe).f58131iobyxmoadg);
        }
        b9 b9Var = this.f56473zdlpuopuiu.f107824b;
        if (b9Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("viewModel");
            b9Var = null;
        }
        b9Var.getClass();
        fyldjkxazc fyldjkxazcVar = new fyldjkxazc(b9Var.f55939lmojexxdyd, b9Var.f55951wwaezpbzkn, b9Var.f55954ylkuphrtab, b9Var.f55944pkzmftpjix);
        b9Var.f55932iozdgvuglv = fyldjkxazcVar;
        fyldjkxazcVar.start();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
