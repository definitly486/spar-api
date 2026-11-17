package kk;

import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class cf0 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ iozdgvuglv f56151yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f56152zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(jlmebxxoox jlmebxxooxVar, iozdgvuglv iozdgvuglvVar) {
        super(0);
        this.f56152zdlpuopuiu = jlmebxxooxVar;
        this.f56151yggfygwlhe = iozdgvuglvVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        return Boolean.valueOf((kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f56152zdlpuopuiu).f55853iozdgvuglv.getValue(), PayStrategy.PayWithBonuses.INSTANCE) && zd0.zoijcleaow(this.f56151yggfygwlhe.f57079gxszxtbevo, vf0.ONE_OF)) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f56152zdlpuopuiu).f55853iozdgvuglv.getValue(), PayStrategy.PayWithPaymentAccount.INSTANCE));
    }
}
