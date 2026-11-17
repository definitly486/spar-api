package ll1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.feedback.api.models.FeedbackArgs;
import ru.myspar.proloyalty.rate.feedback.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f63394ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f63395wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f63394ppxfxbqfkf = storeFactory;
        this.f63395wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f63394ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f63396iobyxmoadg), this.f63395wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        String shopAddress = ((FeedbackArgs) gxszxtbevo()).getShopAddress();
        if (shopAddress == null) {
            shopAddress = "";
        }
        return new State(null, false, null, null, null, shopAddress, false, false, false, 479, null);
    }
}
