package ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import oo1.eablkybsjg;
import oo1.lqeggnwhkg;
import q11.nufgyqmvbu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nufgyqmvbu f100551btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f100552draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final q41.iobyxmoadg f100553gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f100554wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, nufgyqmvbu measureTypeUtils, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f100551btonecajqb = measureTypeUtils;
        this.f100553gtknphoqwx = resourcesManager;
        this.f100552draadjrbmk = new draadjrbmk() { // from class: po1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.iobyxmoadg.sopmlzcsov(this.f77053zdlpuopuiu, (State) obj);
            }
        };
        this.f100554wflxmlrfwp = new draadjrbmk() { // from class: po1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oo1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f100570iobyxmoadg)) {
            return oo1.wkgbmnqykc.iobyxmoadg.f73341iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2419zoijcleaow.f100573iobyxmoadg)) {
            return oo1.wkgbmnqykc.zoijcleaow.f73344iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f100571iobyxmoadg)) {
            return oo1.wkgbmnqykc.ppxfxbqfkf.f73342iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f100572iobyxmoadg)) {
            return oo1.wkgbmnqykc.C1601wkgbmnqykc.f73343iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            return new oo1.wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final po1.nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new po1.nufgyqmvbu(state.getId(), state.getArticle(), state.getName(), state.getPictureUrl(), rn1.ppxfxbqfkf.iobyxmoadg(state.getQuantity(), state.getMeasure(), iobyxmoadgVar.f100553gtknphoqwx, iobyxmoadgVar.f100551btonecajqb), state.getQuantity(), rn1.ppxfxbqfkf.zoijcleaow(state.getPrice(), iobyxmoadgVar.f100553gtknphoqwx), rn1.ppxfxbqfkf.zoijcleaow(state.getPrice() * state.getQuantity(), iobyxmoadgVar.f100553gtknphoqwx), state.getMeasure(), state.getMarkCodes(), state.getWarningMessage(), null, false, state.getIsLoading(), 6144, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100552draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100554wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanMatrixPayload(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), null, 8, null)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f73305iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f100565iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.C1599eablkybsjg) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(((eablkybsjg.C1599eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz4 = cllcsxoeiz(new ppxfxbqfkf.C2418ppxfxbqfkf(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
