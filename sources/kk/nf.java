package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class nf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ nz f57801cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f57802esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f57803iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f57804jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final /* synthetic */ Context f57805lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f57806yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57807zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(npi.spay.ke keVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, nz nzVar, npi.spay.ke keVar2, Context context) {
        super(2, gxszxtbevoVar);
        this.f57806yggfygwlhe = keVar;
        this.f57804jyumaefscl = zoijcleaowVar;
        this.f57803iwizpuwonk = wypolnanluVar;
        this.f57801cqumvgiudr = nzVar;
        this.f57802esjtqupxsv = keVar2;
        this.f57805lereixgezr = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new nf(this.f57806yggfygwlhe, this.f57804jyumaefscl, this.f57803iwizpuwonk, gxszxtbevoVar, this.f57801cqumvgiudr, this.f57802esjtqupxsv, this.f57805lereixgezr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((nf) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57807zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.ke keVar = this.f57806yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f57804jyumaefscl;
            le leVar = new le(this.f57803iwizpuwonk, null, this.f57801cqumvgiudr, this.f57802esjtqupxsv, this.f57805lereixgezr);
            this.f57807zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(keVar, zoijcleaowVar, leVar, this) == objGxszxtbevo) {
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
