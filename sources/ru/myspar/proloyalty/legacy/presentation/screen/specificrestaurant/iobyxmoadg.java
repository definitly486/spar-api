package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import tg.draadjrbmk;
import u61.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final vb1.iobyxmoadg f97492btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97493draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final an0.iobyxmoadg f97494gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f97495wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, vb1.zoijcleaow stateToUiModelMapper, vb1.iobyxmoadg restaurantSectionToDomainMapper, an0.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(restaurantSectionToDomainMapper, "restaurantSectionToDomainMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f97492btonecajqb = restaurantSectionToDomainMapper;
        this.f97494gtknphoqwx = authFeatureApi;
        this.f97493draadjrbmk = stateToUiModelMapper;
        this.f97495wflxmlrfwp = new draadjrbmk() { // from class: tb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.iobyxmoadg.mbcevpiqjq(this.f110208zdlpuopuiu, (ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u61.wkgbmnqykc mbcevpiqjq(iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar;
            return new u61.wkgbmnqykc.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            return new u61.wkgbmnqykc.C2793wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            return new u61.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.nufgyqmvbu) {
            return new u61.wkgbmnqykc.nufgyqmvbu(iobyxmoadgVar.f97492btonecajqb.invoke(((ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg()));
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f97501iobyxmoadg)) {
            return u61.wkgbmnqykc.iobyxmoadg.f112846iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2304ppxfxbqfkf.f97504iobyxmoadg)) {
            return u61.wkgbmnqykc.ppxfxbqfkf.f112849iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f97500iobyxmoadg)) {
            return u61.wkgbmnqykc.gxszxtbevo.f112845iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.lqeggnwhkg.f97502iobyxmoadg)) {
            return u61.wkgbmnqykc.lqeggnwhkg.f112847iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97493draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97495wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(u61.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof u61.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((u61.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof u61.eablkybsjg.gxszxtbevo) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.C2305wkgbmnqykc.f97514iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof u61.eablkybsjg.wkgbmnqykc) {
            u61.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (u61.eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof u61.eablkybsjg.C2789eablkybsjg) {
            u61.eablkybsjg.C2789eablkybsjg c2789eablkybsjg = (u61.eablkybsjg.C2789eablkybsjg) eablkybsjgVar;
            Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(c2789eablkybsjg.iobyxmoadg(), c2789eablkybsjg.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, u61.eablkybsjg.iobyxmoadg.f112786iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, u61.eablkybsjg.zoijcleaow.f112792iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(this.f97494gtknphoqwx.eablkybsjg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
