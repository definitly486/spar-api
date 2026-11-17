package jk0;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.State;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f51625ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f51626zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f51626zoijcleaow = storeFactory;
        this.f51625ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        String productSetName = ((ProductSetCounterArgs) gxszxtbevo()).getProductSetName();
        int productsCount = ((ProductSetCounterArgs) gxszxtbevo()).getProductsCount();
        double sum = ((ProductSetCounterArgs) gxszxtbevo()).getSum();
        Double oldSum = ((ProductSetCounterArgs) gxszxtbevo()).getOldSum();
        Integer initialProductSetCount = ((ProductSetCounterArgs) gxszxtbevo()).getInitialProductSetCount();
        return new State(productSetName, productsCount, sum, oldSum, initialProductSetCount != null ? initialProductSetCount.intValue() : 1);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return vs.zoijcleaow.wkgbmnqykc(this, this.f51626zoijcleaow, state, null, this.f51625ppxfxbqfkf, new zoijcleaow(), 2, null);
    }
}
