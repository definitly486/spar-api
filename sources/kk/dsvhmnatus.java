package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class dsvhmnatus extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ Context f56321iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ls f56322jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ wi f56323yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56324zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvhmnatus(wi wiVar, lg.gxszxtbevo gxszxtbevoVar, ls lsVar, Context context) {
        super(2, gxszxtbevoVar);
        this.f56323yggfygwlhe = wiVar;
        this.f56322jyumaefscl = lsVar;
        this.f56321iwizpuwonk = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new dsvhmnatus(this.f56323yggfygwlhe, gxszxtbevoVar, this.f56322jyumaefscl, this.f56321iwizpuwonk);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((dsvhmnatus) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56324zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wi wiVar = this.f56323yggfygwlhe;
            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(this.f56322jyumaefscl, this.f56321iwizpuwonk);
            this.f56324zdlpuopuiu = 1;
            if (wiVar.collect(wflxmlrfwpVar, this) == objGxszxtbevo) {
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
