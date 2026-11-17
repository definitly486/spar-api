package zh1;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.State;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f129987ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f129988wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f129987ppxfxbqfkf = storeFactory;
        this.f129988wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return or0.zoijcleaow.wkgbmnqykc(this, this.f129987ppxfxbqfkf, state, null, this.f129988wkgbmnqykc, new zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        String productSetName = ((ProductSetCounterArgs) gxszxtbevo()).getProductSetName();
        int productsCount = ((ProductSetCounterArgs) gxszxtbevo()).getProductsCount();
        double sum = ((ProductSetCounterArgs) gxszxtbevo()).getSum();
        Double oldSum = ((ProductSetCounterArgs) gxszxtbevo()).getOldSum();
        Integer initialProductSetCount = ((ProductSetCounterArgs) gxszxtbevo()).getInitialProductSetCount();
        return new State(productSetName, productsCount, sum, oldSum, initialProductSetCount != null ? initialProductSetCount.intValue() : 1);
    }
}
