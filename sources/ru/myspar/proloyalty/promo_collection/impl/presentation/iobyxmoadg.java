package ru.myspar.proloyalty.promo_collection.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ni1.eablkybsjg;
import ni1.lqeggnwhkg;
import ni1.wkgbmnqykc;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.promo_collection.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final int f99484wflxmlrfwp = n91.iobyxmoadg.f69381iobyxmoadg;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n91.iobyxmoadg f99485btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99486draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f99487gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, n91.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f99485btonecajqb = colorsUiModelMapper;
        this.f99487gtknphoqwx = new draadjrbmk() { // from class: oi1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.promo_collection.impl.presentation.iobyxmoadg.sopmlzcsov(this.f72965zdlpuopuiu, (State) obj);
            }
        };
        this.f99486draadjrbmk = new draadjrbmk() { // from class: oi1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.promo_collection.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.promo_collection.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f99493iobyxmoadg)) {
            return wkgbmnqykc.iobyxmoadg.f70167iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2381zoijcleaow) {
            return new wkgbmnqykc.zoijcleaow(((zoijcleaow.C2381zoijcleaow) zoijcleaowVar).iobyxmoadg().getId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi1.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        String landingPageId = state.getLandingPageId();
        PromoCollectionInfo promoCollectionInfo = state.getPromoCollectionInfo();
        List promoCollectionItems = state.getPromoCollectionItems();
        ColorsModel colorsModel = state.getColorsModel();
        return new oi1.lqeggnwhkg(isLoading, landingPageId, promoCollectionInfo, promoCollectionItems, colorsModel != null ? iobyxmoadgVar.f99485btonecajqb.iobyxmoadg(colorsModel) : null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99487gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99486draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f70141iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.C2380ppxfxbqfkf(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f70142iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f99492iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
