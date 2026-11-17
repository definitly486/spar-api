package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class lf implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ m60 f57467yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f57468zdlpuopuiu;

    public lf(sj.lqeggnwhkg lqeggnwhkgVar, m60 m60Var) {
        this.f57468zdlpuopuiu = lqeggnwhkgVar;
        this.f57467yggfygwlhe = m60Var;
    }

    @Override // sj.lqeggnwhkg
    public final Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f57468zdlpuopuiu.collect(new ie(nufgyqmvbuVar, this.f57467yggfygwlhe), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
