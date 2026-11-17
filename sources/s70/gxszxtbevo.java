package s70;

import a8.lqeggnwhkg;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.FilterSection;
import ru.myspar.core.domain.models.product.FilterValue;
import ru.myspar.domain.feature.filtersall.store.FiltersAllArgs;
import ru.myspar.domain.feature.filtersall.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f105632ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f105633zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f105633zoijcleaow = storeFactory;
        this.f105632ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        FilterSection filterSection = ((FiltersAllArgs) gxszxtbevo()).getFilterSection();
        List<FilterValue> filterValues = ((FiltersAllArgs) gxszxtbevo()).getFilterSection().getFilterValues();
        ArrayList arrayList = new ArrayList();
        for (FilterValue filterValue : filterValues) {
            if (!filterValue.getChecked()) {
                filterValue = null;
            }
            String id2 = filterValue != null ? filterValue.getId() : null;
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        Set setR = jyumaefscl.r(arrayList);
        return new State((FiltersAllArgs) gxszxtbevo(), filterSection.getName(), !setR.isEmpty(), filterSection.getFilterValues(), setR, ((FiltersAllArgs) gxszxtbevo()).getColorsModel());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return vs.zoijcleaow.wkgbmnqykc(this, this.f105633zoijcleaow, state, null, this.f105632ppxfxbqfkf, new zoijcleaow(), 2, null);
    }
}
