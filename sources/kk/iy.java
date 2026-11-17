package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class iy extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f57110jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f57111yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57112zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.uo uoVar) {
        super(2, gxszxtbevoVar);
        this.f57111yggfygwlhe = lqeggnwhkgVar;
        this.f57110jyumaefscl = uoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new iy(this.f57111yggfygwlhe, gxszxtbevoVar, this.f57110jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new iy(this.f57111yggfygwlhe, (lg.gxszxtbevo) obj2, this.f57110jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57112zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.lqeggnwhkg lqeggnwhkgVar = this.f57111yggfygwlhe;
            ax axVar = new ax(this.f57110jyumaefscl);
            this.f57112zdlpuopuiu = 1;
            if (lqeggnwhkgVar.collect(axVar, this) == objGxszxtbevo) {
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
