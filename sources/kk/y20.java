package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class y20 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f59374jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.zynmafqrjb f59375yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59376zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(sj.zynmafqrjb zynmafqrjbVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.rj rjVar) {
        super(2, gxszxtbevoVar);
        this.f59375yggfygwlhe = zynmafqrjbVar;
        this.f59374jyumaefscl = rjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new y20(this.f59375yggfygwlhe, gxszxtbevoVar, this.f59374jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new y20(this.f59375yggfygwlhe, (lg.gxszxtbevo) obj2, this.f59374jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59376zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.zynmafqrjb zynmafqrjbVar = this.f59375yggfygwlhe;
            r10 r10Var = new r10(this.f59374jyumaefscl);
            this.f59376zdlpuopuiu = 1;
            if (zynmafqrjbVar.collect(r10Var, this) == objGxszxtbevo) {
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
