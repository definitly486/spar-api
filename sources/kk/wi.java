package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wi implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ zj f59168yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f59169zdlpuopuiu;

    public wi(sj.lqeggnwhkg lqeggnwhkgVar, zj zjVar) {
        this.f59169zdlpuopuiu = lqeggnwhkgVar;
        this.f59168yggfygwlhe = zjVar;
    }

    @Override // sj.lqeggnwhkg
    public final Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f59169zdlpuopuiu.collect(new sh(nufgyqmvbuVar, this.f59168yggfygwlhe), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
