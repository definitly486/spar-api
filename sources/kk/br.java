package kk;

import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class br extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f56040jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f56041yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56042zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, RedirectActivity redirectActivity) {
        super(2, gxszxtbevoVar);
        this.f56041yggfygwlhe = wypolnanluVar;
        this.f56040jyumaefscl = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new br(this.f56041yggfygwlhe, gxszxtbevoVar, this.f56040jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new br(this.f56041yggfygwlhe, (lg.gxszxtbevo) obj2, this.f56040jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56042zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f56041yggfygwlhe;
            xp xpVar = new xp(this.f56040jyumaefscl);
            this.f56042zdlpuopuiu = 1;
            if (wypolnanluVar.collect(xpVar, this) == objGxszxtbevo) {
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
