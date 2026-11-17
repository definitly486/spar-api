package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f56787jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f56788yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56789zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.x1 x1Var) {
        super(2, gxszxtbevoVar);
        this.f56788yggfygwlhe = lqeggnwhkgVar;
        this.f56787jyumaefscl = x1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new gx(this.f56788yggfygwlhe, gxszxtbevoVar, this.f56787jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new gx(this.f56788yggfygwlhe, (lg.gxszxtbevo) obj2, this.f56787jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56789zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.lqeggnwhkg lqeggnwhkgVar = this.f56788yggfygwlhe;
            cw cwVar = new cw(this.f56787jyumaefscl);
            this.f56789zdlpuopuiu = 1;
            if (lqeggnwhkgVar.collect(cwVar, this) == objGxszxtbevo) {
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
