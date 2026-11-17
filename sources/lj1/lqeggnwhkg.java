package lj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.api.model.PurchasesListDetailsArgs;
import ru.myspar.proloyalty.purchases.impl.list_details.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f62822eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f62823ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f62824wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f62823ppxfxbqfkf = storeFactory;
        this.f62824wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f62823ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f62825iobyxmoadg), this.f62824wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f62822eablkybsjg;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State((PurchasesListDetailsArgs) gxszxtbevo(), null, 0.0d, 0, null, null, null, null, false, false, false, null, 4094, null);
    }
}
