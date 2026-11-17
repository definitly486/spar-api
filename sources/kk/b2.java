package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ln f55891yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ String f55892zdlpuopuiu;

    public b2(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b2 b2Var = new b2((lg.gxszxtbevo) obj3);
        b2Var.f55892zdlpuopuiu = (String) obj;
        b2Var.f55891yggfygwlhe = (ln) obj2;
        return b2Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        String str = this.f55892zdlpuopuiu;
        hl hlVar = this.f55891yggfygwlhe.f57485iobyxmoadg;
        if (hlVar instanceof a40) {
            yj yjVar = ((a40) hlVar).f55773iobyxmoadg;
            if ((yjVar instanceof he) || (yjVar instanceof rh)) {
                return ir.wkgbmnqykc(str);
            }
        }
        if ((hlVar instanceof cs) || (hlVar instanceof e0) || (hlVar instanceof i2)) {
            return ir.wkgbmnqykc(str);
        }
        return null;
    }
}
