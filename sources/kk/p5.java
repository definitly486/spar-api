package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ oe f58040yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58041zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(oe oeVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58040yggfygwlhe = oeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        p5 p5Var = new p5(this.f58040yggfygwlhe, gxszxtbevoVar);
        p5Var.f58041zdlpuopuiu = obj;
        return p5Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        p5 p5Var = new p5(this.f58040yggfygwlhe, (lg.gxszxtbevo) obj2);
        p5Var.f58041zdlpuopuiu = (ln) obj;
        return p5Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ((ij) this.f58040yggfygwlhe.f57932gxszxtbevo).ppxfxbqfkf((ln) this.f58041zdlpuopuiu);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
