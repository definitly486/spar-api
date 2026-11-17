package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ u2 f58602zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u2 u2Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58602zdlpuopuiu = u2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new t1(this.f58602zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new t1(this.f58602zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        b4 w2Var;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        bt btVar = this.f58602zdlpuopuiu.f58760ppxfxbqfkf;
        xr xrVar = xr.SC_BIZONE;
        we0 we0Var = we0.MERCHANT_VIEW;
        mp mpVar = mp.SC;
        btVar.iobyxmoadg(new ow(xrVar, we0Var, mpVar, null, null, null, null, 120));
        t0 t0VarIobyxmoadg = ((ks) this.f58602zdlpuopuiu.f58759iobyxmoadg).iobyxmoadg();
        if (t0VarIobyxmoadg.f58599iobyxmoadg) {
            this.f58602zdlpuopuiu.f58760ppxfxbqfkf.iobyxmoadg(new ow(xr.SC_GOOD_BIZONE, we0Var, mpVar, null, null, null, null, 120));
            w2Var = v1.f58929iobyxmoadg;
        } else {
            this.f58602zdlpuopuiu.f58760ppxfxbqfkf.iobyxmoadg(new ow(xr.SC_FAIL_BIZONE, we0Var, mpVar, t0VarIobyxmoadg.f58600zoijcleaow, null, null, null, 112));
            w2Var = new w2(t0VarIobyxmoadg.f58600zoijcleaow);
        }
        ((ve) this.f58602zdlpuopuiu.f58761zoijcleaow).zoijcleaow(new iwxlajgraz(w2Var));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
