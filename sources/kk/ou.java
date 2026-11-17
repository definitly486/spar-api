package kk;

import android.net.Uri;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ou extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ nr f57993jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Uri f57994yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f57995zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(Uri uri, nr nrVar, RedirectActivity redirectActivity) {
        super(0);
        this.f57995zdlpuopuiu = redirectActivity;
        this.f57994yggfygwlhe = uri;
        this.f57993jyumaefscl = nrVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        String string = this.f57994yggfygwlhe.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "url.toString()");
        ((q0) this.f57993jyumaefscl).getClass();
        if (mj.kcexrzcfyt.ntlheqmsrt(string, "spaysdk://payment", true)) {
            b9 b9Var = this.f57995zdlpuopuiu.f107824b;
            if (b9Var == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var = null;
            }
            b9Var.oxmwwwfdhm(this.f57994yggfygwlhe);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
