package rq0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.catalog.impl.subcatalog.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f83651ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f83652wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f83651ppxfxbqfkf = storeFactory;
        this.f83652wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f83651ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f83653iobyxmoadg, new ppxfxbqfkf.zoijcleaow(((SubCatalogArgs) gxszxtbevo()).lqeggnwhkg())), this.f83652wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State((SubCatalogArgs) gxszxtbevo(), null, null, null, false, false, null, null, 254, null);
    }
}
