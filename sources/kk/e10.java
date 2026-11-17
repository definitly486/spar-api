package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class e10 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.m7 f56369cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f56370iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f56371jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.m7 f56372yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56373zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(npi.spay.m7 m7Var, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.m7 m7Var2) {
        super(2, gxszxtbevoVar);
        this.f56372yggfygwlhe = m7Var;
        this.f56371jyumaefscl = zoijcleaowVar;
        this.f56370iwizpuwonk = lqeggnwhkgVar;
        this.f56369cqumvgiudr = m7Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new e10(this.f56372yggfygwlhe, this.f56371jyumaefscl, this.f56370iwizpuwonk, gxszxtbevoVar, this.f56369cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((e10) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56373zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.m7 m7Var = this.f56372yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f56371jyumaefscl;
            yz yzVar = new yz(this.f56370iwizpuwonk, null, this.f56369cqumvgiudr);
            this.f56373zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(m7Var, zoijcleaowVar, yzVar, this) == objGxszxtbevo) {
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
