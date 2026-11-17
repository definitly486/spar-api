package kk;

import npi.spay.Bn;
import npi.spay.Mn;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ly extends bw {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final /* synthetic */ ah.gtknphoqwx[] f57548dxjokdxxww = {kotlin.jvm.internal.cllcsxoeiz.eablkybsjg(new kotlin.jvm.internal.esjtqupxsv(ly.class, "screenMode", "getScreenMode()Lspay/sdk/domain/ReturnScreenType;", 0))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final u80 f57549eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final wg.eablkybsjg f57550gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f57551lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f57552nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final pc f57553ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final n70 f57554wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage, de0 authHandler, n70 revokeRefreshTokenUseCase, u80 setCookieHandler, m60 sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(revokeRefreshTokenUseCase, "revokeRefreshTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f57553ppxfxbqfkf = sPaySdkReducer;
        this.f57554wkgbmnqykc = revokeRefreshTokenUseCase;
        this.f57549eablkybsjg = setCookieHandler;
        wg.eablkybsjg eablkybsjgVarIobyxmoadg = wg.iobyxmoadg.f119567iobyxmoadg.iobyxmoadg();
        this.f57550gxszxtbevo = eablkybsjgVarIobyxmoadg;
        this.f57551lqeggnwhkg = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(sj.dxjokdxxww.lereixgezr(sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) sPayDataContract).f55851gxszxtbevo)), new ex(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f57552nufgyqmvbu = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof fk)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.UserProfile");
        eablkybsjgVarIobyxmoadg.zoijcleaow(this, f57548dxjokdxxww[0], ((fk) hlVar).f56575iobyxmoadg);
        SPaySdkConfig sPaySdkConfig = ((s80) sPaySdkConfigRepository).f58531ppxfxbqfkf;
        if (sPaySdkConfig == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        zynmafqrjbVarIobyxmoadg.setValue(sPaySdkConfig.getLocalization().getUserProfileInfo());
    }

    public final void draadjrbmk(ns userProfileFragmentEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userProfileFragmentEvent, "userProfileFragmentEvent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(userProfileFragmentEvent, fq.f56583iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(lc.LC_PROFILE_VIEW_APPEARED, we0.PROFILE_VIEW, mp.LC, null, null, null, null, 120));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(userProfileFragmentEvent, jr.f57218iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(lc.LC_PROFILE_VIEW_DISAPPEARED, we0.PROFILE_VIEW, mp.LC, null, null, null, null, 120));
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(userProfileFragmentEvent, wn.f59184iobyxmoadg)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(userProfileFragmentEvent, bp.f56039iobyxmoadg)) {
                this.f56062iobyxmoadg.iobyxmoadg(new ow(lc.TOUCH_LOG_OUT, we0.PROFILE_VIEW, mp.TOUCH, null, null, null, null, 120));
                pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new aw(this, null), 3, null);
                return;
            }
            return;
        }
        ow event = new ow(lc.TOUCH_BACK, we0.PROFILE_VIEW, mp.TOUCH, null, null, null, null, 120);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f56062iobyxmoadg.iobyxmoadg(event);
        wg.eablkybsjg eablkybsjgVar = this.f57550gxszxtbevo;
        ah.gtknphoqwx[] gtknphoqwxVarArr = f57548dxjokdxxww;
        iz izVar = (iz) eablkybsjgVar.iobyxmoadg(this, gtknphoqwxVarArr[0]);
        if (izVar instanceof xw) {
            pc pcVar = this.f57553ppxfxbqfkf;
            iz izVar2 = (iz) this.f57550gxszxtbevo.iobyxmoadg(this, gtknphoqwxVarArr[0]);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(izVar2, "null cannot be cast to non-null type spay.sdk.domain.ReturnScreenType.ReturnHelpersScreenType");
            ((ve) pcVar).zoijcleaow(new di(((xw) izVar2).f59344iobyxmoadg));
            return;
        }
        if (izVar instanceof fy) {
            pc pcVar2 = this.f57553ppxfxbqfkf;
            iz izVar3 = (iz) this.f57550gxszxtbevo.iobyxmoadg(this, gtknphoqwxVarArr[0]);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(izVar3, "null cannot be cast to non-null type spay.sdk.domain.ReturnScreenType.ReturnOrderScreenType");
            ((fy) izVar3).getClass();
            ((ve) pcVar2).zoijcleaow(new pm(ek.f56434iobyxmoadg, false));
        }
    }
}
