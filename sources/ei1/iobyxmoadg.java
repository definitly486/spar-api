package ei1;

import di1.gxszxtbevo;
import jr0.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.State;
import tg.draadjrbmk;
import zy0.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f31390zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final C0668iobyxmoadg f31389yggfygwlhe = new C0668iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final int f31388jyumaefscl = 8;

    /* JADX INFO: renamed from: ei1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0668iobyxmoadg {
        public /* synthetic */ C0668iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0668iobyxmoadg() {
        }
    }

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f31390zdlpuopuiu = resourcesManager;
    }

    private final Price iobyxmoadg(Double d13, double d14, int i13) {
        if (d13 != null) {
            d14 = d13.doubleValue();
        }
        return ppxfxbqfkf(wkgbmnqykc.gxszxtbevo(d14, i13, null, 2, null), 1);
    }

    private final Price ppxfxbqfkf(double d13, int i13) {
        return ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, d13, i13, false, 4, null);
    }

    private final Price zoijcleaow(double d13, int i13) {
        return ppxfxbqfkf(wkgbmnqykc.gxszxtbevo(d13, i13, null, 2, null), 2);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        String strNufgyqmvbu = this.f31390zdlpuopuiu.nufgyqmvbu(zoijcleaow.plural_products, state.getProductsCount(), String.valueOf(state.getProductsCount()));
        String strNufgyqmvbu2 = this.f31390zdlpuopuiu.nufgyqmvbu(zoijcleaow.plural_product_set, state.getProductSetCount(), String.valueOf(state.getProductSetCount()));
        Price priceZoijcleaow = zoijcleaow(state.getSum(), state.getProductSetCount());
        return new gxszxtbevo(state.getProductSetName(), strNufgyqmvbu, priceZoijcleaow.getPrice(), priceZoijcleaow.getPriceFractional(), iobyxmoadg(state.getOldSum(), state.getSum(), state.getProductSetCount()).eablkybsjg(), strNufgyqmvbu2, state.getProductSetCount() > 1, true);
    }
}
