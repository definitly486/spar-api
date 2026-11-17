package ru.myspar.proloyalty.purchases.impl.list_details.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lj1.lqeggnwhkg;
import m21.dxjokdxxww;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final an0.iobyxmoadg f99730btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99731draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f99732gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99733wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, oj1.ppxfxbqfkf stateToUiModelMapper, an0.iobyxmoadg authFeatureApi, xo0.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f99730btonecajqb = authFeatureApi;
        this.f99732gtknphoqwx = catalogFeatureApi;
        this.f99731draadjrbmk = stateToUiModelMapper;
        this.f99733wflxmlrfwp = new draadjrbmk() { // from class: mj1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.list_details.presentation.iobyxmoadg.mbcevpiqjq((ru.myspar.proloyalty.purchases.impl.list_details.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj1.wkgbmnqykc mbcevpiqjq(zoijcleaow zoijcleaowVar) {
        lj1.wkgbmnqykc vdvldrhtssVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2394zoijcleaow.f99770iobyxmoadg)) {
            return lj1.wkgbmnqykc.zoijcleaow.f62850iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.vdvldrhtss) {
            zoijcleaow.vdvldrhtss vdvldrhtssVar2 = (zoijcleaow.vdvldrhtss) zoijcleaowVar;
            vdvldrhtssVar = new lj1.wkgbmnqykc.zdlpuopuiu(vdvldrhtssVar2.iobyxmoadg(), vdvldrhtssVar2.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            vdvldrhtssVar = new lj1.wkgbmnqykc.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
            zoijcleaow.gtknphoqwx gtknphoqwxVar = (zoijcleaow.gtknphoqwx) zoijcleaowVar;
            String strIobyxmoadg = gtknphoqwxVar.iobyxmoadg();
            vdvldrhtssVar = (strIobyxmoadg == null || kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) ? new lj1.wkgbmnqykc.draadjrbmk(gtknphoqwxVar.zoijcleaow()) : new lj1.wkgbmnqykc.wflxmlrfwp(gtknphoqwxVar.iobyxmoadg(), gtknphoqwxVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.rgvfuqvkyq) {
            zoijcleaow.rgvfuqvkyq rgvfuqvkyqVar = (zoijcleaow.rgvfuqvkyq) zoijcleaowVar;
            String strIobyxmoadg2 = rgvfuqvkyqVar.iobyxmoadg();
            vdvldrhtssVar = (strIobyxmoadg2 == null || kcexrzcfyt.zfvoamnweg(strIobyxmoadg2)) ? new lj1.wkgbmnqykc.oxmwwwfdhm(rgvfuqvkyqVar.zoijcleaow()) : new lj1.wkgbmnqykc.kcexrzcfyt(rgvfuqvkyqVar.iobyxmoadg(), rgvfuqvkyqVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof zoijcleaow.wflxmlrfwp) {
            zoijcleaow.wflxmlrfwp wflxmlrfwpVar = (zoijcleaow.wflxmlrfwp) zoijcleaowVar;
            vdvldrhtssVar = new lj1.wkgbmnqykc.ojitshcjhn(wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
        } else {
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.lqeggnwhkg.f99758iobyxmoadg)) {
                return lj1.wkgbmnqykc.lqeggnwhkg.f62835iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.gxszxtbevo.f99756iobyxmoadg)) {
                return lj1.wkgbmnqykc.gxszxtbevo.f62831iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f99753iobyxmoadg)) {
                return lj1.wkgbmnqykc.eablkybsjg.f62829iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f99762iobyxmoadg)) {
                return lj1.wkgbmnqykc.ppxfxbqfkf.f62841iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f99769iobyxmoadg)) {
                return lj1.wkgbmnqykc.C1279wkgbmnqykc.f62847iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                vdvldrhtssVar = new lj1.wkgbmnqykc.gtknphoqwx(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu) {
                zoijcleaow.nufgyqmvbu nufgyqmvbuVar = (zoijcleaow.nufgyqmvbu) zoijcleaowVar;
                vdvldrhtssVar = new lj1.wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow());
            } else if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                vdvldrhtssVar = new lj1.wkgbmnqykc.dxjokdxxww(((zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.agtfadlqog) {
                zoijcleaow.agtfadlqog agtfadlqogVar = (zoijcleaow.agtfadlqog) zoijcleaowVar;
                vdvldrhtssVar = new lj1.wkgbmnqykc.rgvfuqvkyq(agtfadlqogVar.zoijcleaow(), agtfadlqogVar.iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.draadjrbmk) {
                vdvldrhtssVar = new lj1.wkgbmnqykc.agtfadlqog(((zoijcleaow.draadjrbmk) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.ojitshcjhn)) {
                    throw new NoWhenBranchMatchedException();
                }
                vdvldrhtssVar = new lj1.wkgbmnqykc.vdvldrhtss(((zoijcleaow.ojitshcjhn) zoijcleaowVar).iobyxmoadg());
            }
        }
        return vdvldrhtssVar;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99731draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99733wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(lj1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof lj1.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(((lj1.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lj1.eablkybsjg.iobyxmoadg.f62709iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lj1.eablkybsjg.zoijcleaow.f62717iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99730btonecajqb.eablkybsjg());
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lj1.eablkybsjg.draadjrbmk.f62702iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.gxszxtbevo.f99735iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lj1.eablkybsjg.gtknphoqwx) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.eablkybsjg(((lj1.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lj1.eablkybsjg.wflxmlrfwp.f62715iobyxmoadg)) {
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.lqeggnwhkg.f99739iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lj1.eablkybsjg.dxjokdxxww) {
                Object objCllcsxoeiz5 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((lj1.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lj1.eablkybsjg.btonecajqb) {
                lj1.eablkybsjg.btonecajqb btonecajqbVar = (lj1.eablkybsjg.btonecajqb) eablkybsjgVar;
                Object objCllcsxoeiz6 = cllcsxoeiz(new ppxfxbqfkf.C2392ppxfxbqfkf(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow()), gxszxtbevoVar);
                return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lj1.eablkybsjg.nufgyqmvbu) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.vdvldrhtss(((lj1.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()));
            } else if (eablkybsjgVar instanceof lj1.eablkybsjg.ppxfxbqfkf) {
                i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f99732gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(((lj1.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
            } else if (eablkybsjgVar instanceof lj1.eablkybsjg.C1272eablkybsjg) {
                i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f99732gtknphoqwx.iobyxmoadg(new SearchPayload(null, null, null, null, 15, null)));
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, lj1.eablkybsjg.wkgbmnqykc.f62716iobyxmoadg)) {
                    if (!(eablkybsjgVar instanceof lj1.eablkybsjg.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lj1.eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (lj1.eablkybsjg.gxszxtbevo) eablkybsjgVar;
                    Object objCllcsxoeiz7 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar2.zoijcleaow(), gxszxtbevoVar2.iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                }
                i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, MainTab.CATALOG, false, 2, null);
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
