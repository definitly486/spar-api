package kk;

import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class tf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f58658cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f58659iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f58660jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f58661yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58662zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(RedirectActivity redirectActivity, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, RedirectActivity redirectActivity2) {
        super(2, gxszxtbevoVar);
        this.f58661yggfygwlhe = redirectActivity;
        this.f58660jyumaefscl = zoijcleaowVar;
        this.f58659iwizpuwonk = wypolnanluVar;
        this.f58658cqumvgiudr = redirectActivity2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new tf(this.f58661yggfygwlhe, this.f58660jyumaefscl, this.f58659iwizpuwonk, gxszxtbevoVar, this.f58658cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((tf) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58662zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            RedirectActivity redirectActivity = this.f58661yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f58660jyumaefscl;
            re reVar = new re(this.f58659iwizpuwonk, null, this.f58658cqumvgiudr);
            this.f58662zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(redirectActivity, zoijcleaowVar, reVar, this) == objGxszxtbevo) {
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
