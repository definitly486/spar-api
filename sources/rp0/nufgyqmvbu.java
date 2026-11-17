package rp0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.State;
import tp0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f83392eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f83393ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f83394wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f83393ppxfxbqfkf = storeFactory;
        this.f83394wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f83393ppxfxbqfkf, state, new a8.wkgbmnqykc(wkgbmnqykc.zoijcleaow.f83400iobyxmoadg, wkgbmnqykc.iobyxmoadg.f83397iobyxmoadg, wkgbmnqykc.gxszxtbevo.f83396iobyxmoadg, wkgbmnqykc.eablkybsjg.f83395iobyxmoadg, wkgbmnqykc.ppxfxbqfkf.f83398iobyxmoadg, wkgbmnqykc.C1871wkgbmnqykc.f83399iobyxmoadg), this.f83394wkgbmnqykc, new ppxfxbqfkf());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f83392eablkybsjg;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        ProductListPayload productListPayload = (ProductListPayload) gxszxtbevo();
        String brandId = ((ProductListPayload) gxszxtbevo()).getBrandId();
        return new State(productListPayload, (brandId == null || brandId.length() == 0) ? rgvfuqvkyq.iobyxmoadg.DEFAULT : rgvfuqvkyq.iobyxmoadg.BRAND, false, false, false, null, null, ((ProductListPayload) gxszxtbevo()).getSectionId(), null, null, null, null, mz0.wkgbmnqykc.ppxfxbqfkf(((ProductListPayload) gxszxtbevo()).getSelectedSort()), false, null, false, null, null, null, 520060, null);
    }
}
