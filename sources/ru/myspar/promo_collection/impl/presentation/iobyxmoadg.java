package ru.myspar.promo_collection.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hx1.eablkybsjg;
import hx1.lqeggnwhkg;
import hx1.wkgbmnqykc;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.promo_collection.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final int f102192wflxmlrfwp = ob0.iobyxmoadg.f72536iobyxmoadg;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.iobyxmoadg f102193btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f102194draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102195gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f102193btonecajqb = colorsUiModelMapper;
        this.f102195gtknphoqwx = new draadjrbmk() { // from class: ix1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.promo_collection.impl.presentation.iobyxmoadg.sopmlzcsov(this.f49969zdlpuopuiu, (State) obj);
            }
        };
        this.f102194draadjrbmk = new draadjrbmk() { // from class: ix1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.promo_collection.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.promo_collection.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f102201iobyxmoadg)) {
            return wkgbmnqykc.iobyxmoadg.f41277iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2463zoijcleaow) {
            return new wkgbmnqykc.zoijcleaow(((zoijcleaow.C2463zoijcleaow) zoijcleaowVar).iobyxmoadg().getId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ix1.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        String landingPageId = state.getLandingPageId();
        PromoCollectionInfo promoCollectionInfo = state.getPromoCollectionInfo();
        List promoCollectionItems = state.getPromoCollectionItems();
        ColorsModel colorsModel = state.getColorsModel();
        return new ix1.lqeggnwhkg(isLoading, landingPageId, promoCollectionInfo, promoCollectionItems, colorsModel != null ? iobyxmoadgVar.f102193btonecajqb.iobyxmoadg(colorsModel) : null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102195gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102194draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f41251iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.C2462ppxfxbqfkf(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f41252iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f102200iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
