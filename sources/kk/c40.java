package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class c40 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f56089cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.zynmafqrjb f56090iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f56091jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f56092yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56093zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(npi.spay.rj rjVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.zynmafqrjb zynmafqrjbVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.rj rjVar2) {
        super(2, gxszxtbevoVar);
        this.f56092yggfygwlhe = rjVar;
        this.f56091jyumaefscl = zoijcleaowVar;
        this.f56090iwizpuwonk = zynmafqrjbVar;
        this.f56089cqumvgiudr = rjVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new c40(this.f56092yggfygwlhe, this.f56091jyumaefscl, this.f56090iwizpuwonk, gxszxtbevoVar, this.f56089cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((c40) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56093zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.rj rjVar = this.f56092yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f56091jyumaefscl;
            y20 y20Var = new y20(this.f56090iwizpuwonk, null, this.f56089cqumvgiudr);
            this.f56093zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(rjVar, zoijcleaowVar, y20Var, this) == objGxszxtbevo) {
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
