package qy1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.purchases.impl.specific.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f80993ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f80994zoijcleaow;

    public gtknphoqwx(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f80994zoijcleaow = storeFactory;
        this.f80993ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State((SpecificPurchaseArgs) gxszxtbevo(), null, null, null, false, null, 62, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f80994zoijcleaow, state, new a8.wkgbmnqykc(lqeggnwhkg.iobyxmoadg.f81001iobyxmoadg), this.f80993ppxfxbqfkf, new gxszxtbevo());
    }
}
