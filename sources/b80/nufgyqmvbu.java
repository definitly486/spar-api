package b80;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.domain.feature.review.store.ReviewProductArgs;
import ru.myspar.domain.feature.review.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f15488ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f15489zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f15489zoijcleaow = storeFactory;
        this.f15488ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        String productArticle = ((ReviewProductArgs) gxszxtbevo()).getProductArticle();
        String productName = ((ReviewProductArgs) gxszxtbevo()).getProductName();
        ColorsModel colorsModel = ((ReviewProductArgs) gxszxtbevo()).getColorsModel();
        Double productRating = ((ReviewProductArgs) gxszxtbevo()).getProductRating();
        return new State(productArticle, productName, colorsModel, productRating != null ? productRating.doubleValue() : 0.0d, 0, false, null, null, null, false, false, false, null, null, false, false, false, false, 262128, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f15489zoijcleaow, state, new a8.wkgbmnqykc(wkgbmnqykc.iobyxmoadg.f15490iobyxmoadg), this.f15488ppxfxbqfkf, new ppxfxbqfkf());
    }
}
