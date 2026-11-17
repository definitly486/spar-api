package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class oy extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ro f58012yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ ro f58013zdlpuopuiu;

    public oy(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oy oyVar = new oy((lg.gxszxtbevo) obj3);
        oyVar.f58013zdlpuopuiu = (ro) obj;
        oyVar.f58012yggfygwlhe = (ro) obj2;
        return oyVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ro roVar = this.f58013zdlpuopuiu;
        return roVar == null ? this.f58012yggfygwlhe : roVar;
    }
}
