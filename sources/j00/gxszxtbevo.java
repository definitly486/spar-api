package j00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {
    private final int ppxfxbqfkf(boolean z13, boolean z14) {
        if (z13) {
            return h00.ppxfxbqfkf.title_buy_shop;
        }
        return z14 ? h00.ppxfxbqfkf.title_product_not_available : h00.ppxfxbqfkf.title_product_not_available;
    }

    private final int zoijcleaow(boolean z13) {
        return z13 ? h00.ppxfxbqfkf.pickup : h00.ppxfxbqfkf.add_to_cart;
    }

    public final boolean eablkybsjg(boolean z13, boolean z14, boolean z15) {
        return (!z13 || z14 || z15) ? false : true;
    }

    public final AvailabilityUiModel iobyxmoadg(boolean z13, boolean z14, boolean z15, boolean z16, draadjrbmk getStringFromRes) {
        zdlpuopuiu.btonecajqb(getStringFromRes, "getStringFromRes");
        return new AvailabilityUiModel(eablkybsjg(z13, z14, z15), z13, z16, z14, (String) getStringFromRes.invoke(Integer.valueOf(zoijcleaow(z16))), (String) getStringFromRes.invoke(Integer.valueOf(ppxfxbqfkf(z14, z15))));
    }

    public final boolean wkgbmnqykc(boolean z13, boolean z14, Double d13) {
        return eablkybsjg(z13, z14, d13 == null || zdlpuopuiu.iobyxmoadg(d13, 0.0d));
    }
}
