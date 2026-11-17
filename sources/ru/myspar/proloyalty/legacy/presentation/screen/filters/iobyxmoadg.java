package ru.myspar.proloyalty.legacy.presentation.screen.filters;

import androidx.lifecycle.pkzmftpjix;
import c61.lqeggnwhkg;
import gg.wwaezpbzkn;
import ja1.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.filters.store.State;
import ru.myspar.proloyalty.domain.feature.filtersall.store.FiltersAllArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n91.iobyxmoadg f96996btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f96997draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96998gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, n91.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f96996btonecajqb = colorsUiModelMapper;
        this.f96998gtknphoqwx = new draadjrbmk() { // from class: ja1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.filters.iobyxmoadg.sopmlzcsov(this.f50937zdlpuopuiu, (State) obj);
            }
        };
        this.f96997draadjrbmk = new draadjrbmk() { // from class: ja1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.filters.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.filters.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c61.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        c61.wkgbmnqykc eablkybsjgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f97003iobyxmoadg)) {
            return c61.wkgbmnqykc.zoijcleaow.f19116iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f97000iobyxmoadg)) {
            return c61.wkgbmnqykc.iobyxmoadg.f19113iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2289ppxfxbqfkf.f97001iobyxmoadg)) {
            return c61.wkgbmnqykc.ppxfxbqfkf.f19114iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            eablkybsjgVar = new c61.wkgbmnqykc.C0347wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjgVar = new c61.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(iobyxmoadgVar.f96996btonecajqb.iobyxmoadg(state.getColorsModel()), state.getFilterSections(), state.getFilterValues(), state.getAmountProducts(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96998gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96997draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(c61.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof c61.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((c61.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, c61.eablkybsjg.iobyxmoadg.f19075iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!(eablkybsjgVar instanceof c61.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            c61.eablkybsjg.zoijcleaow zoijcleaowVar = (c61.eablkybsjg.zoijcleaow) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.filtersall.iobyxmoadg.zoijcleaow(new FiltersAllArgs(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
