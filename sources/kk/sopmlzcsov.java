package kk;

import npi.spay.Cj;

/* JADX INFO: loaded from: classes3.dex */
public final class sopmlzcsov extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ Cj f58566cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.zynmafqrjb f58567iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f58568jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Cj f58569yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58570zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sopmlzcsov(Cj cj2, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.zynmafqrjb zynmafqrjbVar, lg.gxszxtbevo gxszxtbevoVar, Cj cj3) {
        super(2, gxszxtbevoVar);
        this.f58569yggfygwlhe = cj2;
        this.f58568jyumaefscl = zoijcleaowVar;
        this.f58567iwizpuwonk = zynmafqrjbVar;
        this.f58566cqumvgiudr = cj3;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new sopmlzcsov(this.f58569yggfygwlhe, this.f58568jyumaefscl, this.f58567iwizpuwonk, gxszxtbevoVar, this.f58566cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((sopmlzcsov) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58570zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Cj cj2 = this.f58569yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f58568jyumaefscl;
            yggfygwlhe yggfygwlheVar = new yggfygwlhe(this.f58567iwizpuwonk, null, this.f58566cqumvgiudr);
            this.f58570zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(cj2, zoijcleaowVar, yggfygwlheVar, this) == objGxszxtbevo) {
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
