package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ro f59616yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ ro f59617zdlpuopuiu;

    public zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zoijcleaow zoijcleaowVar = new zoijcleaow((lg.gxszxtbevo) obj3);
        zoijcleaowVar.f59617zdlpuopuiu = (ro) obj;
        zoijcleaowVar.f59616yggfygwlhe = (ro) obj2;
        return zoijcleaowVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ro roVar = this.f59617zdlpuopuiu;
        return roVar == null ? this.f59616yggfygwlhe : roVar;
    }
}
