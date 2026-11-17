package ok0;

import h00.zoijcleaow;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import nk0.gxszxtbevo;
import qs.eablkybsjg;
import rt.ppxfxbqfkf;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f73013zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final C1590iobyxmoadg f73012yggfygwlhe = new C1590iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final int f73011jyumaefscl = 8;

    /* JADX INFO: renamed from: ok0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1590iobyxmoadg {
        public /* synthetic */ C1590iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1590iobyxmoadg() {
        }
    }

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f73013zdlpuopuiu = resourcesManager;
    }

    private final Price iobyxmoadg(Double d13, double d14, int i13) {
        if (d13 != null) {
            d14 = d13.doubleValue();
        }
        return ppxfxbqfkf(eablkybsjg.gxszxtbevo(d14, i13, null, 2, null), 1);
    }

    private final Price ppxfxbqfkf(double d13, int i13) {
        return ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f83717iobyxmoadg, d13, i13, false, 4, null);
    }

    private final Price zoijcleaow(double d13, int i13) {
        return ppxfxbqfkf(eablkybsjg.gxszxtbevo(d13, i13, null, 2, null), 2);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        String strNufgyqmvbu = this.f73013zdlpuopuiu.nufgyqmvbu(zoijcleaow.plural_products, state.getProductsCount(), String.valueOf(state.getProductsCount()));
        String strNufgyqmvbu2 = this.f73013zdlpuopuiu.nufgyqmvbu(zoijcleaow.plural_product_set, state.getProductSetCount(), String.valueOf(state.getProductSetCount()));
        Price priceZoijcleaow = zoijcleaow(state.getSum(), state.getProductSetCount());
        return new gxszxtbevo(state.getProductSetName(), strNufgyqmvbu, priceZoijcleaow.getPrice(), priceZoijcleaow.getPriceFractional(), iobyxmoadg(state.getOldSum(), state.getSum(), state.getProductSetCount()).eablkybsjg(), strNufgyqmvbu2, state.getProductSetCount() > 1, true);
    }
}
