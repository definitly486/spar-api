package kk;

import npi.spay.Da;

/* JADX INFO: loaded from: classes3.dex */
public final class cllcsxoeiz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ Da f56171jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f56172yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56173zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllcsxoeiz(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, Da da3) {
        super(2, gxszxtbevoVar);
        this.f56172yggfygwlhe = wypolnanluVar;
        this.f56171jyumaefscl = da3;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new cllcsxoeiz(this.f56172yggfygwlhe, gxszxtbevoVar, this.f56171jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new cllcsxoeiz(this.f56172yggfygwlhe, (lg.gxszxtbevo) obj2, this.f56171jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56173zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f56172yggfygwlhe;
            draadjrbmk draadjrbmkVar = new draadjrbmk(this.f56171jyumaefscl);
            this.f56173zdlpuopuiu = 1;
            if (wypolnanluVar.collect(draadjrbmkVar, this) == objGxszxtbevo) {
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
