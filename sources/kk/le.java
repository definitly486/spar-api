package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class le extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ Context f57458cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f57459iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ nz f57460jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f57461yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57462zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, nz nzVar, npi.spay.ke keVar, Context context) {
        super(2, gxszxtbevoVar);
        this.f57461yggfygwlhe = wypolnanluVar;
        this.f57460jyumaefscl = nzVar;
        this.f57459iwizpuwonk = keVar;
        this.f57458cqumvgiudr = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new le(this.f57461yggfygwlhe, gxszxtbevoVar, this.f57460jyumaefscl, this.f57459iwizpuwonk, this.f57458cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((le) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57462zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f57461yggfygwlhe;
            id idVar = new id(this.f57460jyumaefscl, this.f57459iwizpuwonk, this.f57458cqumvgiudr);
            this.f57462zdlpuopuiu = 1;
            if (wypolnanluVar.collect(idVar, this) == objGxszxtbevo) {
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
