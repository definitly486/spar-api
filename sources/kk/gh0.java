package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gh0 extends grlcpdaxtj {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.wypolnanlu f56704gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f56705lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.lqeggnwhkg f56706nufgyqmvbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, za helperManager, wc0 featuresHandler, xf sPayStorage, m60 sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperManager, "helperManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(auzgnhcxokVar.f55843btonecajqb, new sd0(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56704gxszxtbevo = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.draadjrbmk(sj.dxjokdxxww.zoijcleaow(auzgnhcxokVar.f55842agtfadlqog), wypolnanluVarRibwqtqdhb, auzgnhcxokVar.f55844cdpycssgdh, new bg0(helperManager, sPaySdkConfigRepository, sPayStorage, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56705lqeggnwhkg = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), new ve0(helperManager, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56706nufgyqmvbu = sj.dxjokdxxww.draadjrbmk(((ij) sPayStorage).f57056zoijcleaow, auzgnhcxokVar.f55875zynmafqrjb, auzgnhcxokVar.f55853iozdgvuglv, new oc0(featuresHandler, null));
    }

    @Override // kk.grlcpdaxtj
    public final gg.wwaezpbzkn draadjrbmk(lqeggnwhkg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (!(event instanceof jg0)) {
            return super.draadjrbmk(event);
        }
        grlcpdaxtj.agtfadlqog(this, hi.LC_STATUS_SUCCESS_VIEW_APPEARED);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
