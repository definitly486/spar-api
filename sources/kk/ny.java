package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ny extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f57857cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f57858iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f57859jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f57860yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57861zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(npi.spay.x1 x1Var, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.x1 x1Var2) {
        super(2, gxszxtbevoVar);
        this.f57860yggfygwlhe = x1Var;
        this.f57859jyumaefscl = zoijcleaowVar;
        this.f57858iwizpuwonk = lqeggnwhkgVar;
        this.f57857cqumvgiudr = x1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new ny(this.f57860yggfygwlhe, this.f57859jyumaefscl, this.f57858iwizpuwonk, gxszxtbevoVar, this.f57857cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((ny) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57861zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.x1 x1Var = this.f57860yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f57859jyumaefscl;
            gx gxVar = new gx(this.f57858iwizpuwonk, null, this.f57857cqumvgiudr);
            this.f57861zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(x1Var, zoijcleaowVar, gxVar, this) == objGxszxtbevo) {
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
