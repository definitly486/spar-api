package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class d40 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56226zdlpuopuiu;

    public d40(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        d40 d40Var = new d40(gxszxtbevoVar);
        d40Var.f56226zdlpuopuiu = obj;
        return d40Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        d40 d40Var = new d40((lg.gxszxtbevo) obj2);
        d40Var.f56226zdlpuopuiu = (ln) obj;
        return d40Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return new hg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!(((ln) this.f56226zdlpuopuiu).f57485iobyxmoadg instanceof p10)));
    }
}
