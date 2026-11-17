package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ch0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ntlheqmsrt f56161jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ dvvnrvtcbc f56162yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56163zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(dvvnrvtcbc dvvnrvtcbcVar, ntlheqmsrt ntlheqmsrtVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56162yggfygwlhe = dvvnrvtcbcVar;
        this.f56161jyumaefscl = ntlheqmsrtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new ch0(this.f56162yggfygwlhe, this.f56161jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new ch0(this.f56162yggfygwlhe, this.f56161jyumaefscl, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56163zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            k8 k8Var = this.f56162yggfygwlhe.f56340gtknphoqwx;
            n9 n9Var = this.f56161jyumaefscl.f57844iobyxmoadg;
            this.f56163zdlpuopuiu = 1;
            if (k8Var.iobyxmoadg(n9Var, pj.ikoacuggdj.zoijcleaow(), this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
