package ru.myspar.purchases.impl.specific.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import qy1.dxjokdxxww;
import qy1.gtknphoqwx;
import qy1.nufgyqmvbu;
import ru.myspar.catalog.api.model.ProductPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qm.iobyxmoadg f102594btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f102595draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f102596gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f102597wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gtknphoqwx store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ty1.ppxfxbqfkf stateToUiModelMapper, qm.iobyxmoadg addressFeatureApi, lq.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f102594btonecajqb = addressFeatureApi;
        this.f102596gtknphoqwx = catalogFeatureApi;
        this.f102595draadjrbmk = stateToUiModelMapper;
        this.f102597wflxmlrfwp = new draadjrbmk() { // from class: ry1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.specific.presentation.iobyxmoadg.mbcevpiqjq((ru.myspar.purchases.impl.specific.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu mbcevpiqjq(ppxfxbqfkf ppxfxbqfkfVar) {
        nufgyqmvbu ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2481ppxfxbqfkf.f102604iobyxmoadg)) {
            return nufgyqmvbu.wkgbmnqykc.f81009iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg) {
            ppxfxbqfkfVar2 = new nufgyqmvbu.zoijcleaow(((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            ppxfxbqfkfVar2 = new nufgyqmvbu.eablkybsjg(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            ppxfxbqfkf.eablkybsjg eablkybsjgVar = (ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar;
            ppxfxbqfkfVar2 = new nufgyqmvbu.iobyxmoadg.C1805iobyxmoadg(eablkybsjgVar.iobyxmoadg(), eablkybsjgVar.zoijcleaow());
        } else {
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
                return nufgyqmvbu.iobyxmoadg.zoijcleaow.f81007iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
                ppxfxbqfkfVar2 = new nufgyqmvbu.ppxfxbqfkf(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg)) {
                    throw new NoWhenBranchMatchedException();
                }
                ppxfxbqfkf.lqeggnwhkg lqeggnwhkgVar = (ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar;
                ppxfxbqfkfVar2 = new nufgyqmvbu.iobyxmoadg.ppxfxbqfkf(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.zoijcleaow(), null);
            }
        }
        return ppxfxbqfkfVar2;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102595draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102597wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(dxjokdxxww dxjokdxxwwVar, gxszxtbevo gxszxtbevoVar) {
        if (dxjokdxxwwVar instanceof dxjokdxxww.eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((dxjokdxxww.eablkybsjg) dxjokdxxwwVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (dxjokdxxwwVar instanceof dxjokdxxww.nufgyqmvbu) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.eablkybsjg(((dxjokdxxww.nufgyqmvbu) dxjokdxxwwVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (dxjokdxxwwVar instanceof dxjokdxxww.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (dxjokdxxwwVar instanceof dxjokdxxww.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.purchases.impl.specific_success_retry.presentation.iobyxmoadg.zoijcleaow());
        } else {
            if (dxjokdxxwwVar instanceof dxjokdxxww.lqeggnwhkg) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.C2482wkgbmnqykc(((dxjokdxxww.lqeggnwhkg) dxjokdxxwwVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (dxjokdxxwwVar instanceof dxjokdxxww.wkgbmnqykc) {
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f102596gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(((dxjokdxxww.wkgbmnqykc) dxjokdxxwwVar).iobyxmoadg()), null, 2, null)));
            } else {
                if (!(dxjokdxxwwVar instanceof dxjokdxxww.ppxfxbqfkf)) {
                    if (dxjokdxxwwVar instanceof dxjokdxxww.gxszxtbevo) {
                        dxjokdxxww.gxszxtbevo gxszxtbevoVar2 = (dxjokdxxww.gxszxtbevo) dxjokdxxwwVar;
                        Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(gxszxtbevoVar2.zoijcleaow(), gxszxtbevoVar2.iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (!(dxjokdxxwwVar instanceof dxjokdxxww.C1803dxjokdxxww)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dxjokdxxww.C1803dxjokdxxww c1803dxjokdxxww = (dxjokdxxww.C1803dxjokdxxww) dxjokdxxwwVar;
                    Object objCllcsxoeiz5 = cllcsxoeiz(new wkgbmnqykc.lqeggnwhkg(c1803dxjokdxxww.iobyxmoadg(), c1803dxjokdxxww.zoijcleaow(), c1803dxjokdxxww.ppxfxbqfkf(), null), gxszxtbevoVar);
                    return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
                }
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f102594btonecajqb.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((dxjokdxxww.ppxfxbqfkf) dxjokdxxwwVar).iobyxmoadg())));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
