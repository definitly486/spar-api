package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f59042iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ j40 f59043jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f59044yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59045zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, j40 j40Var, npi.spay.i2 i2Var) {
        super(2, gxszxtbevoVar);
        this.f59044yggfygwlhe = lqeggnwhkgVar;
        this.f59043jyumaefscl = j40Var;
        this.f59042iwizpuwonk = i2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new vm(this.f59044yggfygwlhe, gxszxtbevoVar, this.f59043jyumaefscl, this.f59042iwizpuwonk);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((vm) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59045zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.lqeggnwhkg lqeggnwhkgVar = this.f59044yggfygwlhe;
            tl tlVar = new tl(this.f59043jyumaefscl, this.f59042iwizpuwonk);
            this.f59045zdlpuopuiu = 1;
            if (lqeggnwhkgVar.collect(tlVar, this) == objGxszxtbevo) {
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
