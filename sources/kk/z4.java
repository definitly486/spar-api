package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ String f59521yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Long f59522zdlpuopuiu;

    public z4(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z4 z4Var = new z4((lg.gxszxtbevo) obj3);
        z4Var.f59522zdlpuopuiu = (Long) obj;
        z4Var.f59521yggfygwlhe = (String) obj2;
        return z4Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        Long l13 = this.f59522zdlpuopuiu;
        String str = this.f59521yggfygwlhe;
        if (l13 != null) {
            return new jh0(l13.longValue(), str);
        }
        return null;
    }
}
