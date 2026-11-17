package lc0;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.FilterValue;
import ru.myspar.domain.feature.filtersall.store.State;
import ru.myspar.legacy.presentation.screen.filtersall.models.FilterValueUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.iobyxmoadg f62064btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final tg.draadjrbmk f62065draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f62066gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(s70.gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f62064btonecajqb = colorsUiModelMapper;
        this.f62066gtknphoqwx = new tg.draadjrbmk() { // from class: lc0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.crxdokpmqz(this.f62059zdlpuopuiu, (State) obj);
            }
        };
        this.f62065draadjrbmk = new tg.draadjrbmk() { // from class: lc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((nufgyqmvbu) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww crxdokpmqz(ppxfxbqfkf ppxfxbqfkfVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        String titleFilterSection = state.getTitleFilterSection();
        boolean isEnableApplyButton = state.getIsEnableApplyButton();
        List filterValues = state.getFilterValues();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterValues, 10));
        Iterator it = filterValues.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkfVar.sopmlzcsov((FilterValue) it.next(), state.getCheckedFilterIds()));
        }
        return new dxjokdxxww(titleFilterSection, isEnableApplyButton, arrayList, ppxfxbqfkfVar.f62064btonecajqb.iobyxmoadg(state.getColorsModel()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s70.ppxfxbqfkf ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.zoijcleaow.f62063iobyxmoadg)) {
            return s70.ppxfxbqfkf.zoijcleaow.f105644iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.iobyxmoadg.f62061iobyxmoadg)) {
            return s70.ppxfxbqfkf.iobyxmoadg.f105642iobyxmoadg;
        }
        if (nufgyqmvbuVar instanceof nufgyqmvbu.ppxfxbqfkf) {
            return new s70.ppxfxbqfkf.C2572ppxfxbqfkf(((nufgyqmvbu.ppxfxbqfkf) nufgyqmvbuVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final FilterValueUiModel sopmlzcsov(FilterValue filterValue, Set set) {
        return new FilterValueUiModel(filterValue.getId(), filterValue.getValue(), filterValue.getName(), set.contains(filterValue.getId()), filterValue.getDisabled());
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f62066gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f62065draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(s70.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, s70.wkgbmnqykc.iobyxmoadg.f105645iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
