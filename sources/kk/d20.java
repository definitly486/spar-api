package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class d20 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f56216cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f56217iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f56218jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f56219yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56220zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(npi.spay.x1 x1Var, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.x1 x1Var2) {
        super(2, gxszxtbevoVar);
        this.f56219yggfygwlhe = x1Var;
        this.f56218jyumaefscl = zoijcleaowVar;
        this.f56217iwizpuwonk = lqeggnwhkgVar;
        this.f56216cqumvgiudr = x1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new d20(this.f56219yggfygwlhe, this.f56218jyumaefscl, this.f56217iwizpuwonk, gxszxtbevoVar, this.f56216cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((d20) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56220zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.x1 x1Var = this.f56219yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f56218jyumaefscl;
            y00 y00Var = new y00(this.f56217iwizpuwonk, null, this.f56216cqumvgiudr);
            this.f56220zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(x1Var, zoijcleaowVar, y00Var, this) == objGxszxtbevo) {
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
