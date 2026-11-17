package kk;

import npi.spay.Cj;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ Cj f59449jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.zynmafqrjb f59450yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59451zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(sj.zynmafqrjb zynmafqrjbVar, lg.gxszxtbevo gxszxtbevoVar, Cj cj2) {
        super(2, gxszxtbevoVar);
        this.f59450yggfygwlhe = zynmafqrjbVar;
        this.f59449jyumaefscl = cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new yggfygwlhe(this.f59450yggfygwlhe, gxszxtbevoVar, this.f59449jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new yggfygwlhe(this.f59450yggfygwlhe, (lg.gxszxtbevo) obj2, this.f59449jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59451zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.zynmafqrjb zynmafqrjbVar = this.f59450yggfygwlhe;
            ci0 ci0Var = new ci0(this.f59449jyumaefscl);
            this.f59451zdlpuopuiu = 1;
            if (zynmafqrjbVar.collect(ci0Var, this) == objGxszxtbevo) {
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
