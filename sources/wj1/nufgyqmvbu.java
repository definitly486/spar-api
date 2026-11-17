package wj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.proloyalty.purchases.impl.specific.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f120021ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f120022wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f120021ppxfxbqfkf = storeFactory;
        this.f120022wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f120021ppxfxbqfkf, state, new a8.wkgbmnqykc(wkgbmnqykc.iobyxmoadg.f120023iobyxmoadg), this.f120022wkgbmnqykc, new ppxfxbqfkf());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State((SpecificPurchaseArgs) gxszxtbevo(), null, null, null, false, null, 62, null);
    }
}
