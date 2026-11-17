package ka1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.FilterValue;
import ru.myspar.proloyalty.domain.feature.filtersall.store.State;
import ru.myspar.proloyalty.legacy.presentation.screen.filtersall.models.FilterValueUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n91.iobyxmoadg f54372btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final tg.draadjrbmk f54373draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f54374gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(d61.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, n91.iobyxmoadg colorsUiModelMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f54372btonecajqb = colorsUiModelMapper;
        this.f54374gtknphoqwx = new tg.draadjrbmk() { // from class: ka1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.crxdokpmqz(this.f54367zdlpuopuiu, (State) obj);
            }
        };
        this.f54373draadjrbmk = new tg.draadjrbmk() { // from class: ka1.zoijcleaow
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
        return new dxjokdxxww(titleFilterSection, isEnableApplyButton, arrayList, ppxfxbqfkfVar.f54372btonecajqb.iobyxmoadg(state.getColorsModel()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d61.ppxfxbqfkf ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.zoijcleaow.f54371iobyxmoadg)) {
            return d61.ppxfxbqfkf.zoijcleaow.f27112iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.iobyxmoadg.f54369iobyxmoadg)) {
            return d61.ppxfxbqfkf.iobyxmoadg.f27110iobyxmoadg;
        }
        if (nufgyqmvbuVar instanceof nufgyqmvbu.ppxfxbqfkf) {
            return new d61.ppxfxbqfkf.C0498ppxfxbqfkf(((nufgyqmvbu.ppxfxbqfkf) nufgyqmvbuVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final FilterValueUiModel sopmlzcsov(FilterValue filterValue, Set set) {
        return new FilterValueUiModel(filterValue.getId(), filterValue.getValue(), filterValue.getName(), set.contains(filterValue.getId()), filterValue.getDisabled());
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f54374gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f54373draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(d61.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, d61.wkgbmnqykc.iobyxmoadg.f27113iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
