package ru.myspar.scango.impl.screens.amountproduct.partial.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import k30.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.scango.impl.screens.amountproduct.partial.domain.store.State;
import s22.eablkybsjg;
import s22.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nufgyqmvbu f103207btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f103208draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final d60.iobyxmoadg f103209gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f103210wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, nufgyqmvbu measureTypeUtils, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f103207btonecajqb = measureTypeUtils;
        this.f103209gtknphoqwx = resourcesManager;
        this.f103208draadjrbmk = new draadjrbmk() { // from class: t22.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.amountproduct.partial.presentation.iobyxmoadg.sopmlzcsov(this.f109338zdlpuopuiu, (State) obj);
            }
        };
        this.f103210wflxmlrfwp = new draadjrbmk() { // from class: t22.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.amountproduct.partial.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.scango.impl.screens.amountproduct.partial.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s22.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f103226iobyxmoadg)) {
            return s22.wkgbmnqykc.iobyxmoadg.f105260iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2498zoijcleaow.f103229iobyxmoadg)) {
            return s22.wkgbmnqykc.zoijcleaow.f105263iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f103227iobyxmoadg)) {
            return s22.wkgbmnqykc.ppxfxbqfkf.f105261iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f103228iobyxmoadg)) {
            return s22.wkgbmnqykc.C2562wkgbmnqykc.f105262iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            return new s22.wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t22.nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new t22.nufgyqmvbu(state.getId(), state.getArticle(), state.getName(), state.getPictureUrl(), v12.ppxfxbqfkf.iobyxmoadg(state.getQuantity(), state.getMeasure(), iobyxmoadgVar.f103209gtknphoqwx, iobyxmoadgVar.f103207btonecajqb), state.getQuantity(), v12.ppxfxbqfkf.zoijcleaow(state.getPrice(), iobyxmoadgVar.f103209gtknphoqwx), v12.ppxfxbqfkf.zoijcleaow(state.getPrice() * state.getQuantity(), iobyxmoadgVar.f103209gtknphoqwx), state.getMeasure(), state.getMarkCodes(), state.getWarningMessage(), null, false, state.getIsLoading(), 6144, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f103208draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f103210wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanMatrixPayload(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), null, 8, null)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f105224iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f103221iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.C2560eablkybsjg) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(((eablkybsjg.C2560eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz4 = cllcsxoeiz(new ppxfxbqfkf.C2497ppxfxbqfkf(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
