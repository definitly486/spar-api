package d61;

import a8.lqeggnwhkg;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;
import ru.myspar.proloyalty.core.domain.models.product.FilterValue;
import ru.myspar.proloyalty.domain.feature.filtersall.store.FiltersAllArgs;
import ru.myspar.proloyalty.domain.feature.filtersall.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f27100ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f27101wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f27100ppxfxbqfkf = storeFactory;
        this.f27101wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return or0.zoijcleaow.wkgbmnqykc(this, this.f27100ppxfxbqfkf, state, null, this.f27101wkgbmnqykc, new zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
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
}
