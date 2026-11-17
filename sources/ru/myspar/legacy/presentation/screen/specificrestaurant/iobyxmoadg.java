package ru.myspar.legacy.presentation.screen.specificrestaurant;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import k80.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zd0.iobyxmoadg f89862btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89863draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ro.iobyxmoadg f89864gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f89865wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, zd0.zoijcleaow stateToUiModelMapper, zd0.iobyxmoadg restaurantSectionToDomainMapper, ro.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(restaurantSectionToDomainMapper, "restaurantSectionToDomainMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f89862btonecajqb = restaurantSectionToDomainMapper;
        this.f89864gtknphoqwx = authFeatureApi;
        this.f89863draadjrbmk = stateToUiModelMapper;
        this.f89865wflxmlrfwp = new draadjrbmk() { // from class: xd0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.specificrestaurant.iobyxmoadg.mbcevpiqjq(this.f122153zdlpuopuiu, (ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k80.wkgbmnqykc mbcevpiqjq(iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar;
            return new k80.wkgbmnqykc.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            return new k80.wkgbmnqykc.C1166wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            return new k80.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.nufgyqmvbu) {
            return new k80.wkgbmnqykc.nufgyqmvbu(iobyxmoadgVar.f89862btonecajqb.invoke(((ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg()));
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89871iobyxmoadg)) {
            return k80.wkgbmnqykc.iobyxmoadg.f54183iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2064ppxfxbqfkf.f89874iobyxmoadg)) {
            return k80.wkgbmnqykc.ppxfxbqfkf.f54186iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f89870iobyxmoadg)) {
            return k80.wkgbmnqykc.gxszxtbevo.f54182iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.lqeggnwhkg.f89872iobyxmoadg)) {
            return k80.wkgbmnqykc.lqeggnwhkg.f54184iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89863draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89865wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(k80.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof k80.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((k80.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof k80.eablkybsjg.gxszxtbevo) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.C2065wkgbmnqykc.f89884iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof k80.eablkybsjg.wkgbmnqykc) {
            k80.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (k80.eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof k80.eablkybsjg.C1162eablkybsjg) {
            k80.eablkybsjg.C1162eablkybsjg c1162eablkybsjg = (k80.eablkybsjg.C1162eablkybsjg) eablkybsjgVar;
            Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(c1162eablkybsjg.iobyxmoadg(), c1162eablkybsjg.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, k80.eablkybsjg.iobyxmoadg.f54123iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, k80.eablkybsjg.zoijcleaow.f54129iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(this.f89864gtknphoqwx.ppxfxbqfkf(new NonAuthorizedPayload(null, null, 3, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
