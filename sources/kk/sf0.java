package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class sf0 implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ wg0 f58552yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ o80 f58553zdlpuopuiu;

    public sf0(o80 o80Var, wg0 wg0Var) {
        this.f58553zdlpuopuiu = o80Var;
        this.f58552yggfygwlhe = wg0Var;
    }

    @Override // sj.lqeggnwhkg
    public final Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f58553zdlpuopuiu.collect(new me0(nufgyqmvbuVar, this.f58552yggfygwlhe), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
