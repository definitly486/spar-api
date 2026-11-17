package ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import k70.eablkybsjg;
import k70.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final bb0.iobyxmoadg f88577btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f88578draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f88579gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, bb0.iobyxmoadg comboSetProductToUiMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(comboSetProductToUiMapper, "comboSetProductToUiMapper");
        this.f88577btonecajqb = comboSetProductToUiMapper;
        this.f88579gtknphoqwx = new draadjrbmk() { // from class: za0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.iobyxmoadg.sopmlzcsov(this.f129444zdlpuopuiu, (State) obj);
            }
        };
        this.f88578draadjrbmk = new draadjrbmk() { // from class: za0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k70.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        k70.wkgbmnqykc c1161wkgbmnqykc;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f88595iobyxmoadg)) {
            return k70.wkgbmnqykc.iobyxmoadg.f54110iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2032zoijcleaow.f88598iobyxmoadg)) {
            return k70.wkgbmnqykc.zoijcleaow.f54113iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            c1161wkgbmnqykc = new k70.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            c1161wkgbmnqykc = new k70.wkgbmnqykc.C1161wkgbmnqykc(((zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
        }
        return c1161wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za0.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new za0.lqeggnwhkg(iobyxmoadgVar.f88577btonecajqb.invoke(state.getSelectedProductFirst().getArticle(), state.getProductsFirst()), iobyxmoadgVar.f88577btonecajqb.invoke(state.getSelectedProductSecond().getArticle(), state.getProductsSecond()));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f88579gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f88578draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f54104iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f88584iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
