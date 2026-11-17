package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class s90 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ wa0 f58534zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(wa0 wa0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f58534zdlpuopuiu = wa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new s90(this.f58534zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return new s90(this.f58534zdlpuopuiu, (lg.gxszxtbevo) obj).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ((ve) this.f58534zdlpuopuiu.f59120ppxfxbqfkf).zoijcleaow(rn.f58457iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
