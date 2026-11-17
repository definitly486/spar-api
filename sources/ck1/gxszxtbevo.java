package ck1;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.specific_success_retry.domain.store.SpecificPurchaseSuccessRetryStore$State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f19959ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f19960wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f19959ppxfxbqfkf = storeFactory;
        this.f19960wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(SpecificPurchaseSuccessRetryStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return or0.zoijcleaow.wkgbmnqykc(this, this.f19959ppxfxbqfkf, state, null, this.f19960wkgbmnqykc, new zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public SpecificPurchaseSuccessRetryStore$State btonecajqb() {
        return SpecificPurchaseSuccessRetryStore$State.f99917zdlpuopuiu;
    }
}
