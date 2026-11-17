package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class at extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ fu f55838jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f55839yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public sj.zynmafqrjb f55840zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(fu fuVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55838jyumaefscl = fuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new at(this.f55838jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new at(this.f55838jyumaefscl, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        sj.zynmafqrjb zynmafqrjbVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f55839yggfygwlhe;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            fu fuVar = this.f55838jyumaefscl;
            sj.zynmafqrjb zynmafqrjbVar2 = fuVar.f56592gxszxtbevo;
            fn fnVar = fuVar.f56591eablkybsjg;
            this.f55840zdlpuopuiu = zynmafqrjbVar2;
            this.f55839yggfygwlhe = 1;
            fnVar.getClass();
            obj = pj.dxjokdxxww.lqeggnwhkg(pj.ikoacuggdj.zoijcleaow(), new dm(fnVar, null), this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zynmafqrjbVar = zynmafqrjbVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zynmafqrjbVar = this.f55840zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        zynmafqrjbVar.setValue(obj);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
