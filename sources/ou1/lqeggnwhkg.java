package ou1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.proloyalty.subscription.impl.detail.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f74788ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f74789wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f74788ppxfxbqfkf = storeFactory;
        this.f74789wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f74788ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f74790iobyxmoadg), this.f74789wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((SubscriptionDetailPayload) gxszxtbevo()).getSubscriptionDetailId(), false, false, false, null, null, null, null, false, 510, null);
    }
}
