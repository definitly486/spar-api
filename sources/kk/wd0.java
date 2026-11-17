package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wd0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ String f59133yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Long f59134zdlpuopuiu;

    public wd0(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd0 wd0Var = new wd0((lg.gxszxtbevo) obj3);
        wd0Var.f59134zdlpuopuiu = (Long) obj;
        wd0Var.f59133yggfygwlhe = (String) obj2;
        return wd0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        Long l13 = this.f59134zdlpuopuiu;
        String str = this.f59133yggfygwlhe;
        if (l13 != null) {
            return new jh0(l13.longValue(), str);
        }
        return null;
    }
}
