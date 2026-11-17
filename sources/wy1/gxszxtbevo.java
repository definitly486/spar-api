package wy1;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.specific_success_retry.domain.store.SpecificPurchaseSuccessRetryStore$State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f120731ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f120732zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f120732zoijcleaow = storeFactory;
        this.f120731ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public SpecificPurchaseSuccessRetryStore$State dxjokdxxww() {
        return SpecificPurchaseSuccessRetryStore$State.f102635zdlpuopuiu;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(SpecificPurchaseSuccessRetryStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return vs.zoijcleaow.wkgbmnqykc(this, this.f120732zoijcleaow, state, null, this.f120731ppxfxbqfkf, new zoijcleaow(), 2, null);
    }
}
