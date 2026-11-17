package kk;

import android.content.Context;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SdkReadyCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ab0 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ Context f55801jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.c f55802yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ tg.draadjrbmk f55803zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(tg.draadjrbmk draadjrbmkVar, spay.sdk.c cVar, Context context) {
        super(1);
        this.f55803zdlpuopuiu = draadjrbmkVar;
        this.f55802yggfygwlhe = cVar;
        this.f55801jyumaefscl = context;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        InitializationResult initializationResult = (InitializationResult) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializationResult, "initializationResult");
        if (initializationResult instanceof InitializationResult.ConfigError) {
            this.f55803zdlpuopuiu.invoke(new SdkReadyCheckResult.NotReady(((InitializationResult.ConfigError) initializationResult).getMessage()));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(initializationResult, InitializationResult.Success.INSTANCE)) {
            this.f55803zdlpuopuiu.invoke(this.f55802yggfygwlhe.b(this.f55801jyumaefscl));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
