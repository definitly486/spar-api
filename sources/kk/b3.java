package kk;

import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ u1.iobyxmoadg f55894yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f55895zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(RedirectActivity redirectActivity, u1.iobyxmoadg iobyxmoadgVar) {
        super(1);
        this.f55895zdlpuopuiu = redirectActivity;
        this.f55894yggfygwlhe = iobyxmoadgVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        this.f55895zdlpuopuiu.removeOnNewIntentListener(this.f55894yggfygwlhe);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
