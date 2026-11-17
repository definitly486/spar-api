package kp0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.CatalogArgs;
import ru.myspar.proloyalty.catalog.impl.pager.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f60311ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f60312wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f60311ppxfxbqfkf = storeFactory;
        this.f60312wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f60311ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f60313iobyxmoadg, ppxfxbqfkf.zoijcleaow.f60315iobyxmoadg, new ppxfxbqfkf.C1207ppxfxbqfkf(((CatalogArgs) gxszxtbevo()).eablkybsjg())), this.f60312wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, false, null, false, false, null, null, (CatalogArgs) gxszxtbevo(), 127, null);
    }
}
