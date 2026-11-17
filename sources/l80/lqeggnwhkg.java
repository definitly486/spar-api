package l80;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.specificrestaurantproduct.store.SpecificRestaurantProductArgs;
import ru.myspar.domain.feature.specificrestaurantproduct.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f61890ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f61891zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f61891zoijcleaow = storeFactory;
        this.f61890ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, ((SpecificRestaurantProductArgs) gxszxtbevo()).getPartnerCode(), ((SpecificRestaurantProductArgs) gxszxtbevo()).getArticle(), null, 0.0d, false, null, null, null, null, null, 2041, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f61891zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f61892iobyxmoadg), this.f61890ppxfxbqfkf, new zoijcleaow());
    }
}
