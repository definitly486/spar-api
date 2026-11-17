package yh1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set.State;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f125230eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f125231ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f125232wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f125231ppxfxbqfkf = storeFactory;
        this.f125232wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f125231ppxfxbqfkf, state, new a8.wkgbmnqykc(new wkgbmnqykc.iobyxmoadg(((ProductsFromBannerScreenArgs) gxszxtbevo()).getBlockId(), ((ProductsFromBannerScreenArgs) gxszxtbevo()).getShopId(), ((ProductsFromBannerScreenArgs) gxszxtbevo()).getDeliveryType())), this.f125232wkgbmnqykc, new ppxfxbqfkf());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f125230eablkybsjg;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ProductsFromBannerScreenArgs) gxszxtbevo()).getBlockId(), false, null, null, false, null, null, null, null, null, null, null, false, false, false, false, 0, 131070, null);
    }
}
