package fr;

import hr.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.impl.product_list.domain.State;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f34711ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f34712zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f34712zoijcleaow = storeFactory;
        this.f34711ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        ProductListPayload productListPayload = (ProductListPayload) gxszxtbevo();
        String brandId = ((ProductListPayload) gxszxtbevo()).getBrandId();
        return new State(productListPayload, (brandId == null || brandId.length() == 0) ? vdvldrhtss.iobyxmoadg.DEFAULT : vdvldrhtss.iobyxmoadg.BRAND, false, false, false, null, null, ((ProductListPayload) gxszxtbevo()).getSectionId(), null, null, null, null, v00.wkgbmnqykc.ppxfxbqfkf(((ProductListPayload) gxszxtbevo()).getSelectedSort()), false, null, false, null, null, 257916, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f34712zoijcleaow, state, new a8.wkgbmnqykc(wkgbmnqykc.zoijcleaow.f34718iobyxmoadg, wkgbmnqykc.iobyxmoadg.f34715iobyxmoadg, wkgbmnqykc.C0770wkgbmnqykc.f34717iobyxmoadg, wkgbmnqykc.gxszxtbevo.f34714iobyxmoadg, wkgbmnqykc.eablkybsjg.f34713iobyxmoadg, wkgbmnqykc.ppxfxbqfkf.f34716iobyxmoadg), this.f34711ppxfxbqfkf, new ppxfxbqfkf());
    }
}
