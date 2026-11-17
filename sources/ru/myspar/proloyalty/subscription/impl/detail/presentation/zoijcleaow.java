package ru.myspar.proloyalty.subscription.impl.detail.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import ou1.eablkybsjg;
import ou1.lqeggnwhkg;
import ru.myspar.proloyalty.subscription.impl.detail.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final rg1.iobyxmoadg f101783btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f101784draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final an0.iobyxmoadg f101785gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f101786wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, rg1.iobyxmoadg paymentFeatureApi, an0.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f101783btonecajqb = paymentFeatureApi;
        this.f101785gtknphoqwx = authFeatureApi;
        this.f101784draadjrbmk = new draadjrbmk() { // from class: pu1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.subscription.impl.detail.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f101786wflxmlrfwp = new draadjrbmk() { // from class: pu1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.subscription.impl.detail.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.subscription.impl.detail.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ou1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ou1.wkgbmnqykc dxjokdxxwwVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f101774iobyxmoadg)) {
            return ou1.wkgbmnqykc.iobyxmoadg.f74797iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f101780iobyxmoadg)) {
            return ou1.wkgbmnqykc.zoijcleaow.f74803iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            ppxfxbqfkf.wkgbmnqykc wkgbmnqykcVar = (ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar;
            dxjokdxxwwVar = new ou1.wkgbmnqykc.C1627wkgbmnqykc(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx) {
            dxjokdxxwwVar = new ou1.wkgbmnqykc.gtknphoqwx(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb) {
                return ou1.wkgbmnqykc.btonecajqb.f74791iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
                return ou1.wkgbmnqykc.gxszxtbevo.f74796iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                return ou1.wkgbmnqykc.lqeggnwhkg.f74798iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
                return ou1.wkgbmnqykc.draadjrbmk.f74792iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2444ppxfxbqfkf) {
                dxjokdxxwwVar = new ou1.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2444ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.dxjokdxxww)) {
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f101776iobyxmoadg)) {
                        return ou1.wkgbmnqykc.nufgyqmvbu.f74799iobyxmoadg;
                    }
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f101771iobyxmoadg)) {
                        return ou1.wkgbmnqykc.eablkybsjg.f74794iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                dxjokdxxwwVar = new ou1.wkgbmnqykc.dxjokdxxww(((ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar).iobyxmoadg());
            }
        }
        return dxjokdxxwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pu1.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return su1.iobyxmoadg.nufgyqmvbu(state);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101784draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101786wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f74742iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.C1624eablkybsjg) {
                Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.C1624eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101783btonecajqb.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f74745iobyxmoadg)) {
                    if (!(eablkybsjgVar instanceof eablkybsjg.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101785gtknphoqwx.eablkybsjg());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
