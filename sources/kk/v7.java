package kk;

import spay.sdk.domain.model.OrderScreenOutcome;

/* JADX INFO: loaded from: classes3.dex */
public final class v7 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ hl f58970yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ hl f58971zdlpuopuiu;

    public v7(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v7 v7Var = new v7((lg.gxszxtbevo) obj3);
        v7Var.f58971zdlpuopuiu = (hl) obj;
        v7Var.f58970yggfygwlhe = (hl) obj2;
        return v7Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return new OrderScreenOutcome(this.f58971zdlpuopuiu, null, this.f58970yggfygwlhe);
    }
}
