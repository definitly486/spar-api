package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ c6 f58020zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c6 c6Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58020zdlpuopuiu = c6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new p0(this.f58020zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new p0(this.f58020zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        c6 c6Var = this.f58020zdlpuopuiu;
        ow event = new ow(w.TOUCH_DECLINED_BY_USER, we0.BNPL_VIEW, mp.TOUCH, null, null, null, null, 120);
        c6Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        c6Var.f56062iobyxmoadg.iobyxmoadg(event);
        wc0 wc0Var = this.f58020zdlpuopuiu.f56100eablkybsjg;
        uc0 tag = uc0.BNPL;
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
        if (y60Var != null) {
            y60Var.zoijcleaow(new j9(false));
        }
        ((ve) this.f58020zdlpuopuiu.f56106wkgbmnqykc).zoijcleaow(new pm(ek.f56434iobyxmoadg, true));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
