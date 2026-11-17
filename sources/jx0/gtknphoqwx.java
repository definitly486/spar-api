package jx0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import yx0.RateVariantDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gtknphoqwx {
    public static final RateVariantDto iobyxmoadg(c01.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        String strWkgbmnqykc = iobyxmoadgVar.zoijcleaow().wkgbmnqykc();
        DeliveryCode deliveryCodeIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        return new RateVariantDto(strWkgbmnqykc, deliveryCodeIobyxmoadg != null ? deliveryCodeIobyxmoadg.getServerCode() : null);
    }
}
