package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ yj f59502yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ yj f59503zdlpuopuiu;

    public z0(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z0 z0Var = new z0((lg.gxszxtbevo) obj3);
        z0Var.f59503zdlpuopuiu = (yj) obj;
        z0Var.f59502yggfygwlhe = (yj) obj2;
        return z0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        vu vuVarIobyxmoadg;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        yj yjVar = this.f59503zdlpuopuiu;
        yj yjVar2 = this.f59502yggfygwlhe;
        return (yjVar2 == null || (vuVarIobyxmoadg = yjVar2.iobyxmoadg()) == null) ? yjVar.iobyxmoadg() : vuVarIobyxmoadg;
    }
}
