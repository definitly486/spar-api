package cs;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.catalog.impl.subcatalog.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f25628ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f25629zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f25629zoijcleaow = storeFactory;
        this.f25628ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State((SubCatalogArgs) gxszxtbevo(), null, null, null, false, false, null, null, 254, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f25629zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f25630iobyxmoadg, new ppxfxbqfkf.zoijcleaow(((SubCatalogArgs) gxszxtbevo()).lqeggnwhkg())), this.f25628ppxfxbqfkf, new zoijcleaow());
    }
}
