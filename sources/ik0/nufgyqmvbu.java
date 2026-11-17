package ik0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.products_from_banner.impl.domain.product_set.State;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f44652ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f44653zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f44653zoijcleaow = storeFactory;
        this.f44652ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ProductsFromBannerScreenArgs) gxszxtbevo()).getBlockId(), false, null, null, false, null, null, null, null, null, null, null, false, false, false, false, 0, 131070, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f44653zoijcleaow, state, new a8.wkgbmnqykc(new wkgbmnqykc.iobyxmoadg(((ProductsFromBannerScreenArgs) gxszxtbevo()).getBlockId(), ((ProductsFromBannerScreenArgs) gxszxtbevo()).getShopId(), ((ProductsFromBannerScreenArgs) gxszxtbevo()).getDeliveryType())), this.f44652ppxfxbqfkf, new ppxfxbqfkf());
    }
}
