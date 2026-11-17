package uz1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.feedback.api.models.FeedbackArgs;
import ru.myspar.rate.feedback.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f114909ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f114910zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f114910zoijcleaow = storeFactory;
        this.f114909ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        String shopAddress = ((FeedbackArgs) gxszxtbevo()).getShopAddress();
        if (shopAddress == null) {
            shopAddress = "";
        }
        return new State(null, false, null, null, null, shopAddress, false, false, false, 479, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f114910zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f114911iobyxmoadg), this.f114909ppxfxbqfkf, new zoijcleaow());
    }
}
