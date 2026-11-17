package kk;

import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ai extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f55822jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f55823yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f55824zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, RedirectActivity redirectActivity) {
        super(2, gxszxtbevoVar);
        this.f55823yggfygwlhe = lqeggnwhkgVar;
        this.f55822jyumaefscl = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new ai(this.f55823yggfygwlhe, gxszxtbevoVar, this.f55822jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new ai(this.f55823yggfygwlhe, (lg.gxszxtbevo) obj2, this.f55822jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f55824zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.lqeggnwhkg lqeggnwhkgVar = this.f55823yggfygwlhe;
            yg ygVar = new yg(this.f55822jyumaefscl);
            this.f55824zdlpuopuiu = 1;
            if (lqeggnwhkgVar.collect(ygVar, this) == objGxszxtbevo) {
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
