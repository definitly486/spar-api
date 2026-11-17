package yq;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.CatalogArgs;
import ru.myspar.catalog.impl.pager.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f126240ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f126241zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f126241zoijcleaow = storeFactory;
        this.f126240ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, false, null, false, false, null, null, (CatalogArgs) gxszxtbevo(), 127, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f126241zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f126242iobyxmoadg, ppxfxbqfkf.zoijcleaow.f126244iobyxmoadg, new ppxfxbqfkf.C3216ppxfxbqfkf(((CatalogArgs) gxszxtbevo()).eablkybsjg())), this.f126240ppxfxbqfkf, new zoijcleaow());
    }
}
