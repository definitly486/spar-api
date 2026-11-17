package m61;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.domain.feature.review.store.ReviewProductArgs;
import ru.myspar.proloyalty.domain.feature.review.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f66233ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f66234wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f66233ppxfxbqfkf = storeFactory;
        this.f66234wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f66233ppxfxbqfkf, state, new a8.wkgbmnqykc(wkgbmnqykc.iobyxmoadg.f66235iobyxmoadg), this.f66234wkgbmnqykc, new ppxfxbqfkf());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        String productArticle = ((ReviewProductArgs) gxszxtbevo()).getProductArticle();
        String productName = ((ReviewProductArgs) gxszxtbevo()).getProductName();
        ColorsModel colorsModel = ((ReviewProductArgs) gxszxtbevo()).getColorsModel();
        Double productRating = ((ReviewProductArgs) gxszxtbevo()).getProductRating();
        return new State(productArticle, productName, colorsModel, productRating != null ? productRating.doubleValue() : 0.0d, 0, false, null, null, null, false, false, false, null, null, false, false, false, false, 262128, null);
    }
}
