package ru.myspar.legacy.presentation.screen.filters;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kc0.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import r70.lqeggnwhkg;
import ru.myspar.domain.feature.filters.store.State;
import ru.myspar.domain.feature.filtersall.store.FiltersAllArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.iobyxmoadg f89208btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89209draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89210gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f89208btonecajqb = colorsUiModelMapper;
        this.f89210gtknphoqwx = new draadjrbmk() { // from class: kc0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.filters.iobyxmoadg.sopmlzcsov(this.f54445zdlpuopuiu, (State) obj);
            }
        };
        this.f89209draadjrbmk = new draadjrbmk() { // from class: kc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.filters.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.screen.filters.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r70.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        r70.wkgbmnqykc eablkybsjgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f89215iobyxmoadg)) {
            return r70.wkgbmnqykc.zoijcleaow.f82019iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89212iobyxmoadg)) {
            return r70.wkgbmnqykc.iobyxmoadg.f82016iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2044ppxfxbqfkf.f89213iobyxmoadg)) {
            return r70.wkgbmnqykc.ppxfxbqfkf.f82017iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            eablkybsjgVar = new r70.wkgbmnqykc.C1830wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjgVar = new r70.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(iobyxmoadgVar.f89208btonecajqb.iobyxmoadg(state.getColorsModel()), state.getFilterSections(), state.getFilterValues(), state.getAmountProducts(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89210gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89209draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(r70.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof r70.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((r70.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, r70.eablkybsjg.iobyxmoadg.f81978iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!(eablkybsjgVar instanceof r70.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            r70.eablkybsjg.zoijcleaow zoijcleaowVar = (r70.eablkybsjg.zoijcleaow) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.filtersall.iobyxmoadg.zoijcleaow(new FiltersAllArgs(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
