package kk;

import spay.sdk.domain.model.BnplMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class z00 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ bf0 f59504zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z00(bf0 bf0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f59504zdlpuopuiu = bf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new z00(this.f59504zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new z00(this.f59504zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        bf0 bf0Var = this.f59504zdlpuopuiu;
        ow event = new ow(kh0.TOUCH_CANCEL, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
        bf0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        bf0Var.f56062iobyxmoadg.iobyxmoadg(event);
        boolean z13 = ((auzgnhcxok) this.f59504zdlpuopuiu.f56063zoijcleaow).f55853iozdgvuglv.getValue() instanceof BnplMethod;
        ((ve) this.f59504zdlpuopuiu.f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
