package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class xz extends u0 implements n0 {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ox f59348btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final long f59349dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.zynmafqrjb f59350eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final hw f59351gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.wypolnanlu f59352gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public fyldjkxazc f59353lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public long f59354nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pn f59355wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(bt metricFacade, jlmebxxoox sPayDataContract, pn restoreSessionIdUseCase, pc sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restoreSessionIdUseCase, "restoreSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        this.f59355wkgbmnqykc = restoreSessionIdUseCase;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f59350eablkybsjg = zynmafqrjbVarIobyxmoadg;
        this.f59352gxszxtbevo = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        this.f59354nufgyqmvbu = 4000L;
        this.f59349dxjokdxxww = 1000L;
        this.f59348btonecajqb = new ox(this);
        this.f59351gtknphoqwx = new hw(this);
    }

    @Override // kk.n0
    public final tg.draadjrbmk a() {
        return this.f59348btonecajqb;
    }

    @Override // kk.n0
    public final tg.iobyxmoadg b() {
        return this.f59351gtknphoqwx;
    }

    @Override // kk.bw
    public final void gtknphoqwx(xu viewState) {
        fyldjkxazc fyldjkxazcVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewState, "event");
        super.gtknphoqwx(viewState);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewState, "viewState");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewState, os.f57991iobyxmoadg)) {
            this.f59353lqeggnwhkg = new fyldjkxazc(this.f59354nufgyqmvbu, this.f59349dxjokdxxww, new lxfrhoxuzk(this), new k(this));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewState, kr.f57337iobyxmoadg)) {
            fyldjkxazc fyldjkxazcVar2 = this.f59353lqeggnwhkg;
            if (fyldjkxazcVar2 != null) {
                fyldjkxazcVar2.start();
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewState, gq.f56729iobyxmoadg) || (fyldjkxazcVar = this.f59353lqeggnwhkg) == null) {
            return;
        }
        fyldjkxazcVar.cancel();
    }
}
