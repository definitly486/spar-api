package kk;

import spay.sdk.domain.model.OrderScreenOutcome;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ hl f58520yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ hl f58521zdlpuopuiu;

    public s6(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s6 s6Var = new s6((lg.gxszxtbevo) obj3);
        s6Var.f58521zdlpuopuiu = (hl) obj;
        s6Var.f58520yggfygwlhe = (hl) obj2;
        return s6Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return new OrderScreenOutcome(this.f58521zdlpuopuiu, this.f58520yggfygwlhe, null);
    }
}
