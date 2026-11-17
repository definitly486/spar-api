package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59224zdlpuopuiu;

    public x(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        x xVar = new x(gxszxtbevoVar);
        xVar.f59224zdlpuopuiu = obj;
        return xVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        x xVar = new x((lg.gxszxtbevo) obj2);
        xVar.f59224zdlpuopuiu = (a40) obj;
        return xVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return ((a40) this.f59224zdlpuopuiu).f55773iobyxmoadg;
    }
}
