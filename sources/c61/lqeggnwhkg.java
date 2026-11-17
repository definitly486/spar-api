package c61;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.filters.store.FiltersArgs;
import ru.myspar.proloyalty.domain.feature.filters.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f19108ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f19109wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f19108ppxfxbqfkf = storeFactory;
        this.f19109wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f19108ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f19110iobyxmoadg, ppxfxbqfkf.zoijcleaow.f19111iobyxmoadg), this.f19109wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        String query = ((FiltersArgs) gxszxtbevo()).getQuery();
        String selectionId = ((FiltersArgs) gxszxtbevo()).getSelectionId();
        List filters = ((FiltersArgs) gxszxtbevo()).getFilters();
        if (filters == null) {
            filters = jyumaefscl.wflxmlrfwp();
        }
        return new State(query, selectionId, ((FiltersArgs) gxszxtbevo()).getSectionId(), ((FiltersArgs) gxszxtbevo()).getBrandId(), filters, ((FiltersArgs) gxszxtbevo()).getColorsModel(), null, 0, false, 448, null);
    }
}
