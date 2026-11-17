package kk;

import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class nv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ Nf f57853iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ u00 f57854jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f57855yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57856zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, u00 u00Var, Nf nf2) {
        super(2, gxszxtbevoVar);
        this.f57855yggfygwlhe = wypolnanluVar;
        this.f57854jyumaefscl = u00Var;
        this.f57853iwizpuwonk = nf2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new nv(this.f57855yggfygwlhe, gxszxtbevoVar, this.f57854jyumaefscl, this.f57853iwizpuwonk);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((nv) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57856zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f57855yggfygwlhe;
            ju juVar = new ju(this.f57853iwizpuwonk, this.f57854jyumaefscl);
            this.f57856zdlpuopuiu = 1;
            if (wypolnanluVar.collect(juVar, this) == objGxszxtbevo) {
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
