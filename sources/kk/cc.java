package kk;

import com.google.android.gms.location.DeviceOrientationRequest;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class cc extends u0 implements n0 {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.zynmafqrjb f56119btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.wypolnanlu f56120dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public long f56121eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.wypolnanlu f56122gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final h4 f56123gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final c3 f56124lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f56125nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fyldjkxazc f56126wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(bt metricFacade, jlmebxxoox sPayDataContract, xf sPayStorage, pc sPaySdkReducer, wc0 featuresHandler) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f56121eablkybsjg = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        h4 h4Var = new h4(this);
        this.f56123gxszxtbevo = h4Var;
        c3 c3Var = new c3(this);
        this.f56124lqeggnwhkg = c3Var;
        ij ijVar = (ij) sPayStorage;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(new ab(new p7(ijVar.f57056zoijcleaow)), new x(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56125nufgyqmvbu = wypolnanluVarRibwqtqdhb;
        this.f56120dxjokdxxww = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) sPayDataContract).f55858lereixgezr), ijVar.f57056zoijcleaow, new b2(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f56119btonecajqb = zynmafqrjbVarIobyxmoadg;
        this.f56122gtknphoqwx = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), zynmafqrjbVarIobyxmoadg, new z0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        if (ijVar.iobyxmoadg().f57485iobyxmoadg instanceof a40) {
            fyldjkxazc fyldjkxazcVar = new fyldjkxazc(this.f56121eablkybsjg, 1000L, h4Var, c3Var);
            this.f56126wkgbmnqykc = fyldjkxazcVar;
            fyldjkxazcVar.start();
        }
    }

    @Override // kk.n0
    public final tg.draadjrbmk a() {
        return this.f56123gxszxtbevo;
    }

    @Override // kk.n0
    public final tg.iobyxmoadg b() {
        return this.f56124lqeggnwhkg;
    }

    @Override // kk.bw
    public final void gtknphoqwx(xu event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, os.f57991iobyxmoadg)) {
            this.f56125nufgyqmvbu.getValue();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, tt.f58723iobyxmoadg)) {
            try {
                fyldjkxazc fyldjkxazcVar = this.f56126wkgbmnqykc;
                if (fyldjkxazcVar != null) {
                    fyldjkxazcVar.cancel();
                }
            } catch (UninitializedPropertyAccessException unused) {
            }
            this.f56125nufgyqmvbu.getValue();
        }
    }
}
