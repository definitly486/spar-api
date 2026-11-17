package ru.myspar.purchases.impl.list_details.presentation;

import androidx.lifecycle.pkzmftpjix;
import fy1.lqeggnwhkg;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.core.ui.model.MainTab;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f102438agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ro.iobyxmoadg f102439btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final qm.iobyxmoadg f102440draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f102441gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f102442wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, iy1.ppxfxbqfkf stateToUiModelMapper, ro.iobyxmoadg authFeatureApi, lq.iobyxmoadg catalogFeatureApi, qm.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f102439btonecajqb = authFeatureApi;
        this.f102441gtknphoqwx = catalogFeatureApi;
        this.f102440draadjrbmk = addressFeatureApi;
        this.f102442wflxmlrfwp = stateToUiModelMapper;
        this.f102438agtfadlqog = new draadjrbmk() { // from class: gy1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.list_details.presentation.iobyxmoadg.mbcevpiqjq((ru.myspar.purchases.impl.list_details.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fy1.wkgbmnqykc mbcevpiqjq(zoijcleaow zoijcleaowVar) {
        fy1.wkgbmnqykc oxmwwwfdhmVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f102477iobyxmoadg)) {
            return fy1.wkgbmnqykc.ppxfxbqfkf.f35484iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.oxmwwwfdhm) {
            zoijcleaow.oxmwwwfdhm oxmwwwfdhmVar2 = (zoijcleaow.oxmwwwfdhm) zoijcleaowVar;
            oxmwwwfdhmVar = new fy1.wkgbmnqykc.yggfygwlhe(oxmwwwfdhmVar2.iobyxmoadg(), oxmwwwfdhmVar2.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            oxmwwwfdhmVar = new fy1.wkgbmnqykc.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.draadjrbmk) {
            zoijcleaow.draadjrbmk draadjrbmkVar = (zoijcleaow.draadjrbmk) zoijcleaowVar;
            String strIobyxmoadg = draadjrbmkVar.iobyxmoadg();
            oxmwwwfdhmVar = (strIobyxmoadg == null || kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) ? new fy1.wkgbmnqykc.wflxmlrfwp(draadjrbmkVar.zoijcleaow()) : new fy1.wkgbmnqykc.agtfadlqog(draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.vdvldrhtss) {
            zoijcleaow.vdvldrhtss vdvldrhtssVar = (zoijcleaow.vdvldrhtss) zoijcleaowVar;
            String strIobyxmoadg2 = vdvldrhtssVar.iobyxmoadg();
            oxmwwwfdhmVar = (strIobyxmoadg2 == null || kcexrzcfyt.zfvoamnweg(strIobyxmoadg2)) ? new fy1.wkgbmnqykc.kcexrzcfyt(vdvldrhtssVar.zoijcleaow()) : new fy1.wkgbmnqykc.zdlpuopuiu(vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.agtfadlqog) {
            zoijcleaow.agtfadlqog agtfadlqogVar = (zoijcleaow.agtfadlqog) zoijcleaowVar;
            oxmwwwfdhmVar = new fy1.wkgbmnqykc.rgvfuqvkyq(agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow());
        } else {
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.nufgyqmvbu.f102472iobyxmoadg)) {
                return fy1.wkgbmnqykc.nufgyqmvbu.f35481iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.lqeggnwhkg.f102471iobyxmoadg)) {
                return fy1.wkgbmnqykc.lqeggnwhkg.f35480iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.gxszxtbevo.f102469iobyxmoadg)) {
                return fy1.wkgbmnqykc.gxszxtbevo.f35477iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f102482iobyxmoadg)) {
                return fy1.wkgbmnqykc.C0801wkgbmnqykc.f35490iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f102467iobyxmoadg)) {
                return fy1.wkgbmnqykc.eablkybsjg.f35476iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.draadjrbmk(((zoijcleaow.gtknphoqwx) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                zoijcleaow.dxjokdxxww dxjokdxxwwVar = (zoijcleaow.dxjokdxxww) zoijcleaowVar;
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.dxjokdxxww(dxjokdxxwwVar.iobyxmoadg(), dxjokdxxwwVar.zoijcleaow());
            } else if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.btonecajqb(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.C2476zoijcleaow) {
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2476zoijcleaow) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.ojitshcjhn) {
                zoijcleaow.ojitshcjhn ojitshcjhnVar = (zoijcleaow.ojitshcjhn) zoijcleaowVar;
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.vdvldrhtss(ojitshcjhnVar.zoijcleaow(), ojitshcjhnVar.iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.wflxmlrfwp) {
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.ojitshcjhn(((zoijcleaow.wflxmlrfwp) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.rgvfuqvkyq)) {
                    throw new NoWhenBranchMatchedException();
                }
                oxmwwwfdhmVar = new fy1.wkgbmnqykc.oxmwwwfdhm(((zoijcleaow.rgvfuqvkyq) zoijcleaowVar).iobyxmoadg());
            }
        }
        return oxmwwwfdhmVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102442wflxmlrfwp;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102438agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(fy1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof fy1.eablkybsjg.nufgyqmvbu) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.eablkybsjg(((fy1.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, fy1.eablkybsjg.iobyxmoadg.f35350iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, fy1.eablkybsjg.wkgbmnqykc.f35356iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f102439btonecajqb.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
        } else if (eablkybsjgVar instanceof fy1.eablkybsjg.lqeggnwhkg) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f102440draadjrbmk.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((fy1.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg())));
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, fy1.eablkybsjg.agtfadlqog.f35338iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.lqeggnwhkg.f102448iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof fy1.eablkybsjg.wflxmlrfwp) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.gxszxtbevo(((fy1.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, fy1.eablkybsjg.ojitshcjhn.f35353iobyxmoadg)) {
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.nufgyqmvbu.f102449iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof fy1.eablkybsjg.gtknphoqwx) {
                Object objCllcsxoeiz5 = cllcsxoeiz(new ppxfxbqfkf.C2474ppxfxbqfkf(((fy1.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof fy1.eablkybsjg.draadjrbmk) {
                fy1.eablkybsjg.draadjrbmk draadjrbmkVar = (fy1.eablkybsjg.draadjrbmk) eablkybsjgVar;
                Object objCllcsxoeiz6 = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow()), gxszxtbevoVar);
                return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof fy1.eablkybsjg.dxjokdxxww) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.vdvldrhtss(((fy1.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()));
            } else if (eablkybsjgVar instanceof fy1.eablkybsjg.zoijcleaow) {
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f102441gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(((fy1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
            } else if (eablkybsjgVar instanceof fy1.eablkybsjg.C0794eablkybsjg) {
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f102441gtknphoqwx.wkgbmnqykc(new SearchPayload(null, null, null, null, 15, null)));
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, fy1.eablkybsjg.ppxfxbqfkf.f35354iobyxmoadg)) {
                    if (eablkybsjgVar instanceof fy1.eablkybsjg.btonecajqb) {
                        fy1.eablkybsjg.btonecajqb btonecajqbVar = (fy1.eablkybsjg.btonecajqb) eablkybsjgVar;
                        Object objCllcsxoeiz7 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (!(eablkybsjgVar instanceof fy1.eablkybsjg.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fy1.eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (fy1.eablkybsjg.gxszxtbevo) eablkybsjgVar;
                    Object objCllcsxoeiz8 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar2.zoijcleaow(), gxszxtbevoVar2.iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
                }
                d40.iobyxmoadg.iozdgvuglv(d40.iobyxmoadg.f26931iobyxmoadg, MainTab.CATALOG, false, 2, null);
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
