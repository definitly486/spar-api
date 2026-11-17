package kk;

import android.net.Uri;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class sv extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f58584jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ nr f58585yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Uri f58586zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(Uri uri, nr nrVar, RedirectActivity redirectActivity) {
        super(0);
        this.f58586zdlpuopuiu = uri;
        this.f58585yggfygwlhe = nrVar;
        this.f58584jyumaefscl = redirectActivity;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        String string = this.f58586zdlpuopuiu.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "url.toString()");
        ((q0) this.f58585yggfygwlhe).getClass();
        if (mj.kcexrzcfyt.ntlheqmsrt(string, "spaysdk://payment", true)) {
            b9 b9Var = this.f58584jyumaefscl.f107824b;
            if (b9Var == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var = null;
            }
            b9Var.oxmwwwfdhm(this.f58586zdlpuopuiu);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
