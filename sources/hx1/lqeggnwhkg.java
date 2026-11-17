package hx1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.promo_collection.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f41274ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f41275zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f41275zoijcleaow = storeFactory;
        this.f41274ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, ((PromoCollectionPayload) gxszxtbevo()).getLandingPageId(), ((PromoCollectionPayload) gxszxtbevo()).getSpecialPromoBannerId(), ((PromoCollectionPayload) gxszxtbevo()).getColorModel(), null, null, 49, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f41275zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf.iobyxmoadg(((PromoCollectionPayload) gxszxtbevo()).getPromoCollectionInfoId())), this.f41274ppxfxbqfkf, new zoijcleaow());
    }
}
