package kk;

import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;

/* JADX INFO: loaded from: classes3.dex */
public final class yc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ String f59415jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ SPaySdkInitConfig f59416yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ be f59417zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(be beVar, SPaySdkInitConfig sPaySdkInitConfig, String str) {
        super(0);
        this.f59417zdlpuopuiu = beVar;
        this.f59416yggfygwlhe = sPaySdkInitConfig;
        this.f59415jyumaefscl = str;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        if (!((ux) this.f59417zdlpuopuiu.f55974iobyxmoadg).f58915iobyxmoadg && this.f59416yggfygwlhe.getEnableLogging() && (this.f59416yggfygwlhe.getStage() == SPayStage.SandboxRealBankApp || this.f59416yggfygwlhe.getStage() == SPayStage.SandBoxWithoutBankApp)) {
            uk.agtfadlqog.gtknphoqwx(uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg(), this.f59415jyumaefscl, 0, null, 6, null);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
