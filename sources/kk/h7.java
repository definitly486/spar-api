package kk;

import spay.sdk.domain.model.PayStrategy;
import spay.sdk.view.BnplButtonCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final u80 f56838eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ol f56839gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final jlmebxxoox f56840iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final bt f56841lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final wc0 f56842ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final de0 f56843wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final xf f56844zoijcleaow;

    public h7(jlmebxxoox sPayDataContract, xf sPayStorage, wc0 featuresHandler, de0 authHandler, u80 setCookieHandler, ol seamlessAuthFeature, bt metricFacade, ll sPayRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(seamlessAuthFeature, "seamlessAuthFeature");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        this.f56840iobyxmoadg = sPayDataContract;
        this.f56844zoijcleaow = sPayStorage;
        this.f56842ppxfxbqfkf = featuresHandler;
        this.f56843wkgbmnqykc = authHandler;
        this.f56838eablkybsjg = setCookieHandler;
        this.f56839gxszxtbevo = seamlessAuthFeature;
        this.f56841lqeggnwhkg = metricFacade;
    }

    public final void iobyxmoadg(boolean z13) {
        spay.sdk.c cVarIobyxmoadg;
        wc0 wc0Var = this.f56842ppxfxbqfkf;
        uc0 tag = uc0.BNPL;
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
        if (y60Var != null) {
            y60Var.zoijcleaow(new j9(false));
        }
        ((auzgnhcxok) this.f56840iobyxmoadg).ppxfxbqfkf(iwizpuwonk.ALL);
        ij ijVar = (ij) this.f56844zoijcleaow;
        ijVar.getClass();
        ijVar.ppxfxbqfkf(new ln(p10.f58028iobyxmoadg, null, false));
        wc0 wc0Var2 = this.f56842ppxfxbqfkf;
        wc0Var2.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var2 = (y60) wc0Var2.f59129wkgbmnqykc.get(tag);
        if (y60Var2 != null) {
            y60Var2.zoijcleaow(new j9(false));
        }
        jf0 jf0Var = (jf0) this.f56843wkgbmnqykc;
        jf0Var.getClass();
        ad0 authDataMode = ad0.ALL;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authDataMode, "authDataMode");
        jf0Var.f57192zoijcleaow = false;
        jf0Var.f57190ppxfxbqfkf = false;
        jf0Var.f57191wkgbmnqykc = false;
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = spay.sdk.c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        r80.f58286zoijcleaow = null;
        r80.f58284ppxfxbqfkf = null;
        spay.sdk.c.f107840g = null;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f56840iobyxmoadg;
        auzgnhcxokVar.getClass();
        auzgnhcxokVar.f55855iwizpuwonk = 0;
        ((auzgnhcxok) this.f56840iobyxmoadg).f55860lqeggnwhkg.setValue(Boolean.TRUE);
        BnplButtonCompositeView.f107848c = false;
        if (z13) {
            jlmebxxoox jlmebxxooxVar = this.f56840iobyxmoadg;
            PayStrategy.BasePay status = PayStrategy.BasePay.INSTANCE;
            auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar;
            auzgnhcxokVar2.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(status, "status");
            auzgnhcxokVar2.f55871yadqdtsiqt.setValue(status);
        }
        p2.f58029iobyxmoadg = true;
        p2.f58030zoijcleaow = true;
        u80 u80Var = this.f56838eablkybsjg;
        u80Var.f58796wkgbmnqykc = null;
        u80Var.f58793eablkybsjg = "";
        this.f56839gxszxtbevo.getClass();
        ol.f57971ppxfxbqfkf = null;
        this.f56841lqeggnwhkg.getClass();
        bt.f56047lqeggnwhkg = null;
        bt.f56046gxszxtbevo = false;
    }
}
