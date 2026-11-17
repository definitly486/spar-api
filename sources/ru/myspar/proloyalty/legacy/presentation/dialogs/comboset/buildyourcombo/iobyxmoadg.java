package ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.State;
import tg.draadjrbmk;
import z51.eablkybsjg;
import z51.lqeggnwhkg;
import z81.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final b91.iobyxmoadg f96378btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f96379draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96380gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, b91.iobyxmoadg comboSetProductToUiMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(comboSetProductToUiMapper, "comboSetProductToUiMapper");
        this.f96378btonecajqb = comboSetProductToUiMapper;
        this.f96380gtknphoqwx = new draadjrbmk() { // from class: z81.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.iobyxmoadg.sopmlzcsov(this.f129335zdlpuopuiu, (State) obj);
            }
        };
        this.f96379draadjrbmk = new draadjrbmk() { // from class: z81.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z51.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        z51.wkgbmnqykc c3276wkgbmnqykc;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f96402iobyxmoadg)) {
            return z51.wkgbmnqykc.iobyxmoadg.f129138iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2277zoijcleaow.f96405iobyxmoadg)) {
            return z51.wkgbmnqykc.zoijcleaow.f129141iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            c3276wkgbmnqykc = new z51.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            c3276wkgbmnqykc = new z51.wkgbmnqykc.C3276wkgbmnqykc(((zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
        }
        return c3276wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getComboSet().getName(), state.getComboSet().getDescription(), iobyxmoadgVar.f96378btonecajqb.invoke(state.getSelectedProductFirst().getArticle(), state.getComboSet().getProductsFirst()), state.getComboSet().getProductsFirstHint(), iobyxmoadgVar.f96378btonecajqb.invoke(state.getSelectedProductSecond().getArticle(), state.getComboSet().getProductsSecond()), state.getComboSet().getProductsSecondHint(), state.getComboSet().getPrice(), jr0.wkgbmnqykc.nufgyqmvbu(state.getSelectedProductFirst().getPrice(), state.getSelectedProductSecond().getPrice(), null, 2, null));
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96380gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96379draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f129132iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f96385iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
