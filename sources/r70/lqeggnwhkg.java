package r70;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.filters.store.FiltersArgs;
import ru.myspar.domain.feature.filters.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f82011ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f82012zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f82012zoijcleaow = storeFactory;
        this.f82011ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        String query = ((FiltersArgs) gxszxtbevo()).getQuery();
        String selectionId = ((FiltersArgs) gxszxtbevo()).getSelectionId();
        List filters = ((FiltersArgs) gxszxtbevo()).getFilters();
        if (filters == null) {
            filters = jyumaefscl.wflxmlrfwp();
        }
        return new State(query, selectionId, ((FiltersArgs) gxszxtbevo()).getSectionId(), ((FiltersArgs) gxszxtbevo()).getBrandId(), filters, ((FiltersArgs) gxszxtbevo()).getColorsModel(), null, 0, false, 448, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f82012zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f82013iobyxmoadg, ppxfxbqfkf.zoijcleaow.f82014iobyxmoadg), this.f82011ppxfxbqfkf, new zoijcleaow());
    }
}
