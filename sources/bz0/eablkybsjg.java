package bz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {
    private final int ppxfxbqfkf() {
        return zy0.ppxfxbqfkf.proloyalty_title_product_not_available;
    }

    private final int zoijcleaow() {
        return zy0.ppxfxbqfkf.proloyalty_add_to_cart;
    }

    public final boolean eablkybsjg(boolean z13, boolean z14) {
        return z13 && !z14;
    }

    public final AvailabilityUiModel iobyxmoadg(boolean z13, boolean z14, draadjrbmk getStringFromRes) {
        zdlpuopuiu.btonecajqb(getStringFromRes, "getStringFromRes");
        return new AvailabilityUiModel(eablkybsjg(z13, z14), z13, (String) getStringFromRes.invoke(Integer.valueOf(zoijcleaow())), (String) getStringFromRes.invoke(Integer.valueOf(ppxfxbqfkf())));
    }

    public final boolean wkgbmnqykc(boolean z13, Double d13) {
        return eablkybsjg(z13, d13 == null || zdlpuopuiu.iobyxmoadg(d13, 0.0d));
    }
}
