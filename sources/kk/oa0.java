package kk;

import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class oa0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ Nb f57917cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f57918iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f57919jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Nb f57920yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57921zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(Nb nb3, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, Nb nb4) {
        super(2, gxszxtbevoVar);
        this.f57920yggfygwlhe = nb3;
        this.f57919jyumaefscl = zoijcleaowVar;
        this.f57918iwizpuwonk = lqeggnwhkgVar;
        this.f57917cqumvgiudr = nb4;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new oa0(this.f57920yggfygwlhe, this.f57919jyumaefscl, this.f57918iwizpuwonk, gxszxtbevoVar, this.f57917cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((oa0) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57921zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Nb nb3 = this.f57920yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f57919jyumaefscl;
            k90 k90Var = new k90(this.f57918iwizpuwonk, null, this.f57917cqumvgiudr);
            this.f57921zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(nb3, zoijcleaowVar, k90Var, this) == objGxszxtbevo) {
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
