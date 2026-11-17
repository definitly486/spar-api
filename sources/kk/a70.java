package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class a70 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ d80 f55783zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(d80 d80Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55783zdlpuopuiu = d80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new a70(this.f55783zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new a70(this.f55783zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ks ksVar = (ks) this.f55783zdlpuopuiu.f56238iobyxmoadg;
        ksVar.getClass();
        gr.f56730iobyxmoadg.getClass();
        kc2.zoijcleaow zoijcleaowVarIobyxmoadg = ksVar.f57344zoijcleaow.iobyxmoadg(new s(cq.f56179zoijcleaow));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarIobyxmoadg, "bizoneFingerprintFactory…eate(fingerprintSettings)");
        zoijcleaowVarIobyxmoadg.iobyxmoadg(null);
        String report = (String) zoijcleaowVarIobyxmoadg.ppxfxbqfkf();
        zoijcleaowVarIobyxmoadg.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(report, "report");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(report, "<this>");
        String data = mj.kcexrzcfyt.hcddaimhww(report, "\n", "", false, 4, null);
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f55783zdlpuopuiu.f56239zoijcleaow;
        auzgnhcxokVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        auzgnhcxokVar.f55870wwaezpbzkn = data;
        return data;
    }
}
