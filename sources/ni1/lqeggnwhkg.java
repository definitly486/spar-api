package ni1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.proloyalty.promo_collection.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f70164ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f70165wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f70164ppxfxbqfkf = storeFactory;
        this.f70165wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f70164ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf.iobyxmoadg(((PromoCollectionPayload) gxszxtbevo()).getPromoCollectionInfoId())), this.f70165wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, ((PromoCollectionPayload) gxszxtbevo()).getLandingPageId(), ((PromoCollectionPayload) gxszxtbevo()).getSpecialPromoBannerId(), ((PromoCollectionPayload) gxszxtbevo()).getColorModel(), null, null, 49, null);
    }
}
