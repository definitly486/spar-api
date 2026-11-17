package v82;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.subscription.impl.detail.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f116387ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f116388zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f116388zoijcleaow = storeFactory;
        this.f116387ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((SubscriptionDetailPayload) gxszxtbevo()).getSubscriptionDetailId(), false, false, false, null, null, null, null, false, 510, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f116388zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f116389iobyxmoadg), this.f116387ppxfxbqfkf, new zoijcleaow());
    }
}
